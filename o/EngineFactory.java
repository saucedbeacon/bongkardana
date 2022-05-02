package o;

import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class EngineFactory implements getAdapterPosition<registerRenderInitListener> {
    private final b.C0007b<getTabBar> equals;
    private final b.C0007b<BackKeyDownPoint> getMax;
    private final b.C0007b<getAppLaunchParams> getMin;
    private final b.C0007b<getFontBar> length;
    private final b.C0007b<DialogLayout> setMax;
    private final b.C0007b<b.AnonymousClass3> setMin;
    private final b.C0007b<SpaceResultMapper> toIntRange;

    private EngineFactory(b.C0007b<getFontBar> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7) {
        this.length = bVar;
        this.setMax = bVar2;
        this.setMin = bVar3;
        this.getMax = bVar4;
        this.getMin = bVar5;
        this.equals = bVar6;
        this.toIntRange = bVar7;
    }

    public static EngineFactory setMax(b.C0007b<getFontBar> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7) {
        return new EngineFactory(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new registerRenderInitListener(this.length.get(), this.setMax.get(), this.setMin.get(), this.getMax.get(), this.getMin.get(), this.equals.get(), this.toIntRange.get());
    }
}
