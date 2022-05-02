package o;

import id.dana.di.modules.AutoCompleteBankModule;
import o.b;
import o.y;

public final class BigDecimalCodec implements getAdapterPosition<y.setMin> {
    private final b.C0007b<onGridChecked> getMax;
    private final AutoCompleteBankModule setMax;

    public static y.setMin length(AutoCompleteBankModule autoCompleteBankModule, onGridChecked ongridchecked) {
        y.setMin min = autoCompleteBankModule.getMin(ongridchecked);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        y.setMin min = this.setMax.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
