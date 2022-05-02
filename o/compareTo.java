package o;

import id.dana.di.modules.BillerX2BModule;
import o.IWorkManagerImplCallback;

public final class compareTo implements getAdapterPosition<IWorkManagerImplCallback.Stub.Proxy.getMax> {
    private final BillerX2BModule length;

    private compareTo(BillerX2BModule billerX2BModule) {
        this.length = billerX2BModule;
    }

    public static compareTo setMax(BillerX2BModule billerX2BModule) {
        return new compareTo(billerX2BModule);
    }

    public final /* synthetic */ Object get() {
        IWorkManagerImplCallback.Stub.Proxy.getMax min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
