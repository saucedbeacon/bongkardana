package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface UpdateAppException {
    @OperationType("alipayplus.mobilewallet.biztransfer.contact.sync")
    @SignCheck
    updateApp bizSyncContact(setNeedShowError setneedshowerror);
}
