package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface RVFlag {
    @OperationType("alipayplus.mobilewallet.urlshortener.restore")
    @SignCheck
    clearPermissions restore(PermissionManager permissionManager);

    @OperationType("alipayplus.mobilewallet.urlshortener.shorten")
    @SignCheck
    PermissionGuildePoint shorten(getOpenAuthGrantFlag getopenauthgrantflag);
}
