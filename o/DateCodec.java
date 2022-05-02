package o;

import id.dana.di.modules.BankSelectorModule;
import o.ForeignKey;
import o.b;

public final class DateCodec implements getAdapterPosition<ForeignKey.getMin> {
    private final b.C0007b<ExperimentalRoomApi> getMax;
    private final BankSelectorModule getMin;

    private DateCodec(BankSelectorModule bankSelectorModule, b.C0007b<ExperimentalRoomApi> bVar) {
        this.getMin = bankSelectorModule;
        this.getMax = bVar;
    }

    public static DateCodec length(BankSelectorModule bankSelectorModule, b.C0007b<ExperimentalRoomApi> bVar) {
        return new DateCodec(bankSelectorModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ForeignKey.getMin length = this.getMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
