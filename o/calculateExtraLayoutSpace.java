package o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.google.zxing.client.android.AmbientLightManager;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class calculateExtraLayoutSpace {
    /* access modifiers changed from: private */
    public static final String toDoubleRange = calculateExtraLayoutSpace.class.getSimpleName();
    private String FastBitmap$CoordinateSystem;
    public CameraSettings IsOverlapping = new CameraSettings();
    setStackFromEnd equals;
    canScrollVertically getMax;
    AmbientLightManager getMin;
    final getMax hashCode;
    setStackFromEnd isInside;
    /* access modifiers changed from: package-private */
    public Camera.CameraInfo length;
    Camera setMax;
    boolean setMin;
    int toFloatRange = -1;
    public onLayoutCompleted toIntRange;
    Context values;

    final class getMax implements Camera.PreviewCallback {
        setStackFromEnd getMax;
        layoutForPredictiveAnimations length;

        public getMax() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            setStackFromEnd setstackfromend = this.getMax;
            layoutForPredictiveAnimations layoutforpredictiveanimations = this.length;
            if (setstackfromend == null || layoutforpredictiveanimations == null) {
                String unused = calculateExtraLayoutSpace.toDoubleRange;
                if (layoutforpredictiveanimations != null) {
                    layoutforpredictiveanimations.setMax();
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    getRecycleChildrenOnDetach getrecyclechildrenondetach = new getRecycleChildrenOnDetach(bArr2, setstackfromend.getMax, setstackfromend.setMax, camera.getParameters().getPreviewFormat(), calculateExtraLayoutSpace.this.toFloatRange);
                    if (calculateExtraLayoutSpace.this.length.facing == 1) {
                        getrecyclechildrenondetach.equals = true;
                    }
                    layoutforpredictiveanimations.length(getrecyclechildrenondetach);
                } catch (RuntimeException unused2) {
                    String unused3 = calculateExtraLayoutSpace.toDoubleRange;
                    layoutforpredictiveanimations.setMax();
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public calculateExtraLayoutSpace(Context context) {
        this.values = context;
        this.hashCode = new getMax();
    }

    public final boolean length() {
        int i = this.toFloatRange;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public final void length(boolean z) {
        if (this.setMax != null) {
            try {
                if (z != setMax()) {
                    if (this.getMax != null) {
                        this.getMax.setMin();
                    }
                    Camera.Parameters parameters = this.setMax.getParameters();
                    setRecycleChildrenOnDetach.setMax(parameters, z);
                    if (this.IsOverlapping.setMin()) {
                        setRecycleChildrenOnDetach.setMin(parameters, z);
                    }
                    this.setMax.setParameters(parameters);
                    if (this.getMax != null) {
                        canScrollVertically canscrollvertically = this.getMax;
                        canscrollvertically.getMax = false;
                        canscrollvertically.getMin();
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    private boolean setMax() {
        String flashMode;
        Camera.Parameters parameters = this.setMax.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!CameraParams.FLASH_MODE_ON.equals(flashMode) && !"torch".equals(flashMode))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(boolean z) {
        Camera.Parameters parameters = this.setMax.getParameters();
        String str = this.FastBitmap$CoordinateSystem;
        if (str == null) {
            this.FastBitmap$CoordinateSystem = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters != null) {
            parameters.flatten();
            setRecycleChildrenOnDetach.setMax(parameters, this.IsOverlapping.getMax, z);
            if (!z) {
                setRecycleChildrenOnDetach.setMax(parameters, false);
                if (this.IsOverlapping.getMin()) {
                    setRecycleChildrenOnDetach.isInside(parameters);
                }
                if (this.IsOverlapping.getMax()) {
                    setRecycleChildrenOnDetach.length(parameters);
                }
                if (this.IsOverlapping.setMax() && Build.VERSION.SDK_INT >= 15) {
                    setRecycleChildrenOnDetach.getMax(parameters);
                    setRecycleChildrenOnDetach.setMax(parameters);
                    setRecycleChildrenOnDetach.getMin(parameters);
                }
            }
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList();
            if (supportedPreviewSizes == null) {
                Camera.Size previewSize = parameters.getPreviewSize();
                if (previewSize != null) {
                    new setStackFromEnd(previewSize.width, previewSize.height);
                    arrayList.add(new setStackFromEnd(previewSize.width, previewSize.height));
                }
            } else {
                for (Camera.Size next : supportedPreviewSizes) {
                    arrayList.add(new setStackFromEnd(next.width, next.height));
                }
            }
            setStackFromEnd setstackfromend = null;
            if (arrayList.size() == 0) {
                this.isInside = null;
            } else {
                onLayoutCompleted onlayoutcompleted = this.toIntRange;
                boolean length2 = length();
                if (onlayoutcompleted.getMin != null) {
                    if (length2) {
                        setStackFromEnd setstackfromend2 = onlayoutcompleted.getMin;
                        setstackfromend = new setStackFromEnd(setstackfromend2.setMax, setstackfromend2.getMax);
                    } else {
                        setstackfromend = onlayoutcompleted.getMin;
                    }
                }
                onAnchorReady onanchorready = onlayoutcompleted.setMin;
                if (setstackfromend != null) {
                    Collections.sort(arrayList, new Comparator<setStackFromEnd>(setstackfromend) {
                        final /* synthetic */ setStackFromEnd getMax;

                        {
                            this.getMax = r2;
                        }

                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                            return Float.compare(onAnchorReady.this.getMin((setStackFromEnd) obj2, this.getMax), onAnchorReady.this.getMin((setStackFromEnd) obj, this.getMax));
                        }
                    });
                }
                setStackFromEnd setstackfromend3 = (setStackFromEnd) arrayList.get(0);
                this.isInside = setstackfromend3;
                parameters.setPreviewSize(setstackfromend3.getMax, this.isInside.setMax);
            }
            if (Build.DEVICE.equals("glass-1")) {
                setRecycleChildrenOnDetach.setMin(parameters);
            }
            parameters.flatten();
            this.setMax.setParameters(parameters);
        }
    }
}
