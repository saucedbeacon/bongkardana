package com.alipay.plus.android.config.sdk.retry;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.io.Serializable;

public class DistributionNode implements Serializable {
    public String configName;
    @Nullable
    public JSONObject extras;
    @Nullable
    public Integer rate;
    public a type;
    public String url;

    public enum a {
        GRAYSCALE,
        MDS,
        ALICLOUD;

        public static boolean isRpcNode(@Nullable a aVar) {
            if (aVar == null) {
                return false;
            }
            return aVar == MDS || aVar == GRAYSCALE;
        }
    }

    public DistributionNode() {
    }

    public DistributionNode(@NonNull a aVar, @NonNull String str, @NonNull String str2, @Nullable Integer num) {
        this.type = aVar;
        this.url = str;
        this.configName = str2;
        this.rate = num;
    }

    public boolean isSameNode(@NonNull DistributionNode distributionNode) {
        if (this == distributionNode) {
            return true;
        }
        return TextUtils.equals(this.url, distributionNode.url) && TextUtils.equals(this.configName, distributionNode.configName);
    }

    public String toString() {
        return ConfigUtils.toJSONString(this);
    }
}
