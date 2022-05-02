package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.data.network.ResultResponse;
import java.util.List;

final class IpcChannelManager implements RedDotDrawable {
    public static final IpcChannelManager getMin = new IpcChannelManager();

    public class ClientListener extends BaseRpcRequest {
        public String acceptTimeoutUnit;
        public String acceptTimeoutValue;
        public String amount;
        public List<String> couponIds;
        public String fundType;
        public String instId;
        public String payMethod;
        public ServerReadyListener payeeInfo;
        public String remarks;
        public String requestId;
        public boolean shareActivity;
        public String splitBillId;
        public String transferScenario;
    }

    public class ServerReadyListener {
        public String bankAccountIndexNo;
        public String contactName;
        public String dateOfBirth;
        public String loginId;
        public String name;
        public String nickname;
        public String regId;
        public String userId;
    }

    public final Object apply(Object obj) {
        return ((ResultResponse) obj).getResult();
    }
}
