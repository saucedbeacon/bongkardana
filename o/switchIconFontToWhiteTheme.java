package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class switchIconFontToWhiteTheme<T, R> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<R> {
    final TitleBarRightButtonView.AnonymousClass4<T> getMax;
    final R setMax;
    final removeNode<R, ? super T, R> setMin;

    public switchIconFontToWhiteTheme(TitleBarRightButtonView.AnonymousClass4<T> r1, R r, removeNode<R, ? super T, R> removenode) {
        this.getMax = r1;
        this.setMax = r;
        this.setMin = removenode;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController) {
        this.getMax.subscribe(new getMin(cornerMarkingUIController, this.setMin, this.setMax));
    }

    static final class getMin<T, R> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable getMax;
        final removeNode<R, ? super T, R> getMin;
        R length;
        final TitleBarRightButtonView.CornerMarkingUIController<? super R> setMin;

        getMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController, removeNode<R, ? super T, R> removenode, R r) {
            this.setMin = cornerMarkingUIController;
            this.length = r;
            this.getMin = removenode;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMax, updateRunnable)) {
                this.getMax = updateRunnable;
                this.setMin.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            R r = this.length;
            if (r != null) {
                try {
                    this.length = setRefreshAnimation.getMax(this.getMin.setMax(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.getMax.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.length != null) {
                this.length = null;
                this.setMin.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            R r = this.length;
            if (r != null) {
                this.length = null;
                this.setMin.onSuccess(r);
            }
        }

        public final void dispose() {
            this.getMax.dispose();
        }

        public final boolean isDisposed() {
            return this.getMax.isDisposed();
        }
    }
}
