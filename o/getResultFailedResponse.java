package o;

import javax.inject.Inject;
import o.GriverSessionDataExtension;
import o.setLogger;

public final class getResultFailedResponse implements GriverSessionDataExtension.setMax {
    /* access modifiers changed from: private */
    public GriverSessionDataExtension.length getMax;
    private final setLogger getMin;
    private final GriverRVInnerAppProxyImpl length;
    private final GriverLogcatLogger setMin;

    @Inject
    public getResultFailedResponse(GriverSessionDataExtension.length length2, GriverRVInnerAppProxyImpl griverRVInnerAppProxyImpl, GriverLogcatLogger griverLogcatLogger, setLogger setlogger) {
        this.getMax = length2;
        this.length = griverRVInnerAppProxyImpl;
        this.setMin = griverLogcatLogger;
        this.getMin = setlogger;
    }

    public final void getMin() {
        this.getMax.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                getResultFailedResponse.this.getMax.dismissProgress();
                getResultFailedResponse.this.getMax.setMax(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                getResultFailedResponse.this.getMax.dismissProgress();
                getResultFailedResponse.this.getMax.setMax(false);
            }
        });
    }

    public final void length() {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                super.onNext((Boolean) obj);
                GriverSessionDataExtension.length unused = getResultFailedResponse.this.getMax;
            }
        });
    }

    public final void getMax(String str, String str2) {
        this.getMax.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<GriverRVExecutorServiceImpl>() {
            public final /* synthetic */ void onNext(Object obj) {
                getResultFailedResponse.this.getMax.dismissProgress();
                getResultFailedResponse.this.getMax.setMax((GriverRVExecutorServiceImpl) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                getResultFailedResponse.this.getMax.dismissProgress();
                getResultFailedResponse.this.getMax.setMin(th.getMessage());
            }
        }, setLogger.length.forGetURL(str, str2));
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
        this.getMin.dispose();
    }
}
