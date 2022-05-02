package o;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.annotations.Event;

@Event(returnType = boolean.class)
public final class fullScroll {
    public MotionEvent getMax;
    public View setMax;
}
