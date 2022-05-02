package o;

import id.dana.di.modules.SavingDetailModule;
import o.enableEventbus;

public final class request implements getAdapterPosition<enableEventbus.setMax> {
    private final SavingDetailModule length;

    private request(SavingDetailModule savingDetailModule) {
        this.length = savingDetailModule;
    }

    public static request length(SavingDetailModule savingDetailModule) {
        return new request(savingDetailModule);
    }

    public final /* synthetic */ Object get() {
        enableEventbus.setMax min = this.length.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
