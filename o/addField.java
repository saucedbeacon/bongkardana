package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class addField implements getAdapterPosition<toStringBuilder> {
    private final ApplicationModule getMax;
    private final b.C0007b<getResStream> setMax;

    private addField(ApplicationModule applicationModule, b.C0007b<getResStream> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static addField setMax(ApplicationModule applicationModule, b.C0007b<getResStream> bVar) {
        return new addField(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        toStringBuilder max = this.getMax.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
