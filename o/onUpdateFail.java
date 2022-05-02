package o;

import android.content.Context;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class onUpdateFail extends setRepeatCount<bindService> implements before {
    @Inject
    public onUpdateFail(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<bindService> getFacadeClass() {
        return bindService.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<createScheduleExtensionInvoker> getPaymentSecurityInitResult() {
        BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
        baseRpcRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new DefaultExtensionInvokerFactory(baseRpcRequest));
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcCallClientHelper> getSecuritySwitchResult(boolean z, String str, String str2, String str3, String str4) {
        unbind unbind = new unbind();
        unbind.envInfo = generateMobileEnvInfo();
        unbind.authenticationStatus = z;
        unbind.authenticationType = str;
        unbind.securityId = str2;
        unbind.validateData = RSAHelper.encrypt(str3, str4);
        return wrapper(new createAwareExtensionInvoker(unbind));
    }
}
