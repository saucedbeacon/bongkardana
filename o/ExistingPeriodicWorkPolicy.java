package o;

import id.dana.contract.promocenter.PromoCategoryModule;
import o.BackoffPolicy;

public final class ExistingPeriodicWorkPolicy implements getAdapterPosition<BackoffPolicy.setMax> {
    private final PromoCategoryModule setMin;

    private ExistingPeriodicWorkPolicy(PromoCategoryModule promoCategoryModule) {
        this.setMin = promoCategoryModule;
    }

    public static ExistingPeriodicWorkPolicy setMin(PromoCategoryModule promoCategoryModule) {
        return new ExistingPeriodicWorkPolicy(promoCategoryModule);
    }

    public final /* synthetic */ Object get() {
        BackoffPolicy.setMax length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
