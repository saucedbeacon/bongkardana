package o;

import id.dana.di.modules.InvestmentModule;
import o.GriverAppLanguageExtensionImpl;

public final class SerializeWriter implements getAdapterPosition<GriverAppLanguageExtensionImpl.getMax> {
    private final InvestmentModule getMin;

    private SerializeWriter(InvestmentModule investmentModule) {
        this.getMin = investmentModule;
    }

    public static SerializeWriter setMin(InvestmentModule investmentModule) {
        return new SerializeWriter(investmentModule);
    }

    public final /* synthetic */ Object get() {
        GriverAppLanguageExtensionImpl.getMax min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
