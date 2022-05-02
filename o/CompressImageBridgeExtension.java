package o;

import android.content.Context;
import o.b;
import o.notifyFail;

public final class CompressImageBridgeExtension implements getAdapterPosition<onPhotoSelected> {
    private final b.C0007b<getDefaultUserAgent> IsOverlapping;
    private final b.C0007b<PhotoPagerListener> equals;
    private final b.C0007b<getRangingNotifiers> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<notifyFail.length> isInside;
    private final b.C0007b<updateScanPeriods> length;
    private final b.C0007b<addDatas> setMax;
    private final b.C0007b<setNonBeaconLeScanCallback> setMin;
    private final b.C0007b<notifyCharacteristicValue> toFloatRange;
    private final b.C0007b<getNonBeaconLeScanCallback> toIntRange;

    private CompressImageBridgeExtension(b.C0007b<Context> bVar, b.C0007b<updateScanPeriods> bVar2, b.C0007b<getRangingNotifiers> bVar3, b.C0007b<addDatas> bVar4, b.C0007b<setNonBeaconLeScanCallback> bVar5, b.C0007b<getNonBeaconLeScanCallback> bVar6, b.C0007b<notifyCharacteristicValue> bVar7, b.C0007b<getDefaultUserAgent> bVar8, b.C0007b<PhotoPagerListener> bVar9, b.C0007b<notifyFail.length> bVar10) {
        this.getMin = bVar;
        this.length = bVar2;
        this.getMax = bVar3;
        this.setMax = bVar4;
        this.setMin = bVar5;
        this.toIntRange = bVar6;
        this.toFloatRange = bVar7;
        this.IsOverlapping = bVar8;
        this.equals = bVar9;
        this.isInside = bVar10;
    }

    public static CompressImageBridgeExtension setMax(b.C0007b<Context> bVar, b.C0007b<updateScanPeriods> bVar2, b.C0007b<getRangingNotifiers> bVar3, b.C0007b<addDatas> bVar4, b.C0007b<setNonBeaconLeScanCallback> bVar5, b.C0007b<getNonBeaconLeScanCallback> bVar6, b.C0007b<notifyCharacteristicValue> bVar7, b.C0007b<getDefaultUserAgent> bVar8, b.C0007b<PhotoPagerListener> bVar9, b.C0007b<notifyFail.length> bVar10) {
        return new CompressImageBridgeExtension(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final /* synthetic */ Object get() {
        return new onPhotoSelected(this.getMin.get(), this.length.get(), this.getMax.get(), this.setMax.get(), this.setMin.get(), this.toIntRange.get(), this.toFloatRange.get(), this.IsOverlapping.get(), this.equals.get(), this.isInside.get());
    }
}
