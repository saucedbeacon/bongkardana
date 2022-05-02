package o;

import androidx.annotation.NonNull;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.referral.model.MyReferralConsult;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import o.ConstraintProxy$StorageNotLowProxy;
import o.CycledLeScannerForJellyBeanMr2;
import o.executeGetAuthCode;
import o.onJsBeforeUnload;

public final class ConstraintProxy$NetworkStateProxy implements ConstraintProxy$StorageNotLowProxy.setMin {
    private final executeGetAuthCode IsOverlapping;
    private final CycledLeScannerForJellyBeanMr2 equals;
    loadUrl getMax;
    MovableFrameLayout getMin;
    /* access modifiers changed from: private */
    public final removeTinyLocalStorage isInside;
    Beacon length;
    /* access modifiers changed from: private */
    public final ConstraintProxy$StorageNotLowProxy.setMax setMax;
    GriverBottomPopupDialog setMin;
    private final getDefaultFontSize toFloatRange;
    /* access modifiers changed from: private */
    public final setBackButton toIntRange;
    private final onJsBeforeUnload toString;

    @Inject
    public ConstraintProxy$NetworkStateProxy(ConstraintProxy$StorageNotLowProxy.setMax setmax, removeTinyLocalStorage removetinylocalstorage, executeGetAuthCode executegetauthcode, setBackButton setbackbutton, getDefaultFontSize getdefaultfontsize, CycledLeScannerForJellyBeanMr2 cycledLeScannerForJellyBeanMr2, onJsBeforeUnload onjsbeforeunload) {
        this.setMax = setmax;
        this.isInside = removetinylocalstorage;
        this.IsOverlapping = executegetauthcode;
        this.toIntRange = setbackbutton;
        this.toFloatRange = getdefaultfontsize;
        this.equals = cycledLeScannerForJellyBeanMr2;
        this.toString = onjsbeforeunload;
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
        this.IsOverlapping.dispose();
        this.toFloatRange.dispose();
        this.equals.dispose();
        this.getMin.dispose();
        this.getMax.dispose();
    }

    public final void getMin() {
        this.length.execute(new GriverAppVirtualHostProxy<List<AltBeaconParser>>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                ConstraintProxy$NetworkStateProxy.this.setMax.setReferralWidgetFeatureValue((List) ConstraintProxy$NetworkStateProxy.this.isInside.apply((List) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.REFERRAL_TAG, sb.toString());
            }
        });
    }

    public final void getMax() {
        this.setMin.execute(new GriverAppVirtualHostProxy<appxrpc>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                appxrpc appxrpc = (appxrpc) obj;
                if (appxrpc.isCampaignEnable() && appxrpc.isCampaignUpdated()) {
                    ConstraintProxy$NetworkStateProxy.this.setMax.onFinishCheckLatestReferralCampaign(ConstraintProxy$NetworkStateProxy.this.toIntRange.setMin(appxrpc));
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_CONSULT, DanaLogConstants.ExceptionType.REFERRAL_EXCEPTION, th);
            }
        });
    }

    public final void getMin(String str) {
        this.IsOverlapping.execute(new GriverAppVirtualHostProxy(), executeGetAuthCode.getMin.forReferralCampaignId(str));
    }

    public final void length() {
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                ConstraintProxy$NetworkStateProxy.this.setMax.onGetContactSyncFeature(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMax(final String str) {
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                ConstraintProxy$NetworkStateProxy.this.setMax.onCheckRegisteredUser(((Boolean) obj).booleanValue(), str);
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.logNetworkException(DanaLogConstants.BizType.CONTACT_SYNC, DanaLogConstants.ExceptionType.CONTACT_SYNC_EXCEPTION, th);
            }
        }, CycledLeScannerForJellyBeanMr2.setMin.forSyncOneContact(str));
    }

    public final void setMin() {
        this.getMin.execute(new GriverAppVirtualHostProxy<appxrpc>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                ConstraintProxy$NetworkStateProxy.this.setMax.onGetReferralConsultSuccess(ConstraintProxy$NetworkStateProxy.this.toIntRange.setMin((appxrpc) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_CONSULT, DanaLogConstants.ExceptionType.REFERRAL_EXCEPTION, th);
            }
        });
    }

    public final void length(MyReferralConsult myReferralConsult) {
        this.toString.execute(new GriverAppVirtualHostProxy<APWebSettings>() {
            public final /* synthetic */ void onNext(@NonNull Object obj) {
                ConstraintProxy$NetworkStateProxy.this.setMax.onGetDeeplinkReferralSuccess((APWebSettings) obj);
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.DEEPLINK_PREFIX, DanaLogConstants.ExceptionType.REFERRAL_EXCEPTION, th);
            }
        }, onJsBeforeUnload.getMin.forParams(myReferralConsult.length));
    }

    public final void toFloatRange() {
        this.getMax.execute(onReceivedIcon.INSTANCE, new RescheduleReceiver(this), new newConstraintProxyUpdateIntent(this));
    }

    static /* synthetic */ Unit getMax(ConstraintProxy$NetworkStateProxy constraintProxy$NetworkStateProxy, Throwable th) {
        constraintProxy$NetworkStateProxy.setMax.onGetMessageTemplateError();
        updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.REFERRAL_MESSAGE_TEMPLATE, DanaLogConstants.ExceptionType.REFERRAL_EXCEPTION, th);
        return null;
    }
}
