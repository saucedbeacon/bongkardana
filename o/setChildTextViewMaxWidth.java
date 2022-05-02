package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setChildTextViewMaxWidth<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final T getMax;
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;

    public setChildTextViewMaxWidth(TitleBarRightButtonView.AnonymousClass4<T> r1, T t) {
        this.setMax = r1;
        this.getMax = t;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.setMax.subscribe(new length(cornerMarkingUIController, this.getMax));
    }

    static final class length<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> getMax;
        T getMin;
        GriverProgressBar.UpdateRunnable length;
        final T setMin;

        length(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, T t) {
            this.getMax = cornerMarkingUIController;
            this.setMin = t;
        }

        public final void dispose() {
            this.length.dispose();
            this.length = DisposableHelper.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.length == DisposableHelper.DISPOSED;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.getMin = t;
        }

        public final void onError(Throwable th) {
            this.length = DisposableHelper.DISPOSED;
            this.getMin = null;
            this.getMax.onError(th);
        }

        public final void onComplete() {
            this.length = DisposableHelper.DISPOSED;
            T t = this.getMin;
            if (t != null) {
                this.getMin = null;
                this.getMax.onSuccess(t);
                return;
            }
            T t2 = this.setMin;
            if (t2 != null) {
                this.getMax.onSuccess(t2);
            } else {
                this.getMax.onError(new NoSuchElementException());
            }
        }
    }
}
