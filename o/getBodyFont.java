package o;

import o.ShareRecyclerAdapter;
import o.b;
import o.setAutoDismissEnabled$core;

public final class getBodyFont implements getAdapterPosition<setBodyFont$core> {
    private final b.C0007b<sendData> getMax;
    private final b.C0007b<setAutoDismissEnabled$core.getMax> length;
    private final b.C0007b<ShareRecyclerAdapter.ShareViewHolder> setMax;

    private getBodyFont(b.C0007b<setAutoDismissEnabled$core.getMax> bVar, b.C0007b<sendData> bVar2, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar3) {
        this.length = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
    }

    public static getBodyFont getMax(b.C0007b<setAutoDismissEnabled$core.getMax> bVar, b.C0007b<sendData> bVar2, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar3) {
        return new getBodyFont(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setBodyFont$core(this.length.get(), this.getMax.get(), this.setMax.get());
    }
}
