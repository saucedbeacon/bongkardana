package o;

import id.dana.di.modules.MissionSummaryModule;
import o.b;
import o.getBackgroundExecutor;

public final class castToEnum implements getAdapterPosition<getBackgroundExecutor.setMin> {
    private final b.C0007b<isRunInForeground> getMax;
    private final MissionSummaryModule length;

    private castToEnum(MissionSummaryModule missionSummaryModule, b.C0007b<isRunInForeground> bVar) {
        this.length = missionSummaryModule;
        this.getMax = bVar;
    }

    public static castToEnum getMin(MissionSummaryModule missionSummaryModule, b.C0007b<isRunInForeground> bVar) {
        return new castToEnum(missionSummaryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBackgroundExecutor.setMin length2 = this.length.length(this.getMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
