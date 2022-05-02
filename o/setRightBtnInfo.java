package o;

import o.b;
import o.setLeftButtonText;

public final class setRightBtnInfo implements getAdapterPosition<setLeftButtonIcon> {
    private final b.C0007b<ArmaRssiFilter> FastBitmap$CoordinateSystem;
    private final b.C0007b<empty> IsOverlapping;
    private final b.C0007b<isStatePreservationOn> equals;
    private final b.C0007b<access$3500> getMax;
    private final b.C0007b<stateOf> getMin;
    private final b.C0007b<getModel> isInside;
    private final b.C0007b<updateNewlyOutside> length;
    private final b.C0007b<access$3600> setMax;
    private final b.C0007b<setLeftButtonText.getMax> setMin;
    private final b.C0007b<sendData> toDoubleRange;
    private final b.C0007b<fromBundle> toFloatRange;
    private final b.C0007b<AUIconDrawable> toIntRange;
    private final b.C0007b<InfoAndroidLogger> toString;
    private final b.C0007b<setDEFAULT_ARMA_SPEED> values;

    private setRightBtnInfo(b.C0007b<setLeftButtonText.getMax> bVar, b.C0007b<stateOf> bVar2, b.C0007b<updateNewlyOutside> bVar3, b.C0007b<access$3600> bVar4, b.C0007b<access$3500> bVar5, b.C0007b<AUIconDrawable> bVar6, b.C0007b<getModel> bVar7, b.C0007b<isStatePreservationOn> bVar8, b.C0007b<fromBundle> bVar9, b.C0007b<empty> bVar10, b.C0007b<InfoAndroidLogger> bVar11, b.C0007b<setDEFAULT_ARMA_SPEED> bVar12, b.C0007b<sendData> bVar13, b.C0007b<ArmaRssiFilter> bVar14) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
        this.toIntRange = bVar6;
        this.isInside = bVar7;
        this.equals = bVar8;
        this.toFloatRange = bVar9;
        this.IsOverlapping = bVar10;
        this.toString = bVar11;
        this.values = bVar12;
        this.toDoubleRange = bVar13;
        this.FastBitmap$CoordinateSystem = bVar14;
    }

    public static setRightBtnInfo setMin(b.C0007b<setLeftButtonText.getMax> bVar, b.C0007b<stateOf> bVar2, b.C0007b<updateNewlyOutside> bVar3, b.C0007b<access$3600> bVar4, b.C0007b<access$3500> bVar5, b.C0007b<AUIconDrawable> bVar6, b.C0007b<getModel> bVar7, b.C0007b<isStatePreservationOn> bVar8, b.C0007b<fromBundle> bVar9, b.C0007b<empty> bVar10, b.C0007b<InfoAndroidLogger> bVar11, b.C0007b<setDEFAULT_ARMA_SPEED> bVar12, b.C0007b<sendData> bVar13, b.C0007b<ArmaRssiFilter> bVar14) {
        return new setRightBtnInfo(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14);
    }

    public final /* synthetic */ Object get() {
        return new setLeftButtonIcon(this.setMin.get(), this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get(), this.toIntRange.get(), this.isInside.get(), this.equals.get(), this.toFloatRange.get(), this.IsOverlapping.get(), this.toString.get(), this.values.get(), this.toDoubleRange.get(), this.FastBitmap$CoordinateSystem.get());
    }
}
