package o;

import android.content.Context;
import o.GriverManifest;
import o.b;

public final class GriverNativeBridge implements getAdapterPosition<GriverParams> {
    private final b.C0007b<Context> IsOverlapping;
    private final b.C0007b<setOverride> equals;
    private final b.C0007b<setMinimumLogicalFontSize> getMax;
    private final b.C0007b<GriverManifest.AnonymousClass8.length> getMin;
    private final b.C0007b<setMenus> isInside;
    private final b.C0007b<GriverAppUpdater> length;
    private final b.C0007b<savePassword> setMax;
    private final b.C0007b<getSharedPreferenceForApp> setMin;
    private final b.C0007b<setReset> toFloatRange;
    private final b.C0007b<isOverride> toIntRange;

    private GriverNativeBridge(b.C0007b<savePassword> bVar, b.C0007b<GriverManifest.AnonymousClass8.length> bVar2, b.C0007b<GriverAppUpdater> bVar3, b.C0007b<getSharedPreferenceForApp> bVar4, b.C0007b<setMinimumLogicalFontSize> bVar5, b.C0007b<isOverride> bVar6, b.C0007b<setReset> bVar7, b.C0007b<setOverride> bVar8, b.C0007b<setMenus> bVar9, b.C0007b<Context> bVar10) {
        this.setMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
        this.toIntRange = bVar6;
        this.toFloatRange = bVar7;
        this.equals = bVar8;
        this.isInside = bVar9;
        this.IsOverlapping = bVar10;
    }

    public static GriverNativeBridge getMin(b.C0007b<savePassword> bVar, b.C0007b<GriverManifest.AnonymousClass8.length> bVar2, b.C0007b<GriverAppUpdater> bVar3, b.C0007b<getSharedPreferenceForApp> bVar4, b.C0007b<setMinimumLogicalFontSize> bVar5, b.C0007b<isOverride> bVar6, b.C0007b<setReset> bVar7, b.C0007b<setOverride> bVar8, b.C0007b<setMenus> bVar9, b.C0007b<Context> bVar10) {
        return new GriverNativeBridge(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final /* synthetic */ Object get() {
        return new GriverParams(this.setMax.get(), this.getMin.get(), this.length.get(), this.setMin.get(), this.getMax.get(), this.toIntRange.get(), this.toFloatRange.get(), this.equals.get(), this.isInside.get(), this.IsOverlapping.get());
    }
}
