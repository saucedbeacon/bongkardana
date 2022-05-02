package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class tyroRequest extends BaseRpcResult {
    private List<supportRemoteDebug> splitBillHistoryList;

    public List<supportRemoteDebug> getSplitBillHistoryList() {
        return this.splitBillHistoryList;
    }

    public void setSplitBillHistoryList(List<supportRemoteDebug> list) {
        this.splitBillHistoryList = list;
    }
}
