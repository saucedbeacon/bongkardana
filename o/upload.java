package o;

import id.dana.di.modules.SavedBankModule;
import o.onSuccess;

public final class upload implements getAdapterPosition<onSuccess.getMax> {
    private final SavedBankModule getMax;

    private upload(SavedBankModule savedBankModule) {
        this.getMax = savedBankModule;
    }

    public static upload getMin(SavedBankModule savedBankModule) {
        return new upload(savedBankModule);
    }

    public final /* synthetic */ Object get() {
        onSuccess.getMax max = this.getMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
