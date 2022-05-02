package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.ComponentHost;
import o.IResultReceiver;
import o.setPositiveButtonIcon;

public class overScrollByCompat extends TouchDelegate {
    private static final setPositiveButtonIcon.getMin<IResultReceiver.Stub<length>> getMin = new setPositiveButtonIcon.getMin<>(4);
    private static final Rect setMin = new Rect();
    public IResultReceiver.Stub<length> length;
    public final IResultReceiver.Stub<length> setMax = new IResultReceiver.Stub<>();

    public overScrollByCompat(ComponentHost componentHost) {
        super(setMin, componentHost);
    }

    public final boolean setMin(int i) {
        int equals;
        IResultReceiver.Stub<length> stub = this.length;
        if (stub == null || (equals = stub.equals(i)) < 0) {
            return false;
        }
        this.length.length(equals);
        this.length.IsOverlapping(equals).getMax();
        return true;
    }

    public final void getMax(Canvas canvas, Paint paint) {
        for (int min = this.setMax.getMin() - 1; min >= 0; min--) {
            canvas.drawRect(this.setMax.IsOverlapping(min).getMax, paint);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int min = this.setMax.getMin() - 1; min >= 0; min--) {
            if (this.setMax.IsOverlapping(min).setMin(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public static IResultReceiver.Stub<length> setMax() {
        IResultReceiver.Stub<length> max = getMin.getMax();
        return max == null ? new IResultReceiver.Stub<>(4) : max;
    }

    public static void getMin(IResultReceiver.Stub<length> stub) {
        getMin.getMin(stub);
    }

    public static class length {
        private static final setPositiveButtonIcon.getMin<length> length = new setPositiveButtonIcon.getMin<>(4);
        /* access modifiers changed from: private */
        public final Rect getMax = new Rect();
        private View getMin;
        private final Rect isInside = new Rect();
        private int setMax;
        private boolean setMin;

        private length() {
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                z = this.getMax.contains(x, y);
                this.setMin = z;
            } else if (action == 1 || action == 2) {
                boolean z3 = this.setMin;
                boolean z4 = !z3 || this.isInside.contains(x, y);
                if (motionEvent.getAction() == 1) {
                    this.setMin = false;
                }
                z2 = z4;
                z = z3;
            } else if (action != 3) {
                z = false;
            } else {
                z = this.setMin;
                this.setMin = false;
            }
            if (!z) {
                return false;
            }
            if (z2) {
                motionEvent.setLocation((float) (this.getMin.getWidth() / 2), (float) (this.getMin.getHeight() / 2));
            } else {
                int i = this.setMax;
                motionEvent.setLocation((float) (-(i * 2)), (float) (-(i * 2)));
            }
            return this.getMin.dispatchTouchEvent(motionEvent);
        }

        public static length getMin(View view, Rect rect) {
            length max = length.getMax();
            if (max == null) {
                max = new length();
            }
            max.getMin = view;
            max.setMax = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            max.getMax.set(rect);
            max.isInside.set(rect);
            Rect rect2 = max.isInside;
            int i = max.setMax;
            rect2.inset(-i, -i);
            return max;
        }

        public final void getMax() {
            this.getMin = null;
            this.getMax.setEmpty();
            this.isInside.setEmpty();
            this.setMin = false;
            this.setMax = 0;
            length.getMin(this);
        }
    }
}
