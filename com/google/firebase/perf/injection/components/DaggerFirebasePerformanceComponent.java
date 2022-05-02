package com.google.firebase.perf.injection.components;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesGaugeManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import o.b;
import o.isScrap;
import o.stopIgnoring;

public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {
    private b.C0007b<FirebasePerformance> firebasePerformanceProvider;
    private b.C0007b<ConfigResolver> providesConfigResolverProvider;
    private b.C0007b<FirebaseApp> providesFirebaseAppProvider;
    private b.C0007b<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
    private b.C0007b<GaugeManager> providesGaugeManagerProvider;
    private b.C0007b<Provider<RemoteConfigComponent>> providesRemoteConfigComponentProvider;
    private b.C0007b<RemoteConfigManager> providesRemoteConfigManagerProvider;
    private b.C0007b<Provider<TransportFactory>> providesTransportFactoryProvider;

    private DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
        initialize(firebasePerformanceModule);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(FirebasePerformanceModule firebasePerformanceModule) {
        this.providesFirebaseAppProvider = FirebasePerformanceModule_ProvidesFirebaseAppFactory.create(firebasePerformanceModule);
        this.providesRemoteConfigComponentProvider = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.create(firebasePerformanceModule);
        this.providesFirebaseInstallationsProvider = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.create(firebasePerformanceModule);
        this.providesTransportFactoryProvider = FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.create(firebasePerformanceModule);
        this.providesRemoteConfigManagerProvider = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.create(firebasePerformanceModule);
        this.providesConfigResolverProvider = FirebasePerformanceModule_ProvidesConfigResolverFactory.create(firebasePerformanceModule);
        FirebasePerformanceModule_ProvidesGaugeManagerFactory create = FirebasePerformanceModule_ProvidesGaugeManagerFactory.create(firebasePerformanceModule);
        this.providesGaugeManagerProvider = create;
        this.firebasePerformanceProvider = isScrap.getMin(FirebasePerformance_Factory.create(this.providesFirebaseAppProvider, this.providesRemoteConfigComponentProvider, this.providesFirebaseInstallationsProvider, this.providesTransportFactoryProvider, this.providesRemoteConfigManagerProvider, this.providesConfigResolverProvider, create));
    }

    public final FirebasePerformance getFirebasePerformance() {
        return this.firebasePerformanceProvider.get();
    }

    public static final class Builder {
        private FirebasePerformanceModule firebasePerformanceModule;

        private Builder() {
        }

        public final Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule2) {
            if (firebasePerformanceModule2 != null) {
                this.firebasePerformanceModule = firebasePerformanceModule2;
                return this;
            }
            throw null;
        }

        public final FirebasePerformanceComponent build() {
            stopIgnoring.setMin(this.firebasePerformanceModule, FirebasePerformanceModule.class);
            return new DaggerFirebasePerformanceComponent(this.firebasePerformanceModule);
        }
    }
}
