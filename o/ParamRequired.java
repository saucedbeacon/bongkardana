package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public class ParamRequired extends BaseRpcRequest {
    public int pageNumber;
    public int pageSize;
    public String sortBy;
}
