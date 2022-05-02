package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import o.CameraView;
import o.PrepareContextUitls;

public final class setActivityOrFragment implements CameraView.setMin {
    private final PrepareContextUitls length;
    /* access modifiers changed from: private */
    public final access$2108 setMax;
    /* access modifiers changed from: private */
    public final CameraView.length setMin;

    @Inject
    public setActivityOrFragment(CameraView.length length2, PrepareContextUitls prepareContextUitls, access$2108 access_2108) {
        this.setMin = length2;
        this.length = prepareContextUitls;
        this.setMax = access_2108;
    }

    public final void setMin() {
        this.length.execute(new GriverAppVirtualHostProxy<List<getMonitorToken>>() {
            final /* synthetic */ int setMin = 2;

            public final /* synthetic */ void onNext(Object obj) {
                CameraView.length max = setActivityOrFragment.this.setMin;
                access$2108 unused = setActivityOrFragment.this.setMax;
                max.getMax(access$2108.getMin((List) obj, this.setMin));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.SELECTED_PAYER_TAG, sb.toString());
            }
        }, PrepareContextUitls.setMax.forGetRecentRecipient(10, 2, 2));
    }

    public final void setMax() {
        this.length.dispose();
    }
}
