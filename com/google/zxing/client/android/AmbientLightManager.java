package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import o.Lifecycle$Event;
import o.calculateExtraLayoutSpace;

public final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 450.0f;
    private static final float TOO_DARK_LUX = 45.0f;
    private calculateExtraLayoutSpace cameraManager;
    private CameraSettings cameraSettings;
    private Context context;
    private Handler handler = new Handler();
    private Sensor lightSensor;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AmbientLightManager(Context context2, calculateExtraLayoutSpace calculateextralayoutspace, CameraSettings cameraSettings2) {
        this.context = context2;
        this.cameraManager = calculateextralayoutspace;
        this.cameraSettings = cameraSettings2;
    }

    public final void start() {
        if (this.cameraSettings.IsOverlapping()) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.lightSensor = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public final void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService("sensor")).unregisterListener(this);
            this.lightSensor = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setTorch$0(boolean z) {
        this.cameraManager.length(z);
    }

    private void setTorch(boolean z) {
        this.handler.post(new Lifecycle$Event(this, z));
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.cameraManager == null) {
            return;
        }
        if (f <= TOO_DARK_LUX) {
            setTorch(true);
        } else if (f >= BRIGHT_ENOUGH_LUX) {
            setTorch(false);
        }
    }
}
