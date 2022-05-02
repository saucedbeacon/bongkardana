package o;

import id.dana.contract.shortener.RestoreUrlModule;
import o.BindView;
import o.b;

public final class ButterKnife implements getAdapterPosition<BindView.setMax> {
    private final b.C0007b<OnItemLongClick> getMax;
    private final RestoreUrlModule length;

    private ButterKnife(RestoreUrlModule restoreUrlModule, b.C0007b<OnItemLongClick> bVar) {
        this.length = restoreUrlModule;
        this.getMax = bVar;
    }

    public static ButterKnife getMin(RestoreUrlModule restoreUrlModule, b.C0007b<OnItemLongClick> bVar) {
        return new ButterKnife(restoreUrlModule, bVar);
    }

    public final /* synthetic */ Object get() {
        BindView.setMax min = this.length.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
