package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class resetTitleColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final updateProgress<T> getMin;

    public resetTitleColor(updateProgress<T> updateprogress) {
        this.getMin = updateprogress;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        setMin setmin = new setMin(cornerMarkingUIController);
        cornerMarkingUIController.onSubscribe(setmin);
        try {
            this.getMin.subscribe(setmin);
        } catch (Throwable th) {
            registerNode.getMax(th);
            setmin.onError(th);
        }
    }

    static final class setMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -2467358622224974244L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;

        setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
            this.downstream = cornerMarkingUIController;
        }

        public final void onSuccess(T t) {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (get() != DisposableHelper.DISPOSED && (updateRunnable = (GriverProgressBar.UpdateRunnable) getAndSet(DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED) {
                if (t == null) {
                    try {
                        this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (updateRunnable != null) {
                            updateRunnable.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.downstream.onSuccess(t);
                }
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
            }
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                SecuritySignature.getMax(th);
            }
        }

        public final boolean tryOnError(Throwable th) {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (updateRunnable = (GriverProgressBar.UpdateRunnable) getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (updateRunnable != null) {
                    updateRunnable.dispose();
                }
            }
        }

        public final void setDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.set(this, updateRunnable);
        }

        public final void setCancellable(setShowRedPoint setshowredpoint) {
            setDisposable(new changeToState(setshowredpoint));
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }
}
