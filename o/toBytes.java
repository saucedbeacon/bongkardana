package o;

import id.dana.di.modules.InputNameModule;
import o.getScreenBrightness;

public final class toBytes implements getAdapterPosition<getScreenBrightness.getMax> {
    private final InputNameModule getMin;

    public static getScreenBrightness.getMax getMin(InputNameModule inputNameModule) {
        getScreenBrightness.getMax max = inputNameModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getScreenBrightness.getMax max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
