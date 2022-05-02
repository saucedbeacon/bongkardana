package o;

import com.google.android.exoplayer2.util.Predicate;

public final class setAnimations implements Predicate {
    public static final setAnimations setMax = new setAnimations();

    public final boolean evaluate(Object obj) {
        return ensureAnimationInfo.lambda$static$0((String) obj);
    }
}
