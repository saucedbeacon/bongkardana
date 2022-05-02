package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class ResourceResponseInfo extends BaseRpcResult {
    private String code;
    private String message;
    private boolean success;

    public boolean isSuccess() {
        return this.success;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
