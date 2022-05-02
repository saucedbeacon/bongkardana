package o;

import o.b;

public final class addStubToClient implements getAdapterPosition<sendMsgToServerByApp> {
    private final b.C0007b<b.AnonymousClass3> getMax;
    private final b.C0007b<getAppLaunchParams> getMin;
    private final b.C0007b<addAttrToClient> length;
    private final b.C0007b<DialogLayout> setMax;
    private final b.C0007b<BackKeyDownPoint> setMin;

    private addStubToClient(b.C0007b<DialogLayout> bVar, b.C0007b<addAttrToClient> bVar2, b.C0007b<getAppLaunchParams> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<b.AnonymousClass3> bVar5) {
        this.setMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
    }

    public static addStubToClient getMin(b.C0007b<DialogLayout> bVar, b.C0007b<addAttrToClient> bVar2, b.C0007b<getAppLaunchParams> bVar3, b.C0007b<BackKeyDownPoint> bVar4, b.C0007b<b.AnonymousClass3> bVar5) {
        return new addStubToClient(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new sendMsgToServerByApp(this.setMax.get(), this.length.get(), this.getMin.get(), this.setMin.get(), this.getMax.get());
    }
}
