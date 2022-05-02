package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverBottomPopupDialog;
import o.b;

public final class stringVal implements getAdapterPosition<GriverBottomPopupDialog.AnonymousClass1> {
    private final b.C0007b<apiCallIsFull> getMin;
    private final ApplicationModule setMin;

    private stringVal(ApplicationModule applicationModule, b.C0007b<apiCallIsFull> bVar) {
        this.setMin = applicationModule;
        this.getMin = bVar;
    }

    public static stringVal getMin(ApplicationModule applicationModule, b.C0007b<apiCallIsFull> bVar) {
        return new stringVal(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverBottomPopupDialog.AnonymousClass1 max = this.setMin.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
