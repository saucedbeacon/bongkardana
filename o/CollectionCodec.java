package o;

import id.dana.di.modules.AuthenticationModule;

public final class CollectionCodec implements getAdapterPosition<Embedded> {
    private final AuthenticationModule setMin;

    private CollectionCodec(AuthenticationModule authenticationModule) {
        this.setMin = authenticationModule;
    }

    public static CollectionCodec getMax(AuthenticationModule authenticationModule) {
        return new CollectionCodec(authenticationModule);
    }

    public final /* synthetic */ Object get() {
        Embedded max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
