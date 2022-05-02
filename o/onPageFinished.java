package o;

import id.dana.di.modules.SendMoneyExternalModule;
import o.notifyFail;

public final class onPageFinished implements getAdapterPosition<notifyFail.length> {
    private final SendMoneyExternalModule setMax;

    private onPageFinished(SendMoneyExternalModule sendMoneyExternalModule) {
        this.setMax = sendMoneyExternalModule;
    }

    public static onPageFinished setMax(SendMoneyExternalModule sendMoneyExternalModule) {
        return new onPageFinished(sendMoneyExternalModule);
    }

    public final /* synthetic */ Object get() {
        notifyFail.length min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
