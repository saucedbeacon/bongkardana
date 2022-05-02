package com.alipay.plus.android.config.sdk.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ISectionConfigListener;
import java.util.List;

public class f extends c<ISectionConfigListener> {
    private static final String b = e.a("SectionConfigListener");

    public synchronized void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
        List<ISectionConfigListener> list = (List) this.f9511a.get(str);
        if (list != null) {
            for (ISectionConfigListener onConfigChanged : list) {
                onConfigChanged.onConfigChanged(str, jSONObject, changedDetails);
            }
        }
    }
}
