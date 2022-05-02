package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class performLastItemChecked<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final T setMax;
    final TitleBarRightButtonView.AnonymousClass4<? extends T> setMin;

    public performLastItemChecked(TitleBarRightButtonView.AnonymousClass4<? extends T> r1, T t) {
        this.setMin = r1;
        this.setMax = t;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.setMin.subscribe(new setMax(cornerMarkingUIController, this.setMax));
    }

    static final class setMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        boolean getMax;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> getMin;
        GriverProgressBar.UpdateRunnable length;
        final T setMax;
        T setMin;

        setMax(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, T t) {
            this.getMin = cornerMarkingUIController;
            this.setMax = t;
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
            if (!this.getMax) {
                if (this.setMin != null) {
                    this.getMax = true;
                    this.length.dispose();
                    this.getMin.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.setMin = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.getMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMax = true;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.getMax) {
                this.getMax = true;
                T t = this.setMin;
                this.setMin = null;
                if (t == null) {
                    t = this.setMax;
                }
                if (t != null) {
                    this.getMin.onSuccess(t);
                } else {
                    this.getMin.onError(new NoSuchElementException());
                }
            }
        }
    }
}
