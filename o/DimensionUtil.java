package o;

import id.dana.data.sendmoney.model.PayMethodInfoResult;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.BleResult;

public class DimensionUtil extends setSpeed<List<IOUtils>, List<BleResult>> {
    private defaultPlatform currencyAmountResultMapper;
    private RVExtensionService payMethodViewResultMapper;

    @Inject
    public DimensionUtil(defaultPlatform defaultplatform, RVExtensionService rVExtensionService) {
        this.currencyAmountResultMapper = defaultplatform;
        this.payMethodViewResultMapper = rVExtensionService;
    }

    /* access modifiers changed from: protected */
    public List<BleResult> map(List<IOUtils> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IOUtils next : list) {
            BleResult.setMax payOption = new BleResult.setMax().enableStatus(next.isEnableStatus()).instId(next.getInstId()).instLocalName(next.getInstLocalName()).instName(next.getInstName()).payMethod(next.getPayMethod()).payOption(next.getPayOption());
            if (next.getPayMethodInfos() != null) {
                payOption.payMethodInfos(transform(next.getPayMethodInfos()));
            }
            arrayList.add(payOption.build());
        }
        return arrayList;
    }

    private List<getIdentifierByteCount> transform(List<PayMethodInfoResult> list) {
        ArrayList arrayList = new ArrayList();
        for (PayMethodInfoResult next : list) {
            getIdentifierByteCount getidentifierbytecount = new getIdentifierByteCount();
            getidentifierbytecount.setPayMethod(next.getPayMethod());
            getidentifierbytecount.setPayerMaxAmount((stopBleScan) this.currencyAmountResultMapper.apply(next.getPayerMaxAmount()));
            getidentifierbytecount.setPayerMinAmount(this.currencyAmountResultMapper.map(next.getPayerMinAmount()));
            getidentifierbytecount.setFundType(next.getFundType());
            getidentifierbytecount.setPayMethodView(this.payMethodViewResultMapper.map(next.getPayMethodView()));
            arrayList.add(getidentifierbytecount);
        }
        return arrayList;
    }
}
