package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class getSnapshot extends BaseRpcResult {
    private boolean hasMore;
    private String maxId;
    private List<WorkerCreateConfigPoint> notifications;

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public String getMaxId() {
        return this.maxId;
    }

    public void setMaxId(String str) {
        this.maxId = str;
    }

    public List<WorkerCreateConfigPoint> getNotifications() {
        return this.notifications;
    }

    public void setNotifications(List<WorkerCreateConfigPoint> list) {
        this.notifications = list;
    }
}
