package o;

import id.dana.contract.deeplink.DeepLinkModule;
import o.b;
import o.getDuration;

public final class ChangeBounds implements getAdapterPosition<getDuration.length> {
    private final b.C0007b<setStartDelay> getMax;
    private final DeepLinkModule getMin;

    private ChangeBounds(DeepLinkModule deepLinkModule, b.C0007b<setStartDelay> bVar) {
        this.getMin = deepLinkModule;
        this.getMax = bVar;
    }

    public static ChangeBounds setMin(DeepLinkModule deepLinkModule, b.C0007b<setStartDelay> bVar) {
        return new ChangeBounds(deepLinkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getDuration.length max = this.getMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
