package o;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class setRecycleChildrenOnDetach {
    private static final Pattern getMin = Pattern.compile(";");

    public static void setMax(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z) {
        String str;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || focusMode == CameraSettings.FocusMode.AUTO) {
            str = setMax((Collection<String>) supportedFocusModes, "auto");
        } else if (focusMode == CameraSettings.FocusMode.CONTINUOUS) {
            str = setMax((Collection<String>) supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (focusMode == CameraSettings.FocusMode.INFINITY) {
            str = setMax((Collection<String>) supportedFocusModes, "infinity");
        } else {
            str = focusMode == CameraSettings.FocusMode.MACRO ? setMax((Collection<String>) supportedFocusModes, "macro") : null;
        }
        if (!z && str == null) {
            str = setMax((Collection<String>) supportedFocusModes, "macro", "edof");
        }
        if (str != null && !str.equals(parameters.getFocusMode())) {
            parameters.setFocusMode(str);
        }
    }

    public static void setMax(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = setMax((Collection<String>) supportedFlashModes, "torch", CameraParams.FLASH_MODE_ON);
        } else {
            str = setMax((Collection<String>) supportedFlashModes, CameraParams.FLASH_MODE_OFF);
        }
        if (str != null && !str.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(str);
        }
    }

    public static void setMin(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = 1.5f;
                }
                int max = Math.max(Math.min(Math.round(f / exposureCompensationStep), maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() != max) {
                    parameters.setExposureCompensation(max);
                }
            }
        }
    }

    @TargetApi(15)
    public static void setMax(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            setMin((Iterable<Camera.Area>) parameters.getFocusAreas());
            List singletonList = Collections.singletonList(new Camera.Area(new Rect(-400, -400, 400, 400), 1));
            setMin((Iterable<Camera.Area>) singletonList);
            parameters.setFocusAreas(singletonList);
        }
    }

    @TargetApi(15)
    public static void getMin(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.getMeteringAreas();
            List singletonList = Collections.singletonList(new Camera.Area(new Rect(-400, -400, 400, 400), 1));
            setMin((Iterable<Camera.Area>) singletonList);
            parameters.setMeteringAreas(singletonList);
        }
    }

    @TargetApi(15)
    public static void getMax(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    public static void length(Camera.Parameters parameters) {
        String max;
        if (!"barcode".equals(parameters.getSceneMode()) && (max = setMax((Collection<String>) parameters.getSupportedSceneModes(), "barcode")) != null) {
            parameters.setSceneMode(max);
        }
    }

    public static void isInside(Camera.Parameters parameters) {
        String max;
        if (!ZolozEkycH5Handler.HUMMER_FOUNDATION_NEGATIVE.equals(parameters.getColorEffect()) && (max = setMax((Collection<String>) parameters.getSupportedColorEffects(), ZolozEkycH5Handler.HUMMER_FOUNDATION_NEGATIVE)) != null) {
            parameters.setColorEffect(max);
        }
    }

    private static String setMax(Collection<String> collection, String... strArr) {
        Arrays.toString(strArr);
        if (collection == null) {
            return null;
        }
        for (String str : strArr) {
            if (collection.contains(str)) {
                return str;
            }
        }
        return null;
    }

    @TargetApi(15)
    private static String setMin(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void setMin(Camera.Parameters parameters) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (it.hasNext()) {
                Arrays.toString(it.next());
                boolean hasNext = it.hasNext();
            }
        }
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int[] next = it2.next();
                int i = next[0];
                int i2 = next[1];
                if (i >= 10000 && i2 <= 20000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr != null) {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    Arrays.toString(iArr);
                    return;
                }
                Arrays.toString(iArr);
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
            }
        }
    }
}
