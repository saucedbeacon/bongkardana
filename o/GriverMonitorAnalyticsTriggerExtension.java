package o;

import android.content.Context;
import o.GriverBridgeManifest;
import o.b;

public final class GriverMonitorAnalyticsTriggerExtension implements getAdapterPosition<GriverExtensionRegistry> {
    private final b.C0007b<setMenus> IsOverlapping;
    private final b.C0007b<setOverride> equals;
    private final b.C0007b<savePassword> getMax;
    private final b.C0007b<getSharedPreferenceForApp> getMin;
    private final b.C0007b<setReset> isInside;
    private final b.C0007b<GriverAppUpdater> length;
    private final b.C0007b<GriverBridgeManifest.setMax> setMax;
    private final b.C0007b<setMinimumLogicalFontSize> setMin;
    private final b.C0007b<isOverride> toFloatRange;
    private final b.C0007b<Context> toIntRange;

    private GriverMonitorAnalyticsTriggerExtension(b.C0007b<savePassword> bVar, b.C0007b<GriverBridgeManifest.setMax> bVar2, b.C0007b<GriverAppUpdater> bVar3, b.C0007b<setMinimumLogicalFontSize> bVar4, b.C0007b<getSharedPreferenceForApp> bVar5, b.C0007b<isOverride> bVar6, b.C0007b<setReset> bVar7, b.C0007b<setOverride> bVar8, b.C0007b<setMenus> bVar9, b.C0007b<Context> bVar10) {
        this.getMax = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
        this.getMin = bVar5;
        this.toFloatRange = bVar6;
        this.isInside = bVar7;
        this.equals = bVar8;
        this.IsOverlapping = bVar9;
        this.toIntRange = bVar10;
    }

    public static GriverMonitorAnalyticsTriggerExtension getMax(b.C0007b<savePassword> bVar, b.C0007b<GriverBridgeManifest.setMax> bVar2, b.C0007b<GriverAppUpdater> bVar3, b.C0007b<setMinimumLogicalFontSize> bVar4, b.C0007b<getSharedPreferenceForApp> bVar5, b.C0007b<isOverride> bVar6, b.C0007b<setReset> bVar7, b.C0007b<setOverride> bVar8, b.C0007b<setMenus> bVar9, b.C0007b<Context> bVar10) {
        return new GriverMonitorAnalyticsTriggerExtension(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final /* synthetic */ Object get() {
        return new GriverExtensionRegistry(this.getMax.get(), this.setMax.get(), this.length.get(), this.setMin.get(), this.getMin.get(), this.toFloatRange.get(), this.isInside.get(), this.equals.get(), this.IsOverlapping.get(), this.toIntRange.get());
    }
}
