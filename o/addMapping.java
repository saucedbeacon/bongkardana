package o;

import id.dana.di.modules.NewPromoBannerModule;
import o.GriverManifest;
import o.b;

public final class addMapping implements getAdapterPosition<GriverManifest.AnonymousClass8.setMax> {
    private final NewPromoBannerModule getMin;
    private final b.C0007b<GriverParams> length;

    public static GriverManifest.AnonymousClass8.setMax getMin(NewPromoBannerModule newPromoBannerModule, GriverParams griverParams) {
        GriverManifest.AnonymousClass8.setMax max = newPromoBannerModule.setMax(griverParams);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass8.setMax max = this.getMin.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
