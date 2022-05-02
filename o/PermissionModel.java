package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.DynamicPluginInfo;

public interface PermissionModel {
    @OperationType("alipayplus.mobilewallet.user.config.query")
    @SignCheck
    getPluginModels getUserConfig(generateFromJSON generatefromjson);

    @OperationType("alipayplus.mobilewallet.user.config.store")
    @SignCheck
    readToArray storeUserConfig(DynamicPluginInfo.AnonymousClass1 r1);
}
