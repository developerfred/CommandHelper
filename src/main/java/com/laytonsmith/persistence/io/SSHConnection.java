package com.laytonsmith.persistence.io;

import com.methodscript.PureUtilities.Common.StreamUtils;
import com.methodscript.PureUtilities.DaemonManager;
import com.laytonsmith.Utilities.SSHWrapper;
import java.io.IOException;
import java.net.URI;

/**
 *
 *
 */
public class SSHConnection implements ConnectionMixin {

	String connection;

	public SSHConnection(URI uri) {
		connection = uri.getSchemeSpecificPart();
	}

	@Override
	public String getData() throws IOException {
		String data = StreamUtils.GetString(SSHWrapper.SCPRead(connection));
		SSHWrapper.closeSessions();
		return data;
	}

	@Override
	public void writeData(DaemonManager dm, String data) throws IOException, UnsupportedOperationException {
		SSHWrapper.SCPWrite(data, connection);
		SSHWrapper.closeSessions();
	}

	@Override
	public String getPath() throws UnsupportedOperationException {
		return connection;
	}
}
