package o;

import id.dana.di.modules.UserConfigModules;
import o.MultilevelSelectCallBack;
import o.b;

public final class getAuthGuideContent implements getAdapterPosition<MultilevelSelectCallBack.getMin> {
    private final UserConfigModules setMax;
    private final b.C0007b<getSelectedOption> setMin;

    private getAuthGuideContent(UserConfigModules userConfigModules, b.C0007b<getSelectedOption> bVar) {
        this.setMax = userConfigModules;
        this.setMin = bVar;
    }

    public static getAuthGuideContent length(UserConfigModules userConfigModules, b.C0007b<getSelectedOption> bVar) {
        return new getAuthGuideContent(userConfigModules, bVar);
    }

    public final /* synthetic */ Object get() {
        MultilevelSelectCallBack.getMin min = this.setMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
