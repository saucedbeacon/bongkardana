package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public final class getType implements fireTrigger<Bitmap>, getDebugMode {
    private final Bitmap setMax;
    private final rebuildScene setMin;

    public getType(@NonNull Bitmap bitmap, @NonNull rebuildScene rebuildscene) {
        if (bitmap != null) {
            this.setMax = bitmap;
            if (rebuildscene != null) {
                this.setMin = rebuildscene;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @NonNull
    public final Class<Bitmap> getMin() {
        return Bitmap.class;
    }

    public final int setMax() {
        return getDependents.getMin(this.setMax);
    }

    public final void length() {
        this.setMin.setMin(this.setMax);
    }

    public final void getMax() {
        this.setMax.prepareToDraw();
    }

    @NonNull
    public final /* bridge */ /* synthetic */ Object setMin() {
        return this.setMax;
    }
}
