package o;

import android.opengl.GLES20;
import androidx.annotation.NonNull;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.otaliastudios.cameraview.CameraLogger;

public class getMinFlingVelocity {
    private static final CameraLogger getMax = CameraLogger.setMin(getMinFlingVelocity.class.getSimpleName());
    private int IsOverlapping;
    private int getMin;
    public int length;
    public setChildDrawingOrderCallback setMax;
    public setChildDrawingOrderCallback setMin;

    public getMinFlingVelocity() {
        this(new clearOnScrollListeners());
    }

    public getMinFlingVelocity(@NonNull setChildDrawingOrderCallback setchilddrawingordercallback) {
        this.length = -1;
        this.getMin = 36197;
        this.IsOverlapping = 33984;
        this.setMax = setchilddrawingordercallback;
        setMax();
    }

    private void setMax() {
        int max = setLayoutFrozen.setMax(this.setMax.getMin(), this.setMax.length());
        this.length = max;
        this.setMax.setMin(max);
    }

    public final int setMin() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        setLayoutFrozen.getMin("glGenTextures");
        int i = iArr[0];
        GLES20.glActiveTexture(this.IsOverlapping);
        GLES20.glBindTexture(this.getMin, i);
        setLayoutFrozen.getMin("glBindTexture ".concat(String.valueOf(i)));
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, PhotoParam.DEFAULT_MIN_PHOTO_SIZE, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        setLayoutFrozen.getMin("glTexParameter");
        return i;
    }

    public final void setMax(int i, float[] fArr) {
        if (this.setMin != null) {
            if (this.length != -1) {
                this.setMax.getMax();
                GLES20.glDeleteProgram(this.length);
                this.length = -1;
            }
            this.setMax = this.setMin;
            this.setMin = null;
            setMax();
        }
        setLayoutFrozen.getMin("draw start");
        GLES20.glUseProgram(this.length);
        setLayoutFrozen.getMin("glUseProgram");
        GLES20.glActiveTexture(this.IsOverlapping);
        GLES20.glBindTexture(this.getMin, i);
        this.setMax.getMax(fArr);
        GLES20.glBindTexture(this.getMin, 0);
        GLES20.glUseProgram(0);
    }
}
