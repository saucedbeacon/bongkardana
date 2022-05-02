package o;

import o.APWebSettings;
import o.b;
import o.getRunningAnimators;

public final class addViewValues implements getAdapterPosition<getTargets> {
    private final b.C0007b<getAllInstallFiles> getMax;
    private final b.C0007b<setEpicenterCallback> getMin;
    private final b.C0007b<getRunningAnimators.getMin> length;
    private final b.C0007b<getBlockNetworkImage> setMax;
    private final b.C0007b<APWebSettings.LayoutAlgorithm> setMin;

    private addViewValues(b.C0007b<getRunningAnimators.getMin> bVar, b.C0007b<setEpicenterCallback> bVar2, b.C0007b<getBlockNetworkImage> bVar3, b.C0007b<APWebSettings.LayoutAlgorithm> bVar4, b.C0007b<getAllInstallFiles> bVar5) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
    }

    public static addViewValues length(b.C0007b<getRunningAnimators.getMin> bVar, b.C0007b<setEpicenterCallback> bVar2, b.C0007b<getBlockNetworkImage> bVar3, b.C0007b<APWebSettings.LayoutAlgorithm> bVar4, b.C0007b<getAllInstallFiles> bVar5) {
        return new addViewValues(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new getTargets(this.length.get(), this.getMin.get(), this.setMax.get(), this.setMin.get(), this.getMax.get());
    }
}
