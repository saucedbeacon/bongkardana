package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.PayOptionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.LoadInfo;
import o.PhotoContext;

public final class BucketAdapter extends setSpeed<getDataFieldCount, LoadInfo> {
    private final PhotoContext.AnonymousClass2 setMin;

    public final /* synthetic */ Object map(Object obj) {
        List<BluetoothUuid> transferMethod;
        getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
        if (getdatafieldcount == null || (transferMethod = getdatafieldcount.getTransferMethod()) == null || transferMethod.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean isNeedSenderName = getdatafieldcount.isNeedSenderName();
        int i = 0;
        int i2 = 0;
        for (BluetoothUuid next : transferMethod) {
            stopBleScan chargeAmount = next.getChargeAmount();
            arrayList.add(new LoadInfo.getMax(chargeAmount != null ? new CurrencyAmountModel(chargeAmount.getAmount(), chargeAmount.getCurrency(), chargeAmount.isPlaceholder()) : null, next.getTransferMethod(), setMax(next.getPayOptionDTOResponses())));
            int freeTimes = (int) next.getFreeTimes();
            i2 = (int) next.getFreeRemainedTimes();
            i = freeTimes;
        }
        return new LoadInfo(arrayList, isNeedSenderName, i, i2);
    }

    @Inject
    public BucketAdapter(PhotoContext.AnonymousClass2 r1) {
        this.setMin = r1;
    }

    private static List<PayOptionDTO> setMax(List<getIdentifierByteCount> list) {
        PayOptionDTO payOptionDTO;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getIdentifierByteCount next : list) {
            if (next != null) {
                payOptionDTO = new PayOptionDTO();
                payOptionDTO.setMin = next.getPayMethod();
                payOptionDTO.setMax = next.getFundType();
                stopBleScan payerMaxAmount = next.getPayerMaxAmount();
                payOptionDTO.getMax = payerMaxAmount != null ? new CurrencyAmountModel(payerMaxAmount.getAmount(), payerMaxAmount.getCurrency(), payerMaxAmount.isPlaceholder()) : null;
                stopBleScan payerMinAmount = next.getPayerMinAmount();
                payOptionDTO.length = payerMinAmount != null ? new CurrencyAmountModel(payerMinAmount.getAmount(), payerMinAmount.getCurrency(), payerMinAmount.isPlaceholder()) : null;
            } else {
                payOptionDTO = null;
            }
            arrayList.add(payOptionDTO);
        }
        return arrayList;
    }
}
