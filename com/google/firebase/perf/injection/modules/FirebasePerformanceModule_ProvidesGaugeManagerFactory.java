package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.gauges.GaugeManager;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesGaugeManagerFactory implements getAdapterPosition<GaugeManager> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesGaugeManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final GaugeManager get() {
        return providesGaugeManager(this.module);
    }

    public static FirebasePerformanceModule_ProvidesGaugeManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesGaugeManagerFactory(firebasePerformanceModule);
    }

    public static GaugeManager providesGaugeManager(FirebasePerformanceModule firebasePerformanceModule) {
        GaugeManager providesGaugeManager = firebasePerformanceModule.providesGaugeManager();
        if (providesGaugeManager != null) {
            return providesGaugeManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
