package o;

import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class putFloat extends BaseRpcRequest implements Serializable {
    public int pageNumber;
    public int pageSize;
    public String userId;

    public putFloat() {
    }

    public putFloat(MobileEnvInfo mobileEnvInfo, int i, int i2) {
        this.pageNumber = i;
        this.pageSize = i2;
        this.envInfo = mobileEnvInfo;
    }
}
