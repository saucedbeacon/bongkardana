package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setOptionType<T, U, R> extends onLoadMoreStateChanged<T, R> {
    final TitleBarRightButtonView.AnonymousClass4<? extends U> getMax;
    final removeNode<? super T, ? super U, ? extends R> length;

    public setOptionType(TitleBarRightButtonView.AnonymousClass4<T> r1, removeNode<? super T, ? super U, ? extends R> removenode, TitleBarRightButtonView.AnonymousClass4<? extends U> r3) {
        super(r1);
        this.length = removenode;
        this.getMax = r3;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        SecurityStorage securityStorage = new SecurityStorage(griverProgressBar);
        setMax setmax = new setMax(securityStorage, this.length);
        securityStorage.onSubscribe(setmax);
        this.getMax.subscribe(new length(setmax));
        this.setMin.subscribe(setmax);
    }

    static final class setMax<T, U, R> extends AtomicReference<U> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -312246233408980075L;
        final removeNode<? super T, ? super U, ? extends R> combiner;
        final GriverProgressBar<? super R> downstream;
        final AtomicReference<GriverProgressBar.UpdateRunnable> other = new AtomicReference<>();
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

        setMax(GriverProgressBar<? super R> griverProgressBar, removeNode<? super T, ? super U, ? extends R> removenode) {
            this.downstream = griverProgressBar;
            this.combiner = removenode;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.downstream.onNext(setRefreshAnimation.getMax(this.combiner.setMax(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    dispose();
                    this.downstream.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }

        public final void onComplete() {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.other);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        public final boolean setOther(GriverProgressBar.UpdateRunnable updateRunnable) {
            return DisposableHelper.setOnce(this.other, updateRunnable);
        }

        public final void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th);
        }
    }

    final class length implements GriverProgressBar<U> {
        private final setMax<T, U, R> setMax;

        public final void onComplete() {
        }

        length(setMax<T, U, R> setmax) {
            this.setMax = setmax;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMax.setOther(updateRunnable);
        }

        public final void onNext(U u) {
            this.setMax.lazySet(u);
        }

        public final void onError(Throwable th) {
            this.setMax.otherError(th);
        }
    }
}
