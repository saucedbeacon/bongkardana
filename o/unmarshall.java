package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class unmarshall extends BaseRpcResult {
    private List<runOnMainAtFrontOfQueue> couponChannelInfos;

    public List<runOnMainAtFrontOfQueue> getCouponChannelInfos() {
        return this.couponChannelInfos;
    }

    public void setCouponChannelInfos(List<runOnMainAtFrontOfQueue> list) {
        this.couponChannelInfos = list;
    }
}
