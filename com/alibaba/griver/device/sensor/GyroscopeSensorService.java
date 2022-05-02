package com.alibaba.griver.device.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.device.adapter.Callback;

public class GyroscopeSensorService extends SensorService {

    /* renamed from: a  reason: collision with root package name */
    private SensorEventListener f10431a = new SensorChangedListener();
    private SensorEventListener b = new SensorChangedListener();
    private SensorEventListener c = new SensorChangedListener();
    /* access modifiers changed from: private */
    public float[] d;
    /* access modifiers changed from: private */
    public float[] e;
    /* access modifiers changed from: private */
    public float[] f;
    private volatile int g = 50;
    private long h = System.currentTimeMillis();
    private Callback i;
    private Context j;
    private float k;
    private boolean l;

    public void onCreate(Context context, JSONObject jSONObject) {
        this.j = context;
        this.k = CommonUtils.getFloat(jSONObject, "interval", 0.5f);
    }

    public void register(Callback callback) {
        if (!this.l) {
            int i2 = 1;
            this.l = true;
            SensorManager sensorManager = (SensorManager) this.j.getSystemService("sensor");
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
                this.i = callback;
                this.g = 50;
                float f2 = this.k;
                if (f2 != 0.0f) {
                    this.g = (int) (f2 * 1000.0f);
                }
                if ((this.g < 0 || this.g >= 20) && (this.g < 20 || this.g >= 60)) {
                    i2 = (this.g < 60 || this.g >= 200) ? 3 : 2;
                }
                sensorManager.registerListener(this.f10431a, defaultSensor, i2);
                sensorManager.registerListener(this.b, defaultSensor2, i2);
                sensorManager.registerListener(this.c, defaultSensor3, i2);
            }
        }
    }

    public void unregister() {
        if (this.l) {
            this.l = false;
            SensorManager sensorManager = (SensorManager) this.j.getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f10431a);
                sensorManager.unregisterListener(this.b);
                sensorManager.unregisterListener(this.c);
            }
        }
    }

    public void onDestroy() {
        this.j = null;
        this.i = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.d != null && this.e != null && this.f != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.h >= ((long) this.g)) {
                this.h = currentTimeMillis;
                float[] fArr = this.f;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                if (this.i != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (Object) Float.valueOf(f2));
                    jSONObject.put("y", (Object) Float.valueOf(f3));
                    jSONObject.put("z", (Object) Float.valueOf(f4));
                    this.i.onTrigger(jSONObject, 4);
                }
            }
        }
    }

    class SensorChangedListener implements SensorEventListener {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        private SensorChangedListener() {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent != null && sensorEvent.values != null && sensorEvent.sensor != null) {
                int type = sensorEvent.sensor.getType();
                if (type == 1) {
                    float[] unused = GyroscopeSensorService.this.d = sensorEvent.values;
                } else if (type == 2) {
                    float[] unused2 = GyroscopeSensorService.this.e = sensorEvent.values;
                } else if (type == 4) {
                    float[] unused3 = GyroscopeSensorService.this.f = sensorEvent.values;
                }
                GyroscopeSensorService.this.a();
            }
        }
    }
}
