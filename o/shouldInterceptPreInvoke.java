package o;

import android.app.Application;
import o.b;

public final class shouldInterceptPreInvoke implements getAdapterPosition<RVJSApiHandlerProxy> {
    private final b.C0007b<Application> applicationProvider;
    private final b.C0007b<RVJsStatTrackService> paymentModelMapperProvider;

    public shouldInterceptPreInvoke(b.C0007b<Application> bVar, b.C0007b<RVJsStatTrackService> bVar2) {
        this.applicationProvider = bVar;
        this.paymentModelMapperProvider = bVar2;
    }

    public final RVJSApiHandlerProxy get() {
        return newInstance(this.applicationProvider.get(), this.paymentModelMapperProvider.get());
    }

    public static shouldInterceptPreInvoke create(b.C0007b<Application> bVar, b.C0007b<RVJsStatTrackService> bVar2) {
        return new shouldInterceptPreInvoke(bVar, bVar2);
    }

    public static RVJSApiHandlerProxy newInstance(Application application, RVJsStatTrackService rVJsStatTrackService) {
        return new RVJSApiHandlerProxy(application, rVJsStatTrackService);
    }
}
