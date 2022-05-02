package o;

import id.dana.di.modules.ApplicationModule;
import o.AppPreDownloadCacheManager;
import o.b;

public final class JavaBeanDeserializer implements getAdapterPosition<AppPreDownloadCacheManager.AnonymousClass1> {
    private final b.C0007b<authority> getMax;
    private final ApplicationModule length;

    private JavaBeanDeserializer(ApplicationModule applicationModule, b.C0007b<authority> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static JavaBeanDeserializer getMin(ApplicationModule applicationModule, b.C0007b<authority> bVar) {
        return new JavaBeanDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AppPreDownloadCacheManager.AnonymousClass1 min = this.length.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
