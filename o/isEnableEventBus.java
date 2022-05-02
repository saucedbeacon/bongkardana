package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.richview.profile.RiskResultType;
import javax.inject.Inject;
import o.handleTinyAppKeyEvent;
import o.setAspectRatio;

public final class isEnableEventBus implements setAspectRatio.setMax {
    /* access modifiers changed from: private */
    public final showSysToast getMax;
    private final handleTinyAppKeyEvent getMin;
    /* access modifiers changed from: private */
    public final setAspectRatio.length length;
    private final isWebWorkerSupported setMax;
    /* access modifiers changed from: private */
    public final showPopupWindowToast setMin;

    @Inject
    public isEnableEventBus(setAspectRatio.length length2, isWebWorkerSupported iswebworkersupported, showPopupWindowToast showpopupwindowtoast, handleTinyAppKeyEvent handletinyappkeyevent, showSysToast showsystoast) {
        this.length = length2;
        this.setMax = iswebworkersupported;
        this.setMin = showpopupwindowtoast;
        this.getMin = handletinyappkeyevent;
        this.getMax = showsystoast;
    }

    public final void getMax() {
        this.length.showProgress();
        this.setMax.execute(new GriverAppVirtualHostProxy<getSharedPreference>() {
            public final /* synthetic */ void onNext(Object obj) {
                isEnableEventBus.this.length.dismissProgress();
                isEnableEventBus.this.length.onSuccessInitPaymentControl((showTime) isEnableEventBus.this.setMin.apply((getSharedPreference) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                isEnableEventBus.this.length.dismissProgress();
                isEnableEventBus.this.length.onErrorInitPaymentAuth();
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.INIT_PAYMENT_CONTROL, DanaLogConstants.ExceptionType.PAYMENT_AUTH_EXCEPTION, th);
            }
        });
    }

    public final void getMin(boolean z, String str) {
        this.length.showSwitchLoading();
        this.getMin.execute(new GriverAppVirtualHostProxy<getUid>() {
            public final /* synthetic */ void onNext(Object obj) {
                getUid getuid = (getUid) obj;
                isEnableEventBus.this.length.dismissSwitchLoading();
                if (RiskResultType.ACCEPT.equals(getuid.getRisk().getResult())) {
                    isEnableEventBus.this.length.onSuccesSwitchPaymentControl((PopupWindowToast) isEnableEventBus.this.getMax.apply(getuid));
                } else {
                    isEnableEventBus.this.length.challengePassword((PopupWindowToast) isEnableEventBus.this.getMax.apply(getuid));
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                isEnableEventBus.this.length.dismissSwitchLoading();
                isEnableEventBus.this.length.onErrorSwitchPaymentAuth();
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.SWITCH_PAYMENT_CONTROL, DanaLogConstants.ExceptionType.PAYMENT_AUTH_EXCEPTION, th);
            }
        }, handleTinyAppKeyEvent.getMin.forPaymentSecuritySwitchOn(z, str));
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
    }
}
