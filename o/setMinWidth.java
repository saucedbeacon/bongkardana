package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

public abstract class setMinWidth<T extends Drawable> implements fireTrigger<T>, getDebugMode {
    protected final T getMin;

    public setMinWidth(T t) {
        if (t != null) {
            this.getMin = (Drawable) t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void getMax() {
        T t = this.getMin;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof getViewWidget) {
            ((getViewWidget) t).getMax.getMin.IsOverlapping.prepareToDraw();
        }
    }

    @NonNull
    public final /* synthetic */ Object setMin() {
        Drawable.ConstantState constantState = this.getMin.getConstantState();
        if (constantState == null) {
            return this.getMin;
        }
        return constantState.newDrawable();
    }
}
