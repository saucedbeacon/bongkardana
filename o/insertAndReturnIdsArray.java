package o;

import android.content.Context;
import o.ForeignKey;
import o.PhotoResolver;
import o.b;

public final class insertAndReturnIdsArray implements getAdapterPosition<ExperimentalRoomApi> {
    private final b.C0007b<getBluetoothAddress> IsOverlapping;
    private final b.C0007b<H5ErrorCode> equals;
    private final b.C0007b<ForeignKey.getMax> getMax;
    private final b.C0007b<PhotoResolver.AnonymousClass1> getMin;
    private final b.C0007b<SaveImageToAlbumBridgeExtension> hashCode;
    private final b.C0007b<getDataFields> isInside;
    private final b.C0007b<getServiceUuid> length;
    private final b.C0007b<setExtraDataFields> setMax;
    private final b.C0007b<Context> setMin;
    private final b.C0007b<getBeaconTypeCode> toFloatRange;
    private final b.C0007b<getManufacturer> toIntRange;
    private final b.C0007b<PrepareContextUitls> toString;

    private insertAndReturnIdsArray(b.C0007b<ForeignKey.getMax> bVar, b.C0007b<Context> bVar2, b.C0007b<PhotoResolver.AnonymousClass1> bVar3, b.C0007b<setExtraDataFields> bVar4, b.C0007b<getServiceUuid> bVar5, b.C0007b<getManufacturer> bVar6, b.C0007b<getBeaconTypeCode> bVar7, b.C0007b<getDataFields> bVar8, b.C0007b<getBluetoothAddress> bVar9, b.C0007b<H5ErrorCode> bVar10, b.C0007b<PrepareContextUitls> bVar11, b.C0007b<SaveImageToAlbumBridgeExtension> bVar12) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.setMax = bVar4;
        this.length = bVar5;
        this.toIntRange = bVar6;
        this.toFloatRange = bVar7;
        this.isInside = bVar8;
        this.IsOverlapping = bVar9;
        this.equals = bVar10;
        this.toString = bVar11;
        this.hashCode = bVar12;
    }

    public static insertAndReturnIdsArray getMin(b.C0007b<ForeignKey.getMax> bVar, b.C0007b<Context> bVar2, b.C0007b<PhotoResolver.AnonymousClass1> bVar3, b.C0007b<setExtraDataFields> bVar4, b.C0007b<getServiceUuid> bVar5, b.C0007b<getManufacturer> bVar6, b.C0007b<getBeaconTypeCode> bVar7, b.C0007b<getDataFields> bVar8, b.C0007b<getBluetoothAddress> bVar9, b.C0007b<H5ErrorCode> bVar10, b.C0007b<PrepareContextUitls> bVar11, b.C0007b<SaveImageToAlbumBridgeExtension> bVar12) {
        return new insertAndReturnIdsArray(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12);
    }

    public final /* synthetic */ Object get() {
        return new ExperimentalRoomApi(this.getMax.get(), this.setMin.get(), this.getMin.get(), this.setMax.get(), this.length.get(), this.toIntRange.get(), this.toFloatRange.get(), this.isInside.get(), this.IsOverlapping.get(), this.equals.get(), this.toString.get(), this.hashCode.get());
    }
}
