package org.mozilla.javascript;

import o.CenterTextView;
import o.LogItem;
import o.LogUtils;
import o.SecureQwertyKeyboard;

public class JavaScriptException extends RhinoException {
    static final long serialVersionUID = -7666130513694669293L;
    private Object value;

    @Deprecated
    public JavaScriptException(Object obj) {
        this(obj, "", 0);
    }

    public JavaScriptException(Object obj, String str, int i) {
        recordErrorOrigin(str, i, (String) null, 0);
        this.value = obj;
        if ((obj instanceof CenterTextView) && SecureQwertyKeyboard.AnonymousClass1.toFloatRange().getMax(10)) {
            CenterTextView centerTextView = (CenterTextView) obj;
            if (!centerTextView.has("fileName", (LogUtils) centerTextView)) {
                centerTextView.put("fileName", (LogUtils) centerTextView, (Object) str);
            }
            if (!centerTextView.has("lineNumber", (LogUtils) centerTextView)) {
                centerTextView.put("lineNumber", (LogUtils) centerTextView, (Object) Integer.valueOf(i));
            }
            centerTextView.setStackProvider(this);
        }
    }

    public String details() {
        Object obj = this.value;
        if (obj == null) {
            return "null";
        }
        if (obj instanceof CenterTextView) {
            return obj.toString();
        }
        try {
            return LogItem.getMin(obj);
        } catch (RuntimeException unused) {
            Object obj2 = this.value;
            if (obj2 instanceof LogUtils) {
                return LogItem.getMin((LogUtils) obj2);
            }
            return obj2.toString();
        }
    }

    public Object getValue() {
        return this.value;
    }

    @Deprecated
    public String getSourceName() {
        return sourceName();
    }

    @Deprecated
    public int getLineNumber() {
        return lineNumber();
    }
}
