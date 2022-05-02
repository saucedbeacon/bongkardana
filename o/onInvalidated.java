package o;

import o.AUHorizontalListView;
import o.b;

public final class onInvalidated implements getAdapterPosition<AUHorizontalListView.ArrowScrollFocusResult> {
    private final b.C0007b<access$3800> setMin;

    private onInvalidated(b.C0007b<access$3800> bVar) {
        this.setMin = bVar;
    }

    public static onInvalidated length(b.C0007b<access$3800> bVar) {
        return new onInvalidated(bVar);
    }

    public final /* synthetic */ Object get() {
        return new AUHorizontalListView.ArrowScrollFocusResult(this.setMin.get());
    }
}
