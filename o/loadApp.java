package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class loadApp extends BaseRpcResult {
    private List<setHeaders> activities;
    private boolean hasMore;
    private String maxId;
    private String minId;

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setActivities(List<setHeaders> list) {
        this.activities = list;
    }

    public void setMaxId(String str) {
        this.maxId = str;
    }

    public String getMaxId() {
        return this.maxId;
    }

    public String getMinId() {
        return this.minId;
    }

    public void setMinId(String str) {
        this.minId = str;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public List<setHeaders> getActivities() {
        return this.activities;
    }
}
