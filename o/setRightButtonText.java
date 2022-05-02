package o;

import o.AUHorizontalListView;
import o.b;
import o.setLeftButtonEnabled;

public final class setRightButtonText implements getAdapterPosition<setRightButtonIcon> {
    private final b.C0007b<VerboseAndroidLogger> getMax;
    private final b.C0007b<AUHorizontalListView.ArrowScrollFocusResult> getMin;
    private final b.C0007b<setLeftButtonEnabled.length> length;
    private final b.C0007b<access$3600> setMax;
    private final b.C0007b<getLastMonitoringStatusUpdateTime> setMin;

    private setRightButtonText(b.C0007b<setLeftButtonEnabled.length> bVar, b.C0007b<VerboseAndroidLogger> bVar2, b.C0007b<getLastMonitoringStatusUpdateTime> bVar3, b.C0007b<access$3600> bVar4, b.C0007b<AUHorizontalListView.ArrowScrollFocusResult> bVar5) {
        this.length = bVar;
        this.getMax = bVar2;
        this.setMin = bVar3;
        this.setMax = bVar4;
        this.getMin = bVar5;
    }

    public static setRightButtonText setMax(b.C0007b<setLeftButtonEnabled.length> bVar, b.C0007b<VerboseAndroidLogger> bVar2, b.C0007b<getLastMonitoringStatusUpdateTime> bVar3, b.C0007b<access$3600> bVar4, b.C0007b<AUHorizontalListView.ArrowScrollFocusResult> bVar5) {
        return new setRightButtonText(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new setRightButtonIcon(this.length.get(), this.getMax.get(), this.setMin.get(), this.setMax.get(), this.getMin.get());
    }
}
