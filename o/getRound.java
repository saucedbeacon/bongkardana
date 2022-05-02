package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

public final class getRound<DataType> implements setElevation<DataType, BitmapDrawable> {
    private final setElevation<DataType, Bitmap> getMin;
    private final Resources length;

    public getRound(@NonNull Resources resources, @NonNull setElevation<DataType, Bitmap> setelevation) {
        if (resources != null) {
            this.length = resources;
            if (setelevation != null) {
                this.getMin = setelevation;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final boolean length(@NonNull DataType datatype, @NonNull MotionHelper motionHelper) throws IOException {
        return this.getMin.length(datatype, motionHelper);
    }

    public final fireTrigger<BitmapDrawable> getMax(@NonNull DataType datatype, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        fireTrigger<Bitmap> max = this.getMin.getMax(datatype, i, i2, motionHelper);
        Resources resources = this.length;
        if (max == null) {
            return null;
        }
        return new validateParams(resources, max);
    }
}
