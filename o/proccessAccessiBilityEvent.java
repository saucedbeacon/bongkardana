package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

final class proccessAccessiBilityEvent extends setUiContext {
    private static final String FTAG = "Arguments";
    private static final int Id_callee = 1;
    private static final int Id_caller = 3;
    private static final int Id_length = 2;
    private static final int MAX_INSTANCE_ID = 3;
    private static onInit iteratorMethod = new onInit() {
        public final Object call(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
            return new getXmlId(logUtils, logUtils2);
        }
    };
    static final long serialVersionUID = 4275508002492040609L;
    private doAutoSubmit activation;
    private Object[] args;
    private int calleeAttr = 2;
    private Object calleeObj;
    private int callerAttr = 2;
    private Object callerObj;
    private int lengthAttr = 2;
    private Object lengthObj;

    public final String getClassName() {
        return FTAG;
    }

    /* access modifiers changed from: protected */
    public final String getInstanceIdName(int i) {
        if (i == 1) {
            return "callee";
        }
        if (i == 2) {
            return "length";
        }
        if (i != 3) {
            return null;
        }
        return "caller";
    }

    /* access modifiers changed from: protected */
    public final int getMaxInstanceId() {
        return 3;
    }

    public proccessAccessiBilityEvent(doAutoSubmit doautosubmit) {
        this.activation = doautosubmit;
        LogUtils parentScope = doautosubmit.getParentScope();
        setParentScope(parentScope);
        setPrototype(ScriptableObject.getObjectPrototype(parentScope));
        Object[] objArr = doautosubmit.originalArgs;
        this.args = objArr;
        this.lengthObj = Integer.valueOf(objArr.length);
        setNeedComfirm setneedcomfirm = doautosubmit.function;
        this.calleeObj = setneedcomfirm;
        int languageVersion = setneedcomfirm.getLanguageVersion();
        if (languageVersion > 130 || languageVersion == 0) {
            this.callerObj = getMax;
        } else {
            this.callerObj = null;
        }
        defineProperty((record) F2fpaySwitchFacade.ITERATOR, (Object) iteratorMethod, 2);
    }

    private Object arg(int i) {
        if (i >= 0) {
            Object[] objArr = this.args;
            if (objArr.length > i) {
                return objArr[i];
            }
        }
        return getMax;
    }

