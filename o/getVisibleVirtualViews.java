package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o.RequiresPermission;

public abstract class getVisibleVirtualViews extends getVirtualViewAt implements Drawable.Callback {
    private Drawable getMax;

    protected getVisibleVirtualViews(Drawable drawable) {
        if (!(drawable instanceof getVirtualViewAt)) {
            Drawable drawable2 = this.getMax;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.getMax = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("drawable is already a ComparableDrawable");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.getMax.setBounds(rect);
    }

    public int getChangingConfigurations() {
        return this.getMax.getChangingConfigurations();
    }

    public void setChangingConfigurations(int i) {
        this.getMax.setChangingConfigurations(i);
    }

    public void setDither(boolean z) {
        this.getMax.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.getMax.setFilterBitmap(z);
    }

    public boolean isStateful() {
        return this.getMax.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.getMax.setState(iArr);
    }

    public int[] getState() {
        return this.getMax.getState();
    }

    public void jumpToCurrentState() {
        this.getMax.jumpToCurrentState();
    }

    public Drawable getCurrent() {
        return this.getMax.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.getMax.setVisible(z, z2);
    }

    public Region getTransparentRegion() {
        return this.getMax.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.getMax.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.getMax.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.getMax.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.getMax.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.getMax.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.getMax.setLevel(i);
    }

    public boolean isAutoMirrored() {
        return RequiresPermission.Read.setMin(this.getMax);
    }

    public void setAutoMirrored(boolean z) {
        RequiresPermission.Read.getMin(this.getMax, z);
    }

    public void setTint(int i) {
        RequiresPermission.Read.getMin(this.getMax, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        RequiresPermission.Read.setMin(this.getMax, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        RequiresPermission.Read.setMin(this.getMax, mode);
    }

    public void setHotspot(float f, float f2) {
        RequiresPermission.Read.getMax(this.getMax, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        RequiresPermission.Read.setMin(this.getMax, i, i2, i3, i4);
    }

    public void draw(Canvas canvas) {
        this.getMax.draw(canvas);
    }

    public void setAlpha(int i) {
        this.getMax.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.getMax.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return this.getMax.getOpacity();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
