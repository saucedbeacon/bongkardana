package o;

import o.b;
import o.hexStringToBytes;

public final class isLocationEnable implements getAdapterPosition<hexStringToBytesInReverse> {
    private final b.C0007b<hexStringToBytes.getMax> getMax;
    private final b.C0007b<ShouldLoadUrlPoint> length;

    private isLocationEnable(b.C0007b<hexStringToBytes.getMax> bVar, b.C0007b<ShouldLoadUrlPoint> bVar2) {
        this.getMax = bVar;
        this.length = bVar2;
    }

    public static isLocationEnable setMin(b.C0007b<hexStringToBytes.getMax> bVar, b.C0007b<ShouldLoadUrlPoint> bVar2) {
        return new isLocationEnable(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new hexStringToBytesInReverse(this.getMax.get(), this.length.get());
    }
}
