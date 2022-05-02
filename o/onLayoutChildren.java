package o;

import android.os.Handler;
import android.os.HandlerThread;

public class onLayoutChildren {
    private static final String setMin = onLayoutChildren.class.getSimpleName();
    private static onLayoutChildren toIntRange;
    public Handler getMax;
    HandlerThread getMin;
    public int length = 0;
    public final Object setMax = new Object();

    public static onLayoutChildren getMin() {
        if (toIntRange == null) {
            toIntRange = new onLayoutChildren();
        }
        return toIntRange;
    }

    private onLayoutChildren() {
    }

    public final void length() {
        synchronized (this.setMax) {
            if (this.getMax == null) {
                if (this.length > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.getMin = handlerThread;
                    handlerThread.start();
                    this.getMax = new Handler(this.getMin.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }
}
