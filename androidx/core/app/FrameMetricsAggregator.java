package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator {
    public setMin setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this((byte) 0);
    }

    private FrameMetricsAggregator(byte b) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.setMin = new setMax(1);
        } else {
            this.setMin = new setMin();
        }
    }

    public static class setMin {
        public void getMin(Activity activity) {
        }

        public SparseIntArray[] length(Activity activity) {
            return null;
        }

        setMin() {
        }
    }

    @RequiresApi(24)
    static class setMax extends setMin {
        private static HandlerThread setMax;
        private static Handler toFloatRange;
        SparseIntArray[] getMax = new SparseIntArray[9];
        Window.OnFrameMetricsAvailableListener getMin = new Window.OnFrameMetricsAvailableListener() {
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                if ((setMax.this.length & 1) != 0) {
                    setMax setmax = setMax.this;
                    setmax.setMax(setmax.getMax[0], frameMetrics.getMetric(8));
                }
                if ((setMax.this.length & 2) != 0) {
                    setMax setmax2 = setMax.this;
                    setmax2.setMax(setmax2.getMax[1], frameMetrics.getMetric(1));
                }
                if ((setMax.this.length & 4) != 0) {
                    setMax setmax3 = setMax.this;
                    setmax3.setMax(setmax3.getMax[2], frameMetrics.getMetric(3));
                }
                if ((setMax.this.length & 8) != 0) {
                    setMax setmax4 = setMax.this;
                    setmax4.setMax(setmax4.getMax[3], frameMetrics.getMetric(4));
                }
                if ((setMax.this.length & 16) != 0) {
                    setMax setmax5 = setMax.this;
                    setmax5.setMax(setmax5.getMax[4], frameMetrics.getMetric(5));
                }
                if ((setMax.this.length & 64) != 0) {
                    setMax setmax6 = setMax.this;
                    setmax6.setMax(setmax6.getMax[6], frameMetrics.getMetric(7));
                }
                if ((setMax.this.length & 32) != 0) {
                    setMax setmax7 = setMax.this;
                    setmax7.setMax(setmax7.getMax[5], frameMetrics.getMetric(6));
                }
                if ((setMax.this.length & 128) != 0) {
                    setMax setmax8 = setMax.this;
                    setmax8.setMax(setmax8.getMax[7], frameMetrics.getMetric(0));
                }
                if ((setMax.this.length & 256) != 0) {
                    setMax setmax9 = setMax.this;
                    setmax9.setMax(setmax9.getMax[8], frameMetrics.getMetric(2));
                }
            }
        };
        int length;
        private ArrayList<WeakReference<Activity>> setMin = new ArrayList<>();

        setMax(int i) {
            this.length = i;
        }

        /* access modifiers changed from: package-private */
        public void setMax(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        public void getMin(Activity activity) {
            if (setMax == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                setMax = handlerThread;
                handlerThread.start();
                toFloatRange = new Handler(setMax.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.getMax;
                if (sparseIntArrayArr[i] == null && (this.length & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.getMin, toFloatRange);
            this.setMin.add(new WeakReference(activity));
        }

        public SparseIntArray[] length(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.setMin.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.setMin.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.getMin);
            return this.getMax;
        }
    }
}
