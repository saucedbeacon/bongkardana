package o;

import id.dana.di.modules.UserBankQrModule;
import o.GriverCaptureActivity;

public final class menuClick implements getAdapterPosition<GriverCaptureActivity.setMin> {
    private final UserBankQrModule setMax;

    public static GriverCaptureActivity.setMin getMax(UserBankQrModule userBankQrModule) {
        GriverCaptureActivity.setMin max = userBankQrModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverCaptureActivity.setMin max = this.setMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
