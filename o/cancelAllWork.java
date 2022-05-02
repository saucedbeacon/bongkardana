package o;

import android.content.Context;
import o.DiagnosticsReceiver;
import o.GriverOpenAuthExtension;
import o.IWorkManagerImpl;
import o.b;

public final class cancelAllWork implements getAdapterPosition<cancelAllWorkByTag> {
    private final b.C0007b<getErrorUrl> IsOverlapping;
    private final b.C0007b<setGridListener> equals;
    private final b.C0007b<browsePhoto> getMax;
    private final b.C0007b<GriverOpenAuthExtension.RevokeCallback> getMin;
    private final b.C0007b<Context> isInside;
    private final b.C0007b<checkIfMainProcess> length;
    private final b.C0007b<updateScanPeriods> setMax;
    private final b.C0007b<DiagnosticsReceiver.length> setMin;
    private final b.C0007b<getMonitoringNotifier> toFloatRange;
    private final b.C0007b<PhotoService> toIntRange;
    private final b.C0007b<onPageLongClicked> toString;

    private cancelAllWork(b.C0007b<updateScanPeriods> bVar, b.C0007b<browsePhoto> bVar2, b.C0007b<DiagnosticsReceiver.length> bVar3, b.C0007b<checkIfMainProcess> bVar4, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar5, b.C0007b<Context> bVar6, b.C0007b<setGridListener> bVar7, b.C0007b<PhotoService> bVar8, b.C0007b<getErrorUrl> bVar9, b.C0007b<getMonitoringNotifier> bVar10, b.C0007b<onPageLongClicked> bVar11) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.setMin = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
        this.isInside = bVar6;
        this.equals = bVar7;
        this.toIntRange = bVar8;
        this.IsOverlapping = bVar9;
        this.toFloatRange = bVar10;
        this.toString = bVar11;
    }

    public static cancelAllWork getMin(b.C0007b<updateScanPeriods> bVar, b.C0007b<browsePhoto> bVar2, b.C0007b<DiagnosticsReceiver.length> bVar3, b.C0007b<checkIfMainProcess> bVar4, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar5, b.C0007b<Context> bVar6, b.C0007b<setGridListener> bVar7, b.C0007b<PhotoService> bVar8, b.C0007b<getErrorUrl> bVar9, b.C0007b<getMonitoringNotifier> bVar10, b.C0007b<onPageLongClicked> bVar11) {
        return new cancelAllWork(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11);
    }

    public final /* synthetic */ Object get() {
        cancelAllWorkByTag cancelallworkbytag = new cancelAllWorkByTag(this.setMax.get(), this.getMax.get(), this.setMin.get(), this.length.get(), this.getMin.get(), this.isInside.get());
        IWorkManagerImpl.Stub.setMax(cancelallworkbytag, this.equals.get(), this.toIntRange.get(), this.IsOverlapping.get(), this.toFloatRange.get(), this.toString.get());
        return cancelallworkbytag;
    }
}
