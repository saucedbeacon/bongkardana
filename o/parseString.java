package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class parseString implements getAdapterPosition<appxLoadFailed> {
    private final ApplicationModule getMin;
    private final b.C0007b<toggleAllChecked> length;

    private parseString(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static parseString setMax(ApplicationModule applicationModule, b.C0007b<toggleAllChecked> bVar) {
        return new parseString(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
