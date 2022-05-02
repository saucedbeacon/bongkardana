package o;

import id.dana.social.di.module.ReactionsModule;
import o.setLeftButtonFont;

public final class getBgDrawable implements getAdapterPosition<setLeftButtonFont.setMin> {
    private final ReactionsModule getMin;

    private getBgDrawable(ReactionsModule reactionsModule) {
        this.getMin = reactionsModule;
    }

    public static getBgDrawable getMax(ReactionsModule reactionsModule) {
        return new getBgDrawable(reactionsModule);
    }

    public final /* synthetic */ Object get() {
        setLeftButtonFont.setMin max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
