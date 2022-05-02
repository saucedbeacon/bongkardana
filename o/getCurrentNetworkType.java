package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class getCurrentNetworkType extends setRepeatCount<RVDownloadCallback> implements RVTransportService {
    private static final String ACTION_GN_SHARE_ENV_INFO = "SHARE_ENV_INFO";
    private static final String ACTION_SHARE_URL = "SHARE_URL";
    private static final String BIZ_TYPE_DANA_KAGET = "DANA_KAGET";
    private static final String BIZ_TYPE_RISK_PURPOSE = "RISK_PURPOSE";
    public static final String TAG = "NetworkSendRiskEventEntityData";
    public final appxLoadFailed threadExecutor;

    @Inject
    public getCurrentNetworkType(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.threadExecutor = appxloadfailed;
    }

    public Class<RVDownloadCallback> getFacadeClass() {
        return RVDownloadCallback.class;
    }

    public TitleBarRightButtonView.AnonymousClass1 sendRiskEvent(String str, String str2, String str3) {
        setDownloadFileName createRequest = createRequest(ACTION_SHARE_URL, BIZ_TYPE_DANA_KAGET, str3);
        HashMap hashMap = new HashMap();
        hashMap.put("shareChannel", str);
        hashMap.put("shareLink", str2);
        createRequest.extendInfo = hashMap;
        return wrapper(new NetworkUtil(createRequest));
    }

    public TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> sendRiskEvent(String str, String str2) {
        setDownloadFileName createRequest = createRequest(ACTION_GN_SHARE_ENV_INFO, BIZ_TYPE_RISK_PURPOSE, "");
        HashMap hashMap = new HashMap();
        hashMap.put("bizScene", "UPDATE_USER_COUNTRY");
        createRequest.extendInfo = hashMap;
        addLocationInfo(createRequest, str, str2);
        return wrapper(new transferNetworkType(createRequest));
    }

    private void addLocationInfo(setDownloadFileName setdownloadfilename, String str, String str2) {
        if (setdownloadfilename.envInfo != null && setdownloadfilename.envInfo.extendInfo != null) {
            setdownloadfilename.envInfo.extendInfo.put("userCountryCurrent", str);
            setdownloadfilename.envInfo.extendInfo.put("userCountryOrigin", str2);
        }
    }

    @NotNull
    private setDownloadFileName createRequest(String str, String str2, String str3) {
        setDownloadFileName setdownloadfilename = new setDownloadFileName();
        setdownloadfilename.action = str;
        setdownloadfilename.bizType = str2;
        setdownloadfilename.bizOrderId = str3;
        setdownloadfilename.envInfo = generateMobileEnvInfo();
        return setdownloadfilename;
    }
}
