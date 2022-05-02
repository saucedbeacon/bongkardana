package o;

import o.b;
import o.getBackgroundExecutor;

public final class setUsed implements getAdapterPosition<isRunInForeground> {
    private final b.C0007b<getBackgroundExecutor.length> getMax;
    private final b.C0007b<saveAppInfo> getMin;
    private final b.C0007b<getUserAgentString> length;
    private final b.C0007b<openInBrowser> setMax;

    private setUsed(b.C0007b<getUserAgentString> bVar, b.C0007b<saveAppInfo> bVar2, b.C0007b<openInBrowser> bVar3, b.C0007b<getBackgroundExecutor.length> bVar4) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
    }

    public static setUsed getMax(b.C0007b<getUserAgentString> bVar, b.C0007b<saveAppInfo> bVar2, b.C0007b<openInBrowser> bVar3, b.C0007b<getBackgroundExecutor.length> bVar4) {
        return new setUsed(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new isRunInForeground(this.length.get(), this.getMin.get(), this.setMax.get(), this.getMax.get());
    }
}
