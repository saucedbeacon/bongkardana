package o;

import android.text.TextUtils;
import id.dana.domain.payasset.model.Institution;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public final class PhotoContext extends setSpeed<getPowerCorrection, List<PayMethodModel>> {
    private List<addExtraDataParser> length;

    public final /* synthetic */ Object map(Object obj) {
        getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
        ArrayList arrayList = new ArrayList();
        this.length = new ArrayList();
        PayMethodModel payMethodModel = new PayMethodModel();
        payMethodModel.Grayscale$Algorithm = "BALANCE";
        arrayList.add(payMethodModel);
        PayMethodModel payMethodModel2 = new PayMethodModel();
        stopBleScan payerAccountBalance = getpowercorrection.getPayerAccountBalance();
        payMethodModel2.getMax = new CurrencyAmountModel(payerAccountBalance.getAmount(), payerAccountBalance.getCurrency());
        payMethodModel2.getMin(getpowercorrection.getPayeeMaskedPhoneNumber());
        payMethodModel2.toString = getpowercorrection.getKyc().getLevel();
        payMethodModel2.IsOverlapping = Institution.DANA;
        payMethodModel2.values = "BALANCE";
        stopBleScan stopblescan = new stopBleScan(getpowercorrection.getPayerMaxAmount().getAmount(), "Rp");
        payMethodModel2.FastBitmap$CoordinateSystem = new CurrencyAmountModel(stopblescan.getAmount(), stopblescan.getCurrency());
        stopBleScan stopblescan2 = new stopBleScan(getpowercorrection.getPayerMinAmount().getAmount(), "Rp");
        payMethodModel2.hashCode = new CurrencyAmountModel(stopblescan2.getAmount(), stopblescan2.getCurrency());
        arrayList.add(payMethodModel2);
        arrayList.addAll(setMax(getpowercorrection.getPayOptions()));
        if (this.length != null) {
            for (getIdentifierByteCount payMethodView : getpowercorrection.getPayOptions()) {
                this.length = payMethodView.getPayMethodView().getAddPayMethods();
            }
            PayMethodModel payMethodModel3 = new PayMethodModel();
            payMethodModel3.Grayscale$Algorithm = PayMethodModel.SectionTitle.ADD_CARD;
            arrayList.add(payMethodModel3);
            for (addExtraDataParser next : this.length) {
                if (next.isEnable()) {
                    PayMethodModel payMethodModel4 = new PayMethodModel();
                    payMethodModel4.setMax = "ADD_CARD";
                    if (!TextUtils.isEmpty(next.getInstId())) {
                        payMethodModel4.IsOverlapping = next.getInstId();
                    }
                    payMethodModel4.values = next.getPayMethod();
                    payMethodModel4.length = next.isEnable();
                    payMethodModel4.Mean$Arithmetic = next.getUrl();
                    arrayList.add(payMethodModel4);
                }
            }
        }
        return arrayList;
    }

    @Inject
    PhotoContext() {
    }

    private static List<PayMethodModel> setMax(List<getIdentifierByteCount> list) {
        ArrayList arrayList = new ArrayList();
        for (getIdentifierByteCount next : list) {
            UCUtils payMethodView = next.getPayMethodView();
            stopBleScan payerMaxAmount = next.getPayerMaxAmount();
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(payerMaxAmount.getAmount(), payerMaxAmount.getCurrency());
            stopBleScan payerMinAmount = next.getPayerMinAmount();
            CurrencyAmountModel currencyAmountModel2 = new CurrencyAmountModel(payerMinAmount.getAmount(), payerMinAmount.getCurrency());
            String fundType = next.getFundType();
            List<getAbsoluteUrlV2> payCardOptionViews = payMethodView.getPayCardOptionViews();
            if (payCardOptionViews != null && !payCardOptionViews.isEmpty()) {
                if (arrayList.isEmpty()) {
                    PayMethodModel payMethodModel = new PayMethodModel();
                    payMethodModel.Grayscale$Algorithm = PayMethodModel.SectionTitle.DEBIT_CARD;
                    arrayList.add(payMethodModel);
                }
                for (getAbsoluteUrlV2 next2 : payCardOptionViews) {
                    PayMethodModel payMethodModel2 = new PayMethodModel();
                    payMethodModel2.getMin(next2.getMaskedCardNo());
                    payMethodModel2.setMax = next2.getCardScheme();
                    payMethodModel2.length = next2.isEnableStatus();
                    payMethodModel2.IsOverlapping = next2.getInstId();
                    payMethodModel2.getMin = next2.getCardIndexNo();
                    payMethodModel2.toDoubleRange = next2.getInstName();
                    payMethodModel2.equals = next2.getInstLocalName();
                    payMethodModel2.length = next2.isEnableStatus();
                    payMethodModel2.values = next.getPayMethod();
                    payMethodModel2.toFloatRange = fundType;
                    payMethodModel2.FastBitmap$CoordinateSystem = currencyAmountModel;
                    payMethodModel2.hashCode = currencyAmountModel2;
                    arrayList.add(payMethodModel2);
                }
            }
        }
        return arrayList;
    }
}
