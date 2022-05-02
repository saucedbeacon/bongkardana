package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import java.util.List;

public class longDefault extends BaseRpcRequest implements Serializable {
    public List<ApiContext> shopInfos;
}
