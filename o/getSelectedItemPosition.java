package o;

import id.dana.social.di.module.SocialWidgetModule;
import o.b;

public final class getSelectedItemPosition implements getAdapterPosition<DistanceConfigFetcher> {
    private final b.C0007b<RVGroup> getMax;
    private final SocialWidgetModule length;

    private getSelectedItemPosition(SocialWidgetModule socialWidgetModule, b.C0007b<RVGroup> bVar) {
        this.length = socialWidgetModule;
        this.getMax = bVar;
    }

    public static getSelectedItemPosition setMin(SocialWidgetModule socialWidgetModule, b.C0007b<RVGroup> bVar) {
        return new getSelectedItemPosition(socialWidgetModule, bVar);
    }

    public final /* synthetic */ Object get() {
        DistanceConfigFetcher length2 = this.length.length(this.getMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
