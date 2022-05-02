package com.alibaba.griver.image.capture.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class VideoUtils {
    public static final int BITRATE_1080 = 2048000;
    public static final int BITRATE_320 = 819200;
    public static final int BITRATE_540 = 1126400;
    public static final int BITRATE_720 = 1433600;
    public static final int BITRATE_DEFAULT = 1126400;
    public static final int MIN_VIDEO_BITERATE = 102400;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f10462a = false;

    public static Point getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        return point;
    }

    public static boolean isActivityLandscape(Activity activity) {
        int requestedOrientation = activity.getRequestedOrientation();
        boolean z = requestedOrientation == 0 || requestedOrientation == 8 || requestedOrientation == 6 || requestedOrientation == 11;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return z || (rotation == 1 || rotation == 3);
    }

    public static boolean previewRunning(Camera camera) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        try {
            z = ((Boolean) camera.getClass().getDeclaredMethod("previewEnabled", new Class[0]).invoke(camera, new Object[0])).booleanValue();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("previewEnabled exception:");
            sb.append(e.getMessage());
            RVLogger.e("VideoUtils", sb.toString(), e);
        }
        RVLogger.d("VideoUtils", "previewRunning enable: ".concat(String.valueOf(z)));
        return z;
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        String str;
        Point point2 = point;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        String str2 = "Parameters contained no preview size!";
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException(str2);
        }
        ArrayList<Camera.Size> arrayList = new ArrayList<>(supportedPreviewSizes);
        Collections.sort(arrayList, new Comparator<Camera.Size>() {
            public final int compare(Camera.Size size, Camera.Size size2) {
                int i = size.height * size.width;
                int i2 = size2.height * size2.width;
                if (i2 < i) {
                    return -1;
                }
                return i2 > i ? 1 : 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Camera.Size size : arrayList) {
            sb.append(size.width);
            sb.append('x');
            sb.append(size.height);
            sb.append(' ');
        }
        RVLogger.d("VideoUtils", "Supported preview sizes: ".concat(String.valueOf(sb)));
        double d = (double) point2.x;
        double d2 = (double) point2.y;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (!(d3 < 1.0d)) {
            d3 = 1.0d / d3;
        }
        StringBuilder sb2 = new StringBuilder("screen size:");
        sb2.append(point2.x);
        sb2.append("x");
        sb2.append(point2.y);
        RVLogger.d("VideoUtils", sb2.toString());
        Point point3 = null;
        double d4 = Double.POSITIVE_INFINITY;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i = size2.width;
            int i2 = size2.height;
            int i3 = i * i2;
            if (i3 < 153600 || i3 > 1536000) {
                str = str2;
                it.remove();
            } else {
                boolean z = i > i2;
                int i4 = z ? i2 : i;
                int i5 = z ? i : i2;
                if (i4 == point2.x && i5 == point2.y) {
                    Point point4 = new Point(i, i2);
                    RVLogger.d("VideoUtils", "Found preview size exactly matching screen size: ".concat(String.valueOf(point4)));
                    return point4;
                }
                double d5 = (double) i4;
                str = str2;
                double d6 = (double) i5;
                Double.isNaN(d5);
                Double.isNaN(d6);
                double abs = Math.abs((d5 / d6) - d3);
                if (abs < d4) {
                    point3 = new Point(i, i2);
                    StringBuilder sb3 = new StringBuilder("new update bestSize: ");
                    sb3.append(point3);
                    sb3.append(" --- diff = ");
                    sb3.append(d4);
                    sb3.append(" --- newDiff= ");
                    sb3.append(abs);
                    RVLogger.d("VideoUtils", sb3.toString());
                    d4 = abs;
                }
            }
            str2 = str;
        }
        String str3 = str2;
        if (point3 == null) {
            Camera.Size previewSize2 = parameters.getPreviewSize();
            if (previewSize2 != null) {
                Point point5 = new Point(previewSize2.width, previewSize2.height);
                RVLogger.d("VideoUtils", "No suitable preview sizes, using default: ".concat(String.valueOf(point5)));
                StringBuilder sb4 = new StringBuilder("default previewSize: ");
                sb4.append(previewSize2.width);
                sb4.append(",");
                sb4.append(previewSize2.height);
                RVLogger.d("VideoUtils", sb4.toString());
                return point5;
            }
            throw new IllegalStateException(str3);
        }
        RVLogger.d("VideoUtils", "bestSize is not null: ".concat(String.valueOf(point3)));
        return point3;
    }
}
