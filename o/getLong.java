package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;

public class getLong extends BaseRpcResult {
    private getClassLoader missionInfo;
    private List<DefaultClassLoaderFactory> questInfoList;

    public List<DefaultClassLoaderFactory> getQuestInfoList() {
        return this.questInfoList;
    }

    public void setQuestInfoList(List<DefaultClassLoaderFactory> list) {
        this.questInfoList = list;
    }

    public getClassLoader getMissionInfo() {
        return this.missionInfo;
    }

    public void setMissionInfo(getClassLoader getclassloader) {
        this.missionInfo = getclassloader;
    }
}
