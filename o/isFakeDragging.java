package o;

import id.dana.contract.payasset.QueryPayMethodModule;
import o.fakeDragBy;

public final class isFakeDragging implements getAdapterPosition<fakeDragBy.getMin> {
    private final QueryPayMethodModule setMin;

    private isFakeDragging(QueryPayMethodModule queryPayMethodModule) {
        this.setMin = queryPayMethodModule;
    }

    public static isFakeDragging getMin(QueryPayMethodModule queryPayMethodModule) {
        return new isFakeDragging(queryPayMethodModule);
    }

    public final /* synthetic */ Object get() {
        fakeDragBy.getMin length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
