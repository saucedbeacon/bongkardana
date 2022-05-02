package com.alibaba.griver.image.capture.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

@TargetApi(14)
public class OrientationDetector {

    /* renamed from: a  reason: collision with root package name */
    private static OrientationDetector f10459a;
    /* access modifiers changed from: private */
    public static int b;
    /* access modifiers changed from: private */
    public int c = 0;
    private OrientationListener d = null;

    interface OrientationListener {
        boolean isAvailable();

        void register();

        void unregister();
    }

    private OrientationDetector(Context context) {
        try {
            if (!isTablet(context)) {
                MySensorEventListener mySensorEventListener = new MySensorEventListener(context);
                this.d = mySensorEventListener;
                if (mySensorEventListener == null || !mySensorEventListener.isAvailable()) {
                    RVLogger.d("OrientationDetector", "MySensorEventListener not available.");
                    this.d = new MyOrientationEventListener(context);
                    return;
                }
                return;
            }
            this.d = new MyTabOrientationListener(context);
        } catch (Exception e) {
            RVLogger.e("OrientationDetector", "OrientationDetector constrcuction exception:", e);
        }
    }

    public static OrientationDetector getInstance(Context context) {
        if (context instanceof Activity) {
            b = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        }
        Context applicationContext = context.getApplicationContext();
        if (f10459a == null) {
            synchronized (OrientationDetector.class) {
                if (f10459a == null) {
                    f10459a = new OrientationDetector(applicationContext);
                }
            }
        }
        return f10459a;
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    public void register() {
        OrientationListener orientationListener = this.d;
        if (orientationListener != null) {
            orientationListener.register();
        }
    }

    public void unregister() {
        OrientationListener orientationListener = this.d;
        if (orientationListener != null) {
            orientationListener.unregister();
        }
    }

    public int getDevOrientation() {
        StringBuilder sb = new StringBuilder("getDevOrientation:");
        sb.append(this.c);
        RVLogger.d("OrientationDetector", sb.toString());
        return this.c;
    }

    class MyOrientationEventListener extends OrientationEventListener implements OrientationListener {
        public boolean isAvailable() {
            return true;
        }

        public MyOrientationEventListener(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            int i2;
            if (i == -1) {
                RVLogger.d("OrientationDetector", "ORIENTATION_UNKNOWN");
                return;
            }
            if (i > 340 || i < 20) {
                i2 = 0;
            } else if (i > 70 && i < 110) {
                i2 = 90;
            } else if (i > 160 && i < 200) {
                i2 = 180;
            } else if (i > 250 && i < 290) {
                i2 = 270;
            } else {
                return;
            }
            if (i2 != OrientationDetector.this.c) {
                RVLogger.d("OrientationDetector", "old phone onOrientationChanged:".concat(String.valueOf(i2)));
            }
            int unused = OrientationDetector.this.c = i2;
        }

        public void register() {
            enable();
        }

        public void unregister() {
            disable();
        }
    }

    class MySensorEventListener implements OrientationListener {

        /* renamed from: a  reason: collision with root package name */
        private Sensor f10460a;
        private Sensor b;
        /* access modifiers changed from: private */
        public float[] c = new float[3];
        /* access modifiers changed from: private */
        public float[] d = new float[3];
        private SensorManager e;
        final SensorEventListener mEventListener = new SensorEventListener() {
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent.sensor.getType() == 2) {
                    float[] unused = MySensorEventListener.this.d = sensorEvent.values;
                }
                if (sensorEvent.sensor.getType() == 1) {
                    float[] unused2 = MySensorEventListener.this.c = sensorEvent.values;
                }
                MySensorEventListener.this.a();
            }
        };

        public MySensorEventListener(Context context) {
            SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
            this.e = sensorManager;
            this.f10460a = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor = this.e.getDefaultSensor(2);
            this.b = defaultSensor;
            if (this.f10460a == null || defaultSensor == null) {
                RVLogger.e("OrientationDetector", "get mMSensor or mASensor failed!");
            }
            RVLogger.d("OrientationDetector", "MySensorEventListener constructed.");
        }

