package o;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.engine.offset.Reference;
import java.io.ByteArrayOutputStream;
import o.calculateDtToFit;

public final class defaultOnMeasure extends cancelScroll {
    /* access modifiers changed from: private */
    public predictiveItemAnimationsEnabled IsOverlapping;
    private Camera getMax;
    /* access modifiers changed from: private */
    public int isInside;
    /* access modifiers changed from: private */
    public getAccessibilityClassName setMin;

    public defaultOnMeasure(@NonNull calculateDtToFit.length length, @NonNull getAccessibilityClassName getaccessibilityclassname, @NonNull Camera camera, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        super(length, getaccessibilityclassname);
        this.setMin = getaccessibilityclassname;
        this.getMax = camera;
        this.IsOverlapping = predictiveitemanimationsenabled;
        this.isInside = camera.getParameters().getPreviewFormat();
    }

    public final void getMax() {
        this.getMax.setOneShotPreviewCallback(new Camera.PreviewCallback() {
            public final void onPreviewFrame(@NonNull byte[] bArr, Camera camera) {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.setMax != null) {
                    defaultonmeasure.setMax.getMin(false);
                }
                final int i = defaultOnMeasure.this.length.length;
                final shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = defaultOnMeasure.this.length.getMax;
                shouldDeferAccessibilityEvent min = defaultOnMeasure.this.setMin.getMin(Reference.SENSOR);
                if (min != null) {
                    final byte[] bArr2 = bArr;
                    final shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = min;
                    ensureTopGlow.setMax(new Runnable() {
                        public final void run() {
                            YuvImage yuvImage = new YuvImage(absorbGlows.setMax(bArr2, shoulddeferaccessibilityevent2, i), defaultOnMeasure.this.isInside, shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin, (int[]) null);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Rect max = pullGlows.setMax(shoulddeferaccessibilityevent, defaultOnMeasure.this.IsOverlapping);
                            yuvImage.compressToJpeg(max, 90, byteArrayOutputStream);
                            defaultOnMeasure.this.length.isInside = byteArrayOutputStream.toByteArray();
                            defaultOnMeasure.this.length.getMax = new shouldDeferAccessibilityEvent(max.width(), max.height());
                            defaultOnMeasure.this.length.length = 0;
                            defaultOnMeasure.this.getMin();
                        }
                    });
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallbackWithBuffer(defaultOnMeasure.this.setMin);
                    defaultOnMeasure.this.setMin.IsOverlapping().getMin(defaultOnMeasure.this.isInside, min);
                    return;
                }
                throw new IllegalStateException("Preview stream size should never be null here.");
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void getMin() {
        this.setMin = null;
        this.getMax = null;
        this.IsOverlapping = null;
        this.isInside = 0;
        super.getMin();
    }
}
