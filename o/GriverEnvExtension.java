package o;

import id.dana.di.modules.PromoCenterModule;
import o.execute;

public final class GriverEnvExtension implements getAdapterPosition<execute.setMax> {
    private final PromoCenterModule setMin;

    public static execute.setMax setMin(PromoCenterModule promoCenterModule) {
        execute.setMax min = promoCenterModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        execute.setMax min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
