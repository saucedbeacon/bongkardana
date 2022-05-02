package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.ToastUtils;

public class getAppRegion extends setSpeed<List<checkPathValid>, List<ToastUtils.TYPE>> {
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public getAppRegion(defaultPlatform defaultplatform) {
        this.currencyAmountResultMapper = defaultplatform;
    }

    /* access modifiers changed from: protected */
    public List<ToastUtils.TYPE> map(List<checkPathValid> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (checkPathValid next : list) {
            arrayList.add(new ToastUtils.TYPE.setMax().setEnableStatus(next.enableStatus).setInstId(next.instId).setInstName(next.instName).setPayMethod(next.payMethod).setPayOption(next.payOption).setDisableReason(next.disableReason).setMinAmount(this.currencyAmountResultMapper.map(next.minAmount)).setMaxAmount(this.currencyAmountResultMapper.map(next.maxAmount)).setSupportCountries(next.supportCountries).build());
        }
        return arrayList;
    }
}
