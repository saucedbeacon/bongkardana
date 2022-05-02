package o;

import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.PhotoContext;
import o.ToastUtils;

public final class addDatas extends setSpeed<getDataFieldCount, List<GridAdapter>> {
    private List<onLoadCanceled> FastBitmap$CoordinateSystem;
    private getDataFieldCount IsOverlapping;
    private List<PayMethodModel> equals;
    private final onPhotoDelete getMax;
    private List<PayMethodModel> getMin;
    private long isInside;
    private CurrencyAmountModel length;
    private long setMax;
    private final PhotoContext.AnonymousClass2 setMin;
    private boolean toFloatRange;
    private List<addExtraDataParser> toIntRange;

    public final /* synthetic */ Object map(Object obj) {
        getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
        this.IsOverlapping = getdatafieldcount;
        ArrayList arrayList = new ArrayList();
        for (BluetoothUuid next : getdatafieldcount.getTransferMethod()) {
            GridAdapter gridAdapter = new GridAdapter();
            gridAdapter.getMax = new CurrencyAmountModel(next.getChargeAmount());
            gridAdapter.getMin = next.getFreeRemainedTimes();
            this.length = new CurrencyAmountModel(next.getChargeAmount());
            this.isInside = next.getFreeTimes();
            long freeRemainedTimes = next.getFreeRemainedTimes();
            this.setMax = freeRemainedTimes;
            gridAdapter.length = freeRemainedTimes;
            gridAdapter.setMax = next.getTransferMethod();
            if (next.getPayOptionDTOResponses() != null) {
                setMin(next.getPayOptionDTOResponses());
            }
            if (next.getWithdrawMethodOptions() != null) {
                List<parseUuidFrom> withdrawMethodOptions = next.getWithdrawMethodOptions();
                ArrayList arrayList2 = new ArrayList();
                this.FastBitmap$CoordinateSystem = arrayList2;
                arrayList2.addAll(this.getMax.map(withdrawMethodOptions));
            }
            gridAdapter.setMin = this.equals;
            gridAdapter.isInside = this.FastBitmap$CoordinateSystem;
            arrayList.add(gridAdapter);
            this.toFloatRange = false;
        }
        return arrayList;
    }

    @Inject
    addDatas(PhotoContext.AnonymousClass2 r1, onPhotoDelete onphotodelete) {
        this.setMin = r1;
        this.getMax = onphotodelete;
    }

