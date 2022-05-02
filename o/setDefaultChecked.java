package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setDefaultChecked<T> extends onLoadMoreStateChanged<T, T> {
    final TimeUnit getMax;
    final long getMin;
    final int length;
    final hasCornerMarking setMax;
    final boolean toIntRange;

    public setDefaultChecked(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i, boolean z) {
        super(r1);
        this.getMin = j;
        this.getMax = timeUnit;
        this.setMax = hascornermarking;
        this.length = i;
        this.toIntRange = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMin, this.getMax, this.setMax, this.length, this.toIntRange));
    }

    static final class getMin<T> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final GriverProgressBar<? super T> downstream;
        Throwable error;
        final setTitleBackgroundImage<Object> queue;
        final hasCornerMarking scheduler;
        final long time;
        final TimeUnit unit;
        GriverProgressBar.UpdateRunnable upstream;

        getMin(GriverProgressBar<? super T> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = hascornermarking;
            this.queue = new setTitleBackgroundImage<>(i);
            this.delayError = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.queue.setMax(Long.valueOf(this.scheduler.now(this.unit)), t);
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
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                GriverProgressBar<? super T> griverProgressBar = this.downstream;
                setTitleBackgroundImage<Object> settitlebackgroundimage = this.queue;
                boolean z = this.delayError;
                TimeUnit timeUnit = this.unit;
                hasCornerMarking hascornermarking = this.scheduler;
                long j = this.time;
                int i = 1;
                while (!this.cancelled) {
                    boolean z2 = this.done;
                    Long l = (Long) settitlebackgroundimage.getMax();
                    boolean z3 = l == null;
                    long now = hascornermarking.now(timeUnit);
                    if (!z3 && l.longValue() > now - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.error;
                            if (th != null) {
                                this.queue.clear();
                                griverProgressBar.onError(th);
                                return;
                            } else if (z3) {
                                griverProgressBar.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                griverProgressBar.onError(th2);
                                return;
                            } else {
                                griverProgressBar.onComplete();
                                return;
                            }
                        }
                    }
                    if (!z3) {
                        settitlebackgroundimage.poll();
                        griverProgressBar.onNext(settitlebackgroundimage.poll());
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                this.queue.clear();
            }
        }
    }
}
