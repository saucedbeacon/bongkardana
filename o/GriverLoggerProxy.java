package o;

import id.dana.di.modules.PromoQuestModule;
import o.setProgressAsync;

public final class GriverLoggerProxy implements getAdapterPosition<setProgressAsync.setMax> {
    private final PromoQuestModule setMin;

    public static setProgressAsync.setMax getMin(PromoQuestModule promoQuestModule) {
        setProgressAsync.setMax min = promoQuestModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setProgressAsync.setMax min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
