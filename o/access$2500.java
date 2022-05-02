package o;

import android.content.Context;
import id.dana.data.security.PublicKeyScene;
import o.TitleBarRightButtonView;

public final class access$2500 extends addAnimatorUpdateListener<getCode> implements access$2400 {
    private final Context context;

    public access$2500(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed) {
        super(setisurgentresource, appxloadfailed);
        Context context2;
        if (setisurgentresource == null) {
            context2 = null;
        } else {
            context2 = setisurgentresource.getContext();
        }
        this.context = context2;
    }

    public final Class<getCode> getFacadeClass() {
        return getCode.class;
    }

    public final Context passContext() {
        return this.context;
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> loginKey() {
        return wrapper(new getRpcProxy(new getResponse("LOGIN"))).map(RVRpcProxy.setMax);
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> offlinePayKey() {
        return wrapper(new sendSimpleRpc(new getResponse(PublicKeyScene.F2FPAY))).map(getPBRpcProxy.setMax);
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> cardCredentialKey() {
        return wrapper(new sendSimpleRpcJsapi(new getResponse(PublicKeyScene.CARD_CREDENTIAL))).map(RVRpcResponse.getMax);
    }
}
