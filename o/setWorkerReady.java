package o;

import android.content.Context;
import o.b;

public final class setWorkerReady implements getAdapterPosition<sendPushCallBack> {
    private final b.C0007b<onAppResume> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<setIsUrgentResource> length;
    private final b.C0007b<appxLoadFailed> setMax;

    private setWorkerReady(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        this.getMin = bVar;
        this.length = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
    }

    public static setWorkerReady getMin(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        return new setWorkerReady(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new sendPushCallBack(this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get());
    }
}
