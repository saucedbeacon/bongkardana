package com.alibaba.griver.device.sensor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.device.adapter.Callback;

public class AccelerometerSensorService extends CompassSensorService {
    /* access modifiers changed from: protected */
    public void sendSensorResult(Callback callback, float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) Float.valueOf((-f) / 10.0f));
        jSONObject.put("y", (Object) Float.valueOf((-f2) / 10.0f));
        jSONObject.put("z", (Object) Float.valueOf((-f3) / 10.0f));
        callback.onTrigger(jSONObject, 1);
    }
}
