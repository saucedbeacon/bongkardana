package o;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getAnimatedVisibility;

public final class setStackedBackground<T> extends LiveData<T> {
    final AtomicBoolean FastBitmap$CoordinateSystem = new AtomicBoolean(true);
    final Runnable Grayscale$Algorithm = new Runnable() {
        @MainThread
        public final void run() {
            Executor executor;
            boolean min = setStackedBackground.this.setMin();
            if (setStackedBackground.this.FastBitmap$CoordinateSystem.compareAndSet(false, true) && min) {
                setStackedBackground setstackedbackground = setStackedBackground.this;
                if (setstackedbackground.isInside) {
                    executor = setstackedbackground.IsOverlapping.getTransactionExecutor();
                } else {
                    executor = setstackedbackground.IsOverlapping.getQueryExecutor();
                }
                executor.execute(setStackedBackground.this.toString);
            }
        }
    };
    final RoomDatabase IsOverlapping;
    private final getParentMenu Mean$Arithmetic;
    final getAnimatedVisibility.setMax hashCode;
    final boolean isInside;
    final AtomicBoolean toDoubleRange = new AtomicBoolean(false);
    final Callable<T> toIntRange;
    final Runnable toString = new Runnable() {
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x002a  */
        @androidx.annotation.WorkerThread
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                o.setStackedBackground r0 = o.setStackedBackground.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.values
                r1 = 1
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0020
                o.setStackedBackground r0 = o.setStackedBackground.this
                androidx.room.RoomDatabase r0 = r0.IsOverlapping
                o.getAnimatedVisibility r0 = r0.getInvalidationTracker()
                o.setStackedBackground r3 = o.setStackedBackground.this
                o.getAnimatedVisibility$setMax r3 = r3.hashCode
                o.getAnimatedVisibility$getMax r4 = new o.getAnimatedVisibility$getMax
                r4.<init>(r0, r3)
                r0.setMax(r4)
            L_0x0020:
                o.setStackedBackground r0 = o.setStackedBackground.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.toDoubleRange
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0061
                r0 = 0
                r3 = 0
            L_0x002c:
                o.setStackedBackground r4 = o.setStackedBackground.this     // Catch:{ all -> 0x0058 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0058 }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ all -> 0x0058 }
                if (r4 == 0) goto L_0x0049
                o.setStackedBackground r0 = o.setStackedBackground.this     // Catch:{ Exception -> 0x0040 }
                java.util.concurrent.Callable<T> r0 = r0.toIntRange     // Catch:{ Exception -> 0x0040 }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0040 }
                r3 = 1
                goto L_0x002c
            L_0x0040:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0058 }
                java.lang.String r3 = "Exception while computing database live data."
                r1.<init>(r3, r0)     // Catch:{ all -> 0x0058 }
                throw r1     // Catch:{ all -> 0x0058 }
            L_0x0049:
                if (r3 == 0) goto L_0x0050
                o.setStackedBackground r4 = o.setStackedBackground.this     // Catch:{ all -> 0x0058 }
                r4.setMax(r0)     // Catch:{ all -> 0x0058 }
            L_0x0050:
                o.setStackedBackground r0 = o.setStackedBackground.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.toDoubleRange
                r0.set(r2)
                goto L_0x0062
            L_0x0058:
                r0 = move-exception
                o.setStackedBackground r1 = o.setStackedBackground.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.toDoubleRange
                r1.set(r2)
                throw r0
            L_0x0061:
                r3 = 0
            L_0x0062:
                if (r3 == 0) goto L_0x006e
                o.setStackedBackground r0 = o.setStackedBackground.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.FastBitmap$CoordinateSystem
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0020
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStackedBackground.AnonymousClass2.run():void");
        }
    };
    final AtomicBoolean values = new AtomicBoolean(false);

    @SuppressLint({"RestrictedApi"})
    public setStackedBackground(RoomDatabase roomDatabase, getParentMenu getparentmenu, Callable<T> callable, String[] strArr) {
        this.IsOverlapping = roomDatabase;
        this.isInside = true;
        this.toIntRange = callable;
        this.Mean$Arithmetic = getparentmenu;
        this.hashCode = new getAnimatedVisibility.setMax(strArr) {
            public final void getMin(@NonNull Set<String> set) {
                skipToQueueItem length2 = skipToQueueItem.length();
                Runnable runnable = setStackedBackground.this.Grayscale$Algorithm;
                if (length2.getMin()) {
                    runnable.run();
                } else {
                    length2.setMax(runnable);
                }
            }
        };
    }

    public final void getMax() {
        Executor executor;
        super.getMax();
        this.Mean$Arithmetic.getMin.add(this);
        if (this.isInside) {
            executor = this.IsOverlapping.getTransactionExecutor();
        } else {
            executor = this.IsOverlapping.getQueryExecutor();
        }
        executor.execute(this.toString);
    }

    public final void length() {
        super.length();
        this.Mean$Arithmetic.getMin.remove(this);
    }
}
