package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.data.Source;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import o.SafeInputWidget;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;

public class SimplePassword implements LogUtils, UniResultF2fpayOrderInfo, Serializable {
    private static final Object COERCED_INTERFACE_KEY = "Coerced Interface";
    static final byte CONVERSION_NONE = 99;
    static final byte CONVERSION_NONTRIVIAL = 0;
    static final byte CONVERSION_TRIVIAL = 1;
    private static final int JSTYPE_BOOLEAN = 2;
    private static final int JSTYPE_JAVA_ARRAY = 7;
    private static final int JSTYPE_JAVA_CLASS = 5;
    private static final int JSTYPE_JAVA_OBJECT = 6;
    private static final int JSTYPE_NULL = 1;
    private static final int JSTYPE_NUMBER = 3;
    private static final int JSTYPE_OBJECT = 8;
    private static final int JSTYPE_STRING = 4;
    private static final int JSTYPE_UNDEFINED = 0;
    private static Method adapter_readAdapterObject = null;
    private static Method adapter_writeAdapterObject = null;
    static final long serialVersionUID = -6948590651130498591L;
    private transient Map<String, encryptToByteArray> fieldAndMethods;
    protected transient boolean isAdapter;
    protected transient Object javaObject;
    protected transient getDrawableId members;
    protected LogUtils parent;
    protected LogUtils prototype;
    protected transient Class<?> staticType;

    public void delete(int i) {
    }

    public void delete(String str) {
    }

    public String getClassName() {
        return "JavaObject";
    }

    public boolean has(int i, LogUtils logUtils) {
        int max = dispatchOnCancelled.setMax(i);
        if (i == max) {
            return false;
        }
        onCanceled oncanceled = new onCanceled(i, max, 1);
        onCancelLoad.setMax(-1769658081, oncanceled);
        onCancelLoad.getMin(-1769658081, oncanceled);
        return false;
    }

    public boolean hasInstance(LogUtils logUtils) {
        return false;
    }

    /* renamed from: o.SimplePassword$2  reason: invalid class name */
    public class AnonymousClass2 implements LogUtils, printExceptionStackTrace, Serializable {
        private static final Object FTAG = "With";
        private static final int Id_constructor = 1;
        private static final long serialVersionUID = 1;
        protected LogUtils parent;
        protected LogUtils prototype;

        public String getClassName() {
            return "With";
        }

        static void init(LogUtils logUtils, boolean z) {
            AnonymousClass2 r7 = new AnonymousClass2();
            r7.setParentScope(logUtils);
            r7.setPrototype(ScriptableObject.getObjectPrototype(logUtils));
            EditTextUtil editTextUtil = new EditTextUtil(r7, FTAG, 1, "With", 0, logUtils);
            editTextUtil.markAsConstructor(r7);
            if (z) {
                editTextUtil.sealObject();
            }
            editTextUtil.exportAsScopeProperty();
        }

        private AnonymousClass2() {
        }

        public AnonymousClass2(LogUtils logUtils, LogUtils logUtils2) {
            this.parent = logUtils;
            this.prototype = logUtils2;
        }

        public boolean has(String str, LogUtils logUtils) {
            LogUtils logUtils2 = this.prototype;
            return logUtils2.has(str, logUtils2);
        }

        public boolean has(int i, LogUtils logUtils) {
            LogUtils logUtils2 = this.prototype;
            return logUtils2.has(i, logUtils2);
        }

        public Object get(String str, LogUtils logUtils) {
            if (logUtils == this) {
                logUtils = this.prototype;
            }
            return this.prototype.get(str, logUtils);
        }

        public Object get(int i, LogUtils logUtils) {
            if (logUtils == this) {
                logUtils = this.prototype;
            }
            return this.prototype.get(i, logUtils);
        }

        public void put(String str, LogUtils logUtils, Object obj) {
            if (logUtils == this) {
                logUtils = this.prototype;
            }
            this.prototype.put(str, logUtils, obj);
        }

        public void put(int i, LogUtils logUtils, Object obj) {
            if (logUtils == this) {
                logUtils = this.prototype;
            }
            this.prototype.put(i, logUtils, obj);
        }

        public void delete(String str) {
            this.prototype.delete(str);
        }

        public void delete(int i) {
            this.prototype.delete(i);
        }

        public LogUtils getPrototype() {
            return this.prototype;
        }

        public void setPrototype(LogUtils logUtils) {
            this.prototype = logUtils;
        }

        public LogUtils getParentScope() {
            return this.parent;
        }

        public void setParentScope(LogUtils logUtils) {
            this.parent = logUtils;
        }

        public Object[] getIds() {
            return this.prototype.getIds();
        }

        public Object getDefaultValue(Class<?> cls) {
            return this.prototype.getDefaultValue(cls);
        }

        public boolean hasInstance(LogUtils logUtils) {
            return this.prototype.hasInstance(logUtils);
        }

        /* access modifiers changed from: protected */
        public Object updateDotQuery(boolean z) {
            throw new IllegalStateException();
        }

        public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
            if (!editTextUtil.hasTag(FTAG) || editTextUtil.methodId() != 1) {
                throw editTextUtil.unknown();
            }
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.cant.call.indirect", (Object) "With");
        }

        static boolean isWithFunction(Object obj) {
            if (obj instanceof EditTextUtil) {
                EditTextUtil editTextUtil = (EditTextUtil) obj;
                if (!editTextUtil.hasTag(FTAG) || editTextUtil.methodId() != 1) {
                    return false;
                }
                return true;
            }
            return false;
        }

