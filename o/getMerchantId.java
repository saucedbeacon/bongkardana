package o;

import id.dana.di.modules.WithdrawSavingModule;
import o.onFrameData;

public final class getMerchantId implements getAdapterPosition<onFrameData.getMin> {
    private final WithdrawSavingModule setMin;

    private getMerchantId(WithdrawSavingModule withdrawSavingModule) {
        this.setMin = withdrawSavingModule;
    }

    public static getMerchantId length(WithdrawSavingModule withdrawSavingModule) {
        return new getMerchantId(withdrawSavingModule);
    }

    public final /* synthetic */ Object get() {
        onFrameData.getMin max = this.setMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
