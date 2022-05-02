package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class generateUniqueId extends BaseRpcResult {
    private boolean hasMore;
    private List<Render> shops;

    public List<Render> getShops() {
        return this.shops;
    }

    public void setShops(List<Render> list) {
        this.shops = list;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }
}
