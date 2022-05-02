package o;

import o.SecureQwertyKeyboard;

public class SafeInputWidget extends setUiContext {
    private static final String CALLSITE_TAG = "CallSite";
    private static final int Id_constructor = 1;
    private static final int Id_getColumnNumber = 9;
    private static final int Id_getEvalOrigin = 10;
    private static final int Id_getFileName = 7;
    private static final int Id_getFunction = 4;
    private static final int Id_getFunctionName = 5;
    private static final int Id_getLineNumber = 8;
    private static final int Id_getMethodName = 6;
    private static final int Id_getThis = 2;
    private static final int Id_getTypeName = 3;
    private static final int Id_isConstructor = 14;
    private static final int Id_isEval = 12;
    private static final int Id_isNative = 13;
    private static final int Id_isToplevel = 11;
    private static final int Id_toString = 15;
    private static final int MAX_PROTOTYPE_ID = 15;
    private LogDebuger element;

    private Object getNull() {
        return null;
    }

    public String getClassName() {
        return CALLSITE_TAG;
    }

    static void init(LogUtils logUtils, boolean z) {
        new SafeInputWidget().exportAsJSClass(15, logUtils, z);
    }

    static SafeInputWidget make(LogUtils logUtils, LogUtils logUtils2) {
        SafeInputWidget safeInputWidget = new SafeInputWidget();
        safeInputWidget.setParentScope(logUtils);
        safeInputWidget.setPrototype((LogUtils) logUtils2.get("prototype", logUtils2));
        return safeInputWidget;
    }

    private SafeInputWidget() {
    }

    /* access modifiers changed from: package-private */
    public void setElement(LogDebuger logDebuger) {
        this.element = logDebuger;
    }

