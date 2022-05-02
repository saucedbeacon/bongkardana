package o;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

public final class onAdapterChanged {
    private int IsOverlapping = -1;
    public float getMax;
    private float getMin;
    private int isInside = -1;
    private float length;
    private float setMax;
    private float setMin;
    private boolean toFloatRange;
    private getMin toIntRange;

    public interface getMin {
        boolean length(onAdapterChanged onadapterchanged);
    }

    public static class setMax implements getMin {
        public boolean length(onAdapterChanged onadapterchanged) {
            return false;
        }
    }

    public onAdapterChanged(getMin getmin) {
        this.toIntRange = getmin;
    }

    public final boolean length(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.setMax = motionEvent.getX();
            this.getMin = motionEvent.getY();
            this.isInside = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            this.getMax = 0.0f;
            this.toFloatRange = true;
        } else if (actionMasked == 1) {
            this.isInside = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.length = motionEvent.getX();
                this.setMin = motionEvent.getY();
                this.IsOverlapping = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                this.getMax = 0.0f;
                this.toFloatRange = true;
            } else if (actionMasked == 6) {
                this.IsOverlapping = -1;
            }
        } else if (!(this.isInside == -1 || this.IsOverlapping == -1 || motionEvent.getPointerCount() <= this.IsOverlapping)) {
            float x = motionEvent.getX(this.isInside);
            float y = motionEvent.getY(this.isInside);
            float x2 = motionEvent.getX(this.IsOverlapping);
            float y2 = motionEvent.getY(this.IsOverlapping);
            if (this.toFloatRange) {
                this.getMax = 0.0f;
                this.toFloatRange = false;
            } else {
                float f = this.length;
                float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (this.setMin - this.getMin), (double) (f - this.setMax))))) % 360.0f);
                this.getMax = degrees;
                if (degrees < -180.0f) {
                    this.getMax = degrees + 360.0f;
                } else if (degrees > 180.0f) {
                    this.getMax = degrees - 360.0f;
                }
            }
            getMin getmin = this.toIntRange;
            if (getmin != null) {
                getmin.length(this);
            }
            this.length = x2;
            this.setMin = y2;
            this.setMax = x;
            this.getMin = y;
        }
        return true;
    }
}
