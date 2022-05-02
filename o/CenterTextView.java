package o;

import java.io.Serializable;
import java.lang.reflect.Method;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptableObject;

public final class CenterTextView extends setUiContext {
    private static final int ConstructorId_captureStackTrace = -1;
    public static final int DEFAULT_STACK_LIMIT = -1;
    private static final Method ERROR_DELEGATE_GET_STACK;
    private static final Method ERROR_DELEGATE_SET_STACK;
    private static final Object ERROR_TAG = "Error";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STACK_HIDE_KEY = "_stackHide";
    static final long serialVersionUID = -5338413581437645187L;
    private RhinoException stackProvider;

    public final String getClassName() {
        return "Error";
    }

    CenterTextView() {
    }

    static {
        Class<CenterTextView> cls = CenterTextView.class;
        try {
            ERROR_DELEGATE_GET_STACK = cls.getMethod("getStackDelegated", new Class[]{LogUtils.class});
            ERROR_DELEGATE_SET_STACK = cls.getMethod("setStackDelegated", new Class[]{LogUtils.class, Object.class});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    static void init(LogUtils logUtils, boolean z) {
        CenterTextView centerTextView = new CenterTextView();
        ScriptableObject.putProperty((LogUtils) centerTextView, "name", (Object) "Error");
        ScriptableObject.putProperty((LogUtils) centerTextView, "message", (Object) "");
        ScriptableObject.putProperty((LogUtils) centerTextView, "fileName", (Object) "");
        ScriptableObject.putProperty((LogUtils) centerTextView, "lineNumber", (Object) 0);
        centerTextView.setAttributes("name", 2);
        centerTextView.setAttributes("message", 2);
        centerTextView.exportAsJSClass(3, logUtils, z);
        SafeInputWidget.init(centerTextView, z);
    }

    static CenterTextView make(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, EditTextUtil editTextUtil, Object[] objArr) {
        CenterTextView centerTextView = new CenterTextView();
        centerTextView.setPrototype((LogUtils) editTextUtil.get("prototype", (LogUtils) editTextUtil));
        centerTextView.setParentScope(logUtils);
        int length = objArr.length;
        if (length > 0) {
            if (objArr[0] != checkOpen.instance) {
                ScriptableObject.putProperty((LogUtils) centerTextView, "message", (Object) LogItem.getMin(objArr[0]));
            }
            if (length >= 2) {
                ScriptableObject.putProperty((LogUtils) centerTextView, "fileName", objArr[1]);
                if (length >= 3) {
                    ScriptableObject.putProperty((LogUtils) centerTextView, "lineNumber", (Object) Integer.valueOf(LogItem.toFloatRange(objArr[2])));
                }
            }
        }
        return centerTextView;
    }

    /* access modifiers changed from: protected */
    public final void fillConstructorProperties(EditTextUtil editTextUtil) {
        addIdFunctionProperty(editTextUtil, ERROR_TAG, -1, "captureStackTrace", 2);
        setMin setmin = new setMin();
        associateValue("_ErrorPrototypeProps", setmin);
        EditTextUtil editTextUtil2 = editTextUtil;
        setMin setmin2 = setmin;
        editTextUtil2.defineProperty("stackTraceLimit", setmin2, setMin.GET_STACK_LIMIT, setMin.SET_STACK_LIMIT, 0);
        editTextUtil2.defineProperty("prepareStackTrace", setmin2, setMin.GET_PREPARE_STACK, setMin.SET_PREPARE_STACK, 0);
        super.fillConstructorProperties(editTextUtil);
    }

    public final String toString() {
        Object js_toString = js_toString(this);
        return js_toString instanceof String ? (String) js_toString : super.toString();
    }

    /* access modifiers changed from: protected */
    public final void initPrototypeId(int i) {
        String str;
        int i2 = 0;
        if (i == 1) {
            str = "constructor";
            i2 = 1;
        } else if (i == 2) {
            str = "toString";
        } else if (i == 3) {
            str = "toSource";
        } else {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        initPrototypeMethod(ERROR_TAG, i, str, i2);
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(ERROR_TAG)) {
            return super.execIdCall(editTextUtil, r4, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (methodId == -1) {
            js_captureStackTrace(r4, logUtils2, objArr);
            return checkOpen.instance;
        } else if (methodId == 1) {
            return make(r4, logUtils, editTextUtil, objArr);
        } else {
            if (methodId == 2) {
                return js_toString(logUtils2);
            }
            if (methodId == 3) {
                return js_toSource(r4, logUtils, logUtils2);
            }
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    public final void setStackProvider(RhinoException rhinoException) {
        if (this.stackProvider == null) {
            this.stackProvider = rhinoException;
            defineProperty("stack", this, ERROR_DELEGATE_GET_STACK, ERROR_DELEGATE_SET_STACK, 2);
        }
    }

    public final Object getStackDelegated(LogUtils logUtils) {
        Object obj;
        if (this.stackProvider == null) {
            return getMax;
        }
        int i = -1;
        doCheck docheck = null;
        setMin setmin = (setMin) ((CenterTextView) getPrototype()).getAssociatedValue("_ErrorPrototypeProps");
        if (setmin != null) {
            i = setmin.getStackTraceLimit();
            docheck = setmin.getPrepareStackTrace();
        }
        LogDebuger[] scriptStack = this.stackProvider.getScriptStack(i, (String) getAssociatedValue(STACK_HIDE_KEY));
        if (docheck == null) {
            obj = RhinoException.formatStackTrace(scriptStack, this.stackProvider.details());
        } else {
            obj = callPrepareStack(docheck, scriptStack);
        }
        setStackDelegated(logUtils, obj);
        return obj;
    }

    public final void setStackDelegated(LogUtils logUtils, Object obj) {
        logUtils.delete("stack");
        this.stackProvider = null;
        logUtils.put("stack", logUtils, obj);
    }

    private Object callPrepareStack(doCheck docheck, LogDebuger[] logDebugerArr) {
        SecureQwertyKeyboard.AnonymousClass1 min = SecureQwertyKeyboard.AnonymousClass1.setMin();
        Object[] objArr = new Object[logDebugerArr.length];
        for (int i = 0; i < logDebugerArr.length; i++) {
            SafeInputWidget safeInputWidget = (SafeInputWidget) LogItem.getMax(min, (LogUtils) this, "CallSite", LogItem.create);
            safeInputWidget.setElement(logDebugerArr[i]);
            objArr[i] = safeInputWidget;
        }
        return docheck.call(min, docheck, this, new Object[]{this, SecureQwertyKeyboard.AnonymousClass1.getMax((LogUtils) this, objArr)});
    }

    private static Object js_toString(LogUtils logUtils) {
        Object property = ScriptableObject.getProperty(logUtils, "name");
        String min = (property == getMax || property == checkOpen.instance) ? "Error" : LogItem.getMin(property);
        Object property2 = ScriptableObject.getProperty(logUtils, "message");
        String min2 = (property2 == getMax || property2 == checkOpen.instance) ? "" : LogItem.getMin(property2);
        if (min.toString().length() == 0) {
            return min2;
        }
        if (min2.toString().length() == 0) {
            return min;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(": ");
        sb.append(min2);
        return sb.toString();
    }

    private static String js_toSource(SecureQwertyKeyboard.AnonymousClass1 r5, LogUtils logUtils, LogUtils logUtils2) {
        int floatRange;
        Object property = ScriptableObject.getProperty(logUtils2, "name");
        Object property2 = ScriptableObject.getProperty(logUtils2, "message");
        Object property3 = ScriptableObject.getProperty(logUtils2, "fileName");
        Object property4 = ScriptableObject.getProperty(logUtils2, "lineNumber");
        StringBuilder sb = new StringBuilder();
        sb.append("(new ");
        if (property == getMax) {
            property = checkOpen.instance;
        }
        sb.append(LogItem.getMin(property));
        sb.append("(");
        if (!(property2 == getMax && property3 == getMax && property4 == getMax)) {
            if (property2 == getMax) {
                property2 = "";
            }
            sb.append(LogItem.length(r5, logUtils, property2));
            if (!(property3 == getMax && property4 == getMax)) {
                sb.append(", ");
                if (property3 == getMax) {
                    property3 = "";
                }
                sb.append(LogItem.length(r5, logUtils, property3));
                if (!(property4 == getMax || (floatRange = LogItem.toFloatRange(property4)) == 0)) {
                    sb.append(", ");
                    sb.append(LogItem.setMin((double) floatRange));
                }
            }
        }
        sb.append("))");
        return sb.toString();
    }

    private static void js_captureStackTrace(SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, Object[] objArr) {
        Object obj;
        ScriptableObject scriptableObject = (ScriptableObject) LogItem.length(r7, objArr[0], logUtils);
        doCheck docheck = objArr.length > 1 ? (doCheck) LogItem.length(r7, objArr[1], logUtils) : null;
        CenterTextView centerTextView = (CenterTextView) LogItem.getMax(r7, logUtils, "Error", LogItem.create);
        centerTextView.setStackProvider(new EvaluatorException("[object Object]"));
        if (!(docheck == null || (obj = docheck.get("name", (LogUtils) docheck)) == null || checkOpen.instance.equals(obj))) {
            centerTextView.associateValue(STACK_HIDE_KEY, SecureQwertyKeyboard.AnonymousClass1.getMax(obj));
        }
        scriptableObject.defineProperty("stack", centerTextView, ERROR_DELEGATE_GET_STACK, ERROR_DELEGATE_SET_STACK, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findPrototypeId(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 8
            if (r0 != r3) goto L_0x001d
            char r0 = r5.charAt(r1)
            r3 = 111(0x6f, float:1.56E-43)
            if (r0 != r3) goto L_0x0015
            java.lang.String r0 = "toSource"
            goto L_0x0027
        L_0x0015:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L_0x0025
            r1 = 2
            java.lang.String r0 = "toString"
            goto L_0x0027
        L_0x001d:
            r1 = 11
            if (r0 != r1) goto L_0x0025
            r1 = 1
            java.lang.String r0 = "constructor"
            goto L_0x0027
        L_0x0025:
            r0 = 0
            r1 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x0032
            if (r0 == r5) goto L_0x0032
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CenterTextView.findPrototypeId(java.lang.String):int");
    }

    static final class setMin implements Serializable {
        static final Method GET_PREPARE_STACK;
        static final Method GET_STACK_LIMIT;
        static final String KEY = "_ErrorPrototypeProps";
        static final Method SET_PREPARE_STACK;
        static final Method SET_STACK_LIMIT;
        private static final long serialVersionUID = 1907180507775337939L;
        private doCheck prepareStackTrace;
        private int stackTraceLimit;

        private setMin() {
            this.stackTraceLimit = -1;
        }

        static {
            Class<setMin> cls = setMin.class;
            try {
                GET_STACK_LIMIT = cls.getMethod("getStackTraceLimit", new Class[]{LogUtils.class});
                SET_STACK_LIMIT = cls.getMethod("setStackTraceLimit", new Class[]{LogUtils.class, Object.class});
                GET_PREPARE_STACK = cls.getMethod("getPrepareStackTrace", new Class[]{LogUtils.class});
                SET_PREPARE_STACK = cls.getMethod("setPrepareStackTrace", new Class[]{LogUtils.class, Object.class});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        public final Object getStackTraceLimit(LogUtils logUtils) {
            int i = this.stackTraceLimit;
            if (i >= 0) {
                return Integer.valueOf(i);
            }
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }

        public final int getStackTraceLimit() {
            return this.stackTraceLimit;
        }

        public final void setStackTraceLimit(LogUtils logUtils, Object obj) {
            double min = SecureQwertyKeyboard.AnonymousClass1.setMin(obj);
            if (Double.isNaN(min) || Double.isInfinite(min)) {
                this.stackTraceLimit = -1;
            } else {
                this.stackTraceLimit = (int) min;
            }
        }

        public final Object getPrepareStackTrace(LogUtils logUtils) {
            doCheck prepareStackTrace2 = getPrepareStackTrace();
            return prepareStackTrace2 == null ? checkOpen.instance : prepareStackTrace2;
        }

        public final doCheck getPrepareStackTrace() {
            return this.prepareStackTrace;
        }

        public final void setPrepareStackTrace(LogUtils logUtils, Object obj) {
            if (obj == null || checkOpen.instance.equals(obj)) {
                this.prepareStackTrace = null;
            } else if (obj instanceof doCheck) {
                this.prepareStackTrace = (doCheck) obj;
            }
        }
    }
}
