package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.SortingSendMoneyModule;
import id.dana.sendmoney_v2.recipient.activity.SortBankAccountBottomSheetActivity;
import o.BindArray;
import o.PrepareException;
import o.b;

public final class onTimeout implements endObject {
    private b.C0007b<BindArray.getMin> getMin;
    private final PrepareException.AnonymousClass1 length;

    public /* synthetic */ onTimeout(SortingSendMoneyModule sortingSendMoneyModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(sortingSendMoneyModule, r2);
    }

    private onTimeout(SortingSendMoneyModule sortingSendMoneyModule, PrepareException.AnonymousClass1 r2) {
        this.length = r2;
        this.getMin = isScrap.getMin(GriverStartPageFailedExtension.setMin(sortingSendMoneyModule));
    }

    public static final class getMax {
        public SortingSendMoneyModule getMax;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    public final void getMin(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(sortBankAccountBottomSheetActivity, IPostMessageService$Stub$Proxy);
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
                            matchInfo.length(sortBankAccountBottomSheetActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            fromInt onNavigationEvent = this.length.onNavigationEvent();
                            if (onNavigationEvent != null) {
                                applySettings applysettings = new applySettings(onNavigationEvent);
                                fromInt onNavigationEvent2 = this.length.onNavigationEvent();
                                if (onNavigationEvent2 != null) {
                                    notifyHorizontalEdgeReached.getMin(sortBankAccountBottomSheetActivity, new Action(applysettings, new BeaconParser(onNavigationEvent2), this.getMin.get()));
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
}
