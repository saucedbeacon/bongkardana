package o;

import o.ConstraintProxy$StorageNotLowProxy;
import o.b;

public final class ConstraintProxyUpdateReceiver implements getAdapterPosition<ConstraintProxy$NetworkStateProxy> {
    private final b.C0007b<onJsBeforeUnload> IsOverlapping;
    private final b.C0007b<MovableFrameLayout> equals;
    private final b.C0007b<getDefaultFontSize> getMax;
    private final b.C0007b<removeTinyLocalStorage> getMin;
    private final b.C0007b<loadUrl> hashCode;
    private final b.C0007b<Beacon> isInside;
    private final b.C0007b<executeGetAuthCode> length;
    private final b.C0007b<setBackButton> setMax;
    private final b.C0007b<ConstraintProxy$StorageNotLowProxy.setMax> setMin;
    private final b.C0007b<CycledLeScannerForJellyBeanMr2> toFloatRange;
    private final b.C0007b<GriverBottomPopupDialog> toIntRange;

    private ConstraintProxyUpdateReceiver(b.C0007b<ConstraintProxy$StorageNotLowProxy.setMax> bVar, b.C0007b<removeTinyLocalStorage> bVar2, b.C0007b<executeGetAuthCode> bVar3, b.C0007b<setBackButton> bVar4, b.C0007b<getDefaultFontSize> bVar5, b.C0007b<CycledLeScannerForJellyBeanMr2> bVar6, b.C0007b<onJsBeforeUnload> bVar7, b.C0007b<Beacon> bVar8, b.C0007b<GriverBottomPopupDialog> bVar9, b.C0007b<MovableFrameLayout> bVar10, b.C0007b<loadUrl> bVar11) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
        this.toFloatRange = bVar6;
        this.IsOverlapping = bVar7;
        this.isInside = bVar8;
        this.toIntRange = bVar9;
        this.equals = bVar10;
        this.hashCode = bVar11;
    }

    public static ConstraintProxyUpdateReceiver getMax(b.C0007b<ConstraintProxy$StorageNotLowProxy.setMax> bVar, b.C0007b<removeTinyLocalStorage> bVar2, b.C0007b<executeGetAuthCode> bVar3, b.C0007b<setBackButton> bVar4, b.C0007b<getDefaultFontSize> bVar5, b.C0007b<CycledLeScannerForJellyBeanMr2> bVar6, b.C0007b<onJsBeforeUnload> bVar7, b.C0007b<Beacon> bVar8, b.C0007b<GriverBottomPopupDialog> bVar9, b.C0007b<MovableFrameLayout> bVar10, b.C0007b<loadUrl> bVar11) {
        return new ConstraintProxyUpdateReceiver(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11);
    }

    public final /* synthetic */ Object get() {
        ConstraintProxy$NetworkStateProxy constraintProxy$NetworkStateProxy = new ConstraintProxy$NetworkStateProxy(this.setMin.get(), this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get(), this.toFloatRange.get(), this.IsOverlapping.get());
        onAllCommandsCompleted.length(constraintProxy$NetworkStateProxy, this.isInside.get(), this.toIntRange.get(), this.equals.get(), this.hashCode.get());
        return constraintProxy$NetworkStateProxy;
    }
}
