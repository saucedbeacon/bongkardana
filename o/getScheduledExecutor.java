package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class getScheduledExecutor extends setSpeed<List<getExtension>, List<calculateLayoutSize>> {
    @Inject
    getScheduledExecutor() {
    }

    public calculateLayoutSize transform(getExtension getextension) {
        if (getextension == null) {
            return null;
        }
        calculateLayoutSize calculatelayoutsize = new calculateLayoutSize();
        calculatelayoutsize.setKey(getextension.key);
        calculatelayoutsize.setAction(getextension.action);
        calculatelayoutsize.setIcon(getextension.icon);
        calculatelayoutsize.setTitle(getextension.title);
        calculatelayoutsize.setSubTitle(getextension.subTitle);
        calculatelayoutsize.setRedirectUrl(getextension.redirectUrl);
        calculatelayoutsize.setPromoActive(getextension.promoActive);
        calculatelayoutsize.setPromoTitle(getextension.promoTitle);
        calculatelayoutsize.setPromoDesc(getextension.promoDesc);
        return calculatelayoutsize;
    }

    /* access modifiers changed from: protected */
    public List<calculateLayoutSize> map(List<getExtension> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (getExtension transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }
}
