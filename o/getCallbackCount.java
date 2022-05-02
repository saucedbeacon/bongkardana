package o;

import o.b;

public final class getCallbackCount implements getAdapterPosition<RemoteCallbackPool> {
    private final b.C0007b<BackKeyDownPoint> getMin;
    private final b.C0007b<b.AnonymousClass3> setMin;

    private getCallbackCount(b.C0007b<b.AnonymousClass3> bVar, b.C0007b<BackKeyDownPoint> bVar2) {
        this.setMin = bVar;
        this.getMin = bVar2;
    }

    public static getCallbackCount getMax(b.C0007b<b.AnonymousClass3> bVar, b.C0007b<BackKeyDownPoint> bVar2) {
        return new getCallbackCount(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new RemoteCallbackPool(this.setMin.get(), this.getMin.get());
    }
}
