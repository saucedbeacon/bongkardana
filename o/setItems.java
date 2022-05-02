package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import o.RestrictTo;

public final class setItems {

    public final class core implements RedDotDrawable {
        public static final core getMin = new core();

        public final Object apply(Object obj) {
            return Long.valueOf(System.currentTimeMillis() - ((Long) obj).longValue());
        }
    }

    public static MenuItem length(MenuItem menuItem, setNeutralButtonIcon setneutralbuttonicon) {
        return menuItem instanceof RestrictTo.Scope ? ((RestrictTo.Scope) menuItem).getMin(setneutralbuttonicon) : menuItem;
    }

    public static void getMin(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).setMax(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void getMax(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).getMin(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    public static void setMax(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void length(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    public static void setMin(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void setMax(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof RestrictTo.Scope) {
            ((RestrictTo.Scope) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
