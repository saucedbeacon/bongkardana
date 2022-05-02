package o;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class prepareChildren<R> implements requestDisallowInterceptTouchEvent<R>, parseBehavior<R> {
    private static final length getMin = new length();
    @GuardedBy("this")
    @Nullable
    private GlideException FastBitmap$CoordinateSystem;
    @GuardedBy("this")
    private boolean IsOverlapping;
    @GuardedBy("this")
    private boolean equals;
    private final length getMax;
    @GuardedBy("this")
    private boolean isInside;
    private final int length;
    private final int setMax;
    private final boolean setMin;
    @GuardedBy("this")
    @Nullable
    private R toFloatRange;
    @GuardedBy("this")
    @Nullable
    private getResolvedLayoutParams toIntRange;

    public final void getMax(@Nullable Drawable drawable) {
    }

    public final void getMin() {
    }

    public final void getMin(@Nullable Drawable drawable) {
    }

    public final void setMax() {
    }

    public final void setMax(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
    }

    public final void setMin() {
    }

    public prepareChildren() {
        this(getMin);
    }

    private prepareChildren(length length2) {
        this.length = Integer.MIN_VALUE;
        this.setMax = Integer.MIN_VALUE;
        this.setMin = true;
        this.getMax = length2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1.getMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return r3
        L_0x000a:
            r0 = 1
            r2.isInside = r0     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r3 == 0) goto L_0x0018
            o.getResolvedLayoutParams r3 = r2.toIntRange     // Catch:{ all -> 0x001f }
            r2.toIntRange = r1     // Catch:{ all -> 0x001f }
            r1 = r3
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001e
            r1.getMin()
        L_0x001e:
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.prepareChildren.cancel(boolean):boolean");
    }

    public final synchronized boolean isCancelled() {
        return this.isInside;
    }

    public final synchronized boolean isDone() {
        return this.isInside || this.IsOverlapping || this.equals;
    }

    public final R get() throws InterruptedException, ExecutionException {
        try {
            return getMax((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return getMax(Long.valueOf(timeUnit.toMillis(j)));
    }

    public final void getMin(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        getdesiredanchoredchildrectwithoutconstraints.getMax(this.length, this.setMax);
    }

    public final synchronized void setMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams) {
        this.toIntRange = getresolvedlayoutparams;
    }

    @Nullable
    public final synchronized getResolvedLayoutParams getMax() {
        return this.toIntRange;
    }

    public final synchronized void length(@Nullable Drawable drawable) {
    }

    public final synchronized void getMin(@NonNull R r) {
    }

    private synchronized R getMax(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.setMin && !isDone()) {
            getDependents.setMax();
        }
        if (this.isInside) {
            throw new CancellationException();
        } else if (this.equals) {
            throw new ExecutionException(this.FastBitmap$CoordinateSystem);
        } else if (this.IsOverlapping) {
            return this.toFloatRange;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.equals) {
                throw new ExecutionException(this.FastBitmap$CoordinateSystem);
            } else if (this.isInside) {
                throw new CancellationException();
            } else if (this.IsOverlapping) {
                return this.toFloatRange;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final synchronized boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<R> layoutchildwithanchor, boolean z) {
        this.equals = true;
        this.FastBitmap$CoordinateSystem = glideException;
        notifyAll();
        return false;
    }

    public final synchronized boolean onResourceReady(R r, Object obj, layoutChildWithAnchor<R> layoutchildwithanchor, DataSource dataSource, boolean z) {
        this.IsOverlapping = true;
        this.toFloatRange = r;
        notifyAll();
        return false;
    }

    @VisibleForTesting
    static class length {
        length() {
        }
    }
}
