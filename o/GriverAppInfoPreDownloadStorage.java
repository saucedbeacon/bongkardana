package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GriverAppInfoPreDownloadStorage {
    private List<GriverAMCSAppUpdater> prizeInfoList = Collections.emptyList();

    public List<GriverAMCSAppUpdater> getPrizeInfoList() {
        List<GriverAMCSAppUpdater> list = this.prizeInfoList;
        return list == null ? new ArrayList() : list;
    }

    public void setPrizeInfoList(List<GriverAMCSAppUpdater> list) {
        this.prizeInfoList = list;
    }

    public static GriverAppInfoPreDownloadStorage emptyData() {
        return new GriverAppInfoPreDownloadStorage();
    }

    public boolean isEmpty() {
        return this.prizeInfoList.isEmpty();
    }
}
