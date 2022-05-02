package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

final class AnalyticsLogAppender<T> extends TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> {
    private final initLater<T> getMin;

    AnalyticsLogAppender(initLater<T> initlater) {
        this.getMin = initlater;
    }

    public final void subscribeActual(GriverProgressBar<? super getAppenderManager<T>> griverProgressBar) {
        initLater<T> min = this.getMin.setMin();
        setMin setmin = new setMin(min, griverProgressBar);
        griverProgressBar.onSubscribe(setmin);
        min.setMin(setmin);
    }

    static final class setMin<T> implements GriverProgressBar.UpdateRunnable, initToolsProcessIfNeeded<T> {
        private final initLater<?> getMax;
        private volatile boolean getMin;
        private final GriverProgressBar<? super getAppenderManager<T>> setMax;
        boolean setMin = false;

        setMin(initLater<?> initlater, GriverProgressBar<? super getAppenderManager<T>> griverProgressBar) {
            this.getMax = initlater;
            this.setMax = griverProgressBar;
        }

        public final void getMin(getAppenderManager<T> getappendermanager) {
            if (!this.getMin) {
                try {
                    this.setMax.onNext(getappendermanager);
                    if (!this.getMin) {
                        this.setMin = true;
                        this.setMax.onComplete();
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    SecuritySignature.getMax((Throwable) new CompositeException(th, th));
                }
            }
        }

        public final void setMax(initLater<T> initlater, Throwable th) {
            if (!initlater.getMin()) {
                try {
                    this.setMax.onError(th);
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
                }
            }
        }

        public final void dispose() {
            this.getMin = true;
            this.getMax.length();
        }

        public final boolean isDisposed() {
            return this.getMin;
        }
    }
}
