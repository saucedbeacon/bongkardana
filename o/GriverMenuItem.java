package o;

import id.dana.di.modules.RedeemQuestModule;
import o.RxWorker;

public final class GriverMenuItem implements getAdapterPosition<RxWorker.getMin> {
    private final RedeemQuestModule setMin;

    private GriverMenuItem(RedeemQuestModule redeemQuestModule) {
        this.setMin = redeemQuestModule;
    }

    public static GriverMenuItem setMin(RedeemQuestModule redeemQuestModule) {
        return new GriverMenuItem(redeemQuestModule);
    }

    public final /* synthetic */ Object get() {
        RxWorker.getMin length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
