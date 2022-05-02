package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

final class onAppend<T> extends TitleBarRightButtonView.AnonymousClass1<Appender<T>> {
    private final TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> setMin;

    onAppend(TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> r1) {
        this.setMin = r1;
    }

    public final void subscribeActual(GriverProgressBar<? super Appender<T>> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar));
    }

    static class setMin<R> implements GriverProgressBar<getAppenderManager<R>> {
        private final GriverProgressBar<? super Appender<R>> setMin;

        public final /* synthetic */ void onNext(Object obj) {
            this.setMin.onNext(Appender.getMax((getAppenderManager) obj));
        }

        setMin(GriverProgressBar<? super Appender<R>> griverProgressBar) {
            this.setMin = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMin.onSubscribe(updateRunnable);
        }

        public final void onError(Throwable th) {
            try {
                this.setMin.onNext(Appender.getMin(th));
                this.setMin.onComplete();
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            this.setMin.onComplete();
        }
    }
}
