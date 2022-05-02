package o;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@RequiresApi(api = 18)
public class stopScrollersInternal {
    protected static final String length;
    private static final CameraLogger setMax;
    private int IsOverlapping = -1;
    protected isLayoutSuppressed getMax;
    private int getMin = -1;
    private EGLSurface setMin = EGL14.EGL_NO_SURFACE;

    static {
        String simpleName = stopScrollersInternal.class.getSimpleName();
        length = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public stopScrollersInternal(isLayoutSuppressed islayoutsuppressed) {
        this.getMax = islayoutsuppressed;
    }

    public final void length(Object obj) {
        if (this.setMin == EGL14.EGL_NO_SURFACE) {
            isLayoutSuppressed islayoutsuppressed = this.getMax;
            if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(islayoutsuppressed.length, islayoutsuppressed.setMax, obj, new int[]{12344}, 0);
                isLayoutSuppressed.setMax("eglCreateWindowSurface");
                if (eglCreateWindowSurface != null) {
                    this.setMin = eglCreateWindowSurface;
                    return;
                }
                throw new RuntimeException("surface was null");
            }
            throw new RuntimeException("invalid surface: ".concat(String.valueOf(obj)));
        }
        throw new IllegalStateException("surface already created");
    }

    public final void getMin() {
        isLayoutSuppressed islayoutsuppressed = this.getMax;
        EGL14.eglDestroySurface(islayoutsuppressed.length, this.setMin);
        this.setMin = EGL14.EGL_NO_SURFACE;
        this.IsOverlapping = -1;
        this.getMin = -1;
    }

    public final void length() {
        isLayoutSuppressed islayoutsuppressed = this.getMax;
        EGLSurface eGLSurface = this.setMin;
        if (!EGL14.eglMakeCurrent(islayoutsuppressed.length, eGLSurface, eGLSurface, islayoutsuppressed.getMax)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean getMax() {
        return this.getMax.setMin(this.setMin);
    }

    public final void length(long j) {
        isLayoutSuppressed islayoutsuppressed = this.getMax;
        EGLExt.eglPresentationTimeANDROID(islayoutsuppressed.length, this.setMin, j);
    }

    public final byte[] length(Bitmap.CompressFormat compressFormat) {
        if (this.getMax.length(this.setMin)) {
            int i = this.getMin;
            if (i < 0) {
                isLayoutSuppressed islayoutsuppressed = this.getMax;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(islayoutsuppressed.length, this.setMin, 12375, iArr, 0);
                i = iArr[0];
            }
            int i2 = this.IsOverlapping;
            if (i2 < 0) {
                isLayoutSuppressed islayoutsuppressed2 = this.getMax;
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(islayoutsuppressed2.length, this.setMin, 12374, iArr2, 0);
                i2 = iArr2[0];
            }
            int i3 = i2;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i3 * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            GLES20.glReadPixels(0, 0, i, i3, 6408, 5121, allocateDirect);
            setLayoutFrozen.getMin("glReadPixels");
            allocateDirect.rewind();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(allocateDirect.array().length);
            Bitmap createBitmap = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            createBitmap.compress(compressFormat, 90, byteArrayOutputStream);
            createBitmap.recycle();
            return byteArrayOutputStream.toByteArray();
        }
        throw new RuntimeException("Expected EGL context/surface is not current");
    }
}
