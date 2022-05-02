package o;

import id.dana.social.di.module.SocialWidgetModule;
import o.b;

public final class getSelectedItemId implements getAdapterPosition<getException> {
    private final b.C0007b<setIsvAppId> setMax;
    private final SocialWidgetModule setMin;

    private getSelectedItemId(SocialWidgetModule socialWidgetModule, b.C0007b<setIsvAppId> bVar) {
        this.setMin = socialWidgetModule;
        this.setMax = bVar;
    }

    public static getSelectedItemId setMax(SocialWidgetModule socialWidgetModule, b.C0007b<setIsvAppId> bVar) {
        return new getSelectedItemId(socialWidgetModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getException max = this.setMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
