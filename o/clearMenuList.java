package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;

public final class clearMenuList<T> extends onLoadMoreStateChanged<T, T> {
    final hasCornerMarking getMax;
    final TimeUnit getMin;
    final long setMax;

    public clearMenuList(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        super(r1);
        this.setMax = j;
        this.getMin = timeUnit;
        this.getMax = hascornermarking;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMin(new SecurityStorage(griverProgressBar), this.setMax, this.getMin, this.getMax.createWorker()));
    }

    static final class setMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final GriverProgressBar<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        GriverProgressBar.UpdateRunnable upstream;
        final hasCornerMarking.getMin worker;

        setMin(GriverProgressBar<? super T> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking.getMin getmin) {
            this.downstream = griverProgressBar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = getmin;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext(t);
                GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
                DisposableHelper.replace(this, this.worker.setMin(this, this.timeout, this.unit));
            }
        }

        public final void run() {
            this.gate = false;
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public final void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        public final boolean isDisposed() {
            return this.worker.isDisposed();
        }
    }
}
