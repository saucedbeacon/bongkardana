package o;

import java.lang.reflect.Array;
import java.util.Map;
import kotlin.text.Typography;
import o.SafeInputWidget;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public class initPwdInputView extends SimplePassword implements doCheck {
    static final String javaClassPropertyName = "__javaObject__";
    static final long serialVersionUID = -6460763940409461664L;
    private Map<String, encryptToByteArray> staticFieldAndMethods;

    public String getClassName() {
        return "JavaClass";
    }

    public initPwdInputView() {
    }

    public initPwdInputView(LogUtils logUtils, Class<?> cls) {
        this(logUtils, cls, false);
    }

    public initPwdInputView(LogUtils logUtils, Class<?> cls, boolean z) {
        super(logUtils, cls, (Class<?>) null, z);
    }

    /* access modifiers changed from: protected */
    public void initMembers() {
        Class cls = (Class) this.javaObject;
        this.members = getDrawableId.length(this.parent, cls, cls, this.isAdapter);
        this.staticFieldAndMethods = this.members.length(this, cls, true);
    }

    public boolean has(String str, LogUtils logUtils) {
        return this.members.getMin(str, true) || javaClassPropertyName.equals(str);
    }

    public Object get(String str, LogUtils logUtils) {
        encryptToByteArray encrypttobytearray;
        if (str.equals("prototype")) {
            return null;
        }
        Map<String, encryptToByteArray> map = this.staticFieldAndMethods;
        if (map != null && (encrypttobytearray = map.get(str)) != null) {
            return encrypttobytearray;
        }
        if (this.members.getMin(str, true)) {
            return this.members.setMax(this, str, this.javaObject, true);
        }
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        if (floatRange.Grayscale$Algorithm == null) {
            floatRange.Grayscale$Algorithm = new MoneyView();
        }
        MoneyView moneyView = floatRange.Grayscale$Algorithm;
        if (javaClassPropertyName.equals(str)) {
            return moneyView.getMax(topLevelScope, this.javaObject, LogItem.setMin);
        }
        Class<?> findNestedClass = findNestedClass(getClassObject(), str);
        if (findNestedClass != null) {
            initPwdInputView initpwdinputview = new initPwdInputView(topLevelScope, findNestedClass);
            initpwdinputview.setParentScope(this);
            return initpwdinputview;
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.java.member.not.found", (Object) this.members.length.getName(), (Object) str);
    }

    public void put(String str, LogUtils logUtils, Object obj) {
        this.members.getMin(this, str, this.javaObject, obj, true);
    }

    public Object[] getIds() {
        return this.members.setMax(true);
    }

    public Class<?> getClassObject() {
        return (Class) super.unwrap();
    }

    public Object getDefaultValue(Class<?> cls) {
        if (cls == null || cls == LogItem.toString) {
            return toString();
        }
        if (cls == LogItem.length) {
            return Boolean.TRUE;
        }
        return cls == LogItem.toIntRange ? LogItem.b : this;
    }

    public Object call(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (objArr.length != 1 || !(objArr[0] instanceof LogUtils)) {
            return construct(r3, logUtils, objArr);
        }
        Class<?> classObject = getClassObject();
        LogUtils logUtils3 = objArr[0];
        do {
            if ((logUtils3 instanceof UniResultF2fpayOrderInfo) && classObject.isInstance(((UniResultF2fpayOrderInfo) logUtils3).unwrap())) {
                return logUtils3;
            }
            logUtils3 = logUtils3.getPrototype();
        } while (logUtils3 != null);
        return construct(r3, logUtils, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r6 == null) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.LogUtils construct(o.SecureQwertyKeyboard.AnonymousClass1 r6, o.LogUtils r7, java.lang.Object[] r8) {
        /*
            r5 = this;
            java.lang.Class r0 = r5.getClassObject()
            int r1 = r0.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isInterface(r1)
            if (r2 != 0) goto L_0x0036
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L_0x0036
            o.getDrawableId r1 = r5.members
            o.setBizId r1 = r1.setMin
            int r2 = r1.findCachedFunction(r6, r8)
            if (r2 < 0) goto L_0x0027
            o.getStyleableIds[] r0 = r1.methods
            r0 = r0[r2]
            o.LogUtils r6 = constructSpecific(r6, r7, r8, r0)
            return r6
        L_0x0027:
            java.lang.String r6 = o.setBizId.scriptSignature(r8)
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = "msg.no.java.ctor"
            org.mozilla.javascript.EvaluatorException r6 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r8, (java.lang.Object) r7, (java.lang.Object) r6)
            throw r6
        L_0x0036:
            int r1 = r8.length
            if (r1 == 0) goto L_0x009e
            o.LogUtils r1 = org.mozilla.javascript.ScriptableObject.getTopLevelScope(r5)
            java.lang.String r2 = "Dalvik"
            java.lang.String r3 = "java.vm.name"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{ Exception -> 0x0089 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0089 }
            r3 = 0
            if (r2 == 0) goto L_0x006e
            boolean r2 = r0.isInterface()     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x006e
            r8 = r8[r3]     // Catch:{ Exception -> 0x0089 }
            org.mozilla.javascript.ScriptableObject r8 = org.mozilla.javascript.ScriptableObject.ensureScriptableObject(r8)     // Catch:{ Exception -> 0x0089 }
            java.lang.Object r8 = createInterfaceAdapter(r0, r8)     // Catch:{ Exception -> 0x0089 }
            o.MoneyView r1 = r6.Grayscale$Algorithm     // Catch:{ Exception -> 0x0089 }
            if (r1 != 0) goto L_0x0067
            o.MoneyView r1 = new o.MoneyView     // Catch:{ Exception -> 0x0089 }
            r1.<init>()     // Catch:{ Exception -> 0x0089 }
            r6.Grayscale$Algorithm = r1     // Catch:{ Exception -> 0x0089 }
        L_0x0067:
            o.SimplePassword r6 = new o.SimplePassword     // Catch:{ Exception -> 0x0089 }
            r1 = 0
            r6.<init>(r7, r8, r1)     // Catch:{ Exception -> 0x0089 }
            return r6
        L_0x006e:
            java.lang.String r7 = "JavaAdapter"
            java.lang.Object r7 = r1.get((java.lang.String) r7, (o.LogUtils) r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.Object r2 = getMax     // Catch:{ Exception -> 0x0089 }
            if (r7 == r2) goto L_0x0091
            o.doCheck r7 = (o.doCheck) r7     // Catch:{ Exception -> 0x0089 }
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0089 }
            r2[r3] = r5     // Catch:{ Exception -> 0x0089 }
            r4 = 1
            r8 = r8[r3]     // Catch:{ Exception -> 0x0089 }
            r2[r4] = r8     // Catch:{ Exception -> 0x0089 }
            o.LogUtils r6 = r7.construct(r6, r1, r2)     // Catch:{ Exception -> 0x0089 }
            return r6
        L_0x0089:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            java.lang.String r6 = ""
        L_0x0093:
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = "msg.cant.instantiate"
            org.mozilla.javascript.EvaluatorException r6 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r8, (java.lang.Object) r6, (java.lang.Object) r7)
            throw r6
        L_0x009e:
            java.lang.String r6 = "msg.adapter.zero.args"
            org.mozilla.javascript.EvaluatorException r6 = o.SecureQwertyKeyboard.AnonymousClass1.setMin((java.lang.String) r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initPwdInputView.construct(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.Object[]):o.LogUtils");
    }

    static LogUtils constructSpecific(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils, Object[] objArr, getStyleableIds getstyleableids) {
        Object constructInternal = constructInternal(objArr, getstyleableids);
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        if (r0.Grayscale$Algorithm == null) {
            r0.Grayscale$Algorithm = new MoneyView();
        }
        if (constructInternal instanceof LogUtils) {
            return (LogUtils) constructInternal;
        }
        if (constructInternal.getClass().isArray()) {
            return SafeInputWidget.AnonymousClass1.wrap(topLevelScope, constructInternal);
        }
        return new SimplePassword(topLevelScope, constructInternal, (Class<?>) null);
    }

    static Object constructInternal(Object[] objArr, getStyleableIds getstyleableids) {
        Object[] objArr2;
        Object obj;
        Class<?>[] clsArr = getstyleableids.argTypes;
        int i = 0;
        if (getstyleableids.vararg) {
            objArr2 = new Object[clsArr.length];
            for (int i2 = 0; i2 < clsArr.length - 1; i2++) {
                objArr2[i2] = SecureQwertyKeyboard.AnonymousClass1.length(objArr[i2], clsArr[i2]);
            }
            if (objArr.length != clsArr.length || (objArr[objArr.length - 1] != null && !(objArr[objArr.length - 1] instanceof getResourceDeclareStyleableIntArray) && !(objArr[objArr.length - 1] instanceof SafeInputWidget.AnonymousClass1))) {
                Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
                Object newInstance = Array.newInstance(componentType, (objArr.length - clsArr.length) + 1);
                while (i < Array.getLength(newInstance)) {
                    Array.set(newInstance, i, SecureQwertyKeyboard.AnonymousClass1.length(objArr[(clsArr.length - 1) + i], componentType));
                    i++;
                }
                obj = newInstance;
            } else {
                obj = SecureQwertyKeyboard.AnonymousClass1.length(objArr[objArr.length - 1], clsArr[clsArr.length - 1]);
            }
            objArr2[clsArr.length - 1] = obj;
        } else {
            objArr2 = objArr;
            while (i < objArr2.length) {
                Object obj2 = objArr2[i];
                Object length = SecureQwertyKeyboard.AnonymousClass1.length(obj2, clsArr[i]);
                if (length != obj2) {
                    if (objArr2 == objArr) {
                        objArr2 = (Object[]) objArr.clone();
                    }
                    objArr2[i] = length;
                }
                i++;
            }
        }
        return getstyleableids.newInstance(objArr2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[JavaClass ");
        sb.append(getClassObject().getName());
        sb.append("]");
        return sb.toString();
    }

    public boolean hasInstance(LogUtils logUtils) {
        if (!(logUtils instanceof UniResultF2fpayOrderInfo) || (logUtils instanceof initPwdInputView)) {
            return false;
        }
        return getClassObject().isInstance(((UniResultF2fpayOrderInfo) logUtils).unwrap());
    }

    private static Class<?> findNestedClass(Class<?> cls, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append(Typography.dollar);
        sb.append(str);
        String obj = sb.toString();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return getStyleId.getMax(obj);
        }
        return getStyleId.setMax(classLoader, obj);
    }
}
