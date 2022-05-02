package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class DefaultFieldDeserializer implements getAdapterPosition<ReleaseWebViewPoint> {
    private final b.C0007b<getRepeatCount> setMax;
    private final ApplicationModule setMin;

    private DefaultFieldDeserializer(ApplicationModule applicationModule, b.C0007b<getRepeatCount> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static DefaultFieldDeserializer getMax(ApplicationModule applicationModule, b.C0007b<getRepeatCount> bVar) {
        return new DefaultFieldDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ReleaseWebViewPoint max = this.setMin.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
