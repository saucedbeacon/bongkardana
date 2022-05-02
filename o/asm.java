package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class asm implements getAdapterPosition<getCursiveFontFamily> {
    private final ApplicationModule getMin;
    private final b.C0007b<AppMsgReceiver> setMin;

    private asm(ApplicationModule applicationModule, b.C0007b<AppMsgReceiver> bVar) {
        this.getMin = applicationModule;
        this.setMin = bVar;
    }

    public static asm setMax(ApplicationModule applicationModule, b.C0007b<AppMsgReceiver> bVar) {
        return new asm(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getCursiveFontFamily max = this.getMin.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
