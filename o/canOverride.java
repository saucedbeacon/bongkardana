package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface canOverride {
    @OperationType("alipayplus.mobilewallet.promocenter.fetch")
    @SignCheck
    ByteArrayPools queryAllPromo(ParamRequired paramRequired);

    @OperationType("alipayplus.mobilewallet.promocenter.categorized")
    @SignCheck
    UsePermission queryCategorizedPromo(Remote remote);

    @OperationType("alipayplus.mobilewallet.promocenter.groupcategory")
    @SignCheck
    transSyncThreadNames queryCategory(ThreadType threadType);

    @OperationType("alipayplus.mobilewallet.promocenter.ads.query")
    @SignCheck
    Local queryPromoCenterAds(NativePermissionRequire nativePermissionRequire);
}
