package o;

import o.b;
import o.primaryKeys;

public final class insertAndReturnIdsArrayBox implements getAdapterPosition<foreignKeys> {
    private final b.C0007b<getIdentifiers> getMax;
    private final b.C0007b<primaryKeys.setMax> getMin;
    private final b.C0007b<SaveImageToAlbumBridgeExtension> length;
    private final b.C0007b<BleGattService> setMax;

    private insertAndReturnIdsArrayBox(b.C0007b<primaryKeys.setMax> bVar, b.C0007b<getIdentifiers> bVar2, b.C0007b<BleGattService> bVar3, b.C0007b<SaveImageToAlbumBridgeExtension> bVar4) {
        this.getMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.length = bVar4;
    }

    public static insertAndReturnIdsArrayBox setMax(b.C0007b<primaryKeys.setMax> bVar, b.C0007b<getIdentifiers> bVar2, b.C0007b<BleGattService> bVar3, b.C0007b<SaveImageToAlbumBridgeExtension> bVar4) {
        return new insertAndReturnIdsArrayBox(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new foreignKeys(this.getMin.get(), this.getMax.get(), this.setMax.get(), this.length.get());
    }
}
