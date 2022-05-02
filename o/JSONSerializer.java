package o;

import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import o.GriverManifest;

public final class JSONSerializer implements getAdapterPosition<GriverManifest.AnonymousClass16.getMin> {
    private final ChangePhoneNumberH5EventModule getMin;

    public static GriverManifest.AnonymousClass16.getMin length(ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule) {
        GriverManifest.AnonymousClass16.getMin max = changePhoneNumberH5EventModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass16.getMin max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
