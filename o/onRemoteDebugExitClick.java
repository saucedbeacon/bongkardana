package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import o.TitleBarRightButtonView;

public interface onRemoteDebugExitClick {
    void clearAll();

    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> closePayers(List<String> list, String str);

    TitleBarRightButtonView.AnonymousClass1<onSocketClose> getSplitBillDetail(String str);

    TitleBarRightButtonView.AnonymousClass1<tyroRequest> getSplitBillHistories(int i);

    TitleBarRightButtonView.AnonymousClass1<Long> saveSplitBillHistory(sendNetworkResponse sendnetworkresponse);

    TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillDetail(sendNetworkResponse sendnetworkresponse);

    TitleBarRightButtonView.AnonymousClass1<Boolean> updateSplitBillHistories(List<sendNetworkResponse> list);
}
