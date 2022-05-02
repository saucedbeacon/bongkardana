package o;

import o.b;
import o.setForegroundAsync;

public final class onStopped implements getAdapterPosition<startWork> {
    private final b.C0007b<freeMemory> getMax;
    private final b.C0007b<openInBrowser> length;
    private final b.C0007b<queryAppInfo> setMax;
    private final b.C0007b<setForegroundAsync.length> setMin;

    private onStopped(b.C0007b<setForegroundAsync.length> bVar, b.C0007b<queryAppInfo> bVar2, b.C0007b<freeMemory> bVar3, b.C0007b<openInBrowser> bVar4) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
    }

    public static onStopped getMax(b.C0007b<setForegroundAsync.length> bVar, b.C0007b<queryAppInfo> bVar2, b.C0007b<freeMemory> bVar3, b.C0007b<openInBrowser> bVar4) {
        return new onStopped(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new startWork(this.setMin.get(), this.setMax.get(), this.getMax.get(), this.length.get());
    }
}
