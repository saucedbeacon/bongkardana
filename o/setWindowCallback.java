package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class setWindowCallback implements hasLogo {
    private final ViewGroupOverlay setMax;

    setWindowCallback(@NonNull ViewGroup viewGroup) {
        this.setMax = viewGroup.getOverlay();
    }

    public void setMax(@NonNull Drawable drawable) {
        this.setMax.add(drawable);
    }

    public void length(@NonNull Drawable drawable) {
        this.setMax.remove(drawable);
    }

    public void setMax(@NonNull View view) {
        this.setMax.add(view);
    }

    public void getMin(@NonNull View view) {
        this.setMax.remove(view);
    }
}
