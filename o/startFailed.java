package o;

import id.dana.di.modules.SplashModule;
import o.b;
import o.setMap;

public final class startFailed implements getAdapterPosition<setMap.getMax> {
    private final SplashModule setMax;
    private final b.C0007b<OpenSettingItem> setMin;

    private startFailed(SplashModule splashModule, b.C0007b<OpenSettingItem> bVar) {
        this.setMax = splashModule;
        this.setMin = bVar;
    }

    public static startFailed length(SplashModule splashModule, b.C0007b<OpenSettingItem> bVar) {
        return new startFailed(splashModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setMap.getMax min = this.setMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
