package o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import o.SolverVariable$Type;
import o.touchAnimateTo;

public final class setRoundPercent implements SolverVariable$Type<Uri, InputStream> {
    private final Context setMin;

    public final /* synthetic */ boolean getMin(@NonNull Object obj) {
        return setMax((Uri) obj);
    }

    @Nullable
    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        if (!setTransitionState.getMin(i, i2) || !getMax(motionHelper)) {
            return null;
        }
        layoutChild layoutchild = new layoutChild(uri);
        Context context = this.setMin;
        return new SolverVariable$Type.setMax(layoutchild, touchAnimateTo.getMin(context, uri, new touchAnimateTo.setMax(context.getContentResolver())));
    }

    public setRoundPercent(Context context) {
        this.setMin = context.getApplicationContext();
    }

    private static boolean getMax(MotionHelper motionHelper) {
        setTranslationX<Long> settranslationx = setDesignInformation.setMin;
        Long l = (Long) (motionHelper.length.containsKey(settranslationx) ? motionHelper.length.get(settranslationx) : settranslationx.getMax);
        return l != null && l.longValue() == -1;
    }

    private static boolean setMax(@NonNull Uri uri) {
        return setTransitionState.length(uri);
    }

    public static class getMax implements access$1900<Uri, InputStream> {
        private final Context getMax;

        public getMax(Context context) {
            this.getMax = context;
        }

        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new setRoundPercent(this.getMax);
        }
    }
}
