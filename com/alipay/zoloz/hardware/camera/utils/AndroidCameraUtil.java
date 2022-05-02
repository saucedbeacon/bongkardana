package com.alipay.zoloz.hardware.camera.utils;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.SizeF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AndroidCameraUtil {
    private static AndroidCameraUtil myCamPara;
    private CameraSizeComparator sizeComparator = new CameraSizeComparator();

    private AndroidCameraUtil() {
    }

    public static synchronized AndroidCameraUtil getInstance() {
        synchronized (AndroidCameraUtil.class) {
            if (myCamPara == null) {
                AndroidCameraUtil androidCameraUtil = new AndroidCameraUtil();
                myCamPara = androidCameraUtil;
                return androidCameraUtil;
            }
            AndroidCameraUtil androidCameraUtil2 = myCamPara;
            return androidCameraUtil2;
        }
    }

    public Camera.Size getBackCameraPreviewSize(List<Camera.Size> list, float f, final int i, final int i2) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.sizeComparator);
        List<T> filter = filter(list, new ListFilter<Camera.Size>() {
            public boolean accept(Camera.Size size) {
                if (size.width <= i2 && size.height <= i2 && size.width >= i && size.height >= i) {
                    return true;
                }
                return false;
            }
        });
        if (filter.isEmpty()) {
            return list.get(list.size() - 1);
        }
        for (int size = filter.size() - 1; size >= 0; size--) {
            Camera.Size size2 = (Camera.Size) filter.get(size);
            if (Math.min(Math.abs((((float) size2.width) / ((float) size2.height)) - f), Math.abs((((float) size2.height) / ((float) size2.width)) - f)) <= 0.2f) {
                return size2;
            }
        }
        return (Camera.Size) filter.get(filter.size() - 1);
    }

    private static <T> List<T> filter(List<T> list, ListFilter<T> listFilter) {
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (listFilter.accept(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
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

    private static int findFrontCameraId() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return i;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int findBackCameraId() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int findFacingCamera() {
        return findFrontCameraId();
    }

    public static int adjustCameraId(Context context, int i, int i2) {
        if (i2 <= 1) {
            return 0;
        }
        return (i2 > 2 && Build.VERSION.SDK_INT >= 21) ? adjustCameraIdForLollipop(context, i, i2) : i;
    }

    @RequiresApi(api = 21)
    private static int adjustCameraIdForLollipop(Context context, int i, int i2) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService(ImagePickerEvent.CAMERA);
            String[] cameraIdList = cameraManager.getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == (i == 0 ? 1 : 0)) {
                    arrayList.add(new CameraItem(Integer.parseInt(str), (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                }
            }
            Collections.sort(arrayList);
            if (((CameraItem) arrayList.get(0)).cameraId >= i2) {
                return i;
            }
            return ((CameraItem) arrayList.get(0)).cameraId;
        } catch (Exception unused) {
            return i;
        }
    }

    @RequiresApi(api = 21)
    static class CameraItem implements Comparable<CameraItem> {
        int cameraId;
        SizeF mSizeF;

        public CameraItem(int i, SizeF sizeF) {
            this.cameraId = i;
            this.mSizeF = sizeF;
        }

        public long getSize() {
            return (long) (this.mSizeF.getWidth() * 100000.0f * this.mSizeF.getHeight() * 100000.0f);
        }

        public int compareTo(@NonNull CameraItem cameraItem) {
            long size = cameraItem.getSize() - getSize();
            if (size == 0) {
                return this.cameraId - cameraItem.cameraId;
            }
            return size > 0 ? 1 : -1;
        }
    }
}
