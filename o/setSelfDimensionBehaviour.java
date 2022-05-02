package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

public final class setSelfDimensionBehaviour implements setConstraintSet<Bitmap, byte[]> {
    private final Bitmap.CompressFormat getMin;
    private final int setMax;

    public setSelfDimensionBehaviour() {
        this(Bitmap.CompressFormat.JPEG);
    }

    private setSelfDimensionBehaviour(@NonNull Bitmap.CompressFormat compressFormat) {
        this.getMin = compressFormat;
        this.setMax = 100;
    }

    @Nullable
    public final fireTrigger<byte[]> length(@NonNull fireTrigger<Bitmap> firetrigger, @NonNull MotionHelper motionHelper) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        firetrigger.setMin().compress(this.getMin, this.setMax, byteArrayOutputStream);
        firetrigger.length();
        return new ConstraintLayout(byteArrayOutputStream.toByteArray());
    }
}
