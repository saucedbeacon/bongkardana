package org.mozilla.javascript;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.LogItem;
import o.LogUtils;
import o.SecureQwertyKeyboard;
import o.SimplePassword;
import o.UniResultF2fpayOrderInfo;
import o.UniResultPageRpcFacade;
import o.announceSwitchKeyboard;
import o.checkOpen;
import o.convertIfSpecial;
import o.doCheck;
import o.getExceptionMessage;
import o.getStyleId;
import o.getStyleableIds;
import o.onInit;
import o.record;
import o.setPackageName;
import o.setmSubmitInterface;
import o.tick;
import o.traceCount;
import o.traceException;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import org.mozilla.javascript.annotations.JSStaticFunction;

public abstract class ScriptableObject implements LogUtils, tick, Serializable, convertIfSpecial {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final int CONST = 13;
    public static final int DONTENUM = 2;
    public static final int EMPTY = 0;
    private static final Method GET_ARRAY_LENGTH;
    private static final Comparator<Object> KEY_COMPARATOR = new length();
    public static final int PERMANENT = 4;
    public static final int READONLY = 1;
    public static final int UNINITIALIZED_CONST = 8;
    static final long serialVersionUID = 2829861078851942586L;
    private volatile Map<Object, Object> associatedValues;
    private transient traceCount externalData;
    private boolean isExtensible;
    private boolean isSealed;
    private LogUtils parentScopeObject;
    private LogUtils prototypeObject;
    private transient getExceptionMessage slotMap;

    public enum SlotAccess {
        QUERY,
        MODIFY,
        MODIFY_CONST,
        MODIFY_GETTER_SETTER,
        CONVERT_ACCESSOR_TO_DATA
    }

    public boolean avoidObjectDetection() {
        return false;
    }

    public abstract String getClassName();

