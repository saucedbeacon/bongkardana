package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements getAdapterPosition<ConfigResolver> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final ConfigResolver get() {
        return providesConfigResolver(this.module);
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule firebasePerformanceModule) {
        ConfigResolver providesConfigResolver = firebasePerformanceModule.providesConfigResolver();
        if (providesConfigResolver != null) {
            return providesConfigResolver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
