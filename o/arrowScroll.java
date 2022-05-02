package o;

import android.view.MotionEvent;
import android.view.View;

public interface arrowScroll {
    boolean length(MotionEvent motionEvent);

    boolean length(MotionEvent motionEvent, View view);
}
