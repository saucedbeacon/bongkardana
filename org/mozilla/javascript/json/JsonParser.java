package org.mozilla.javascript.json;

public class JsonParser {
    static final /* synthetic */ boolean getMax = (!JsonParser.class.desiredAssertionStatus());

    public static class ParseException extends Exception {
        static final long serialVersionUID = 4804542791749920772L;

        ParseException(String str) {
            super(str);
        }

        ParseException(Exception exc) {
            super(exc);
        }
    }
}
