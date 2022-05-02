package org.mozilla.javascript;

import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import o.EditTextUtil;
import o.LogItem;
import o.LogUtils;
import o.SecureQwertyKeyboard;
import o.checkOpen;
import o.setCleanIcon;
import o.setNeedComfirm;
import o.setUiContext;

public final class NativeGenerator extends setUiContext {
    public static final int GENERATOR_CLOSE = 2;
    public static final int GENERATOR_SEND = 0;
    private static final Object GENERATOR_TAG = "Generator";
    public static final int GENERATOR_THROW = 1;
    private static final int Id___iterator__ = 5;
    private static final int Id_close = 1;
    private static final int Id_next = 2;
    private static final int Id_send = 3;
    private static final int Id_throw = 4;
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final long serialVersionUID = 1645892441041347273L;
    private boolean firstTime = true;
    private setNeedComfirm function;
    private int lineNumber;
    private String lineSource;
    private boolean locked;
    private Object savedState;

    public static class GeneratorClosedException extends RuntimeException {
        private static final long serialVersionUID = 2561315658662379681L;
    }

    public final String getClassName() {
        return "Generator";
    }

    public static NativeGenerator init(ScriptableObject scriptableObject, boolean z) {
        NativeGenerator nativeGenerator = new NativeGenerator();
        if (scriptableObject != null) {
            nativeGenerator.setParentScope(scriptableObject);
            nativeGenerator.setPrototype(getObjectPrototype(scriptableObject));
        }
        nativeGenerator.activatePrototypeMap(5);
        if (z) {
            nativeGenerator.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(GENERATOR_TAG, nativeGenerator);
        }
        return nativeGenerator;
    }

    private NativeGenerator() {
    }

    public NativeGenerator(LogUtils logUtils, setNeedComfirm setneedcomfirm, Object obj) {
        this.function = setneedcomfirm;
        this.savedState = obj;
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        setParentScope(topLevelScope);
        setPrototype((NativeGenerator) ScriptableObject.getTopScopeValue(topLevelScope, GENERATOR_TAG));
    }

    public final void initPrototypeId(int i) {
        String str;
        String str2;
        int i2 = 1;
        if (i == 1) {
            str = "close";
        } else if (i != 2) {
            if (i == 3) {
                str2 = DataflowMonitorModel.METHOD_NAME_SEND;
            } else if (i == 4) {
                str2 = "throw";
            } else if (i == 5) {
                str = setCleanIcon.ITERATOR_PROPERTY_NAME;
            } else {
                throw new IllegalArgumentException(String.valueOf(i));
            }
            str = str2;
            i2 = 0;
        } else {
            str = "next";
        }
        initPrototypeMethod(GENERATOR_TAG, i, str, i2);
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r6, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(GENERATOR_TAG)) {
            return super.execIdCall(editTextUtil, r6, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (logUtils2 instanceof NativeGenerator) {
            NativeGenerator nativeGenerator = (NativeGenerator) logUtils2;
            if (methodId == 1) {
                return nativeGenerator.resume(r6, logUtils, 2, new GeneratorClosedException());
            }
            if (methodId == 2) {
                nativeGenerator.firstTime = false;
                return nativeGenerator.resume(r6, logUtils, 0, checkOpen.instance);
            } else if (methodId == 3) {
                Object obj = objArr.length > 0 ? objArr[0] : checkOpen.instance;
                if (!nativeGenerator.firstTime || obj.equals(checkOpen.instance)) {
                    return nativeGenerator.resume(r6, logUtils, 0, obj);
                }
                throw LogItem.toFloatRange("msg.send.newborn");
            } else if (methodId == 4) {
                return nativeGenerator.resume(r6, logUtils, 1, objArr.length > 0 ? objArr[0] : checkOpen.instance);
            } else if (methodId == 5) {
                return logUtils2;
            } else {
                throw new IllegalArgumentException(String.valueOf(methodId));
            }
        } else {
            throw incompatibleCallError(editTextUtil);
        }
    }

    private Object resume(SecureQwertyKeyboard.AnonymousClass1 r12, LogUtils logUtils, int i, Object obj) {
        if (this.savedState != null) {
            try {
                synchronized (this) {
                    if (!this.locked) {
                        this.locked = true;
                    } else {
                        throw LogItem.toFloatRange("msg.already.exec.gen");
                    }
                }
                Object resumeGenerator = this.function.resumeGenerator(r12, logUtils, i, this.savedState, obj);
                synchronized (this) {
                    this.locked = false;
                }
                if (i == 2) {
                    this.savedState = null;
                }
                return resumeGenerator;
            } catch (GeneratorClosedException unused) {
                Object obj2 = checkOpen.instance;
                synchronized (this) {
                    this.locked = false;
                    if (i == 2) {
                        this.savedState = null;
                    }
                    return obj2;
                }
            } catch (RhinoException e) {
                try {
                    this.lineNumber = e.lineNumber();
                    this.lineSource = e.lineSource();
                    this.savedState = null;
                    throw e;
                } catch (Throwable th) {
                    synchronized (this) {
                        this.locked = false;
                        if (i == 2) {
                            this.savedState = null;
                        }
                        throw th;
                    }
                }
            }
        } else if (i == 2) {
            return checkOpen.instance;
        } else {
            if (i != 1) {
                obj = setCleanIcon.getStopIterationObject(logUtils);
            }
            throw new JavaScriptException(obj, this.lineSource, this.lineNumber);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findPrototypeId(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            r1 = 5
            r2 = 4
            r3 = 0
            if (r0 != r2) goto L_0x001d
            char r0 = r5.charAt(r3)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L_0x0015
            r1 = 2
            java.lang.String r0 = "next"
            goto L_0x003c
        L_0x0015:
            r1 = 115(0x73, float:1.61E-43)
            if (r0 != r1) goto L_0x003a
            r1 = 3
            java.lang.String r0 = "send"
            goto L_0x003c
        L_0x001d:
            if (r0 != r1) goto L_0x0033
            char r0 = r5.charAt(r3)
            r1 = 99
            if (r0 != r1) goto L_0x002b
            r1 = 1
            java.lang.String r0 = "close"
            goto L_0x003c
        L_0x002b:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L_0x003a
            java.lang.String r0 = "throw"
            r1 = 4
            goto L_0x003c
        L_0x0033:
            r2 = 12
            if (r0 != r2) goto L_0x003a
            java.lang.String r0 = "__iterator__"
            goto L_0x003c
        L_0x003a:
            r0 = 0
            r1 = 0
        L_0x003c:
            if (r0 == 0) goto L_0x0047
            if (r0 == r5) goto L_0x0047
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r1
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGenerator.findPrototypeId(java.lang.String):int");
    }
}
