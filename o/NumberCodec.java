package o;

import id.dana.data.risk.riskevent.SendRiskEventReceiver;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import id.dana.di.modules.GContainerModule;
import o.b;

public final class NumberCodec implements getAdapterPosition<ShareTextBroadcastReceiver> {
    private final GContainerModule setMax;
    private final b.C0007b<SendRiskEventReceiver> setMin;

    private NumberCodec(GContainerModule gContainerModule, b.C0007b<SendRiskEventReceiver> bVar) {
        this.setMax = gContainerModule;
        this.setMin = bVar;
    }

    public static NumberCodec setMin(GContainerModule gContainerModule, b.C0007b<SendRiskEventReceiver> bVar) {
        return new NumberCodec(gContainerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ShareTextBroadcastReceiver length = this.setMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
