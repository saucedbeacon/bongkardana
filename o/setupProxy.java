package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface setupProxy {
    @OperationType("alipayplus.mobilewallet.f2fpay.changePayMethod")
    @SignCheck
    setProjectManifest changePayMethod(registerExtensionsForFinalExecute registerextensionsforfinalexecute);

    @OperationType("alipayplus.mobilewallet.user.asset.queryPayMethod")
    @SignCheck
    RVMain queryPayMethod(getProjectManifest getprojectmanifest);
}
