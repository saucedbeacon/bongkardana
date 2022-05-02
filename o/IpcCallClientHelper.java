package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class IpcCallClientHelper extends BaseRpcResult {
    public int identFailedCount;
    public int maxFailedLimit;
    public waitBindedIfNeed riskResult;
    public RemoteCallClient securityContext;
}
