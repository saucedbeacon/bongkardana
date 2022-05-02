package o;

import id.dana.di.modules.SavingModule;
import o.updateScreenRotation;

public final class setInputStream implements getAdapterPosition<updateScreenRotation.getMax> {
    private final SavingModule setMin;

    private setInputStream(SavingModule savingModule) {
        this.setMin = savingModule;
    }

    public static setInputStream setMax(SavingModule savingModule) {
        return new setInputStream(savingModule);
    }

    public final /* synthetic */ Object get() {
        updateScreenRotation.getMax min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
