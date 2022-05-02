package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface BindingCallback {
    @OperationType("alipayplus.mobilewallet.nearby.queryradius")
    @SignCheck
    generateUniqueId getNearbyMeByRadius(stringDefault stringdefault);

    @OperationType("alipayplus.mobilewallet.nearby.querylist")
    @SignCheck
    generateUniqueId getNearbyMeShops(isFromRemote isfromremote);

    @OperationType("alipayplus.mobilewallet.nearby.querypromo")
    @SignCheck
    EngineInitCallback getNearbyPromo(longDefault longdefault);

    @OperationType("alipayplus.mobilewallet.nearby.queryShop")
    @SignCheck
    EngineSetupCallback getOtherShopList(BindingRequest bindingRequest);
}
