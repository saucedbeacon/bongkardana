package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.addAnimatorUpdateListener;

final class JsApiStatTrackStore implements addAnimatorUpdateListener.getMax {
    private final BaseWorkerImpl length;

    public interface TinyAppJsApiStatInfo {
        @OperationType("alipayplus.mobilewallet.user.security.sendOtp")
        @SignCheck
        getJsApiDetail4TinyWithT2 sendOtp(isJsApiDetail4TinyWithinT2Uploaded isjsapidetail4tinywithint2uploaded);

        @OperationType("alipayplus.mobilewallet.user.security.verifyOtp")
        @SignCheck
        getAppxVersionInWorker verifyOtp(BaseWorkerImpl baseWorkerImpl);
    }

    public JsApiStatTrackStore(BaseWorkerImpl baseWorkerImpl) {
        this.length = baseWorkerImpl;
    }

    public final Object processFacade(Object obj) {
        return ((TinyAppJsApiStatInfo) obj).verifyOtp(this.length);
    }
}