        static Object newWithSpecial(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, Object[] objArr) {
            LogUtils logUtils2;
            LogItem.getMax(r2, "With");
            LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
            AnonymousClass2 r0 = new AnonymousClass2();
            if (objArr.length == 0) {
                logUtils2 = ScriptableObject.getObjectPrototype(topLevelScope);
            } else {
                logUtils2 = LogItem.setMin(r2, topLevelScope, objArr[0]);
            }
            r0.setPrototype(logUtils2);
            r0.setParentScope(topLevelScope);
            return r0;
        }
    }

    public SimplePassword() {
    }

    /* renamed from: o.SimplePassword$1  reason: invalid class name */
    public class AnonymousClass1 extends setUiContext implements record {
        public static final String CLASS_NAME = "Symbol";
        private static final Object CONSTRUCTOR_SLOT = new Object();
        private static final int ConstructorId_for = -1;
        private static final int ConstructorId_keyFor = -2;
        private static final Object GLOBAL_TABLE_KEY = new Object();
        private static final int Id_constructor = 1;
        private static final int Id_toString = 2;
        private static final int Id_valueOf = 4;
        private static final int MAX_PROTOTYPE_ID = 5;
        private static final int SymbolId_toPrimitive = 5;
        private static final int SymbolId_toStringTag = 3;
        public static final String TYPE_NAME = "symbol";
        private static final long serialVersionUID = -589539749749830003L;
        private final F2fpaySwitchFacade key;
        private final AnonymousClass1 symbolData;

        public String getClassName() {
            return CLASS_NAME;
        }

        public static void init(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, boolean z) {
            EditTextUtil exportAsJSClass = new AnonymousClass1("").exportAsJSClass(5, logUtils, false);
            r3.setMin(CONSTRUCTOR_SLOT, (Object) Boolean.TRUE);
            try {
                createStandardSymbol(r3, logUtils, exportAsJSClass, "iterator", F2fpaySwitchFacade.ITERATOR);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "species", F2fpaySwitchFacade.SPECIES);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "toStringTag", F2fpaySwitchFacade.TO_STRING_TAG);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "hasInstance", F2fpaySwitchFacade.HAS_INSTANCE);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "isConcatSpreadable", F2fpaySwitchFacade.IS_CONCAT_SPREADABLE);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "isRegExp", F2fpaySwitchFacade.IS_REGEXP);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "toPrimitive", F2fpaySwitchFacade.TO_PRIMITIVE);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "match", F2fpaySwitchFacade.MATCH);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "replace", F2fpaySwitchFacade.REPLACE);
                createStandardSymbol(r3, logUtils, exportAsJSClass, FirebaseAnalytics.Event.SEARCH, F2fpaySwitchFacade.SEARCH);
                createStandardSymbol(r3, logUtils, exportAsJSClass, Source.SPLIT, F2fpaySwitchFacade.SPLIT);
                createStandardSymbol(r3, logUtils, exportAsJSClass, "unscopables", F2fpaySwitchFacade.UNSCOPABLES);
                if (z) {
                    exportAsJSClass.sealObject();
                }
            } finally {
                r3.getMin(CONSTRUCTOR_SLOT);
            }
        }

        private AnonymousClass1(String str) {
            this.key = new F2fpaySwitchFacade(str);
            this.symbolData = this;
        }

        private AnonymousClass1(F2fpaySwitchFacade f2fpaySwitchFacade) {
            this.key = f2fpaySwitchFacade;
            this.symbolData = this;
        }

        public AnonymousClass1(AnonymousClass1 r2) {
            this.key = r2.key;
            this.symbolData = r2.symbolData;
        }

        public static AnonymousClass1 construct(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, Object[] objArr) {
            r2.setMin(CONSTRUCTOR_SLOT, (Object) Boolean.TRUE);
            try {
                return (AnonymousClass1) LogItem.getMax(r2, logUtils, CLASS_NAME, objArr);
            } finally {
                r2.getMin(CONSTRUCTOR_SLOT);
            }
        }

        /* access modifiers changed from: protected */
        public void fillConstructorProperties(EditTextUtil editTextUtil) {
            super.fillConstructorProperties(editTextUtil);
            addIdFunctionProperty(editTextUtil, CLASS_NAME, -1, "for", 1);
            addIdFunctionProperty(editTextUtil, CLASS_NAME, -2, "keyFor", 1);
        }

        /* access modifiers changed from: protected */
        public int findPrototypeId(String str) {
            String str2;
            int i;
            int length = str.length();
            if (length == 7) {
                i = 4;
                str2 = "valueOf";
            } else if (length == 8) {
                i = 2;
                str2 = "toString";
            } else if (length == 11) {
                i = 1;
                str2 = "constructor";
            } else {
                str2 = null;
                i = 0;
            }
            if (str2 == null || str2 == str || str2.equals(str)) {
                return i;
            }
            return 0;
        }

        /* access modifiers changed from: protected */
        public int findPrototypeId(record record) {
            if (F2fpaySwitchFacade.TO_STRING_TAG.equals(record)) {
                return 3;
            }
            return F2fpaySwitchFacade.TO_PRIMITIVE.equals(record) ? 5 : 0;
        }

        /* access modifiers changed from: protected */
        public void initPrototypeId(int i) {
            if (i == 1) {
                initPrototypeMethod(CLASS_NAME, i, "constructor", 1);
            } else if (i == 2) {
                initPrototypeMethod(CLASS_NAME, i, "toString", 0);
            } else if (i == 3) {
                initPrototypeValue(i, (record) F2fpaySwitchFacade.TO_STRING_TAG, (Object) CLASS_NAME, 3);
            } else if (i == 4) {
                initPrototypeMethod(CLASS_NAME, i, "valueOf", 0);
            } else if (i != 5) {
                super.initPrototypeId(i);
            } else {
                initPrototypeMethod((Object) CLASS_NAME, i, (record) F2fpaySwitchFacade.TO_PRIMITIVE, "Symbol.toPrimitive", 1);
            }
        }

        public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
            Object obj;
            if (!editTextUtil.hasTag(CLASS_NAME)) {
                return super.execIdCall(editTextUtil, r4, logUtils, logUtils2, objArr);
            }
            int methodId = editTextUtil.methodId();
            if (methodId == -2) {
                return js_keyFor(r4, logUtils, objArr);
            }
            if (methodId == -1) {
                return js_for(r4, logUtils, objArr);
            }
            if (methodId != 1) {
                if (methodId == 2) {
                    return getSelf(logUtils2).toString();
                }
                if (methodId == 4 || methodId == 5) {
                    return getSelf(logUtils2).js_valueOf();
                }
                return super.execIdCall(editTextUtil, r4, logUtils, logUtils2, objArr);
            } else if (logUtils2 != null) {
                return construct(r4, logUtils, objArr);
            } else {
                Object obj2 = CONSTRUCTOR_SLOT;
                if (r4.Mean$Arithmetic == null) {
                    obj = null;
                } else {
                    obj = r4.Mean$Arithmetic.get(obj2);
                }
                if (obj != null) {
                    return js_constructor(objArr);
                }
                throw LogItem.toFloatRange("msg.no.symbol.new");
            }
        }

        private AnonymousClass1 getSelf(Object obj) {
            try {
                return (AnonymousClass1) obj;
            } catch (ClassCastException unused) {
                throw LogItem.length("msg.invalid.type", (Object) obj.getClass().getName());
            }
        }

        private static AnonymousClass1 js_constructor(Object[] objArr) {
            String min = (objArr.length <= 0 || checkOpen.instance.equals(objArr[0])) ? "" : LogItem.getMin(objArr[0]);
            if (objArr.length > 1) {
                return new AnonymousClass1(objArr[1]);
            }
            return new AnonymousClass1(min);
        }

        private Object js_valueOf() {
            return this.symbolData;
        }

        private Object js_for(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, Object[] objArr) {
            String min = LogItem.getMin(objArr.length > 0 ? objArr[0] : checkOpen.instance);
            Map<String, AnonymousClass1> globalMap = getGlobalMap();
            AnonymousClass1 r2 = globalMap.get(min);
            if (r2 != null) {
                return r2;
            }
            AnonymousClass1 construct = construct(r4, logUtils, new Object[]{min});
            globalMap.put(min, construct);
            return construct;
        }

        private Object js_keyFor(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, Object[] objArr) {
            Object obj = objArr.length > 0 ? objArr[0] : checkOpen.instance;
            if (obj instanceof AnonymousClass1) {
                AnonymousClass1 r5 = (AnonymousClass1) obj;
                for (Map.Entry next : getGlobalMap().entrySet()) {
                    if (((AnonymousClass1) next.getValue()).key == r5.key) {
                        return next.getKey();
                    }
                }
                return checkOpen.instance;
            }
            throw LogItem.getMin(r3, logUtils, "TypeError", "Not a Symbol");
        }

        public String toString() {
            return this.key.toString();
        }

        public void put(String str, LogUtils logUtils, Object obj) {
            if (!isSymbol()) {
                super.put(str, logUtils, obj);
            } else if (SecureQwertyKeyboard.AnonymousClass1.setMin().toDoubleRange()) {
                throw LogItem.toFloatRange("msg.no.assign.symbol.strict");
            }
        }

        public void put(int i, LogUtils logUtils, Object obj) {
            if (!isSymbol()) {
                super.put(i, logUtils, obj);
            } else if (SecureQwertyKeyboard.AnonymousClass1.setMin().toDoubleRange()) {
                throw LogItem.toFloatRange("msg.no.assign.symbol.strict");
            }
        }

        public void put(record record, LogUtils logUtils, Object obj) {
            if (!isSymbol()) {
                super.put(record, logUtils, obj);
            } else if (SecureQwertyKeyboard.AnonymousClass1.setMin().toDoubleRange()) {
                throw LogItem.toFloatRange("msg.no.assign.symbol.strict");
            }
        }

        public boolean isSymbol() {
            return this.symbolData == this;
        }

        public String getTypeOf() {
            return isSymbol() ? TYPE_NAME : super.getTypeOf();
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public boolean equals(Object obj) {
            return this.key.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public F2fpaySwitchFacade getKey() {
            return this.key;
        }

        private Map<String, AnonymousClass1> getGlobalMap() {
            ScriptableObject scriptableObject = (ScriptableObject) getTopLevelScope(this);
            Map<String, AnonymousClass1> map = (Map) scriptableObject.getAssociatedValue(GLOBAL_TABLE_KEY);
            if (map != null) {
                return map;
            }
            HashMap hashMap = new HashMap();
            scriptableObject.associateValue(GLOBAL_TABLE_KEY, hashMap);
            return hashMap;
        }

        private static void createStandardSymbol(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, ScriptableObject scriptableObject, String str, F2fpaySwitchFacade f2fpaySwitchFacade) {
            scriptableObject.defineProperty(str, (Object) LogItem.getMax(r2, logUtils, CLASS_NAME, new Object[]{str, f2fpaySwitchFacade}), 7);
        }
    }

    public class TextWatcherImpl implements Serializable {
        private static final int A = -1640531527;
        /* access modifiers changed from: private */
        public static final Object DELETED = new Object();
        private static final boolean check = false;
        static final long serialVersionUID = -1542220580748809402L;
        private int keyCount;
        private transient Object[] keys;
        private transient int occupiedCount;
        private int power;
        private transient int[] values;

        private static int tableLookupStep(int i, int i2, int i3) {
            int i4 = 32 - (i3 * 2);
            if (i4 >= 0) {
                i >>>= i4;
            } else {
                i2 >>>= -i4;
            }
            return (i & i2) | 1;
        }

        public static class getMin {
            int[] getMax;
            public Object[] getMin;
            int length;
            public int setMax;
            public TextWatcherImpl setMin;

            getMin(TextWatcherImpl textWatcherImpl) {
                this.setMin = textWatcherImpl;
            }

            public final boolean getMin() {
                return this.length < 0;
            }

            public final void getMax() {
                if (this.length == -1) {
                    getStyleId.setMin();
                }
                if (this.length == 0) {
                    this.length = -1;
                    this.setMax = -1;
                    return;
                }
                int i = this.setMax;
                while (true) {
                    this.setMax = i + 1;
                    Object obj = this.getMin[this.setMax];
                    if (obj == null || obj == TextWatcherImpl.DELETED) {
                        i = this.setMax;
                    } else {
                        this.length--;
                        return;
                    }
                }
            }
        }

        public TextWatcherImpl() {
            this(4);
        }

        public TextWatcherImpl(int i) {
            if (i < 0) {
                getStyleId.setMin();
            }
            int i2 = 2;
            while ((1 << i2) < (i * 4) / 3) {
                i2++;
            }
            this.power = i2;
        }

        public boolean isEmpty() {
            return this.keyCount == 0;
        }

        public int size() {
            return this.keyCount;
        }

        public boolean has(Object obj) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            return findIndex(obj) >= 0;
        }

        public int get(Object obj, int i) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            int findIndex = findIndex(obj);
            return findIndex >= 0 ? this.values[findIndex] : i;
        }

        public int getExisting(Object obj) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            int findIndex = findIndex(obj);
            if (findIndex >= 0) {
                return this.values[findIndex];
            }
            getStyleId.setMin();
            return 0;
        }

        public void put(Object obj, int i) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            this.values[ensureIndex(obj)] = i;
        }

        public Object intern(Object obj) {
            boolean z;
            if (obj == null) {
                obj = ack.NULL_VALUE;
                z = true;
            } else {
                z = false;
            }
            int ensureIndex = ensureIndex(obj);
            this.values[ensureIndex] = 0;
            if (z) {
                return null;
            }
            return this.keys[ensureIndex];
        }

        public void remove(Object obj) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            int findIndex = findIndex(obj);
            if (findIndex >= 0) {
                this.keys[findIndex] = DELETED;
                this.keyCount--;
            }
        }

        public void clear() {
            int length = this.keys.length;
            while (length != 0) {
                length--;
                this.keys[length] = null;
            }
            this.keyCount = 0;
            this.occupiedCount = 0;
        }

        public getMin newIterator() {
            return new getMin(this);
        }

        public final void initIterator(getMin getmin) {
            Object[] objArr = this.keys;
            int[] iArr = this.values;
            int i = this.keyCount;
            getmin.getMin = objArr;
            getmin.getMax = iArr;
            getmin.setMax = -1;
            getmin.length = i;
        }

        public Object[] getKeys() {
            Object[] objArr = new Object[this.keyCount];
            getKeys(objArr, 0);
            return objArr;
        }

        public void getKeys(Object[] objArr, int i) {
            int i2 = this.keyCount;
            int i3 = 0;
            while (i2 != 0) {
                Object obj = this.keys[i3];
                if (!(obj == null || obj == DELETED)) {
                    if (obj == ack.NULL_VALUE) {
                        obj = null;
                    }
                    objArr[i] = obj;
                    i++;
                    i2--;
                }
                i3++;
            }
        }

        private int findIndex(Object obj) {
            if (this.keys == null) {
                return -1;
            }
            int hashCode = obj.hashCode();
            int i = A * hashCode;
            int i2 = this.power;
            int i3 = i >>> (32 - i2);
            Object obj2 = this.keys[i3];
            if (obj2 == null) {
                return -1;
            }
            int i4 = 1 << i2;
            if (obj2 != obj && (this.values[i4 + i3] != hashCode || !obj2.equals(obj))) {
                int i5 = i4 - 1;
                int tableLookupStep = tableLookupStep(i, i5, this.power);
                while (true) {
                    i3 = (i3 + tableLookupStep) & i5;
                    Object obj3 = this.keys[i3];
                    if (obj3 != null) {
                        if (obj3 == obj || (this.values[i4 + i3] == hashCode && obj3.equals(obj))) {
                            break;
                        }
                    } else {
                        return -1;
                    }
                }
            }
            return i3;
        }

        private int insertNewKey(Object obj, int i) {
            int i2 = A * i;
            int i3 = this.power;
            int i4 = i2 >>> (32 - i3);
            int i5 = 1 << i3;
            if (this.keys[i4] != null) {
                int i6 = i5 - 1;
                int tableLookupStep = tableLookupStep(i2, i6, i3);
                do {
                    i4 = (i4 + tableLookupStep) & i6;
                } while (this.keys[i4] != null);
            }
            this.keys[i4] = obj;
            this.values[i5 + i4] = i;
            this.occupiedCount++;
            this.keyCount++;
            return i4;
        }

        private void rehashTable() {
            if (this.keys == null) {
                int i = 1 << this.power;
                this.keys = new Object[i];
                this.values = new int[(i * 2)];
                return;
            }
            if (this.keyCount * 2 >= this.occupiedCount) {
                this.power++;
            }
            int i2 = 1 << this.power;
            Object[] objArr = this.keys;
            int[] iArr = this.values;
            int length = objArr.length;
            this.keys = new Object[i2];
            this.values = new int[(i2 * 2)];
            int i3 = this.keyCount;
            int i4 = 0;
            this.keyCount = 0;
            this.occupiedCount = 0;
            while (i3 != 0) {
                Object obj = objArr[i4];
                if (!(obj == null || obj == DELETED)) {
                    this.values[insertNewKey(obj, iArr[length + i4])] = iArr[i4];
                    i3--;
                }
                i4++;
            }
        }

        private int ensureIndex(Object obj) {
            int i;
            int hashCode = obj.hashCode();
            Object[] objArr = this.keys;
            int i2 = -1;
            if (objArr != null) {
                int i3 = A * hashCode;
                int i4 = this.power;
                i = i3 >>> (32 - i4);
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    int i5 = 1 << i4;
                    if (obj2 != obj && (this.values[i5 + i] != hashCode || !obj2.equals(obj))) {
                        if (obj2 == DELETED) {
                            i2 = i;
                        }
                        int i6 = i5 - 1;
                        int tableLookupStep = tableLookupStep(i3, i6, this.power);
                        while (true) {
                            i = (i + tableLookupStep) & i6;
                            Object obj3 = this.keys[i];
                            if (obj3 != null) {
                                if (obj3 == obj || (this.values[i5 + i] == hashCode && obj3.equals(obj))) {
                                    break;
                                } else if (obj3 == DELETED && i2 < 0) {
                                    i2 = i;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    return i;
                }
            } else {
                i = -1;
            }
            if (i2 < 0) {
                if (this.keys != null) {
                    int i7 = this.occupiedCount;
                    if (i7 * 4 < (1 << this.power) * 3) {
                        this.occupiedCount = i7 + 1;
                        i2 = i;
                    }
                }
                rehashTable();
                return insertNewKey(obj, hashCode);
            }
            this.keys[i2] = obj;
            this.values[(1 << this.power) + i2] = hashCode;
            this.keyCount++;
            return i2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            int i = this.keyCount;
            int i2 = 0;
            while (i != 0) {
                Object obj = this.keys[i2];
                if (!(obj == null || obj == DELETED)) {
                    i--;
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.writeInt(this.values[i2]);
                }
                i2++;
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            int i = this.keyCount;
            if (i != 0) {
                this.keyCount = 0;
                int i2 = 1 << this.power;
                this.keys = new Object[i2];
                this.values = new int[(i2 * 2)];
                for (int i3 = 0; i3 != i; i3++) {
                    Object readObject = objectInputStream.readObject();
                    this.values[insertNewKey(readObject, readObject.hashCode())] = objectInputStream.readInt();
                }
            }
        }
    }

    public SimplePassword(LogUtils logUtils, Object obj, Class<?> cls) {
        this(logUtils, obj, cls, false);
    }

    public SimplePassword(LogUtils logUtils, Object obj, Class<?> cls, boolean z) {
        this.parent = logUtils;
        this.javaObject = obj;
        this.staticType = cls;
        this.isAdapter = z;
        initMembers();
    }

    /* access modifiers changed from: protected */
    public void initMembers() {
        Class<?> cls;
        Object obj = this.javaObject;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = this.staticType;
        }
        getDrawableId length = getDrawableId.length(this.parent, cls, this.staticType, this.isAdapter);
        this.members = length;
        this.fieldAndMethods = length.length(this, this.javaObject, false);
    }

    public boolean has(String str, LogUtils logUtils) {
        return this.members.getMin(str, false);
    }

    public Object get(String str, LogUtils logUtils) {
        encryptToByteArray encrypttobytearray;
        Map<String, encryptToByteArray> map = this.fieldAndMethods;
        if (map == null || (encrypttobytearray = map.get(str)) == null) {
            return this.members.setMax(this, str, this.javaObject, false);
        }
        return encrypttobytearray;
    }

    public Object get(int i, LogUtils logUtils) {
        getDrawableId getdrawableid = this.members;
        throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.java.member.not.found", (Object) getdrawableid.length.getName(), (Object) Integer.toString(i));
    }

    public void put(String str, LogUtils logUtils, Object obj) {
        if (this.prototype == null || this.members.getMin(str, false)) {
            this.members.getMin(this, str, this.javaObject, obj, false);
            return;
        }
        LogUtils logUtils2 = this.prototype;
        logUtils2.put(str, logUtils2, obj);
    }

    public void put(int i, LogUtils logUtils, Object obj) {
        getDrawableId getdrawableid = this.members;
        throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.java.member.not.found", (Object) getdrawableid.length.getName(), (Object) Integer.toString(i));
    }

    public LogUtils getPrototype() {
        if (this.prototype != null || !(this.javaObject instanceof String)) {
            return this.prototype;
        }
        return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(this.parent), TopLevel.Builtins.String);
    }

    public void setPrototype(LogUtils logUtils) {
        this.prototype = logUtils;
    }

    public LogUtils getParentScope() {
        return this.parent;
    }

    public void setParentScope(LogUtils logUtils) {
        this.parent = logUtils;
    }

    public Object[] getIds() {
        return this.members.setMax(false);
    }

    @Deprecated
    public static Object wrap(LogUtils logUtils, Object obj, Class<?> cls) {
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        if (floatRange.Grayscale$Algorithm == null) {
            floatRange.Grayscale$Algorithm = new MoneyView();
        }
        return floatRange.Grayscale$Algorithm.getMax(logUtils, obj, cls);
    }

    public Object unwrap() {
        return this.javaObject;
    }

    public Object getDefaultValue(Class<?> cls) {
        String str;
        if (cls == null && (this.javaObject instanceof Boolean)) {
            cls = LogItem.length;
        }
        if (cls == null || cls == LogItem.toString) {
            return this.javaObject.toString();
        }
        if (cls == LogItem.length) {
            str = "booleanValue";
        } else if (cls == LogItem.toIntRange) {
            str = "doubleValue";
        } else {
            throw SecureQwertyKeyboard.AnonymousClass1.setMin("msg.default.value");
        }
        Object obj = get(str, (LogUtils) this);
        if (obj instanceof doCheck) {
            doCheck docheck = (doCheck) obj;
            return docheck.call(SecureQwertyKeyboard.AnonymousClass1.toFloatRange(), docheck.getParentScope(), this, LogItem.create);
        }
        if (cls == LogItem.toIntRange) {
            Object obj2 = this.javaObject;
            if (obj2 instanceof Boolean) {
                return LogItem.getMax(((Boolean) obj2).booleanValue() ? 1.0d : 0.0d);
            }
        }
        return this.javaObject.toString();
    }

    public static boolean canConvert(Object obj, Class<?> cls) {
        return getConversionWeight(obj, cls) < 99;
    }

    static int getConversionWeight(Object obj, Class<?> cls) {
        int jSTypeCode = getJSTypeCode(obj);
        switch (jSTypeCode) {
            case 0:
                if (cls == LogItem.toString || cls == LogItem.equals) {
                    return 1;
                }
                break;
            case 1:
                if (!cls.isPrimitive()) {
                    return 1;
                }
                break;
            case 2:
                if (cls == Boolean.TYPE) {
                    return 1;
                }
                if (cls == LogItem.length) {
                    return 2;
                }
                if (cls == LogItem.equals) {
                    return 3;
                }
                if (cls == LogItem.toString) {
                    return 4;
                }
                break;
            case 3:
                if (cls.isPrimitive()) {
                    if (cls == Double.TYPE) {
                        return 1;
                    }
                    if (cls != Boolean.TYPE) {
                        return getSizeRank(cls) + 1;
                    }
                } else if (cls == LogItem.toString) {
                    return 9;
                } else {
                    if (cls == LogItem.equals) {
                        return 10;
                    }
                    if (LogItem.toIntRange.isAssignableFrom(cls)) {
                        return 2;
                    }
                }
                break;
            case 4:
                if (cls == LogItem.toString) {
                    return 1;
                }
                if (cls.isInstance(obj)) {
                    return 2;
                }
                if (cls.isPrimitive()) {
                    if (cls == Character.TYPE) {
                        return 3;
                    }
                    if (cls != Boolean.TYPE) {
                        return 4;
                    }
                }
                break;
            case 5:
                if (cls == LogItem.setMin) {
                    return 1;
                }
                if (cls == LogItem.equals) {
                    return 3;
                }
                if (cls == LogItem.toString) {
                    return 4;
                }
                break;
            case 6:
            case 7:
                if (obj instanceof UniResultF2fpayOrderInfo) {
                    obj = ((UniResultF2fpayOrderInfo) obj).unwrap();
                }
                if (cls.isInstance(obj)) {
                    return 0;
                }
                if (cls == LogItem.toString) {
                    return 2;
                }
                if (!cls.isPrimitive() || cls == Boolean.TYPE || jSTypeCode == 7) {
                    return 99;
                }
                return getSizeRank(cls) + 2;
            case 8:
                if (cls != LogItem.equals && cls.isInstance(obj)) {
                    return 1;
                }
                if (cls.isArray()) {
                    if (obj instanceof getResourceDeclareStyleableIntArray) {
                        return 2;
                    }
                } else if (cls == LogItem.equals) {
                    return 3;
                } else {
                    if (cls == LogItem.toString) {
                        return 4;
                    }
                    if (cls == LogItem.FastBitmap$CoordinateSystem) {
                        if (obj instanceof AutoSubmitInterface) {
                            return 1;
                        }
                    } else if (cls.isInterface()) {
                        if (obj instanceof setNeedComfirm) {
                            return 1;
                        }
                        if (obj instanceof setmSubmitInterface) {
                            return 2;
                        }
                        return 12;
                    } else if (cls.isPrimitive() && cls != Boolean.TYPE) {
                        return getSizeRank(cls) + 4;
                    }
                }
                break;
        }
        return 99;
    }

    static int getSizeRank(Class<?> cls) {
        if (cls == Double.TYPE) {
            return 1;
        }
        if (cls == Float.TYPE) {
            return 2;
        }
        if (cls == Long.TYPE) {
            return 3;
        }
        if (cls == Integer.TYPE) {
            return 4;
        }
        if (cls == Short.TYPE) {
            return 5;
        }
        if (cls == Character.TYPE) {
            return 6;
        }
        if (cls == Byte.TYPE) {
            return 7;
        }
        return cls == Boolean.TYPE ? 99 : 8;
    }

    private static int getJSTypeCode(Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj == checkOpen.instance) {
            return 0;
        }
        if (obj instanceof CharSequence) {
            return 4;
        }
        if (obj instanceof Number) {
            return 3;
        }
        if (obj instanceof Boolean) {
            return 2;
        }
        if (obj instanceof LogUtils) {
            if (obj instanceof initPwdInputView) {
                return 5;
            }
            if (obj instanceof SafeInputWidget.AnonymousClass1) {
                return 7;
            }
            if (obj instanceof UniResultF2fpayOrderInfo) {
                return 6;
            }
            return 8;
        } else if (obj instanceof Class) {
            return 5;
        } else {
            return obj.getClass().isArray() ? 7 : 6;
        }
    }

    @Deprecated
    public static Object coerceType(Class<?> cls, Object obj) {
        return coerceTypeImpl(cls, obj);
    }

    static Object coerceTypeImpl(Class<?> cls, Object obj) {
        if (obj != null && obj.getClass() == cls) {
            return obj;
        }
        switch (getJSTypeCode(obj)) {
            case 0:
                if (cls != LogItem.toString && cls != LogItem.equals) {
                    reportConversionError("undefined", cls);
                    break;
                } else {
                    return "undefined";
                }
            case 1:
                if (!cls.isPrimitive()) {
                    return null;
                }
                reportConversionError(obj, cls);
                return null;
            case 2:
                if (cls != Boolean.TYPE && cls != LogItem.length && cls != LogItem.equals) {
                    if (cls != LogItem.toString) {
                        reportConversionError(obj, cls);
                        break;
                    } else {
                        return obj.toString();
                    }
                } else {
                    return obj;
                }
                break;
            case 3:
                if (cls == LogItem.toString) {
                    return LogItem.getMin(obj);
                }
                if (cls == LogItem.equals) {
                    if (!SecureQwertyKeyboard.AnonymousClass1.setMin().getMax(18) || ((double) Math.round(toDouble(obj))) != toDouble(obj)) {
                        return coerceToNumber(Double.TYPE, obj);
                    }
                    return coerceToNumber(Long.TYPE, obj);
                } else if ((!cls.isPrimitive() || cls == Boolean.TYPE) && !LogItem.toIntRange.isAssignableFrom(cls)) {
                    reportConversionError(obj, cls);
                    break;
                } else {
                    return coerceToNumber(cls, obj);
                }
                break;
            case 4:
                if (cls == LogItem.toString || cls.isInstance(obj)) {
                    return obj.toString();
                }
                if (cls == Character.TYPE || cls == LogItem.setMax) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() == 1) {
                        return Character.valueOf(charSequence.charAt(0));
                    }
                    return coerceToNumber(cls, obj);
                } else if ((!cls.isPrimitive() || cls == Boolean.TYPE) && !LogItem.toIntRange.isAssignableFrom(cls)) {
                    reportConversionError(obj, cls);
                    break;
                } else {
                    return coerceToNumber(cls, obj);
                }
                break;
            case 5:
                if (obj instanceof UniResultF2fpayOrderInfo) {
                    obj = ((UniResultF2fpayOrderInfo) obj).unwrap();
                }
                if (cls != LogItem.setMin && cls != LogItem.equals) {
                    if (cls != LogItem.toString) {
                        reportConversionError(obj, cls);
                        break;
                    } else {
                        return obj.toString();
                    }
                } else {
                    return obj;
                }
                break;
            case 6:
            case 7:
                if (obj instanceof UniResultF2fpayOrderInfo) {
                    obj = ((UniResultF2fpayOrderInfo) obj).unwrap();
                }
                if (!cls.isPrimitive()) {
                    if (cls != LogItem.toString) {
                        if (!cls.isInstance(obj)) {
                            reportConversionError(obj, cls);
                            break;
                        } else {
                            return obj;
                        }
                    } else {
                        return obj.toString();
                    }
                } else {
                    if (cls == Boolean.TYPE) {
                        reportConversionError(obj, cls);
                    }
                    return coerceToNumber(cls, obj);
                }
            case 8:
                if (cls == LogItem.toString) {
                    return LogItem.getMin(obj);
                }
                if (cls.isPrimitive()) {
                    if (cls == Boolean.TYPE) {
                        reportConversionError(obj, cls);
                    }
                    return coerceToNumber(cls, obj);
                } else if (cls.isInstance(obj)) {
                    return obj;
                } else {
                    if (cls == LogItem.FastBitmap$CoordinateSystem && (obj instanceof AutoSubmitInterface)) {
                        return new Date((long) ((AutoSubmitInterface) obj).getJSTimeValue());
                    }
                    if (cls.isArray() && (obj instanceof getResourceDeclareStyleableIntArray)) {
                        getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = (getResourceDeclareStyleableIntArray) obj;
                        long length = getresourcedeclarestyleableintarray.getLength();
                        Class<?> componentType = cls.getComponentType();
                        Object newInstance = Array.newInstance(componentType, (int) length);
                        for (int i = 0; ((long) i) < length; i++) {
                            try {
                                Array.set(newInstance, i, coerceTypeImpl(componentType, getresourcedeclarestyleableintarray.get(i, (LogUtils) getresourcedeclarestyleableintarray)));
                            } catch (EvaluatorException unused) {
                                reportConversionError(obj, cls);
                            }
                        }
                        return newInstance;
                    } else if (obj instanceof UniResultF2fpayOrderInfo) {
                        obj = ((UniResultF2fpayOrderInfo) obj).unwrap();
                        if (!cls.isInstance(obj)) {
                            reportConversionError(obj, cls);
                            break;
                        } else {
                            return obj;
                        }
                    } else if (!cls.isInterface() || (!(obj instanceof setmSubmitInterface) && !(obj instanceof setNeedComfirm))) {
                        reportConversionError(obj, cls);
                        break;
                    } else {
                        return createInterfaceAdapter(cls, (ScriptableObject) obj);
                    }
                }
                break;
        }
        return obj;
    }

    protected static Object createInterfaceAdapter(Class<?> cls, ScriptableObject scriptableObject) {
        Object min = getStyleId.setMin(COERCED_INTERFACE_KEY, cls);
        Object associatedValue = scriptableObject.getAssociatedValue(min);
        if (associatedValue != null) {
            return associatedValue;
        }
        return scriptableObject.associateValue(min, getAnimId.setMin(SecureQwertyKeyboard.AnonymousClass1.toFloatRange(), cls, scriptableObject));
    }

    private static Object coerceToNumber(Class<?> cls, Object obj) {
        Class<?> cls2 = obj.getClass();
        if (cls == Character.TYPE || cls == LogItem.setMax) {
            if (cls2 == LogItem.setMax) {
                return obj;
            }
            return Character.valueOf((char) ((int) toInteger(obj, LogItem.setMax, 0.0d, 65535.0d)));
        } else if (cls == LogItem.equals || cls == LogItem.getMin || cls == Double.TYPE) {
            if (cls2 == LogItem.getMin) {
                return obj;
            }
            return new Double(toDouble(obj));
        } else if (cls == LogItem.isInside || cls == Float.TYPE) {
            if (cls2 == LogItem.isInside) {
                return obj;
            }
            double d = toDouble(obj);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                double d2 = 0.0d;
                if (d != 0.0d) {
                    double abs = Math.abs(d);
                    if (abs < 1.401298464324817E-45d) {
                        if (d <= 0.0d) {
                            d2 = -0.0d;
                        }
                        return new Float(d2);
                    } else if (abs <= 3.4028234663852886E38d) {
                        return new Float((float) d);
                    } else {
                        return new Float(d > 0.0d ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY);
                    }
                }
            }
            return new Float((float) d);
        } else if (cls == LogItem.toFloatRange || cls == Integer.TYPE) {
            if (cls2 == LogItem.toFloatRange) {
                return obj;
            }
            return Integer.valueOf((int) toInteger(obj, LogItem.toFloatRange, -2.147483648E9d, 2.147483647E9d));
        } else if (cls == LogItem.IsOverlapping || cls == Long.TYPE) {
            if (cls2 == LogItem.IsOverlapping) {
                return obj;
            }
            return Long.valueOf(toInteger(obj, LogItem.IsOverlapping, Double.longBitsToDouble(-4332462841530417152L), Double.longBitsToDouble(4890909195324358655L)));
        } else if (cls == LogItem.hashCode || cls == Short.TYPE) {
            if (cls2 == LogItem.hashCode) {
                return obj;
            }
            return Short.valueOf((short) ((int) toInteger(obj, LogItem.hashCode, -32768.0d, 32767.0d)));
        } else if (cls != LogItem.getMax && cls != Byte.TYPE) {
            return new Double(toDouble(obj));
        } else {
            if (cls2 == LogItem.getMax) {
                return obj;
            }
            return Byte.valueOf((byte) ((int) toInteger(obj, LogItem.getMax, -128.0d, 127.0d)));
        }
    }

    private static double toDouble(Object obj) {
        Method method;
        while (!(obj instanceof Number)) {
            if (obj instanceof String) {
                return LogItem.setMin((String) obj);
            }
            if (!(obj instanceof LogUtils)) {
                try {
                    method = obj.getClass().getMethod("doubleValue", (Class[]) null);
                } catch (NoSuchMethodException | SecurityException unused) {
                    method = null;
                }
                if (method != null) {
                    try {
                        return ((Number) method.invoke(obj, (Object[]) null)).doubleValue();
                    } catch (IllegalAccessException unused2) {
                        reportConversionError(obj, Double.TYPE);
                    } catch (InvocationTargetException unused3) {
                        reportConversionError(obj, Double.TYPE);
                    }
                }
                return LogItem.setMin(obj.toString());
            } else if (!(obj instanceof UniResultF2fpayOrderInfo)) {
                return LogItem.getMax(obj);
            } else {
                obj = ((UniResultF2fpayOrderInfo) obj).unwrap();
            }
        }
        return ((Number) obj).doubleValue();
    }

    private static long toInteger(Object obj, Class<?> cls, double d, double d2) {
        double d3;
        double d4 = toDouble(obj);
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            reportConversionError(LogItem.getMin(obj), cls);
        }
        if (d4 > 0.0d) {
            d3 = Math.floor(d4);
        } else {
            d3 = Math.ceil(d4);
        }
        if (d3 < d || d3 > d2) {
            reportConversionError(LogItem.getMin(obj), cls);
        }
        return (long) d3;
    }

    static void reportConversionError(Object obj, Class<?> cls) {
        throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.conversion.not.allowed", (Object) String.valueOf(obj), (Object) getDrawableId.getMin(cls));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeBoolean(this.isAdapter);
        if (this.isAdapter) {
            Method method = adapter_writeAdapterObject;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{this.javaObject, objectOutputStream});
                } catch (Exception unused) {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        } else {
            objectOutputStream.writeObject(this.javaObject);
        }
        Class<?> cls = this.staticType;
        if (cls != null) {
            objectOutputStream.writeObject(cls.getClass().getName());
        } else {
            objectOutputStream.writeObject((Object) null);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        boolean readBoolean = objectInputStream.readBoolean();
        this.isAdapter = readBoolean;
        if (readBoolean) {
            Method method = adapter_readAdapterObject;
            if (method != null) {
                try {
                    this.javaObject = method.invoke((Object) null, new Object[]{this, objectInputStream});
                } catch (Exception unused) {
                    throw new IOException();
                }
            } else {
                throw new ClassNotFoundException();
            }
        } else {
            this.javaObject = objectInputStream.readObject();
        }
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.staticType = Class.forName(str);
        } else {
            this.staticType = null;
        }
        initMembers();
    }

    static {
        Class[] clsArr = new Class[2];
        Class<?> max = getStyleId.getMax("o.getStringId");
        if (max != null) {
            try {
                clsArr[0] = LogItem.equals;
                clsArr[1] = getStyleId.getMax("java.io.ObjectOutputStream");
                adapter_writeAdapterObject = max.getMethod("writeAdapterObject", clsArr);
                clsArr[0] = LogItem.valueOf;
                clsArr[1] = getStyleId.getMax("java.io.ObjectInputStream");
                adapter_readAdapterObject = max.getMethod("readAdapterObject", clsArr);
            } catch (NoSuchMethodException unused) {
                adapter_writeAdapterObject = null;
                adapter_readAdapterObject = null;
            }
        }
    }
}
