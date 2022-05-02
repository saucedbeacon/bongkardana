package o;

import id.dana.di.modules.BillerX2BModule;
import o.IWorkManagerImplCallback;
import o.b;

public final class getPropertyValue implements getAdapterPosition<IWorkManagerImplCallback.Stub.Proxy.getMin> {
    private final BillerX2BModule getMax;
    private final b.C0007b<IWorkManagerImplCallback.Default> length;

    private getPropertyValue(BillerX2BModule billerX2BModule, b.C0007b<IWorkManagerImplCallback.Default> bVar) {
        this.getMax = billerX2BModule;
        this.length = bVar;
    }

    public static getPropertyValue getMin(BillerX2BModule billerX2BModule, b.C0007b<IWorkManagerImplCallback.Default> bVar) {
        return new getPropertyValue(billerX2BModule, bVar);
    }

    public final /* synthetic */ Object get() {
        IWorkManagerImplCallback.Stub.Proxy.getMin max = this.getMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
