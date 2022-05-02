package com.alibaba.griver.device.sensor;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.device.adapter.Callback;
import com.alibaba.griver.device.adapter.LifeCycle;

public abstract class SensorService implements LifeCycle {
    public abstract void register(Callback callback);

    public abstract void unregister();

    public void create(Context context, JSONObject jSONObject) {
        onCreate(context, jSONObject);
    }

    public void destroy() {
        unregister();
        onDestroy();
    }
}
