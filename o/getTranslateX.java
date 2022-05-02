package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.getScaleY;
import o.onReceivedHttpAuthRequest;
import o.shouldOverrideKeyEvent;

@PerActivity
public final class getTranslateX implements getScaleY.length {
    private final onReceivedHttpAuthRequest getMin;
    /* access modifiers changed from: private */
    public final getScaleY.getMin length;
    private final APWebViewListener setMax;
    /* access modifiers changed from: private */
    public final notifyBLECharacteristicValueChange setMin;

    @Inject
    public getTranslateX(getScaleY.getMin getmin, APWebViewListener aPWebViewListener, onReceivedHttpAuthRequest onreceivedhttpauthrequest, notifyBLECharacteristicValueChange notifyblecharacteristicvaluechange) {
        this.length = getmin;
        this.setMax = aPWebViewListener;
        this.getMin = onreceivedhttpauthrequest;
        this.setMin = notifyblecharacteristicvaluechange;
    }

    public final void getMin(String str) {
        this.length.showProgress();
        this.setMax.execute(new GriverAppVirtualHostProxy<onEmbedViewDestory>() {
            public final /* synthetic */ void onNext(Object obj) {
                getTranslateX.this.length.dismissProgress();
                getScaleY.getMin min = getTranslateX.this.length;
                notifyBLECharacteristicValueChange unused = getTranslateX.this.setMin;
                min.onGetFeeds(notifyBLECharacteristicValueChange.getMax((onEmbedViewDestory) obj));
            }

            public final void onError(Throwable th) {
                getTranslateX.this.length.dismissProgress();
                getTranslateX.this.length.onError(th.getMessage());
            }
        }, shouldOverrideKeyEvent.setMax.forGetFeeds(10, str));
    }

    public final void length(final String str) {
        this.length.onDeletingFeeds(str);
        this.getMin.execute(new GriverAppVirtualHostProxy<getEmbedView>() {
            public final /* synthetic */ void onNext(Object obj) {
                getEmbedView getembedview = (getEmbedView) obj;
                if (getembedview.isSuccess()) {
                    getTranslateX.this.length.onDeleted(str);
                    return;
                }
                getTranslateX.this.length.onDeleteFailed(str);
                getTranslateX.this.length.onError(getembedview.getErrorMessage());
            }

            public final void onError(Throwable th) {
                getTranslateX.this.length.onDeleteFailed(str);
                getTranslateX.this.length.onError(th.getMessage());
            }
        }, onReceivedHttpAuthRequest.length.forDeleteFeeds(str));
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
    }
}
