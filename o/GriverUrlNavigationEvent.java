package o;

import id.dana.di.modules.SendMoneySummaryModule;
import o.setProxy;

public final class GriverUrlNavigationEvent implements getAdapterPosition<setProxy.setMax> {
    private final SendMoneySummaryModule setMin;

    private GriverUrlNavigationEvent(SendMoneySummaryModule sendMoneySummaryModule) {
        this.setMin = sendMoneySummaryModule;
    }

    public static GriverUrlNavigationEvent length(SendMoneySummaryModule sendMoneySummaryModule) {
        return new GriverUrlNavigationEvent(sendMoneySummaryModule);
    }

    public final /* synthetic */ Object get() {
        setProxy.setMax min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
