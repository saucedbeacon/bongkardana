package o;

import id.dana.di.modules.MissionModule;
import o.b;
import o.setForegroundAsync;

public final class castToFloat implements getAdapterPosition<setForegroundAsync.getMin> {
    private final b.C0007b<startWork> getMin;
    private final MissionModule length;

    private castToFloat(MissionModule missionModule, b.C0007b<startWork> bVar) {
        this.length = missionModule;
        this.getMin = bVar;
    }

    public static castToFloat getMax(MissionModule missionModule, b.C0007b<startWork> bVar) {
        return new castToFloat(missionModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setForegroundAsync.getMin min = this.length.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
