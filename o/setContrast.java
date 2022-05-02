package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.InputStream;
import o.ConstraintAnchor$Type;
import o.SolverVariable$Type;

public final class setContrast implements SolverVariable$Type<access$1400, InputStream> {
    public static final setTranslationX<Integer> length = setTranslationX.setMin("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));
    @Nullable
    private final ConstraintAnchor$Type<access$1400, access$1400> setMax;

    public final /* bridge */ /* synthetic */ boolean getMin(@NonNull Object obj) {
        return true;
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        access$1400 access_1400 = (access$1400) obj;
        ConstraintAnchor$Type<access$1400, access$1400> constraintAnchor$Type = this.setMax;
        if (constraintAnchor$Type != null) {
            access$1400 length2 = constraintAnchor$Type.length(access_1400);
            if (length2 == null) {
                this.setMax.setMax.length(ConstraintAnchor$Type.getMin.setMin(access_1400), access_1400);
            } else {
                access_1400 = length2;
            }
        }
        setTranslationX<Integer> settranslationx = length;
        return new SolverVariable$Type.setMax(access_1400, new getNanoTime(access_1400, ((Integer) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax)).intValue()));
    }

    public setContrast() {
        this((ConstraintAnchor$Type<access$1400, access$1400>) null);
    }

    public setContrast(@Nullable ConstraintAnchor$Type<access$1400, access$1400> constraintAnchor$Type) {
        this.setMax = constraintAnchor$Type;
    }

    public static class setMin implements access$1900<access$1400, InputStream> {
        private final ConstraintAnchor$Type<access$1400, access$1400> getMin = new ConstraintAnchor$Type<>(500);

        @NonNull
        public final SolverVariable$Type<access$1400, InputStream> getMax(setSaturation setsaturation) {
            return new setContrast(this.getMin);
        }
    }
}
