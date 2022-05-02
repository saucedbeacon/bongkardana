package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public final class setPointView extends Rsa {
    private static final String ITERATOR_TAG = "StringIterator";
    private static final long serialVersionUID = 1;
    private int index;
    private String string;

    public final String getClassName() {
        return "String Iterator";
    }

    /* access modifiers changed from: protected */
    public final String getTag() {
        return ITERATOR_TAG;
    }

    static void init(ScriptableObject scriptableObject, boolean z) {
        Rsa.init(scriptableObject, z, new setPointView(), ITERATOR_TAG);
    }

    private setPointView() {
    }

    setPointView(LogUtils logUtils, LogUtils logUtils2) {
        super(logUtils);
        this.index = 0;
        this.string = LogItem.getMin((Object) logUtils2);
    }

    /* access modifiers changed from: protected */
    public final boolean isDone(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils) {
        return this.index >= this.string.length();
    }

    /* access modifiers changed from: protected */
    public final Object nextValue(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils) {
        int offsetByCodePoints = this.string.offsetByCodePoints(this.index, 1);
        String substring = this.string.substring(this.index, offsetByCodePoints);
        this.index = offsetByCodePoints;
        return substring;
    }
}
