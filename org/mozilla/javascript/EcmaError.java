package org.mozilla.javascript;

import o.LogItem;
import o.LogUtils;

public class EcmaError extends RhinoException {
    static final long serialVersionUID = -6261226256957286699L;
    private String errorMessage;
    private String errorName;

    @Deprecated
    public LogUtils getErrorObject() {
        return null;
    }

    public EcmaError(String str, String str2, String str3, int i, String str4, int i2) {
        recordErrorOrigin(str3, i, str4, i2);
        this.errorName = str;
        this.errorMessage = str2;
    }

    @Deprecated
    public EcmaError(LogUtils logUtils, String str, int i, int i2, String str2) {
        this("InternalError", LogItem.getMin((Object) logUtils), str, i, str2, i2);
    }

    public String details() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorName);
        sb.append(": ");
        sb.append(this.errorMessage);
        return sb.toString();
    }

    public String getName() {
        return this.errorName;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Deprecated
    public String getSourceName() {
        return sourceName();
    }

    @Deprecated
    public int getLineNumber() {
        return lineNumber();
    }

    @Deprecated
    public int getColumnNumber() {
        return columnNumber();
    }

    @Deprecated
    public String getLineSource() {
        return lineSource();
    }
}
