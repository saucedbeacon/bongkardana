package o;

import id.dana.data.sendmoney.model.TransferMethodInfoResult;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.BluetoothUuid;

public class getScreenWidth extends setSpeed<List<TransferMethodInfoResult>, List<BluetoothUuid>> {
    private List<addExtraDataParser> addPayMethods;
    private final defaultPlatform currencyAmountResultMapper;
    private final getProductId payMethodResultMapper;
    private final getScreenHeight withdrawMethodOptionsResultMapper;

    @Inject
    getScreenWidth(defaultPlatform defaultplatform, getScreenHeight getscreenheight, getProductId getproductid) {
        this.currencyAmountResultMapper = defaultplatform;
        this.withdrawMethodOptionsResultMapper = getscreenheight;
        this.payMethodResultMapper = getproductid;
    }

    public List<BluetoothUuid> map(List<TransferMethodInfoResult> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.payMethodResultMapper.setAddPayMethods(this.addPayMethods);
        for (TransferMethodInfoResult next : list) {
            arrayList.add(new BluetoothUuid.setMin().chargeAmount(this.currencyAmountResultMapper.map(next.getChargeAmount())).freeRemainedTimes(next.getFreeRemainingTimes()).freeMinAmount(this.currencyAmountResultMapper.map(next.getFreeMinAmount())).freeTimes(next.getFreeTimes()).withdrawMethodOptions(this.withdrawMethodOptionsResultMapper.map(next.getWithdrawMethodViews())).transferMethod(next.getTransferMethod()).setPayOptionDTOResponses(this.payMethodResultMapper.map(next)).build());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void setAddPayMethods(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }
}
