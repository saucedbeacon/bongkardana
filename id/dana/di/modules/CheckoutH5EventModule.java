package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GriverManifest;

@Module
public class CheckoutH5EventModule {
    private final GriverManifest.AnonymousClass22.length length;

    @Provides
    public GriverManifest.AnonymousClass22.getMin getMin(GriverManifest.AnonymousClass2 r1) {
        return r1;
    }

    public CheckoutH5EventModule(GriverManifest.AnonymousClass22.length length2) {
        this.length = length2;
    }

    @Provides
    public GriverManifest.AnonymousClass22.length setMax() {
        return this.length;
    }
}
