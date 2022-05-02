package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class setOptimizationLevel implements setConstraintSet<Drawable, byte[]> {
    private final setConstraintSet<getViewWidget, byte[]> getMax;
    private final setConstraintSet<Bitmap, byte[]> length;
    private final rebuildScene setMax;

    public setOptimizationLevel(@NonNull rebuildScene rebuildscene, @NonNull setConstraintSet<Bitmap, byte[]> setconstraintset, @NonNull setConstraintSet<getViewWidget, byte[]> setconstraintset2) {
        this.setMax = rebuildscene;
        this.length = setconstraintset;
        this.getMax = setconstraintset2;
    }

    @Nullable
    public final fireTrigger<byte[]> length(@NonNull fireTrigger<Drawable> firetrigger, @NonNull MotionHelper motionHelper) {
        Drawable min = firetrigger.setMin();
        getType gettype = null;
        if (min instanceof BitmapDrawable) {
            setConstraintSet<Bitmap, byte[]> setconstraintset = this.length;
            Bitmap bitmap = ((BitmapDrawable) min).getBitmap();
            rebuildScene rebuildscene = this.setMax;
            if (bitmap != null) {
                gettype = new getType(bitmap, rebuildscene);
            }
            return setconstraintset.length(gettype, motionHelper);
        } else if (min instanceof getViewWidget) {
            return this.getMax.length(firetrigger, motionHelper);
        } else {
            return null;
        }
    }
}
