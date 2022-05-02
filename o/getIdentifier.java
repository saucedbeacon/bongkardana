package o;

import id.dana.di.modules.SplashModule;
import o.setMap;

public final class getIdentifier implements getAdapterPosition<setMap.length> {
    private final SplashModule setMax;

    private getIdentifier(SplashModule splashModule) {
        this.setMax = splashModule;
    }

    public static getIdentifier setMin(SplashModule splashModule) {
        return new getIdentifier(splashModule);
    }

    public final /* synthetic */ Object get() {
        setMap.length min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
