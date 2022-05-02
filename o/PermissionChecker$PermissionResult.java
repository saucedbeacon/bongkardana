package o;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.litho.displaylist.DisplayListException;

public final class PermissionChecker$PermissionResult extends Drawable implements Drawable.Callback, arrowScroll {
    private boolean getMax;
    private boolean getMin;
    private Drawable length;
    @Nullable
    private createEventForChild setMax;
    @Nullable
    private String setMin;
    private boolean toFloatRange;
    private boolean toIntRange = false;

    PermissionChecker$PermissionResult(Drawable drawable) {
        setMax(drawable);
    }

    public final void draw(Canvas canvas) {
        requestAccessibilityFocus requestaccessibilityfocus;
        createEventForChild createeventforchild;
        Drawable drawable = this.length;
        if (drawable == null) {
            throw new IllegalStateException("The wrapped drawable hasn't been set yet");
        } else if (this.toIntRange) {
            drawable.draw(canvas);
        } else {
            if (this.setMax == null) {
                String str = this.setMin;
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    requestaccessibilityfocus = performActionForChild.getMin(str);
                } else if (i >= 23) {
                    requestaccessibilityfocus = performActionForHost.setMax(str);
                } else {
                    requestaccessibilityfocus = i >= 21 ? new isVisibleToUser(RenderNode.create(str, (View) null)) : i >= 18 ? performAction.setMin(str) : i >= 16 ? createNodeForHost.getMax(str) : null;
                }
                if (requestaccessibilityfocus == null) {
                    createeventforchild = null;
                } else {
                    createeventforchild = new createEventForChild(requestaccessibilityfocus);
                }
                if (createeventforchild == null) {
                    this.length.draw(canvas);
                    return;
                } else {
                    this.setMax = createeventforchild;
                    this.toFloatRange = true;
                }
            }
            try {
                if (this.toFloatRange || !this.setMax.getMax()) {
                    Rect bounds = this.length.getBounds();
                    createEventForChild createeventforchild2 = this.setMax;
                    int width = bounds.width();
                    int height = bounds.height();
                    if (!createeventforchild2.length) {
                        Canvas max = createeventforchild2.getMax.getMax(width, height);
                        createeventforchild2.length = true;
                        max.translate((float) (-bounds.left), (float) (-bounds.top));
                        this.length.draw(max);
                        max.translate((float) bounds.left, (float) bounds.top);
                        createEventForChild createeventforchild3 = this.setMax;
                        if (createeventforchild3.length) {
                            createeventforchild3.length = false;
                            createeventforchild3.getMax.length(max);
                            createEventForChild createeventforchild4 = this.setMax;
                            int i2 = bounds.left;
                            int i3 = bounds.top;
                            int i4 = bounds.right;
                            int i5 = bounds.bottom;
                            createeventforchild4.setMax = i2;
                            createeventforchild4.setMin = i3;
                            createeventforchild4.getMin = i4;
                            createeventforchild4.equals = i5;
                            createeventforchild4.getMax.length(i2, i3, i4, i5);
                            this.setMax.getMax.setMax(0.0f);
                            this.setMax.getMax.getMin(0.0f);
                            this.toFloatRange = false;
                        } else {
                            throw new DisplayListException(new IllegalStateException("Can't end a DisplayList that is not started"));
                        }
                    } else {
                        throw new DisplayListException(new IllegalStateException("Can't start a DisplayList that is already started"));
                    }
                }
                if (!this.setMax.getMax()) {
                    this.length.draw(canvas);
                } else {
                    this.setMax.getMax.setMin(canvas);
                }
            } catch (DisplayListException unused) {
                this.toIntRange = true;
                this.setMax = null;
                this.length.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    @UiThread
    public final void onBoundsChange(Rect rect) {
        this.length.setCallback((Drawable.Callback) null);
        this.length.setBounds(rect);
        Drawable drawable = this.length;
        if (drawable instanceof ViewCompat$FocusRealDirection) {
            ViewCompat$FocusRealDirection viewCompat$FocusRealDirection = (ViewCompat$FocusRealDirection) drawable;
            int width = rect.width();
            int height = rect.height();
            viewCompat$FocusRealDirection.getMin = width;
            viewCompat$FocusRealDirection.length = height;
            int i = viewCompat$FocusRealDirection.getMin;
            int i2 = viewCompat$FocusRealDirection.length;
            if (viewCompat$FocusRealDirection.getMax != null) {
                viewCompat$FocusRealDirection.getMax.setBounds(0, 0, i, i2);
            }
        }
        this.length.setCallback(this);
        createEventForChild createeventforchild = this.setMax;
        if (createeventforchild != null && createeventforchild.getMax() && !this.toFloatRange) {
            createEventForChild createeventforchild2 = this.setMax;
            Rect rect2 = new Rect(createeventforchild2.setMax, createeventforchild2.setMin, createeventforchild2.getMin, createeventforchild2.equals);
            if (rect.height() == rect2.height() && rect.width() == rect2.width()) {
                try {
                    int i3 = rect.top - rect2.top;
                    this.setMax.getMax.setMax((float) (rect.left - rect2.left));
                    this.setMax.getMax.getMin((float) i3);
                } catch (DisplayListException unused) {
                    this.setMax = null;
                }
            } else {
                this.toFloatRange = true;
            }
        }
    }

    public final void setChangingConfigurations(int i) {
        this.length.setChangingConfigurations(i);
    }

    public final int getChangingConfigurations() {
        return this.length.getChangingConfigurations();
    }

    public final void setDither(boolean z) {
        this.length.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.length.setFilterBitmap(z);
    }

    public final void setAlpha(int i) {
        this.length.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.length.setColorFilter(colorFilter);
    }

    public final boolean isStateful() {
        return this.length.isStateful();
    }

    public final boolean setState(int[] iArr) {
        return this.length.setState(iArr);
    }

    public final int[] getState() {
        return this.length.getState();
    }

    public final Drawable getCurrent() {
        return this.length.getCurrent();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.length.setVisible(z, z2);
    }

    public final int getOpacity() {
        return this.length.getOpacity();
    }

    public final Region getTransparentRegion() {
        return this.length.getTransparentRegion();
    }

    public final int getIntrinsicWidth() {
        return this.length.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return this.length.getIntrinsicHeight();
    }

    public final int getMinimumWidth() {
        return this.length.getMinimumWidth();
    }

    public final int getMinimumHeight() {
        return this.length.getMinimumHeight();
    }

    public final boolean getPadding(Rect rect) {
        return this.length.getPadding(rect);
    }

    public final Drawable mutate() {
        Drawable drawable = this.length;
        Drawable mutate = drawable.mutate();
        if (mutate != drawable) {
            setMax(mutate);
        }
        return this;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
        if (!this.getMin) {
            setBounds(this.length.getBounds());
            this.toFloatRange = true;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.length.setLevel(i);
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @TargetApi(21)
    public final void setTintList(ColorStateList colorStateList) {
        this.length.setTintList(colorStateList);
    }

    @TargetApi(21)
    public final void setTintMode(PorterDuff.Mode mode) {
        this.length.setTintMode(mode);
    }

    /* access modifiers changed from: package-private */
    public final void setMax(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = this.length;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.length = drawable;
            drawable.setCallback(this);
            this.getMax = this.length instanceof arrowScroll;
            this.toFloatRange = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("The wrapped drawable must not be null");
    }

    public final boolean length(MotionEvent motionEvent) {
        Drawable drawable = this.length;
        return (drawable instanceof arrowScroll) && ((arrowScroll) drawable).length(motionEvent);
    }

    public final boolean length(MotionEvent motionEvent, View view) {
        return this.getMax && ((arrowScroll) this.length).length(motionEvent, view);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayListDrawable(");
        sb.append(hashCode());
        sb.append("){\n\tbounds=");
        sb.append(getBounds());
        sb.append("\n\torigin=");
        sb.append(this.length);
        sb.append(" bounds=");
        sb.append(this.length.getBounds());
        sb.append("\n\tDL=");
        sb.append(this.setMax);
        sb.append("\n\tinvalidated=");
        sb.append(this.toFloatRange);
        sb.append("\n\tskipping DL=");
        sb.append(this.toIntRange);
        sb.append('}');
        return sb.toString();
    }
}
