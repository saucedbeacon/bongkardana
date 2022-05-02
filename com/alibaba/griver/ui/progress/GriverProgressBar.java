package com.alibaba.griver.ui.progress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverProgressBar extends ProgressBar {
    public static final int DEFAULT_DURATION = 400;
    public static final int MIN_DURATION = 300;
    public static final String TAG = "H5Progress";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ProgressNotifier f10607a;
    private long b;
    /* access modifiers changed from: private */
    public long c;
    /* access modifiers changed from: private */
    public int d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;
    private long g;
    /* access modifiers changed from: private */
    public long h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public Handler k = new Handler(Looper.getMainLooper());
    private UpdateRunnable l = new UpdateRunnable();

    public interface ProgressNotifier {
        void onProgressBegin();

        void onProgressEnd();
    }

    public GriverProgressBar(Context context) {
        super(context);
        a();
    }

    public GriverProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public GriverProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public void setNotifier(ProgressNotifier progressNotifier) {
        this.f10607a = progressNotifier;
    }

    private void a() {
        this.b = 400;
        setMax(100);
        this.i = -1;
        b();
    }

    /* access modifiers changed from: private */
    public void b() {
        this.g = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
    }

    public void setMinDuration(long j2) {
        this.b = j2;
    }

    public void updateProgress(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.g == 0) {
            this.g = currentTimeMillis;
        }
        int max = getMax();
        double d2 = (double) i2;
        Double.isNaN(d2);
        double d3 = (double) max;
        Double.isNaN(d3);
        int i3 = (int) ((d2 * 0.25d) + (d3 * 0.75d));
        int i4 = this.e;
        if (i3 >= i4 && i3 <= max) {
            this.f = i4;
            this.c = currentTimeMillis;
            this.d = i3;
            c();
        }
    }

    private void c() {
        if (isIndeterminate()) {
            GriverLogger.d(TAG, "isIndeterminate");
            return;
        }
        this.h = this.b;
        if (this.d == getMax() && this.f > getMax() / 2) {
            this.h = 300;
        }
        int i2 = this.d - this.f;
        if (i2 > 0) {
            long j2 = this.h;
            if (j2 > 0) {
                int i3 = (int) (j2 / ((long) i2));
                this.k.removeCallbacks(this.l);
                this.l.setPeriodValue(i3);
                this.l.setdeltaProgressValue(i2);
                this.k.postDelayed(this.l, (long) i3);
            }
        }
    }

    public void setVisibility(int i2) {
        GriverLogger.d(TAG, "setVisibility:".concat(String.valueOf(i2)));
        if (!this.j || i2 == 0) {
            super.setVisibility(i2);
        } else {
            this.i = i2;
        }
    }

    public void hideProgress() {
        GriverLogger.d(TAG, "hideProgress");
        super.setVisibility(8);
    }

    class UpdateRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f10608a;
        private int b;

        UpdateRunnable() {
        }

        public void setPeriodValue(int i) {
            this.f10608a = i;
        }

        public void setdeltaProgressValue(int i) {
            this.b = i;
        }

        public void run() {
            boolean unused = GriverProgressBar.this.j = true;
            int max = GriverProgressBar.this.getMax();
            if (max == 0) {
                GriverProgressBar.this.k.removeCallbacks(this);
                boolean unused2 = GriverProgressBar.this.j = false;
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - GriverProgressBar.this.c;
            if ((GriverProgressBar.this.h * ((long) this.b)) / ((long) max) == 0) {
                GriverProgressBar.this.k.removeCallbacks(this);
                boolean unused3 = GriverProgressBar.this.j = false;
                return;
            }
            int access$400 = GriverProgressBar.this.f + ((int) ((currentTimeMillis * ((long) this.b)) / GriverProgressBar.this.h));
            if (access$400 > GriverProgressBar.this.d) {
                if (access$400 > GriverProgressBar.this.getMax() && GriverProgressBar.this.f10607a != null) {
                    GriverProgressBar.this.f10607a.onProgressEnd();
                }
                if (GriverProgressBar.this.i != -1) {
                    GriverProgressBar griverProgressBar = GriverProgressBar.this;
                    GriverProgressBar.super.setVisibility(griverProgressBar.i);
                    int unused4 = GriverProgressBar.this.i = -1;
                }
            } else {
                if (GriverProgressBar.this.e == 0 && GriverProgressBar.this.f10607a != null) {
                    GriverProgressBar.this.f10607a.onProgressBegin();
                }
                GriverProgressBar.this.setProgress(access$400);
                int unused5 = GriverProgressBar.this.e = access$400;
            }
            if (access$400 > GriverProgressBar.this.d) {
                if (access$400 > GriverProgressBar.this.getMax()) {
                    GriverProgressBar.this.b();
                }
                GriverProgressBar.this.k.removeCallbacks(this);
                boolean unused6 = GriverProgressBar.this.j = false;
                return;
            }
            GriverProgressBar.this.k.postDelayed(this, (long) this.f10608a);
        }
    }
}
