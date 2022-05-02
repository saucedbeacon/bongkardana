package o;

import android.content.Context;
import o.JsApiStatTrackStore;
import o.TitleBarRightButtonView;

public final class appendJsApiDetail4TinyWithT2 extends setRepeatCount<JsApiStatTrackStore.TinyAppJsApiStatInfo> implements trackKeyJSAPIInvoke {
    public appendJsApiDetail4TinyWithT2(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<JsApiStatTrackStore.TinyAppJsApiStatInfo> getFacadeClass() {
        return JsApiStatTrackStore.TinyAppJsApiStatInfo.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<getAppxVersionInWorker> verifyOtp(String str, String str2) {
        BaseWorkerImpl baseWorkerImpl = new BaseWorkerImpl();
        baseWorkerImpl.envInfo = generateMobileEnvInfo();
        baseWorkerImpl.phoneNumber = str;
        baseWorkerImpl.otpValue = str2;
        return wrapper(new JsApiStatTrackStore(baseWorkerImpl));
    }

    public final TitleBarRightButtonView.AnonymousClass1<getJsApiDetail4TinyWithT2> sendOtp(String str, String str2, String str3) {
        isJsApiDetail4TinyWithinT2Uploaded isjsapidetail4tinywithint2uploaded = new isJsApiDetail4TinyWithinT2Uploaded();
        isjsapidetail4tinywithint2uploaded.envInfo = generateMobileEnvInfo();
        isjsapidetail4tinywithint2uploaded.phoneNumber = str;
        isjsapidetail4tinywithint2uploaded.sendStrategy = str2;
        isjsapidetail4tinywithint2uploaded.serviceCode = str3;
        return wrapper(new setJsApiDetail4TinyWithinT2Uploaded(isjsapidetail4tinywithint2uploaded));
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> receiveOtp() {
        throw new UnsupportedOperationException();
    }
}
