package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.RedeemPromoCodeModule;
import id.dana.promocode.views.RedeemPromoCodeActivity;
import o.GriverResourceManager;
import o.GriverUpdateProgressExtension;
import o.PrepareException;
import o.b;

public final class getPkgStatus implements setRelatedArray {
    private b.C0007b<GriverUpdateProgressExtension.length> getMax;
    private b.C0007b<queryLastRefreshTimestamp> getMin;
    private b.C0007b<GriverChooseFileExtensionImpl> length;
    private final PrepareException.AnonymousClass1 setMax;
    private b.C0007b<GriverAppCenter> setMin;
    private b.C0007b<GriverUpdateProgressExtension.getMax> toFloatRange;

    public /* synthetic */ getPkgStatus(RedeemPromoCodeModule redeemPromoCodeModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(redeemPromoCodeModule, r2);
    }

    private getPkgStatus(RedeemPromoCodeModule redeemPromoCodeModule, PrepareException.AnonymousClass1 r3) {
        this.setMax = r3;
        this.getMax = isScrap.getMin(getMenuList.setMin(redeemPromoCodeModule));
        getMax getmax = new getMax(r3);
        this.getMin = getmax;
        GriverResourceManager.AnonymousClass3 create = GriverResourceManager.AnonymousClass3.create(getmax);
        this.setMin = create;
        GriverOptionMenuClickExtension min = GriverOptionMenuClickExtension.setMin(this.getMax, create);
        this.length = min;
        this.toFloatRange = isScrap.getMin(GriverBaseMenuItem.getMax(redeemPromoCodeModule, min));
    }

    public static final class setMin {
        public PrepareException.AnonymousClass1 setMax;
        public RedeemPromoCodeModule setMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMax implements b.C0007b<queryLastRefreshTimestamp> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            queryLastRefreshTimestamp onPlaybackStateChanged = this.length.onPlaybackStateChanged();
            if (onPlaybackStateChanged != null) {
                return onPlaybackStateChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(RedeemPromoCodeActivity redeemPromoCodeActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(redeemPromoCodeActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.setMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(redeemPromoCodeActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            PageStartedExtension.length(redeemPromoCodeActivity, this.toFloatRange.get());
                            getShortName ITrustedWebActivityCallback$Default = this.setMax.ITrustedWebActivityCallback$Default();
                            if (ITrustedWebActivityCallback$Default != null) {
                                PageStartedExtension.setMin(redeemPromoCodeActivity, ITrustedWebActivityCallback$Default);
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
