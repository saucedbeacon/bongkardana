package o;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class setLayoutFrozen {
    private static final CameraLogger getMax;
    private static final String getMin;
    public static final float[] setMax;

    static {
        String simpleName = setLayoutFrozen.class.getSimpleName();
        getMin = simpleName;
        getMax = CameraLogger.setMin(simpleName);
        float[] fArr = new float[16];
        setMax = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void getMin(@NonNull String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(getMax.getMax(3, "Error during", str, "glError 0x", Integer.toHexString(glGetError)));
        }
    }

    public static void getMin(int i, @NonNull String str) {
        if (i < 0) {
            throw new RuntimeException(getMax.getMax(3, "Unable to locate", str, "in program"));
        }
    }

    private static int getMax(int i, @NonNull String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        getMin("glCreateShader type=".concat(String.valueOf(i)));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        getMax.getMax(3, "Could not compile shader", Integer.valueOf(i), ":", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int setMax(@NonNull String str, @NonNull String str2) {
        int max;
        int max2 = getMax(35633, str);
        if (max2 == 0 || (max = getMax(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        getMin("glCreateProgram");
        if (glCreateProgram == 0) {
            getMax.getMax(3, "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, max2);
        getMin("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, max);
        getMin("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        getMax.getMax(3, "Could not link program:", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static FloatBuffer setMax(@NonNull float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }
}
