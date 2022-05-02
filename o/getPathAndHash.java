package o;

import android.content.Context;
import java.util.Collections;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.DialogRecyclerView;
import o.IpcMessage;
import o.TitleBarRightButtonView;

@Singleton
public class getPathAndHash implements getConfigBoolean {
    private Context context;
    private PluginInstallCallback serializer;

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> confirm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> init() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> init(String str, String str2) {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessage.AnonymousClass1> nameCheck(setAllowPduOverflow setallowpduoverflow, String str, Boolean bool) {
        return null;
    }

    @Inject
    public getPathAndHash(PluginInstallCallback pluginInstallCallback, Context context2) {
        this.serializer = pluginInstallCallback;
        this.context = context2;
    }

    public TitleBarRightButtonView.AnonymousClass1<unmarshall> initPrePay(registerClientChannel registerclientchannel, String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(new unmarshall());
    }

    public TitleBarRightButtonView.AnonymousClass1<marshall> bizInit(IpcClientKernelUtils ipcClientKernelUtils) {
        return TitleBarRightButtonView.AnonymousClass1.just(createBizTransferInitRpcResultMock());
    }

    public TitleBarRightButtonView.AnonymousClass1<marshall> bizOTCInit(onServerReady onserverready) {
        return TitleBarRightButtonView.AnonymousClass1.just(createBizTransferInitRpcResultMock());
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageHandler> withdrawInit(getClientChannel getclientchannel) {
        return TitleBarRightButtonView.AnonymousClass1.just(createWithdrawInitRpcResultMock());
    }

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferSubmit(getMimeTypeFromContentType getmimetypefromcontenttype) {
        return TitleBarRightButtonView.AnonymousClass1.just(getSendMoneyRpcResultMock());
    }

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferOTCSubmit(getParent getparent) {
        return TitleBarRightButtonView.AnonymousClass1.just(getSendMoneyRpcResultMock());
    }

    private ShadowNodePool getSendMoneyRpcResultMock() {
        ShadowNodePool shadowNodePool = new ShadowNodePool();
        shadowNodePool.fundOrderId = "12345678910";
        shadowNodePool.fundAmount = "10000";
        shadowNodePool.cashierOrderId = "10987654321";
        shadowNodePool.attributes = new registerRender();
        shadowNodePool.pubKey = "1234";
        shadowNodePool.riskPhoneNumber = "";
        shadowNodePool.payMethodRiskResult = new unRegisterWorker();
        return shadowNodePool;
    }

    private marshall createBizTransferInitRpcResultMock() {
        return (marshall) this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.toIntRange), marshall.class);
    }

    private IpcMessageHandler createWithdrawInitRpcResultMock() {
        return new IpcMessageHandler(Boolean.TRUE, 5, Boolean.TRUE, Collections.emptyList());
    }
}
