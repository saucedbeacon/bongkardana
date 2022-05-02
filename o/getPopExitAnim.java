package o;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

public final class getPopExitAnim implements Comparator {
    public static final getPopExitAnim getMin = new getPopExitAnim();

    public final int compare(Object obj, Object obj2) {
        return SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
    }
}
