package o;

import id.dana.di.modules.InvestmentModule;
import id.dana.investment.view.HomeInvestmentView;
import o.GriverAppLanguageExtensionImpl;
import o.GriverGeoLocationExtensionImpl;
import o.PrepareException;
import o.ResourceLoadExtension;
import o.b;

public final class writeToFile implements ResourceLoadExtension.AnonymousClass1 {
    private b.C0007b<GriverAppLanguageExtensionImpl.getMax> getMax;
    private b.C0007b<setVerifyPublicKeyProxy> getMin;
    private b.C0007b<GriverEnv> length;
    private b.C0007b<AMCSConstants> setMax;
    private b.C0007b<setDefaultFontSize> setMin;
    private b.C0007b<GriverAppLanguageExtensionImpl.length> toFloatRange;
    private b.C0007b<GriverGeoLocationExtensionImpl.AnonymousClass1> toIntRange;

    public /* synthetic */ writeToFile(InvestmentModule investmentModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(investmentModule, r2);
    }

    private writeToFile(InvestmentModule investmentModule, PrepareException.AnonymousClass1 r4) {
        this.getMax = isScrap.getMin(SerializeWriter.setMin(investmentModule));
        getMax getmax = new getMax(r4);
        this.setMin = getmax;
        this.setMax = SecurityConstants.create(getmax);
        setMin setmin = new setMin(r4);
        this.length = setmin;
        isDebuggable create = isDebuggable.create(setmin);
        this.getMin = create;
        b.C0007b<GriverGeoLocationExtensionImpl.AnonymousClass1> min = isScrap.getMin(onRender.getMax(this.getMax, this.setMax, create));
        this.toIntRange = min;
        this.toFloatRange = isScrap.getMin(writeByteArray.length(investmentModule, min));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public InvestmentModule length;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class getMax implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<GriverEnv> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverEnv metadata = this.getMin.getMetadata();
            if (metadata != null) {
                return metadata;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(HomeInvestmentView homeInvestmentView) {
        GriverGeoLocationExtensionImpl.length(homeInvestmentView, this.toFloatRange.get());
    }
}
