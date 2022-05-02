package o;

import id.dana.di.modules.NoteModule;
import o.setPhotoSize;

public final class isWeb implements getAdapterPosition<setPhotoSize.getMin> {
    private final NoteModule length;

    private isWeb(NoteModule noteModule) {
        this.length = noteModule;
    }

    public static isWeb length(NoteModule noteModule) {
        return new isWeb(noteModule);
    }

    public final /* synthetic */ Object get() {
        setPhotoSize.getMin max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
