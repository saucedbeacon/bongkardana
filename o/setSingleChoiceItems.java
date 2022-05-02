package o;

import android.view.MotionEvent;

public final class setSingleChoiceItems {
    @Deprecated
    public static int setMax(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int getMax(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int setMin(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int getMin(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float length(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float setMax(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static boolean getMax(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