    /* access modifiers changed from: protected */
    public void initPrototypeId(int i) {
        String str;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                str = "getThis";
                break;
            case 3:
                str = "getTypeName";
                break;
            case 4:
                str = "getFunction";
                break;
            case 5:
                str = "getFunctionName";
                break;
            case 6:
                str = "getMethodName";
                break;
            case 7:
                str = "getFileName";
                break;
            case 8:
                str = "getLineNumber";
                break;
            case 9:
                str = "getColumnNumber";
                break;
            case 10:
                str = "getEvalOrigin";
                break;
            case 11:
                str = "isToplevel";
                break;
            case 12:
                str = "isEval";
                break;
            case 13:
                str = "isNative";
                break;
            case 14:
                str = "isConstructor";
                break;
            case 15:
                str = "toString";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
        initPrototypeMethod(CALLSITE_TAG, i, str, 0);
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(CALLSITE_TAG)) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        switch (methodId) {
            case 1:
                return make(logUtils, editTextUtil);
            case 2:
            case 3:
            case 4:
            case 9:
                return getUndefined();
            case 5:
                return getFunctionName(logUtils2);
            case 6:
                return getNull();
            case 7:
                return getFileName(logUtils2);
            case 8:
                return getLineNumber(logUtils2);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return getFalse();
            case 15:
                return js_toString(logUtils2);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    public String toString() {
        LogDebuger logDebuger = this.element;
        if (logDebuger == null) {
            return "";
        }
        return logDebuger.toString();
    }

    private Object js_toString(LogUtils logUtils) {
        while (logUtils != null && !(logUtils instanceof SafeInputWidget)) {
            logUtils = logUtils.getPrototype();
        }
        if (logUtils == null) {
            return getMax;
        }
        StringBuilder sb = new StringBuilder();
        ((SafeInputWidget) logUtils).element.renderJavaStyle(sb);
        return sb.toString();
    }

    private Object getUndefined() {
        return checkOpen.instance;
    }

    private Object getFalse() {
        return Boolean.FALSE;
    }

    private Object getFunctionName(LogUtils logUtils) {
        while (logUtils != null && !(logUtils instanceof SafeInputWidget)) {
            logUtils = logUtils.getPrototype();
        }
        if (logUtils == null) {
            return getMax;
        }
        LogDebuger logDebuger = ((SafeInputWidget) logUtils).element;
        if (logDebuger == null) {
            return null;
        }
        return logDebuger.functionName;
    }

    private Object getFileName(LogUtils logUtils) {
        while (logUtils != null && !(logUtils instanceof SafeInputWidget)) {
            logUtils = logUtils.getPrototype();
        }
        if (logUtils == null) {
            return getMax;
        }
        LogDebuger logDebuger = ((SafeInputWidget) logUtils).element;
        if (logDebuger == null) {
            return null;
        }
        return logDebuger.fileName;
    }

    private Object getLineNumber(LogUtils logUtils) {
        while (logUtils != null && !(logUtils instanceof SafeInputWidget)) {
            logUtils = logUtils.getPrototype();
        }
        if (logUtils == null) {
            return getMax;
        }
        SafeInputWidget safeInputWidget = (SafeInputWidget) logUtils;
        LogDebuger logDebuger = safeInputWidget.element;
        if (logDebuger == null || logDebuger.lineNumber < 0) {
            return checkOpen.instance;
        }
        return Integer.valueOf(safeInputWidget.element.lineNumber);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findPrototypeId(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 116(0x74, float:1.63E-43)
            r2 = 4
            r3 = 105(0x69, float:1.47E-43)
            r4 = 3
            r5 = 0
            switch(r0) {
                case 6: goto L_0x008a;
                case 7: goto L_0x0086;
                case 8: goto L_0x0074;
                case 9: goto L_0x000e;
                case 10: goto L_0x006f;
                case 11: goto L_0x004f;
                case 12: goto L_0x000e;
                case 13: goto L_0x0027;
                case 14: goto L_0x000e;
                case 15: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x008f
        L_0x0010:
            char r0 = r7.charAt(r4)
            r1 = 67
            if (r0 != r1) goto L_0x001e
            r2 = 9
            java.lang.String r0 = "getColumnNumber"
            goto L_0x0091
        L_0x001e:
            r1 = 70
            if (r0 != r1) goto L_0x008f
            r2 = 5
            java.lang.String r0 = "getFunctionName"
            goto L_0x0091
        L_0x0027:
            char r0 = r7.charAt(r4)
            r1 = 69
            if (r0 == r1) goto L_0x004a
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 == r1) goto L_0x0045
            r1 = 76
            if (r0 == r1) goto L_0x0040
            r1 = 77
            if (r0 == r1) goto L_0x003c
            goto L_0x008f
        L_0x003c:
            r2 = 6
            java.lang.String r0 = "getMethodName"
            goto L_0x0091
        L_0x0040:
            r2 = 8
            java.lang.String r0 = "getLineNumber"
            goto L_0x0091
        L_0x0045:
            r2 = 14
            java.lang.String r0 = "isConstructor"
            goto L_0x0091
        L_0x004a:
            r2 = 10
            java.lang.String r0 = "getEvalOrigin"
            goto L_0x0091
        L_0x004f:
            char r0 = r7.charAt(r2)
            if (r0 == r3) goto L_0x006b
            r3 = 121(0x79, float:1.7E-43)
            if (r0 == r3) goto L_0x0067
            if (r0 == r1) goto L_0x0063
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            java.lang.String r0 = "getFunction"
            goto L_0x0091
        L_0x0063:
            r2 = 1
            java.lang.String r0 = "constructor"
            goto L_0x0091
        L_0x0067:
            java.lang.String r0 = "getTypeName"
            r2 = 3
            goto L_0x0091
        L_0x006b:
            r2 = 7
            java.lang.String r0 = "getFileName"
            goto L_0x0091
        L_0x006f:
            r2 = 11
            java.lang.String r0 = "isToplevel"
            goto L_0x0091
        L_0x0074:
            char r0 = r7.charAt(r5)
            if (r0 != r3) goto L_0x007f
            r2 = 13
            java.lang.String r0 = "isNative"
            goto L_0x0091
        L_0x007f:
            if (r0 != r1) goto L_0x008f
            r2 = 15
            java.lang.String r0 = "toString"
            goto L_0x0091
        L_0x0086:
            r2 = 2
            java.lang.String r0 = "getThis"
            goto L_0x0091
        L_0x008a:
            r2 = 12
            java.lang.String r0 = "isEval"
            goto L_0x0091
        L_0x008f:
            r0 = 0
            r2 = 0
        L_0x0091:
            if (r0 == 0) goto L_0x009c
            if (r0 == r7) goto L_0x009c
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r5 = r2
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeInputWidget.findPrototypeId(java.lang.String):int");
    }
}
