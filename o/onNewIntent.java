package o;

import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;

public final class onNewIntent implements BreadcrumbSource {
    private final AnalyticsDeferredProxy setMin;

    public onNewIntent(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.setMin = analyticsDeferredProxy;
    }

    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        this.setMin.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }
}
