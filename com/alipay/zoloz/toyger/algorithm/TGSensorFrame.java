package com.alipay.zoloz.toyger.algorithm;

import java.util.Arrays;

public class TGSensorFrame {
    public float[] accelerateData;
    public float[] gyroData;
    public float[] rotationData;
    public long timeStamp;

    public TGSensorFrame(float[] fArr, float[] fArr2, float[] fArr3, long j) {
        this.gyroData = fArr;
        this.accelerateData = fArr2;
        this.rotationData = fArr3;
        this.timeStamp = j;
    }

    public TGSensorFrame(TGSensorFrame tGSensorFrame) {
        if (tGSensorFrame != null) {
            this.gyroData = tGSensorFrame.gyroData;
            this.accelerateData = tGSensorFrame.gyroData;
            this.rotationData = tGSensorFrame.rotationData;
            this.timeStamp = tGSensorFrame.timeStamp;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGSensorFrame{gyroData=");
        sb.append(Arrays.toString(this.gyroData));
        sb.append(", accelerateData=");
        sb.append(Arrays.toString(this.accelerateData));
        sb.append(", rotationData=");
        sb.append(Arrays.toString(this.rotationData));
        sb.append(", timeStamp=");
        sb.append(this.timeStamp);
        sb.append('}');
        return sb.toString();
    }
}
