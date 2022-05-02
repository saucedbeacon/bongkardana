package o;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import o.SecureQwertyKeyboard;
import o.SecureTextView;

public abstract class INotProguard {
    static final INotProguard setMin;

    /* access modifiers changed from: protected */
    public abstract boolean getMax(AccessibleObject accessibleObject);

    /* access modifiers changed from: protected */
    public abstract Object getMin(Object obj, SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener, getAnimId getanimid, Object obj2, LogUtils logUtils);

    /* access modifiers changed from: protected */
    public abstract SecureQwertyKeyboard.AnonymousClass1 getMin(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object length();

    /* access modifiers changed from: protected */
    public abstract Object length(Class<?>[] clsArr);

    /* access modifiers changed from: protected */
    public abstract void length(Object obj, SecureQwertyKeyboard.AnonymousClass1 r2);

    /* access modifiers changed from: protected */
    public abstract Iterator<?> setMin(Object obj);

    static {
        INotProguard iNotProguard;
        String[] strArr = {"org.mozilla.javascript.VMBridge_custom", "org.mozilla.javascript.jdk18.VMBridge_jdk18", "org.mozilla.javascript.jdk15.VMBridge_jdk15"};
        int i = 0;
        while (i != 3) {
            Class<?> max = getStyleId.getMax(strArr[i]);
            if (max == null || (iNotProguard = (INotProguard) getStyleId.getMin(max)) == null) {
                i++;
            } else {
                setMin = iNotProguard;
                return;
            }
        }
        throw new IllegalStateException("Failed to create VMBridge instance");
    }
}
