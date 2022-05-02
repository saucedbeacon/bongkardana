package o;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import o.SolverVariable$Type;

public final class setRound implements SolverVariable$Type<URL, InputStream> {
    private final SolverVariable$Type<access$1400, InputStream> setMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        return this.setMax.setMin(new access$1400((URL) obj), i, i2, motionHelper);
    }

    public setRound(SolverVariable$Type<access$1400, InputStream> solverVariable$Type) {
        this.setMax = solverVariable$Type;
    }

    public static class getMax implements access$1900<URL, InputStream> {
        @NonNull
        public final SolverVariable$Type<URL, InputStream> getMax(setSaturation setsaturation) {
            return new setRound(setsaturation.length(access$1400.class, InputStream.class));
        }
    }
}
