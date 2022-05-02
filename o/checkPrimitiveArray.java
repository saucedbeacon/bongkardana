package o;

import id.dana.di.modules.NoteModule;
import o.b;
import o.setPhotoSize;

public final class checkPrimitiveArray implements getAdapterPosition<setPhotoSize.setMin> {
    private final b.C0007b<setThumb> length;
    private final NoteModule setMax;

    private checkPrimitiveArray(NoteModule noteModule, b.C0007b<setThumb> bVar) {
        this.setMax = noteModule;
        this.length = bVar;
    }

    public static checkPrimitiveArray getMax(NoteModule noteModule, b.C0007b<setThumb> bVar) {
        return new checkPrimitiveArray(noteModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setPhotoSize.setMin max = this.setMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
