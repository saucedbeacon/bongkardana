package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.List;
import o.getOverflowIcon;
import o.resolveSystem;

public class getViewWidget extends Drawable implements resolveSystem.getMin, Animatable, getOverflowIcon {
    private List<getOverflowIcon.getMax> FastBitmap$CoordinateSystem;
    private boolean IsOverlapping;
    private Rect equals;
    public final setMax getMax;
    private boolean getMin;
    private Paint isInside;
    private boolean length;
    boolean setMax;
    private boolean setMin;
    private int toFloatRange;
    private int toIntRange;

    public int getOpacity() {
        return -2;
    }

    public getViewWidget(Context context, GifDecoder gifDecoder, updatePostLayout<Bitmap> updatepostlayout, int i, int i2, Bitmap bitmap) {
        this(new setMax(new resolveSystem(Glide.setMax(context), gifDecoder, i, i2, updatepostlayout, bitmap)));
    }

    getViewWidget(setMax setmax) {
        this.getMin = true;
        this.toFloatRange = -1;
        this.getMax = setmax;
    }

    public void start() {
        this.setMin = true;
        this.toIntRange = 0;
        if (this.getMin) {
            length();
        }
    }

    public void stop() {
        this.setMin = false;
        this.length = false;
        resolveSystem resolvesystem = this.getMax.getMin;
        resolvesystem.setMin.remove(this);
        if (resolvesystem.setMin.isEmpty()) {
            resolvesystem.getMin = false;
        }
    }

    private void length() {
        if (!(!this.setMax)) {
            throw new IllegalArgumentException("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        } else if (this.getMax.getMin.getMax.setMax() == 1) {
            invalidateSelf();
        } else if (!this.length) {
            this.length = true;
            this.getMax.getMin.setMax(this);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!this.setMax) {
            this.getMin = z;
            if (!z) {
                this.length = false;
                resolveSystem resolvesystem = this.getMax.getMin;
                resolvesystem.setMin.remove(this);
                if (resolvesystem.setMin.isEmpty()) {
                    resolvesystem.getMin = false;
                }
            } else if (this.setMin) {
                length();
            }
            return super.setVisible(z, z2);
        }
        throw new IllegalArgumentException("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    public int getIntrinsicWidth() {
        return this.getMax.getMin.toString;
    }

    public int getIntrinsicHeight() {
        return this.getMax.getMin.FastBitmap$CoordinateSystem;
    }

    public boolean isRunning() {
        return this.length;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.IsOverlapping = true;
    }

    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap;
        if (!this.setMax) {
            if (this.IsOverlapping) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.equals == null) {
                    this.equals = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.equals);
                this.IsOverlapping = false;
            }
            resolveSystem resolvesystem = this.getMax.getMin;
            if (resolvesystem.toFloatRange != null) {
                bitmap = resolvesystem.toFloatRange.length;
            } else {
                bitmap = resolvesystem.IsOverlapping;
            }
            if (this.equals == null) {
                this.equals = new Rect();
            }
            Rect rect = this.equals;
            if (this.isInside == null) {
                this.isInside = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.isInside);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.getMax;
    }

    public static final class setMax extends Drawable.ConstantState {
        @VisibleForTesting
        public final resolveSystem getMin;

        public final int getChangingConfigurations() {
            return 0;
        }

        setMax(resolveSystem resolvesystem) {
            this.getMin = resolvesystem;
        }

        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @NonNull
        public final Drawable newDrawable() {
            return new getViewWidget(this);
        }
    }

    public void setAlpha(int i) {
        if (this.isInside == null) {
            this.isInside = new Paint(2);
        }
        this.isInside.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.isInside == null) {
            this.isInside = new Paint(2);
        }
        this.isInside.setColorFilter(colorFilter);
    }

    public final void setMax() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        resolveSystem resolvesystem = this.getMax.getMin;
        if ((resolvesystem.toFloatRange != null ? resolvesystem.toFloatRange.getMax : -1) == this.getMax.getMin.getMax.setMax() - 1) {
            this.toIntRange++;
        }
        int i = this.toFloatRange;
        if (i != -1 && this.toIntRange >= i) {
            List<getOverflowIcon.getMax> list = this.FastBitmap$CoordinateSystem;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.FastBitmap$CoordinateSystem.get(i2).onAnimationEnd(this);
                }
            }
            stop();
        }
    }
}
