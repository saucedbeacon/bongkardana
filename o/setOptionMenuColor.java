package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setOptionMenuColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final setMinDuration<? extends T> getMin;
    final T length;
    final RedDotDrawable<? super Throwable, ? extends T> setMin;

    public setOptionMenuColor(setMinDuration<? extends T> setminduration, RedDotDrawable<? super Throwable, ? extends T> redDotDrawable, T t) {
        this.getMin = setminduration;
        this.setMin = redDotDrawable;
        this.length = t;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.getMin.getMin(new setMax(cornerMarkingUIController));
    }

    final class setMax implements TitleBarRightButtonView.CornerMarkingUIController<T> {
        private final TitleBarRightButtonView.CornerMarkingUIController<? super T> getMax;

        setMax(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
            this.getMax = cornerMarkingUIController;
        }

        public final void onError(Throwable th) {
            T t;
            if (setOptionMenuColor.this.setMin != null) {
                try {
                    t = setOptionMenuColor.this.setMin.apply(th);
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    this.getMax.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = setOptionMenuColor.this.length;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.getMax.onError(nullPointerException);
                return;
            }
            this.getMax.onSuccess(t);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMax.onSubscribe(updateRunnable);
        }

        public final void onSuccess(T t) {
            this.getMax.onSuccess(t);
        }
    }
}
