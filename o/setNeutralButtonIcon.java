package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

public abstract class setNeutralButtonIcon {
    private getMin getMax;
    private setMin getMin;
    private final Context length;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface getMin {
        void length(boolean z);
    }

    public interface setMin {
        void length();
    }

    public abstract View getMax();

    public boolean getMin() {
        return false;
    }

    public boolean length() {
        return true;
    }

    public void setMax(SubMenu subMenu) {
    }

    public boolean setMax() {
        return false;
    }

    public boolean setMin() {
        return false;
    }

    public setNeutralButtonIcon(Context context) {
        this.length = context;
    }

    public View setMax(MenuItem menuItem) {
        return getMax();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMax(boolean z) {
        getMin getmin = this.getMax;
        if (getmin != null) {
            getmin.length(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void length(getMin getmin) {
        this.getMax = getmin;
    }

    public void setMax(setMin setmin) {
        this.getMin = setmin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void toFloatRange() {
        this.getMin = null;
        this.getMax = null;
    }
}
