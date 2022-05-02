package o;

import android.view.View;

public class checkPermission implements View.OnLongClickListener {
    IconCompat<ViewCompat$FocusDirection> getMin;

    checkPermission() {
    }

    public boolean onLongClick(View view) {
        IconCompat<ViewCompat$FocusDirection> iconCompat = this.getMin;
        if (iconCompat != null) {
            return getHandler.length(iconCompat, view);
        }
        return false;
    }
}