    private void setMin(List<getIdentifierByteCount> list) {
        this.equals = new ArrayList();
        this.getMin = new ArrayList();
        this.toIntRange = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            getIdentifierByteCount getidentifierbytecount = list.get(i);
            String fundType = getidentifierbytecount.getFundType();
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(getidentifierbytecount.getPayerMaxAmount());
            CurrencyAmountModel currencyAmountModel2 = new CurrencyAmountModel(getidentifierbytecount.getPayerMinAmount());
            length(getidentifierbytecount, fundType);
            if (setMin(getidentifierbytecount)) {
                getMax(getidentifierbytecount, fundType, currencyAmountModel, currencyAmountModel2);
            } else if (!length(getidentifierbytecount)) {
                if (!this.toFloatRange) {
                    List<PayMethodModel> list2 = this.equals;
                    PayMethodModel payMethodModel = new PayMethodModel();
                    payMethodModel.Grayscale$Algorithm = PayMethodModel.SectionTitle.DEBIT_CARD;
                    list2.add(payMethodModel);
                    this.toFloatRange = true;
                }
                getMin(getidentifierbytecount, fundType, currencyAmountModel, currencyAmountModel2);
            }
            if (getidentifierbytecount.getPayMethodView().getAddPayMethods() != null) {
                this.toIntRange.addAll(getidentifierbytecount.getPayMethodView().getAddPayMethods());
            }
            if (getMax(i, list.size(), getidentifierbytecount) && this.toIntRange != null) {
                setMax(fundType, currencyAmountModel, currencyAmountModel2);
            }
        }
    }

    private static boolean setMin(getIdentifierByteCount getidentifierbytecount) {
        return "BALANCE".equals(getidentifierbytecount.getPayMethod());
    }

    private void getMax(getIdentifierByteCount getidentifierbytecount, String str, CurrencyAmountModel currencyAmountModel, CurrencyAmountModel currencyAmountModel2) {
        List<PayMethodModel> list = this.equals;
        PayMethodModel payMethodModel = new PayMethodModel();
        payMethodModel.Grayscale$Algorithm = "BALANCE";
        list.add(payMethodModel);
        for (ToastUtils.TYPE next : getidentifierbytecount.getPayMethodView().getPayChannelOptionViews()) {
            List<PayMethodModel> list2 = this.equals;
            getDataFieldCount getdatafieldcount = this.IsOverlapping;
            PayMethodModel payMethodModel2 = new PayMethodModel();
            payMethodModel2.getMax = new CurrencyAmountModel(getdatafieldcount.getPayerAccountBalance());
            payMethodModel2.getMin(getdatafieldcount.getPayerMaskedPhoneNumber());
            payMethodModel2.toString = getdatafieldcount.getKyc();
            payMethodModel2.IsOverlapping = next.getInstId();
            payMethodModel2.values = next.getPayMethod();
            payMethodModel2.invokeSuspend = next.getPayOption();
            payMethodModel2.length = next.isEnableStatus();
            payMethodModel2.toFloatRange = str;
            payMethodModel2.FastBitmap$CoordinateSystem = currencyAmountModel;
            payMethodModel2.hashCode = currencyAmountModel2;
            payMethodModel2.setMin = this.length;
            payMethodModel2.isInside = this.setMax;
            payMethodModel2.toIntRange = this.isInside;
            list2.add(payMethodModel2);
        }
    }

    private static boolean length(getIdentifierByteCount getidentifierbytecount) {
        return getidentifierbytecount.getPayMethodView().getPayCardOptionViews().isEmpty();
    }

    private void getMin(getIdentifierByteCount getidentifierbytecount, String str, CurrencyAmountModel currencyAmountModel, CurrencyAmountModel currencyAmountModel2) {
        for (getAbsoluteUrlV2 next : getidentifierbytecount.getPayMethodView().getPayCardOptionViews()) {
            List<PayMethodModel> list = this.equals;
            PayMethodModel payMethodModel = new PayMethodModel();
            payMethodModel.getMin = next.getCardIndexNo();
            payMethodModel.setMax = next.getCardScheme();
            payMethodModel.getMin(next.getMaskedCardNo());
            payMethodModel.length = next.isEnableStatus();
            payMethodModel.IsOverlapping = next.getInstId();
            payMethodModel.toDoubleRange = next.getInstName();
            payMethodModel.equals = next.getInstLocalName();
            payMethodModel.invokeSuspend = next.getPayOption();
            payMethodModel.length = next.isEnableStatus();
            payMethodModel.values = next.getPayMethod();
            payMethodModel.toFloatRange = str;
            payMethodModel.setMin = this.length;
            payMethodModel.isInside = this.setMax;
            payMethodModel.toIntRange = this.isInside;
            length(payMethodModel, currencyAmountModel, currencyAmountModel2);
            list.add(payMethodModel);
        }
    }

    private static boolean getMax(int i, int i2, getIdentifierByteCount getidentifierbytecount) {
        return i == i2 - 1 && !setMin(getidentifierbytecount);
    }

    private void length(PayMethodModel payMethodModel, CurrencyAmountModel currencyAmountModel, CurrencyAmountModel currencyAmountModel2) {
        for (PayMethodModel next : this.getMin) {
            if (next.invokeSuspend.equals(payMethodModel.invokeSuspend) || (next.values.equals(payMethodModel.values) && next.IsOverlapping.equals(payMethodModel.IsOverlapping))) {
                if (next.FastBitmap$CoordinateSystem != null) {
                    currencyAmountModel = next.FastBitmap$CoordinateSystem;
                }
                if (next.FastBitmap$CoordinateSystem != null) {
                    currencyAmountModel2 = next.hashCode;
                }
            }
        }
        payMethodModel.FastBitmap$CoordinateSystem = currencyAmountModel;
        payMethodModel.hashCode = currencyAmountModel2;
    }

    private void length(getIdentifierByteCount getidentifierbytecount, String str) {
        for (ToastUtils.TYPE next : getidentifierbytecount.getPayMethodView().getPayChannelOptionViews()) {
            List<PayMethodModel> list = this.getMin;
            PayMethodModel payMethodModel = new PayMethodModel();
            payMethodModel.length = next.isEnableStatus();
            payMethodModel.IsOverlapping = next.getInstId();
            payMethodModel.setMax = "ADD_CARD";
            payMethodModel.toDoubleRange = next.getInstName();
            payMethodModel.equals = next.getInstLocalName();
            payMethodModel.invokeSuspend = next.getPayOption();
            payMethodModel.values = next.getPayMethod();
            stopBleScan minAmount = next.getMinAmount();
            CurrencyAmountModel currencyAmountModel = null;
            payMethodModel.hashCode = minAmount != null ? new CurrencyAmountModel(minAmount.getAmount(), minAmount.getCurrency(), minAmount.isPlaceholder()) : null;
            stopBleScan maxAmount = next.getMaxAmount();
            if (maxAmount != null) {
                currencyAmountModel = new CurrencyAmountModel(maxAmount.getAmount(), maxAmount.getCurrency(), maxAmount.isPlaceholder());
            }
            payMethodModel.FastBitmap$CoordinateSystem = currencyAmountModel;
            payMethodModel.toFloatRange = str;
            list.add(payMethodModel);
        }
    }

    private void setMax(String str, CurrencyAmountModel currencyAmountModel, CurrencyAmountModel currencyAmountModel2) {
        PayMethodModel payMethodModel = new PayMethodModel();
        payMethodModel.Grayscale$Algorithm = PayMethodModel.SectionTitle.ADD_CARD;
        this.equals.add(payMethodModel);
        for (addExtraDataParser next : this.toIntRange) {
            if (next.isEnable()) {
                PayMethodModel payMethodModel2 = new PayMethodModel();
                payMethodModel2.setMax = "ADD_CARD";
                if (!TextUtils.isEmpty(next.getInstId())) {
                    payMethodModel2.IsOverlapping = next.getInstId();
                }
                payMethodModel2.equals = next.getInstLocalName();
                payMethodModel2.values = next.getPayMethod();
                payMethodModel2.length = next.isEnable();
                payMethodModel2.Mean$Arithmetic = next.getUrl();
                payMethodModel2.toFloatRange = str;
                payMethodModel2.setMin = this.length;
                payMethodModel2.isInside = this.setMax;
                payMethodModel2.toIntRange = this.isInside;
                length(payMethodModel2, currencyAmountModel, currencyAmountModel2);
                if (TextUtils.isEmpty(payMethodModel2.IsOverlapping)) {
                    int indexOf = this.equals.indexOf(payMethodModel);
                    if (indexOf >= 0) {
                        this.equals.add(indexOf + 1, payMethodModel2);
                    } else {
                        this.equals.add(payMethodModel2);
                    }
                } else {
                    this.equals.add(payMethodModel2);
                }
            }
        }
    }
}
