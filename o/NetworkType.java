package o;

import o.RxWorker;
import o.b;

public final class NetworkType implements getAdapterPosition<OverwritingInputMerger> {
    private final b.C0007b<queryAppInfos> getMax;
    private final b.C0007b<RxWorker.getMin> setMax;

    private NetworkType(b.C0007b<RxWorker.getMin> bVar, b.C0007b<queryAppInfos> bVar2) {
        this.setMax = bVar;
        this.getMax = bVar2;
    }

    public static NetworkType length(b.C0007b<RxWorker.getMin> bVar, b.C0007b<queryAppInfos> bVar2) {
        return new NetworkType(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new OverwritingInputMerger(this.setMax.get(), this.getMax.get());
    }
}
