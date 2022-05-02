package o;

import id.dana.di.modules.NewPromoBannerModule;
import o.GriverManifest;

public final class getArgument implements getAdapterPosition<GriverManifest.AnonymousClass8.length> {
    private final NewPromoBannerModule getMax;

    private getArgument(NewPromoBannerModule newPromoBannerModule) {
        this.getMax = newPromoBannerModule;
    }

    public static getArgument getMax(NewPromoBannerModule newPromoBannerModule) {
        return new getArgument(newPromoBannerModule);
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass8.length min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
