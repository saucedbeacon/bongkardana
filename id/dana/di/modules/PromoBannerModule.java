package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GriverBridgeManifest;
import o.GriverExtensionRegistry;

@Module
public class PromoBannerModule {
    private GriverBridgeManifest.setMax length;

    @Provides
    public GriverBridgeManifest.getMin setMin(GriverExtensionRegistry griverExtensionRegistry) {
        return griverExtensionRegistry;
    }

    public PromoBannerModule(GriverBridgeManifest.setMax setmax) {
        this.length = setmax;
    }

    @Provides
    public GriverBridgeManifest.setMax setMin() {
        return this.length;
    }
}
