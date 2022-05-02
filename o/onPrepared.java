package o;

import id.dana.nearbyme.di.module.PhotoGalleryModule;

public final class onPrepared implements getAdapterPosition<negativeString> {
    private final PhotoGalleryModule getMax;

    private onPrepared(PhotoGalleryModule photoGalleryModule) {
        this.getMax = photoGalleryModule;
    }

    public static onPrepared length(PhotoGalleryModule photoGalleryModule) {
        return new onPrepared(photoGalleryModule);
    }

    public final /* synthetic */ Object get() {
        negativeString max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
