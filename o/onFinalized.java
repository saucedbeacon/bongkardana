package o;

import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class onFinalized implements getAdapterPosition<NodeInstance> {
    private final b.C0007b<getTabBar> equals;
    private final b.C0007b<BackKeyDownPoint> getMax;
    private final b.C0007b<getFontBar> getMin;
    private final b.C0007b<DialogLayout> length;
    private final b.C0007b<b.AnonymousClass3> setMax;
    private final b.C0007b<getAppLaunchParams> setMin;
    private final b.C0007b<SpaceResultMapper> toFloatRange;

    private onFinalized(b.C0007b<getFontBar> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7) {
        this.getMin = bVar;
        this.length = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
        this.setMin = bVar5;
        this.equals = bVar6;
        this.toFloatRange = bVar7;
    }

    public static onFinalized getMin(b.C0007b<getFontBar> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7) {
        return new onFinalized(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new NodeInstance(this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get(), this.setMin.get(), this.equals.get(), this.toFloatRange.get());
    }
}
