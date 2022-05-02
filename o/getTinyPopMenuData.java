package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getTinyPopMenuData<T> extends isCornerMarkingShow<T> {
    final removeNode<T, T, T> length;
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;

    public getTinyPopMenuData(TitleBarRightButtonView.AnonymousClass4<T> r1, removeNode<T, T, T> removenode) {
        this.setMax = r1;
        this.length = removenode;
    }

    public final void length(setOptionMenuIcon<? super T> setoptionmenuicon) {
        this.setMax.subscribe(new setMax(setoptionmenuicon, this.length));
    }

    static final class setMax<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        boolean getMax;
        final setOptionMenuIcon<? super T> getMin;
        GriverProgressBar.UpdateRunnable length;
        final removeNode<T, T, T> setMax;
        T setMin;

        setMax(setOptionMenuIcon<? super T> setoptionmenuicon, removeNode<T, T, T> removenode) {
            this.getMin = setoptionmenuicon;
            this.setMax = removenode;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.length, updateRunnable)) {
                this.length = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.getMax) {
                T t2 = this.setMin;
                if (t2 == null) {
                    this.setMin = t;
                    return;
                }
                try {
                    this.setMin = setRefreshAnimation.getMax(this.setMax.setMax(t2, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.length.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.getMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMax = true;
            this.setMin = null;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.getMax) {
                this.getMax = true;
                T t = this.setMin;
                this.setMin = null;
                if (t != null) {
                    this.getMin.onSuccess(t);
                } else {
                    this.getMin.onComplete();
                }
            }
        }

        public final void dispose() {
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }
    }
}
