package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.getTransitionProperties;
import o.getVisitedHistory;

@PerActivity
public final class createAnimators implements getTransitionProperties.getMin {
    /* access modifiers changed from: private */
    public final Context getMax;
    private final getVisitedHistory length;
    /* access modifiers changed from: private */
    public final getTransitionProperties.length setMax;

    @Inject
    public createAnimators(Context context, getVisitedHistory getvisitedhistory, getTransitionProperties.length length2) {
        this.getMax = context;
        this.length = getvisitedhistory;
        this.setMax = length2;
    }

    public final void setMin(getExtraBeaconDataTracker getextrabeacondatatracker, String str, String str2) {
        this.setMax.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<save>() {
            public final /* synthetic */ void onNext(Object obj) {
                save save = (save) obj;
                createAnimators.this.setMax.dismissProgress();
                createAnimators.this.setMax.getMin(save.getLink(), save.getSplitBillId());
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                createAnimators.this.setMax.dismissProgress();
                getTransitionProperties.length max = createAnimators.this.setMax;
                Context min = createAnimators.this.getMax;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                max.onError(str);
                updateActionSheetContent.exception(DanaLogConstants.Prefix.SPLIT_BILL_DEEPLINK_PREFIX, DanaLogConstants.ExceptionType.SPLIT_BILL_EXCEPTION, th.getMessage());
            }
        }, getVisitedHistory.setMax.forParams(getextrabeacondatatracker, str, str2));
    }

    public final void setMax() {
        this.length.dispose();
    }
}
