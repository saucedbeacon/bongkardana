package o;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o.ActionBarOverlayLayout;

@RequiresApi(22)
class ActionMenuPresenter$SavedState extends ActionBarOverlayLayout.LayoutParams {
    private static boolean setMax = true;

    ActionMenuPresenter$SavedState() {
    }

    @SuppressLint({"NewApi"})
    public void setMax(@NonNull View view, int i, int i2, int i3, int i4) {
        if (setMax) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                setMax = false;
            }
        }
    }
}
