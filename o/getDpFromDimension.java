package o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import id.dana.synccontact.worker.syncallcontact.SyncAllContactWorker;
import javax.inject.Inject;
import o.CycledLeScanner;
import o.b;

public final class getDpFromDimension implements setMerchantId {
    private final b.C0007b<getApFromString> equals;
    private final b.C0007b<getWakeUpOperation> getMax;
    private final b.C0007b<CycledLeScanner.AnonymousClass2> getMin;
    private final b.C0007b<GVErrorView> isInside;
    private final b.C0007b<CycledLeScanner.AnonymousClass1> length;
    private final b.C0007b<setWakeUpAlarm> setMax;
    private final b.C0007b<scanLeDevice> setMin;
    private final b.C0007b<getApFromDimen> toFloatRange;

    @Inject
    public getDpFromDimension(b.C0007b<setWakeUpAlarm> bVar, b.C0007b<CycledLeScanner.AnonymousClass1> bVar2, b.C0007b<CycledLeScanner.AnonymousClass2> bVar3, b.C0007b<getWakeUpOperation> bVar4, b.C0007b<scanLeDevice> bVar5, b.C0007b<getApFromString> bVar6, b.C0007b<getApFromDimen> bVar7, b.C0007b<GVErrorView> bVar8) {
        this.setMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
        this.getMax = bVar4;
        this.setMin = bVar5;
        this.equals = bVar6;
        this.toFloatRange = bVar7;
        this.isInside = bVar8;
    }

    public final ListenableWorker getMax(Context context, WorkerParameters workerParameters) {
        SyncAllContactWorker syncAllContactWorker = new SyncAllContactWorker(context, workerParameters, this.equals.get(), this.toFloatRange.get());
        syncAllContactWorker.toFloatRange = this.setMax.get();
        syncAllContactWorker.setMax = this.length.get();
        syncAllContactWorker.length = this.getMax.get();
        syncAllContactWorker.isInside = this.isInside.get();
        syncAllContactWorker.IsOverlapping = this.getMin.get();
        syncAllContactWorker.toDoubleRange = this.setMin.get();
        return syncAllContactWorker;
    }
}
