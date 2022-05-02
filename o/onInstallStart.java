package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.TwilioIdentityVerificationModule;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import o.GriverPageContainer;
import o.PrepareException;
import o.b;

public final class onInstallStart implements beforeWrite {
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<GriverPageContainer.H5CloseHandler.setMin> setMax;

    public /* synthetic */ onInstallStart(TwilioIdentityVerificationModule twilioIdentityVerificationModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(twilioIdentityVerificationModule, r2);
    }

    private onInstallStart(TwilioIdentityVerificationModule twilioIdentityVerificationModule, PrepareException.AnonymousClass1 r2) {
        this.getMax = r2;
        this.setMax = isScrap.getMin(hasDomainPermission.length(twilioIdentityVerificationModule));
    }

    public static final class setMax {
        public PrepareException.AnonymousClass1 getMax;
        public TwilioIdentityVerificationModule setMax;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    public final void getMin(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(twilioIdentityVerificationActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length = this.getMax.length();
                if (length != null) {
                    appxLoadFailed appxloadfailed = length;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(twilioIdentityVerificationActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            Context max = this.getMax.getMax();
                            if (max != null) {
                                Context context = max;
                                GriverPageContainer.H5CloseHandler.setMin setmin = this.setMax.get();
                                isPacketDistinct mayLaunchUrl = this.getMax.mayLaunchUrl();
                                if (mayLaunchUrl != null) {
                                    setBeacons setbeacons = new setBeacons(mayLaunchUrl);
                                    isPacketDistinct mayLaunchUrl2 = this.getMax.mayLaunchUrl();
                                    if (mayLaunchUrl2 != null) {
                                        onMotionEventUp.getMin(twilioIdentityVerificationActivity, new TinyAppBackHomeExtension(context, setmin, setbeacons, new setUpdateNotifier(mayLaunchUrl2)));
                                        Context max2 = this.getMax.getMax();
                                        if (max2 != null) {
                                            onMotionEventUp.getMax(twilioIdentityVerificationActivity, new showTwoWheelDialog(max2));
                                            return;
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
