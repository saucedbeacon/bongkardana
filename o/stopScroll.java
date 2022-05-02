package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.gesture.Gesture;
import o.stopInterceptRequestLayout;

public class stopScroll extends stopInterceptRequestLayout {
    private GestureDetector getMax;
    /* access modifiers changed from: private */
    public boolean setMin;

    public final float getMax(float f, float f2, float f3) {
        return 0.0f;
    }

    public stopScroll(@NonNull stopInterceptRequestLayout.getMax getmax) {
        super(getmax, 1);
        GestureDetector gestureDetector = new GestureDetector(getmax.length(), new GestureDetector.SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                boolean unused = stopScroll.this.setMin = true;
                stopScroll.this.getMin = Gesture.TAP;
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
                boolean unused = stopScroll.this.setMin = true;
                stopScroll.this.getMin = Gesture.LONG_TAP;
            }
        });
        this.getMax = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    /* access modifiers changed from: protected */
    public final boolean setMin(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.setMin = false;
        }
        this.getMax.onTouchEvent(motionEvent);
        if (!this.setMin) {
            return false;
        }
        this.length[0].x = motionEvent.getX();
        this.length[0].y = motionEvent.getY();
        return true;
    }
}
