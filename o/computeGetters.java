package o;

import id.dana.di.modules.MyProfileModule;
import o.setInitScene;

public final class computeGetters implements getAdapterPosition<setInitScene.setMax> {
    private final MyProfileModule setMin;

    public static setInitScene.setMax setMax(MyProfileModule myProfileModule) {
        setInitScene.setMax length = myProfileModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setInitScene.setMax length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