        /* access modifiers changed from: private */
        public void a() {
            float[] fArr = new float[3];
            float[] fArr2 = new float[9];
            SensorManager.getRotationMatrix(fArr2, (float[]) null, this.c, this.d);
            SensorManager.getOrientation(fArr2, fArr);
            float degrees = (float) Math.toDegrees((double) fArr[1]);
            float degrees2 = (float) Math.toDegrees((double) fArr[2]);
            int access$000 = OrientationDetector.this.c;
            if (degrees < -30.0f && degrees > -150.0f) {
                access$000 = 0;
            } else if (degrees > 30.0f && degrees < 150.0f) {
                access$000 = 180;
            } else if (degrees2 > 30.0f) {
                access$000 = 90;
            } else if (degrees2 < -30.0f) {
                access$000 = 270;
            }
            if (access$000 != OrientationDetector.this.c) {
                RVLogger.d("OrientationDetector", "phone orientation changed to ".concat(String.valueOf(access$000)));
            }
            int unused = OrientationDetector.this.c = access$000;
        }

        public void register() {
            if (!this.e.registerListener(this.mEventListener, this.f10460a, 3)) {
                RVLogger.e("OrientationDetector", "registerListener mASensor failed!");
            }
            if (!this.e.registerListener(this.mEventListener, this.b, 3)) {
                RVLogger.e("OrientationDetector", "registerListener mMSensor failed!");
            }
        }

        public void unregister() {
            try {
                if (this.f10460a != null && this.b != null) {
                    this.e.unregisterListener(this.mEventListener);
                    RVLogger.d("OrientationDetector", "OrientationDetector unregister.");
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("unregister exp=");
                sb.append(e2.toString());
                RVLogger.d("OrientationDetector", sb.toString());
            }
        }

        public boolean isAvailable() {
            return (this.f10460a == null || this.b == null) ? false : true;
        }
    }

    class MyTabOrientationListener implements OrientationListener {

        /* renamed from: a  reason: collision with root package name */
        private Sensor f10461a;
        /* access modifiers changed from: private */
        public float[] b = new float[3];
        private SensorManager c;
        final SensorEventListener mEventListener = new SensorEventListener() {
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent.sensor.getType() == 3) {
                    float[] unused = MyTabOrientationListener.this.b = sensorEvent.values;
                    MyTabOrientationListener.this.a();
                }
            }
        };

        public boolean isAvailable() {
            return true;
        }

        public MyTabOrientationListener(Context context) {
            SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
            this.c = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(3);
            this.f10461a = defaultSensor;
            if (defaultSensor == null) {
                RVLogger.e("OrientationDetector", "get mSensor failed!");
            }
            RVLogger.d("OrientationDetector", "MyTabOrientationListener constructed.");
        }

        /* access modifiers changed from: private */
        public void a() {
            float f;
            float[] fArr = this.b;
            float f2 = fArr[1];
            float f3 = fArr[2];
            int access$600 = OrientationDetector.b;
            if (access$600 != 0) {
                if (access$600 == 1) {
                    float[] fArr2 = this.b;
                    f2 = fArr2[2];
                    f = fArr2[1];
                } else if (access$600 == 2) {
                    float[] fArr3 = this.b;
                    f2 = -fArr3[2];
                    f = fArr3[1];
                } else if (access$600 == 3) {
                    float[] fArr4 = this.b;
                    f2 = -fArr4[2];
                    f3 = fArr4[1];
                }
                f3 = -f;
            } else {
                float[] fArr5 = this.b;
                f2 = fArr5[1];
                f3 = fArr5[2];
            }
            int access$000 = OrientationDetector.this.c;
            if (f2 > 30.0f) {
                access$000 = 0;
            } else if (f2 < -30.0f) {
                access$000 = 180;
            } else if (f3 < -30.0f) {
                access$000 = 270;
            } else if (f3 > 30.0f) {
                access$000 = 90;
            }
            if (access$000 != OrientationDetector.this.c) {
                RVLogger.d("OrientationDetector", "tablet orientation changed to ".concat(String.valueOf(access$000)));
            }
            int unused = OrientationDetector.this.c = access$000;
        }

        public void register() {
            if (!this.c.registerListener(this.mEventListener, this.f10461a, 3)) {
                RVLogger.e("OrientationDetector", "registerListener mSensor failed!");
            }
        }

        public void unregister() {
            if (this.f10461a != null) {
                this.c.unregisterListener(this.mEventListener);
                RVLogger.d("OrientationDetector", "OrientationDetector unregister.");
            }
        }
    }
}
