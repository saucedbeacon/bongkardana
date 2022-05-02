package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o.sendEventForVirtualView;

public final class guessPreviouslyFocusedRect implements sendEventForVirtualView {
    private static final boolean getMin = (Build.VERSION.SDK_INT >= 16);
    private static sendEventForVirtualView setMax;
    private Handler length;
    private Choreographer setMin;

    public static sendEventForVirtualView setMax() {
        if (setMax == null) {
            setMax = new guessPreviouslyFocusedRect();
        }
        return setMax;
    }

    private guessPreviouslyFocusedRect() {
        if (getMin) {
            this.setMin = Choreographer.getInstance();
        } else {
            this.length = new Handler(Looper.getMainLooper());
        }
    }

    public final void getMax(sendEventForVirtualView.length length2) {
        if (getMin) {
            if (length2.length == null) {
                length2.length = new Choreographer.FrameCallback() {
                    public final void doFrame(long j) {
                        length.this.getMax(j);
                    }
                };
            }
            this.setMin.postFrameCallback(length2.length);
            return;
        }
        Handler handler = this.length;
        if (length2.getMax == null) {
            length2.getMax = new Runnable() {
                public final void run() {
                    length.this.getMax(System.nanoTime());
                }
            };
        }
        handler.postDelayed(length2.getMax, 0);
    }

    public final void setMax(sendEventForVirtualView.length length2, long j) {
        if (getMin) {
            if (length2.length == null) {
                length2.length = new Choreographer.FrameCallback() {
                    public final void doFrame(long j) {
                        length.this.getMax(j);
                    }
                };
            }
            this.setMin.postFrameCallbackDelayed(length2.length, j);
            return;
        }
        Handler handler = this.length;
        if (length2.getMax == null) {
            length2.getMax = new Runnable() {
                public final void run() {
                    length.this.getMax(System.nanoTime());
                }
            };
        }
        handler.postDelayed(length2.getMax, j + 17);
    }

    public final void length(sendEventForVirtualView.length length2) {
        if (getMin) {
            if (length2.length == null) {
                length2.length = new Choreographer.FrameCallback() {
                    public final void doFrame(long j) {
                        length.this.getMax(j);
                    }
                };
            }
            this.setMin.removeFrameCallback(length2.length);
            return;
        }
        Handler handler = this.length;
        if (length2.getMax == null) {
            length2.getMax = new Runnable() {
                public final void run() {
                    length.this.getMax(System.nanoTime());
                }
            };
        }
        handler.removeCallbacks(length2.getMax);
    }
}
