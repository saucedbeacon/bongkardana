package o;

import id.dana.di.modules.ReferralDialogModule;
import o.MemoryWarningBridgeExtension;
import o.b;

public final class GriverMenuExtension implements getAdapterPosition<MemoryWarningBridgeExtension.AnonymousClass1.setMax> {
    private final b.C0007b<isSystemRoot> getMin;
    private final ReferralDialogModule length;

    private GriverMenuExtension(ReferralDialogModule referralDialogModule, b.C0007b<isSystemRoot> bVar) {
        this.length = referralDialogModule;
        this.getMin = bVar;
    }

    public static GriverMenuExtension setMin(ReferralDialogModule referralDialogModule, b.C0007b<isSystemRoot> bVar) {
        return new GriverMenuExtension(referralDialogModule, bVar);
    }

    public final /* synthetic */ Object get() {
        MemoryWarningBridgeExtension.AnonymousClass1.setMax min = this.length.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
