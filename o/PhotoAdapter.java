package o;

import o.PhotoContext;
import o.b;

public final class PhotoAdapter implements getAdapterPosition<addDatas> {
    private final b.C0007b<PhotoContext.AnonymousClass2> length;
    private final b.C0007b<onPhotoDelete> setMax;

    private PhotoAdapter(b.C0007b<PhotoContext.AnonymousClass2> bVar, b.C0007b<onPhotoDelete> bVar2) {
        this.length = bVar;
        this.setMax = bVar2;
    }

    public static PhotoAdapter length(b.C0007b<PhotoContext.AnonymousClass2> bVar, b.C0007b<onPhotoDelete> bVar2) {
        return new PhotoAdapter(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new addDatas(this.length.get(), this.setMax.get());
    }
}
