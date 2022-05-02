package o;

import id.dana.di.modules.MissionModule;
import o.setForegroundAsync;

public final class castToDouble implements getAdapterPosition<setForegroundAsync.length> {
    private final MissionModule setMax;

    private castToDouble(MissionModule missionModule) {
        this.setMax = missionModule;
    }

    public static castToDouble getMin(MissionModule missionModule) {
        return new castToDouble(missionModule);
    }

    public final /* synthetic */ Object get() {
        setForegroundAsync.length length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