    static {
        Class<ScriptableObject> cls = ScriptableObject.class;
        $assertionsDisabled = !cls.desiredAssertionStatus();
        try {
            GET_ARRAY_LENGTH = cls.getMethod("getExternalArrayLength", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static class getMax implements Serializable {
        private static final long serialVersionUID = -6090581677123995491L;
        private short attributes;
        public int indexOrHash;
        public Object name;
        public transient getMax next;
        public transient getMax orderedNext;
        public Object value;

        public getMax(Object obj, int i, int i2) {
            this.name = obj;
            this.indexOrHash = i;
            this.attributes = (short) i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Object obj = this.name;
            if (obj != null) {
                this.indexOrHash = obj.hashCode();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean setValue(Object obj, LogUtils logUtils, LogUtils logUtils2) {
            if ((this.attributes & 1) != 0) {
                if (!SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
                    return true;
                }
                throw LogItem.length("msg.modify.readonly", this.name);
            } else if (logUtils != logUtils2) {
                return false;
            } else {
                this.value = obj;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public Object getValue(LogUtils logUtils) {
            return this.value;
        }

        public int getAttributes() {
            return this.attributes;
        }

        public synchronized void setAttributes(int i) {
            ScriptableObject.checkValidAttributes(i);
            this.attributes = (short) i;
        }

        /* access modifiers changed from: package-private */
        public ScriptableObject getPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils) {
            return ScriptableObject.buildDataDescriptor(logUtils, this.value, this.attributes);
        }
    }

    protected static ScriptableObject buildDataDescriptor(LogUtils logUtils, Object obj, int i) {
        setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
        LogItem.getMin((ScriptableObject) setmsubmitinterface, logUtils, TopLevel.Builtins.Object);
        setmsubmitinterface.defineProperty("value", obj, 0);
        boolean z = true;
        setmsubmitinterface.defineProperty("writable", (Object) Boolean.valueOf((i & 1) == 0), 0);
        setmsubmitinterface.defineProperty("enumerable", (Object) Boolean.valueOf((i & 2) == 0), 0);
        if ((i & 4) != 0) {
            z = false;
        }
        setmsubmitinterface.defineProperty("configurable", (Object) Boolean.valueOf(z), 0);
        return setmsubmitinterface;
    }

    public static final class setMin extends getMax {
        static final long serialVersionUID = -4900574849788797588L;
        Object getter;
        Object setter;

        public setMin(Object obj, int i, int i2) {
            super(obj, i, i2);
        }

        /* access modifiers changed from: package-private */
        public final ScriptableObject getPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r6, LogUtils logUtils) {
            int attributes = getAttributes();
            setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
            LogItem.getMin((ScriptableObject) setmsubmitinterface, logUtils, TopLevel.Builtins.Object);
            boolean z = true;
            setmsubmitinterface.defineProperty("enumerable", (Object) Boolean.valueOf((attributes & 2) == 0), 0);
            setmsubmitinterface.defineProperty("configurable", (Object) Boolean.valueOf((attributes & 4) == 0), 0);
            if (this.getter == null && this.setter == null) {
                if ((attributes & 1) != 0) {
                    z = false;
                }
                setmsubmitinterface.defineProperty("writable", (Object) Boolean.valueOf(z), 0);
            }
            Object obj = this.getter;
            if (obj != null) {
                if (obj instanceof getStyleableIds) {
                    setmsubmitinterface.defineProperty(ContactEventType.CONTACT_GET, (Object) new traceException("f", ((getStyleableIds) this.getter).member(), logUtils), 0);
                } else if (obj instanceof Member) {
                    setmsubmitinterface.defineProperty(ContactEventType.CONTACT_GET, (Object) new traceException("f", (Member) this.getter, logUtils), 0);
                } else {
                    setmsubmitinterface.defineProperty(ContactEventType.CONTACT_GET, obj, 0);
                }
            }
            Object obj2 = this.setter;
            if (obj2 != null) {
                if (obj2 instanceof getStyleableIds) {
                    setmsubmitinterface.defineProperty("set", (Object) new traceException("f", ((getStyleableIds) this.setter).member(), logUtils), 0);
                } else if (obj2 instanceof Member) {
                    setmsubmitinterface.defineProperty("set", (Object) new traceException("f", (Member) this.setter, logUtils), 0);
                } else {
                    setmsubmitinterface.defineProperty("set", obj2, 0);
                }
            }
            return setmsubmitinterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: o.LogUtils} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: o.LogUtils} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean setValue(java.lang.Object r6, o.LogUtils r7, o.LogUtils r8) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.setter
                r1 = 1
                if (r0 != 0) goto L_0x002a
                java.lang.Object r0 = r5.getter
                if (r0 == 0) goto L_0x0025
                o.SecureQwertyKeyboard$1 r6 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
                boolean r7 = r6.toDoubleRange()
                if (r7 != 0) goto L_0x001c
                r7 = 11
                boolean r6 = r6.getMax((int) r7)
                if (r6 != 0) goto L_0x001c
                return r1
            L_0x001c:
                java.lang.Object r6 = r5.name
                java.lang.String r7 = "msg.set.prop.no.setter"
                org.mozilla.javascript.EcmaError r6 = o.LogItem.length((java.lang.String) r7, (java.lang.Object) r6)
                throw r6
            L_0x0025:
                boolean r6 = super.setValue(r6, r7, r8)
                return r6
            L_0x002a:
                o.SecureQwertyKeyboard$1 r7 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
                java.lang.Object r0 = r5.setter
                boolean r2 = r0 instanceof o.getStyleableIds
                r3 = 0
                if (r2 == 0) goto L_0x005d
                o.getStyleableIds r0 = (o.getStyleableIds) r0
                java.lang.Class<?>[] r2 = r0.argTypes
                int r4 = r2.length
                int r4 = r4 - r1
                r2 = r2[r4]
                int r2 = o.traceException.getTypeTag(r2)
                java.lang.Object r6 = o.traceException.convertArg((o.SecureQwertyKeyboard.AnonymousClass1) r7, (o.LogUtils) r8, (java.lang.Object) r6, (int) r2)
                java.lang.Object r7 = r0.delegateTo
                if (r7 != 0) goto L_0x004e
                java.lang.Object[] r7 = new java.lang.Object[r1]
                r7[r3] = r6
                goto L_0x0059
            L_0x004e:
                java.lang.Object r7 = r0.delegateTo
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r8
                r2[r1] = r6
                r8 = r7
                r7 = r2
            L_0x0059:
                r0.invoke(r8, r7)
                goto L_0x006e
            L_0x005d:
                boolean r2 = r0 instanceof o.doCheck
                if (r2 == 0) goto L_0x006e
                o.doCheck r0 = (o.doCheck) r0
                o.LogUtils r2 = r0.getParentScope()
                java.lang.Object[] r4 = new java.lang.Object[r1]
                r4[r3] = r6
                r0.call(r7, r2, r8, r4)
            L_0x006e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.setMin.setValue(java.lang.Object, o.LogUtils, o.LogUtils):boolean");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: o.LogUtils} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: o.LogUtils} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object getValue(o.LogUtils r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.getter
                if (r0 == 0) goto L_0x0035
                boolean r1 = r0 instanceof o.getStyleableIds
                if (r1 == 0) goto L_0x0020
                o.getStyleableIds r0 = (o.getStyleableIds) r0
                java.lang.Object r1 = r0.delegateTo
                if (r1 != 0) goto L_0x0011
                java.lang.Object[] r1 = o.LogItem.create
                goto L_0x001b
            L_0x0011:
                java.lang.Object r1 = r0.delegateTo
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                r5 = r1
                r1 = r2
            L_0x001b:
                java.lang.Object r5 = r0.invoke(r5, r1)
                return r5
            L_0x0020:
                boolean r1 = r0 instanceof o.doCheck
                if (r1 == 0) goto L_0x0035
                o.doCheck r0 = (o.doCheck) r0
                o.SecureQwertyKeyboard$1 r1 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
                o.LogUtils r2 = r0.getParentScope()
                java.lang.Object[] r3 = o.LogItem.create
                java.lang.Object r5 = r0.call(r1, r2, r5, r3)
                return r5
            L_0x0035:
                java.lang.Object r5 = r4.value
                boolean r0 = r5 instanceof o.setPackageName
                if (r0 == 0) goto L_0x004f
                o.setPackageName r5 = (o.setPackageName) r5
                r5.init()     // Catch:{ all -> 0x0047 }
                java.lang.Object r5 = r5.getValue()
                r4.value = r5
                goto L_0x004f
            L_0x0047:
                r0 = move-exception
                java.lang.Object r5 = r5.getValue()
                r4.value = r5
                throw r0
            L_0x004f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.setMin.getValue(o.LogUtils):java.lang.Object");
        }
    }

    public static void checkValidAttributes(int i) {
        if ((i & -16) != 0) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    private getExceptionMessage createSlotMap(int i) {
        SecureQwertyKeyboard.AnonymousClass1 min = SecureQwertyKeyboard.AnonymousClass1.setMin();
        if (min == null || !min.getMax(17)) {
            return new getExceptionMessage(i);
        }
        return new UniResultPageRpcFacade(i);
    }

    public ScriptableObject() {
        this.isExtensible = true;
        this.isSealed = false;
        this.slotMap = createSlotMap(0);
    }

    public ScriptableObject(LogUtils logUtils, LogUtils logUtils2) {
        this.isExtensible = true;
        this.isSealed = false;
        if (logUtils != null) {
            this.parentScopeObject = logUtils;
            this.prototypeObject = logUtils2;
            this.slotMap = createSlotMap(0);
            return;
        }
        throw new IllegalArgumentException();
    }

    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "object";
    }

    public boolean has(String str, LogUtils logUtils) {
        return this.slotMap.getMax(str, 0) != null;
    }

    public boolean has(int i, LogUtils logUtils) {
        traceCount tracecount = this.externalData;
        return tracecount != null ? i < tracecount.getMax() : this.slotMap.getMax((Object) null, i) != null;
    }

    public boolean has(record record, LogUtils logUtils) {
        return this.slotMap.getMax(record, 0) != null;
    }

    public Object get(String str, LogUtils logUtils) {
        getMax max = this.slotMap.getMax(str, 0);
        if (max == null) {
            return LogUtils.getMax;
        }
        return max.getValue(logUtils);
    }

    public Object get(int i, LogUtils logUtils) {
        traceCount tracecount = this.externalData;
        if (tracecount == null) {
            getMax max = this.slotMap.getMax((Object) null, i);
            if (max == null) {
                return LogUtils.getMax;
            }
            return max.getValue(logUtils);
        } else if (i < tracecount.getMax()) {
            return this.externalData.setMax();
        } else {
            return LogUtils.getMax;
        }
    }

    public Object get(record record, LogUtils logUtils) {
        getMax max = this.slotMap.getMax(record, 0);
        if (max == null) {
            return LogUtils.getMax;
        }
        return max.getValue(logUtils);
    }

    public void put(String str, LogUtils logUtils, Object obj) {
        if (!putImpl(str, 0, logUtils, obj)) {
            if (logUtils != this) {
                logUtils.put(str, logUtils, obj);
                return;
            }
            throw getStyleId.setMin();
        }
    }

    public void put(int i, LogUtils logUtils, Object obj) {
        traceCount tracecount = this.externalData;
        if (tracecount != null) {
            if (i >= tracecount.getMax()) {
                throw new JavaScriptException(LogItem.setMin(SecureQwertyKeyboard.AnonymousClass1.setMin(), (LogUtils) this, TopLevel.NativeErrors.RangeError, new Object[]{"External array index out of bounds "}), (String) null, 0);
            }
        } else if (!putImpl((Object) null, i, logUtils, obj)) {
            if (logUtils != this) {
                logUtils.put(i, logUtils, obj);
                return;
            }
            throw getStyleId.setMin();
        }
    }

    public void put(record record, LogUtils logUtils, Object obj) {
        if (!putImpl(record, 0, logUtils, obj)) {
            if (logUtils != this) {
                ensureSymbolScriptable(logUtils).put(record, logUtils, obj);
                return;
            }
            throw getStyleId.setMin();
        }
    }

    public void delete(String str) {
        checkNotSealed(str, 0);
        this.slotMap.setMin(str, 0);
    }

    public void delete(int i) {
        checkNotSealed((Object) null, i);
        this.slotMap.setMin((Object) null, i);
    }

    public void delete(record record) {
        checkNotSealed(record, 0);
        this.slotMap.setMin(record, 0);
    }

    public void putConst(String str, LogUtils logUtils, Object obj) {
        if (!putConstImpl(str, 0, logUtils, obj, 1)) {
            if (logUtils == this) {
                throw getStyleId.setMin();
            } else if (logUtils instanceof convertIfSpecial) {
                ((convertIfSpecial) logUtils).putConst(str, logUtils, obj);
            } else {
                logUtils.put(str, logUtils, obj);
            }
        }
    }

    public void defineConst(String str, LogUtils logUtils) {
        if (!putConstImpl(str, 0, logUtils, checkOpen.instance, 8)) {
            if (logUtils == this) {
                throw getStyleId.setMin();
            } else if (logUtils instanceof convertIfSpecial) {
                ((convertIfSpecial) logUtils).defineConst(str, logUtils);
            }
        }
    }

    public boolean isConst(String str) {
        getMax max = this.slotMap.getMax(str, 0);
        if (max != null && (max.getAttributes() & 5) == 5) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final int getAttributes(String str, LogUtils logUtils) {
        return getAttributes(str);
    }

    @Deprecated
    public final int getAttributes(int i, LogUtils logUtils) {
        return getAttributes(i);
    }

    @Deprecated
    public final void setAttributes(String str, LogUtils logUtils, int i) {
        setAttributes(str, i);
    }

    @Deprecated
    public void setAttributes(int i, LogUtils logUtils, int i2) {
        setAttributes(i, i2);
    }

    public int getAttributes(String str) {
        return findAttributeSlot(str, 0, SlotAccess.QUERY).getAttributes();
    }

    public int getAttributes(int i) {
        return findAttributeSlot((String) null, i, SlotAccess.QUERY).getAttributes();
    }

    public int getAttributes(record record) {
        return findAttributeSlot(record, SlotAccess.QUERY).getAttributes();
    }

    public void setAttributes(String str, int i) {
        checkNotSealed(str, 0);
        findAttributeSlot(str, 0, SlotAccess.MODIFY).setAttributes(i);
    }

    public void setAttributes(int i, int i2) {
        checkNotSealed((Object) null, i);
        findAttributeSlot((String) null, i, SlotAccess.MODIFY).setAttributes(i2);
    }

    public void setAttributes(record record, int i) {
        checkNotSealed(record, 0);
        findAttributeSlot(record, SlotAccess.MODIFY).setAttributes(i);
    }

    public void setGetterOrSetter(String str, int i, announceSwitchKeyboard announceswitchkeyboard, boolean z) {
        setGetterOrSetter(str, i, announceswitchkeyboard, z, false);
    }

    private void setGetterOrSetter(String str, int i, announceSwitchKeyboard announceswitchkeyboard, boolean z, boolean z2) {
        setMin setmin;
        if (str == null || i == 0) {
            if (!z2) {
                checkNotSealed(str, i);
            }
            if (isExtensible()) {
                setmin = (setMin) this.slotMap.setMin(str, i, SlotAccess.MODIFY_GETTER_SETTER);
            } else {
                getMax max = this.slotMap.getMax(str, i);
                if (max instanceof setMin) {
                    setmin = (setMin) max;
                } else {
                    return;
                }
            }
            if (z2 || (setmin.getAttributes() & 1) == 0) {
                if (z) {
                    setmin.setter = announceswitchkeyboard;
                } else {
                    setmin.getter = announceswitchkeyboard;
                }
                setmin.value = checkOpen.instance;
                return;
            }
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.modify.readonly", (Object) str);
        }
        throw new IllegalArgumentException(str);
    }

    public Object getGetterOrSetter(String str, int i, boolean z) {
        if (str == null || i == 0) {
            getMax max = this.slotMap.getMax(str, i);
            if (max == null) {
                return null;
            }
            if (!(max instanceof setMin)) {
                return checkOpen.instance;
            }
            setMin setmin = (setMin) max;
            Object obj = z ? setmin.setter : setmin.getter;
            if (obj != null) {
                return obj;
            }
            return checkOpen.instance;
        }
        throw new IllegalArgumentException(str);
    }

    /* access modifiers changed from: protected */
    public boolean isGetterOrSetter(String str, int i, boolean z) {
        getMax max = this.slotMap.getMax(str, i);
        if (!(max instanceof setMin)) {
            return false;
        }
        if (z && ((setMin) max).setter != null) {
            return true;
        }
        if (z || ((setMin) max).getter == null) {
            return false;
        }
        return true;
    }

    public void addLazilyInitializedValue(String str, int i, setPackageName setpackagename, int i2) {
        if (str == null || i == 0) {
            checkNotSealed(str, i);
            setMin setmin = (setMin) this.slotMap.setMin(str, i, SlotAccess.MODIFY_GETTER_SETTER);
            setmin.setAttributes(i2);
            setmin.getter = null;
            setmin.setter = null;
            setmin.value = setpackagename;
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public void setExternalArrayData(traceCount tracecount) {
        this.externalData = tracecount;
        if (tracecount == null) {
            delete("length");
            return;
        }
        defineProperty("length", (Object) null, GET_ARRAY_LENGTH, (Method) null, 3);
    }

    public traceCount getExternalArrayData() {
        return this.externalData;
    }

    public Object getExternalArrayLength() {
        traceCount tracecount = this.externalData;
        return Integer.valueOf(tracecount == null ? 0 : tracecount.getMax());
    }

    public LogUtils getPrototype() {
        return this.prototypeObject;
    }

    public void setPrototype(LogUtils logUtils) {
        this.prototypeObject = logUtils;
    }

    public LogUtils getParentScope() {
        return this.parentScopeObject;
    }

    public void setParentScope(LogUtils logUtils) {
        this.parentScopeObject = logUtils;
    }

    public Object[] getIds() {
        return getIds(false, false);
    }

    public Object[] getAllIds() {
        return getIds(true, false);
    }

    public Object getDefaultValue(Class<?> cls) {
        return getDefaultValue(this, cls);
    }

    public static Object getDefaultValue(LogUtils logUtils, Class<?> cls) {
        String str;
        Object[] objArr;
        Object call;
        SecureQwertyKeyboard.AnonymousClass1 r1 = null;
        int i = 0;
        while (true) {
            String str2 = "undefined";
            if (i < 2) {
                boolean z = cls != LogItem.toString ? i == 1 : i == 0;
                if (z) {
                    objArr = LogItem.create;
                    str = "toString";
                } else {
                    Object[] objArr2 = new Object[1];
                    if (cls != null) {
                        if (cls == LogItem.toString) {
                            str2 = "string";
                        } else if (cls == LogItem.valueOf) {
                            str2 = "object";
                        } else if (cls == LogItem.invoke) {
                            str2 = "function";
                        } else if (cls == LogItem.length || cls == Boolean.TYPE) {
                            str2 = "boolean";
                        } else if (cls == LogItem.toIntRange || cls == LogItem.getMax || cls == Byte.TYPE || cls == LogItem.hashCode || cls == Short.TYPE || cls == LogItem.toFloatRange || cls == Integer.TYPE || cls == LogItem.isInside || cls == Float.TYPE || cls == LogItem.getMin || cls == Double.TYPE) {
                            str2 = "number";
                        } else {
                            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.invalid.type", (Object) cls.toString());
                        }
                    }
                    objArr2[0] = str2;
                    Object[] objArr3 = objArr2;
                    str = "valueOf";
                    objArr = objArr3;
                }
                Object property = getProperty(logUtils, str);
                if (property instanceof doCheck) {
                    doCheck docheck = (doCheck) property;
                    if (r1 == null) {
                        r1 = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
                    }
                    call = docheck.call(r1, docheck.getParentScope(), logUtils, objArr);
                    if (call == null) {
                        continue;
                    } else if (!(!(call instanceof LogUtils) || cls == LogItem.valueOf || cls == LogItem.invoke)) {
                        if (z && (call instanceof UniResultF2fpayOrderInfo)) {
                            Object unwrap = ((UniResultF2fpayOrderInfo) call).unwrap();
                            if (unwrap instanceof String) {
                                return unwrap;
                            }
                        }
                    }
                }
                i++;
            } else {
                if (cls != null) {
                    str2 = cls.getName();
                }
                throw LogItem.length("msg.default.value", (Object) str2);
            }
        }
        return call;
    }

    public boolean hasInstance(LogUtils logUtils) {
        return LogItem.getMax(logUtils, (LogUtils) this);
    }

    public Object equivalentValues(Object obj) {
        return this == obj ? Boolean.TRUE : LogUtils.getMax;
    }

    public static <T extends LogUtils> void defineClass(LogUtils logUtils, Class<T> cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        defineClass(logUtils, cls, false, false);
    }

    public static <T extends LogUtils> void defineClass(LogUtils logUtils, Class<T> cls, boolean z) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        defineClass(logUtils, cls, z, false);
    }

    public static <T extends LogUtils> String defineClass(LogUtils logUtils, Class<T> cls, boolean z, boolean z2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        onInit buildClassCtor = buildClassCtor(logUtils, cls, z, z2);
        if (buildClassCtor == null) {
            return null;
        }
        String className = buildClassCtor.getClassPrototype().getClassName();
        defineProperty(logUtils, className, buildClassCtor, 2);
        return className;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: o.traceException} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0200, code lost:
        if (r4 != null) goto L_0x0202;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0295 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends o.LogUtils> o.onInit buildClassCtor(o.LogUtils r24, java.lang.Class<T> r25, boolean r26, boolean r27) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = r24
            r1 = r26
            r2 = r27
            java.lang.reflect.Method[] r3 = o.traceException.getMethodList(r25)
            r4 = 0
            r5 = 0
        L_0x000c:
            int r6 = r3.length
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r5 >= r6) goto L_0x0079
            r6 = r3[r5]
            java.lang.String r11 = r6.getName()
            java.lang.String r12 = "init"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0076
            java.lang.Class[] r11 = r6.getParameterTypes()
            int r12 = r11.length
            if (r12 != r7) goto L_0x005b
            r12 = r11[r4]
            java.lang.Class<?> r13 = o.LogItem.values
            if (r12 != r13) goto L_0x005b
            r12 = r11[r10]
            java.lang.Class<o.LogUtils> r13 = o.LogItem.valueOf
            if (r12 != r13) goto L_0x005b
            r12 = r11[r8]
            java.lang.Class r13 = java.lang.Boolean.TYPE
            if (r12 != r13) goto L_0x005b
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 == 0) goto L_0x005b
            java.lang.Object[] r2 = new java.lang.Object[r7]
            o.SecureQwertyKeyboard$1 r3 = o.SecureQwertyKeyboard.AnonymousClass1.toFloatRange()
            r2[r4] = r3
            r2[r10] = r0
            if (r1 == 0) goto L_0x0053
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0055
        L_0x0053:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0055:
            r2[r8] = r0
            r6.invoke(r9, r2)
            return r9
        L_0x005b:
            int r7 = r11.length
            if (r7 != r10) goto L_0x0076
            r7 = r11[r4]
            java.lang.Class<o.LogUtils> r8 = o.LogItem.valueOf
            if (r7 != r8) goto L_0x0076
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L_0x0076
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r4] = r0
            r6.invoke(r9, r1)
            return r9
        L_0x0076:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x0079:
            java.lang.reflect.Constructor[] r5 = r25.getConstructors()
            r6 = 0
        L_0x007e:
            int r11 = r5.length
            if (r6 >= r11) goto L_0x0090
            r11 = r5[r6]
            java.lang.Class[] r11 = r11.getParameterTypes()
            int r11 = r11.length
            if (r11 != 0) goto L_0x008d
            r6 = r5[r6]
            goto L_0x0091
        L_0x008d:
            int r6 = r6 + 1
            goto L_0x007e
        L_0x0090:
            r6 = r9
        L_0x0091:
            if (r6 == 0) goto L_0x02dc
            java.lang.Object[] r11 = o.LogItem.create
            java.lang.Object r6 = r6.newInstance(r11)
            o.LogUtils r6 = (o.LogUtils) r6
            java.lang.String r11 = r6.getClassName()
            o.LogUtils r12 = getTopLevelScope(r24)
            java.lang.Object r12 = getProperty((o.LogUtils) r12, (java.lang.String) r11)
            boolean r13 = r12 instanceof o.onInit
            if (r13 == 0) goto L_0x00c0
            o.onInit r12 = (o.onInit) r12
            java.lang.Object r13 = r12.getPrototypeProperty()
            if (r13 == 0) goto L_0x00c0
            java.lang.Class r13 = r13.getClass()
            r14 = r25
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00c2
            return r12
        L_0x00c0:
            r14 = r25
        L_0x00c2:
            if (r2 == 0) goto L_0x00e9
            java.lang.Class r12 = r25.getSuperclass()
            java.lang.Class<o.LogUtils> r13 = o.LogItem.valueOf
            boolean r13 = r13.isAssignableFrom(r12)
            if (r13 == 0) goto L_0x00e9
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isAbstract(r13)
            if (r13 != 0) goto L_0x00e9
            java.lang.Class r12 = extendsScriptable(r12)
            java.lang.String r2 = defineClass(r0, r12, r1, r2)
            if (r2 == 0) goto L_0x00e9
            o.LogUtils r2 = getClassPrototype(r0, r2)
            goto L_0x00ea
        L_0x00e9:
            r2 = r9
        L_0x00ea:
            if (r2 != 0) goto L_0x00f0
            o.LogUtils r2 = getObjectPrototype(r24)
        L_0x00f0:
            r6.setPrototype(r2)
            java.lang.Class<org.mozilla.javascript.annotations.JSConstructor> r2 = org.mozilla.javascript.annotations.JSConstructor.class
            java.lang.reflect.Member r2 = findAnnotatedMember(r3, r2)
            if (r2 != 0) goto L_0x0101
            java.lang.Class<org.mozilla.javascript.annotations.JSConstructor> r2 = org.mozilla.javascript.annotations.JSConstructor.class
            java.lang.reflect.Member r2 = findAnnotatedMember(r5, r2)
        L_0x0101:
            java.lang.String r12 = "jsConstructor"
            if (r2 != 0) goto L_0x0109
            java.lang.reflect.Method r2 = o.traceException.findSingleMethod(r3, r12)
        L_0x0109:
            if (r2 != 0) goto L_0x0139
            int r13 = r5.length
            if (r13 != r10) goto L_0x0111
            r2 = r5[r4]
            goto L_0x012b
        L_0x0111:
            int r13 = r5.length
            if (r13 != r8) goto L_0x012b
            r13 = r5[r4]
            java.lang.Class[] r13 = r13.getParameterTypes()
            int r13 = r13.length
            if (r13 != 0) goto L_0x0120
            r2 = r5[r10]
            goto L_0x012b
        L_0x0120:
            r13 = r5[r10]
            java.lang.Class[] r13 = r13.getParameterTypes()
            int r13 = r13.length
            if (r13 != 0) goto L_0x012b
            r2 = r5[r4]
        L_0x012b:
            if (r2 == 0) goto L_0x012e
            goto L_0x0139
        L_0x012e:
            java.lang.String r0 = r25.getName()
            java.lang.String r1 = "msg.ctor.multiple.parms"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r1, (java.lang.Object) r0)
            throw r0
        L_0x0139:
            o.traceException r5 = new o.traceException
            r5.<init>(r11, r2, r0)
            boolean r11 = r5.isVarArgsMethod()
            if (r11 != 0) goto L_0x02d1
            r5.initAsConstructor(r0, r6)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            int r14 = r3.length
            r15 = 0
        L_0x0153:
            if (r15 >= r14) goto L_0x02b0
            r8 = r3[r15]
            if (r8 == r2) goto L_0x029c
            java.lang.String r10 = r8.getName()
            java.lang.String r4 = "finishInit"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x0196
            java.lang.Class[] r4 = r8.getParameterTypes()
            r25 = r11
            int r11 = r4.length
            if (r11 != r7) goto L_0x0198
            r11 = 0
            r7 = r4[r11]
            java.lang.Class<o.LogUtils> r11 = o.LogItem.valueOf
            if (r7 != r11) goto L_0x0198
            r7 = 1
            r11 = r4[r7]
            java.lang.Class<o.traceException> r7 = o.traceException.class
            if (r11 != r7) goto L_0x0198
            r7 = 2
            r4 = r4[r7]
            java.lang.Class<o.LogUtils> r7 = o.LogItem.valueOf
            if (r4 != r7) goto L_0x0198
            int r4 = r8.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L_0x0198
            r9 = r8
        L_0x018e:
            r27 = r12
        L_0x0190:
            r22 = r13
            r23 = r14
            goto L_0x02a0
        L_0x0196:
            r25 = r11
        L_0x0198:
            r4 = 36
            int r4 = r10.indexOf(r4)
            r7 = -1
            if (r4 != r7) goto L_0x018e
            boolean r4 = r10.equals(r12)
            if (r4 != 0) goto L_0x018e
            java.lang.Class<org.mozilla.javascript.annotations.JSFunction> r4 = org.mozilla.javascript.annotations.JSFunction.class
            boolean r4 = r8.isAnnotationPresent(r4)
            if (r4 == 0) goto L_0x01b6
            java.lang.Class<org.mozilla.javascript.annotations.JSFunction> r4 = org.mozilla.javascript.annotations.JSFunction.class
            java.lang.annotation.Annotation r4 = r8.getAnnotation(r4)
            goto L_0x01dd
        L_0x01b6:
            java.lang.Class<org.mozilla.javascript.annotations.JSStaticFunction> r4 = org.mozilla.javascript.annotations.JSStaticFunction.class
            boolean r4 = r8.isAnnotationPresent(r4)
            if (r4 == 0) goto L_0x01c5
            java.lang.Class<org.mozilla.javascript.annotations.JSStaticFunction> r4 = org.mozilla.javascript.annotations.JSStaticFunction.class
            java.lang.annotation.Annotation r4 = r8.getAnnotation(r4)
            goto L_0x01dd
        L_0x01c5:
            java.lang.Class<org.mozilla.javascript.annotations.JSGetter> r4 = org.mozilla.javascript.annotations.JSGetter.class
            boolean r4 = r8.isAnnotationPresent(r4)
            if (r4 == 0) goto L_0x01d4
            java.lang.Class<org.mozilla.javascript.annotations.JSGetter> r4 = org.mozilla.javascript.annotations.JSGetter.class
            java.lang.annotation.Annotation r4 = r8.getAnnotation(r4)
            goto L_0x01dd
        L_0x01d4:
            java.lang.Class<org.mozilla.javascript.annotations.JSSetter> r4 = org.mozilla.javascript.annotations.JSSetter.class
            boolean r4 = r8.isAnnotationPresent(r4)
            if (r4 != 0) goto L_0x018e
            r4 = 0
        L_0x01dd:
            java.lang.String r7 = "jsFunction_"
            java.lang.String r11 = "jsGet_"
            r27 = r12
            java.lang.String r12 = "jsStaticFunction_"
            if (r4 != 0) goto L_0x0202
            boolean r16 = r10.startsWith(r7)
            if (r16 == 0) goto L_0x01f0
        L_0x01ed:
            r22 = r13
            goto L_0x0205
        L_0x01f0:
            boolean r7 = r10.startsWith(r12)
            if (r7 == 0) goto L_0x01f8
            r7 = r12
            goto L_0x01ed
        L_0x01f8:
            boolean r7 = r10.startsWith(r11)
            if (r7 == 0) goto L_0x0200
            r7 = r11
            goto L_0x01ed
        L_0x0200:
            if (r4 == 0) goto L_0x0190
        L_0x0202:
            r22 = r13
            r7 = 0
        L_0x0205:
            boolean r13 = r4 instanceof org.mozilla.javascript.annotations.JSStaticFunction
            if (r13 != 0) goto L_0x020e
            if (r7 != r12) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            r12 = 0
            goto L_0x020f
        L_0x020e:
            r12 = 1
        L_0x020f:
            if (r12 == 0) goto L_0x0216
            r13 = r25
            r23 = r14
            goto L_0x021a
        L_0x0216:
            r23 = r14
            r13 = r22
        L_0x021a:
            java.lang.String r14 = getPropertyName(r10, r7, r4)
            boolean r16 = r13.contains(r14)
            if (r16 != 0) goto L_0x0295
            r13.add(r14)
            boolean r4 = r4 instanceof org.mozilla.javascript.annotations.JSGetter
            if (r4 != 0) goto L_0x0267
            if (r7 != r11) goto L_0x022e
            goto L_0x0267
        L_0x022e:
            if (r12 == 0) goto L_0x0242
            int r4 = r8.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L_0x023b
            goto L_0x0242
        L_0x023b:
            java.lang.String r0 = "jsStaticFunction must be used with static method."
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r0)
            throw r0
        L_0x0242:
            o.traceException r4 = new o.traceException
            r4.<init>(r14, r8, r6)
            boolean r7 = r4.isVarArgsConstructor()
            if (r7 != 0) goto L_0x025c
            if (r12 == 0) goto L_0x0251
            r7 = r5
            goto L_0x0252
        L_0x0251:
            r7 = r6
        L_0x0252:
            r8 = 2
            defineProperty(r7, r14, r4, r8)
            if (r1 == 0) goto L_0x02a0
            r4.sealObject()
            goto L_0x02a0
        L_0x025c:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "msg.varargs.fun"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r1, (java.lang.Object) r0)
            throw r0
        L_0x0267:
            boolean r4 = r6 instanceof org.mozilla.javascript.ScriptableObject
            if (r4 == 0) goto L_0x0286
            java.lang.String r4 = "jsSet_"
            java.lang.reflect.Method r20 = findSetterMethod(r3, r14, r4)
            if (r20 == 0) goto L_0x0275
            r11 = 0
            goto L_0x0276
        L_0x0275:
            r11 = 1
        L_0x0276:
            r21 = r11 | 6
            r16 = r6
            org.mozilla.javascript.ScriptableObject r16 = (org.mozilla.javascript.ScriptableObject) r16
            r18 = 0
            r17 = r14
            r19 = r8
            r16.defineProperty(r17, r18, r19, r20, r21)
            goto L_0x02a0
        L_0x0286:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "msg.extend.scriptable"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r1, (java.lang.Object) r0, (java.lang.Object) r14)
            throw r0
        L_0x0295:
            java.lang.String r0 = "duplicate.defineClass.name"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r0, (java.lang.Object) r10, (java.lang.Object) r14)
            throw r0
        L_0x029c:
            r25 = r11
            goto L_0x018e
        L_0x02a0:
            int r15 = r15 + 1
            r11 = r25
            r12 = r27
            r13 = r22
            r14 = r23
            r4 = 0
            r7 = 3
            r8 = 2
            r10 = 1
            goto L_0x0153
        L_0x02b0:
            if (r9 == 0) goto L_0x02c2
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r5
            r0 = 2
            r2[r0] = r6
            r0 = 0
            r9.invoke(r0, r2)
        L_0x02c2:
            if (r1 == 0) goto L_0x02d0
            r5.sealObject()
            boolean r0 = r6 instanceof org.mozilla.javascript.ScriptableObject
            if (r0 == 0) goto L_0x02d0
            org.mozilla.javascript.ScriptableObject r6 = (org.mozilla.javascript.ScriptableObject) r6
            r6.sealObject()
        L_0x02d0:
            return r5
        L_0x02d1:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "msg.varargs.ctor"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r1, (java.lang.Object) r0)
            throw r0
        L_0x02dc:
            r14 = r25
            java.lang.String r0 = r25.getName()
            java.lang.String r1 = "msg.zero.arg.ctor"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r1, (java.lang.Object) r0)
            goto L_0x02ea
        L_0x02e9:
            throw r0
        L_0x02ea:
            goto L_0x02e9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.buildClassCtor(o.LogUtils, java.lang.Class, boolean, boolean):o.onInit");
    }

    private static Member findAnnotatedMember(AccessibleObject[] accessibleObjectArr, Class<? extends Annotation> cls) {
        for (AccessibleObject accessibleObject : accessibleObjectArr) {
            if (accessibleObject.isAnnotationPresent(cls)) {
                return (Member) accessibleObject;
            }
        }
        return null;
    }

    private static Method findSetterMethod(Method[] methodArr, String str, String str2) {
        StringBuilder sb = new StringBuilder("set");
        sb.append(Character.toUpperCase(str.charAt(0)));
        sb.append(str.substring(1));
        String obj = sb.toString();
        for (Method method : methodArr) {
            JSSetter jSSetter = (JSSetter) method.getAnnotation(JSSetter.class);
            if (jSSetter != null && (str.equals(jSSetter.value()) || ("".equals(jSSetter.value()) && obj.equals(method.getName())))) {
                return method;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        String obj2 = sb2.toString();
        for (Method method2 : methodArr) {
            if (obj2.equals(method2.getName())) {
                return method2;
            }
        }
        return null;
    }

    private static String getPropertyName(String str, String str2, Annotation annotation) {
        if (str2 != null) {
            return str.substring(str2.length());
        }
        String str3 = null;
        if (annotation instanceof JSGetter) {
            str3 = ((JSGetter) annotation).value();
            if ((str3 == null || str3.length() == 0) && str.length() > 3 && str.startsWith(ContactEventType.CONTACT_GET)) {
                str3 = str.substring(3);
                if (Character.isUpperCase(str3.charAt(0))) {
                    if (str3.length() == 1) {
                        str3 = str3.toLowerCase();
                    } else if (!Character.isUpperCase(str3.charAt(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Character.toLowerCase(str3.charAt(0)));
                        sb.append(str3.substring(1));
                        str3 = sb.toString();
                    }
                }
            }
        } else if (annotation instanceof JSFunction) {
            str3 = ((JSFunction) annotation).value();
        } else if (annotation instanceof JSStaticFunction) {
            str3 = ((JSStaticFunction) annotation).value();
        }
        return (str3 == null || str3.length() == 0) ? str : str3;
    }

    private static <T extends LogUtils> Class<T> extendsScriptable(Class<?> cls) {
        if (LogItem.valueOf.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    public void defineProperty(String str, Object obj, int i) {
        checkNotSealed(str, 0);
        put(str, (LogUtils) this, obj);
        setAttributes(str, i);
    }

    public void defineProperty(record record, Object obj, int i) {
        checkNotSealed(record, 0);
        put(record, (LogUtils) this, obj);
        setAttributes(record, i);
    }

    public static void defineProperty(LogUtils logUtils, String str, Object obj, int i) {
        if (!(logUtils instanceof ScriptableObject)) {
            logUtils.put(str, logUtils, obj);
        } else {
            ((ScriptableObject) logUtils).defineProperty(str, obj, i);
        }
    }

    public static void defineConstProperty(LogUtils logUtils, String str) {
        if (logUtils instanceof convertIfSpecial) {
            ((convertIfSpecial) logUtils).defineConst(str, logUtils);
        } else {
            defineProperty(logUtils, str, checkOpen.instance, 13);
        }
    }

    public void defineProperty(String str, Class<?> cls, int i) {
        int length2 = str.length();
        if (length2 != 0) {
            char[] cArr = new char[(length2 + 3)];
            str.getChars(0, length2, cArr, 3);
            cArr[3] = Character.toUpperCase(cArr[3]);
            cArr[0] = 'g';
            cArr[1] = 'e';
            cArr[2] = 't';
            String str2 = new String(cArr);
            cArr[0] = 's';
            String str3 = new String(cArr);
            Method[] methodList = traceException.getMethodList(cls);
            Method findSingleMethod = traceException.findSingleMethod(methodList, str2);
            Method findSingleMethod2 = traceException.findSingleMethod(methodList, str3);
            if (findSingleMethod2 == null) {
                i |= 1;
            }
            int i2 = i;
            if (findSingleMethod2 == null) {
                findSingleMethod2 = null;
            }
            defineProperty(str, (Object) null, findSingleMethod, findSingleMethod2, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: o.getStyleableIds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r5 == o.LogItem.invokeSuspend) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r4 != false) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void defineProperty(java.lang.String r9, java.lang.Object r10, java.lang.reflect.Method r11, java.lang.reflect.Method r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x004c
            o.getStyleableIds r3 = new o.getStyleableIds
            r3.<init>((java.lang.reflect.Method) r11)
            int r4 = r11.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L_0x001c
            if (r10 == 0) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            r3.delegateTo = r10
            goto L_0x0021
        L_0x001c:
            java.lang.Class r4 = java.lang.Void.TYPE
            r3.delegateTo = r4
            r4 = 1
        L_0x0021:
            java.lang.Class[] r5 = r11.getParameterTypes()
            int r6 = r5.length
            java.lang.String r7 = "msg.bad.getter.parms"
            if (r6 != 0) goto L_0x0031
            if (r4 == 0) goto L_0x002f
            java.lang.String r7 = "msg.obj.getter.parms"
            goto L_0x0040
        L_0x002f:
            r7 = r0
            goto L_0x0040
        L_0x0031:
            int r6 = r5.length
            if (r6 != r2) goto L_0x0040
            r5 = r5[r1]
            java.lang.Class<o.LogUtils> r6 = o.LogItem.valueOf
            if (r5 == r6) goto L_0x003e
            java.lang.Class<?> r6 = o.LogItem.invokeSuspend
            if (r5 != r6) goto L_0x0040
        L_0x003e:
            if (r4 != 0) goto L_0x002f
        L_0x0040:
            if (r7 != 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            java.lang.String r9 = r11.toString()
            org.mozilla.javascript.EvaluatorException r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r7, (java.lang.Object) r9)
            throw r9
        L_0x004c:
            r3 = r0
        L_0x004d:
            if (r12 == 0) goto L_0x00af
            java.lang.Class r11 = r12.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            if (r11 != r4) goto L_0x00a4
            o.getStyleableIds r11 = new o.getStyleableIds
            r11.<init>((java.lang.reflect.Method) r12)
            int r4 = r12.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L_0x006e
            if (r10 == 0) goto L_0x006a
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r11.delegateTo = r10
            goto L_0x0073
        L_0x006e:
            java.lang.Class r10 = java.lang.Void.TYPE
            r11.delegateTo = r10
            r4 = 1
        L_0x0073:
            java.lang.Class[] r10 = r12.getParameterTypes()
            int r5 = r10.length
            if (r5 != r2) goto L_0x007f
            if (r4 == 0) goto L_0x0097
            java.lang.String r0 = "msg.setter2.expected"
            goto L_0x0097
        L_0x007f:
            int r2 = r10.length
            r5 = 2
            if (r2 != r5) goto L_0x0095
            r10 = r10[r1]
            java.lang.Class<o.LogUtils> r2 = o.LogItem.valueOf
            if (r10 == r2) goto L_0x0090
            java.lang.Class<?> r2 = o.LogItem.invokeSuspend
            if (r10 == r2) goto L_0x0090
            java.lang.String r0 = "msg.setter2.parms"
            goto L_0x0097
        L_0x0090:
            if (r4 != 0) goto L_0x0097
            java.lang.String r0 = "msg.setter1.parms"
            goto L_0x0097
        L_0x0095:
            java.lang.String r0 = "msg.setter.parms"
        L_0x0097:
            if (r0 != 0) goto L_0x009b
            r0 = r11
            goto L_0x00af
        L_0x009b:
            java.lang.String r9 = r12.toString()
            org.mozilla.javascript.EvaluatorException r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r0, (java.lang.Object) r9)
            throw r9
        L_0x00a4:
            java.lang.String r9 = r12.toString()
            java.lang.String r10 = "msg.setter.return"
            org.mozilla.javascript.EvaluatorException r9 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.String) r10, (java.lang.Object) r9)
            throw r9
        L_0x00af:
            o.getExceptionMessage r10 = r8.slotMap
            org.mozilla.javascript.ScriptableObject$SlotAccess r11 = org.mozilla.javascript.ScriptableObject.SlotAccess.MODIFY_GETTER_SETTER
            org.mozilla.javascript.ScriptableObject$getMax r9 = r10.setMin(r9, r1, r11)
            org.mozilla.javascript.ScriptableObject$setMin r9 = (org.mozilla.javascript.ScriptableObject.setMin) r9
            r9.setAttributes(r13)
            r9.getter = r3
            r9.setter = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.defineProperty(java.lang.String, java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, int):void");
    }

    public void defineOwnProperties(SecureQwertyKeyboard.AnonymousClass1 r7, ScriptableObject scriptableObject) {
        Object[] ids = scriptableObject.getIds(false, true);
        ScriptableObject[] scriptableObjectArr = new ScriptableObject[ids.length];
        int length2 = ids.length;
        for (int i = 0; i < length2; i++) {
            ScriptableObject ensureScriptableObject = ensureScriptableObject(LogItem.getMin((LogUtils) scriptableObject, ids[i], r7));
            checkPropertyDefinition(ensureScriptableObject);
            scriptableObjectArr[i] = ensureScriptableObject;
        }
        int length3 = ids.length;
        for (int i2 = 0; i2 < length3; i2++) {
            defineOwnProperty(r7, ids[i2], scriptableObjectArr[i2]);
        }
    }

    public void defineOwnProperty(SecureQwertyKeyboard.AnonymousClass1 r2, Object obj, ScriptableObject scriptableObject) {
        checkPropertyDefinition(scriptableObject);
        defineOwnProperty(r2, obj, scriptableObject, true);
    }

    public void defineOwnProperty(SecureQwertyKeyboard.AnonymousClass1 r4, Object obj, ScriptableObject scriptableObject, boolean z) {
        int i;
        ScriptableObject scriptableObject2;
        getMax slot = getSlot(r4, obj, SlotAccess.QUERY);
        boolean z2 = slot == null;
        if (z) {
            if (slot == null) {
                scriptableObject2 = null;
            } else {
                scriptableObject2 = slot.getPropertyDescriptor(r4, this);
            }
            checkPropertyChange(obj, scriptableObject2, scriptableObject);
        }
        boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject);
        if (slot == null) {
            slot = getSlot(r4, obj, isAccessorDescriptor ? SlotAccess.MODIFY_GETTER_SETTER : SlotAccess.MODIFY);
            i = applyDescriptorToAttributeBitset(7, scriptableObject);
        } else {
            i = applyDescriptorToAttributeBitset(slot.getAttributes(), scriptableObject);
        }
        if (isAccessorDescriptor) {
            if (!(slot instanceof setMin)) {
                slot = getSlot(r4, obj, SlotAccess.MODIFY_GETTER_SETTER);
            }
            setMin setmin = (setMin) slot;
            Object property = getProperty((LogUtils) scriptableObject, ContactEventType.CONTACT_GET);
            if (property != getMax) {
                setmin.getter = property;
            }
            Object property2 = getProperty((LogUtils) scriptableObject, "set");
            if (property2 != getMax) {
                setmin.setter = property2;
            }
            setmin.value = checkOpen.instance;
            setmin.setAttributes(i);
            return;
        }
        if ((slot instanceof setMin) && isDataDescriptor(scriptableObject)) {
            slot = getSlot(r4, obj, SlotAccess.CONVERT_ACCESSOR_TO_DATA);
        }
        Object property3 = getProperty((LogUtils) scriptableObject, "value");
        if (property3 != getMax) {
            slot.value = property3;
        } else if (z2) {
            slot.value = checkOpen.instance;
        }
        slot.setAttributes(i);
    }

    /* access modifiers changed from: protected */
    public void checkPropertyDefinition(ScriptableObject scriptableObject) {
        Object property = getProperty((LogUtils) scriptableObject, ContactEventType.CONTACT_GET);
        if (property == getMax || property == checkOpen.instance || (property instanceof announceSwitchKeyboard)) {
            Object property2 = getProperty((LogUtils) scriptableObject, "set");
            if (property2 != getMax && property2 != checkOpen.instance && !(property2 instanceof announceSwitchKeyboard)) {
                throw LogItem.toString(property2);
            } else if (isDataDescriptor(scriptableObject) && isAccessorDescriptor(scriptableObject)) {
                throw LogItem.toFloatRange("msg.both.data.and.accessor.desc");
            }
        } else {
            throw LogItem.toString(property);
        }
    }

    /* access modifiers changed from: protected */
    public void checkPropertyChange(Object obj, ScriptableObject scriptableObject, ScriptableObject scriptableObject2) {
        if (scriptableObject == null) {
            if (!isExtensible()) {
                throw LogItem.toFloatRange("msg.not.extensible");
            }
        } else if (!isFalse(scriptableObject.get("configurable", (LogUtils) scriptableObject))) {
        } else {
            if (isTrue(getProperty((LogUtils) scriptableObject2, "configurable"))) {
                throw LogItem.length("msg.change.configurable.false.to.true", obj);
            } else if (isTrue(scriptableObject.get("enumerable", (LogUtils) scriptableObject)) == isTrue(getProperty((LogUtils) scriptableObject2, "enumerable"))) {
                boolean isDataDescriptor = isDataDescriptor(scriptableObject2);
                boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject2);
                if (!isDataDescriptor && !isAccessorDescriptor) {
                    return;
                }
                if (!isDataDescriptor || !isDataDescriptor(scriptableObject)) {
                    if (!isAccessorDescriptor || !isAccessorDescriptor(scriptableObject)) {
                        if (isDataDescriptor(scriptableObject)) {
                            throw LogItem.length("msg.change.property.data.to.accessor.with.configurable.false", obj);
                        }
                        throw LogItem.length("msg.change.property.accessor.to.data.with.configurable.false", obj);
                    } else if (!sameValue(getProperty((LogUtils) scriptableObject2, "set"), scriptableObject.get("set", (LogUtils) scriptableObject))) {
                        throw LogItem.length("msg.change.setter.with.configurable.false", obj);
                    } else if (!sameValue(getProperty((LogUtils) scriptableObject2, ContactEventType.CONTACT_GET), scriptableObject.get(ContactEventType.CONTACT_GET, (LogUtils) scriptableObject))) {
                        throw LogItem.length("msg.change.getter.with.configurable.false", obj);
                    }
                } else if (!isFalse(scriptableObject.get("writable", (LogUtils) scriptableObject))) {
                } else {
                    if (isTrue(getProperty((LogUtils) scriptableObject2, "writable"))) {
                        throw LogItem.length("msg.change.writable.false.to.true.with.configurable.false", obj);
                    } else if (!sameValue(getProperty((LogUtils) scriptableObject2, "value"), scriptableObject.get("value", (LogUtils) scriptableObject))) {
                        throw LogItem.length("msg.change.value.with.writable.false", obj);
                    }
                }
            } else {
                throw LogItem.length("msg.change.enumerable.with.configurable.false", obj);
            }
        }
    }

    protected static boolean isTrue(Object obj) {
        return obj != getMax && LogItem.setMax(obj);
    }

    protected static boolean isFalse(Object obj) {
        return !isTrue(obj);
    }

    /* access modifiers changed from: protected */
    public boolean sameValue(Object obj, Object obj2) {
        if (obj == getMax) {
            return true;
        }
        if (obj2 == getMax) {
            obj2 = checkOpen.instance;
        }
        if ((obj2 instanceof Number) && (obj instanceof Number)) {
            double doubleValue = ((Number) obj2).doubleValue();
            double doubleValue2 = ((Number) obj).doubleValue();
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            if (doubleValue == 0.0d && Double.doubleToLongBits(doubleValue) != Double.doubleToLongBits(doubleValue2)) {
                return false;
            }
        }
        return LogItem.length(obj2, obj);
    }

    /* access modifiers changed from: protected */
    public int applyDescriptorToAttributeBitset(int i, ScriptableObject scriptableObject) {
        Object property = getProperty((LogUtils) scriptableObject, "enumerable");
        if (property != getMax) {
            i = LogItem.setMax(property) ? i & -3 : i | 2;
        }
        Object property2 = getProperty((LogUtils) scriptableObject, "writable");
        if (property2 != getMax) {
            i = LogItem.setMax(property2) ? i & -2 : i | 1;
        }
        Object property3 = getProperty((LogUtils) scriptableObject, "configurable");
        if (property3 != getMax) {
            return LogItem.setMax(property3) ? i & -5 : i | 4;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public boolean isDataDescriptor(ScriptableObject scriptableObject) {
        return hasProperty((LogUtils) scriptableObject, "value") || hasProperty((LogUtils) scriptableObject, "writable");
    }

    /* access modifiers changed from: protected */
    public boolean isAccessorDescriptor(ScriptableObject scriptableObject) {
        return hasProperty((LogUtils) scriptableObject, ContactEventType.CONTACT_GET) || hasProperty((LogUtils) scriptableObject, "set");
    }

    /* access modifiers changed from: protected */
    public boolean isGenericDescriptor(ScriptableObject scriptableObject) {
        return !isDataDescriptor(scriptableObject) && !isAccessorDescriptor(scriptableObject);
    }

    public static LogUtils ensureScriptable(Object obj) {
        if (obj instanceof LogUtils) {
            return (LogUtils) obj;
        }
        throw LogItem.length("msg.arg.not.object", (Object) LogItem.hashCode(obj));
    }

    public static tick ensureSymbolScriptable(Object obj) {
        if (obj instanceof tick) {
            return (tick) obj;
        }
        throw LogItem.length("msg.object.not.symbolscriptable", (Object) LogItem.hashCode(obj));
    }

    public static ScriptableObject ensureScriptableObject(Object obj) {
        if (obj instanceof ScriptableObject) {
            return (ScriptableObject) obj;
        }
        throw LogItem.length("msg.arg.not.object", (Object) LogItem.hashCode(obj));
    }

    public void defineFunctionProperties(String[] strArr, Class<?> cls, int i) {
        Method[] methodList = traceException.getMethodList(cls);
        int i2 = 0;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            Method findSingleMethod = traceException.findSingleMethod(methodList, str);
            if (findSingleMethod != null) {
                defineProperty(str, (Object) new traceException(str, findSingleMethod, this), i);
                i2++;
            } else {
                throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.method.not.found", (Object) str, (Object) cls.getName());
            }
        }
    }

    public static LogUtils getObjectPrototype(LogUtils logUtils) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(logUtils), TopLevel.Builtins.Object);
    }

    public static LogUtils getFunctionPrototype(LogUtils logUtils) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(logUtils), TopLevel.Builtins.Function);
    }

    public static LogUtils getArrayPrototype(LogUtils logUtils) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(logUtils), TopLevel.Builtins.Array);
    }

    public static LogUtils getClassPrototype(LogUtils logUtils, String str) {
        Object obj;
        Object property = getProperty(getTopLevelScope(logUtils), str);
        if (property instanceof onInit) {
            obj = ((onInit) property).getPrototypeProperty();
        } else {
            if (property instanceof LogUtils) {
                LogUtils logUtils2 = (LogUtils) property;
                obj = logUtils2.get("prototype", logUtils2);
            }
            return null;
        }
        if (obj instanceof LogUtils) {
            return (LogUtils) obj;
        }
        return null;
    }

    public static LogUtils getTopLevelScope(LogUtils logUtils) {
        while (true) {
            LogUtils parentScope = logUtils.getParentScope();
            if (parentScope == null) {
                return logUtils;
            }
            logUtils = parentScope;
        }
    }

    public boolean isExtensible() {
        return this.isExtensible;
    }

    public void preventExtensions() {
        this.isExtensible = false;
    }

    public void sealObject() {
        getMax next;
        setPackageName setpackagename;
        if (!this.isSealed) {
            long max = this.slotMap.setMax();
            try {
                Iterator<getMax> it = this.slotMap.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Object obj = next.value;
                    if (obj instanceof setPackageName) {
                        setpackagename = (setPackageName) obj;
                        setpackagename.init();
                        next.value = setpackagename.getValue();
                    }
                }
                this.isSealed = true;
                this.slotMap.length(max);
            } catch (Throwable th) {
                this.slotMap.length(max);
                throw th;
            }
        }
    }

    public final boolean isSealed() {
        return this.isSealed;
    }

    private void checkNotSealed(Object obj, int i) {
        if (isSealed()) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.modify.sealed", (Object) obj != null ? obj.toString() : Integer.toString(i));
        }
    }

    public static Object getProperty(LogUtils logUtils, String str) {
        Object obj;
        LogUtils logUtils2 = logUtils;
        do {
            obj = logUtils2.get(str, logUtils);
            if (obj != LogUtils.getMax || (logUtils2 = logUtils2.getPrototype()) == null) {
                return obj;
            }
            obj = logUtils2.get(str, logUtils);
            break;
        } while ((logUtils2 = logUtils2.getPrototype()) == null);
        return obj;
    }

    public static Object getProperty(LogUtils logUtils, record record) {
        Object obj;
        LogUtils logUtils2 = logUtils;
        do {
            obj = ensureSymbolScriptable(logUtils2).get(record, logUtils);
            if (obj != LogUtils.getMax || (logUtils2 = logUtils2.getPrototype()) == null) {
                return obj;
            }
            obj = ensureSymbolScriptable(logUtils2).get(record, logUtils);
            break;
        } while ((logUtils2 = logUtils2.getPrototype()) == null);
        return obj;
    }

    public static <T> T getTypedProperty(LogUtils logUtils, int i, Class<T> cls) {
        Object property = getProperty(logUtils, i);
        if (property == LogUtils.getMax) {
            property = null;
        }
        return cls.cast(SecureQwertyKeyboard.AnonymousClass1.length(property, (Class<?>) cls));
    }

    public static Object getProperty(LogUtils logUtils, int i) {
        Object obj;
        LogUtils logUtils2 = logUtils;
        do {
            obj = logUtils2.get(i, logUtils);
            if (obj != LogUtils.getMax || (logUtils2 = logUtils2.getPrototype()) == null) {
                return obj;
            }
            obj = logUtils2.get(i, logUtils);
            break;
        } while ((logUtils2 = logUtils2.getPrototype()) == null);
        return obj;
    }

    public static <T> T getTypedProperty(LogUtils logUtils, String str, Class<T> cls) {
        Object property = getProperty(logUtils, str);
        if (property == LogUtils.getMax) {
            property = null;
        }
        return cls.cast(SecureQwertyKeyboard.AnonymousClass1.length(property, (Class<?>) cls));
    }

    public static boolean hasProperty(LogUtils logUtils, String str) {
        return getBase(logUtils, str) != null;
    }

    public static void redefineProperty(LogUtils logUtils, String str, boolean z) {
        LogUtils base = getBase(logUtils, str);
        if (base != null) {
            if ((base instanceof convertIfSpecial) && ((convertIfSpecial) base).isConst(str)) {
                throw LogItem.length("msg.const.redecl", (Object) str);
            } else if (z) {
                throw LogItem.length("msg.var.redecl", (Object) str);
            }
        }
    }

    public static boolean hasProperty(LogUtils logUtils, int i) {
        return getBase(logUtils, i) != null;
    }

    public static boolean hasProperty(LogUtils logUtils, record record) {
        return getBase(logUtils, record) != null;
    }

    public static void putProperty(LogUtils logUtils, String str, Object obj) {
        LogUtils base = getBase(logUtils, str);
        if (base == null) {
            base = logUtils;
        }
        base.put(str, logUtils, obj);
    }

    public static void putProperty(LogUtils logUtils, record record, Object obj) {
        LogUtils base = getBase(logUtils, record);
        if (base == null) {
            base = logUtils;
        }
        ensureSymbolScriptable(base).put(record, logUtils, obj);
    }

    public static void putConstProperty(LogUtils logUtils, String str, Object obj) {
        LogUtils base = getBase(logUtils, str);
        if (base == null) {
            base = logUtils;
        }
        if (base instanceof convertIfSpecial) {
            ((convertIfSpecial) base).putConst(str, logUtils, obj);
        }
    }

    public static void putProperty(LogUtils logUtils, int i, Object obj) {
        LogUtils base = getBase(logUtils, i);
        if (base == null) {
            base = logUtils;
        }
        base.put(i, logUtils, obj);
    }

    public static boolean deleteProperty(LogUtils logUtils, String str) {
        LogUtils base = getBase(logUtils, str);
        if (base == null) {
            return true;
        }
        base.delete(str);
        if (!base.has(str, logUtils)) {
            return true;
        }
        return false;
    }

    public static boolean deleteProperty(LogUtils logUtils, int i) {
        LogUtils base = getBase(logUtils, i);
        if (base == null) {
            return true;
        }
        base.delete(i);
        if (!base.has(i, logUtils)) {
            return true;
        }
        return false;
    }

    public static Object[] getPropertyIds(LogUtils logUtils) {
        if (logUtils == null) {
            return LogItem.create;
        }
        Object[] ids = logUtils.getIds();
        SimplePassword.TextWatcherImpl textWatcherImpl = null;
        while (true) {
            logUtils = logUtils.getPrototype();
            if (logUtils == null) {
                break;
            }
            Object[] ids2 = logUtils.getIds();
            if (ids2.length != 0) {
                if (textWatcherImpl == null) {
                    if (ids.length == 0) {
                        ids = ids2;
                    } else {
                        textWatcherImpl = new SimplePassword.TextWatcherImpl(ids.length + ids2.length);
                        for (int i = 0; i != ids.length; i++) {
                            textWatcherImpl.intern(ids[i]);
                        }
                        ids = null;
                    }
                }
                for (int i2 = 0; i2 != ids2.length; i2++) {
                    textWatcherImpl.intern(ids2[i2]);
                }
            }
        }
        return textWatcherImpl != null ? textWatcherImpl.getKeys() : ids;
    }

    public static Object callMethod(LogUtils logUtils, String str, Object[] objArr) {
        return callMethod((SecureQwertyKeyboard.AnonymousClass1) null, logUtils, str, objArr);
    }

    public static Object callMethod(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, String str, Object[] objArr) {
        Object property = getProperty(logUtils, str);
        if (property instanceof doCheck) {
            doCheck docheck = (doCheck) property;
            LogUtils topLevelScope = getTopLevelScope(logUtils);
            if (r2 != null) {
                return docheck.call(r2, topLevelScope, logUtils, objArr);
            }
            return SecureQwertyKeyboard.AnonymousClass1.getMax(docheck, topLevelScope, logUtils, objArr);
        }
        throw LogItem.equals(logUtils, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK, PHI: r1 
      PHI: (r1v1 o.LogUtils) = (r1v0 o.LogUtils), (r1v3 o.LogUtils) binds: [B:0:0x0000, B:3:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.LogUtils getBase(o.LogUtils r1, java.lang.String r2) {
        /*
        L_0x0000:
            boolean r0 = r1.has((java.lang.String) r2, (o.LogUtils) r1)
            if (r0 != 0) goto L_0x000c
            o.LogUtils r1 = r1.getPrototype()
            if (r1 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.getBase(o.LogUtils, java.lang.String):o.LogUtils");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK, PHI: r1 
      PHI: (r1v1 o.LogUtils) = (r1v0 o.LogUtils), (r1v3 o.LogUtils) binds: [B:0:0x0000, B:3:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.LogUtils getBase(o.LogUtils r1, int r2) {
        /*
        L_0x0000:
            boolean r0 = r1.has((int) r2, (o.LogUtils) r1)
            if (r0 != 0) goto L_0x000c
            o.LogUtils r1 = r1.getPrototype()
            if (r1 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.getBase(o.LogUtils, int):o.LogUtils");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000e, LOOP_START, MTH_ENTER_BLOCK, PHI: r1 
      PHI: (r1v1 o.LogUtils) = (r1v0 o.LogUtils), (r1v3 o.LogUtils) binds: [B:0:0x0000, B:3:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.LogUtils getBase(o.LogUtils r1, o.record r2) {
        /*
        L_0x0000:
            o.tick r0 = ensureSymbolScriptable(r1)
            boolean r0 = r0.has(r2, r1)
            if (r0 != 0) goto L_0x0010
            o.LogUtils r1 = r1.getPrototype()
            if (r1 != 0) goto L_0x0000
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.getBase(o.LogUtils, o.record):o.LogUtils");
    }

    public final Object getAssociatedValue(Object obj) {
        Map<Object, Object> map = this.associatedValues;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public static Object getTopScopeValue(LogUtils logUtils, Object obj) {
        Object associatedValue;
        LogUtils topLevelScope = getTopLevelScope(logUtils);
        do {
            if ((topLevelScope instanceof ScriptableObject) && (associatedValue = ((ScriptableObject) topLevelScope).getAssociatedValue(obj)) != null) {
                return associatedValue;
            }
            topLevelScope = topLevelScope.getPrototype();
        } while (topLevelScope != null);
        return null;
    }

    public final synchronized Object associateValue(Object obj, Object obj2) {
        Map map;
        if (obj2 != null) {
            map = this.associatedValues;
            if (map == null) {
                map = new HashMap();
                this.associatedValues = map;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return getStyleId.getMax(map, obj, obj2);
    }

    private boolean putImpl(Object obj, int i, LogUtils logUtils, Object obj2) {
        getMax getmax;
        if (this.isExtensible || !SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            if (this != logUtils) {
                getmax = this.slotMap.getMax(obj, i);
                if (getmax == null) {
                    return false;
                }
            } else if (!this.isExtensible) {
                getmax = this.slotMap.getMax(obj, i);
                if (getmax == null) {
                    return true;
                }
            } else {
                if (this.isSealed) {
                    checkNotSealed(obj, i);
                }
                getmax = this.slotMap.setMin(obj, i, SlotAccess.MODIFY);
            }
            return getmax.setValue(obj2, this, logUtils);
        }
        throw LogItem.toFloatRange("msg.not.extensible");
    }

    private boolean putConstImpl(String str, int i, LogUtils logUtils, Object obj, int i2) {
        getMax getmax;
        if (!$assertionsDisabled && i2 == 0) {
            throw new AssertionError();
        } else if (this.isExtensible || !SecureQwertyKeyboard.AnonymousClass1.toFloatRange().toDoubleRange()) {
            if (this != logUtils) {
                getmax = this.slotMap.getMax(str, i);
                if (getmax == null) {
                    return false;
                }
            } else if (!isExtensible()) {
                getmax = this.slotMap.getMax(str, i);
                if (getmax == null) {
                    return true;
                }
            } else {
                checkNotSealed(str, i);
                getMax min = this.slotMap.setMin(str, i, SlotAccess.MODIFY_CONST);
                int attributes = min.getAttributes();
                if ((attributes & 1) != 0) {
                    if ((attributes & 8) != 0) {
                        min.value = obj;
                        if (i2 != 8) {
                            min.setAttributes(attributes & -9);
                        }
                    }
                    return true;
                }
                throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.var.redecl", (Object) str);
            }
            return getmax.setValue(obj, this, logUtils);
        } else {
            throw LogItem.toFloatRange("msg.not.extensible");
        }
    }

    private getMax findAttributeSlot(String str, int i, SlotAccess slotAccess) {
        getMax min = this.slotMap.setMin(str, i, slotAccess);
        if (min != null) {
            return min;
        }
        if (str == null) {
            str = Integer.toString(i);
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.prop.not.found", (Object) str);
    }

    private getMax findAttributeSlot(record record, SlotAccess slotAccess) {
        getMax min = this.slotMap.setMin(record, 0, slotAccess);
        if (min != null) {
            return min;
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.prop.not.found", (Object) record);
    }

    /* JADX INFO: finally extract failed */
    public Object[] getIds(boolean z, boolean z2) {
        Object[] objArr;
        Object obj;
        traceCount tracecount = this.externalData;
        int max = tracecount == null ? 0 : tracecount.getMax();
        if (max == 0) {
            objArr = LogItem.create;
        } else {
            objArr = new Object[max];
            for (int i = 0; i < max; i++) {
                objArr[i] = Integer.valueOf(i);
            }
        }
        if (this.slotMap.getMin()) {
            return objArr;
        }
        long max2 = this.slotMap.setMax();
        try {
            Iterator<getMax> it = this.slotMap.iterator();
            int i2 = max;
            while (it.hasNext()) {
                getMax next = it.next();
                if ((z || (next.getAttributes() & 2) == 0) && (z2 || !(next.name instanceof record))) {
                    if (i2 == max) {
                        Object[] objArr2 = new Object[(this.slotMap.getMax() + max)];
                        if (objArr != null) {
                            System.arraycopy(objArr, 0, objArr2, 0, max);
                        }
                        objArr = objArr2;
                    }
                    int i3 = i2 + 1;
                    if (next.name != null) {
                        obj = next.name;
                    } else {
                        obj = Integer.valueOf(next.indexOrHash);
                    }
                    objArr[i2] = obj;
                    i2 = i3;
                }
            }
            this.slotMap.length(max2);
            if (i2 != objArr.length + max) {
                Object[] objArr3 = new Object[i2];
                System.arraycopy(objArr, 0, objArr3, 0, i2);
                objArr = objArr3;
            }
            SecureQwertyKeyboard.AnonymousClass1 min = SecureQwertyKeyboard.AnonymousClass1.setMin();
            if (min != null && min.getMax(16)) {
                Arrays.sort(objArr, KEY_COMPARATOR);
            }
            return objArr;
        } catch (Throwable th) {
            this.slotMap.length(max2);
            throw th;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long max = this.slotMap.setMax();
        try {
            int max2 = this.slotMap.getMax();
            if (max2 == 0) {
                objectOutputStream.writeInt(0);
            } else {
                objectOutputStream.writeInt(max2);
                Iterator<getMax> it = this.slotMap.iterator();
                while (it.hasNext()) {
                    objectOutputStream.writeObject(it.next());
                }
            }
        } finally {
            this.slotMap.length(max);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.slotMap = createSlotMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.slotMap.getMin((getMax) objectInputStream.readObject());
        }
    }

    public ScriptableObject getOwnPropertyDescriptor(SecureQwertyKeyboard.AnonymousClass1 r2, Object obj) {
        getMax slot = getSlot(r2, obj, SlotAccess.QUERY);
        if (slot == null) {
            return null;
        }
        LogUtils parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        return slot.getPropertyDescriptor(r2, parentScope);
    }

    /* access modifiers changed from: protected */
    public getMax getSlot(SecureQwertyKeyboard.AnonymousClass1 r3, Object obj, SlotAccess slotAccess) {
        if (obj instanceof record) {
            return this.slotMap.setMin(obj, 0, slotAccess);
        }
        String max = LogItem.setMax(r3, obj);
        if (max == null) {
            return this.slotMap.setMin((Object) null, LogItem.toIntRange(r3), slotAccess);
        }
        return this.slotMap.setMin(max, 0, slotAccess);
    }

    public int size() {
        return this.slotMap.setMin();
    }

    public boolean isEmpty() {
        return this.slotMap.getMin();
    }

    public Object get(Object obj) {
        Object obj2;
        if (obj instanceof String) {
            obj2 = get((String) obj, (LogUtils) this);
        } else if (obj instanceof record) {
            obj2 = get((record) obj, (LogUtils) this);
        } else {
            obj2 = obj instanceof Number ? get(((Number) obj).intValue(), (LogUtils) this) : null;
        }
        if (obj2 == LogUtils.getMax || obj2 == checkOpen.instance) {
            return null;
        }
        return obj2 instanceof UniResultF2fpayOrderInfo ? ((UniResultF2fpayOrderInfo) obj2).unwrap() : obj2;
    }

    public static final class length implements Comparator<Object> {
        public final int compare(Object obj, Object obj2) {
            int intValue;
            int intValue2;
            if (!(obj instanceof Integer)) {
                return obj2 instanceof Integer ? 1 : 0;
            }
            if (!(obj2 instanceof Integer) || (intValue = ((Integer) obj).intValue()) < (intValue2 = ((Integer) obj2).intValue())) {
                return -1;
            }
            return intValue > intValue2 ? 1 : 0;
        }
    }
}
