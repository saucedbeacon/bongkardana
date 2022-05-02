package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class hasMenu<T> extends onLoadMoreStateChanged<T, T> {
    final int IsOverlapping;
    final boolean equals;
    final TimeUnit getMax;
    final hasCornerMarking getMin;
    final long length;
    final long setMax;

    public hasMenu(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, long j2, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i, boolean z) {
        super(r1);
        this.length = j;
        this.setMax = j2;
        this.getMax = timeUnit;
        this.getMin = hascornermarking;
        this.IsOverlapping = i;
        this.equals = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.length, this.setMax, this.getMax, this.getMin, this.IsOverlapping, this.equals));
    }

    static final class setMin<T> extends AtomicBoolean implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final GriverProgressBar<? super T> downstream;
        Throwable error;
        final setTitleBackgroundImage<Object> queue;
        final hasCornerMarking scheduler;
        final long time;
        final TimeUnit unit;
        GriverProgressBar.UpdateRunnable upstream;

        setMin(GriverProgressBar<? super T> griverProgressBar, long j, long j2, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i, boolean z) {
            this.downstream = griverProgressBar;
            this.count = j;
            this.time = j2;
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
            long j;
            long j2;
            setTitleBackgroundImage<Object> settitlebackgroundimage = this.queue;
            long now = this.scheduler.now(this.unit);
            long j3 = this.time;
            long j4 = this.count;
            boolean z = j4 == Long.MAX_VALUE;
            settitlebackgroundimage.setMax(Long.valueOf(now), t);
            while (!settitlebackgroundimage.isEmpty()) {
                if (((Long) settitlebackgroundimage.getMax()).longValue() > now - j3) {
                    if (!z) {
                        long j5 = settitlebackgroundimage.equals.get();
                        while (true) {
                            j = settitlebackgroundimage.setMin.get();
                            j2 = settitlebackgroundimage.equals.get();
                            if (j5 == j2) {
                                break;
                            }
                            j5 = j2;
                        }
                        if (((long) (((int) (j - j2)) >> 1)) <= j4) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                settitlebackgroundimage.poll();
                settitlebackgroundimage.poll();
            }
        }

        public final void onError(Throwable th) {
            this.error = th;
            drain();
        }

        public final void onComplete() {
            drain();
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                if (compareAndSet(false, true)) {
                    this.queue.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            Throwable th;
            if (compareAndSet(false, true)) {
                GriverProgressBar<? super T> griverProgressBar = this.downstream;
                setTitleBackgroundImage<Object> settitlebackgroundimage = this.queue;
                boolean z = this.delayError;
                long now = this.scheduler.now(this.unit) - this.time;
                while (!this.cancelled) {
                    if (z || (th = this.error) == null) {
                        Object poll = settitlebackgroundimage.poll();
                        if (poll == null) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                griverProgressBar.onError(th2);
                                return;
                            } else {
                                griverProgressBar.onComplete();
                                return;
                            }
                        } else {
                            Object poll2 = settitlebackgroundimage.poll();
                            if (((Long) poll).longValue() >= now) {
                                griverProgressBar.onNext(poll2);
                            }
                        }
                    } else {
                        settitlebackgroundimage.clear();
                        griverProgressBar.onError(th);
                        return;
                    }
                }
                settitlebackgroundimage.clear();
            }
        }
    }
}
