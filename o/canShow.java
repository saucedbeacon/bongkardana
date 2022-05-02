package o;

import id.dana.di.modules.RedeemQuestModule;
import o.RxWorker;
import o.b;

public final class canShow implements getAdapterPosition<RxWorker.setMin> {
    private final b.C0007b<OverwritingInputMerger> getMax;
    private final RedeemQuestModule getMin;

    private canShow(RedeemQuestModule redeemQuestModule, b.C0007b<OverwritingInputMerger> bVar) {
        this.getMin = redeemQuestModule;
        this.getMax = bVar;
    }

    public static canShow setMax(RedeemQuestModule redeemQuestModule, b.C0007b<OverwritingInputMerger> bVar) {
        return new canShow(redeemQuestModule, bVar);
    }

    public final /* synthetic */ Object get() {
        RxWorker.setMin max = this.getMin.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
