package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class generateFromJSON extends BaseRpcRequest {
    private final List<String> bizTypes;
    private final String etag;

    public generateFromJSON(List<String> list, String str) {
        this.bizTypes = list;
        this.etag = str;
    }

    public static generateFromJSON empty() {
        return new generateFromJSON(Collections.emptyList(), "");
    }

    public static generateFromJSON fromSingleBiztype(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return new generateFromJSON(arrayList, str2);
    }

    public List<String> getBizTypes() {
        return this.bizTypes;
    }

    public String getEtag() {
        return this.etag;
    }
}
