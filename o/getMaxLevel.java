package o;

import id.dana.di.modules.LazadaModule;
import o.GriverSessionDataExtension;
import o.b;

public final class getMaxLevel implements getAdapterPosition<GriverSessionDataExtension.setMax> {
    private final b.C0007b<getResultFailedResponse> getMax;
    private final LazadaModule setMax;

    public static GriverSessionDataExtension.setMax getMax(LazadaModule lazadaModule, getResultFailedResponse getresultfailedresponse) {
        GriverSessionDataExtension.setMax length = lazadaModule.length(getresultfailedresponse);
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverSessionDataExtension.setMax length = this.setMax.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
