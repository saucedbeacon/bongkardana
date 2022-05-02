package o;

import android.content.Context;
import id.dana.di.modules.ApplicationModule;

public final class typeKey implements getAdapterPosition<Context> {
    private final ApplicationModule length;

    private typeKey(ApplicationModule applicationModule) {
        this.length = applicationModule;
    }

    public static typeKey setMax(ApplicationModule applicationModule) {
        return new typeKey(applicationModule);
    }

    public final /* synthetic */ Object get() {
        Context max = this.length.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
