package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ListTypeFieldDeserializer implements getAdapterPosition<getByteCount> {
    private final ApplicationModule getMin;
    private final b.C0007b<getIPCContextManager> setMax;

    private ListTypeFieldDeserializer(ApplicationModule applicationModule, b.C0007b<getIPCContextManager> bVar) {
        this.getMin = applicationModule;
        this.setMax = bVar;
    }

    public static ListTypeFieldDeserializer getMax(ApplicationModule applicationModule, b.C0007b<getIPCContextManager> bVar) {
        return new ListTypeFieldDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getByteCount min = this.getMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
