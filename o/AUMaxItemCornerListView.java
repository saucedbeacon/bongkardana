package o;

import o.PhotoContext;
import o.b;

public final class AUMaxItemCornerListView implements getAdapterPosition<updateFootState> {
    private final b.C0007b<PhotoContext.AnonymousClass2> setMax;
    private final b.C0007b<setInitTextColor> setMin;

    private AUMaxItemCornerListView(b.C0007b<PhotoContext.AnonymousClass2> bVar, b.C0007b<setInitTextColor> bVar2) {
        this.setMax = bVar;
        this.setMin = bVar2;
    }

    public static AUMaxItemCornerListView length(b.C0007b<PhotoContext.AnonymousClass2> bVar, b.C0007b<setInitTextColor> bVar2) {
        return new AUMaxItemCornerListView(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new updateFootState(this.setMax.get(), this.setMin.get());
    }
}
