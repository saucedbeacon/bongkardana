package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class getWindow extends BaseRpcRequest implements Serializable {
    public String userInfoBizScene;
    public String value;
}
