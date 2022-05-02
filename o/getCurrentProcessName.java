package o;

import io.reactivex.exceptions.CompositeException;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import retrofit2.adapter.rxjava2.HttpException;

final class getCurrentProcessName<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    private final TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> setMin;

    getCurrentProcessName(TitleBarRightButtonView.AnonymousClass1<getAppenderManager<T>> r1) {
        this.setMin = r1;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new length(griverProgressBar));
    }

    static class length<R> implements GriverProgressBar<getAppenderManager<R>> {
        private final GriverProgressBar<? super R> setMax;
        private boolean setMin;

        public final /* synthetic */ void onNext(Object obj) {
            getAppenderManager getappendermanager = (getAppenderManager) obj;
            if (getappendermanager.getMin()) {
                this.setMax.onNext(getappendermanager.setMin);
                return;
            }
            this.setMin = true;
            HttpException httpException = new HttpException(getappendermanager);
            try {
                this.setMax.onError(httpException);
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax((Throwable) new CompositeException(httpException, th));
            }
        }

        length(GriverProgressBar<? super R> griverProgressBar) {
            this.setMax = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMax.onSubscribe(updateRunnable);
        }

        public final void onComplete() {
            if (!this.setMin) {
                this.setMax.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (!this.setMin) {
                this.setMax.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            SecuritySignature.getMax((Throwable) assertionError);
        }
    }
}
