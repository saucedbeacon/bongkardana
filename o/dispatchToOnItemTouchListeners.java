package o;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import o.calculateDtToFit;

public final class dispatchToOnItemTouchListeners extends removeOnItemTouchListener {
    /* access modifiers changed from: private */
    public final getAccessibilityClassName equals;
    private final Camera setMin;

    public dispatchToOnItemTouchListeners(@NonNull calculateDtToFit.length length, @NonNull getAccessibilityClassName getaccessibilityclassname, @NonNull Camera camera) {
        super(length, getaccessibilityclassname);
        this.equals = getaccessibilityclassname;
        this.setMin = camera;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(this.length.length);
        this.setMin.setParameters(parameters);
    }

    public final void getMax() {
        getMax.getMax(1, "take() called.");
        this.setMin.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        this.setMin.takePicture(new Camera.ShutterCallback() {
            public final void onShutter() {
                removeOnItemTouchListener.getMax.getMax(1, "take(): got onShutter callback.");
                dispatchToOnItemTouchListeners dispatchtoonitemtouchlisteners = dispatchToOnItemTouchListeners.this;
                if (dispatchtoonitemtouchlisteners.setMax != null) {
                    dispatchtoonitemtouchlisteners.setMax.getMin(true);
                }
            }
        }, (Camera.PictureCallback) null, (Camera.PictureCallback) null, new Camera.PictureCallback() {
            public final void onPictureTaken(byte[] bArr, Camera camera) {
                int i;
                removeOnItemTouchListener.getMax.getMax(1, "take(): got picture callback.");
                try {
                    i = getMaxFlingVelocity.getMax(new ExifInterface(new ByteArrayInputStream(bArr)).length("Orientation", 1));
                } catch (IOException unused) {
                    i = 0;
                }
                dispatchToOnItemTouchListeners.this.length.isInside = bArr;
                dispatchToOnItemTouchListeners.this.length.length = i;
                removeOnItemTouchListener.getMax.setMax("take(): starting preview again. ", Thread.currentThread());
                camera.setPreviewCallbackWithBuffer(dispatchToOnItemTouchListeners.this.equals);
                camera.startPreview();
                dispatchToOnItemTouchListeners.this.getMin();
            }
        });
        getMax.getMax(1, "take() returned.");
    }

    /* access modifiers changed from: protected */
    public final void getMin() {
        getMax.getMax(1, "dispatching result. Thread:", Thread.currentThread());
        super.getMin();
    }
}
