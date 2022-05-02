package o;

import o.b;

public final class filterCreatePageParams implements getAdapterPosition<ParamUtils> {
    private final b.C0007b<getAppLaunchParams> getMax;
    private final b.C0007b<b.AnonymousClass3> getMin;
    private final b.C0007b<setDefaultValue> length;
    private final b.C0007b<BackKeyDownPoint> setMax;
    private final b.C0007b<DialogLayout> setMin;
    private final b.C0007b<onCallBack> toFloatRange;

    private filterCreatePageParams(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<setDefaultValue> bVar5, b.C0007b<onCallBack> bVar6) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
        this.length = bVar5;
        this.toFloatRange = bVar6;
    }

    public static filterCreatePageParams setMin(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<setDefaultValue> bVar5, b.C0007b<onCallBack> bVar6) {
        return new filterCreatePageParams(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final /* synthetic */ Object get() {
        return new ParamUtils(this.setMin.get(), this.getMin.get(), this.setMax.get(), this.getMax.get(), this.length.get(), this.toFloatRange.get());
    }
}
