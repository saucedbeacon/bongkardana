package o;

import java.util.Iterator;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.ScriptableObject;

public final class setCleanIcon extends setUiContext {
    public static final String ITERATOR_PROPERTY_NAME = "__iterator__";
    private static final Object ITERATOR_TAG = "Iterator";
    private static final int Id___iterator__ = 3;
    private static final int Id_constructor = 1;
    private static final int Id_next = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STOP_ITERATION = "StopIteration";
    private static final long serialVersionUID = -4136968203581667681L;
    private Object objectIterator;

    public final String getClassName() {
        return "Iterator";
    }

    static void init(ScriptableObject scriptableObject, boolean z) {
        new setCleanIcon().exportAsJSClass(3, scriptableObject, z);
        NativeGenerator.init(scriptableObject, z);
        getMin getmin = new getMin();
        getmin.setPrototype(getObjectPrototype(scriptableObject));
        getmin.setParentScope(scriptableObject);
        if (z) {
            getmin.sealObject();
        }
        ScriptableObject.defineProperty(scriptableObject, STOP_ITERATION, getmin, 2);
        scriptableObject.associateValue(ITERATOR_TAG, getmin);
    }

    private setCleanIcon() {
    }

    private setCleanIcon(Object obj) {
        this.objectIterator = obj;
    }

    public static Object getStopIterationObject(LogUtils logUtils) {
        return ScriptableObject.getTopScopeValue(ScriptableObject.getTopLevelScope(logUtils), ITERATOR_TAG);
    }

    static class getMin extends setmSubmitInterface {
        private static final long serialVersionUID = 2485151085722377663L;

        public final String getClassName() {
            return setCleanIcon.STOP_ITERATION;
        }

        getMin() {
        }

        public final boolean hasInstance(LogUtils logUtils) {
            return logUtils instanceof getMin;
        }
    }

    /* access modifiers changed from: protected */
    public final void initPrototypeId(int i) {
        String str;
        int i2 = 1;
        if (i == 1) {
            str = "constructor";
            i2 = 2;
        } else if (i == 2) {
            str = "next";
            i2 = 0;
        } else if (i == 3) {
            str = ITERATOR_PROPERTY_NAME;
        } else {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        initPrototypeMethod(ITERATOR_TAG, i, str, i2);
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(ITERATOR_TAG)) {
            return super.execIdCall(editTextUtil, r4, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (methodId == 1) {
            return jsConstructor(r4, logUtils, logUtils2, objArr);
        }
        if (logUtils2 instanceof setCleanIcon) {
            setCleanIcon setcleanicon = (setCleanIcon) logUtils2;
            if (methodId == 2) {
                return setcleanicon.next(r4, logUtils);
            }
            if (methodId == 3) {
                return logUtils2;
            }
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        throw incompatibleCallError(editTextUtil);
    }

    private static Object jsConstructor(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        boolean z = false;
        if (objArr.length == 0 || objArr[0] == null || objArr[0] == checkOpen.instance) {
            throw LogItem.length("msg.no.properties", (Object) LogItem.getMin(objArr.length == 0 ? checkOpen.instance : objArr[0]));
        }
        LogUtils min = LogItem.setMin(r4, logUtils, objArr[0]);
        if (objArr.length > 1 && LogItem.setMax(objArr[1])) {
            z = true;
        }
        if (logUtils2 != null) {
            Iterator<?> min2 = INotProguard.setMin.setMin(min);
            if (min2 != null) {
                LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
                if (r4.Grayscale$Algorithm == null) {
                    r4.Grayscale$Algorithm = new MoneyView();
                }
                return r4.Grayscale$Algorithm.getMax(topLevelScope, new setMax(min2, topLevelScope), setMax.class);
            }
            LogUtils max = LogItem.getMax(r4, logUtils, min, z);
            if (max != null) {
                return max;
            }
        }
        Object max2 = LogItem.setMax((Object) min, r4, logUtils, z ? 3 : 5);
        LogItem.isInside(max2);
        setCleanIcon setcleanicon = new setCleanIcon(max2);
        setcleanicon.setPrototype(ScriptableObject.getClassPrototype(logUtils, setcleanicon.getClassName()));
        setcleanicon.setParentScope(logUtils);
        return setcleanicon;
    }

    private Object next(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils) {
        if (LogItem.FastBitmap$CoordinateSystem(this.objectIterator).booleanValue()) {
            return LogItem.getMin(this.objectIterator, r3);
        }
        throw new JavaScriptException(getStopIterationObject(logUtils), (String) null, 0);
    }

    public static class setMax {
        private Iterator<?> setMax;
        private LogUtils setMin;

        setMax(Iterator<?> it, LogUtils logUtils) {
            this.setMax = it;
            this.setMin = logUtils;
        }
    }

    /* access modifiers changed from: protected */
    public final int findPrototypeId(String str) {
        String str2;
        int i;
        int length = str.length();
        if (length == 4) {
            i = 2;
            str2 = "next";
        } else if (length == 11) {
            i = 1;
            str2 = "constructor";
        } else if (length == 12) {
            i = 3;
            str2 = ITERATOR_PROPERTY_NAME;
        } else {
            str2 = null;
            i = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i;
        }
        return 0;
    }
}
