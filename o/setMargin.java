package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

final class setMargin {
    private static final rebuildScene length = new rebuildMotion() {
        public final void setMin(Bitmap bitmap) {
        }
    };

    @Nullable
    static fireTrigger<Bitmap> setMin(rebuildScene rebuildscene, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = length(rebuildscene, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            rebuildscene = length;
        }
        if (bitmap == null) {
            return null;
        }
        return new getType(bitmap, rebuildscene);
    }

    @Nullable
    private static Bitmap length(rebuildScene rebuildscene, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock max = setTag.getMax();
        max.lock();
        Bitmap min = rebuildscene.setMin(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(min);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap((Bitmap) null);
            return min;
        } finally {
            max.unlock();
        }
    }
}
