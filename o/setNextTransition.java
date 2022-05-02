package o;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

public final class setNextTransition implements Comparator {
    public static final setNextTransition getMax = new setNextTransition();

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
    }
}
