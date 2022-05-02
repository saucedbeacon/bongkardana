package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import id.dana.data.user.source.network.request.UserInfoRequest;

public interface getVhost {
    @OperationType("alipayplus.mobilewallet.wallet.user.checkUsername")
    setSubPackages checkUsername(getSubPackages getsubpackages);

    @OperationType("alipayplus.mobilewallet.user.information.balance")
    @SignCheck
    setTemplateConfig getBalance(UserInfoRequest userInfoRequest);

    @OperationType("alipayplus.mobilewallet.oauth.user.info")
    @SignCheck
    setStatus getMiniProgramUserInfo(setAppKey setappkey);

    @OperationType("alipayplus.mobilewallet.wallet.user.info")
    @SignCheck
    setTemplateConfig getUserInfo(UserInfoRequest userInfoRequest);

    @OperationType("alipayplus.mobilewallet.oauth.check.user.info")
    @SignCheck
    getTemplateConfig queryCheckUserInfo(setVhost setvhost);
}
