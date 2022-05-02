package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class parseArrayWithType implements getAdapterPosition<setSupportZoom> {
    private final ApplicationModule getMin;
    private final b.C0007b<peekChild> length;

    private parseArrayWithType(ApplicationModule applicationModule, b.C0007b<peekChild> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static parseArrayWithType setMin(ApplicationModule applicationModule, b.C0007b<peekChild> bVar) {
        return new parseArrayWithType(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setSupportZoom length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
