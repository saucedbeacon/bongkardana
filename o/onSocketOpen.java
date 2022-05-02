package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;

public class onSocketOpen extends BaseRpcRequest {
    public List<String> closePayers;
    public String splitBillId;
}
