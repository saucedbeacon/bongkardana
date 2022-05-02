package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface setSceneParams {
    @OperationType("alipayplus.mobilewallet.pocket.numUpdated")
    @SignCheck
    generateStartToken numUpdated(RVAppRecord rVAppRecord);
}
