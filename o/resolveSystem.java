package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.ArrayList;
import java.util.List;

public final class resolveSystem {
    int FastBitmap$CoordinateSystem;
    private updatePostLayout<Bitmap> Grayscale$Algorithm;
    public Bitmap IsOverlapping;
    private boolean Mean$Arithmetic;
    boolean equals;
    public final GifDecoder getMax;
    boolean getMin;
    private boolean hashCode;
    setMax isInside;
    final setHorizontalGap length;
    final rebuildScene setMax;
    final List<getMin> setMin;
    int toDoubleRange;
    setMax toFloatRange;
    setMax toIntRange;
    int toString;
    private setFirstVerticalBias<Bitmap> valueOf;
    private final Handler values;

    public interface getMin {
        void setMax();
    }

    private resolveSystem(rebuildScene rebuildscene, setHorizontalGap sethorizontalgap, GifDecoder gifDecoder, setFirstVerticalBias<Bitmap> setfirstverticalbias, updatePostLayout<Bitmap> updatepostlayout, Bitmap bitmap) {
        this.setMin = new ArrayList();
        this.length = sethorizontalgap;
        Handler handler = new Handler(Looper.getMainLooper(), new setMin());
        this.setMax = rebuildscene;
        this.values = handler;
        this.valueOf = setfirstverticalbias;
        this.getMax = gifDecoder;
        getMin(updatepostlayout, bitmap);
    }

