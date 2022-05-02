package o;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.SolverVariable$Type;

public final class getWarmth<Data> implements SolverVariable$Type<Uri, Data> {
    private static final Set<String> setMin = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final SolverVariable$Type<access$1400, Data> setMax;

    public final /* synthetic */ boolean getMin(@NonNull Object obj) {
        return setMax((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        return this.setMax.setMin(new access$1400(((Uri) obj).toString()), i, i2, motionHelper);
    }

    public getWarmth(SolverVariable$Type<access$1400, Data> solverVariable$Type) {
        this.setMax = solverVariable$Type;
    }

    private static boolean setMax(@NonNull Uri uri) {
        return setMin.contains(uri.getScheme());
    }

    public static class setMax implements access$1900<Uri, InputStream> {
        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new getWarmth(setsaturation.length(access$1400.class, InputStream.class));
        }
    }
}
