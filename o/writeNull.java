package o;

import id.dana.di.modules.LatestNewsModule;
import o.AddPhoneContactBridgeExtension;
import o.b;

public final class writeNull implements getAdapterPosition<AddPhoneContactBridgeExtension.AnonymousClass3.setMin> {
    private final b.C0007b<getHCEState> setMax;
    private final LatestNewsModule setMin;

    private writeNull(LatestNewsModule latestNewsModule, b.C0007b<getHCEState> bVar) {
        this.setMin = latestNewsModule;
        this.setMax = bVar;
    }

    public static writeNull getMin(LatestNewsModule latestNewsModule, b.C0007b<getHCEState> bVar) {
        return new writeNull(latestNewsModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AddPhoneContactBridgeExtension.AnonymousClass3.setMin max = this.setMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
