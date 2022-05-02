package o;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public final class onAddFocusables extends StateListDrawable {
    private int setMax;

    public final boolean isStateful() {
        return true;
    }

    public onAddFocusables(Drawable drawable, int i) {
        this.setMax = i;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            super.setColorFilter(this.setMax, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
