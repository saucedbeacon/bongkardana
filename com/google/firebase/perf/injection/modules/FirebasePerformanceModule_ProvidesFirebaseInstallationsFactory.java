package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements getAdapterPosition<FirebaseInstallationsApi> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseInstallationsApi providesFirebaseInstallations = firebasePerformanceModule.providesFirebaseInstallations();
        if (providesFirebaseInstallations != null) {
            return providesFirebaseInstallations;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
