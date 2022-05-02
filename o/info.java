package o;

import id.dana.di.modules.ApplicationModule;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import o.a;
import o.b;

public final class info implements getAdapterPosition<LoginLogoutObserver> {
    private final b.C0007b<a.AnonymousClass7> getMax;
    private final ApplicationModule getMin;

    private info(ApplicationModule applicationModule, b.C0007b<a.AnonymousClass7> bVar) {
        this.getMin = applicationModule;
        this.getMax = bVar;
    }

    public static info length(ApplicationModule applicationModule, b.C0007b<a.AnonymousClass7> bVar) {
        return new info(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        LoginLogoutObserver min = this.getMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
