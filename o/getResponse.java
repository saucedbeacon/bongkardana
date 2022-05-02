package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class getResponse extends BaseRpcRequest implements Serializable {
    private String publicKeyScene;

    public getResponse(String str) {
        this.publicKeyScene = str;
    }

    public String getPublicKeyScene() {
        return this.publicKeyScene;
    }
}
