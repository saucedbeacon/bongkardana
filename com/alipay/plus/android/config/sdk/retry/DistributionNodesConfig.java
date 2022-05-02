package com.alipay.plus.android.config.sdk.retry;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.List;

public class DistributionNodesConfig implements Serializable {
    public long configVersion;
    @Nullable
    public List<DistributionNode> distributionNodes;

    public DistributionNodesConfig() {
    }

    public DistributionNodesConfig(long j, @Nullable List<DistributionNode> list) {
        this.configVersion = j;
        this.distributionNodes = list;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}
