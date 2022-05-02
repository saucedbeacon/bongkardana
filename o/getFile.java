package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

final class getFile<T> extends TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> {
    private final initLater<T> length;

    getFile(initLater<T> initlater) {
        this.length = initlater;
    }

    public final void subscribeActual(GriverProgressBar<? super getAppenderManager<T>> griverProgressBar) {
        boolean z;
        initLater<T> min = this.length.setMin();
        length length2 = new length(min);
        griverProgressBar.onSubscribe(length2);
        try {
            getAppenderManager<T> max = min.getMax();
            if (!length2.isDisposed()) {
                griverProgressBar.onNext(max);
            }
            if (!length2.isDisposed()) {
                try {
                    griverProgressBar.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            registerNode.getMax(th);
            if (z) {
                SecuritySignature.getMax(th);
            } else if (!length2.isDisposed()) {
                try {
                    griverProgressBar.onError(th);
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    SecuritySignature.getMax((Throwable) new CompositeException(th, th3));
                }
            }
        }
    }

    static final class length implements GriverProgressBar.UpdateRunnable {
        private final initLater<?> getMax;
        private volatile boolean getMin;

        length(initLater<?> initlater) {
            this.getMax = initlater;
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
