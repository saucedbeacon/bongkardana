package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class readToArray extends BaseRpcResult {
    public static readToArray success() {
        readToArray readtoarray = new readToArray();
        readtoarray.success = true;
        return readtoarray;
    }
}
