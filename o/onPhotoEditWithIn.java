package o;

import o.PhotoBrowseListener;
import o.b;

public final class onPhotoEditWithIn implements getAdapterPosition<PhotoPagerListener> {
    private final b.C0007b<PhotoBrowseListener.V2> setMax;
    private final b.C0007b<onPageClicked> setMin;

    private onPhotoEditWithIn(b.C0007b<onPageClicked> bVar, b.C0007b<PhotoBrowseListener.V2> bVar2) {
        this.setMin = bVar;
        this.setMax = bVar2;
    }

    public static onPhotoEditWithIn getMax(b.C0007b<onPageClicked> bVar, b.C0007b<PhotoBrowseListener.V2> bVar2) {
        return new onPhotoEditWithIn(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new PhotoPagerListener(this.setMin.get(), this.setMax.get());
    }
}
