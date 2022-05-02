package o;

import o.b;

public final class capturePropagationValues implements getAdapterPosition<getEpicenter> {
    private final b.C0007b<getAppPerfKey> getMin;
    private final b.C0007b<addChooseImageCrossOrigin> length;

    private capturePropagationValues(b.C0007b<addChooseImageCrossOrigin> bVar, b.C0007b<getAppPerfKey> bVar2) {
        this.length = bVar;
        this.getMin = bVar2;
    }

    public static capturePropagationValues getMin(b.C0007b<addChooseImageCrossOrigin> bVar, b.C0007b<getAppPerfKey> bVar2) {
        return new capturePropagationValues(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getEpicenter(this.length.get(), this.getMin.get());
    }
}
