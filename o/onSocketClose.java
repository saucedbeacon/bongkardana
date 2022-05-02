package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.io.Serializable;

public class onSocketClose extends BaseRpcResult implements Serializable {
    private setDialogContent splitBillOrder;

    public setDialogContent getSplitBillOrder() {
        return this.splitBillOrder;
    }

    public void setSplitBillOrder(setDialogContent setdialogcontent) {
        this.splitBillOrder = setdialogcontent;
    }
}
