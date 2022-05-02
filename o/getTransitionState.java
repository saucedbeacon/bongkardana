package o;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.onNewStateAttachHandlers;

final class getTransitionState {
    final ReferenceQueue<onNewStateAttachHandlers<?>> getMax;
    @Nullable
    volatile setMin getMin;
    private final Executor isInside;
    @VisibleForTesting
    final Map<setPivotY, setMax> length;
    volatile boolean setMax;
    onNewStateAttachHandlers.length setMin;
    private final boolean toIntRange;

    @VisibleForTesting
    interface setMin {
    }

    getTransitionState(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() {
            public final Thread newThread(@NonNull final Runnable runnable) {
                return new Thread(new Runnable() {
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    @VisibleForTesting
    private getTransitionState(boolean z, Executor executor) {
        this.length = new HashMap();
        this.getMax = new ReferenceQueue<>();
        this.toIntRange = z;
        this.isInside = executor;
        executor.execute(new Runnable() {
            public final void run() {
                getTransitionState gettransitionstate = getTransitionState.this;
                while (!gettransitionstate.setMax) {
                    try {
                        gettransitionstate.getMin((setMax) gettransitionstate.getMax.remove());
                        setMin setmin = gettransitionstate.getMin;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getMax(setPivotY setpivoty, onNewStateAttachHandlers<?> onnewstateattachhandlers) {
        setMax put = this.length.put(setpivoty, new setMax(setpivoty, onnewstateattachhandlers, this.getMax, this.toIntRange));
        if (put != null) {
            put.length = null;
            put.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void setMin(setPivotY setpivoty) {
        setMax remove = this.length.remove(setpivoty);
        if (remove != null) {
            remove.length = null;
            remove.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized o.onNewStateAttachHandlers<?> getMin(o.setPivotY r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<o.setPivotY, o.getTransitionState$setMax> r0 = r1.length     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            o.getTransitionState$setMax r2 = (o.getTransitionState.setMax) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            o.onNewStateAttachHandlers r0 = (o.onNewStateAttachHandlers) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.getMin((o.getTransitionState.setMax) r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTransitionState.getMin(o.setPivotY):o.onNewStateAttachHandlers");
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull setMax setmax) {
        synchronized (this) {
            this.length.remove(setmax.getMin);
            if (setmax.getMax && setmax.length != null) {
                this.setMin.setMax(setmax.getMin, new onNewStateAttachHandlers(setmax.length, true, false, setmax.getMin, this.setMin));
            }
        }
    }

    @VisibleForTesting
    static final class setMax extends WeakReference<onNewStateAttachHandlers<?>> {
        final boolean getMax;
        final setPivotY getMin;
        @Nullable
        fireTrigger<?> length;

        setMax(@NonNull setPivotY setpivoty, @NonNull onNewStateAttachHandlers<?> onnewstateattachhandlers, @NonNull ReferenceQueue<? super onNewStateAttachHandlers<?>> referenceQueue, boolean z) {
            super(onnewstateattachhandlers, referenceQueue);
            fireTrigger<?> firetrigger;
            if (setpivoty != null) {
                this.getMin = setpivoty;
                if (!onnewstateattachhandlers.getMax() || !z) {
                    firetrigger = null;
                } else {
                    fireTrigger<Z> firetrigger2 = onnewstateattachhandlers.length;
                    if (firetrigger2 != null) {
                        firetrigger = firetrigger2;
                    } else {
                        throw new NullPointerException("Argument must not be null");
                    }
                }
                this.length = firetrigger;
                this.getMax = onnewstateattachhandlers.getMax();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
    }
}
