package com.alibaba.griver.device.jsapi.sensor;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.device.adapter.Callback;
import com.alibaba.griver.device.sensor.AccelerometerForH5SensorService;
import com.alibaba.griver.device.sensor.AccelerometerSensorService;
import com.alibaba.griver.device.sensor.CompassSensorService;
import com.alibaba.griver.device.sensor.GyroscopeSensorService;
import com.alibaba.griver.device.sensor.SensorService;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SensorServiceManager extends SensorService {
    public static final int TYPE_ACCELEROMETER_FOR_H5 = -10;

    /* renamed from: a  reason: collision with root package name */
    private SensorService f9086a;
    private SensorService b;
    private SensorService c;
    private SensorService d;

    @Deprecated
    public void onCreate(Context context, JSONObject jSONObject) {
    }

    @Deprecated
    public void register(Callback callback) {
    }

    public void registerSensor(int i, Callback callback) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(543372955, oncanceled);
            onCancelLoad.getMin(543372955, oncanceled);
        }
        SensorService a2 = a(i);
        if (a2 != null) {
            a2.register(callback);
        }
    }

    private SensorService a(int i) {
        if (i == -10) {
            return this.d;
        }
        if (i == 4) {
            return this.f9086a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return null;
        }
        return this.c;
    }

    public void unregister(int i) {
        SensorService sensorService;
        if (i == -10) {
            SensorService sensorService2 = this.d;
            if (sensorService2 != null) {
                sensorService2.unregister();
            }
        } else if (i == 4) {
            SensorService sensorService3 = this.f9086a;
            if (sensorService3 != null) {
                sensorService3.unregister();
            }
        } else if (i == 1) {
            SensorService sensorService4 = this.b;
            if (sensorService4 != null) {
                sensorService4.unregister();
            }
        } else if (i == 2 && (sensorService = this.c) != null) {
            sensorService.unregister();
        }
    }

    public SensorService create(int i, Context context, JSONObject jSONObject) {
        SensorService sensorService;
        if (i == -10) {
            if (this.d == null) {
                this.d = new AccelerometerForH5SensorService();
            }
            sensorService = this.d;
        } else if (i == 4) {
            if (this.f9086a == null) {
                this.f9086a = new GyroscopeSensorService();
            }
            sensorService = this.f9086a;
        } else if (i == 1) {
            if (this.b == null) {
                this.b = new AccelerometerSensorService();
            }
            sensorService = this.b;
        } else if (i != 2) {
            sensorService = null;
        } else {
            if (this.c == null) {
                this.c = new CompassSensorService();
            }
            sensorService = this.c;
        }
        sensorService.create(context, jSONObject);
        return sensorService;
    }

    public void unregister() {
        unregister(1);
        unregister(4);
        unregister(2);
        unregister(-10);
    }

    public void destroy() {
        unregister();
        onDestroy();
    }

    public void onDestroy() {
        this.d = null;
        this.c = null;
        this.b = null;
        this.f9086a = null;
    }
}
