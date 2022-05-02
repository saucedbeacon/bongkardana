package o;

import id.dana.di.modules.SendMoneySummaryModule;
import o.b;
import o.setProxy;

public final class interceptUrl implements getAdapterPosition<setProxy.length> {
    private final b.C0007b<getPhotoPreview> getMax;
    private final SendMoneySummaryModule length;

    private interceptUrl(SendMoneySummaryModule sendMoneySummaryModule, b.C0007b<getPhotoPreview> bVar) {
        this.length = sendMoneySummaryModule;
        this.getMax = bVar;
    }

    public static interceptUrl setMin(SendMoneySummaryModule sendMoneySummaryModule, b.C0007b<getPhotoPreview> bVar) {
        return new interceptUrl(sendMoneySummaryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setProxy.length max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
