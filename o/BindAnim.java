package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import java.util.ArrayList;
import javax.inject.Inject;
import o.BindBitmap;
import o.stopMonitoringBeaconsInRegion;

public final class BindAnim implements BindBitmap.getMin {
    private final stopMonitoringBeaconsInRegion getMax;
    /* access modifiers changed from: private */
    public final Context getMin;
    /* access modifiers changed from: private */
    public final PhotoBrowseListener length;
    /* access modifiers changed from: private */
    public final BindBitmap.setMax setMin;

    @Inject
    BindAnim(stopMonitoringBeaconsInRegion stopmonitoringbeaconsinregion, BindBitmap.setMax setmax, PhotoBrowseListener photoBrowseListener, Context context) {
        this.getMax = stopmonitoringbeaconsinregion;
        this.setMin = setmax;
        this.length = photoBrowseListener;
        this.getMin = context;
    }

    public final void setMax() {
        this.getMax.dispose();
    }

    public final void getMin(String str, String str2) {
        this.setMin.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<byteArrayToString>() {
            public final /* synthetic */ void onNext(Object obj) {
                BindAnim.this.setMin.dismissProgress();
                BindAnim.this.setMin.setVoucherModels((ArrayList) BindAnim.this.length.apply((byteArrayToString) obj));
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                BindAnim.this.setMin.dismissProgress();
                BindBitmap.setMax min = BindAnim.this.setMin;
                Context min2 = BindAnim.this.getMin;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min2.getString(R.string.general_error_msg);
                }
                min.onError(str);
            }
        }, stopMonitoringBeaconsInRegion.setMin.forPrePay(str, str2));
    }
}
