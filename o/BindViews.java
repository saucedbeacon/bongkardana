package o;

import id.dana.contract.shortener.RestoreUrlModule;
import o.BindView;
import o.b;

public final class BindViews implements getAdapterPosition<BindView.setMin> {
    private final b.C0007b<OnFocusChange> getMax;
    private final RestoreUrlModule setMax;

    private BindViews(RestoreUrlModule restoreUrlModule, b.C0007b<OnFocusChange> bVar) {
        this.setMax = restoreUrlModule;
        this.getMax = bVar;
    }

    public static BindViews getMax(RestoreUrlModule restoreUrlModule, b.C0007b<OnFocusChange> bVar) {
        return new BindViews(restoreUrlModule, bVar);
    }

    public final /* synthetic */ Object get() {
        BindView.setMin min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
