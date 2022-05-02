package o;

import id.dana.social.di.module.UsernameModule;
import o.b;
import o.setLeftBtnInfo;

public final class getFocusedRect implements getAdapterPosition<setLeftBtnInfo.length> {
    private final UsernameModule getMax;
    private final b.C0007b<getActiveView> setMin;

    public static setLeftBtnInfo.length getMin(UsernameModule usernameModule, getActiveView getactiveview) {
        setLeftBtnInfo.length min = usernameModule.setMin(getactiveview);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setLeftBtnInfo.length min = this.getMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
