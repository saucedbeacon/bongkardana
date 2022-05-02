package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class onPushDistance<T, R> extends TitleBarRightButtonView.AnonymousClass1<R> {
    final setMinDuration<T> setMax;
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> setMin;

    public onPushDistance(setMinDuration<T> setminduration, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable) {
        this.setMax = setminduration;
        this.setMin = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        length length2 = new length(griverProgressBar, this.setMin);
        griverProgressBar.onSubscribe(length2);
        this.setMax.getMin(length2);
    }

    static final class length<T, R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<R>, TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -8948264376121066672L;
        final GriverProgressBar<? super R> downstream;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> mapper;

        length(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable) {
            this.downstream = griverProgressBar;
            this.mapper = redDotDrawable;
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.replace(this, updateRunnable);
        }

        public final void onSuccess(T t) {
            try {
                ((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.downstream.onError(th);
            }
        }
    }
}
