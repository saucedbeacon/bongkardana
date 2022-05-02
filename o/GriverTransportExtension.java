package o;

import id.dana.di.modules.SavingCreateModule;
import o.notifyMicError;

public final class GriverTransportExtension implements getAdapterPosition<notifyMicError.setMax> {
    private final SavingCreateModule length;

    private GriverTransportExtension(SavingCreateModule savingCreateModule) {
        this.length = savingCreateModule;
    }

    public static GriverTransportExtension setMin(SavingCreateModule savingCreateModule) {
        return new GriverTransportExtension(savingCreateModule);
    }

    public final /* synthetic */ Object get() {
        notifyMicError.setMax max = this.length.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
