package o;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.gesture.Gesture;

public abstract class stopInterceptRequestLayout {
    private getMax getMax;
    @VisibleForTesting
    public Gesture getMin;
    public PointF[] length;
    public boolean setMax;

    public interface getMax {
        int getMax();

        int getMin();

        @NonNull
        Context length();
    }

    /* access modifiers changed from: protected */
    public abstract float getMax(float f, float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract boolean setMin(@NonNull MotionEvent motionEvent);

    stopInterceptRequestLayout(@NonNull getMax getmax, int i) {
        this.getMax = getmax;
        this.length = new PointF[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.length[i2] = new PointF(0.0f, 0.0f);
        }
    }

    public final boolean length(@NonNull MotionEvent motionEvent) {
        if (!this.setMax) {
            return false;
        }
        return setMin(motionEvent);
    }

    public final float getMin(float f, float f2, float f3) {
        float max = getMax(f, f2, f3);
        if (max < f2) {
            max = f2;
        }
        if (max > f3) {
            max = f3;
        }
        float f4 = ((f3 - f2) / 50.0f) / 2.0f;
        return (max < f - f4 || max > f4 + f) ? max : f;
    }
}
