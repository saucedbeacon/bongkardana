package o;

import o.b;
import o.enqueueWorkRequests;

public final class cancelWorkById implements getAdapterPosition<cancelUniqueWork> {
    private final b.C0007b<getManifestCheckingDisabled> getMax;
    private final b.C0007b<BluetoothManifest> getMin;
    private final b.C0007b<ResourceDownloadType> length;
    private final b.C0007b<setH5ErrorPage> setMax;
    private final b.C0007b<enqueueWorkRequests.setMax> setMin;

    private cancelWorkById(b.C0007b<enqueueWorkRequests.setMax> bVar, b.C0007b<getManifestCheckingDisabled> bVar2, b.C0007b<BluetoothManifest> bVar3, b.C0007b<ResourceDownloadType> bVar4, b.C0007b<setH5ErrorPage> bVar5) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
        this.length = bVar4;
        this.setMax = bVar5;
    }

    public static cancelWorkById setMax(b.C0007b<enqueueWorkRequests.setMax> bVar, b.C0007b<getManifestCheckingDisabled> bVar2, b.C0007b<BluetoothManifest> bVar3, b.C0007b<ResourceDownloadType> bVar4, b.C0007b<setH5ErrorPage> bVar5) {
        return new cancelWorkById(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new cancelUniqueWork(this.setMin.get(), this.getMax.get(), this.getMin.get(), this.length.get(), this.setMax.get());
    }
}
