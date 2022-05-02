package o;

import o.b;

public final class checkUrlCanStartInPushWindow implements getAdapterPosition<OneShotRunnable> {
    private final b.C0007b<isLogin> IsOverlapping;
    private final b.C0007b<getAppLaunchParams> getMax;
    private final b.C0007b<getUserAvatar> getMin;
    private final b.C0007b<DialogLayout> length;
    private final b.C0007b<b.AnonymousClass3> setMax;
    private final b.C0007b<BackKeyDownPoint> setMin;

    private checkUrlCanStartInPushWindow(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getUserAvatar> bVar5, b.C0007b<isLogin> bVar6) {
        this.length = bVar;
        this.setMax = bVar2;
        this.setMin = bVar3;
        this.getMax = bVar4;
        this.getMin = bVar5;
        this.IsOverlapping = bVar6;
    }

    public static checkUrlCanStartInPushWindow setMax(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getUserAvatar> bVar5, b.C0007b<isLogin> bVar6) {
        return new checkUrlCanStartInPushWindow(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final /* synthetic */ Object get() {
        return new OneShotRunnable(this.length.get(), this.setMax.get(), this.setMin.get(), this.getMax.get(), this.getMin.get(), this.IsOverlapping.get());
    }
}
