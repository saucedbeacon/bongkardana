package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getDeserializer implements getAdapterPosition<getRequestedModel> {
    private final b.C0007b<RVGroupInit> length;
    private final ApplicationModule setMin;

    private getDeserializer(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static getDeserializer setMin(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        return new getDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getRequestedModel length2 = this.setMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
