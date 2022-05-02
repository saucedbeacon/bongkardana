package o;

import id.dana.contract.deeplink.DeepLinkModule;
import o.AutoTransition;
import o.b;

public final class Fade implements getAdapterPosition<AutoTransition.setMax> {
    private final DeepLinkModule getMin;
    private final b.C0007b<getPath> setMin;

    private Fade(DeepLinkModule deepLinkModule, b.C0007b<getPath> bVar) {
        this.getMin = deepLinkModule;
        this.setMin = bVar;
    }

    public static Fade setMin(DeepLinkModule deepLinkModule, b.C0007b<getPath> bVar) {
        return new Fade(deepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AutoTransition.setMax min = this.getMin.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
