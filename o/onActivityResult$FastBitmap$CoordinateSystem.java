package o;

import android.os.Build;
import android.view.View;

class onActivityResult$FastBitmap$CoordinateSystem extends onActivityResult {
    onActivityResult$FastBitmap$CoordinateSystem() {
    }

    public final boolean length(View view, float f, long j, initViewTreeOwners initviewtreeowners) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(length(f, j, view, initviewtreeowners));
        }
        return this.isInside;
    }
}
