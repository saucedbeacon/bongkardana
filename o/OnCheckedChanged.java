package o;

import android.content.Context;
import id.dana.domain.authcode.interactor.GetAuthCode;
import o.BLEManager;
import o.b;
import o.style;

public final class OnCheckedChanged implements getAdapterPosition<BindInt> {
    private final b.C0007b<hasSameIdentifiers> IsOverlapping;
    private final b.C0007b<onConnect> equals;
    private final b.C0007b<onCharacteristicWriteCompleted> getMax;
    private final b.C0007b<style.getMin> getMin;
    private final b.C0007b<BLEManager.AnonymousClass2.C00022> hashCode;
    private final b.C0007b<convertIntentsToCallbacks> isInside;
    private final b.C0007b<Context> length;
    private final b.C0007b<GetAuthCode> setMax;
    private final b.C0007b<parseBatteryPercentage> setMin;
    private final b.C0007b<toByteArray> toDoubleRange;
    private final b.C0007b<Region$1> toFloatRange;
    private final b.C0007b<getUniqueId> toIntRange;
    private final b.C0007b<didExitRegion> toString;
    private final b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> values;

    private OnCheckedChanged(b.C0007b<Context> bVar, b.C0007b<style.getMin> bVar2, b.C0007b<GetAuthCode> bVar3, b.C0007b<parseBatteryPercentage> bVar4, b.C0007b<onCharacteristicWriteCompleted> bVar5, b.C0007b<onConnect> bVar6, b.C0007b<hasSameIdentifiers> bVar7, b.C0007b<Region$1> bVar8, b.C0007b<getUniqueId> bVar9, b.C0007b<convertIntentsToCallbacks> bVar10, b.C0007b<toByteArray> bVar11, b.C0007b<didExitRegion> bVar12, b.C0007b<BLEManager.AnonymousClass2.C00022> bVar13, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> bVar14) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
        this.equals = bVar6;
        this.IsOverlapping = bVar7;
        this.toFloatRange = bVar8;
        this.toIntRange = bVar9;
        this.isInside = bVar10;
        this.toDoubleRange = bVar11;
        this.toString = bVar12;
        this.hashCode = bVar13;
        this.values = bVar14;
    }

    public static OnCheckedChanged length(b.C0007b<Context> bVar, b.C0007b<style.getMin> bVar2, b.C0007b<GetAuthCode> bVar3, b.C0007b<parseBatteryPercentage> bVar4, b.C0007b<onCharacteristicWriteCompleted> bVar5, b.C0007b<onConnect> bVar6, b.C0007b<hasSameIdentifiers> bVar7, b.C0007b<Region$1> bVar8, b.C0007b<getUniqueId> bVar9, b.C0007b<convertIntentsToCallbacks> bVar10, b.C0007b<toByteArray> bVar11, b.C0007b<didExitRegion> bVar12, b.C0007b<BLEManager.AnonymousClass2.C00022> bVar13, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> bVar14) {
        return new OnCheckedChanged(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14);
    }

    public final /* synthetic */ Object get() {
        return new BindInt(this.length.get(), this.getMin.get(), this.setMax.get(), this.setMin.get(), this.getMax.get(), this.equals.get(), this.IsOverlapping.get(), this.toFloatRange.get(), this.toIntRange.get(), this.isInside.get(), this.toDoubleRange.get(), this.toString.get(), this.hashCode.get(), this.values.get());
    }
}
