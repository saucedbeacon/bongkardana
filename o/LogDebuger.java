package o;

import java.io.Serializable;

public final class LogDebuger implements Serializable {
    static final long serialVersionUID = -6416688260860477449L;
    public final String fileName;
    public final String functionName;
    public final int lineNumber;

    public LogDebuger(String str, String str2, int i) {
        this.fileName = str;
        this.functionName = str2;
        this.lineNumber = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        renderMozillaStyle(sb);
        return sb.toString();
    }

    public final void renderJavaStyle(StringBuilder sb) {
        sb.append("\tat ");
        sb.append(this.fileName);
        if (this.lineNumber >= 0) {
            sb.append(':');
            sb.append(this.lineNumber);
        }
        if (this.functionName != null) {
            sb.append(" (");
            sb.append(this.functionName);
            sb.append(')');
        }
    }

    public final void renderMozillaStyle(StringBuilder sb) {
        String str = this.functionName;
        if (str != null) {
            sb.append(str);
            sb.append("()");
        }
        sb.append('@');
        sb.append(this.fileName);
        if (this.lineNumber >= 0) {
            sb.append(':');
            sb.append(this.lineNumber);
        }
    }

    public final void renderV8Style(StringBuilder sb) {
        sb.append("    at ");
        String str = this.functionName;
        if (str == null || "anonymous".equals(str) || "undefined".equals(this.functionName)) {
            appendV8Location(sb);
            return;
        }
        sb.append(this.functionName);
        sb.append(" (");
        appendV8Location(sb);
        sb.append(')');
    }

    private void appendV8Location(StringBuilder sb) {
        sb.append(this.fileName);
        sb.append(':');
        int i = this.lineNumber;
        if (i < 0) {
            i = 0;
        }
        sb.append(i);
        sb.append(":0");
    }
}
