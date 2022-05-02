package o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import o.SolverVariable$Type;
import o.touchAnimateTo;

public final class setCrossfade implements SolverVariable$Type<Uri, InputStream> {
    private final Context setMin;

    public final /* synthetic */ boolean getMin(@NonNull Object obj) {
        return setMax((Uri) obj);
    }

    public final /* synthetic */ SolverVariable$Type.setMax setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
        Uri uri = (Uri) obj;
        if (!setTransitionState.getMin(i, i2)) {
            return null;
        }
        layoutChild layoutchild = new layoutChild(uri);
        Context context = this.setMin;
        return new SolverVariable$Type.setMax(layoutchild, touchAnimateTo.getMin(context, uri, new touchAnimateTo.setMin(context.getContentResolver())));
    }

    public setCrossfade(Context context) {
        this.setMin = context.getApplicationContext();
    }

    private static boolean setMax(@NonNull Uri uri) {
        return setTransitionState.setMax(uri);
    }

    public static class getMin implements access$1900<Uri, InputStream> {
        private final Context length;

        public getMin(Context context) {
            this.length = context;
        }

        @NonNull
        public final SolverVariable$Type<Uri, InputStream> getMax(setSaturation setsaturation) {
            return new setCrossfade(this.length);
        }
    }
}
