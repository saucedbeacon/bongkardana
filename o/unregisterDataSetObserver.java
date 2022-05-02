package o;

import o.b;
import o.restoreState;

public final class unregisterDataSetObserver implements getAdapterPosition<setPrimaryItem> {
    private final b.C0007b<restoreState.getMax> length;
    private final b.C0007b<H5ResourceHandlerUtil> setMin;

    private unregisterDataSetObserver(b.C0007b<restoreState.getMax> bVar, b.C0007b<H5ResourceHandlerUtil> bVar2) {
        this.length = bVar;
        this.setMin = bVar2;
    }

    public static unregisterDataSetObserver getMin(b.C0007b<restoreState.getMax> bVar, b.C0007b<H5ResourceHandlerUtil> bVar2) {
        return new unregisterDataSetObserver(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new setPrimaryItem(this.length.get(), this.setMin.get());
    }
}
