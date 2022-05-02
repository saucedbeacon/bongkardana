package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import javax.inject.Inject;
import kotlin.NotImplementedError;
import o.BigDataChannelManager;
import o.RVProxy;
import o.TitleBarRightButtonView;

public class isConsumerReady extends setRepeatCount<releaseAllChannel> implements RVProxy.LazyGetter {
    @Inject
    public isConsumerReady(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public TitleBarRightButtonView.AnonymousClass1<pickNext> consult() {
        return wrapper(new readyForNextData(new pushData()));
    }

    public TitleBarRightButtonView.AnonymousClass1<setViewId> verify(String str, String str2) {
        BigDataChannelManager.AnonymousClass1 r0 = new BaseRpcRequest() {
            public String referralCode;
        };
        r0.envInfo = generateMobileEnvInfo();
        desc.setUserCity(r0.envInfo.extendInfo, str2);
        r0.referralCode = str;
        return wrapper(new releaseChannelByChannelId(r0));
    }

    public TitleBarRightButtonView.AnonymousClass1<setChannelId> statusConsult() {
        BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
        baseRpcRequest.envInfo = generateMobileEnvInfo();
        return wrapper(new createChannel(baseRpcRequest));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveReferralEngagementDialogCache(List<createChannelWithBuffer> list) {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    public Class<releaseAllChannel> getFacadeClass() {
        return releaseAllChannel.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<createChannelWithBuffer>> getDialogCaches() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }
}
