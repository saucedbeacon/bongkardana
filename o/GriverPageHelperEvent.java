package o;

import id.dana.di.modules.SendMoneyModule;
import o.DiagnosticsReceiver;
import o.b;

public final class GriverPageHelperEvent implements getAdapterPosition<DiagnosticsReceiver.getMin> {
    private final SendMoneyModule getMin;
    private final b.C0007b<cancelAllWorkByTag> setMax;

    private GriverPageHelperEvent(SendMoneyModule sendMoneyModule, b.C0007b<cancelAllWorkByTag> bVar) {
        this.getMin = sendMoneyModule;
        this.setMax = bVar;
    }

    public static GriverPageHelperEvent length(SendMoneyModule sendMoneyModule, b.C0007b<cancelAllWorkByTag> bVar) {
        return new GriverPageHelperEvent(sendMoneyModule, bVar);
    }

    public final /* synthetic */ Object get() {
        DiagnosticsReceiver.getMin length = this.getMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
