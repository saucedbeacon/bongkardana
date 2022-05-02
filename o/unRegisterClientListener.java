package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class unRegisterClientListener extends BaseRpcRequest implements Serializable {
    public String comment;
    public String payAmount;
    public String payCurrency;
    public String payMethod;
    public String payeeAvatar;
    public String payeeLoginId;
    public String payeeNickname;
    public String payeeRegId;
    public String payeeUserId;
    public String payerAvatar;
    public String payerNickname;
    public String requestId;
    public Boolean share;
}
