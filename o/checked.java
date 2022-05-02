package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class checked<T> extends isCornerMarkingShow<T> {
    final TitleBarRightButtonView.AnonymousClass4<T> getMax;

    public checked(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.getMax = r1;
    }

    public final void length(setOptionMenuIcon<? super T> setoptionmenuicon) {
        this.getMax.subscribe(new setMin(setoptionmenuicon));
    }

    static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final setOptionMenuIcon<? super T> getMax;
        GriverProgressBar.UpdateRunnable getMin;
        T setMax;
        boolean setMin;

        setMin(setOptionMenuIcon<? super T> setoptionmenuicon) {
            this.getMax = setoptionmenuicon;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.getMax.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.getMin.dispose();
        }

        public final boolean isDisposed() {
            return this.getMin.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.setMin) {
                if (this.setMax != null) {
                    this.setMin = true;
                    this.getMin.dispose();
                    this.getMax.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.setMax = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.setMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMin = true;
            this.getMax.onError(th);
        }

        public final void onComplete() {
            if (!this.setMin) {
                this.setMin = true;
                T t = this.setMax;
                this.setMax = null;
                if (t == null) {
                    this.getMax.onComplete();
                } else {
                    this.getMax.onSuccess(t);
                }
            }
        }
    }
}
