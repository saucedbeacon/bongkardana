package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class getDouble extends BaseRpcRequest implements Serializable {
    private String missionId;

    public getDouble(String str) {
        setMissionId(str);
    }

    public String getMissionId() {
        return this.missionId;
    }

    public void setMissionId(String str) {
        this.missionId = str;
    }
}
