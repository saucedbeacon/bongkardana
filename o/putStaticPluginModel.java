package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.MerchantDetailModule;
import id.dana.nearbyme.di.module.NearbyTrackerModule;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import o.GriverDefaultWebViewReceivedErrorExtension;
import o.GriverFileChooserActivity;
import o.GriverTransActivity;
import o.PrepareException;
import o.SettingMenu;
import o.ShareMenu;
import o.UniformLocalAuthDialogExtensionImpl;
import o.b;
import o.d;

public final class putStaticPluginModel implements getRuntimeAppId {
    private b.C0007b<GriverTransActivity.Lite1.setMax> FastBitmap$CoordinateSystem;
    private b.C0007b<GriverTransActivity.Lite1.setMin> IsOverlapping;
    private b.C0007b<setStorageProxy> equals;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<s> getMin;
    private b.C0007b<GriverTransActivity.Main> isInside;
    private b.C0007b<ShareMenu> length;
    private b.C0007b<ShareMenu.AnonymousClass1> setMax;
    private b.C0007b<Context> setMin;
    private b.C0007b<t> toFloatRange;
    private b.C0007b<isValid> toIntRange;

    public /* synthetic */ putStaticPluginModel(MerchantDetailModule merchantDetailModule, NearbyTrackerModule nearbyTrackerModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(merchantDetailModule, nearbyTrackerModule, r3);
    }

    private putStaticPluginModel(MerchantDetailModule merchantDetailModule, NearbyTrackerModule nearbyTrackerModule, PrepareException.AnonymousClass1 r4) {
        this.getMax = r4;
        getMax getmax = new getMax(r4);
        this.setMin = getmax;
        SettingMenu.AnonymousClass1.AnonymousClass1 min = SettingMenu.AnonymousClass1.AnonymousClass1.setMin(getmax);
        this.length = min;
        this.setMax = isScrap.getMin(GriverPageAbnormalExtension.setMin(nearbyTrackerModule, min));
        d.AnonymousClass3.AnonymousClass1 length2 = d.AnonymousClass3.AnonymousClass1.length(this.setMin);
        this.getMin = length2;
        this.toFloatRange = isScrap.getMin(GriverDefaultWebViewReceivedErrorExtension.AnonymousClass1.setMin(nearbyTrackerModule, length2));
        this.IsOverlapping = isScrap.getMin(findClass.length(merchantDetailModule));
        setMax setmax = new setMax(r4);
        this.equals = setmax;
        getAppInfoDaoDescComparator create = getAppInfoDaoDescComparator.create(setmax);
        this.toIntRange = create;
        GriverTransActivity.LiteBase max = GriverTransActivity.LiteBase.setMax(this.IsOverlapping, create, UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.ClickNameListener.length());
        this.isInside = max;
        this.FastBitmap$CoordinateSystem = isScrap.getMin(getActualTypeArguments.getMin(merchantDetailModule, max));
    }

    public static final class length {
        public MerchantDetailModule getMax;
        public PrepareException.AnonymousClass1 getMin;
        public NearbyTrackerModule setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 getMin;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    public final void getMin(MerchantDetailActivity merchantDetailActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(merchantDetailActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.getMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(merchantDetailActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            GriverFileChooserActivity.AnonymousClass1.setMax(merchantDetailActivity, this.setMax.get());
                            GriverFileChooserActivity.AnonymousClass1.setMin(merchantDetailActivity, this.toFloatRange.get());
                            GriverFileChooserActivity.AnonymousClass1.length(merchantDetailActivity, this.FastBitmap$CoordinateSystem.get());
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
