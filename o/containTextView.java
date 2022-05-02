package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class containTextView<T> extends isCornerMarkingShow<T> {
    final TitleBarRightButtonView.AnonymousClass4<T> getMin;

    public containTextView(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.getMin = r1;
    }

    public final void length(setOptionMenuIcon<? super T> setoptionmenuicon) {
        this.getMin.subscribe(new getMax(setoptionmenuicon));
    }

    static final class getMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        T getMax;
        GriverProgressBar.UpdateRunnable getMin;
        final setOptionMenuIcon<? super T> setMin;

        getMax(setOptionMenuIcon<? super T> setoptionmenuicon) {
            this.setMin = setoptionmenuicon;
        }

        public final void dispose() {
            this.getMin.dispose();
            this.getMin = DisposableHelper.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.getMin == DisposableHelper.DISPOSED;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMin, updateRunnable)) {
                this.getMin = updateRunnable;
                this.setMin.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.getMax = t;
        }

        public final void onError(Throwable th) {
            this.getMin = DisposableHelper.DISPOSED;
            this.getMax = null;
            this.setMin.onError(th);
        }

        public final void onComplete() {
            this.getMin = DisposableHelper.DISPOSED;
            T t = this.getMax;
            if (t != null) {
                this.getMax = null;
                this.setMin.onSuccess(t);
                return;
            }
            this.setMin.onComplete();
        }
    }
}
