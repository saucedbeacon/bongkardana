package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface setWindow {
    @OperationType("alipayplus.home.user.profile.updateUserInfo")
    @SignCheck
    getTabBarObject updateUserInfo(getWindow getwindow);
}
