package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

final class getMinHeight extends setMinWidth<Drawable> {
    public final void length() {
    }

    getMinHeight(Drawable drawable) {
        super(drawable);
    }

    @NonNull
    public final Class<Drawable> getMin() {
        return this.getMin.getClass();
    }

    public final int setMax() {
        return Math.max(1, this.getMin.getIntrinsicWidth() * this.getMin.getIntrinsicHeight() * 4);
    }
}
