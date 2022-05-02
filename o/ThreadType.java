package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public class ThreadType extends BaseRpcRequest {
    private int pageNumber;
    private int pageSize;

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int i) {
        this.pageSize = i;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int i) {
        this.pageNumber = i;
    }
}
