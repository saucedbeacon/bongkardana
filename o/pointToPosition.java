package o;

import id.dana.social.di.module.UsernameModule;
import o.setLeftBtnInfo;

public final class pointToPosition implements getAdapterPosition<setLeftBtnInfo.getMax> {
    private final UsernameModule setMin;

    public static setLeftBtnInfo.getMax setMax(UsernameModule usernameModule) {
        setLeftBtnInfo.getMax max = usernameModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setLeftBtnInfo.getMax max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
