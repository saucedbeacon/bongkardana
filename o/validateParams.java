package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

public final class validateParams implements fireTrigger<BitmapDrawable>, getDebugMode {
    private final Resources getMax;
    private final fireTrigger<Bitmap> setMin;

    public validateParams(@NonNull Resources resources, @NonNull fireTrigger<Bitmap> firetrigger) {
        if (resources != null) {
            this.getMax = resources;
            if (firetrigger != null) {
                this.setMin = firetrigger;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @NonNull
    public final Class<BitmapDrawable> getMin() {
        return BitmapDrawable.class;
    }

    public final int setMax() {
        return this.setMin.setMax();
    }

    public final void length() {
        this.setMin.length();
    }

    public final void getMax() {
        fireTrigger<Bitmap> firetrigger = this.setMin;
        if (firetrigger instanceof getDebugMode) {
            ((getDebugMode) firetrigger).getMax();
        }
    }

    @NonNull
    public final /* synthetic */ Object setMin() {
        return new BitmapDrawable(this.getMax, this.setMin.setMin());
    }
}
