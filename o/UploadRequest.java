package o;

import id.dana.di.modules.SendMoneyConfirmationModule;
import o.cutImageKeepRatio_new;

public final class UploadRequest implements getAdapterPosition<cutImageKeepRatio_new.setMax> {
    private final SendMoneyConfirmationModule getMax;

    private UploadRequest(SendMoneyConfirmationModule sendMoneyConfirmationModule) {
        this.getMax = sendMoneyConfirmationModule;
    }

    public static UploadRequest length(SendMoneyConfirmationModule sendMoneyConfirmationModule) {
        return new UploadRequest(sendMoneyConfirmationModule);
    }

    public final /* synthetic */ Object get() {
        cutImageKeepRatio_new.setMax max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
