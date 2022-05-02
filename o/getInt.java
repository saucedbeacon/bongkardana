package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class getInt extends BaseRpcRequest implements Serializable {
    public boolean autoRedeem;
    public String missionId;
    public String questId;
}
