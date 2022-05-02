package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import o.setBadgeInfo;

public final class setMakeTitleMax implements setBadgeInfo.getMax {
    /* access modifiers changed from: private */
    public int getMax;
    /* access modifiers changed from: private */
    public setBadgeInfo.setMin getMin;
    private setNetworkAvailable length;
    private canGoBackOrForward setMax;
    /* access modifiers changed from: private */
    public u setMin;

    @Inject
    public setMakeTitleMax(setBadgeInfo.setMin setmin, canGoBackOrForward cangobackorforward, setNetworkAvailable setnetworkavailable, u uVar) {
        this.getMin = setmin;
        this.setMax = cangobackorforward;
        this.length = setnetworkavailable;
        this.setMin = uVar;
    }

    public final void getMin() {
        this.setMax.execute(new GriverAppVirtualHostProxy<onTooManyRedirects>() {
            public final /* synthetic */ void onNext(Object obj) {
                int unused = setMakeTitleMax.this.getMax = ((onTooManyRedirects) obj).getMaxRecipient();
                setMakeTitleMax.this.length.execute(new GriverAppVirtualHostProxy<onReceivedError>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        setMakeTitleMax.this.getMin.onFinishGetSplitBillConfig(setMakeTitleMax.this.getMax, (access$2900) setMakeTitleMax.this.setMin.apply((onReceivedError) obj));
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        StringBuilder sb = new StringBuilder("onError: ");
                        sb.append(th.getMessage());
                        updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT_BILL_TAG, sb.toString());
                    }
                });
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT_BILL_TAG, sb.toString());
            }
        });
    }

    public final void setMax() {
        this.setMax.dispose();
        this.length.dispose();
    }
}
