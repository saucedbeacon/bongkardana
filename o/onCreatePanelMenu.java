package o;

import android.os.Bundle;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;

public final class onCreatePanelMenu implements AnalyticsEventLogger {
    private final AnalyticsDeferredProxy getMax;

    public onCreatePanelMenu(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.getMax = analyticsDeferredProxy;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.getMax.lambda$getAnalyticsEventLogger$1(str, bundle);
    }
}
