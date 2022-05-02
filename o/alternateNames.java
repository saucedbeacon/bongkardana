package o;

import id.dana.di.modules.ApplicationModule;
import o.AppMsgReceiver;
import o.b;

public final class alternateNames implements getAdapterPosition<AppMsgReceiver.AnonymousClass2> {
    private final ApplicationModule getMin;
    private final b.C0007b<handleMessage> setMin;

    private alternateNames(ApplicationModule applicationModule, b.C0007b<handleMessage> bVar) {
        this.getMin = applicationModule;
        this.setMin = bVar;
    }

    public static alternateNames getMin(ApplicationModule applicationModule, b.C0007b<handleMessage> bVar) {
        return new alternateNames(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AppMsgReceiver.AnonymousClass2 max = this.getMin.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
