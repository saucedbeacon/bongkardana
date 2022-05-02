package o;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import javax.annotation.Nullable;

public final class ViewCompat$FocusRealDirection<T extends Drawable> extends Drawable implements Drawable.Callback, arrowScroll {
    T getMax;
    int getMin;
    int length;
    boolean setMax;
    ShortcutManagerCompat$ShortcutMatchFlags setMin;

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
    }

    public final void draw(Canvas canvas) {
        if (this.getMax != null) {
            Rect bounds = getBounds();
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            if (this.setMax) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            ShortcutManagerCompat$ShortcutMatchFlags shortcutManagerCompat$ShortcutMatchFlags = this.setMin;
            if (shortcutManagerCompat$ShortcutMatchFlags != null) {
                canvas.concat(shortcutManagerCompat$ShortcutMatchFlags);
            }
            this.getMax.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void setChangingConfigurations(int i) {
        T t = this.getMax;
        if (t != null) {
            t.setChangingConfigurations(i);
        }
    }

    public final int getChangingConfigurations() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getChangingConfigurations();
    }

    public final void setDither(boolean z) {
        T t = this.getMax;
        if (t != null) {
            t.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        T t = this.getMax;
        if (t != null) {
            t.setFilterBitmap(z);
        }
    }

    public final void setAlpha(int i) {
        T t = this.getMax;
        if (t != null) {
            t.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        T t = this.getMax;
        if (t != null) {
            t.setColorFilter(colorFilter);
        }
    }

    public final boolean isStateful() {
        T t = this.getMax;
        return t != null && t.isStateful();
    }

    public final boolean setState(int[] iArr) {
        T t = this.getMax;
        return t != null && t.setState(iArr);
    }

    @Nullable
    public final int[] getState() {
        T t = this.getMax;
        if (t == null) {
            return null;
        }
        return t.getState();
    }

    @Nullable
    public final Drawable getCurrent() {
        T t = this.getMax;
        if (t == null) {
            return null;
        }
        return t.getCurrent();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        T t = this.getMax;
        if (!(t == null || t.isVisible() == z)) {
            try {
                this.getMax.setVisible(z, z2);
            } catch (NullPointerException unused) {
            }
        }
        return visible;
    }

    public final int getOpacity() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getOpacity();
    }

    @Nullable
    public final Region getTransparentRegion() {
        T t = this.getMax;
        if (t == null) {
            return null;
        }
        return t.getTransparentRegion();
    }

    public final int getIntrinsicWidth() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicHeight();
    }

    public final int getMinimumWidth() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getMinimumWidth();
    }

    public final int getMinimumHeight() {
        T t = this.getMax;
        if (t == null) {
            return -1;
        }
        return t.getMinimumHeight();
    }

    public final boolean getPadding(Rect rect) {
        T t = this.getMax;
        return t != null && t.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        T t = this.getMax;
        return t != null && t.setLevel(i);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @TargetApi(21)
    public final boolean length(MotionEvent motionEvent, View view) {
        Rect bounds = getBounds();
        this.getMax.setHotspot((float) (((int) motionEvent.getX()) - bounds.left), (float) (((int) motionEvent.getY()) - bounds.top));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.getMax;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean length(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x002a
            T r0 = r2.getMax
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x002a
            int r0 = r3.getActionMasked()
            if (r0 != 0) goto L_0x002a
            android.graphics.Rect r0 = r2.getBounds()
            float r1 = r3.getX()
            int r1 = (int) r1
            float r3 = r3.getY()
            int r3 = (int) r3
            boolean r3 = r0.contains(r1, r3)
            if (r3 == 0) goto L_0x002a
            r3 = 1
            return r3
        L_0x002a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ViewCompat$FocusRealDirection.length(android.view.MotionEvent):boolean");
    }
}
