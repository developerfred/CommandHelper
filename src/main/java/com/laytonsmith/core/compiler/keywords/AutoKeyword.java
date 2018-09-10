package com.laytonsmith.core.compiler.keywords;

import com.methodscript.PureUtilities.Version;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.compiler.Keyword;
import com.laytonsmith.core.constructs.Auto;
import com.laytonsmith.core.constructs.Construct;
import com.laytonsmith.core.constructs.Target;

/**
 *
 */
@Keyword.keyword("auto")
public class AutoKeyword extends LiteralKeyword {

	@Override
	protected Construct getValue(Target t) {
		return Auto.TYPE;
	}

	@Override
	public String docs() {
		return "A pseudo data type, which indicates that the datatype should not be considered by the compiler."
				+ " This is the default type for untyped variables.";
	}

	@Override
	public Version since() {
		return CHVersion.V3_3_1;
	}

}
