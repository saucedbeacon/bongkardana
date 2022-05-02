package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getFieldDeserializerByHash implements getAdapterPosition<setMfgReserved> {
    private final b.C0007b<containsAll> getMax;
    private final ApplicationModule length;

    private getFieldDeserializerByHash(ApplicationModule applicationModule, b.C0007b<containsAll> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static getFieldDeserializerByHash getMin(ApplicationModule applicationModule, b.C0007b<containsAll> bVar) {
        return new getFieldDeserializerByHash(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setMfgReserved max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
