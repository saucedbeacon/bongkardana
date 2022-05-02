package o;

import android.view.MotionEvent;
import android.view.View;

public class RemoteActionCompat implements View.OnTouchListener {
    IconCompat<fullScroll> getMax;

    RemoteActionCompat() {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        IconCompat<fullScroll> iconCompat = this.getMax;
        return iconCompat != null && getHandler.setMin(iconCompat, view, motionEvent);
    }
}
