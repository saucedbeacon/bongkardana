package o;

import o.b;

public final class onMenuClicked implements getAdapterPosition<onPhotoDelete> {
    private final b.C0007b<ViewHolder> length;
    private final b.C0007b<onPageClicked> setMax;

    private onMenuClicked(b.C0007b<onPageClicked> bVar, b.C0007b<ViewHolder> bVar2) {
        this.setMax = bVar;
        this.length = bVar2;
    }

    public static onMenuClicked setMin(b.C0007b<onPageClicked> bVar, b.C0007b<ViewHolder> bVar2) {
        return new onMenuClicked(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new onPhotoDelete(this.setMax.get(), this.length.get());
    }
}
