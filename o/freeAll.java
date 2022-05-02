package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;

public class freeAll extends BaseRpcResult {
    private List<getClassLoader> missionInfoList;

    public List<getClassLoader> getMissionInfoList() {
        List<getClassLoader> list = this.missionInfoList;
        return list != null ? list : new ArrayList();
    }

    public void setMissionInfoList(List<getClassLoader> list) {
        this.missionInfoList = list;
    }
}
