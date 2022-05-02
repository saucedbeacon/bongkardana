package o;

import o.b;

public final class getCurrentUri implements getAdapterPosition<goBack> {
    private final b.C0007b<hasTriggeredLoad> getMax;

    private getCurrentUri(b.C0007b<hasTriggeredLoad> bVar) {
        this.getMax = bVar;
    }

    public static getCurrentUri setMax(b.C0007b<hasTriggeredLoad> bVar) {
        return new getCurrentUri(bVar);
    }

    public final /* synthetic */ Object get() {
        return new goBack(this.getMax.get());
    }
}
