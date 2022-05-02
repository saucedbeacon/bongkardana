package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getExtraType implements getAdapterPosition<onNotifyCharacteristicValue> {
    private final b.C0007b<setTemplateVersion> getMax;
    private final ApplicationModule setMax;

    private getExtraType(ApplicationModule applicationModule, b.C0007b<setTemplateVersion> bVar) {
        this.setMax = applicationModule;
        this.getMax = bVar;
    }

    public static getExtraType setMax(ApplicationModule applicationModule, b.C0007b<setTemplateVersion> bVar) {
        return new getExtraType(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onNotifyCharacteristicValue min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
