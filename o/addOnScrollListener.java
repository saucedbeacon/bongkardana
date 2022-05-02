package o;

import android.opengl.GLES20;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.CameraLogger;
import java.nio.FloatBuffer;

public abstract class addOnScrollListener implements setChildDrawingOrderCallback {
    private static final CameraLogger equals;
    private static final String toFloatRange;
    private FloatBuffer FastBitmap$CoordinateSystem = setLayoutFrozen.setMax(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private FloatBuffer IsOverlapping = setLayoutFrozen.setMax(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    protected String getMax = "aTextureCoord";
    @VisibleForTesting
    int getMin = -1;
    private int hashCode = -1;
    protected String isInside = "vTextureCoord";
    protected String length = "uMVPMatrix";
    @VisibleForTesting
    shouldDeferAccessibilityEvent setMax;
    protected String setMin = "aPosition";
    private int toDoubleRange = -1;
    protected String toIntRange = "uTexMatrix";
    private int toString = -1;
    private int values = -1;

    static {
        String simpleName = addOnScrollListener.class.getSimpleName();
        toFloatRange = simpleName;
        equals = CameraLogger.setMin(simpleName);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final String setMax() {
        String str = this.isInside;
        StringBuilder sb = new StringBuilder("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 ");
        sb.append(str);
        sb.append(";\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, ");
        sb.append(str);
        sb.append(");\n}\n");
        return sb.toString();
    }

    public final void setMin(int i) {
        this.getMin = i;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, this.setMin);
        this.toDoubleRange = glGetAttribLocation;
        setLayoutFrozen.getMin(glGetAttribLocation, this.setMin);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(i, this.getMax);
        this.hashCode = glGetAttribLocation2;
        setLayoutFrozen.getMin(glGetAttribLocation2, this.getMax);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, this.length);
        this.toString = glGetUniformLocation;
        setLayoutFrozen.getMin(glGetUniformLocation, this.length);
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, this.toIntRange);
        this.values = glGetUniformLocation2;
        setLayoutFrozen.getMin(glGetUniformLocation2, this.toIntRange);
    }

    public final void getMax() {
        this.getMin = -1;
        this.toDoubleRange = -1;
        this.hashCode = -1;
        this.toString = -1;
        this.values = -1;
    }

    public final void getMax(int i, int i2) {
        this.setMax = new shouldDeferAccessibilityEvent(i, i2);
    }

    public final void getMax(float[] fArr) {
        if (this.getMin == -1) {
            equals.getMax(2, "Filter.draw() called after destroying the filter. This can happen rarely because of threading.");
            return;
        }
        GLES20.glUniformMatrix4fv(this.toString, 1, false, setLayoutFrozen.setMax, 0);
        setLayoutFrozen.getMin("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.values, 1, false, fArr, 0);
        setLayoutFrozen.getMin("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.toDoubleRange);
        StringBuilder sb = new StringBuilder("glEnableVertexAttribArray: ");
        sb.append(this.toDoubleRange);
        setLayoutFrozen.getMin(sb.toString());
        GLES20.glVertexAttribPointer(this.toDoubleRange, 2, 5126, false, 8, this.IsOverlapping);
        setLayoutFrozen.getMin("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.hashCode);
        setLayoutFrozen.getMin("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.hashCode, 2, 5126, false, 8, this.FastBitmap$CoordinateSystem);
        setLayoutFrozen.getMin("glVertexAttribPointer");
        GLES20.glDrawArrays(5, 0, 4);
        setLayoutFrozen.getMin("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.toDoubleRange);
        GLES20.glDisableVertexAttribArray(this.hashCode);
    }

    private addOnScrollListener toFloatRange() {
        try {
            return (addOnScrollListener) getClass().newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e2);
        }
    }

    @NonNull
    public final String getMin() {
        String str = this.setMin;
        String str2 = this.getMax;
        String str3 = this.length;
        String str4 = this.toIntRange;
        String str5 = this.isInside;
        StringBuilder sb = new StringBuilder("uniform mat4 ");
        sb.append(str3);
        sb.append(";\nuniform mat4 ");
        sb.append(str4);
        sb.append(";\nattribute vec4 ");
        sb.append(str);
        sb.append(";\nattribute vec4 ");
        sb.append(str2);
        sb.append(";\nvarying vec2 ");
        sb.append(str5);
        sb.append(";\nvoid main() {\n    gl_Position = ");
        sb.append(str3);
        sb.append(" * ");
        sb.append(str);
        sb.append(";\n    ");
        sb.append(str5);
        sb.append(" = (");
        sb.append(str4);
        sb.append(" * ");
        sb.append(str2);
        sb.append(").xy;\n}\n");
        return sb.toString();
    }

    @NonNull
    public final /* synthetic */ setChildDrawingOrderCallback setMin() {
        addOnScrollListener floatRange = toFloatRange();
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = this.setMax;
        if (shoulddeferaccessibilityevent != null) {
            floatRange.setMax = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent.getMax, this.setMax.getMin);
        }
        return floatRange;
    }
}
