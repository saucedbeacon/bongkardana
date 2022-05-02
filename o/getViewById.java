package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class getViewById implements setConstraintSet<Bitmap, BitmapDrawable> {
    private final Resources setMax;

    public getViewById(@NonNull Resources resources) {
        if (resources != null) {
            this.setMax = resources;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Nullable
    public final fireTrigger<BitmapDrawable> length(@NonNull fireTrigger<Bitmap> firetrigger, @NonNull MotionHelper motionHelper) {
        Resources resources = this.setMax;
        if (firetrigger == null) {
            return null;
        }
        return new validateParams(resources, firetrigger);
    }
}
