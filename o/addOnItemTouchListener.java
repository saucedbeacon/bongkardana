package o;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.overlay.Overlay;

public class addOnItemTouchListener {
    private static final String getMax;
    private static final CameraLogger setMax;
    private Overlay IsOverlapping;
    private Surface equals;
    @VisibleForTesting
    getMinFlingVelocity getMin;
    private final Object isInside = new Object();
    public float[] length = new float[16];
    @VisibleForTesting
    int setMin;
    private SurfaceTexture toFloatRange;
    private isLayoutFrozen toIntRange;

    static {
        String simpleName = addOnItemTouchListener.class.getSimpleName();
        getMax = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public addOnItemTouchListener(@NonNull Overlay overlay, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        this.IsOverlapping = overlay;
        getMinFlingVelocity getminflingvelocity = new getMinFlingVelocity();
        this.getMin = getminflingvelocity;
        this.setMin = getminflingvelocity.setMin();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.setMin);
        this.toFloatRange = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin);
        this.equals = new Surface(this.toFloatRange);
        this.toIntRange = new isLayoutFrozen(this.setMin);
    }

    public final void setMin(@NonNull Overlay.Target target) {
        try {
            Canvas lockCanvas = this.equals.lockCanvas((Rect) null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.IsOverlapping.drawOn(target, lockCanvas);
            this.equals.unlockCanvasAndPost(lockCanvas);
        } catch (Surface.OutOfResourcesException e) {
            setMax.getMax(2, "Got Surface.OutOfResourcesException while drawing video overlays", e);
        }
        synchronized (this.isInside) {
            GLES20.glBindTexture(36197, this.toIntRange.setMin);
            this.toFloatRange.updateTexImage();
        }
        this.toFloatRange.getTransformMatrix(this.length);
    }

    public final void length() {
        GLES20.glDisable(2884);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        synchronized (this.isInside) {
            this.getMin.setMax(this.setMin, this.length);
        }
    }

    public final void getMin() {
        if (this.toIntRange != null) {
            GLES20.glBindTexture(36197, 0);
            this.toIntRange = null;
        }
        SurfaceTexture surfaceTexture = this.toFloatRange;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.toFloatRange = null;
        }
        Surface surface = this.equals;
        if (surface != null) {
            surface.release();
            this.equals = null;
        }
        getMinFlingVelocity getminflingvelocity = this.getMin;
        if (getminflingvelocity != null) {
            if (getminflingvelocity.length != -1) {
                getminflingvelocity.setMax.getMax();
                GLES20.glDeleteProgram(getminflingvelocity.length);
                getminflingvelocity.length = -1;
            }
            this.getMin = null;
        }
    }
}
