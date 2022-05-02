package o;

import id.dana.di.modules.PaymentAuthenticationModule;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;
import o.PrepareException;
import o.setAspectRatio;

public final class GlobalResourcePackage implements closeSocketConnect {
    private final PaymentAuthenticationModule getMax;
    private final PrepareException.AnonymousClass1 getMin;

    public /* synthetic */ GlobalResourcePackage(PaymentAuthenticationModule paymentAuthenticationModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(paymentAuthenticationModule, r2);
    }

    private GlobalResourcePackage(PaymentAuthenticationModule paymentAuthenticationModule, PrepareException.AnonymousClass1 r2) {
        this.getMax = paymentAuthenticationModule;
        this.getMin = r2;
    }

    public static final class length {
        public PrepareException.AnonymousClass1 getMin;
        public PaymentAuthenticationModule setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    public final void setMax(PaymentAuthenticationView paymentAuthenticationView) {
        PaymentAuthenticationModule paymentAuthenticationModule = this.getMax;
        setAspectRatio.length min = bindActivity.setMin(this.getMax);
        appxLoadFailed length2 = this.getMin.length();
        if (length2 != null) {
            appxLoadFailed appxloadfailed = length2;
            getScheme min2 = this.getMin.getMin();
            if (min2 != null) {
                getScheme getscheme = min2;
                H5Utils activeNotifications = this.getMin.getActiveNotifications();
                if (activeNotifications != null) {
                    isWebWorkerSupported iswebworkersupported = new isWebWorkerSupported(appxloadfailed, getscheme, activeNotifications);
                    showPopupWindowToast showpopupwindowtoast = new showPopupWindowToast();
                    appxLoadFailed length3 = this.getMin.length();
                    if (length3 != null) {
                        appxLoadFailed appxloadfailed2 = length3;
                        getScheme min3 = this.getMin.getMin();
                        if (min3 != null) {
                            getScheme getscheme2 = min3;
                            H5Utils activeNotifications2 = this.getMin.getActiveNotifications();
                            if (activeNotifications2 != null) {
                                isDefaultCameraFront.length(paymentAuthenticationView, onDecodeFailed.setMin(paymentAuthenticationModule, new isEnableEventBus(min, iswebworkersupported, showpopupwindowtoast, new handleTinyAppKeyEvent(appxloadfailed2, getscheme2, activeNotifications2), new showSysToast())));
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
}
