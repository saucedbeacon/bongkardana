package o;

import o.b;
import o.onExecuted;

public final class startForeground implements getAdapterPosition<CombineContinuationsWorker> {
    private final b.C0007b<onExecuted.length> getMax;
    private final b.C0007b<setEnableGif> getMin;
    private final b.C0007b<zoomIn> setMin;

    private startForeground(b.C0007b<onExecuted.length> bVar, b.C0007b<zoomIn> bVar2, b.C0007b<setEnableGif> bVar3) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
    }

    public static startForeground setMax(b.C0007b<onExecuted.length> bVar, b.C0007b<zoomIn> bVar2, b.C0007b<setEnableGif> bVar3) {
        return new startForeground(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new CombineContinuationsWorker(this.getMax.get(), this.setMin.get(), this.getMin.get());
    }
}
