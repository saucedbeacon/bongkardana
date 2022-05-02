package o;

import android.content.Context;
import id.dana.data.content.mapper.ContentsMapper;
import o.IPCParameter;
import o.RVFragment;
import o.b;

public final class isAlreadyScheduleAdded implements getAdapterPosition<RVFragment> {
    private final b.C0007b<RVFragment.AnonymousClass2> IsOverlapping;
    private final b.C0007b<ContentsMapper> equals;
    private final b.C0007b<Context> getMax;
    private final b.C0007b<setPage> getMin;
    private final b.C0007b<BackKeyDownPoint> hashCode;
    private final b.C0007b<DialogLayout> isInside;
    private final b.C0007b<onCallBack> length;
    private final b.C0007b<IPCParameter.AnonymousClass1> setMax;
    private final b.C0007b<setShouldResumeWebView> setMin;
    private final b.C0007b<b.AnonymousClass3> toDoubleRange;
    private final b.C0007b<getFontBar> toFloatRange;
    private final b.C0007b<getAppLaunchParams> toIntRange;

    private isAlreadyScheduleAdded(b.C0007b<Context> bVar, b.C0007b<setShouldResumeWebView> bVar2, b.C0007b<onCallBack> bVar3, b.C0007b<setPage> bVar4, b.C0007b<IPCParameter.AnonymousClass1> bVar5, b.C0007b<RVFragment.AnonymousClass2> bVar6, b.C0007b<getFontBar> bVar7, b.C0007b<ContentsMapper> bVar8, b.C0007b<DialogLayout> bVar9, b.C0007b<getAppLaunchParams> bVar10, b.C0007b<BackKeyDownPoint> bVar11, b.C0007b<b.AnonymousClass3> bVar12) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
        this.getMin = bVar4;
        this.setMax = bVar5;
        this.IsOverlapping = bVar6;
        this.toFloatRange = bVar7;
        this.equals = bVar8;
        this.isInside = bVar9;
        this.toIntRange = bVar10;
        this.hashCode = bVar11;
        this.toDoubleRange = bVar12;
    }

    public static isAlreadyScheduleAdded setMax(b.C0007b<Context> bVar, b.C0007b<setShouldResumeWebView> bVar2, b.C0007b<onCallBack> bVar3, b.C0007b<setPage> bVar4, b.C0007b<IPCParameter.AnonymousClass1> bVar5, b.C0007b<RVFragment.AnonymousClass2> bVar6, b.C0007b<getFontBar> bVar7, b.C0007b<ContentsMapper> bVar8, b.C0007b<DialogLayout> bVar9, b.C0007b<getAppLaunchParams> bVar10, b.C0007b<BackKeyDownPoint> bVar11, b.C0007b<b.AnonymousClass3> bVar12) {
        return new isAlreadyScheduleAdded(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12);
    }

    public final /* synthetic */ Object get() {
        return new RVFragment(this.getMax.get(), this.setMin.get(), this.length.get(), this.getMin.get(), this.setMax.get(), this.IsOverlapping.get(), this.toFloatRange.get(), this.equals.get(), this.isInside.get(), this.toIntRange.get(), this.hashCode.get(), this.toDoubleRange.get());
    }
}
