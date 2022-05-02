package o;

import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.gesture.Gesture;
import o.stopInterceptRequestLayout;

public class hasUpdatedView extends stopInterceptRequestLayout {
    /* access modifiers changed from: private */
    public float equals = 0.0f;
    private ScaleGestureDetector getMax;
    /* access modifiers changed from: private */
    public boolean setMin;

    public hasUpdatedView(@NonNull stopInterceptRequestLayout.getMax getmax) {
        super(getmax, 2);
        this.getMin = Gesture.PINCH;
        this.getMax = new ScaleGestureDetector(getmax.length(), new ScaleGestureDetector.SimpleOnScaleGestureListener() {
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                boolean unused = hasUpdatedView.this.setMin = true;
                float unused2 = hasUpdatedView.this.equals = (scaleGestureDetector.getScaleFactor() - 1.0f) * 2.0f;
                return true;
            }
        });
        if (Build.VERSION.SDK_INT >= 19) {
            this.getMax.setQuickScaleEnabled(false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean setMin(@NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.setMin = false;
        }
        this.getMax.onTouchEvent(motionEvent);
        if (this.setMin) {
            this.length[0].x = motionEvent.getX(0);
            this.length[0].y = motionEvent.getY(0);
            z = true;
            if (motionEvent.getPointerCount() > 1) {
                this.length[1].x = motionEvent.getX(1);
                this.length[1].y = motionEvent.getY(1);
            }
        }
        return z;
    }

    public final float getMax(float f, float f2, float f3) {
        return f + (this.equals * (f3 - f2));
    }
}
