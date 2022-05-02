package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;
import o.DataChannel;
import o.RemoteDebugController;
import o.TitleBarRightButtonView;
import o.b;

public final class DataChannel implements getAdapterPosition<RemoteDebugController.AnonymousClass2> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public class DataStatusChangedListener extends BaseRpcRequest {
        public String splitBillId;
    }

    public DataChannel(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final RemoteDebugController.AnonymousClass2 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
    }

    public static DataChannel create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new DataChannel(bVar, bVar2, bVar3, bVar4);
    }

    public static RemoteDebugController.AnonymousClass2 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new onRemoteDebugExitClick(setisurgentresource, appxloadfailed, onappresume, context) {
            public Class<onSocketMessage> getFacadeClass() {
                return onSocketMessage.class;
            }

            public TitleBarRightButtonView.AnonymousClass1<Long> saveSplitBillHistory(sendNetworkResponse sendnetworkresponse) {
                throw new UnsupportedOperationException();
            }

            public TitleBarRightButtonView.AnonymousClass1<tyroRequest> getSplitBillHistories(int i) {
                connect connect = new connect();
                connect.pageNum = i;
                connect.envInfo = generateMobileEnvInfo();
                return wrapper(new RemoteDebugStateListener(connect));
            }

            public TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillHistories(List<sendNetworkResponse> list) {
                throw new UnsupportedOperationException();
            }

            public void clearAll() {
                throw new UnsupportedOperationException();
            }

            public TitleBarRightButtonView.AnonymousClass1<onSocketClose> getSplitBillDetail(String str) {
                DataChannel.DataStatusChangedListener dataStatusChangedListener = new DataChannel.DataStatusChangedListener();
                dataStatusChangedListener.splitBillId = str;
                dataStatusChangedListener.envInfo = generateMobileEnvInfo();
                return wrapper(new RemoteDebugExitClickListener(dataStatusChangedListener));
            }

            public TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillDetail(sendNetworkResponse sendnetworkresponse) {
                throw new UnsupportedOperationException();
            }

            public TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> closePayers(List<String> list, String str) {
                onSocketOpen onsocketopen = new onSocketOpen();
                onsocketopen.closePayers = new ArrayList();
                onsocketopen.closePayers.addAll(list);
                onsocketopen.splitBillId = str;
                onsocketopen.envInfo = generateMobileEnvInfo();
                return wrapper(new onStateChanged(onsocketopen));
            }
        };
    }
}
