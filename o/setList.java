package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setList<T, U extends Collection<? super T>> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<U> implements getSecondFloorView<U> {
    final Callable<U> setMax;
    final TitleBarRightButtonView.AnonymousClass4<T> setMin;

    public setList(TitleBarRightButtonView.AnonymousClass4<T> r1, int i) {
        this.setMin = r1;
        this.setMax = Functions.getMin(i);
    }

    public setList(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<U> callable) {
        this.setMin = r1;
        this.setMax = callable;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super U> cornerMarkingUIController) {
        try {
            this.setMin.subscribe(new getMin(cornerMarkingUIController, (Collection) setRefreshAnimation.getMax(this.setMax.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (TitleBarRightButtonView.CornerMarkingUIController<?>) cornerMarkingUIController);
        }
    }

    public final TitleBarRightButtonView.AnonymousClass1<U> setMax() {
        NebulaPopMenuItemHolder nebulaPopMenuItemHolder = new NebulaPopMenuItemHolder(this.setMin, this.setMax);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, nebulaPopMenuItemHolder) : nebulaPopMenuItemHolder;
    }

    static final class getMin<T, U extends Collection<? super T>> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        U getMax;
        final TitleBarRightButtonView.CornerMarkingUIController<? super U> getMin;
        GriverProgressBar.UpdateRunnable setMin;

        getMin(TitleBarRightButtonView.CornerMarkingUIController<? super U> cornerMarkingUIController, U u) {
            this.getMin = cornerMarkingUIController;
            this.getMax = u;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMin, updateRunnable)) {
                this.setMin = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMin.dispose();
        }

        public final boolean isDisposed() {
            return this.setMin.isDisposed();
        }

        public final void onNext(T t) {
            this.getMax.add(t);
        }

        public final void onError(Throwable th) {
            this.getMax = null;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            U u = this.getMax;
            this.getMax = null;
            this.getMin.onSuccess(u);
        }
    }
}
