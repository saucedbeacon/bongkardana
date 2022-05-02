package o;

import o.b;

public final class getRuntimeSupportMax implements getAdapterPosition<checkRuntimeVersion> {
    private final b.C0007b<NetworkStream> getMax;
    private final b.C0007b<access$2300> getMin;

    private getRuntimeSupportMax(b.C0007b<NetworkStream> bVar, b.C0007b<access$2300> bVar2) {
        this.getMax = bVar;
        this.getMin = bVar2;
    }

    public static getRuntimeSupportMax length(b.C0007b<NetworkStream> bVar, b.C0007b<access$2300> bVar2) {
        return new getRuntimeSupportMax(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new checkRuntimeVersion(this.getMax.get(), this.getMin.get());
    }
}
