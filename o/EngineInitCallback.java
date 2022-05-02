package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.EngineUtils;

public class EngineInitCallback extends BaseRpcResult implements Serializable {
    private List<EngineUtils.AnonymousClass2.AnonymousClass1> shops = new ArrayList();

    public List<EngineUtils.AnonymousClass2.AnonymousClass1> getShops() {
        return this.shops;
    }

    public void setShops(List<EngineUtils.AnonymousClass2.AnonymousClass1> list) {
        this.shops = list;
    }
}
