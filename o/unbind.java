package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class unbind extends BaseRpcRequest implements Serializable {
    public boolean authenticationStatus;
    public String authenticationType;
    public String securityId;
    public String validateData;
}
