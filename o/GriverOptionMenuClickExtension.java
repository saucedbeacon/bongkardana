package o;

import o.GriverUpdateProgressExtension;
import o.b;

public final class GriverOptionMenuClickExtension implements getAdapterPosition<GriverChooseFileExtensionImpl> {
    private final b.C0007b<GriverUpdateProgressExtension.length> getMin;
    private final b.C0007b<GriverAppCenter> setMin;

    private GriverOptionMenuClickExtension(b.C0007b<GriverUpdateProgressExtension.length> bVar, b.C0007b<GriverAppCenter> bVar2) {
        this.getMin = bVar;
        this.setMin = bVar2;
    }

    public static GriverOptionMenuClickExtension setMin(b.C0007b<GriverUpdateProgressExtension.length> bVar, b.C0007b<GriverAppCenter> bVar2) {
        return new GriverOptionMenuClickExtension(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new GriverChooseFileExtensionImpl(this.getMin.get(), this.setMin.get());
    }
}
