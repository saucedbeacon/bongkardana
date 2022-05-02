package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.io.Serializable;

public class Pool extends BaseRpcRequest implements Serializable {
    private String missionId;
    private String questId;
    private String userId;

    public class Poolable extends BaseRpcResult {
        private String questRedirectType;
        private String questRedirectValue;
        private boolean redeemResult;
        private boolean trackResult;

        public String getQuestRedirectType() {
            return this.questRedirectType;
        }

        public void setQuestRedirectType(String str) {
            this.questRedirectType = str;
        }

        public String getQuestRedirectValue() {
            return this.questRedirectValue;
        }

        public void setQuestRedirectValue(String str) {
            this.questRedirectValue = str;
        }

        public boolean isRedeemResult() {
            return this.redeemResult;
        }

        public void setRedeemResult(boolean z) {
            this.redeemResult = z;
        }

        public boolean isTrackResult() {
            return this.trackResult;
        }

        public void setTrackResult(boolean z) {
            this.trackResult = z;
        }
    }

    public Pool(String str, String str2, String str3) {
        setMissionId(str);
        setQuestId(str2);
        setUserId(str3);
    }

    public String getMissionId() {
        return this.missionId;
    }

    public void setMissionId(String str) {
        this.missionId = str;
    }

    public String getQuestId() {
        return this.questId;
    }

    public void setQuestId(String str) {
        this.questId = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
