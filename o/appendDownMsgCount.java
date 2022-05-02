package o;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.cli.ParseException;

public final class appendDownMsgCount {
    public static Object setMax(String str) throws ParseException {
        try {
            try {
                return Class.forName(str).newInstance();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(e.getClass().getName());
                stringBuffer.append("; Unable to create an instance of: ");
                stringBuffer.append(str);
                throw new ParseException(stringBuffer.toString());
            }
        } catch (ClassNotFoundException unused) {
            throw new ParseException("Unable to find the class: ".concat(String.valueOf(str)));
        }
    }

    public static Number getMax(String str) throws ParseException {
        try {
            if (str.indexOf(46) != -1) {
                return Double.valueOf(str);
            }
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            throw new ParseException(e.getMessage());
        }
    }

    public static Class setMin(String str) throws ParseException {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            throw new ParseException("Unable to find the class: ".concat(String.valueOf(str)));
        }
    }

    public static URL length(String str) throws ParseException {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            throw new ParseException("Unable to parse the URL: ".concat(String.valueOf(str)));
        }
    }
}
