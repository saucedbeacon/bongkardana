package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import o.SecureQwertyKeyboard;
import o.SimplePassword;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ScriptableObject;

public abstract class setUiContext extends ScriptableObject implements printExceptionStackTrace {
    private transient getMin prototypeValues;

    protected static int instanceIdInfo(int i, int i2) {
        return (i << 16) | i2;
    }

    /* access modifiers changed from: protected */
    public void fillConstructorProperties(EditTextUtil editTextUtil) {
    }

    public int findInstanceIdInfo(String str) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int findInstanceIdInfo(record record) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(record record) {
        return 0;
    }

    public int getMaxInstanceId() {
        return 0;
    }

    static final class getMin implements Serializable {
        private static final int NAME_SLOT = 1;
        private static final int SLOT_SPAN = 2;
        static final long serialVersionUID = 3038645279153854371L;
        private short[] attributeArray;
        private EditTextUtil constructor;
        private short constructorAttrs;
        int constructorId;
        private int maxId;
        private setUiContext obj;
        private Object[] valueArray;

        getMin(setUiContext setuicontext, int i) {
            if (setuicontext == null) {
                throw new IllegalArgumentException();
            } else if (i > 0) {
                this.obj = setuicontext;
                this.maxId = i;
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public final int getMaxId() {
            return this.maxId;
        }

        /* access modifiers changed from: package-private */
        public final void initValue(int i, String str, Object obj2, int i2) {
            if (i <= 0 || i > this.maxId) {
                throw new IllegalArgumentException();
            } else if (str == null) {
                throw new IllegalArgumentException();
            } else if (obj2 != LogUtils.getMax) {
                ScriptableObject.checkValidAttributes(i2);
                if (this.obj.findPrototypeId(str) != i) {
                    throw new IllegalArgumentException(str);
                } else if (i != this.constructorId) {
                    initSlot(i, str, obj2, i2);
                } else if (obj2 instanceof EditTextUtil) {
                    this.constructor = (EditTextUtil) obj2;
                    this.constructorAttrs = (short) i2;
                } else {
                    throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public final void initValue(int i, record record, Object obj2, int i2) {
            if (i <= 0 || i > this.maxId) {
                throw new IllegalArgumentException();
            } else if (record == null) {
                throw new IllegalArgumentException();
            } else if (obj2 != LogUtils.getMax) {
                ScriptableObject.checkValidAttributes(i2);
                if (this.obj.findPrototypeId(record) != i) {
                    throw new IllegalArgumentException(record.toString());
                } else if (i != this.constructorId) {
                    initSlot(i, "", obj2, i2);
                } else if (obj2 instanceof EditTextUtil) {
                    this.constructor = (EditTextUtil) obj2;
                    this.constructorAttrs = (short) i2;
                } else {
                    throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        private void initSlot(int i, String str, Object obj2, int i2) {
            Object[] objArr = this.valueArray;
            if (objArr != null) {
                if (obj2 == null) {
                    obj2 = ack.NULL_VALUE;
                }
                int i3 = i - 1;
                int i4 = i3 * 2;
                synchronized (this) {
                    if (objArr[i4] == null) {
                        objArr[i4] = obj2;
                        objArr[i4 + 1] = str;
                        this.attributeArray[i3] = (short) i2;
                    } else if (!str.equals(objArr[i4 + 1])) {
                        throw new IllegalStateException();
                    }
                }
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        public final EditTextUtil createPrecachedConstructor() {
            if (this.constructorId == 0) {
                int findPrototypeId = this.obj.findPrototypeId("constructor");
                this.constructorId = findPrototypeId;
                if (findPrototypeId != 0) {
                    this.obj.initPrototypeId(findPrototypeId);
                    EditTextUtil editTextUtil = this.constructor;
                    if (editTextUtil != null) {
                        editTextUtil.initFunction(this.obj.getClassName(), ScriptableObject.getTopLevelScope(this.obj));
                        this.constructor.markAsConstructor(this.obj);
                        return this.constructor;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.obj.getClass().getName());
                    sb.append(".initPrototypeId() did not initialize id=");
                    sb.append(this.constructorId);
                    throw new IllegalStateException(sb.toString());
                }
                throw new IllegalStateException("No id for constructor property");
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        public final int findId(String str) {
            return this.obj.findPrototypeId(str);
        }

        /* access modifiers changed from: package-private */
        public final int findId(record record) {
            return this.obj.findPrototypeId(record);
        }

        /* access modifiers changed from: package-private */
        public final boolean has(int i) {
            Object obj2;
            Object[] objArr = this.valueArray;
            if (objArr == null || (obj2 = objArr[(i - 1) * 2]) == null || obj2 != LogUtils.getMax) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final Object get(int i) {
            Object ensureId = ensureId(i);
            if (ensureId == ack.NULL_VALUE) {
                return null;
            }
            return ensureId;
        }

        /* access modifiers changed from: package-private */
        public final void set(int i, LogUtils logUtils, Object obj2) {
            if (obj2 != LogUtils.getMax) {
                ensureId(i);
                int i2 = i - 1;
                if ((this.attributeArray[i2] & 1) != 0) {
                    return;
                }
                if (logUtils == this.obj) {
                    if (obj2 == null) {
                        obj2 = ack.NULL_VALUE;
                    }
                    int i3 = i2 * 2;
                    synchronized (this) {
                        this.valueArray[i3] = obj2;
                    }
                    return;
                }
                logUtils.put((String) this.valueArray[(i2 * 2) + 1], logUtils, obj2);
                return;
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: package-private */
        public final void delete(int i) {
            ensureId(i);
            int i2 = i - 1;
            if ((this.attributeArray[i2] & 4) == 0) {
                int i3 = i2 * 2;
                synchronized (this) {
                    this.valueArray[i3] = LogUtils.getMax;
                    this.attributeArray[i2] = 0;
                }
            } else if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
                throw LogItem.length("msg.delete.property.with.configurable.false", (Object) (String) this.valueArray[(i2 * 2) + 1]);
            }
        }

        /* access modifiers changed from: package-private */
        public final int getAttributes(int i) {
            ensureId(i);
            return this.attributeArray[i - 1];
        }

        /* access modifiers changed from: package-private */
        public final void setAttributes(int i, int i2) {
            ScriptableObject.checkValidAttributes(i2);
            ensureId(i);
            synchronized (this) {
                this.attributeArray[i - 1] = (short) i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final Object[] getNames(boolean z, Object[] objArr) {
            Object[] objArr2 = null;
            int i = 0;
            for (int i2 = 1; i2 <= this.maxId; i2++) {
                Object ensureId = ensureId(i2);
                if ((z || (this.attributeArray[i2 - 1] & 2) == 0) && ensureId != LogUtils.getMax) {
                    String str = (String) this.valueArray[((i2 - 1) * 2) + 1];
                    if (objArr2 == null) {
                        objArr2 = new Object[this.maxId];
                    }
                    objArr2[i] = str;
                    i++;
                }
            }
            if (i == 0) {
                return objArr;
            }
            if (objArr != null && objArr.length != 0) {
                int length = objArr.length;
                Object[] objArr3 = new Object[(length + i)];
                System.arraycopy(objArr, 0, objArr3, 0, length);
                System.arraycopy(objArr2, 0, objArr3, length, i);
                return objArr3;
            } else if (i == objArr2.length) {
                return objArr2;
            } else {
                Object[] objArr4 = new Object[i];
                System.arraycopy(objArr2, 0, objArr4, 0, i);
                return objArr4;
            }
        }

        private Object ensureId(int i) {
            Object[] objArr = this.valueArray;
            if (objArr == null) {
                synchronized (this) {
                    objArr = this.valueArray;
                    if (objArr == null) {
                        objArr = new Object[(this.maxId * 2)];
                        this.valueArray = objArr;
                        this.attributeArray = new short[this.maxId];
                    }
                }
            }
            int i2 = (i - 1) * 2;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                int i3 = this.constructorId;
                if (i == i3) {
                    initSlot(i3, "constructor", this.constructor, this.constructorAttrs);
                    this.constructor = null;
                } else {
                    this.obj.initPrototypeId(i);
                }
                obj2 = objArr[i2];
                if (obj2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.obj.getClass().getName());
                    sb.append(".initPrototypeId(int id) did not initialize id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return obj2;
        }
    }

    public setUiContext() {
    }

    public setUiContext(LogUtils logUtils, LogUtils logUtils2) {
        super(logUtils, logUtils2);
    }

    /* access modifiers changed from: protected */
    public final boolean defaultHas(String str) {
        return super.has(str, (LogUtils) this);
    }

    /* access modifiers changed from: protected */
    public final Object defaultGet(String str) {
        return super.get(str, (LogUtils) this);
    }

    /* access modifiers changed from: protected */
    public final void defaultPut(String str, Object obj) {
        super.put(str, (LogUtils) this, obj);
    }

    public boolean has(String str, LogUtils logUtils) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo == 0) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(str)) == 0) {
                return super.has(str, logUtils);
            }
            return this.prototypeValues.has(findId);
        } else if (((findInstanceIdInfo >>> 16) & 4) != 0) {
            return true;
        } else {
            if (getMax != getInstanceIdValue(65535 & findInstanceIdInfo)) {
                return true;
            }
            return false;
        }
    }

    public boolean has(record record, LogUtils logUtils) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(record);
        if (findInstanceIdInfo == 0) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(record)) == 0) {
                return super.has(record, logUtils);
            }
            return this.prototypeValues.has(findId);
        } else if (((findInstanceIdInfo >>> 16) & 4) != 0) {
            return true;
        } else {
            if (getMax != getInstanceIdValue(65535 & findInstanceIdInfo)) {
                return true;
            }
            return false;
        }
    }

    public Object get(String str, LogUtils logUtils) {
        int findId;
        Object obj;
        Object instanceIdValue;
        Object obj2 = super.get(str, logUtils);
        if (obj2 != getMax) {
            return obj2;
        }
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0 && (instanceIdValue = getInstanceIdValue(findInstanceIdInfo & 65535)) != getMax) {
            return instanceIdValue;
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(str)) == 0 || (obj = this.prototypeValues.get(findId)) == getMax) {
            return getMax;
        }
        return obj;
    }

    public Object get(record record, LogUtils logUtils) {
        int findId;
        Object obj;
        Object instanceIdValue;
        Object obj2 = super.get(record, logUtils);
        if (obj2 != getMax) {
            return obj2;
        }
        int findInstanceIdInfo = findInstanceIdInfo(record);
        if (findInstanceIdInfo != 0 && (instanceIdValue = getInstanceIdValue(findInstanceIdInfo & 65535)) != getMax) {
            return instanceIdValue;
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(record)) == 0 || (obj = this.prototypeValues.get(findId)) == getMax) {
            return getMax;
        }
        return obj;
    }

    public void put(String str, LogUtils logUtils, Object obj) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo == 0) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(str)) == 0) {
                super.put(str, logUtils, obj);
            } else if (logUtils != this || !isSealed()) {
                this.prototypeValues.set(findId, logUtils, obj);
            } else {
                throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.modify.sealed", (Object) str);
            }
        } else if (logUtils == this && isSealed()) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.modify.sealed", (Object) str);
        } else if (((findInstanceIdInfo >>> 16) & 1) != 0) {
        } else {
            if (logUtils == this) {
                setInstanceIdValue(65535 & findInstanceIdInfo, obj);
            } else {
                logUtils.put(str, logUtils, obj);
            }
        }
    }

    public void put(record record, LogUtils logUtils, Object obj) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(record);
        if (findInstanceIdInfo == 0) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(record)) == 0) {
                super.put(record, logUtils, obj);
            } else if (logUtils != this || !isSealed()) {
                this.prototypeValues.set(findId, logUtils, obj);
            } else {
                throw SecureQwertyKeyboard.AnonymousClass1.setMin("msg.modify.sealed");
            }
        } else if (logUtils == this && isSealed()) {
            throw SecureQwertyKeyboard.AnonymousClass1.setMin("msg.modify.sealed");
        } else if (((findInstanceIdInfo >>> 16) & 1) != 0) {
        } else {
            if (logUtils == this) {
                setInstanceIdValue(65535 & findInstanceIdInfo, obj);
            } else {
                ensureSymbolScriptable(logUtils).put(record, logUtils, obj);
            }
        }
    }

    public void delete(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo == 0 || isSealed()) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(str)) == 0) {
                super.delete(str);
            } else if (!isSealed()) {
                this.prototypeValues.delete(findId);
            }
        } else if (((findInstanceIdInfo >>> 16) & 4) == 0) {
            setInstanceIdValue(65535 & findInstanceIdInfo, getMax);
        } else if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            throw LogItem.length("msg.delete.property.with.configurable.false", (Object) str);
        }
    }

    public void delete(record record) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(record);
        if (findInstanceIdInfo == 0 || isSealed()) {
            getMin getmin = this.prototypeValues;
            if (getmin == null || (findId = getmin.findId(record)) == 0) {
                super.delete(record);
            } else if (!isSealed()) {
                this.prototypeValues.delete(findId);
            }
        } else if (((findInstanceIdInfo >>> 16) & 4) == 0) {
            setInstanceIdValue(65535 & findInstanceIdInfo, getMax);
        } else if (SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            throw LogItem.toFloatRange("msg.delete.property.with.configurable.false");
        }
    }

    public int getAttributes(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            return findInstanceIdInfo >>> 16;
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(str)) == 0) {
            return super.getAttributes(str);
        }
        return this.prototypeValues.getAttributes(findId);
    }

    public void setAttributes(String str, int i) {
        int findId;
        ScriptableObject.checkValidAttributes(i);
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            int i2 = 65535 & findInstanceIdInfo;
            if (i != (findInstanceIdInfo >>> 16)) {
                setInstanceIdAttributes(i2, i);
                return;
            }
            return;
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(str)) == 0) {
            super.setAttributes(str, i);
        } else {
            this.prototypeValues.setAttributes(findId, i);
        }
    }

    public Object[] getIds(boolean z, boolean z2) {
        Object[] ids = super.getIds(z, z2);
        getMin getmin = this.prototypeValues;
        if (getmin != null) {
            ids = getmin.getNames(z, ids);
        }
        int maxInstanceId = getMaxInstanceId();
        if (maxInstanceId == 0) {
            return ids;
        }
        Object[] objArr = null;
        int i = 0;
        while (maxInstanceId != 0) {
            String instanceIdName = getInstanceIdName(maxInstanceId);
            int findInstanceIdInfo = findInstanceIdInfo(instanceIdName);
            if (findInstanceIdInfo != 0) {
                int i2 = findInstanceIdInfo >>> 16;
                if (!((i2 & 4) == 0 && getMax == getInstanceIdValue(maxInstanceId)) && (z || (i2 & 2) == 0)) {
                    if (i == 0) {
                        objArr = new Object[maxInstanceId];
                    }
                    objArr[i] = instanceIdName;
                    i++;
                }
            }
            maxInstanceId--;
        }
        if (i == 0) {
            return ids;
        }
        if (ids.length == 0 && objArr.length == i) {
            return objArr;
        }
        Object[] objArr2 = new Object[(ids.length + i)];
        System.arraycopy(ids, 0, objArr2, 0, ids.length);
        System.arraycopy(objArr, 0, objArr2, ids.length, i);
        return objArr2;
    }

    public String getInstanceIdName(int i) {
        throw new IllegalArgumentException(String.valueOf(i));
    }

    public Object getInstanceIdValue(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public void setInstanceIdValue(int i, Object obj) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public void setInstanceIdAttributes(int i, int i2) {
        StringBuilder sb = new StringBuilder("Changing attributes not supported for ");
        sb.append(getClassName());
        sb.append(" ");
        sb.append(getInstanceIdName(i));
        sb.append(" property");
        throw LogItem.setMin("InternalError", sb.toString());
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        throw editTextUtil.unknown();
    }

    public final EditTextUtil exportAsJSClass(int i, LogUtils logUtils, boolean z) {
        if (!(logUtils == this || logUtils == null)) {
            setParentScope(logUtils);
            setPrototype(getObjectPrototype(logUtils));
        }
        activatePrototypeMap(i);
        EditTextUtil createPrecachedConstructor = this.prototypeValues.createPrecachedConstructor();
        if (z) {
            sealObject();
        }
        fillConstructorProperties(createPrecachedConstructor);
        if (z) {
            createPrecachedConstructor.sealObject();
        }
        createPrecachedConstructor.exportAsScopeProperty();
        return createPrecachedConstructor;
    }

    public final boolean hasPrototypeMap() {
        return this.prototypeValues != null;
    }

    public final void activatePrototypeMap(int i) {
        getMin getmin = new getMin(this, i);
        synchronized (this) {
            if (this.prototypeValues == null) {
                this.prototypeValues = getmin;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final EditTextUtil initPrototypeMethod(Object obj, int i, String str, int i2) {
        return initPrototypeMethod(obj, i, str, str, i2);
    }

    public final EditTextUtil initPrototypeMethod(Object obj, int i, String str, String str2, int i2) {
        EditTextUtil newIdFunction = newIdFunction(obj, i, str2 != null ? str2 : str, i2, ScriptableObject.getTopLevelScope(this));
        this.prototypeValues.initValue(i, str, (Object) newIdFunction, 2);
        return newIdFunction;
    }

    public final EditTextUtil initPrototypeMethod(Object obj, int i, record record, String str, int i2) {
        EditTextUtil newIdFunction = newIdFunction(obj, i, str, i2, ScriptableObject.getTopLevelScope(this));
        this.prototypeValues.initValue(i, record, (Object) newIdFunction, 2);
        return newIdFunction;
    }

    public final void initPrototypeConstructor(EditTextUtil editTextUtil) {
        int i = this.prototypeValues.constructorId;
        if (i == 0) {
            throw new IllegalStateException();
        } else if (editTextUtil.methodId() == i) {
            if (isSealed()) {
                editTextUtil.sealObject();
            }
            this.prototypeValues.initValue(i, "constructor", (Object) editTextUtil, 2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void initPrototypeValue(int i, String str, Object obj, int i2) {
        this.prototypeValues.initValue(i, str, obj, i2);
    }

    public final void initPrototypeValue(int i, record record, Object obj, int i2) {
        this.prototypeValues.initValue(i, record, obj, i2);
    }

    /* access modifiers changed from: protected */
    public void initPrototypeId(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(String str) {
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: protected */
    public void addIdFunctionProperty(LogUtils logUtils, Object obj, int i, String str, int i2) {
        newIdFunction(obj, i, str, i2, ScriptableObject.getTopLevelScope(logUtils)).addAsProperty(logUtils);
    }

    public static EcmaError incompatibleCallError(EditTextUtil editTextUtil) {
        throw LogItem.length("msg.incompat.call", (Object) editTextUtil.getFunctionName());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [org.mozilla.javascript.ScriptableObject, o.EditTextUtil] */
    /* JADX WARNING: type inference failed for: r1v2, types: [o.ResUtils] */
    /* JADX WARNING: type inference failed for: r2v2, types: [o.EditTextUtil] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.EditTextUtil newIdFunction(java.lang.Object r10, int r11, java.lang.String r12, int r13, o.LogUtils r14) {
        /*
            r9 = this;
            o.SecureQwertyKeyboard$1 r0 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
            int r0 = r0.IsOverlapping
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 >= r1) goto L_0x0017
            o.EditTextUtil r0 = new o.EditTextUtil
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0023
        L_0x0017:
            o.ResUtils r0 = new o.ResUtils
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0023:
            boolean r10 = r9.isSealed()
            if (r10 == 0) goto L_0x002c
            r0.sealObject()
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUiContext.newIdFunction(java.lang.Object, int, java.lang.String, int, o.LogUtils):o.EditTextUtil");
    }

    public void defineOwnProperty(SecureQwertyKeyboard.AnonymousClass1 r6, Object obj, ScriptableObject scriptableObject) {
        int findId;
        if (obj instanceof String) {
            String str = (String) obj;
            int findInstanceIdInfo = findInstanceIdInfo(str);
            if (findInstanceIdInfo != 0) {
                int i = 65535 & findInstanceIdInfo;
                if (isAccessorDescriptor(scriptableObject)) {
                    delete(i);
                } else {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChange(str, getOwnPropertyDescriptor(r6, obj), scriptableObject);
                    int i2 = findInstanceIdInfo >>> 16;
                    Object property = getProperty((LogUtils) scriptableObject, "value");
                    if (property != getMax && (i2 & 1) == 0 && !sameValue(property, getInstanceIdValue(i))) {
                        setInstanceIdValue(i, property);
                    }
                    setAttributes(str, applyDescriptorToAttributeBitset(i2, scriptableObject));
                    return;
                }
            }
            getMin getmin = this.prototypeValues;
            if (!(getmin == null || (findId = getmin.findId(str)) == 0)) {
                if (isAccessorDescriptor(scriptableObject)) {
                    this.prototypeValues.delete(findId);
                } else {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChange(str, getOwnPropertyDescriptor(r6, obj), scriptableObject);
                    int attributes = this.prototypeValues.getAttributes(findId);
                    Object property2 = getProperty((LogUtils) scriptableObject, "value");
                    if (property2 != getMax && (attributes & 1) == 0 && !sameValue(property2, this.prototypeValues.get(findId))) {
                        this.prototypeValues.set(findId, this, property2);
                    }
                    this.prototypeValues.setAttributes(findId, applyDescriptorToAttributeBitset(attributes, scriptableObject));
                    return;
                }
            }
        }
        super.defineOwnProperty(r6, obj, scriptableObject);
    }

    public ScriptableObject getOwnPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r2, Object obj) {
        ScriptableObject ownPropertyDescriptor = super.getOwnPropertyDescriptor(r2, obj);
        if (ownPropertyDescriptor != null) {
            return ownPropertyDescriptor;
        }
        if (obj instanceof String) {
            return getBuiltInDescriptor((String) obj);
        }
        return LogItem.Mean$Arithmetic(obj) ? getBuiltInDescriptor((record) ((SimplePassword.AnonymousClass1) obj).getKey()) : ownPropertyDescriptor;
    }

    private ScriptableObject getBuiltInDescriptor(String str) {
        int findId;
        LogUtils parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            return buildDataDescriptor(parentScope, getInstanceIdValue(65535 & findInstanceIdInfo), findInstanceIdInfo >>> 16);
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(str)) == 0) {
            return null;
        }
        return buildDataDescriptor(parentScope, this.prototypeValues.get(findId), this.prototypeValues.getAttributes(findId));
    }

    private ScriptableObject getBuiltInDescriptor(record record) {
        int findId;
        LogUtils parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        getMin getmin = this.prototypeValues;
        if (getmin == null || (findId = getmin.findId(record)) == 0) {
            return null;
        }
        return buildDataDescriptor(parentScope, this.prototypeValues.get(findId), this.prototypeValues.getAttributes(findId));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt != 0) {
            activatePrototypeMap(readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        getMin getmin = this.prototypeValues;
        objectOutputStream.writeInt(getmin != null ? getmin.getMaxId() : 0);
    }
}
