package o;

import id.dana.di.modules.MyProfileModule;
import o.b;
import o.setInitScene;

public final class isGenericParamType implements getAdapterPosition<setInitScene.setMin> {
    private final b.C0007b<restorePullToRefresh> getMin;
    private final MyProfileModule length;

    public static setInitScene.setMin setMin(MyProfileModule myProfileModule, restorePullToRefresh restorepulltorefresh) {
        setInitScene.setMin max = myProfileModule.getMax(restorepulltorefresh);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setInitScene.setMin max = this.length.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
