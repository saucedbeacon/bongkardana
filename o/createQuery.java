package o;

import android.content.Context;
import android.os.Bundle;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import o.handleTinyAppKeyEvent;
import o.isMainThread;

public final class createQuery implements isMainThread.getMax {
    /* access modifiers changed from: private */
    public final Context getMax;
    /* access modifiers changed from: private */
    public final isMainThread.getMin setMax;
    private final handleTinyAppKeyEvent setMin;

    public final void getMax() {
    }

    public final void getMax(String str, boolean z) {
    }

    public final void getMin(String str, Bundle bundle) {
    }

    public final void getMin(String str, String str2, boolean z) {
    }

    public final void length(String str, String str2, String str3, Boolean bool) {
    }

    public final void setMax(String str, String str2, String str3, String str4) {
    }

    public final void setMax(String str, String str2, String str3, boolean z) {
    }

    public final void setMin() {
    }

    @Inject
    public createQuery(Context context, isMainThread.getMin getmin, handleTinyAppKeyEvent handletinyappkeyevent) {
        this.getMax = context;
        this.setMax = getmin;
        this.setMin = handletinyappkeyevent;
    }

    public final void getMax(String str, String str2, boolean z, String str3, String str4) {
        this.setMax.showProgress();
        this.setMin.execute(new GriverAppVirtualHostProxy<getUid>() {
            public final void onError(Throwable th) {
                String str;
                createQuery.this.setMax.dismissProgress();
                boolean z = th instanceof NetworkException;
                if (z) {
                    isMainThread.getMin max = createQuery.this.setMax;
                    NetworkException networkException = (NetworkException) th;
                    String errorCode = networkException.getErrorCode();
                    String message = th.getMessage();
                    int leftTimes = networkException.getLeftTimes();
                    if (leftTimes == null) {
                        leftTimes = 0;
                    }
                    max.getMin(errorCode, message, leftTimes);
                } else {
                    isMainThread.getMin max2 = createQuery.this.setMax;
                    Context min = createQuery.this.getMax;
                    if (z) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = min.getString(R.string.general_error_msg);
                    }
                    max2.onError(str);
                }
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.SWITCH_PAYMENT_CONTROL, DanaLogConstants.ExceptionType.PAYMENT_AUTH_EXCEPTION, th);
            }

            public final /* synthetic */ void onNext(Object obj) {
                createQuery.this.setMax.dismissProgress();
                createQuery.this.setMax.getMin();
            }
        }, handleTinyAppKeyEvent.getMin.forPaymentSecuritySwitchOff(z, str, str2, str4, str3));
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
