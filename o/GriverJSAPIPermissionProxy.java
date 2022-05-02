package o;

import id.dana.di.modules.TrackQuestModule;
import o.getWorkerFactory;

public final class GriverJSAPIPermissionProxy implements getAdapterPosition<getWorkerFactory.length> {
    private final TrackQuestModule getMin;

    private GriverJSAPIPermissionProxy(TrackQuestModule trackQuestModule) {
        this.getMin = trackQuestModule;
    }

    public static GriverJSAPIPermissionProxy setMin(TrackQuestModule trackQuestModule) {
        return new GriverJSAPIPermissionProxy(trackQuestModule);
    }

    public final /* synthetic */ Object get() {
        getWorkerFactory.length max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
