package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class RVAppRecord extends BaseRpcRequest implements Serializable {
    private long lastTimeUpdated;

    public void setLastTimeUpdated(long j) {
        this.lastTimeUpdated = j;
    }

    public long getLastTimeUpdated() {
        return this.lastTimeUpdated;
    }
}
