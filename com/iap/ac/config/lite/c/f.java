package com.iap.ac.config.lite.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import java.util.List;
import org.json.JSONObject;

public class f extends c<ISectionConfigListener> {
    static {
        e.b("SectionConfigListener");
    }

    public synchronized void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
        List<ISectionConfigListener> list = this.f9797a.get(str);
        if (list != null) {
            for (ISectionConfigListener onConfigChanged : list) {
                onConfigChanged.onConfigChanged(str, jSONObject, changedDetails);
            }
        }
    }
}
