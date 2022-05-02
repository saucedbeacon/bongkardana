package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class skipWhitespace implements getAdapterPosition<isRooted> {
    private final ApplicationModule getMax;
    private final b.C0007b<setTargetExtension> setMax;

    private skipWhitespace(ApplicationModule applicationModule, b.C0007b<setTargetExtension> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static skipWhitespace setMin(ApplicationModule applicationModule, b.C0007b<setTargetExtension> bVar) {
        return new skipWhitespace(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isRooted min = this.getMax.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
