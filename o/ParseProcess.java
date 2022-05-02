package o;

import id.dana.di.modules.ApplicationModule;
import o.PrepareController;
import o.b;

public final class ParseProcess implements getAdapterPosition<getBluetoothState> {
    private final b.C0007b<PrepareController.Status> getMin;
    private final ApplicationModule setMin;

    private ParseProcess(ApplicationModule applicationModule, b.C0007b<PrepareController.Status> bVar) {
        this.setMin = applicationModule;
        this.getMin = bVar;
    }

    public static ParseProcess getMax(ApplicationModule applicationModule, b.C0007b<PrepareController.Status> bVar) {
        return new ParseProcess(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBluetoothState max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
