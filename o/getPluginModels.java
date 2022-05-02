package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.Collections;
import java.util.List;

public class getPluginModels extends BaseRpcResult {
    private List<setValidDomains> configs;
    private String etag;

    public getPluginModels() {
        this.configs = Collections.emptyList();
        this.etag = "";
    }

    public getPluginModels(List<setValidDomains> list, String str, boolean z) {
        this.configs = list;
        this.etag = str;
        this.success = z;
    }

    public static getPluginModels empty() {
        return new getPluginModels(Collections.emptyList(), "", false);
    }

    public boolean isEmpty() {
        List<setValidDomains> list = this.configs;
        return list == null || list.isEmpty();
    }

    public List<setValidDomains> getConfigs() {
        return this.configs;
    }

    public void setConfigs(List<setValidDomains> list) {
        this.configs = list;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String str) {
        this.etag = str;
    }
}
