package o;

import id.dana.di.modules.DanaTutorialModule;
import o.handleCloseEvent;

public final class apply implements getAdapterPosition<handleCloseEvent.length> {
    private final DanaTutorialModule length;

    public static handleCloseEvent.length setMax(DanaTutorialModule danaTutorialModule) {
        handleCloseEvent.length max = danaTutorialModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        handleCloseEvent.length max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
