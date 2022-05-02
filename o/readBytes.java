package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.Action;

public class readBytes {
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public readBytes(defaultPlatform defaultplatform) {
        this.currencyAmountResultMapper = defaultplatform;
    }

    public GriverAppSQLiteStorage transform(RVClassLoaderFactory rVClassLoaderFactory) {
        if (rVClassLoaderFactory == null) {
            return null;
        }
        GriverAppSQLiteStorage griverAppSQLiteStorage = new GriverAppSQLiteStorage();
        griverAppSQLiteStorage.setPrizeInfoList(transform(rVClassLoaderFactory.getPrizeInfoList()));
        return griverAppSQLiteStorage;
    }

    public GriverAppInfoPreDownloadStorage transformMission(onInterrupt oninterrupt) {
        GriverAppInfoPreDownloadStorage emptyData = GriverAppInfoPreDownloadStorage.emptyData();
        if (oninterrupt == null || !oninterrupt.success) {
            return emptyData;
        }
        GriverAppInfoPreDownloadStorage griverAppInfoPreDownloadStorage = new GriverAppInfoPreDownloadStorage();
        griverAppInfoPreDownloadStorage.setPrizeInfoList(transform(oninterrupt.getPrizeInfoList()));
        return griverAppInfoPreDownloadStorage;
    }

    private List<GriverAMCSAppUpdater> transform(List<Action.Complete> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Action.Complete transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }

    private GriverAMCSAppUpdater transform(Action.Complete complete) {
        if (complete == null) {
            return null;
        }
        GriverAMCSAppUpdater griverAMCSAppUpdater = new GriverAMCSAppUpdater();
        griverAMCSAppUpdater.setPrizeId(complete.getPrizeId());
        griverAMCSAppUpdater.setPrizeType(complete.getPrizeType());
        griverAMCSAppUpdater.setVoucherId(complete.getVoucherId());
        griverAMCSAppUpdater.setVoucherName(complete.getVoucherName());
        griverAMCSAppUpdater.setPrizeMoneyAmount((stopBleScan) this.currencyAmountResultMapper.apply(complete.getPrizeMoneyAmount()));
        return griverAMCSAppUpdater;
    }
}
