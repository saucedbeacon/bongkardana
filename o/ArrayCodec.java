package o;

import id.dana.di.modules.ApplicationModule;

public final class ArrayCodec implements getAdapterPosition<GriverHttpRequestAPIExtension> {
    private final ApplicationModule setMin;

    private ArrayCodec(ApplicationModule applicationModule) {
        this.setMin = applicationModule;
    }

    public static ArrayCodec getMin(ApplicationModule applicationModule) {
        return new ArrayCodec(applicationModule);
    }

    public final /* synthetic */ Object get() {
        GriverHttpRequestAPIExtension max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
