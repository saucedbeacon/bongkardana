package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements getAdapterPosition<FirebaseApp> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final FirebaseApp get() {
        return providesFirebaseApp(this.module);
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseApp providesFirebaseApp = firebasePerformanceModule.providesFirebaseApp();
        if (providesFirebaseApp != null) {
            return providesFirebaseApp;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
