package o;

import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import o.b;
import o.setMediaId;

public final class isPicCurrentlyTaked implements getAdapterPosition<setMediaId.setMax> {
    private final b.C0007b<setIsPicCurrentlyTaked> getMax;
    private final RecentRecipientModule setMin;

    private isPicCurrentlyTaked(RecentRecipientModule recentRecipientModule, b.C0007b<setIsPicCurrentlyTaked> bVar) {
        this.setMin = recentRecipientModule;
        this.getMax = bVar;
    }

    public static isPicCurrentlyTaked getMax(RecentRecipientModule recentRecipientModule, b.C0007b<setIsPicCurrentlyTaked> bVar) {
        return new isPicCurrentlyTaked(recentRecipientModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setMediaId.setMax max = this.setMin.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
