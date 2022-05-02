package o;

import o.CycledLeScannerForJellyBeanMr2;
import o.CycledLeScannerForLollipop;
import o.ToolUtils;
import o.b;

public final class IconfontConstants implements getAdapterPosition<getResourceId> {
    private final b.C0007b<CycledLeScannerForJellyBeanMr2.AnonymousClass1> getMax;
    private final b.C0007b<ToolUtils.length> getMin;
    private final b.C0007b<CycledLeScannerForLollipop.AnonymousClass2> length;
    private final b.C0007b<CycledLeScannerForLollipop.AnonymousClass3> setMax;

    private IconfontConstants(b.C0007b<ToolUtils.length> bVar, b.C0007b<CycledLeScannerForLollipop.AnonymousClass3> bVar2, b.C0007b<CycledLeScannerForLollipop.AnonymousClass2> bVar3, b.C0007b<CycledLeScannerForJellyBeanMr2.AnonymousClass1> bVar4) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
        this.getMax = bVar4;
    }

    public static IconfontConstants getMin(b.C0007b<ToolUtils.length> bVar, b.C0007b<CycledLeScannerForLollipop.AnonymousClass3> bVar2, b.C0007b<CycledLeScannerForLollipop.AnonymousClass2> bVar3, b.C0007b<CycledLeScannerForJellyBeanMr2.AnonymousClass1> bVar4) {
        return new IconfontConstants(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getResourceId(this.getMin.get(), this.setMax.get(), this.length.get(), this.getMax.get());
    }
}
