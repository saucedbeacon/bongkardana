package o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import id.dana.synccontact.worker.syncnewcontact.SyncChangedContactWorker;
import javax.inject.Inject;
import o.CycledLeScanner;
import o.b;

public final class changePxToDp implements setMerchantId {
    private final b.C0007b<getApFromString> getMax;
    private final b.C0007b<getWakeUpOperation> getMin;
    private final b.C0007b<getApFromDimen> length;
    private final b.C0007b<setWakeUpAlarm> setMax;
    private final b.C0007b<CycledLeScanner.AnonymousClass1> setMin;
    private final b.C0007b<GVErrorView> toFloatRange;

    @Inject
    public changePxToDp(b.C0007b<setWakeUpAlarm> bVar, b.C0007b<CycledLeScanner.AnonymousClass1> bVar2, b.C0007b<getWakeUpOperation> bVar3, b.C0007b<getApFromString> bVar4, b.C0007b<getApFromDimen> bVar5, b.C0007b<GVErrorView> bVar6) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.getMax = bVar4;
        this.length = bVar5;
        this.toFloatRange = bVar6;
    }

    public final ListenableWorker getMax(Context context, WorkerParameters workerParameters) {
        SyncChangedContactWorker syncChangedContactWorker = new SyncChangedContactWorker(context, workerParameters, this.getMax.get(), this.length.get());
        syncChangedContactWorker.toFloatRange = this.setMax.get();
        syncChangedContactWorker.setMax = this.setMin.get();
        syncChangedContactWorker.length = this.getMin.get();
        syncChangedContactWorker.isInside = this.toFloatRange.get();
        return syncChangedContactWorker;
    }
}
