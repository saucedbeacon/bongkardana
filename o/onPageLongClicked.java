package o;

import id.dana.sendmoney.model.WithdrawOTCModel;
import java.util.List;

public final class onPageLongClicked extends setSpeed<getDataFieldCount, WithdrawOTCModel> {
    public final /* synthetic */ Object map(Object obj) {
        getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
        if (getdatafieldcount == null) {
            return null;
        }
        for (BluetoothUuid next : getdatafieldcount.getTransferMethod()) {
            if ("OTC".equals(next.getTransferMethod())) {
                List<parseUuidFrom> withdrawMethodOptions = next.getWithdrawMethodOptions();
                if (setMax(withdrawMethodOptions)) {
                    BleResult bleResult = withdrawMethodOptions.get(0).getWithdrawChannelOptions().get(0);
                    WithdrawOTCModel withdrawOTCModel = new WithdrawOTCModel();
                    if (bleResult != null) {
                        withdrawOTCModel.getMin = bleResult.getInstId();
                        withdrawOTCModel.setMax = bleResult.getInstName();
                        withdrawOTCModel.toIntRange = bleResult.getInstLocalName();
                        withdrawOTCModel.IsOverlapping = bleResult.getPayMethod();
                        withdrawOTCModel.toFloatRange = bleResult.getPayOption();
                    }
                    return withdrawOTCModel;
                }
            }
        }
        return null;
    }

    private static boolean setMax(List<parseUuidFrom> list) {
        if (list == null || list.get(0).getWithdrawChannelOptions() == null) {
            return false;
        }
        return true;
    }
}
