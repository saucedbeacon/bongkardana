package o;

import android.content.Context;
import o.GriverOpenAuthExtension;
import o.b;
import o.dispatchOnPageScrolled;

public final class recomputeScrollPosition implements getAdapterPosition<infoForPosition> {
    private final b.C0007b<isSdkMatch> IsOverlapping;
    private final b.C0007b<Context> equals;
    private final b.C0007b<handleSnapshot> getMax;
    private final b.C0007b<getCharset> getMin;
    private final b.C0007b<isDomainMatch> isInside;
    private final b.C0007b<GriverOpenAuthExtension.RevokeCallback> length;
    private final b.C0007b<dispatchOnPageScrolled.getMax> setMax;
    private final b.C0007b<getAssetUrl> setMin;
    private final b.C0007b<writeImage> toFloatRange;
    private final b.C0007b<loadData> toIntRange;

    private recomputeScrollPosition(b.C0007b<getAssetUrl> bVar, b.C0007b<dispatchOnPageScrolled.getMax> bVar2, b.C0007b<handleSnapshot> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4, b.C0007b<getCharset> bVar5, b.C0007b<isSdkMatch> bVar6, b.C0007b<isDomainMatch> bVar7, b.C0007b<writeImage> bVar8, b.C0007b<loadData> bVar9, b.C0007b<Context> bVar10) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
        this.IsOverlapping = bVar6;
        this.isInside = bVar7;
        this.toFloatRange = bVar8;
        this.toIntRange = bVar9;
        this.equals = bVar10;
    }

    public static recomputeScrollPosition getMax(b.C0007b<getAssetUrl> bVar, b.C0007b<dispatchOnPageScrolled.getMax> bVar2, b.C0007b<handleSnapshot> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4, b.C0007b<getCharset> bVar5, b.C0007b<isSdkMatch> bVar6, b.C0007b<isDomainMatch> bVar7, b.C0007b<writeImage> bVar8, b.C0007b<loadData> bVar9, b.C0007b<Context> bVar10) {
        return new recomputeScrollPosition(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final /* synthetic */ Object get() {
        return new infoForPosition(this.setMin.get(), this.setMax.get(), this.getMax.get(), this.length.get(), this.getMin.get(), this.IsOverlapping.get(), this.isInside.get(), this.toFloatRange.get(), this.toIntRange.get(), this.equals.get());
    }
}
