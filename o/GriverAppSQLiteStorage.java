package o;

import java.util.ArrayList;
import java.util.List;

public class GriverAppSQLiteStorage {
    private List<GriverAMCSAppUpdater> prizeInfoList;

    public List<GriverAMCSAppUpdater> getPrizeInfoList() {
        List<GriverAMCSAppUpdater> list = this.prizeInfoList;
        return list == null ? new ArrayList() : list;
    }

    public void setPrizeInfoList(List<GriverAMCSAppUpdater> list) {
        this.prizeInfoList = list;
    }
}
