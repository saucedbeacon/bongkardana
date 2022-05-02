package o;

import o.GriverInnerAmcsLiteConfig;
import o.GriverInnerConfig;
import o.VersionedParcelize;
import o.b;

public final class instantiateItem implements getAdapterPosition<jetifyAs> {
    private final b.C0007b<onCharacteristicWriteCompleted> IsOverlapping;
    private final b.C0007b<fetchAppList> equals;
    private final b.C0007b<GriverInnerConfig.AnonymousClass1> getMax;
    private final b.C0007b<getGriverSectionConfig> getMin;
    private final b.C0007b<GriverInnerAmcsLiteConfig.AnonymousClass2> isInside;
    private final b.C0007b<VersionedParcelize.setMin> length;
    private final b.C0007b<NetworkBridgeExtension> setMax;
    private final b.C0007b<RequestBridgeExtension> setMin;
    private final b.C0007b<onConnect> toFloatRange;
    private final b.C0007b<getIMEI> toIntRange;

    private instantiateItem(b.C0007b<VersionedParcelize.setMin> bVar, b.C0007b<getGriverSectionConfig> bVar2, b.C0007b<NetworkBridgeExtension> bVar3, b.C0007b<GriverInnerConfig.AnonymousClass1> bVar4, b.C0007b<RequestBridgeExtension> bVar5, b.C0007b<onCharacteristicWriteCompleted> bVar6, b.C0007b<onConnect> bVar7, b.C0007b<getIMEI> bVar8, b.C0007b<fetchAppList> bVar9, b.C0007b<GriverInnerAmcsLiteConfig.AnonymousClass2> bVar10) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
        this.setMin = bVar5;
        this.IsOverlapping = bVar6;
        this.toFloatRange = bVar7;
        this.toIntRange = bVar8;
        this.equals = bVar9;
        this.isInside = bVar10;
    }

    public static instantiateItem length(b.C0007b<VersionedParcelize.setMin> bVar, b.C0007b<getGriverSectionConfig> bVar2, b.C0007b<NetworkBridgeExtension> bVar3, b.C0007b<GriverInnerConfig.AnonymousClass1> bVar4, b.C0007b<RequestBridgeExtension> bVar5, b.C0007b<onCharacteristicWriteCompleted> bVar6, b.C0007b<onConnect> bVar7, b.C0007b<getIMEI> bVar8, b.C0007b<fetchAppList> bVar9, b.C0007b<GriverInnerAmcsLiteConfig.AnonymousClass2> bVar10) {
        return new instantiateItem(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final /* synthetic */ Object get() {
        return new jetifyAs(this.length.get(), this.getMin.get(), this.setMax.get(), this.getMax.get(), this.setMin.get(), this.IsOverlapping.get(), this.toFloatRange.get(), this.toIntRange.get(), this.equals.get(), this.isInside.get());
    }
}
