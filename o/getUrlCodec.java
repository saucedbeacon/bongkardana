package o;

import o.GriverBaseActivity;
import o.b;

public final class getUrlCodec implements getAdapterPosition<fetchAppList> {
    private final b.C0007b<MiniProgramFacade> length;
    private final b.C0007b<GriverBaseActivity.Main> setMin;

    private getUrlCodec(b.C0007b<MiniProgramFacade> bVar, b.C0007b<GriverBaseActivity.Main> bVar2) {
        this.length = bVar;
        this.setMin = bVar2;
    }

    public static getUrlCodec setMin(b.C0007b<MiniProgramFacade> bVar, b.C0007b<GriverBaseActivity.Main> bVar2) {
        return new getUrlCodec(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new fetchAppList(this.length.get(), this.setMin.get());
    }
}
