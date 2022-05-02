package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class DefaultAppLogConfigProxyImpl extends BaseRpcRequest implements Serializable {
    public String avatarUrl;
    public String nickname;
    public String passcode;
    public String phoneNumber;
    public String referralCode;
    public String verifyMethod;
}
