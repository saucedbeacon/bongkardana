package com.alibaba.griver.image.capture.utils;

import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.image.capture.widget.SightCameraView;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraUtils {

    public interface CameraHelperListener {
        void onCameraFacingChanged(Camera camera, int i, int i2);

        void onCaptureModeReached(Camera camera);

        void onVideoModeReached(Camera camera);
    }

    public static void switchCameraFacing(final SightCameraView sightCameraView, final int i, final CameraHelperListener cameraHelperListener, final int i2) {
        GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
            public final void run() {
                final Camera switchCamera = sightCameraView.switchCamera();
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        cameraHelperListener.onCameraFacingChanged(switchCamera, Math.abs(i - 1), i2);
                    }
                });
            }
        });
    }

    public static void openRecordMode(Camera camera, CameraHelperListener cameraHelperListener) {
        cameraHelperListener.onVideoModeReached(camera);
    }

    public static void openCaptureMode(Camera camera, CameraHelperListener cameraHelperListener) {
        cameraHelperListener.onCaptureModeReached(camera);
    }

    public static boolean isXiaoMi3() {
        return "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && "MI 3".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isSupportCaptureFlush() {
        return !isXiaoMi3();
    }

    public static Camera.Size getSuggestPictureSize(Camera camera, int i) {
        return a(camera.getParameters().getSupportedPictureSizes(), i);
    }

    private static Camera.Size a(List<Camera.Size> list, int i) {
        Collections.sort(list, new CameraSizeComparator());
        float f = -1.0f;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            float f2 = (float) list.get(i3).height;
            float f3 = (float) list.get(i3).width;
            if (f3 >= ((float) i)) {
                if (f == -1.0f) {
                    f = f3 / f2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f3);
                    sb.append("---");
                    sb.append(f2);
                    sb.append("---");
                    sb.append(f);
                    RVLogger.d("CameraUtils", sb.toString());
                    i2 = i3;
                } else {
                    float f4 = f3 / f2;
                    if (Math.abs(f4 - 1.7777778f) < Math.abs(f - 1.7777778f)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f3);
                        sb2.append("---");
                        sb2.append(f2);
                        sb2.append("---");
                        sb2.append(f4);
                        RVLogger.d("CameraUtils", sb2.toString());
                        i2 = i3;
                        f = f4;
                    }
                }
                if (Math.abs(f - 1.7777778f) <= 0.02f) {
                    break;
                }
            }
        }
        if (i2 == -1) {
            i2 = list.size() - 1;
        }
        StringBuilder sb3 = new StringBuilder("found the final camera height is : ");
        sb3.append(list.get(i2).width);
        sb3.append("  width is : ");
        sb3.append(list.get(i2).height);
        RVLogger.d("CameraUtils", sb3.toString());
        return list.get(i2);
    }

    static class CameraSizeComparator implements Comparator<Camera.Size> {
        private CameraSizeComparator() {
        }

        public int compare(Camera.Size size, Camera.Size size2) {
            if (size.width == size2.width) {
                return 0;
            }
            return size.width > size2.width ? 1 : -1;
        }
    }
}
