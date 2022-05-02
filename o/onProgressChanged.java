package o;

import id.dana.di.modules.SendMoneyModule;
import o.DiagnosticsReceiver;

public final class onProgressChanged implements getAdapterPosition<DiagnosticsReceiver.length> {
    private final SendMoneyModule setMax;

    private onProgressChanged(SendMoneyModule sendMoneyModule) {
        this.setMax = sendMoneyModule;
    }

    public static onProgressChanged length(SendMoneyModule sendMoneyModule) {
        return new onProgressChanged(sendMoneyModule);
    }

    public final /* synthetic */ Object get() {
        DiagnosticsReceiver.length min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
