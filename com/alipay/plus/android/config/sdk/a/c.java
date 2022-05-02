package com.alipay.plus.android.config.sdk.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class c<Listener> {

    /* renamed from: a  reason: collision with root package name */
    protected Map<String, List<Listener>> f9511a = new HashMap();

    public synchronized void a() {
        this.f9511a.clear();
    }

    public synchronized void a(@Nullable Listener listener) {
        if (listener != null) {
            for (List<Listener> remove : this.f9511a.values()) {
                remove.remove(listener);
            }
        }
    }

    public abstract void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);

    public synchronized void a(@NonNull String str, @Nullable Listener listener) {
        if (listener != null) {
            List list = this.f9511a.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f9511a.put(str, list);
            }
            list.add(listener);
        }
    }
}
