package com.alipay.mobile.security.bio.utils;

import android.hardware.Camera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CamParaUtil {
    private static CamParaUtil myCamPara;
    private CameraSizeComparator sizeComparator = new CameraSizeComparator();

    private CamParaUtil() {
    }

    public static synchronized CamParaUtil getInstance() {
        synchronized (CamParaUtil.class) {
            if (myCamPara == null) {
                CamParaUtil camParaUtil = new CamParaUtil();
                myCamPara = camParaUtil;
                return camParaUtil;
            }
            CamParaUtil camParaUtil2 = myCamPara;
            return camParaUtil2;
        }
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, float f, int i) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.sizeComparator);
        int i2 = 0;
        Iterator<Camera.Size> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width >= i && equalRate(next, f)) {
                int i3 = next.width;
                int i4 = next.height;
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            i2 = list.size() - 1;
        }
        return list.get(i2);
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, int i, int i2) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.sizeComparator);
        for (Camera.Size next : list) {
            if (next.width >= i && next.height >= i2) {
                int i3 = next.width;
                int i4 = next.height;
                return next;
            }
        }
        return null;
    }

    public Camera.Size getPropPictureSize(List<Camera.Size> list, float f, int i) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.sizeComparator);
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        for (Camera.Size next : list) {
            if (next.width >= i) {
                if (i2 == 0) {
                    f2 = getEqualRate(next, f);
                    i2 = i3;
                }
                if (f2 > getEqualRate(next, f)) {
                    f2 = getEqualRate(next, f);
                    i2 = i3;
                }
            }
            i3++;
        }
        return list.get(i2);
    }

    private float getEqualRate(Camera.Size size, float f) {
        return Math.abs((((float) size.width) / ((float) size.height)) - f);
    }

    public boolean equalRate(Camera.Size size, float f) {
        return ((double) Math.abs((((float) size.width) / ((float) size.height)) - f)) <= 0.03d;
    }

    public class CameraSizeComparator implements Comparator<Camera.Size> {
        public CameraSizeComparator() {
        }

        public int compare(Camera.Size size, Camera.Size size2) {
            if (size.width == size2.width) {
                return 0;
            }
            return size.width > size2.width ? 1 : -1;
        }
    }

    public void printSupportPreviewSize(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (int i = 0; i < supportedPreviewSizes.size(); i++) {
                Camera.Size size = supportedPreviewSizes.get(i);
                int i2 = size.width;
                int i3 = size.height;
            }
        }
    }

    public void printSupportPictureSize(Camera.Parameters parameters) {
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes != null) {
            for (int i = 0; i < supportedPictureSizes.size(); i++) {
                Camera.Size size = supportedPictureSizes.get(i);
                int i2 = size.width;
                int i3 = size.height;
            }
        }
    }

    public void printSupportFocusMode(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            Iterator<String> it = supportedFocusModes.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static Map<String, String> getCameraResolution() {
        HashMap hashMap = new HashMap();
        new ArrayList();
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera open = Camera.open(i);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    Camera.Size size = open.getParameters().getSupportedPictureSizes().get(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(size.width);
                    sb.append("*");
                    sb.append(size.height);
                    hashMap.put("frontCamera", sb.toString());
                } else if (cameraInfo.facing == 0) {
                    Camera.Size size2 = open.getParameters().getSupportedPictureSizes().get(0);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size2.width);
                    sb2.append("*");
                    sb2.append(size2.height);
                    hashMap.put("backCamera", sb2.toString());
                }
                if (open != null) {
                    open.release();
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
