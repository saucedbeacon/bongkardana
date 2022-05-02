package o;

import id.dana.model.CurrencyAmountModel;
import java.util.Iterator;
import java.util.List;

public final class browsePhoto extends setSpeed<getDataFieldCount, onLoadProgress> {
    public String setMin;

    public final /* synthetic */ Object map(Object obj) {
        BluetoothUuid bluetoothUuid;
        List<getIdentifierByteCount> list;
        getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
        if (!(getdatafieldcount == null || getdatafieldcount.getTransferMethod() == null)) {
            String str = this.setMin;
            Iterator<BluetoothUuid> it = getdatafieldcount.getTransferMethod().iterator();
            while (true) {
                if (!it.hasNext()) {
                    bluetoothUuid = null;
                    break;
                }
                bluetoothUuid = it.next();
                if (str.equals(bluetoothUuid.getTransferMethod())) {
                    break;
                }
            }
            if (bluetoothUuid != null) {
                onLoadProgress onloadprogress = new onLoadProgress();
                List<parseUuidFrom> withdrawMethodOptions = bluetoothUuid.getWithdrawMethodOptions();
                if (!"OTC".equals(this.setMin) || withdrawMethodOptions == null || withdrawMethodOptions.get(0).getWithdrawChannelOptions() == null) {
                    list = bluetoothUuid.getPayOptionDTOResponses();
                } else {
                    list = withdrawMethodOptions.get(0).getWithdrawChannelOptions().get(0).getPayOptionDTOResponses();
                }
                stopBleScan payerMaxAmount = list.get(0).getPayerMaxAmount();
                CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(payerMaxAmount.getAmount(), payerMaxAmount.getCurrency());
                for (getIdentifierByteCount payerMaxAmount2 : list) {
                    stopBleScan payerMaxAmount3 = payerMaxAmount2.getPayerMaxAmount();
                    CurrencyAmountModel currencyAmountModel2 = new CurrencyAmountModel(payerMaxAmount3.getAmount(), payerMaxAmount3.getCurrency());
                    if (currencyAmountModel2.length(currencyAmountModel)) {
                        currencyAmountModel = currencyAmountModel2;
                    }
                }
                onloadprogress.getMin = currencyAmountModel;
                stopBleScan payerMinAmount = list.get(0).getPayerMinAmount();
                CurrencyAmountModel currencyAmountModel3 = new CurrencyAmountModel(payerMinAmount.getAmount(), payerMinAmount.getCurrency());
                for (getIdentifierByteCount payerMinAmount2 : list) {
                    stopBleScan payerMinAmount3 = payerMinAmount2.getPayerMinAmount();
                    CurrencyAmountModel currencyAmountModel4 = new CurrencyAmountModel(payerMinAmount3.getAmount(), payerMinAmount3.getCurrency());
                    if (currencyAmountModel4.getMin(currencyAmountModel3)) {
                        currencyAmountModel3 = currencyAmountModel4;
                    }
                }
                CurrencyAmountModel currencyAmountModel5 = new CurrencyAmountModel("1");
                if (currencyAmountModel3.getMin(currencyAmountModel5)) {
                    currencyAmountModel3 = currencyAmountModel5;
                }
                onloadprogress.setMax = currencyAmountModel3;
                stopBleScan chargeAmount = bluetoothUuid.getChargeAmount();
                onloadprogress.getMax = new CurrencyAmountModel(chargeAmount.getAmount(), chargeAmount.getCurrency());
                if (bluetoothUuid.getFreeFeeMinAmount() != null) {
                    stopBleScan freeFeeMinAmount = bluetoothUuid.getFreeFeeMinAmount();
                    onloadprogress.length = new CurrencyAmountModel(freeFeeMinAmount.getAmount(), freeFeeMinAmount.getCurrency());
                }
                return onloadprogress;
            }
        }
        return null;
    }
}
