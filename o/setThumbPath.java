package o;

import o.APWebSettings;
import o.PhotoResolver;
import o.b;
import o.setMediaId;

public final class setThumbPath implements getAdapterPosition<setIsPicCurrentlyTaked> {
    private final b.C0007b<getDefaultUserAgent> getMax;
    private final b.C0007b<setMediaId.getMin> getMin;
    private final b.C0007b<filterCommonResources> isInside;
    private final b.C0007b<PrepareContextUitls> length;
    private final b.C0007b<APWebSettings.RenderPriority> setMax;
    private final b.C0007b<PhotoResolver.AnonymousClass2> setMin;
    private final b.C0007b<transitToError> toFloatRange;
    private final b.C0007b<registerStageMonitor> toIntRange;

    private setThumbPath(b.C0007b<setMediaId.getMin> bVar, b.C0007b<PrepareContextUitls> bVar2, b.C0007b<PhotoResolver.AnonymousClass2> bVar3, b.C0007b<APWebSettings.RenderPriority> bVar4, b.C0007b<getDefaultUserAgent> bVar5, b.C0007b<transitToError> bVar6, b.C0007b<filterCommonResources> bVar7, b.C0007b<registerStageMonitor> bVar8) {
        this.getMin = bVar;
        this.length = bVar2;
        this.setMin = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
        this.toFloatRange = bVar6;
        this.isInside = bVar7;
        this.toIntRange = bVar8;
    }

    public static setThumbPath getMin(b.C0007b<setMediaId.getMin> bVar, b.C0007b<PrepareContextUitls> bVar2, b.C0007b<PhotoResolver.AnonymousClass2> bVar3, b.C0007b<APWebSettings.RenderPriority> bVar4, b.C0007b<getDefaultUserAgent> bVar5, b.C0007b<transitToError> bVar6, b.C0007b<filterCommonResources> bVar7, b.C0007b<registerStageMonitor> bVar8) {
        return new setThumbPath(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final /* synthetic */ Object get() {
        return new setIsPicCurrentlyTaked(this.getMin.get(), this.length.get(), this.setMin.get(), this.setMax.get(), this.getMax.get(), this.toFloatRange.get(), this.isInside.get(), this.toIntRange.get());
    }
}
