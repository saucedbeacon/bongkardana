package o;

import o.b;

public final class getRuntimeSupportMin implements getAdapterPosition<AbstractResource> {
    private final b.C0007b<addRequestHeader> getMin;

    private getRuntimeSupportMin(b.C0007b<addRequestHeader> bVar) {
        this.getMin = bVar;
    }

    public static getRuntimeSupportMin getMin(b.C0007b<addRequestHeader> bVar) {
        return new getRuntimeSupportMin(bVar);
    }

    public final /* synthetic */ Object get() {
        return new AbstractResource(this.getMin.get());
    }
}
