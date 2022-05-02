package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import o.BLETraceMonitor;
import o.getSelectedIndex;
import o.onStopBleScan;

public final class setOnOptionPickListener implements getSelectedIndex.length {
    private final BLETraceMonitor getMax;
    private final onStopBleScan length;
    /* access modifiers changed from: private */
    public final getSelectedIndex.setMax setMax;

    @Inject
    public setOnOptionPickListener(getSelectedIndex.setMax setmax, BLETraceMonitor bLETraceMonitor, onStopBleScan onstopblescan) {
        this.setMax = setmax;
        this.getMax = bLETraceMonitor;
        this.length = onstopblescan;
    }

    public final void getMax(String str) {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SAVE_ON_BOARDING_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, onStopBleScan.setMax.forDisplayBottomSheetOnBoarding(str));
    }

    public final void setMax(final String str, final String str2) {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                Boolean bool = (Boolean) obj;
                setOnOptionPickListener.this.setMax.onGetBottomSheetOnBoardingAvailability(bool.booleanValue(), "");
                setOnOptionPickListener.this.setMax.setMax(bool.booleanValue(), r4);
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.GET_ON_BOARDING_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, BLETraceMonitor.setMin.forBottomSheetOnBoarding(str));
    }

    public final void setMax() {
        this.getMax.dispose();
        this.length.dispose();
    }

    public final void setMin(final String str) {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>("") {
            public final /* synthetic */ void onNext(Object obj) {
                Boolean bool = (Boolean) obj;
                setOnOptionPickListener.this.setMax.onGetBottomSheetOnBoardingAvailability(bool.booleanValue(), "");
                setOnOptionPickListener.this.setMax.setMax(bool.booleanValue(), str);
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.GET_ON_BOARDING_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, BLETraceMonitor.setMin.forBottomSheetOnBoarding(str));
    }
}
