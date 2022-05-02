package com.iap.ac.config.lite.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class c<Listener> {

    /* renamed from: a  reason: collision with root package name */
    protected Map<String, List<Listener>> f9797a = new HashMap();

    public synchronized void a(@NonNull String str, @Nullable Listener listener) {
        if (listener != null) {
            List list = this.f9797a.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f9797a.put(str, list);
            }
            list.add(listener);
        }
    }

    public abstract void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails);

    public synchronized void a(@Nullable Listener listener) {
        if (listener != null) {
            for (List<Listener> remove : this.f9797a.values()) {
                remove.remove(listener);
            }
        }
    }

    public synchronized void a() {
        this.f9797a.clear();
    }
}
