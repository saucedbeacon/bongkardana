package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public final class getXmlId extends Rsa {
    private static final String ITERATOR_TAG = "ArrayIterator";
    private static final long serialVersionUID = 1;
    private LogUtils arrayLike;
    private int index;

    public final String getClassName() {
        return "Array Iterator";
    }

    /* access modifiers changed from: protected */
    public final String getTag() {
        return ITERATOR_TAG;
    }

    static void init(ScriptableObject scriptableObject, boolean z) {
        Rsa.init(scriptableObject, z, new getXmlId(), ITERATOR_TAG);
    }

    private getXmlId() {
    }

    public getXmlId(LogUtils logUtils, LogUtils logUtils2) {
        super(logUtils);
        this.index = 0;
        this.arrayLike = logUtils2;
    }

    /* access modifiers changed from: protected */
    public final boolean isDone(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils) {
        return ((long) this.index) >= getResourceDeclareStyleableIntArray.getLengthProperty(r4, this.arrayLike);
    }

    /* access modifiers changed from: protected */
    public final Object nextValue(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils) {
        LogUtils logUtils2 = this.arrayLike;
        int i = this.index;
        this.index = i + 1;
        Object obj = logUtils2.get(i, logUtils2);
        return obj == ScriptableObject.getMax ? checkOpen.instance : obj;
    }
}
