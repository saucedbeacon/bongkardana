package o;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.SolverVariable$Type;

public final class setWarmth implements SolverVariable$Type<Uri, InputStream> {
    private static final Set<String> getMin = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final SolverVariable$Type<access$1400, InputStream> setMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return getMin((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(2081949530, oncanceled);
            onCancelLoad.getMin(2081949530, oncanceled);
        }
        return this.setMax.setMin(new access$1400(((Uri) obj).toString()), i, i2, motionHelper);
    }

    public setWarmth(SolverVariable$Type<access$1400, InputStream> solverVariable$Type) {
        this.setMax = solverVariable$Type;
    }

    private static boolean getMin(@NonNull Uri uri) {
        return getMin.contains(uri.getScheme());
    }

    public static class setMax implements access$1900<Uri, InputStream> {
        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new setWarmth(setsaturation.length(access$1400.class, InputStream.class));
        }
    }
}
