package o;

import o.b;
import o.getDialogLayout;

public final class getConfig implements getAdapterPosition<LayoutMode> {
    private final b.C0007b<sendHttp> getMax;
    private final b.C0007b<H5DevConfig> getMin;
    private final b.C0007b<debugSwitch> length;
    private final b.C0007b<getDialogLayout.getMax> setMax;
    private final b.C0007b<setInitScenario> setMin;
    private final b.C0007b<logFolderTree> toFloatRange;
    private final b.C0007b<getShortName> toIntRange;

    private getConfig(b.C0007b<sendHttp> bVar, b.C0007b<getDialogLayout.getMax> bVar2, b.C0007b<H5DevConfig> bVar3, b.C0007b<setInitScenario> bVar4, b.C0007b<debugSwitch> bVar5, b.C0007b<logFolderTree> bVar6, b.C0007b<getShortName> bVar7) {
        this.getMax = bVar;
        this.setMax = bVar2;
        this.getMin = bVar3;
        this.setMin = bVar4;
        this.length = bVar5;
        this.toFloatRange = bVar6;
        this.toIntRange = bVar7;
    }

    public static getConfig length(b.C0007b<sendHttp> bVar, b.C0007b<getDialogLayout.getMax> bVar2, b.C0007b<H5DevConfig> bVar3, b.C0007b<setInitScenario> bVar4, b.C0007b<debugSwitch> bVar5, b.C0007b<logFolderTree> bVar6, b.C0007b<getShortName> bVar7) {
        return new getConfig(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new LayoutMode(this.getMax.get(), this.setMax.get(), this.getMin.get(), this.setMin.get(), this.length.get(), this.toFloatRange.get(), this.toIntRange.get());
    }
}
