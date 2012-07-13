package com.laytonsmith.PureUtilities;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Completely standalone generic functions live here.
 * @author lsmith
 */
public class Util {
    
    public static String GetStacktrace(Throwable t){
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        t.printStackTrace(printWriter);
        return result.toString();
    }
}
