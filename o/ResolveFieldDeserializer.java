package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ResolveFieldDeserializer implements getAdapterPosition<getScanJobRuntimeMillis> {
    private final b.C0007b<RDConstant> getMin;
    private final ApplicationModule setMin;

    private ResolveFieldDeserializer(ApplicationModule applicationModule, b.C0007b<RDConstant> bVar) {
        this.setMin = applicationModule;
        this.getMin = bVar;
    }

    public static ResolveFieldDeserializer getMax(ApplicationModule applicationModule, b.C0007b<RDConstant> bVar) {
        return new ResolveFieldDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getScanJobRuntimeMillis length = this.setMin.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
