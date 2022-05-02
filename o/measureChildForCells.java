package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class measureChildForCells extends ActionMenuPresenter$SavedState {
    private static boolean setMax = true;

    measureChildForCells() {
    }

    @SuppressLint({"NewApi"})
    public void setMin(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setMin(view, i);
        } else if (setMax) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                setMax = false;
            }
        }
    }
}
