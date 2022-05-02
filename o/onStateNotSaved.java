package o;

import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class onStateNotSaved implements Deferred.DeferredHandler {
    private final AnalyticsDeferredProxy getMax;

    public onStateNotSaved(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.getMax = analyticsDeferredProxy;
    }

    public final void handle(Provider provider) {
        this.getMax.lambda$init$2(provider);
    }
}
