package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getExtraProcessors implements getAdapterPosition<onFormResubmission> {
    private final b.C0007b<requestInnerSync> length;
    private final ApplicationModule setMax;

    private getExtraProcessors(ApplicationModule applicationModule, b.C0007b<requestInnerSync> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static getExtraProcessors length(ApplicationModule applicationModule, b.C0007b<requestInnerSync> bVar) {
        return new getExtraProcessors(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onFormResubmission length2 = this.setMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
