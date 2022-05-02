package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.exoplayer2.C;

final class logChildren implements SensorEventListener {
    private int getMax = 0;
    private final setMax getMin;
    private int length = -1;
    private long setMax = -1;
    private final float[] setMin = new float[3];

    public interface setMax {
        void setMin();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public logChildren(setMax setmax) {
        this.getMin = setmax;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        int i = 0;
        while (i < 3) {
            float[] fArr2 = this.setMin;
            float f = i < fArr2.length ? fArr2[i] : 0.0f;
            this.setMin[i] = f + ((fArr[i] - f) * 0.7f);
            i++;
        }
        float[] fArr3 = this.setMin;
        int i2 = this.getMax;
        float f2 = (fArr3[0] * fArr3[0]) + (fArr3[1] * fArr3[1]) + (fArr3[2] * fArr3[2]);
        this.getMax = 0;
        if (fArr3[2] > 7.8f && fArr3[2] < 11.8f) {
            this.getMax = -1;
        }
        if (fArr3[2] < -7.8f && fArr3[2] > -11.8f) {
            this.getMax = 1;
        }
        if (f2 < 60.840004f || f2 > 139.24f) {
            this.getMax = 0;
        }
        if (i2 != this.getMax) {
            this.setMax = sensorEvent.timestamp;
        }
        long j = sensorEvent.timestamp - this.setMax;
        int i3 = this.getMax;
        if (i3 != -1) {
            if (i3 != 0) {
                if (i3 == 1 && j > 250000000 && this.length == 0) {
                    findOnePartiallyOrCompletelyInvisibleChild.getMax();
                    this.length = 1;
                }
            } else if (j > C.NANOS_PER_SECOND && this.length != 0) {
                findOnePartiallyOrCompletelyInvisibleChild.getMax();
                this.length = 0;
            }
        } else if (j > 250000000 && this.length == 1) {
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            this.length = 0;
            this.getMin.setMin();
        }
    }
}
