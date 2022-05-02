package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public interface rebuildScene {
    void getMax();

    @NonNull
    Bitmap setMax(int i, int i2, Bitmap.Config config);

    @NonNull
    Bitmap setMin(int i, int i2, Bitmap.Config config);

    void setMin(int i);

    void setMin(Bitmap bitmap);
}
