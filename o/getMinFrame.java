package o;

import o.b;

public final class getMinFrame implements getAdapterPosition<playAnimation> {
    private final b.C0007b<getOrigin> getMax;
    private final b.C0007b<DialogLayout> getMin;
    private final b.C0007b<b.AnonymousClass3> length;
    private final b.C0007b<getAppLaunchParams> setMax;
    private final b.C0007b<BackKeyDownPoint> setMin;

    private getMinFrame(b.C0007b<getOrigin> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
        this.setMax = bVar5;
    }

    public static getMinFrame getMin(b.C0007b<getOrigin> bVar, b.C0007b<DialogLayout> bVar2, b.C0007b<b.AnonymousClass3> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<getAppLaunchParams> bVar5) {
        return new getMinFrame(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new playAnimation(this.getMax.get(), this.getMin.get(), this.length.get(), this.setMin.get(), this.setMax.get());
    }
}
