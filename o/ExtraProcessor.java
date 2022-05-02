package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ExtraProcessor implements getAdapterPosition<onCharacteristicChanged> {
    private final b.C0007b<getWebviewConfigs> setMax;
    private final ApplicationModule setMin;

    private ExtraProcessor(ApplicationModule applicationModule, b.C0007b<getWebviewConfigs> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static ExtraProcessor getMax(ApplicationModule applicationModule, b.C0007b<getWebviewConfigs> bVar) {
        return new ExtraProcessor(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onCharacteristicChanged length = this.setMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
