package o;

import o.SecureQwertyKeyboard;

public final class doAutoSubmit extends setUiContext {
    private static final Object CALL_TAG = "Call";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    static final long serialVersionUID = -7471457301304454454L;
    private proccessAccessiBilityEvent arguments;
    setNeedComfirm function;
    boolean isStrict;
    Object[] originalArgs;
    transient doAutoSubmit parentActivationCall;

    public final String getClassName() {
        return "Call";
    }

    static void init(LogUtils logUtils, boolean z) {
        new doAutoSubmit().exportAsJSClass(1, logUtils, z);
    }

    doAutoSubmit() {
    }

    doAutoSubmit(setNeedComfirm setneedcomfirm, LogUtils logUtils, Object[] objArr, boolean z, boolean z2) {
        this.function = setneedcomfirm;
        setParentScope(logUtils);
        this.originalArgs = objArr == null ? LogItem.create : objArr;
        this.isStrict = z2;
        int paramAndVarCount = setneedcomfirm.getParamAndVarCount();
        int paramCount = setneedcomfirm.getParamCount();
        if (paramAndVarCount != 0) {
            int i = 0;
            while (i < paramCount) {
                defineProperty(setneedcomfirm.getParamOrVarName(i), i < objArr.length ? objArr[i] : checkOpen.instance, 4);
                i++;
            }
        }
        if (!super.has("arguments", (LogUtils) this) && !z) {
            proccessAccessiBilityEvent proccessaccessibilityevent = new proccessAccessiBilityEvent(this);
            this.arguments = proccessaccessibilityevent;
            defineProperty("arguments", (Object) proccessaccessibilityevent, 4);
        }
        if (paramAndVarCount != 0) {
            while (paramCount < paramAndVarCount) {
                String paramOrVarName = setneedcomfirm.getParamOrVarName(paramCount);
                if (!super.has(paramOrVarName, (LogUtils) this)) {
                    if (setneedcomfirm.getParamOrVarConst(paramCount)) {
                        defineProperty(paramOrVarName, checkOpen.instance, 13);
                    } else {
                        defineProperty(paramOrVarName, checkOpen.instance, 4);
                    }
                }
                paramCount++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int findPrototypeId(String str) {
        return str.equals("constructor") ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod(CALL_TAG, i, "constructor", 1);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(CALL_TAG)) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (methodId != 1) {
            throw new IllegalArgumentException(String.valueOf(methodId));
        } else if (logUtils2 == null) {
            LogItem.getMax(r3, "Call");
            doAutoSubmit doautosubmit = new doAutoSubmit();
            doautosubmit.setPrototype(getObjectPrototype(logUtils));
            return doautosubmit;
        } else {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.only.from.new", (Object) "Call");
        }
    }

    public final void defineAttributesForArguments() {
        proccessAccessiBilityEvent proccessaccessibilityevent = this.arguments;
        if (proccessaccessibilityevent != null) {
            proccessaccessibilityevent.defineAttributesForStrictMode();
        }
    }
}