    private void putIntoActivation(int i, Object obj) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-75722290, oncanceled);
            onCancelLoad.getMin(-75722290, oncanceled);
        }
        String paramOrVarName = this.activation.function.getParamOrVarName(i);
        doAutoSubmit doautosubmit = this.activation;
        doautosubmit.put(paramOrVarName, (LogUtils) doautosubmit, obj);
    }

    private Object getFromActivation(int i) {
        String paramOrVarName = this.activation.function.getParamOrVarName(i);
        doAutoSubmit doautosubmit = this.activation;
        return doautosubmit.get(paramOrVarName, (LogUtils) doautosubmit);
    }

    private void replaceArg(int i, Object obj) {
        if (sharedWithActivation(i)) {
            putIntoActivation(i, obj);
        }
        synchronized (this) {
            if (this.args == this.activation.originalArgs) {
                this.args = (Object[]) this.args.clone();
            }
            this.args[i] = obj;
        }
    }

    private void removeArg(int i) {
        synchronized (this) {
            if (this.args[i] != getMax) {
                if (this.args == this.activation.originalArgs) {
                    this.args = (Object[]) this.args.clone();
                }
                this.args[i] = getMax;
            }
        }
    }

    public final boolean has(int i, LogUtils logUtils) {
        if (arg(i) != getMax) {
            return true;
        }
        return super.has(i, logUtils);
    }

    public final Object get(int i, LogUtils logUtils) {
        Object arg = arg(i);
        if (arg == getMax) {
            return super.get(i, logUtils);
        }
        return sharedWithActivation(i) ? getFromActivation(i) : arg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = r6.activation.function;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean sharedWithActivation(int r7) {
        /*
            r6 = this;
            o.SecureQwertyKeyboard$1 r0 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
            boolean r0 = r0.toDoubleRange()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            o.doAutoSubmit r0 = r6.activation
            o.setNeedComfirm r0 = r0.function
            int r2 = r0.getParamCount()
            if (r7 >= r2) goto L_0x0031
            int r3 = r2 + -1
            r4 = 1
            if (r7 >= r3) goto L_0x0030
            java.lang.String r3 = r0.getParamOrVarName(r7)
            int r7 = r7 + r4
        L_0x0020:
            if (r7 >= r2) goto L_0x0030
            java.lang.String r5 = r0.getParamOrVarName(r7)
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x002d
            return r1
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0030:
            return r4
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.proccessAccessiBilityEvent.sharedWithActivation(int):boolean");
    }

    public final void put(int i, LogUtils logUtils, Object obj) {
        if (arg(i) == getMax) {
            super.put(i, logUtils, obj);
        } else {
            replaceArg(i, obj);
        }
    }

    public final void put(String str, LogUtils logUtils, Object obj) {
        super.put(str, logUtils, obj);
    }

    public final void delete(int i) {
        if (i >= 0 && i < this.args.length) {
            removeArg(i);
        }
        super.delete(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findInstanceIdInfo(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 2
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 6
            if (r0 != r5) goto L_0x0028
            r0 = 5
            char r0 = r7.charAt(r0)
            r5 = 101(0x65, float:1.42E-43)
            if (r0 != r5) goto L_0x0018
            java.lang.String r0 = "callee"
            r5 = 1
            goto L_0x002a
        L_0x0018:
            r5 = 104(0x68, float:1.46E-43)
            if (r0 != r5) goto L_0x0020
            java.lang.String r0 = "length"
            r5 = 2
            goto L_0x002a
        L_0x0020:
            r5 = 114(0x72, float:1.6E-43)
            if (r0 != r5) goto L_0x0028
            java.lang.String r0 = "caller"
            r5 = 3
            goto L_0x002a
        L_0x0028:
            r0 = 0
            r5 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0035
            if (r0 == r7) goto L_0x0035
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = r5
        L_0x0036:
            o.SecureQwertyKeyboard$1 r0 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
            boolean r0 = r0.toDoubleRange()
            if (r0 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x0049
        L_0x0044:
            int r7 = super.findInstanceIdInfo((java.lang.String) r7)
            return r7
        L_0x0049:
            if (r2 != 0) goto L_0x0050
            int r7 = super.findInstanceIdInfo((java.lang.String) r7)
            return r7
        L_0x0050:
            if (r2 == r4) goto L_0x0062
            if (r2 == r1) goto L_0x005f
            if (r2 != r3) goto L_0x0059
            int r7 = r6.callerAttr
            goto L_0x0064
        L_0x0059:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x005f:
            int r7 = r6.lengthAttr
            goto L_0x0064
        L_0x0062:
            int r7 = r6.calleeAttr
        L_0x0064:
            int r7 = instanceIdInfo(r7, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.proccessAccessiBilityEvent.findInstanceIdInfo(java.lang.String):int");
    }

    /* access modifiers changed from: protected */
    public final Object getInstanceIdValue(int i) {
        doAutoSubmit doautosubmit;
        if (i == 1) {
            return this.calleeObj;
        }
        if (i == 2) {
            return this.lengthObj;
        }
        if (i != 3) {
            return super.getInstanceIdValue(i);
        }
        Object obj = this.callerObj;
        if (obj == ack.NULL_VALUE) {
            return null;
        }
        if (obj != null || (doautosubmit = this.activation.parentActivationCall) == null) {
            return obj;
        }
        return doautosubmit.get("arguments", (LogUtils) doautosubmit);
    }

    /* access modifiers changed from: protected */
    public final void setInstanceIdValue(int i, Object obj) {
        if (i == 1) {
            this.calleeObj = obj;
        } else if (i == 2) {
            this.lengthObj = obj;
        } else if (i != 3) {
            super.setInstanceIdValue(i, obj);
        } else {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            this.callerObj = obj;
        }
    }

    /* access modifiers changed from: protected */
    public final void setInstanceIdAttributes(int i, int i2) {
        if (i == 1) {
            this.calleeAttr = i2;
        } else if (i == 2) {
            this.lengthAttr = i2;
        } else if (i != 3) {
            super.setInstanceIdAttributes(i, i2);
        } else {
            this.callerAttr = i2;
        }
    }

    public final Object[] getIds(boolean z, boolean z2) {
        int intValue;
        Object[] ids = super.getIds(z, z2);
        Object[] objArr = this.args;
        if (objArr.length == 0) {
            return ids;
        }
        int length = objArr.length;
        boolean[] zArr = new boolean[length];
        int length2 = objArr.length;
        for (int i = 0; i != ids.length; i++) {
            Object obj = ids[i];
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= 0 && intValue < this.args.length && !zArr[intValue]) {
                zArr[intValue] = true;
                length2--;
            }
        }
        if (!z) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!zArr[i2] && super.has(i2, (LogUtils) this)) {
                    zArr[i2] = true;
                    length2--;
                }
            }
        }
        if (length2 == 0) {
            return ids;
        }
        Object[] objArr2 = new Object[(ids.length + length2)];
        System.arraycopy(ids, 0, objArr2, length2, ids.length);
        int i3 = 0;
        for (int i4 = 0; i4 != this.args.length; i4++) {
            if (!zArr[i4]) {
                objArr2[i3] = Integer.valueOf(i4);
                i3++;
            }
        }
        if (i3 != length2) {
            getStyleId.setMin();
        }
        return objArr2;
    }

    public final ScriptableObject getOwnPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r7, Object obj) {
        if (obj instanceof LogUtils) {
            return super.getOwnPropertyDescriptor(r7, obj);
        }
        double max = LogItem.getMax(obj);
        int i = (int) max;
        if (max != ((double) i)) {
            return super.getOwnPropertyDescriptor(r7, obj);
        }
        Object arg = arg(i);
        if (arg == getMax) {
            return super.getOwnPropertyDescriptor(r7, obj);
        }
        if (sharedWithActivation(i)) {
            arg = getFromActivation(i);
        }
        if (super.has(i, (LogUtils) this)) {
            ScriptableObject ownPropertyDescriptor = super.getOwnPropertyDescriptor(r7, obj);
            ownPropertyDescriptor.put("value", (LogUtils) ownPropertyDescriptor, arg);
            return ownPropertyDescriptor;
        }
        LogUtils parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        return buildDataDescriptor(parentScope, arg, 0);
    }

    public final void defineOwnProperty(SecureQwertyKeyboard.AnonymousClass1 r4, Object obj, ScriptableObject scriptableObject, boolean z) {
        super.defineOwnProperty(r4, obj, scriptableObject, z);
        double max = LogItem.getMax(obj);
        int i = (int) max;
        if (max != ((double) i) || arg(i) == getMax) {
            return;
        }
        if (isAccessorDescriptor(scriptableObject)) {
            removeArg(i);
            return;
        }
        Object property = getProperty((LogUtils) scriptableObject, "value");
        if (property != getMax) {
            replaceArg(i, property);
            if (isFalse(getProperty((LogUtils) scriptableObject, "writable"))) {
                removeArg(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void defineAttributesForStrictMode() {
        if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            setGetterOrSetter("caller", 0, new setMin("caller"), true);
            setGetterOrSetter("caller", 0, new setMin("caller"), false);
            setGetterOrSetter("callee", 0, new setMin("callee"), true);
            setGetterOrSetter("callee", 0, new setMin("callee"), false);
            setAttributes("caller", 6);
            setAttributes("callee", 6);
            this.callerObj = null;
            this.calleeObj = null;
        }
    }

    static class setMin extends onInit {
        private String propertyName;

        setMin(String str) {
            this.propertyName = str;
        }

        public final Object call(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
            throw LogItem.length("msg.arguments.not.access.strict", (Object) this.propertyName);
        }
    }
}
