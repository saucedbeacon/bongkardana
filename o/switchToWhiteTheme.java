package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class switchToWhiteTheme<T, U, V> extends TitleBarRightButtonView.AnonymousClass1<V> {
    final Iterable<U> getMin;
    final removeNode<? super T, ? super U, ? extends V> length;
    final TitleBarRightButtonView.AnonymousClass1<? extends T> setMax;

    public switchToWhiteTheme(TitleBarRightButtonView.AnonymousClass1<? extends T> r1, Iterable<U> iterable, removeNode<? super T, ? super U, ? extends V> removenode) {
        this.setMax = r1;
        this.getMin = iterable;
        this.length = removenode;
    }

    public final void subscribeActual(GriverProgressBar<? super V> griverProgressBar) {
        try {
            Iterator it = (Iterator) setRefreshAnimation.getMax(this.getMin.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
                } else {
                    this.setMax.subscribe(new length(griverProgressBar, it, this.length));
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
            }
        } catch (Throwable th2) {
            registerNode.getMax(th2);
            EmptyDisposable.error(th2, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class length<T, U, V> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final removeNode<? super T, ? super U, ? extends V> getMax;
        final GriverProgressBar<? super V> getMin;
        GriverProgressBar.UpdateRunnable length;
        boolean setMax;
        final Iterator<U> setMin;

        length(GriverProgressBar<? super V> griverProgressBar, Iterator<U> it, removeNode<? super T, ? super U, ? extends V> removenode) {
            this.getMin = griverProgressBar;
            this.setMin = it;
            this.getMax = removenode;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.setMax) {
                try {
                    try {
                        this.getMin.onNext(setRefreshAnimation.getMax(this.getMax.setMax(t, setRefreshAnimation.getMax(this.setMin.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.setMin.hasNext()) {
                                this.setMax = true;
                                this.length.dispose();
                                this.getMin.onComplete();
                            }
                        } catch (Throwable th) {
                            registerNode.getMax(th);
                            this.setMax = true;
                            this.length.dispose();
                            this.getMin.onError(th);
                        }
                    } catch (Throwable th2) {
                        registerNode.getMax(th2);
                        this.setMax = true;
                        this.length.dispose();
                        this.getMin.onError(th2);
                    }
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    this.setMax = true;
                    this.length.dispose();
                    this.getMin.onError(th3);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMax = true;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                this.getMin.onComplete();
            }
        }
    }
}
