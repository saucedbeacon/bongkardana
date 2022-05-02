package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.gesture.Gesture;
import o.stopInterceptRequestLayout;

public class suppressLayout extends stopInterceptRequestLayout {
    private static final String getMax;
    /* access modifiers changed from: private */
    public static final CameraLogger setMin;
    /* access modifiers changed from: private */
    public float IsOverlapping;
    /* access modifiers changed from: private */
    public boolean isInside;
    private GestureDetector toFloatRange;

    static {
        String simpleName = suppressLayout.class.getSimpleName();
        getMax = simpleName;
        setMin = CameraLogger.setMin(simpleName);
    }

    public suppressLayout(@NonNull final stopInterceptRequestLayout.getMax getmax) {
        super(getmax, 2);
        GestureDetector gestureDetector = new GestureDetector(getmax.length(), new GestureDetector.SimpleOnGestureListener() {
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float f3;
                boolean z = false;
                suppressLayout.setMin.getMax(1, "onScroll:", "distanceX=".concat(String.valueOf(f)), "distanceY=".concat(String.valueOf(f2)));
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                if (motionEvent.getX() != suppressLayout.this.length[0].x || motionEvent.getY() != suppressLayout.this.length[0].y) {
                    boolean z2 = Math.abs(f) >= Math.abs(f2);
                    suppressLayout.this.getMin = z2 ? Gesture.SCROLL_HORIZONTAL : Gesture.SCROLL_VERTICAL;
                    suppressLayout.this.length[0].set(motionEvent.getX(), motionEvent.getY());
                    z = z2;
                } else if (suppressLayout.this.getMin == Gesture.SCROLL_HORIZONTAL) {
                    z = true;
                }
                suppressLayout.this.length[1].set(motionEvent2.getX(), motionEvent2.getY());
                suppressLayout suppresslayout = suppressLayout.this;
                stopInterceptRequestLayout.getMax getmax = getmax;
                if (z) {
                    f3 = f / ((float) getmax.getMax());
                } else {
                    f3 = f2 / ((float) getmax.getMin());
                }
                float unused = suppresslayout.IsOverlapping = f3;
                suppressLayout suppresslayout2 = suppressLayout.this;
                float min = suppresslayout2.IsOverlapping;
                if (z) {
                    min = -min;
                }
                float unused2 = suppresslayout2.IsOverlapping = min;
                boolean unused3 = suppressLayout.this.isInside = true;
                return true;
            }
        });
        this.toFloatRange = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final boolean setMin(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.isInside = false;
        }
        this.toFloatRange.onTouchEvent(motionEvent);
        if (this.isInside) {
            setMin.getMax(1, "Notifying a gesture of type", this.getMin.name());
        }
        return this.isInside;
    }

    public final float getMax(float f, float f2, float f3) {
        return f + (this.IsOverlapping * (f3 - f2) * 2.0f);
    }
}
