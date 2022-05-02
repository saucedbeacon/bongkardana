package o;

import o.b;

public final class getFalconImgCut implements getAdapterPosition<isUseAshmem> {
    private final b.C0007b<setBucketListener> getMin;
    private final b.C0007b<useHttpAuthUsernamePassword> length;
    private final b.C0007b<onCommonConfigChanged> setMax;

    private getFalconImgCut(b.C0007b<setBucketListener> bVar, b.C0007b<onCommonConfigChanged> bVar2, b.C0007b<useHttpAuthUsernamePassword> bVar3) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
    }

    public static getFalconImgCut length(b.C0007b<setBucketListener> bVar, b.C0007b<onCommonConfigChanged> bVar2, b.C0007b<useHttpAuthUsernamePassword> bVar3) {
        return new getFalconImgCut(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new isUseAshmem(this.getMin.get(), this.setMax.get(), this.length.get());
    }
}
