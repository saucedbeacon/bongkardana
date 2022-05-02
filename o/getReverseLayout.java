package o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import com.google.zxing.client.android.AmbientLightManager;
import com.google.zxing.client.android.R;
import com.google.zxing.client.android.camera.open.OpenCameraInterface;
import com.journeyapps.barcodescanner.camera.CameraSettings;

public class getReverseLayout {
    /* access modifiers changed from: private */
    public static final String hashCode = getReverseLayout.class.getSimpleName();
    public boolean IsOverlapping = false;
    public CameraSettings equals = new CameraSettings();
    public onLayoutChildren getMax;
    public calculateExtraLayoutSpace getMin;
    public Runnable isInside = new Runnable() {
        public final void run() {
            try {
                String unused = getReverseLayout.hashCode;
                calculateExtraLayoutSpace length = getReverseLayout.this.getMin;
                length.setMax = OpenCameraInterface.open(length.IsOverlapping.setMax);
                if (length.setMax != null) {
                    int cameraId = OpenCameraInterface.getCameraId(length.IsOverlapping.setMax);
                    length.length = new Camera.CameraInfo();
                    Camera.getCameraInfo(cameraId, length.length);
                    return;
                }
                throw new RuntimeException("Failed to open camera");
            } catch (Exception e) {
                getReverseLayout.getMax(getReverseLayout.this, e);
                String unused2 = getReverseLayout.hashCode;
            }
        }
    };
    public onLayoutCompleted length;
    public computeScrollVectorForPosition setMax;
    public Handler setMin;
    private Runnable toDoubleRange = new Runnable() {
        public final void run() {
            try {
                String unused = getReverseLayout.hashCode;
                calculateExtraLayoutSpace length = getReverseLayout.this.getMin;
                computeScrollVectorForPosition max = getReverseLayout.this.setMax;
                Camera camera = length.setMax;
                if (max.setMin != null) {
                    camera.setPreviewDisplay(max.setMin);
                } else {
                    camera.setPreviewTexture(max.setMax);
                }
                calculateExtraLayoutSpace length2 = getReverseLayout.this.getMin;
                Camera camera2 = length2.setMax;
                if (camera2 != null && !length2.setMin) {
                    camera2.startPreview();
                    length2.setMin = true;
                    length2.getMax = new canScrollVertically(length2.setMax, length2.IsOverlapping);
                    length2.getMin = new AmbientLightManager(length2.values, length2, length2.IsOverlapping);
                    length2.getMin.start();
                }
            } catch (Exception e) {
                getReverseLayout.getMax(getReverseLayout.this, e);
                String unused2 = getReverseLayout.hashCode;
            }
        }
    };
    public Handler toFloatRange;
    public boolean toIntRange = true;
    public Runnable toString = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(17:3|4|5|(13:(2:8|(2:10|(1:13))(1:14))(1:15)|16|(1:18)(1:19)|20|21|22|23|24|25|26|(1:28)(1:29)|30|(2:32|38)(1:39))|12|16|(0)(0)|20|21|22|23|24|25|26|(0)(0)|30|(0)(0)) */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0052 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x002d A[Catch:{ Exception -> 0x004b }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ Exception -> 0x004b }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x009a }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[Catch:{ Exception -> 0x009a }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[Catch:{ Exception -> 0x009a }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[Catch:{ Exception -> 0x009a }, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                java.lang.String unused = o.getReverseLayout.hashCode     // Catch:{ Exception -> 0x009a }
                o.getReverseLayout r0 = o.getReverseLayout.this     // Catch:{ Exception -> 0x009a }
                o.calculateExtraLayoutSpace r0 = r0.getMin     // Catch:{ Exception -> 0x009a }
                android.hardware.Camera r1 = r0.setMax     // Catch:{ Exception -> 0x009a }
                if (r1 == 0) goto L_0x0092
                r1 = 1
                r2 = 0
                o.onLayoutCompleted r3 = r0.toIntRange     // Catch:{ Exception -> 0x004b }
                int r3 = r3.setMax     // Catch:{ Exception -> 0x004b }
                if (r3 == 0) goto L_0x001d
                if (r3 == r1) goto L_0x0025
                r4 = 2
                if (r3 == r4) goto L_0x0022
                r4 = 3
                if (r3 == r4) goto L_0x001f
            L_0x001d:
                r3 = 0
                goto L_0x0027
            L_0x001f:
                r3 = 270(0x10e, float:3.78E-43)
                goto L_0x0027
            L_0x0022:
                r3 = 180(0xb4, float:2.52E-43)
                goto L_0x0027
            L_0x0025:
                r3 = 90
            L_0x0027:
                android.hardware.Camera$CameraInfo r4 = r0.length     // Catch:{ Exception -> 0x004b }
                int r4 = r4.facing     // Catch:{ Exception -> 0x004b }
                if (r4 != r1) goto L_0x0039
                android.hardware.Camera$CameraInfo r4 = r0.length     // Catch:{ Exception -> 0x004b }
                int r4 = r4.orientation     // Catch:{ Exception -> 0x004b }
                int r4 = r4 + r3
                int r4 = r4 % 360
                int r3 = 360 - r4
                int r3 = r3 % 360
                goto L_0x0042
            L_0x0039:
                android.hardware.Camera$CameraInfo r4 = r0.length     // Catch:{ Exception -> 0x004b }
                int r4 = r4.orientation     // Catch:{ Exception -> 0x004b }
                int r4 = r4 - r3
                int r4 = r4 + 360
                int r3 = r4 % 360
            L_0x0042:
                r0.toFloatRange = r3     // Catch:{ Exception -> 0x004b }
                int r3 = r0.toFloatRange     // Catch:{ Exception -> 0x004b }
                android.hardware.Camera r4 = r0.setMax     // Catch:{ Exception -> 0x004b }
                r4.setDisplayOrientation(r3)     // Catch:{ Exception -> 0x004b }
            L_0x004b:
                r0.setMin(r2)     // Catch:{ Exception -> 0x004f }
                goto L_0x0052
            L_0x004f:
                r0.setMin(r1)     // Catch:{ Exception -> 0x0052 }
            L_0x0052:
                android.hardware.Camera r1 = r0.setMax     // Catch:{ Exception -> 0x009a }
                android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ Exception -> 0x009a }
                android.hardware.Camera$Size r1 = r1.getPreviewSize()     // Catch:{ Exception -> 0x009a }
                if (r1 != 0) goto L_0x0063
                o.setStackFromEnd r1 = r0.isInside     // Catch:{ Exception -> 0x009a }
                r0.equals = r1     // Catch:{ Exception -> 0x009a }
                goto L_0x006e
            L_0x0063:
                o.setStackFromEnd r2 = new o.setStackFromEnd     // Catch:{ Exception -> 0x009a }
                int r3 = r1.width     // Catch:{ Exception -> 0x009a }
                int r1 = r1.height     // Catch:{ Exception -> 0x009a }
                r2.<init>(r3, r1)     // Catch:{ Exception -> 0x009a }
                r0.equals = r2     // Catch:{ Exception -> 0x009a }
            L_0x006e:
                o.calculateExtraLayoutSpace$getMax r1 = r0.hashCode     // Catch:{ Exception -> 0x009a }
                o.setStackFromEnd r0 = r0.equals     // Catch:{ Exception -> 0x009a }
                r1.getMax = r0     // Catch:{ Exception -> 0x009a }
                o.getReverseLayout r0 = o.getReverseLayout.this     // Catch:{ Exception -> 0x009a }
                android.os.Handler r0 = r0.setMin     // Catch:{ Exception -> 0x009a }
                if (r0 == 0) goto L_0x0091
                o.getReverseLayout r0 = o.getReverseLayout.this     // Catch:{ Exception -> 0x009a }
                android.os.Handler r0 = r0.setMin     // Catch:{ Exception -> 0x009a }
                int r1 = com.google.zxing.client.android.R.id.zxing_prewiew_size_ready     // Catch:{ Exception -> 0x009a }
                o.getReverseLayout r2 = o.getReverseLayout.this     // Catch:{ Exception -> 0x009a }
                o.setStackFromEnd r2 = o.getReverseLayout.setMax(r2)     // Catch:{ Exception -> 0x009a }
                android.os.Message r0 = r0.obtainMessage(r1, r2)     // Catch:{ Exception -> 0x009a }
                r0.sendToTarget()     // Catch:{ Exception -> 0x009a }
            L_0x0091:
                return
            L_0x0092:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x009a }
                java.lang.String r1 = "Camera not open"
                r0.<init>(r1)     // Catch:{ Exception -> 0x009a }
                throw r0     // Catch:{ Exception -> 0x009a }
            L_0x009a:
                r0 = move-exception
                o.getReverseLayout r1 = o.getReverseLayout.this
                o.getReverseLayout.getMax((o.getReverseLayout) r1, (java.lang.Exception) r0)
                java.lang.String unused = o.getReverseLayout.hashCode
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getReverseLayout.AnonymousClass1.run():void");
        }
    };
    public Runnable values = new Runnable() {
        public final void run() {
            try {
                String unused = getReverseLayout.hashCode;
                calculateExtraLayoutSpace length = getReverseLayout.this.getMin;
                if (length.getMax != null) {
                    length.getMax.setMin();
                    length.getMax = null;
                }
                if (length.getMin != null) {
                    length.getMin.stop();
                    length.getMin = null;
                }
                if (length.setMax != null && length.setMin) {
                    length.setMax.stopPreview();
                    length.hashCode.length = null;
                    length.setMin = false;
                }
                calculateExtraLayoutSpace length2 = getReverseLayout.this.getMin;
                if (length2.setMax != null) {
                    length2.setMax.release();
                    length2.setMax = null;
                }
            } catch (Exception unused2) {
                String unused3 = getReverseLayout.hashCode;
            }
            boolean unused4 = getReverseLayout.this.toIntRange = true;
            getReverseLayout.this.setMin.sendEmptyMessage(R.id.zxing_camera_closed);
            onLayoutChildren IsOverlapping = getReverseLayout.this.getMax;
            synchronized (IsOverlapping.setMax) {
                IsOverlapping.length--;
                if (IsOverlapping.length == 0) {
                    synchronized (IsOverlapping.setMax) {
                        IsOverlapping.getMin.quit();
                        IsOverlapping.getMin = null;
                        IsOverlapping.getMax = null;
                    }
                }
            }
        }
    };

    public getReverseLayout(Context context) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.getMax = onLayoutChildren.getMin();
            calculateExtraLayoutSpace calculateextralayoutspace = new calculateExtraLayoutSpace(context);
            this.getMin = calculateextralayoutspace;
            calculateextralayoutspace.IsOverlapping = this.equals;
            this.toFloatRange = new Handler();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final boolean length() {
        return this.toIntRange;
    }

    public final void setMax() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        } else if (this.IsOverlapping) {
            onLayoutChildren onlayoutchildren = this.getMax;
            Runnable runnable = this.toDoubleRange;
            synchronized (onlayoutchildren.setMax) {
                onlayoutchildren.length();
                onlayoutchildren.getMax.post(runnable);
            }
        } else {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public final void getMax(boolean z) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        } else if (this.IsOverlapping) {
            onLayoutChildren onlayoutchildren = this.getMax;
            findViewByPosition findviewbyposition = new findViewByPosition(this, z);
            synchronized (onlayoutchildren.setMax) {
                onlayoutchildren.length();
                onlayoutchildren.getMax.post(findviewbyposition);
            }
        }
    }

    static /* synthetic */ void getMax(getReverseLayout getreverselayout, Exception exc) {
        Handler handler = getreverselayout.setMin;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }

    static /* synthetic */ setStackFromEnd setMax(getReverseLayout getreverselayout) {
        calculateExtraLayoutSpace calculateextralayoutspace = getreverselayout.getMin;
        if (calculateextralayoutspace.equals == null) {
            return null;
        }
        if (!calculateextralayoutspace.length()) {
            return calculateextralayoutspace.equals;
        }
        setStackFromEnd setstackfromend = calculateextralayoutspace.equals;
        return new setStackFromEnd(setstackfromend.setMax, setstackfromend.getMax);
    }

    static /* synthetic */ void getMax(getReverseLayout getreverselayout, layoutForPredictiveAnimations layoutforpredictiveanimations) {
        calculateExtraLayoutSpace calculateextralayoutspace = getreverselayout.getMin;
        Camera camera = calculateextralayoutspace.setMax;
        if (camera != null && calculateextralayoutspace.setMin) {
            calculateextralayoutspace.hashCode.length = layoutforpredictiveanimations;
            camera.setOneShotPreviewCallback(calculateextralayoutspace.hashCode);
        }
    }

    static /* synthetic */ void getMin(getReverseLayout getreverselayout, layoutForPredictiveAnimations layoutforpredictiveanimations) {
        if (getreverselayout.IsOverlapping) {
            onLayoutChildren onlayoutchildren = getreverselayout.getMax;
            getStackFromEnd getstackfromend = new getStackFromEnd(getreverselayout, layoutforpredictiveanimations);
            synchronized (onlayoutchildren.setMax) {
                onlayoutchildren.length();
                onlayoutchildren.getMax.post(getstackfromend);
            }
        }
    }

    static /* synthetic */ void setMax(getReverseLayout getreverselayout, getExtraLayoutSpace getextralayoutspace) {
        calculateExtraLayoutSpace calculateextralayoutspace = getreverselayout.getMin;
        if (calculateextralayoutspace.setMax != null) {
            try {
                Camera camera = calculateextralayoutspace.setMax;
                calculateextralayoutspace.setMax.getParameters();
                camera.setParameters(getextralayoutspace.setMin());
            } catch (RuntimeException unused) {
            }
        }
    }
}
