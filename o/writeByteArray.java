package o;

import id.dana.di.modules.InvestmentModule;
import o.GriverAppLanguageExtensionImpl;
import o.GriverGeoLocationExtensionImpl;
import o.b;

public final class writeByteArray implements getAdapterPosition<GriverAppLanguageExtensionImpl.length> {
    private final InvestmentModule getMax;
    private final b.C0007b<GriverGeoLocationExtensionImpl.AnonymousClass1> setMin;

    private writeByteArray(InvestmentModule investmentModule, b.C0007b<GriverGeoLocationExtensionImpl.AnonymousClass1> bVar) {
        this.getMax = investmentModule;
        this.setMin = bVar;
    }

    public static writeByteArray length(InvestmentModule investmentModule, b.C0007b<GriverGeoLocationExtensionImpl.AnonymousClass1> bVar) {
        return new writeByteArray(investmentModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverAppLanguageExtensionImpl.length min = this.getMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
