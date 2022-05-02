package o;

import id.dana.di.modules.LeaderboardEntryModule;
import o.getDataType;

public final class SimplePropertyPreFilter implements getAdapterPosition<getDataType.getMax> {
    private final LeaderboardEntryModule setMax;

    public static getDataType.getMax getMax(LeaderboardEntryModule leaderboardEntryModule) {
        getDataType.getMax max = leaderboardEntryModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getDataType.getMax max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
