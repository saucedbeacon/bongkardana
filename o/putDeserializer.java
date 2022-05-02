package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class putDeserializer implements getAdapterPosition<getResponseString> {
    private final b.C0007b<getOpenAuthDialog> getMin;
    private final ApplicationModule setMin;

    private putDeserializer(ApplicationModule applicationModule, b.C0007b<getOpenAuthDialog> bVar) {
        this.setMin = applicationModule;
        this.getMin = bVar;
    }

    public static putDeserializer getMax(ApplicationModule applicationModule, b.C0007b<getOpenAuthDialog> bVar) {
        return new putDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getResponseString length = this.setMin.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
