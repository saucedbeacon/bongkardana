package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.setTrimPathOffset;
import o.shouldOverrideKeyEvent;

@PerActivity
public class getLocalMatrix implements setTrimPathOffset.setMax {
    /* access modifiers changed from: private */
    public final setTrimPathOffset.setMin getMax;
    private onEmbedViewAttachedToWebView getMin;
    private final onUnhandledKeyEvent length;
    /* access modifiers changed from: private */
    public final notifyBLECharacteristicValueChange setMax;

    @Inject
    public getLocalMatrix(setTrimPathOffset.setMin setmin, onUnhandledKeyEvent onunhandledkeyevent, notifyBLECharacteristicValueChange notifyblecharacteristicvaluechange, onEmbedViewAttachedToWebView onembedviewattachedtowebview) {
        this.getMax = setmin;
        this.length = onunhandledkeyevent;
        this.setMax = notifyblecharacteristicvaluechange;
        this.getMin = onembedviewattachedtowebview;
    }

    public final void getMax(int i, String str) {
        this.getMax.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<onEmbedViewDestory>() {
            public final /* synthetic */ void onNext(Object obj) {
                getLocalMatrix.this.getMax.dismissProgress();
                setTrimPathOffset.setMin min = getLocalMatrix.this.getMax;
                notifyBLECharacteristicValueChange unused = getLocalMatrix.this.setMax;
                min.length(notifyBLECharacteristicValueChange.getMax((onEmbedViewDestory) obj));
            }

            public final void onError(Throwable th) {
                String message = th.getMessage() == null ? "" : th.getMessage();
                getLocalMatrix.this.getMax.dismissProgress();
                getLocalMatrix.this.getMax.onError(message);
            }
        }, shouldOverrideKeyEvent.setMax.forGetFeeds(i, str));
    }

    public final void length(final Boolean bool) {
        this.getMax.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<onEmbedViewDestory>() {
            public final /* synthetic */ void onNext(Object obj) {
                getLocalMatrix.this.getMax.dismissProgress();
                setTrimPathOffset.setMin min = getLocalMatrix.this.getMax;
                notifyBLECharacteristicValueChange unused = getLocalMatrix.this.setMax;
                min.setMax(notifyBLECharacteristicValueChange.getMax((onEmbedViewDestory) obj), bool);
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GET_DEFAULT_FEED_FROM_CONFIG, th.getMessage(), th);
            }
        });
    }

    public void setMax() {
        this.length.dispose();
    }
}
