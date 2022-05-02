package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o.RequiresPermission;

class conditional extends Drawable implements Drawable.Callback, RequiresPermission, allOf {
    static final PorterDuff.Mode getMax = PorterDuff.Mode.SRC_IN;
    private PorterDuff.Mode getMin;
    private boolean isInside;
    private int length;
    Drawable setMax;
    RequiresPermission.Write setMin;
    private boolean toFloatRange;

    /* access modifiers changed from: protected */
    public boolean setMax() {
        return true;
    }

    conditional(@NonNull RequiresPermission.Write write, @Nullable Resources resources) {
        this.setMin = write;
        getMax(resources);
    }

    conditional(@Nullable Drawable drawable) {
        this.setMin = getMin();
        getMin(drawable);
    }

    private void getMax(@Nullable Resources resources) {
        RequiresPermission.Write write = this.setMin;
        if (write != null && write.setMin != null) {
            getMin(this.setMin.setMin.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.setMax.jumpToCurrentState();
    }

    public void draw(@NonNull Canvas canvas) {
        this.setMax.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.setMax;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.setMax.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        RequiresPermission.Write write = this.setMin;
        return changingConfigurations | (write != null ? write.getChangingConfigurations() : 0) | this.setMax.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.setMax.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.setMax.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.setMax.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.setMax.setColorFilter(colorFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.setMin;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.setMax()
            if (r0 == 0) goto L_0x000d
            o.RequiresPermission$Write r0 = r1.setMin
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.getMax
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.setMax
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.conditional.isStateful():boolean");
    }

    public boolean setState(@NonNull int[] iArr) {
        return setMax(iArr) || this.setMax.setState(iArr);
    }

    @NonNull
    public int[] getState() {
        return this.setMax.getState();
    }

    @NonNull
    public Drawable getCurrent() {
        return this.setMax.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.setMax.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.setMax.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.setMax.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.setMax.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.setMax.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.setMax.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.setMax.getMinimumHeight();
    }

    public boolean getPadding(@NonNull Rect rect) {
        return this.setMax.getPadding(rect);
    }

    @RequiresApi(19)
    public void setAutoMirrored(boolean z) {
        RequiresPermission.Read.getMin(this.setMax, z);
    }

    @RequiresApi(19)
    public boolean isAutoMirrored() {
        return RequiresPermission.Read.setMin(this.setMax);
    }

    @RequiresApi(23)
    public boolean onLayoutDirectionChanged(int i) {
        return RequiresPermission.Read.setMax(this.setMax, i);
    }

    @RequiresApi(23)
    public int getLayoutDirection() {
        return RequiresPermission.Read.isInside(this.setMax);
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        RequiresPermission.Write write = this.setMin;
        if (write == null || !write.getMin()) {
            return null;
        }
        this.setMin.length = getChangingConfigurations();
        return this.setMin;
    }

    @NonNull
    public Drawable mutate() {
        if (!this.isInside && super.mutate() == this) {
            this.setMin = getMin();
            Drawable drawable = this.setMax;
            if (drawable != null) {
                drawable.mutate();
            }
            RequiresPermission.Write write = this.setMin;
            if (write != null) {
                Drawable drawable2 = this.setMax;
                write.setMin = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.isInside = true;
        }
        return this;
    }

    @NonNull
    private RequiresPermission.Write getMin() {
        return new RequiresPermission.Write(this.setMin);
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.setMax.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.setMin.getMax = colorStateList;
        setMax(getState());
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.setMin.getMin = mode;
        setMax(getState());
    }

    private boolean setMax(int[] iArr) {
        if (!setMax()) {
            return false;
        }
        ColorStateList colorStateList = this.setMin.getMax;
        PorterDuff.Mode mode = this.setMin.getMin;
        if (colorStateList == null || mode == null) {
            this.toFloatRange = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.toFloatRange && colorForState == this.length && mode == this.getMin)) {
                setColorFilter(colorForState, mode);
                this.length = colorForState;
                this.getMin = mode;
                this.toFloatRange = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable setMin() {
        return this.setMax;
    }

    public final void getMin(Drawable drawable) {
        Drawable drawable2 = this.setMax;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.setMax = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            RequiresPermission.Write write = this.setMin;
            if (write != null) {
                write.setMin = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
