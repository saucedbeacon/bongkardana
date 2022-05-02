package o;

import o.b;
import o.sortChildDrawingOrder;

public final class calculatePageOffsets implements getAdapterPosition<isDecorView> {
    private final b.C0007b<sortChildDrawingOrder.length> getMax;
    private final b.C0007b<getSHA1> getMin;
    private final b.C0007b<copyToFile> length;
    private final b.C0007b<dataUpdated> setMax;
    private final b.C0007b<getDefaultTextEncodingName> setMin;

    private calculatePageOffsets(b.C0007b<sortChildDrawingOrder.length> bVar, b.C0007b<getDefaultTextEncodingName> bVar2, b.C0007b<getSHA1> bVar3, b.C0007b<copyToFile> bVar4, b.C0007b<dataUpdated> bVar5) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.length = bVar4;
        this.setMax = bVar5;
    }

    public static calculatePageOffsets length(b.C0007b<sortChildDrawingOrder.length> bVar, b.C0007b<getDefaultTextEncodingName> bVar2, b.C0007b<getSHA1> bVar3, b.C0007b<copyToFile> bVar4, b.C0007b<dataUpdated> bVar5) {
        return new calculatePageOffsets(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new isDecorView(this.getMax.get(), this.setMin.get(), this.getMin.get(), this.length.get(), this.setMax.get());
    }
}
