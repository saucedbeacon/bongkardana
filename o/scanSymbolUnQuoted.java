package o;

import id.dana.di.modules.ApplicationModule;
import id.dana.toggle.locationpermission.LocationPermissionObserver;
import o.b;

public final class scanSymbolUnQuoted implements getAdapterPosition<LocationPermissionObserver> {
    private final b.C0007b<isAlipayApp> getMin;
    private final ApplicationModule length;

    private scanSymbolUnQuoted(ApplicationModule applicationModule, b.C0007b<isAlipayApp> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static scanSymbolUnQuoted getMin(ApplicationModule applicationModule, b.C0007b<isAlipayApp> bVar) {
        return new scanSymbolUnQuoted(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        LocationPermissionObserver min = this.length.setMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
