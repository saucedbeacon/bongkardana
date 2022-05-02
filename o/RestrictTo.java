package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import o.RequiresPermission;

@RequiresApi(21)
class RestrictTo extends conditional {
    private static Method length;

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface Scope extends MenuItem {
        boolean collapseActionView();

        boolean expandActionView();

        View getActionView();

        int getAlphabeticModifiers();

        CharSequence getContentDescription();

        ColorStateList getIconTintList();

        PorterDuff.Mode getIconTintMode();

        Scope getMin(CharSequence charSequence);

        Scope getMin(setNeutralButtonIcon setneutralbuttonicon);

        int getNumericModifiers();

        CharSequence getTooltipText();

        boolean isActionViewExpanded();

        MenuItem setActionView(int i);

        MenuItem setActionView(View view);

        MenuItem setAlphabeticShortcut(char c, int i);

        MenuItem setIconTintList(ColorStateList colorStateList);

        MenuItem setIconTintMode(PorterDuff.Mode mode);

        Scope setMax(CharSequence charSequence);

        setNeutralButtonIcon setMax();

        MenuItem setNumericShortcut(char c, int i);

        MenuItem setShortcut(char c, char c2, int i, int i2);

        void setShowAsAction(int i);

        MenuItem setShowAsActionFlags(int i);
    }

    RestrictTo(Drawable drawable) {
        super(drawable);
        length();
    }

    RestrictTo(RequiresPermission.Write write, Resources resources) {
        super(write, resources);
        length();
    }

    public void setHotspot(float f, float f2) {
        this.setMax.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.setMax.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(@NonNull Outline outline) {
        this.setMax.getOutline(outline);
    }

    @NonNull
    public Rect getDirtyBounds() {
        return this.setMax.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (setMax()) {
            super.setTintList(colorStateList);
        } else {
            this.setMax.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (setMax()) {
            super.setTint(i);
        } else {
            this.setMax.setTint(i);
        }
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (setMax()) {
            super.setTintMode(mode);
        } else {
            this.setMax.setTintMode(mode);
        }
    }

    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setMax() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.setMax;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        if (!(this.setMax == null || (method = length) == null)) {
            try {
                return ((Boolean) method.invoke(this.setMax, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void length() {
        if (length == null) {
            try {
                length = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
