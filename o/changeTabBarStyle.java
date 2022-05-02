package o;

import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class changeTabBarStyle implements shouldApplyPermission {
    private final switchTab amcsH5OnlineConfig;

    @Inject
    public changeTabBarStyle(switchTab switchtab) {
        this.amcsH5OnlineConfig = switchtab;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getH5OnlineConfig(String str, Set<String> set) {
        return this.amcsH5OnlineConfig.getH5OnlineConfig(str, set).map(addTabItem.length);
    }
}
