package o;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

public final class onPreparePanel implements BreadcrumbHandler {
    private final CrashlyticsCore setMin;

    public onPreparePanel(CrashlyticsCore crashlyticsCore) {
        this.setMin = crashlyticsCore;
    }

    public final void handleBreadcrumb(String str) {
        this.setMin.log(str);
    }
}
