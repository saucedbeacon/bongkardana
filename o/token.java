package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class token implements getAdapterPosition<onDownloadResult> {
    private final ApplicationModule length;
    private final b.C0007b<PageEnterPoint> setMin;

    private token(ApplicationModule applicationModule, b.C0007b<PageEnterPoint> bVar) {
        this.length = applicationModule;
        this.setMin = bVar;
    }

    public static token setMax(ApplicationModule applicationModule, b.C0007b<PageEnterPoint> bVar) {
        return new token(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onDownloadResult length2 = this.length.length(this.setMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
