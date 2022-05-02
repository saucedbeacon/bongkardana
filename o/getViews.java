package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

public final class getViews implements setElevation<Bitmap, Bitmap> {
    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return true;
    }

    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        return new getMin((Bitmap) obj);
    }

    static final class getMin implements fireTrigger<Bitmap> {
        private final Bitmap setMin;

        public final void length() {
        }

        getMin(@NonNull Bitmap bitmap) {
            this.setMin = bitmap;
        }

        @NonNull
        public final Class<Bitmap> getMin() {
            return Bitmap.class;
        }

        public final int setMax() {
            return getDependents.getMin(this.setMin);
        }

        @NonNull
        public final /* bridge */ /* synthetic */ Object setMin() {
            return this.setMin;
        }
    }
}
