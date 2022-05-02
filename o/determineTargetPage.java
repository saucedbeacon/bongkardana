package o;

import o.b;
import o.enableLayers;

public final class determineTargetPage implements getAdapterPosition<infoForCurrentScrollPosition> {
    private final b.C0007b<getJavaScriptEnabled> setMax;
    private final b.C0007b<enableLayers.getMin> setMin;

    private determineTargetPage(b.C0007b<enableLayers.getMin> bVar, b.C0007b<getJavaScriptEnabled> bVar2) {
        this.setMin = bVar;
        this.setMax = bVar2;
    }

    public static determineTargetPage length(b.C0007b<enableLayers.getMin> bVar, b.C0007b<getJavaScriptEnabled> bVar2) {
        return new determineTargetPage(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new infoForCurrentScrollPosition(this.setMin.get(), this.setMax.get());
    }
}
