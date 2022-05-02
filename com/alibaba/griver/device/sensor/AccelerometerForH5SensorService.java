package com.alibaba.griver.device.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.device.adapter.Callback;
import com.alibaba.wireless.security.SecExceptionCode;

public class AccelerometerForH5SensorService extends SensorService {

    /* renamed from: a  reason: collision with root package name */
    private Context f10429a;
    /* access modifiers changed from: private */
    public float b;
    /* access modifiers changed from: private */
    public int c;
    /* access modifiers changed from: private */
    public int d;
    /* access modifiers changed from: private */
    public Callback e;
    /* access modifiers changed from: private */
    public long f;
    /* access modifiers changed from: private */
    public int g = 0;
    /* access modifiers changed from: private */
    public float h;
    /* access modifiers changed from: private */
    public float i;
    /* access modifiers changed from: private */
    public float j;
    private boolean k;
    private SensorEventListener l = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            long currentTimeMillis = System.currentTimeMillis();
            long access$000 = currentTimeMillis - AccelerometerForH5SensorService.this.f;
            if (((float) access$000) >= AccelerometerForH5SensorService.this.b) {
                long unused = AccelerometerForH5SensorService.this.f = currentTimeMillis;
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                float access$200 = f - AccelerometerForH5SensorService.this.h;
                float access$300 = f2 - AccelerometerForH5SensorService.this.i;
                float access$400 = f3 - AccelerometerForH5SensorService.this.j;
                float unused2 = AccelerometerForH5SensorService.this.h = f;
                float unused3 = AccelerometerForH5SensorService.this.i = f2;
                float unused4 = AccelerometerForH5SensorService.this.j = f3;
                double sqrt = Math.sqrt((double) ((access$200 * access$200) + (access$300 * access$300) + (access$400 * access$400)));
                double d = (double) access$000;
                Double.isNaN(d);
                if ((sqrt / d) * 10000.0d >= ((double) AccelerometerForH5SensorService.this.c)) {
                    if (AccelerometerForH5SensorService.this.g < AccelerometerForH5SensorService.this.d) {
                        AccelerometerForH5SensorService.access$608(AccelerometerForH5SensorService.this);
                        return;
                    }
                    int unused5 = AccelerometerForH5SensorService.this.g = 0;
                    AccelerometerForH5SensorService.this.unregister();
                    AccelerometerForH5SensorService.this.e.onTrigger((JSONObject) null, 0);
                }
            }
        }
    };

    static /* synthetic */ int access$608(AccelerometerForH5SensorService accelerometerForH5SensorService) {
        int i2 = accelerometerForH5SensorService.g;
        accelerometerForH5SensorService.g = i2 + 1;
        return i2;
    }

    public void onCreate(Context context, JSONObject jSONObject) {
        this.f10429a = context;
        this.b = CommonUtils.getFloat(jSONObject, "interval", 100.0f);
        this.c = CommonUtils.getInt(jSONObject, "speedThreshold", SecExceptionCode.SEC_ERROR_OPENSDK);
        this.d = CommonUtils.getInt(jSONObject, "countsLimited", 2);
    }

    public void register(Callback callback) {
        if (!this.k) {
            this.k = true;
            this.e = callback;
            SensorManager sensorManager = (SensorManager) this.f10429a.getSystemService("sensor");
            sensorManager.registerListener(this.l, sensorManager.getDefaultSensor(1), 3);
        }
    }

    public void unregister() {
        if (this.k) {
            this.k = false;
            ((SensorManager) this.f10429a.getSystemService("sensor")).unregisterListener(this.l);
        }
    }

    public void onDestroy() {
        this.f10429a = null;
        this.e = null;
        this.l = null;
    }
}
