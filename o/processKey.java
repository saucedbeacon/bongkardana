package o;

import id.dana.di.modules.DanaTutorialModule;
import o.b;
import o.handleCloseEvent;

public final class processKey implements getAdapterPosition<handleCloseEvent.setMax> {
    private final b.C0007b<GriverPageContainer> length;
    private final DanaTutorialModule setMax;

    public static handleCloseEvent.setMax setMax(DanaTutorialModule danaTutorialModule, GriverPageContainer griverPageContainer) {
        handleCloseEvent.setMax max = danaTutorialModule.getMax(griverPageContainer);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        handleCloseEvent.setMax max = this.setMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
