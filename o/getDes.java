package o;

import id.dana.social.di.module.SocialCommonModule;
import o.b;
import o.getSelectedIndex;

public final class getDes implements getAdapterPosition<getSelectedIndex.length> {
    private final SocialCommonModule getMin;
    private final b.C0007b<setOnOptionPickListener> setMin;

    private getDes(SocialCommonModule socialCommonModule, b.C0007b<setOnOptionPickListener> bVar) {
        this.getMin = socialCommonModule;
        this.setMin = bVar;
    }

    public static getDes getMin(SocialCommonModule socialCommonModule, b.C0007b<setOnOptionPickListener> bVar) {
        return new getDes(socialCommonModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getSelectedIndex.length min = this.getMin.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
