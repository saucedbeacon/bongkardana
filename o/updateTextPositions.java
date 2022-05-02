package o;

import o.b;
import o.setTabIndicatorColor;

public final class updateTextPositions implements getAdapterPosition<getDrawFullUnderline> {
    private final b.C0007b<setTabIndicatorColor.setMin> length;
    private final b.C0007b<apiName> setMin;

    private updateTextPositions(b.C0007b<setTabIndicatorColor.setMin> bVar, b.C0007b<apiName> bVar2) {
        this.length = bVar;
        this.setMin = bVar2;
    }

    public static updateTextPositions getMin(b.C0007b<setTabIndicatorColor.setMin> bVar, b.C0007b<apiName> bVar2) {
        return new updateTextPositions(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getDrawFullUnderline(this.length.get(), this.setMin.get());
    }
}
