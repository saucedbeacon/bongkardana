package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;

public final class isBackButtonVisible<T> extends onLoadMoreStateChanged<T, T> {
    final removeStateDidChangeHandler getMin;

    public isBackButtonVisible(TitleBarRightButtonView.AnonymousClass4<T> r1, removeStateDidChangeHandler removestatedidchangehandler) {
        super(r1);
        this.getMin = removestatedidchangehandler;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMax(griverProgressBar, this.getMin));
    }

    static final class setMax<T> extends GriverPullRefreshService.IGriverRefreshState<T> implements GriverProgressBar<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final GriverProgressBar<? super T> downstream;
        final removeStateDidChangeHandler onFinally;
        setRefreshTips<T> qd;
        boolean syncFused;
        GriverProgressBar.UpdateRunnable upstream;

        setMax(GriverProgressBar<? super T> griverProgressBar, removeStateDidChangeHandler removestatedidchangehandler) {
            this.downstream = griverProgressBar;
            this.onFinally = removestatedidchangehandler;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                if (updateRunnable instanceof setRefreshTips) {
                    this.qd = (setRefreshTips) updateRunnable;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        public final void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        public final void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public final int requestFusion(int i) {
            setRefreshTips<T> setrefreshtips = this.qd;
            boolean z = false;
            if (setrefreshtips == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = setrefreshtips.requestFusion(i);
            if (requestFusion != 0) {
                if (requestFusion == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        public final void clear() {
            this.qd.clear();
        }

        public final boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Nullable
        public final T poll() throws Exception {
            T poll = this.qd.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public final void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.getMax();
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    SecuritySignature.getMax(th);
                }
            }
        }
    }
}
