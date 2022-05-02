package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class onShuffleModeChangedRemoved extends onVolumeInfoChanged implements SubMenu {
    private final min getMin;

    onShuffleModeChangedRemoved(Context context, min min) {
        super(context, min);
        this.getMin = min;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.getMin.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.getMin.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        this.getMin.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.getMin.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.getMin.setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        this.getMin.clearHeader();
    }

    public final SubMenu setIcon(int i) {
        this.getMin.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.getMin.setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return setMax(this.getMin.getItem());
    }
}
