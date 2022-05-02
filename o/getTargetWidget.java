package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;

public final class getTargetWidget implements GifDecoder.setMax {
    @Nullable
    private final setOnHide getMin;
    private final rebuildScene length;

    public getTargetWidget(rebuildScene rebuildscene, @Nullable setOnHide setonhide) {
        this.length = rebuildscene;
        this.getMin = setonhide;
    }

    @NonNull
    public final Bitmap getMin(int i, int i2, @NonNull Bitmap.Config config) {
        return this.length.setMax(i, i2, config);
    }

    public final void getMax(@NonNull Bitmap bitmap) {
        this.length.setMin(bitmap);
    }

    @NonNull
    public final byte[] getMax(int i) {
        setOnHide setonhide = this.getMin;
        if (setonhide == null) {
            return new byte[i];
        }
        return (byte[]) setonhide.length(i, byte[].class);
    }

    public final void setMax(@NonNull byte[] bArr) {
        setOnHide setonhide = this.getMin;
        if (setonhide != null) {
            setonhide.setMin(bArr);
        }
    }

    @NonNull
    public final int[] length(int i) {
        setOnHide setonhide = this.getMin;
        if (setonhide == null) {
            return new int[i];
        }
        return (int[]) setonhide.length(i, int[].class);
    }

    public final void getMin(@NonNull int[] iArr) {
        setOnHide setonhide = this.getMin;
        if (setonhide != null) {
            setonhide.setMin(iArr);
        }
    }
}
