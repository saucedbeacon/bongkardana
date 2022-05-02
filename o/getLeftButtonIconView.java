package o;

import o.BeaconService;
import o.b;
import o.getBackButton;

public final class getLeftButtonIconView implements getAdapterPosition<setIconFont> {
    private final b.C0007b<getDomStorageEnabled> equals;
    private final b.C0007b<DetectionTracker> getMax;
    private final b.C0007b<AUIconDrawable> getMin;
    private final b.C0007b<H5SplitCompatUtils> length;
    private final b.C0007b<access$3600> setMax;
    private final b.C0007b<getBackButton.getMin> setMin;
    private final b.C0007b<BeaconService.IncomingHandler> toIntRange;

    private getLeftButtonIconView(b.C0007b<getBackButton.getMin> bVar, b.C0007b<DetectionTracker> bVar2, b.C0007b<access$3600> bVar3, b.C0007b<AUIconDrawable> bVar4, b.C0007b<H5SplitCompatUtils> bVar5, b.C0007b<BeaconService.IncomingHandler> bVar6, b.C0007b<getDomStorageEnabled> bVar7) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.getMin = bVar4;
        this.length = bVar5;
        this.toIntRange = bVar6;
        this.equals = bVar7;
    }

    public static getLeftButtonIconView length(b.C0007b<getBackButton.getMin> bVar, b.C0007b<DetectionTracker> bVar2, b.C0007b<access$3600> bVar3, b.C0007b<AUIconDrawable> bVar4, b.C0007b<H5SplitCompatUtils> bVar5, b.C0007b<BeaconService.IncomingHandler> bVar6, b.C0007b<getDomStorageEnabled> bVar7) {
        return new getLeftButtonIconView(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new setIconFont(this.setMin.get(), this.getMax.get(), this.setMax.get(), this.getMin.get(), this.length.get(), this.toIntRange.get(), this.equals.get());
    }
}
