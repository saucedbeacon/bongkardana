package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class NebulaPopMenuItemHolder<T, U extends Collection<? super T>> extends onLoadMoreStateChanged<T, U> {
    final Callable<U> setMax;

    public NebulaPopMenuItemHolder(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        super(r1);
        this.setMax = Functions.getMin(16);
    }

    public NebulaPopMenuItemHolder(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<U> callable) {
        super(r1);
        this.setMax = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        try {
            this.setMin.subscribe(new length(griverProgressBar, (Collection) setRefreshAnimation.getMax(this.setMax.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class length<T, U extends Collection<? super T>> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        U getMin;
        GriverProgressBar.UpdateRunnable setMax;
        final GriverProgressBar<? super U> setMin;

        length(GriverProgressBar<? super U> griverProgressBar, U u) {
            this.setMin = griverProgressBar;
            this.getMin = u;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                this.setMax = updateRunnable;
                this.setMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMax.dispose();
        }

        public final boolean isDisposed() {
            return this.setMax.isDisposed();
        }

        public final void onNext(T t) {
            this.getMin.add(t);
        }

        public final void onError(Throwable th) {
            this.getMin = null;
            this.setMin.onError(th);
        }

        public final void onComplete() {
            U u = this.getMin;
            this.getMin = null;
            this.setMin.onNext(u);
            this.setMin.onComplete();
        }
    }
}
