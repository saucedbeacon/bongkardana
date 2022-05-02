package o;

import o.b;

public final class createPageSync implements getAdapterPosition<ensureManifestFile> {
    private final b.C0007b<DialogLayout> getMin;
    private final b.C0007b<startPage> setMax;

    private createPageSync(b.C0007b<startPage> bVar, b.C0007b<DialogLayout> bVar2) {
        this.setMax = bVar;
        this.getMin = bVar2;
    }

    public static createPageSync setMax(b.C0007b<startPage> bVar, b.C0007b<DialogLayout> bVar2) {
        return new createPageSync(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new ensureManifestFile(this.setMax.get(), this.getMin.get());
    }
}
