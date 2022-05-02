package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.social.di.module.AccountDeactivationModule;
import id.dana.social.view.activity.AccountDeactivationActivity;
import o.AUBaseDialog;
import o.AUTitleBar;
import o.GriverOpenAuthExtension;
import o.PrepareException;

public final class addButtonViewToRight implements setBackButtonGone {
    private final PrepareException.AnonymousClass1 length;
    private final AccountDeactivationModule setMax;

    public /* synthetic */ addButtonViewToRight(AccountDeactivationModule accountDeactivationModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(accountDeactivationModule, r2);
    }

    private addButtonViewToRight(AccountDeactivationModule accountDeactivationModule, PrepareException.AnonymousClass1 r2) {
        this.length = r2;
        this.setMax = accountDeactivationModule;
    }

    public static final class length {
        public AccountDeactivationModule getMax;
        public PrepareException.AnonymousClass1 getMin;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    public final void length(AccountDeactivationActivity accountDeactivationActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(accountDeactivationActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.length.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.length.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.length.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(accountDeactivationActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            AccountDeactivationModule accountDeactivationModule = this.setMax;
                            AUTitleBar.getMin max = AntUI.getMax(this.setMax);
                            isShortUuid packageName = this.length.getPackageName();
                            if (packageName != null) {
                                CharacteristicProperty characteristicProperty = new CharacteristicProperty(packageName);
                                appxLoadFailed length3 = this.length.length();
                                if (length3 != null) {
                                    appxLoadFailed appxloadfailed2 = length3;
                                    getScheme min2 = this.length.getMin();
                                    if (min2 != null) {
                                        getScheme getscheme2 = min2;
                                        getCommonResources Grayscale$Algorithm = this.length.Grayscale$Algorithm();
                                        if (Grayscale$Algorithm != null) {
                                            GriverCreateDialogParam griverCreateDialogParam = new GriverCreateDialogParam(appxloadfailed2, getscheme2, Grayscale$Algorithm);
                                            appxLoadFailed length4 = this.length.length();
                                            if (length4 != null) {
                                                appxLoadFailed appxloadfailed3 = length4;
                                                getScheme min3 = this.length.getMin();
                                                if (min3 != null) {
                                                    getScheme getscheme3 = min3;
                                                    getCommonResources Grayscale$Algorithm2 = this.length.Grayscale$Algorithm();
                                                    if (Grayscale$Algorithm2 != null) {
                                                        AUBaseDialog.AnonymousClass2.length(accountDeactivationActivity, setIconfontTypeface.getMin(accountDeactivationModule, new getAmountToScroll(max, characteristicProperty, griverCreateDialogParam, new GriverOpenAuthExtension.RevokeCallback(appxloadfailed3, getscheme3, Grayscale$Algorithm2))));
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
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
