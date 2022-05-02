package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class y implements SensorEventListener {

    /* renamed from: ʽ  reason: contains not printable characters */
    private final int f8810;

    /* renamed from: ˊ  reason: contains not printable characters */
    private final float[][] f8811 = new float[2][];
    @NonNull

    /* renamed from: ˋ  reason: contains not printable characters */
    private final String f8812;

    /* renamed from: ˎ  reason: contains not printable characters */
    private final long[] f8813 = new long[2];
    @NonNull

    /* renamed from: ˏ  reason: contains not printable characters */
    private final String f8814;

    /* renamed from: ॱ  reason: contains not printable characters */
    private final int f8815;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private double f8816;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private long f8817;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    y(int i, @Nullable String str, @Nullable String str2) {
        this.f8815 = i;
        this.f8814 = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f8812 = str2;
        this.f8810 = ((((i + 31) * 31) + this.f8814.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private static double m1300(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    @NonNull
    /* renamed from: ˊ  reason: contains not printable characters */
    private static List<Float> m1298(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null) {
            Sensor sensor = sensorEvent.sensor;
            if ((sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (m1299(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[][] fArr2 = this.f8811;
                    float[] fArr3 = fArr2[0];
                    if (fArr3 == null) {
                        fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f8813[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr4 = fArr2[1];
                    if (fArr4 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        this.f8811[1] = copyOf;
                        this.f8813[1] = currentTimeMillis;
                        this.f8816 = m1300(fArr3, copyOf);
                    } else if (50000000 <= j - this.f8817) {
                        this.f8817 = j;
                        if (Arrays.equals(fArr4, fArr)) {
                            this.f8813[1] = currentTimeMillis;
                            return;
                        }
                        double r0 = m1300(fArr3, fArr);
                        if (r0 > this.f8816) {
                            this.f8811[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f8813[1] = currentTimeMillis;
                            this.f8816 = r0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private boolean m1299(int i, @NonNull String str, @NonNull String str2) {
        return this.f8815 == i && this.f8814.equals(str) && this.f8812.equals(str2);
    }

    @NonNull
    /* renamed from: ॱ  reason: contains not printable characters */
    private Map<String, Object> m1301() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f8815));
        concurrentHashMap.put("sN", this.f8814);
        concurrentHashMap.put("sV", this.f8812);
        float[] fArr = this.f8811[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", m1298(fArr));
        }
        float[] fArr2 = this.f8811[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", m1298(fArr2));
        }
        return concurrentHashMap;
    }

    public final int hashCode() {
        return this.f8810;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return m1299(yVar.f8815, yVar.f8814, yVar.f8812);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˋ  reason: contains not printable characters */
    public final void m1302(@NonNull Map<y, Map<String, Object>> map, boolean z) {
        if (this.f8811[0] != null) {
            map.put(this, m1301());
            if (z) {
                for (int i = 0; i < 2; i++) {
                    this.f8811[i] = null;
                }
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f8813[i2] = 0;
                }
                this.f8816 = 0.0d;
                this.f8817 = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m1301());
        }
    }
}
