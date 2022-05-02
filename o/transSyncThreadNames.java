package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class transSyncThreadNames extends BaseRpcResult {
    private List<ActionFilter> listOfCategory;
    private long totalCount;

    public List<ActionFilter> getListOfCategory() {
        return this.listOfCategory;
    }

    public void setListOfCategory(List<ActionFilter> list) {
        this.listOfCategory = list;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }
}
