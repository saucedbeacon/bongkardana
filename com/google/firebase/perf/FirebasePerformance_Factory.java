package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import o.b;
import o.getAdapterPosition;

public final class FirebasePerformance_Factory implements getAdapterPosition<FirebasePerformance> {
    private final b.C0007b<ConfigResolver> configResolverProvider;
    private final b.C0007b<FirebaseApp> firebaseAppProvider;
    private final b.C0007b<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final b.C0007b<Provider<RemoteConfigComponent>> firebaseRemoteConfigProvider;
    private final b.C0007b<GaugeManager> gaugeManagerProvider;
    private final b.C0007b<RemoteConfigManager> remoteConfigManagerProvider;
    private final b.C0007b<Provider<TransportFactory>> transportFactoryProvider;

    public FirebasePerformance_Factory(b.C0007b<FirebaseApp> bVar, b.C0007b<Provider<RemoteConfigComponent>> bVar2, b.C0007b<FirebaseInstallationsApi> bVar3, b.C0007b<Provider<TransportFactory>> bVar4, b.C0007b<RemoteConfigManager> bVar5, b.C0007b<ConfigResolver> bVar6, b.C0007b<GaugeManager> bVar7) {
        this.firebaseAppProvider = bVar;
        this.firebaseRemoteConfigProvider = bVar2;
        this.firebaseInstallationsApiProvider = bVar3;
        this.transportFactoryProvider = bVar4;
        this.remoteConfigManagerProvider = bVar5;
        this.configResolverProvider = bVar6;
        this.gaugeManagerProvider = bVar7;
    }

    public final FirebasePerformance get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseRemoteConfigProvider.get(), this.firebaseInstallationsApiProvider.get(), this.transportFactoryProvider.get(), this.remoteConfigManagerProvider.get(), this.configResolverProvider.get(), this.gaugeManagerProvider.get());
    }

    public static FirebasePerformance_Factory create(b.C0007b<FirebaseApp> bVar, b.C0007b<Provider<RemoteConfigComponent>> bVar2, b.C0007b<FirebaseInstallationsApi> bVar3, b.C0007b<Provider<TransportFactory>> bVar4, b.C0007b<RemoteConfigManager> bVar5, b.C0007b<ConfigResolver> bVar6, b.C0007b<GaugeManager> bVar7) {
        return new FirebasePerformance_Factory(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, GaugeManager gaugeManager) {
        return new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, gaugeManager);
    }
}
