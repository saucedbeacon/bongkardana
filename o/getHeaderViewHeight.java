package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.GriverProgressBar;

public final class getHeaderViewHeight extends setFavoriteBtnVisibility {
    final removeStateDidChangeHandler IsOverlapping;
    final RedDotManager<? super GriverProgressBar.UpdateRunnable> getMax;
    final dismissBadgeView getMin;
    final removeStateDidChangeHandler length;
    final removeStateDidChangeHandler setMax;
    final RedDotManager<? super Throwable> setMin;
    final removeStateDidChangeHandler toIntRange;

    public getHeaderViewHeight(dismissBadgeView dismissbadgeview, RedDotManager<? super GriverProgressBar.UpdateRunnable> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, removeStateDidChangeHandler removestatedidchangehandler2, removeStateDidChangeHandler removestatedidchangehandler3, removeStateDidChangeHandler removestatedidchangehandler4) {
        this.getMin = dismissbadgeview;
        this.getMax = redDotManager;
        this.setMin = redDotManager2;
        this.setMax = removestatedidchangehandler;
        this.length = removestatedidchangehandler2;
        this.IsOverlapping = removestatedidchangehandler3;
        this.toIntRange = removestatedidchangehandler4;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.getMin.getMax(new getMin(switchfavoriteiconfont));
    }

    final class getMin implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable length;
        final switchFavoriteIconFont setMax;

        getMin(switchFavoriteIconFont switchfavoriteiconfont) {
            this.setMax = switchfavoriteiconfont;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            try {
                getHeaderViewHeight.this.getMax.accept(updateRunnable);
                if (DisposableHelper.validate(this.length, updateRunnable)) {
                    this.length = updateRunnable;
                    this.setMax.onSubscribe(this);
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                updateRunnable.dispose();
                this.length = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.setMax);
            }
        }

        public final void onError(Throwable th) {
            if (this.length == DisposableHelper.DISPOSED) {
                SecuritySignature.getMax(th);
                return;
            }
            try {
                getHeaderViewHeight.this.setMin.accept(th);
                getHeaderViewHeight.this.length.getMax();
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                th = new CompositeException(th, th2);
            }
            this.setMax.onError(th);
            try {
                getHeaderViewHeight.this.IsOverlapping.getMax();
            } catch (Throwable th3) {
                registerNode.getMax(th3);
                SecuritySignature.getMax(th3);
            }
        }

        public final void onComplete() {
            if (this.length != DisposableHelper.DISPOSED) {
                try {
                    getHeaderViewHeight.this.setMax.getMax();
                    getHeaderViewHeight.this.length.getMax();
                    this.setMax.onComplete();
                    try {
                        getHeaderViewHeight.this.IsOverlapping.getMax();
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        SecuritySignature.getMax(th);
                    }
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    this.setMax.onError(th2);
                }
            }
        }

        public final void dispose() {
            try {
                getHeaderViewHeight.this.toIntRange.getMax();
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax(th);
            }
            this.length.dispose();
        }

        public final boolean isDisposed() {
            return this.length.isDisposed();
        }
    }
}
