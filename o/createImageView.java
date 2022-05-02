package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import o.PlaybackStateCompat;

final class createImageView {
    public static final ThreadLocal<createImageView> length = new ThreadLocal<>();
    private final setMax equals = new setMax();
    final PlaybackStateCompat.RepeatMode<length, Long> getMax = new PlaybackStateCompat.RepeatMode<>();
    boolean getMin = false;
    long setMax = 0;
    final ArrayList<length> setMin = new ArrayList<>();
    private setMin toIntRange;

    interface length {
        boolean getMin(long j);
    }

    createImageView() {
    }

    class setMax {
        setMax() {
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            createImageView.this.setMax = SystemClock.uptimeMillis();
            createImageView createimageview = createImageView.this;
            long j = createimageview.setMax;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < createimageview.setMin.size(); i++) {
                length length2 = createimageview.setMin.get(i);
                if (length2 != null && createimageview.getMax(length2, uptimeMillis)) {
                    length2.getMin(j);
                }
            }
            if (createimageview.getMin) {
                for (int size = createimageview.setMin.size() - 1; size >= 0; size--) {
                    if (createimageview.setMin.get(size) == null) {
                        createimageview.setMin.remove(size);
                    }
                }
                createimageview.getMin = false;
            }
            if (createImageView.this.setMin.size() > 0) {
                createImageView.this.length().setMin();
            }
        }
    }

    public static createImageView setMin() {
        if (length.get() == null) {
            length.set(new createImageView());
        }
        return length.get();
    }

    /* access modifiers changed from: package-private */
    public final setMin length() {
        if (this.toIntRange == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.toIntRange = new getMax(this.equals);
            } else {
                this.toIntRange = new getMin(this.equals);
            }
        }
        return this.toIntRange;
    }

    public final void getMin(length length2) {
        this.getMax.remove(length2);
        int indexOf = this.setMin.indexOf(length2);
        if (indexOf >= 0) {
            this.setMin.set(indexOf, (Object) null);
            this.getMin = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(length length2, long j) {
        Long l = this.getMax.get(length2);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.getMax.remove(length2);
        return true;
    }

    @RequiresApi(16)
    static class getMax extends setMin {
        private final Choreographer setMax = Choreographer.getInstance();
        private final Choreographer.FrameCallback setMin = new Choreographer.FrameCallback() {
            public final void doFrame(long j) {
                getMax.this.length.setMin();
            }
        };

        getMax(setMax setmax) {
            super(setmax);
        }

        /* access modifiers changed from: package-private */
        public void setMin() {
            this.setMax.postFrameCallback(this.setMin);
        }
    }

    static class getMin extends setMin {
        long getMax = -1;
        private final Runnable getMin = new Runnable() {
            public final void run() {
                getMin.this.getMax = SystemClock.uptimeMillis();
                getMin.this.length.setMin();
            }
        };
        private final Handler setMin = new Handler(Looper.myLooper());

        getMin(setMax setmax) {
            super(setmax);
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            this.setMin.postDelayed(this.getMin, Math.max(10 - (SystemClock.uptimeMillis() - this.getMax), 0));
        }
    }

    static abstract class setMin {
        final setMax length;

        /* access modifiers changed from: package-private */
        public abstract void setMin();

        setMin(setMax setmax) {
            this.length = setmax;
        }
    }
}
