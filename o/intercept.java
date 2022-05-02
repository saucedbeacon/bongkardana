package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class intercept extends BaseRpcResult {
    private String activityId;

    public String getActivityId() {
        return this.activityId;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }
}
