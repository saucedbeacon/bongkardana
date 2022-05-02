package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.parseUuidFrom;

public class getScreenHeight extends setSpeed<List<getMD5>, List<parseUuidFrom>> {
    private final DimensionUtil withdrawChannelViewResultMapper;
    private final DomainUtil withdrawSavedCardChannelViewResultMapper;

    @Inject
    public getScreenHeight(DimensionUtil dimensionUtil, DomainUtil domainUtil) {
        this.withdrawChannelViewResultMapper = dimensionUtil;
        this.withdrawSavedCardChannelViewResultMapper = domainUtil;
    }

    /* access modifiers changed from: protected */
    public List<parseUuidFrom> map(List<getMD5> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getMD5 next : list) {
            arrayList.add(new parseUuidFrom.setMax().withdrawCardOptions(this.withdrawSavedCardChannelViewResultMapper.map(next.getWithdrawCardOptionViews())).withdrawChannelOptions(this.withdrawChannelViewResultMapper.map(next.getWithdrawChannelOptionViews())).withdrawMethod(next.getPayMethod()).build());
        }
        return arrayList;
    }
}
