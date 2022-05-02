package o;

import o.b;
import o.setPhotoSize;

public final class getFail implements getAdapterPosition<setThumb> {
    private final b.C0007b<setPhotoSize.getMin> getMin;
    private final b.C0007b<isBackgroundModeUninitialized> length;

    private getFail(b.C0007b<isBackgroundModeUninitialized> bVar, b.C0007b<setPhotoSize.getMin> bVar2) {
        this.length = bVar;
        this.getMin = bVar2;
    }

    public static getFail getMax(b.C0007b<isBackgroundModeUninitialized> bVar, b.C0007b<setPhotoSize.getMin> bVar2) {
        return new getFail(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new setThumb(this.length.get(), this.getMin.get());
    }
}