    /* access modifiers changed from: package-private */
    public final void getMin(updatePostLayout<Bitmap> updatepostlayout, Bitmap bitmap) {
        if (updatepostlayout != null) {
            this.Grayscale$Algorithm = updatepostlayout;
            if (bitmap != null) {
                this.IsOverlapping = bitmap;
                this.valueOf = this.valueOf.getMin((getTopSortedChildren<?>) new dispatchApplyWindowInsetsToBehaviors().setMax(updatepostlayout));
                this.toDoubleRange = getDependents.getMin(bitmap);
                this.toString = bitmap.getWidth();
                this.FastBitmap$CoordinateSystem = bitmap.getHeight();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* access modifiers changed from: package-private */
    public final void setMax(getMin getmin) {
        if (this.equals) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.setMin.contains(getmin)) {
            boolean isEmpty = this.setMin.isEmpty();
            this.setMin.add(getmin);
            if (isEmpty && !this.getMin) {
                this.getMin = true;
                this.equals = false;
                getMax();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    private void getMax() {
        if (this.getMin && !this.hashCode) {
            if (this.Mean$Arithmetic) {
                if (this.toIntRange == null) {
                    this.getMax.IsOverlapping();
                    this.Mean$Arithmetic = false;
                } else {
                    throw new IllegalArgumentException("Pending target must be null when starting from the first frame");
                }
            }
            setMax setmax = this.toIntRange;
            if (setmax != null) {
                this.toIntRange = null;
                getMin(setmax);
                return;
            }
            this.hashCode = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.getMax.setMin());
            this.getMax.getMax();
            this.isInside = new setMax(this.values, this.getMax.getMin(), uptimeMillis);
            setFirstVerticalBias<Bitmap> min = this.valueOf.getMin((getTopSortedChildren<?>) (dispatchApplyWindowInsetsToBehaviors) new dispatchApplyWindowInsetsToBehaviors().length((setPivotY) new layoutChild(Double.valueOf(Math.random())))).getMin((Object) this.getMax);
            min.length(this.isInside, (parseBehavior<Bitmap>) null, min, clamp.setMax());
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void getMin(setMax setmax) {
        this.hashCode = false;
        if (this.equals) {
            this.values.obtainMessage(2, setmax).sendToTarget();
        } else if (!this.getMin) {
            this.toIntRange = setmax;
        } else {
            if (setmax.length != null) {
                Bitmap bitmap = this.IsOverlapping;
                if (bitmap != null) {
                    this.setMax.setMin(bitmap);
                    this.IsOverlapping = null;
                }
                setMax setmax2 = this.toFloatRange;
                this.toFloatRange = setmax;
                for (int size = this.setMin.size() - 1; size >= 0; size--) {
                    this.setMin.get(size).setMax();
                }
                if (setmax2 != null) {
                    this.values.obtainMessage(2, setmax2).sendToTarget();
                }
            }
            getMax();
        }
    }

    class setMin implements Handler.Callback {
        setMin() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                resolveSystem.this.getMin((setMax) message.obj);
                return true;
            } else if (message.what != 2) {
                return false;
            } else {
                resolveSystem.this.length.getMax((layoutChildWithAnchor<?>) (setMax) message.obj);
                return false;
            }
        }
    }

    @VisibleForTesting
    static class setMax extends onLayoutChild<Bitmap> {
        final int getMax;
        private final Handler getMin;
        Bitmap length;
        private final long setMin;

        public final /* synthetic */ void getMin(@NonNull Object obj) {
            this.length = (Bitmap) obj;
            this.getMin.sendMessageAtTime(this.getMin.obtainMessage(1, this), this.setMin);
        }

        setMax(Handler handler, int i, long j) {
            this.getMin = handler;
            this.getMax = i;
            this.setMin = j;
        }

        public final void getMax(@Nullable Drawable drawable) {
            this.length = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    resolveSystem(com.bumptech.glide.Glide r8, com.bumptech.glide.gifdecoder.GifDecoder r9, int r10, int r11, o.updatePostLayout<android.graphics.Bitmap> r12, android.graphics.Bitmap r13) {
        /*
            r7 = this;
            o.rebuildScene r1 = r8.getMin
            o.setFirstHorizontalStyle r0 = r8.setMax
            android.content.Context r0 = r0.getBaseContext()
            o.setHorizontalGap r2 = com.bumptech.glide.Glide.getMax((android.content.Context) r0)
            o.setFirstHorizontalStyle r8 = r8.setMax
            android.content.Context r8 = r8.getBaseContext()
            o.setHorizontalGap r8 = com.bumptech.glide.Glide.getMax((android.content.Context) r8)
            o.setFirstVerticalBias r8 = r8.length()
            o.evaluate r0 = o.evaluate.length
            o.dispatchApplyWindowInsetsToBehaviors r3 = new o.dispatchApplyWindowInsetsToBehaviors
            r3.<init>()
            o.getTopSortedChildren r0 = r3.getMin((o.evaluate) r0)
            o.dispatchApplyWindowInsetsToBehaviors r0 = (o.dispatchApplyWindowInsetsToBehaviors) r0
            r3 = 1
            o.getTopSortedChildren r0 = r0.getMin((boolean) r3)
            o.dispatchApplyWindowInsetsToBehaviors r0 = (o.dispatchApplyWindowInsetsToBehaviors) r0
            o.getTopSortedChildren r0 = r0.length((boolean) r3)
            o.dispatchApplyWindowInsetsToBehaviors r0 = (o.dispatchApplyWindowInsetsToBehaviors) r0
            o.getTopSortedChildren r10 = r0.length(r10, r11)
            o.setFirstVerticalBias r4 = r8.getMin((o.getTopSortedChildren<?>) r10)
            r0 = r7
            r3 = r9
            r5 = r12
            r6 = r13
            r0.<init>((o.rebuildScene) r1, (o.setHorizontalGap) r2, (com.bumptech.glide.gifdecoder.GifDecoder) r3, (o.setFirstVerticalBias<android.graphics.Bitmap>) r4, (o.updatePostLayout<android.graphics.Bitmap>) r5, (android.graphics.Bitmap) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveSystem.<init>(com.bumptech.glide.Glide, com.bumptech.glide.gifdecoder.GifDecoder, int, int, o.updatePostLayout, android.graphics.Bitmap):void");
    }
}
