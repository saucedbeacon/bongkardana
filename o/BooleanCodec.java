package o;

import id.dana.di.modules.BankSelectorModule;
import o.ForeignKey;

public final class BooleanCodec implements getAdapterPosition<ForeignKey.getMax> {
    private final BankSelectorModule setMin;

    private BooleanCodec(BankSelectorModule bankSelectorModule) {
        this.setMin = bankSelectorModule;
    }

    public static BooleanCodec length(BankSelectorModule bankSelectorModule) {
        return new BooleanCodec(bankSelectorModule);
    }

    public final /* synthetic */ Object get() {
        ForeignKey.getMax min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
