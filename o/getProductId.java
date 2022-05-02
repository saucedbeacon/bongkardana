package o;

import id.dana.data.sendmoney.model.PayMethodInfoResult;
import id.dana.data.sendmoney.model.TransferMethodInfoResult;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class getProductId extends setSpeed<TransferMethodInfoResult, List<getIdentifierByteCount>> {
    private static final int INDEX_ZERO = 0;
    private List<addExtraDataParser> addPayMethods;
    private final defaultPlatform currencyAmountResultMapper;
    private final RVExtensionService payMethodViewResultMapper;

    @Inject
    getProductId(defaultPlatform defaultplatform, RVExtensionService rVExtensionService) {
        this.currencyAmountResultMapper = defaultplatform;
        this.payMethodViewResultMapper = rVExtensionService;
    }

    /* access modifiers changed from: protected */
    public List<getIdentifierByteCount> map(TransferMethodInfoResult transferMethodInfoResult) {
        ArrayList arrayList = new ArrayList();
        List<PayMethodInfoResult> paymethodInfoResult = getPaymethodInfoResult(transferMethodInfoResult);
        this.payMethodViewResultMapper.setAddPayMethods(this.addPayMethods);
        for (PayMethodInfoResult next : paymethodInfoResult) {
            getIdentifierByteCount getidentifierbytecount = new getIdentifierByteCount();
            getidentifierbytecount.setPayMethod(next.getPayMethod());
            getidentifierbytecount.setPayerMaxAmount(this.currencyAmountResultMapper.map(next.getPayerMaxAmount()));
            getidentifierbytecount.setPayerMinAmount(this.currencyAmountResultMapper.map(next.getPayerMinAmount()));
            getidentifierbytecount.setFundType(next.getFundType());
            getidentifierbytecount.setPayMethodView(this.payMethodViewResultMapper.map(next.getPayMethodView()));
            arrayList.add(getidentifierbytecount);
        }
        return arrayList;
    }

    private List<PayMethodInfoResult> getPaymethodInfoResult(TransferMethodInfoResult transferMethodInfoResult) {
        if (transferMethodInfoResult == null) {
            return new ArrayList();
        }
        if ("OTC".equals(transferMethodInfoResult.getTransferMethod()) && transferMethodInfoResult.getWithdrawMethodViews() != null) {
            List<getMD5> withdrawMethodViews = transferMethodInfoResult.getWithdrawMethodViews();
            if (withdrawMethodViews.size() > 0 && withdrawMethodViews.get(0) != null && withdrawMethodViews.get(0).withdrawChannelOptionViews != null && withdrawMethodViews.get(0).withdrawChannelOptionViews.size() > 0) {
                return withdrawMethodViews.get(0).withdrawChannelOptionViews.get(0).getPayMethodInfos();
            }
        }
        return transferMethodInfoResult.getPayMethodInfos();
    }

    /* access modifiers changed from: package-private */
    public void setAddPayMethods(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }
}
