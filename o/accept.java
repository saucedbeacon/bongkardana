package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class accept implements getAdapterPosition<doUpdateVisitedHistory> {
    private final b.C0007b<SendMtopResponse> getMin;
    private final ApplicationModule setMax;

    private accept(ApplicationModule applicationModule, b.C0007b<SendMtopResponse> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static accept length(ApplicationModule applicationModule, b.C0007b<SendMtopResponse> bVar) {
        return new accept(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        doUpdateVisitedHistory max = this.setMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
