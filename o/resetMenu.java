package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;

public final class resetMenu<T> extends onLoadMoreStateChanged<T, T> {
    final long getMax;
    final boolean getMin;
    final hasCornerMarking length;
    final TimeUnit setMax;

    public resetMenu(TitleBarRightButtonView.AnonymousClass1<T> r1, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, boolean z) {
        super(r1);
        this.getMax = j;
        this.setMax = timeUnit;
        this.length = hascornermarking;
        this.getMin = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMax(griverProgressBar, this.getMax, this.setMax, this.length.createWorker(), this.getMin));
    }

    static final class getMax<T> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final GriverProgressBar<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        GriverProgressBar.UpdateRunnable upstream;
        final hasCornerMarking.getMin worker;

        getMax(GriverProgressBar<? super T> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking.getMin getmin, boolean z) {
            this.downstream = griverProgressBar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = getmin;
            this.emitLast = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.latest.set(t);
            drain();
        }

        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public final void onComplete() {
            this.done = true;
            drain();
        }

        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet((Object) null);
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void run() {
            this.timerFired = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                GriverProgressBar<? super T> griverProgressBar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (!z || this.error == null) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (!z2 && this.emitLast) {
                                griverProgressBar.onNext(andSet);
                            }
                            griverProgressBar.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        if (z2) {
                            if (this.timerFired) {
                                this.timerRunning = false;
                                this.timerFired = false;
                            }
                        } else if (!this.timerRunning || this.timerFired) {
                            griverProgressBar.onNext(atomicReference.getAndSet((Object) null));
                            this.timerFired = false;
                            this.timerRunning = true;
                            this.worker.setMin(this, this.timeout, this.unit);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                        griverProgressBar.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                atomicReference.lazySet((Object) null);
            }
        }
    }
}
