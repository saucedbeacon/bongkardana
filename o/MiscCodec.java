package o;

import id.dana.di.modules.GContainerModule;
import o.b;

public final class MiscCodec implements getAdapterPosition<maxWidth> {
    private final b.C0007b<cannotInitUC> getMin;
    private final b.C0007b<H5UCProvider> length;
    private final GContainerModule setMax;
    private final b.C0007b<isKeepCallback> setMin;

    private MiscCodec(GContainerModule gContainerModule, b.C0007b<cannotInitUC> bVar, b.C0007b<isKeepCallback> bVar2, b.C0007b<H5UCProvider> bVar3) {
        this.setMax = gContainerModule;
        this.getMin = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
    }

    public static MiscCodec setMin(GContainerModule gContainerModule, b.C0007b<cannotInitUC> bVar, b.C0007b<isKeepCallback> bVar2, b.C0007b<H5UCProvider> bVar3) {
        return new MiscCodec(gContainerModule, bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        maxWidth min = this.setMax.setMin(this.getMin.get(), this.setMin.get(), this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
