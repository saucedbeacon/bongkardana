package o;

import o.CommonExitPerform;
import o.b;

public final class logApiDispatch implements getAdapterPosition<CommonExitPerform.CollectJsApiHandler> {
    private final b.C0007b<IEmbedPerformanceReporter> networkPushNotificationEntityDataProvider;

    public logApiDispatch(b.C0007b<IEmbedPerformanceReporter> bVar) {
        this.networkPushNotificationEntityDataProvider = bVar;
    }

    public final CommonExitPerform.CollectJsApiHandler get() {
        return newInstance(this.networkPushNotificationEntityDataProvider.get());
    }

    public static logApiDispatch create(b.C0007b<IEmbedPerformanceReporter> bVar) {
        return new logApiDispatch(bVar);
    }

    public static CommonExitPerform.CollectJsApiHandler newInstance(IEmbedPerformanceReporter iEmbedPerformanceReporter) {
        return new CommonExitPerform.CollectJsApiHandler(iEmbedPerformanceReporter);
    }
}
