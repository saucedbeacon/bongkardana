package o;

import id.dana.di.modules.PromoQuestModule;
import o.b;
import o.setProgressAsync;

public final class GriverVerifyPublicKeyProxy implements getAdapterPosition<setProgressAsync.length> {
    private final PromoQuestModule getMax;
    private final b.C0007b<getRunAttemptCount> getMin;

    public static setProgressAsync.length setMin(PromoQuestModule promoQuestModule, getRunAttemptCount getrunattemptcount) {
        setProgressAsync.length min = promoQuestModule.getMin(getrunattemptcount);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setProgressAsync.length min = this.getMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
