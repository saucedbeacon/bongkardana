package o;

import android.content.Context;
import o.TitleBarExtension;
import o.b;

public final class WebContentExtension implements getAdapterPosition<showBackHome> {
    private final b.C0007b<getStartIndex> IsOverlapping;
    private final b.C0007b<getPdus> equals;
    private final b.C0007b<isLastRecoverySucceeded> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<ScanFilterUtils> isInside;
    private final b.C0007b<onNonBeaconLeScan> length;
    private final b.C0007b<getDetectedCrashCount> setMax;
    private final b.C0007b<TitleBarExtension.AnonymousClass1.length> setMin;
    private final b.C0007b<BootstrapNotifier> toFloatRange;

    private WebContentExtension(b.C0007b<Context> bVar, b.C0007b<TitleBarExtension.AnonymousClass1.length> bVar2, b.C0007b<getDetectedCrashCount> bVar3, b.C0007b<onNonBeaconLeScan> bVar4, b.C0007b<isLastRecoverySucceeded> bVar5, b.C0007b<ScanFilterUtils> bVar6, b.C0007b<getStartIndex> bVar7, b.C0007b<BootstrapNotifier> bVar8, b.C0007b<getPdus> bVar9) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.setMax = bVar3;
        this.length = bVar4;
        this.getMax = bVar5;
        this.isInside = bVar6;
        this.IsOverlapping = bVar7;
        this.toFloatRange = bVar8;
        this.equals = bVar9;
    }

    public static WebContentExtension length(b.C0007b<Context> bVar, b.C0007b<TitleBarExtension.AnonymousClass1.length> bVar2, b.C0007b<getDetectedCrashCount> bVar3, b.C0007b<onNonBeaconLeScan> bVar4, b.C0007b<isLastRecoverySucceeded> bVar5, b.C0007b<ScanFilterUtils> bVar6, b.C0007b<getStartIndex> bVar7, b.C0007b<BootstrapNotifier> bVar8, b.C0007b<getPdus> bVar9) {
        return new WebContentExtension(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public final /* synthetic */ Object get() {
        return new showBackHome(this.getMin.get(), this.setMin.get(), this.setMax.get(), this.length.get(), this.getMax.get(), this.isInside.get(), this.IsOverlapping.get(), this.toFloatRange.get(), this.equals.get());
    }
}
