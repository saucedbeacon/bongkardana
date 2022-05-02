package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.MerchantDetailReviewModule;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import o.PrepareException;
import o.SettingMenu;
import o.ShareMenu;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;

public final class hasData implements SubPackageBridgeExtension {
    private b.C0007b<getCommonResources> IsOverlapping;
    private b.C0007b<setStorageProxy> equals;
    private b.C0007b<Context> getMax;
    private final PrepareException.AnonymousClass1 getMin;
    private b.C0007b<getCancelBtn> isInside;
    private b.C0007b<ShareMenu> length;
    private b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length> setMax;
    private b.C0007b<ShareMenu.AnonymousClass1> setMin;
    private b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin> toFloatRange;
    private b.C0007b<getDownloadFile> toIntRange;

    public /* synthetic */ hasData(MerchantDetailReviewModule merchantDetailReviewModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantDetailReviewModule, r2);
    }

    private hasData(MerchantDetailReviewModule merchantDetailReviewModule, PrepareException.AnonymousClass1 r3) {
        this.getMin = r3;
        length length2 = new length(r3);
        this.getMax = length2;
        SettingMenu.AnonymousClass1.AnonymousClass1 min = SettingMenu.AnonymousClass1.AnonymousClass1.setMin(length2);
        this.length = min;
        this.setMin = isScrap.getMin(getOwnerType.getMin(merchantDetailReviewModule, min));
        this.setMax = isScrap.getMin(ParameterizedTypeImpl.setMin(merchantDetailReviewModule));
        this.equals = new getMin(r3);
        getMax getmax = new getMax(r3);
        this.IsOverlapping = getmax;
        isInstalled create = isInstalled.create(this.equals, getmax);
        this.toIntRange = create;
        UniformOptionMenuPanelExtensionImpl.AnonymousClass8 length3 = UniformOptionMenuPanelExtensionImpl.AnonymousClass8.length(this.setMax, create);
        this.isInside = length3;
        this.toFloatRange = isScrap.getMin(getKoltinConstructorParameters.getMax(merchantDetailReviewModule, length3));
    }

    public static final class setMin {
        public PrepareException.AnonymousClass1 length;
        public MerchantDetailReviewModule setMax;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.getMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(MerchantReviewDetailActivity merchantReviewDetailActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(merchantReviewDetailActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.getMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(merchantReviewDetailActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            GRVAppFavoriteMenuItem.setMax(merchantReviewDetailActivity, this.setMin.get());
                            GRVAppFavoriteMenuItem.setMax(merchantReviewDetailActivity, this.toFloatRange.get());
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
}
