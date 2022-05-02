package o;

import android.graphics.Rect;
import androidx.annotation.Nullable;

final class measureChildWithMargins {
    int getMax = 0;
    @Nullable
    IconCompat<LinkifyCompat$LinkifyMask> getMin = null;
    String length;
    @Nullable
    IconCompat<computeHorizontalScrollExtent> setMax = null;
    @Nullable
    IconCompat<computeHorizontalScrollOffset> setMin = null;
    boolean toFloatRange;

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        return (this.getMax & 32) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        return (this.getMax & 30) == 30;
    }

    /* access modifiers changed from: package-private */
    public final void length(Rect rect, Rect rect2) {
        if (rect.top == rect2.top) {
            this.getMax |= 4;
        }
        if (rect.bottom == rect2.bottom) {
            this.getMax |= 16;
        }
        if (rect.left == rect2.left) {
            this.getMax |= 2;
        }
        if (rect.right == rect2.right) {
            this.getMax |= 8;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        return this.toFloatRange;
    }
}
