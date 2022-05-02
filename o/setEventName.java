package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.io.Serializable;

public class setEventName extends BaseRpcResult implements Serializable {
    public String clientKey;
    public String sessionId;
    public String userId;
}
