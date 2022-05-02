package o;

import id.dana.contract.payasset.QueryPayMethodModule;
import o.b;
import o.fakeDragBy;

public final class endDrag implements getAdapterPosition<fakeDragBy.length> {
    private final b.C0007b<pageLeft> length;
    private final QueryPayMethodModule setMin;

    private endDrag(QueryPayMethodModule queryPayMethodModule, b.C0007b<pageLeft> bVar) {
        this.setMin = queryPayMethodModule;
        this.length = bVar;
    }

    public static endDrag getMin(QueryPayMethodModule queryPayMethodModule, b.C0007b<pageLeft> bVar) {
        return new endDrag(queryPayMethodModule, bVar);
    }

    public final /* synthetic */ Object get() {
        fakeDragBy.length max = this.setMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
