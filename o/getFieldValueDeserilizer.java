package o;

import android.app.Application;
import android.content.ContentResolver;
import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getFieldValueDeserilizer implements getAdapterPosition<ContentResolver> {
    private final ApplicationModule getMin;
    private final b.C0007b<Application> setMax;

    private getFieldValueDeserilizer(ApplicationModule applicationModule, b.C0007b<Application> bVar) {
        this.getMin = applicationModule;
        this.setMax = bVar;
    }

    public static getFieldValueDeserilizer getMax(ApplicationModule applicationModule, b.C0007b<Application> bVar) {
        return new getFieldValueDeserilizer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ContentResolver max = this.getMin.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
