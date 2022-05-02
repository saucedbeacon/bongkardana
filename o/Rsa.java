package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public abstract class Rsa extends setUiContext {
    public static final String DONE_PROPERTY = "done";
    private static final int Id_iterator = 2;
    private static final int Id_next = 1;
    private static final int Id_toStringTag = 3;
    private static final int MAX_PROTOTYPE_ID = 3;
    public static final String NEXT_METHOD = "next";
    public static final String VALUE_PROPERTY = "value";
    protected boolean exhausted = false;

    /* access modifiers changed from: protected */
    public abstract String getTag();

    /* access modifiers changed from: protected */
    public abstract boolean isDone(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils);

    /* access modifiers changed from: protected */
    public abstract Object nextValue(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils);

    static void init(ScriptableObject scriptableObject, boolean z, setUiContext setuicontext, String str) {
        if (scriptableObject != null) {
            setuicontext.setParentScope(scriptableObject);
            setuicontext.setPrototype(getObjectPrototype(scriptableObject));
        }
        setuicontext.activatePrototypeMap(3);
        if (z) {
            setuicontext.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(str, setuicontext);
        }
    }

    Rsa() {
    }

    Rsa(LogUtils logUtils) {
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        setParentScope(topLevelScope);
        setPrototype((setUiContext) ScriptableObject.getTopScopeValue(topLevelScope, getTag()));
    }

    /* access modifiers changed from: protected */
    public void initPrototypeId(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1992058458, oncanceled);
            onCancelLoad.getMin(1992058458, oncanceled);
        }
        if (i == 1) {
            initPrototypeMethod(getTag(), i, "next", 0);
        } else if (i == 2) {
            initPrototypeMethod((Object) getTag(), i, (record) F2fpaySwitchFacade.ITERATOR, "[Symbol.iterator]", 0);
        } else if (i == 3) {
            initPrototypeValue(3, (record) F2fpaySwitchFacade.TO_STRING_TAG, (Object) getClassName(), 3);
        } else {
            throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(getTag())) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (logUtils2 instanceof Rsa) {
            Rsa rsa = (Rsa) logUtils2;
            if (methodId == 1) {
                return rsa.next(r3, logUtils);
            }
            if (methodId == 2) {
                return rsa;
            }
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        throw incompatibleCallError(editTextUtil);
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(record record) {
        if (F2fpaySwitchFacade.ITERATOR.equals(record)) {
            return 2;
        }
        return F2fpaySwitchFacade.TO_STRING_TAG.equals(record) ? 3 : 0;
    }

    /* access modifiers changed from: protected */
    public int findPrototypeId(String str) {
        return "next".equals(str) ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public Object next(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils) {
        Object obj = checkOpen.instance;
        boolean z = isDone(r4, logUtils) || this.exhausted;
        if (!z) {
            obj = nextValue(r4, logUtils);
        } else {
            this.exhausted = true;
        }
        return makeIteratorResult(r4, logUtils, z, obj);
    }

    private LogUtils makeIteratorResult(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, boolean z, Object obj) {
        LogUtils min = SecureQwertyKeyboard.AnonymousClass1.getMin(logUtils);
        ScriptableObject.putProperty(min, "value", obj);
        ScriptableObject.putProperty(min, DONE_PROPERTY, (Object) Boolean.valueOf(z));
        return min;
    }
}
