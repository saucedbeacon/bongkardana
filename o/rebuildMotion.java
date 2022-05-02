package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public class rebuildMotion implements rebuildScene {
    public final void getMax() {
    }

    public final void setMin(int i) {
    }

    public void setMin(Bitmap bitmap) {
        bitmap.recycle();
    }

    @NonNull
    public final Bitmap setMin(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    public final Bitmap setMax(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
