package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class setMenuPrepared implements restoreToolbarHierarchyState {
    private final ViewOverlay setMax;

    setMenuPrepared(@NonNull View view) {
        this.setMax = view.getOverlay();
    }

    public void setMax(@NonNull Drawable drawable) {
        this.setMax.add(drawable);
    }

    public void length(@NonNull Drawable drawable) {
        this.setMax.remove(drawable);
    }
}
