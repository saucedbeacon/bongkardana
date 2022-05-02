package com.alibaba.griver.device.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.device.adapter.Callback;

public class CompassSensorService extends SensorService {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile float f10430a;
    /* access modifiers changed from: private */
    public Long b = Long.valueOf(System.currentTimeMillis());
    /* access modifiers changed from: private */
    public float[] c;
    /* access modifiers changed from: private */
    public float[] d;
    /* access modifiers changed from: private */
    public Callback e;
    private Context f;
    private boolean g;
    private SensorEventListener h = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent != null && sensorEvent.values != null && sensorEvent.sensor != null) {
                int type = sensorEvent.sensor.getType();
                if ((type == 2 || type == 1) && ((float) (System.currentTimeMillis() - CompassSensorService.this.b.longValue())) > CompassSensorService.this.f10430a) {
                    Long unused = CompassSensorService.this.b = Long.valueOf(System.currentTimeMillis());
                    if (type == 2) {
                        try {
                            float[] unused2 = CompassSensorService.this.c = sensorEvent.values;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    if (type == 1) {
                        float[] unused4 = CompassSensorService.this.d = sensorEvent.values;
                    }
                    if (CompassSensorService.this.e != null && CompassSensorService.this.c != null) {
                        if (CompassSensorService.this.d != null) {
                            CompassSensorService.this.sendSensorResult(CompassSensorService.this.e, CompassSensorService.this.c, CompassSensorService.this.d);
                        }
                    }
                }
            }
        }
    };

    public void onCreate(Context context, JSONObject jSONObject) {
        this.f = context;
        this.f10430a = CommonUtils.getFloat(jSONObject, "interval", 100.0f);
    }

    public void register(Callback callback) {
        if (!this.g) {
            this.g = true;
            this.e = callback;
            SensorManager sensorManager = (SensorManager) this.f.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(2);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
            sensorManager.registerListener(this.h, defaultSensor, 3);
            sensorManager.registerListener(this.h, defaultSensor2, 3);
        }
    }

    public void unregister() {
        if (this.g) {
            this.g = false;
            ((SensorManager) this.f.getSystemService("sensor")).unregisterListener(this.h);
        }
    }

    public void onDestroy() {
        this.h = null;
        this.e = null;
        this.f = null;
    }

    /* access modifiers changed from: protected */
    public void sendSensorResult(Callback callback, float[] fArr, float[] fArr2) {
        JSONObject jSONObject = new JSONObject();
        float[] fArr3 = new float[3];
        float[] fArr4 = new float[9];
        SensorManager.getRotationMatrix(fArr4, (float[]) null, fArr2, fArr);
        SensorManager.getOrientation(fArr4, fArr3);
        fArr3[0] = (float) Math.toDegrees((double) fArr3[0]);
        jSONObject.put("direction", (Object) Integer.valueOf((int) ((fArr3[0] + 360.0f) % 360.0f)));
        callback.onTrigger(jSONObject, 2);
    }
}
