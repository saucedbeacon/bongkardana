package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setTime implements getAdapterPosition<getCharsetName> {
    private final ApplicationModule getMax;
    private final b.C0007b<EmbedViewConstant> setMin;

    private setTime(ApplicationModule applicationModule, b.C0007b<EmbedViewConstant> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static setTime length(ApplicationModule applicationModule, b.C0007b<EmbedViewConstant> bVar) {
        return new setTime(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getCharsetName length = this.getMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
