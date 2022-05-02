package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import java.util.Map;

public class setDownloadFileName extends BaseRpcRequest implements Serializable {
    public String action;
    public String bizOrderId;
    public String bizType;
    public Map<String, String> extendInfo;
}
