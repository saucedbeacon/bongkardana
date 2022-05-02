package o;

import id.dana.contract.deeplink.DeepLinkModule;
import o.AutoTransition;
import o.Slide;
import o.b;

public final class PathMotion implements getAdapterPosition<AutoTransition.length> {
    private final DeepLinkModule getMax;
    private final b.C0007b<Slide.GravityFlag> getMin;

    private PathMotion(DeepLinkModule deepLinkModule, b.C0007b<Slide.GravityFlag> bVar) {
        this.getMax = deepLinkModule;
        this.getMin = bVar;
    }

    public static PathMotion getMax(DeepLinkModule deepLinkModule, b.C0007b<Slide.GravityFlag> bVar) {
        return new PathMotion(deepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AutoTransition.length min = this.getMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
