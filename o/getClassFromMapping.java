package o;

import id.dana.di.modules.MissionSummaryModule;
import o.getBackgroundExecutor;

public final class getClassFromMapping implements getAdapterPosition<getBackgroundExecutor.length> {
    private final MissionSummaryModule getMin;

    private getClassFromMapping(MissionSummaryModule missionSummaryModule) {
        this.getMin = missionSummaryModule;
    }

    public static getClassFromMapping getMin(MissionSummaryModule missionSummaryModule) {
        return new getClassFromMapping(missionSummaryModule);
    }

    public final /* synthetic */ Object get() {
        getBackgroundExecutor.length min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
