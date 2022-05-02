package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class UsePermission extends BaseRpcResult {
    List<AutoCallback> listOfCategorizedPromo;

    public List<AutoCallback> getListOfCategorizedPromo() {
        return this.listOfCategorizedPromo;
    }

    public void setListOfCategorizedPromo(List<AutoCallback> list) {
        this.listOfCategorizedPromo = list;
    }
}
