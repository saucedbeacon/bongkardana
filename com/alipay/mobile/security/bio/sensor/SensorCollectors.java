package com.alipay.mobile.security.bio.sensor;

import android.content.Context;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

public class SensorCollectors {
    private static final int MAX_SENSOR_ITEM_CNT = 100;
    SensorType[] allSensors = {SensorType.ACCELEROMETER, SensorType.MAGNETIC, SensorType.GYROSCOPE};
    private List<SensorCollectWorker> sensorCollectWorkers = new ArrayList();

    public enum SensorType {
        ACCELEROMETER(1, "Acceleration"),
        GYROSCOPE(4, "Gyroscope"),
        MAGNETIC(2, "Magnetic");
        
        private String mSensorName;
        private int mSensorType;

        private SensorType(int i, String str) {
            this.mSensorName = str;
            this.mSensorType = i;
        }

        public final String getSensorName() {
            return this.mSensorName;
        }

        public final int getmSensorType() {
            return this.mSensorType;
        }
    }

    public SensorCollectors(Context context) {
        reset(context);
    }

    public void reset(Context context) {
        if (context != null) {
            try {
                this.sensorCollectWorkers.clear();
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                for (SensorType sensorCollectWorker : this.allSensors) {
                    this.sensorCollectWorkers.add(new SensorCollectWorker(sensorManager, sensorCollectWorker, 100));
                }
            } catch (Exception unused) {
            }
        }
    }

    public void startListening() {
        for (SensorCollectWorker start : this.sensorCollectWorkers) {
            start.start();
        }
    }

    public void destroy() {
        for (SensorCollectWorker destory : this.sensorCollectWorkers) {
            destory.destory();
        }
    }

    public SensorData getData() {
        SensorData sensorData = new SensorData();
        List<SensorCollectWorker> list = this.sensorCollectWorkers;
        if (list != null) {
            for (SensorCollectWorker next : list) {
                if (next != null) {
                    String resultData = next.getResultData();
                    if (next.getType() == 1) {
                        sensorData.accelermeter = resultData;
                    }
                    if (next.getType() == 2) {
                        sensorData.magmetic = resultData;
                    }
                    if (next.getType() == 4) {
                        sensorData.gyrometer = resultData;
                    }
                }
            }
        }
        return sensorData;
    }
}
