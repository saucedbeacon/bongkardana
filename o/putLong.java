package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class putLong extends BaseRpcRequest implements Serializable {
    private String missionId;
    private String userId;
    private boolean withMissionInfo;

    public putLong(String str, String str2, boolean z) {
        setUserId(str);
        setMissionId(str2);
        setWithMissionInfo(z);
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getMissionId() {
        return this.missionId;
    }

    public void setMissionId(String str) {
        this.missionId = str;
    }

    public boolean isWithMissionInfo() {
        return this.withMissionInfo;
    }

    public void setWithMissionInfo(boolean z) {
        this.withMissionInfo = z;
    }
}
