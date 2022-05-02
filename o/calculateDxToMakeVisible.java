package o;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.controls.Facing;

public class calculateDxToMakeVisible {
    private static final String getMax;
    private static final CameraLogger setMax;

    static {
        String simpleName = calculateDxToMakeVisible.class.getSimpleName();
        getMax = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public static boolean setMax(@NonNull Facing facing) {
        setOnFlingListener.getMin();
        int max = setOnFlingListener.getMax(facing);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == max) {
                return true;
            }
        }
        return false;
    }
}
