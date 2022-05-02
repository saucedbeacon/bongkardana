package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;
import o.Action;

public class RVClassLoaderFactory extends BaseRpcResult {
    private List<Action.Complete> prizeInfoList;

    public List<Action.Complete> getPrizeInfoList() {
        List<Action.Complete> list = this.prizeInfoList;
        return list == null ? new ArrayList() : list;
    }

    public void setPrizeInfoList(List<Action.Complete> list) {
        this.prizeInfoList = list;
    }
}
