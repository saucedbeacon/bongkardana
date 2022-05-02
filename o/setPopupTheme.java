package o;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class setPopupTheme extends measureChildForCells {
    setPopupTheme() {
    }

    public void length(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    public float getMax(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    public void setMin(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    public void setMax(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public void getMax(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void setMax(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
