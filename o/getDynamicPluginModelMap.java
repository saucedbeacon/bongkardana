package o;

import id.dana.di.modules.MerchantDetailConfigModule;
import id.dana.di.modules.MerchantDetailMenuModule;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantDetailMenuView;
import o.GriverBaseFragmentActivity;
import o.IdentityHashMap;
import o.PrepareException;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;

public final class getDynamicPluginModelMap implements RuntimeVersionChecker {
    private b.C0007b<GriverSecurityManager> getMax;
    private b.C0007b<createPayloadsIfNeeded> getMin;
    private b.C0007b<GriverBaseFragmentActivity.getMax> isInside;
    private b.C0007b<GriverBaseFragmentActivity.getMin> length;
    private b.C0007b<isQAndAbove> setMax;
    private b.C0007b<getShortName> setMin;
    private b.C0007b<showDeniedForCamera> toFloatRange;

    public /* synthetic */ getDynamicPluginModelMap(MerchantDetailConfigModule merchantDetailConfigModule, MerchantDetailMenuModule merchantDetailMenuModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(merchantDetailConfigModule, merchantDetailMenuModule, r3);
    }

    private getDynamicPluginModelMap(MerchantDetailConfigModule merchantDetailConfigModule, MerchantDetailMenuModule merchantDetailMenuModule, PrepareException.AnonymousClass1 r4) {
        getMax getmax = new getMax(r4);
        this.setMin = getmax;
        this.getMin = isScrap.getMin(IdentityHashMap.Entry.length(merchantDetailMenuModule, getmax));
        this.length = isScrap.getMin(getFieldType.getMax(merchantDetailConfigModule));
        getMin getmin = new getMin(r4);
        this.getMax = getmin;
        isNAndAbove create = isNAndAbove.create(getmin);
        this.setMax = create;
        b.C0007b<showDeniedForCamera> min = isScrap.getMin(GriverFileChooserActivity.length(this.length, create));
        this.toFloatRange = min;
        this.isInside = isScrap.getMin(ValueFilter.getMin(merchantDetailConfigModule, min));
    }

    public static length setMin() {
        return new length((byte) 0);
    }

    public static final class length {
        public PrepareException.AnonymousClass1 length;
        public MerchantDetailConfigModule setMax;
        public MerchantDetailMenuModule setMin;

        /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMax implements b.C0007b<getShortName> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getShortName ITrustedWebActivityCallback$Default = this.setMax.ITrustedWebActivityCallback$Default();
            if (ITrustedWebActivityCallback$Default != null) {
                return ITrustedWebActivityCallback$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<GriverSecurityManager> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverSecurityManager RatingCompat$Style = this.setMax.RatingCompat$Style();
            if (RatingCompat$Style != null) {
                return RatingCompat$Style;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(MerchantDetailMenuView merchantDetailMenuView) {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass4.setMin(merchantDetailMenuView, this.getMin.get());
        UniformOptionMenuPanelExtensionImpl.AnonymousClass4.getMax(merchantDetailMenuView, this.isInside.get());
    }
}
