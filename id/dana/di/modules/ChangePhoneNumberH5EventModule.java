package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.GriverHttpRequestAPIExtension;
import o.GriverManifest;
import o.onSwitchTab;

@Module
public class ChangePhoneNumberH5EventModule {
    private final GriverManifest.AnonymousClass16.getMin setMin;

    @Provides
    public GriverHttpRequestAPIExtension.RequestContext length(onSwitchTab onswitchtab) {
        return onswitchtab;
    }

    @Provides
    public GriverManifest.AnonymousClass16.setMax setMin(GriverManifest.AnonymousClass15 r1) {
        return r1;
    }

    public ChangePhoneNumberH5EventModule(GriverManifest.AnonymousClass16.getMin getmin) {
        this.setMin = getmin;
    }

    @Provides
    public GriverManifest.AnonymousClass16.getMin getMax() {
        return this.setMin;
    }
}
