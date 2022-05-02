package com.alibaba.griver.image.capture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.image.capture.meta.APTakePicRsp;
import com.alibaba.griver.image.capture.meta.APTakePictureOption;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.alibaba.griver.image.capture.utils.CameraUtils;
import com.alibaba.griver.image.capture.utils.OrientationDetector;
import com.alibaba.griver.image.capture.widget.SightCameraView;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.encode.APEncodeResult;
import com.alibaba.griver.image.framework.encode.ImageEncoder;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.utils.Exif;
import com.alibaba.griver.image.framework.utils.FalconFacade;
import com.alibaba.griver.image.framework.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TakePictureProcessor {
    public static int DEFAULT_PICTURE_MIN_HEIGHT = 1280;
    protected static final String TAG = "TakePictureProcessor";

    /* renamed from: a  reason: collision with root package name */
    private int f10456a = DEFAULT_PICTURE_MIN_HEIGHT;
    protected int mCameraFacing;

    private void a(Bitmap bitmap, String str) {
    }

    static {
        if (!"samsung".equalsIgnoreCase(Build.MANUFACTURER) || (!"SM-G9500".equalsIgnoreCase(Build.MODEL) && !"SM-G9550".equalsIgnoreCase(Build.MODEL) && !"SM-G9508".equalsIgnoreCase(Build.MODEL))) {
            DEFAULT_PICTURE_MIN_HEIGHT = APEncodeOptions.DEFAULT_MAX_LEN;
        } else {
            DEFAULT_PICTURE_MIN_HEIGHT = 1920;
        }
    }

    public void takePicture(Camera camera, int i, SightCameraView.TakePictureListener takePictureListener, Looper looper, CameraParams cameraParams, APTakePictureOption aPTakePictureOption) {
        final CameraParams cameraParams2;
        int i2;
        Handler handler;
        Camera camera2 = camera;
        Looper looper2 = looper;
        CameraParams cameraParams3 = cameraParams;
        StringBuilder sb = new StringBuilder("takePicture start looper: ");
        sb.append(looper2);
        sb.append(", params: ");
        sb.append(cameraParams3);
        RVLogger.d(TAG, sb.toString());
        if (aPTakePictureOption != null) {
            RVLogger.d(TAG, "takePicture start looper, option: ".concat(String.valueOf(aPTakePictureOption)));
        }
        long currentTimeMillis = System.currentTimeMillis();
        Handler handler2 = new Handler(selectLooper(looper2));
        if (cameraParams3 == null) {
            cameraParams2 = new CameraParams();
            i2 = i;
        } else {
            i2 = i;
            cameraParams2 = cameraParams3;
        }
        final Camera.Size size = setupPictureParams(camera2, i2, cameraParams3);
        final int devOrientation = OrientationDetector.getInstance(GriverEnv.getApplicationContext()).getDevOrientation();
        try {
            final APTakePictureOption aPTakePictureOption2 = aPTakePictureOption;
            final Handler handler3 = handler2;
            final SightCameraView.TakePictureListener takePictureListener2 = takePictureListener;
            handler = handler2;
            final long j = currentTimeMillis;
            try {
                AnonymousClass1 r1 = new Camera.PictureCallback() {
                    public void onPictureTaken(byte[] bArr, Camera camera) {
                        APTakePictureOption aPTakePictureOption = aPTakePictureOption2;
                        if (!(aPTakePictureOption == null || !aPTakePictureOption.isKeepPreview() || camera == null)) {
                            try {
                                camera.startPreview();
                            } catch (Exception e) {
                                StringBuilder sb = new StringBuilder("startPreview exp=");
                                sb.append(e.toString());
                                RVLogger.e(TakePictureProcessor.TAG, sb.toString());
                            }
                        }
                        if (bArr == null) {
                            RVLogger.e(TakePictureProcessor.TAG, "onPictureTaken data is empty!!!");
                            TakePictureProcessor.this.notifyTakenPictureError(camera, handler3, takePictureListener2);
                        } else {
                            APTakePictureOption aPTakePictureOption2 = aPTakePictureOption2;
                            if (aPTakePictureOption2 == null || aPTakePictureOption2.getDataType() != 1) {
                                StringBuilder sb2 = new StringBuilder("onPictureTaken start to doPictureProcess size=");
                                sb2.append(size);
                                RVLogger.d(TakePictureProcessor.TAG, sb2.toString());
                                TakePictureProcessor.this.doPictureProcess(camera, handler3, takePictureListener2, bArr, cameraParams2, size, devOrientation, aPTakePictureOption2);
                            } else {
                                TakePictureProcessor.this.notifyTakenPictureData(bArr, camera, handler3, takePictureListener2);
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("onPictureTaken cost: ");
                        sb3.append(System.currentTimeMillis() - j);
                        RVLogger.d(TakePictureProcessor.TAG, sb3.toString());
                    }
                };
                camera2.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, r1);
            } catch (Exception e) {
                e = e;
                StringBuilder sb2 = new StringBuilder("takePicture exp: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                RVLogger.e(TAG, sb2.toString(), e);
                notifyTakenPictureError(camera2, handler, takePictureListener);
            }
        } catch (Exception e2) {
            e = e2;
            handler = handler2;
            StringBuilder sb22 = new StringBuilder("takePicture exp: ");
            sb22.append(System.currentTimeMillis() - currentTimeMillis);
            RVLogger.e(TAG, sb22.toString(), e);
            notifyTakenPictureError(camera2, handler, takePictureListener);
        }
    }

    /* access modifiers changed from: protected */
    public Camera.Size setupPictureParams(Camera camera, int i, CameraParams cameraParams) {
        Camera.Size size;
        if (cameraParams.exif != null) {
            String str = cameraParams.exif.get("minPictureHeight");
            if (!TextUtils.isEmpty(str)) {
                RVLogger.d(TAG, "minPictureHeight set to ".concat(String.valueOf(str)));
                this.f10456a = Integer.valueOf(str).intValue();
            }
        }
        if (cameraParams.getPictureSize() == null) {
            size = CameraUtils.getSuggestPictureSize(camera, this.f10456a);
        } else {
            size = cameraParams.getPictureSize();
        }
        StringBuilder sb = new StringBuilder("takePicture pictureSize: [width:");
        sb.append(size.width);
        sb.append(",\theight:");
        sb.append(size.height);
        sb.append("]");
        RVLogger.d(TAG, sb.toString());
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPictureSize(size.width, size.height);
        camera.setParameters(parameters);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        this.mCameraFacing = cameraInfo.facing;
        return size;
    }

    /* access modifiers changed from: protected */
    public void doPictureProcess(Camera camera, Handler handler, SightCameraView.TakePictureListener takePictureListener, byte[] bArr, CameraParams cameraParams, Camera.Size size, int i, APTakePictureOption aPTakePictureOption) {
        if (cameraParams.isConvertPicture()) {
            if (this.mCameraFacing == 1) {
                a(handler, takePictureListener, bArr, size, cameraParams, i, aPTakePictureOption);
                return;
            }
        }
        saveCommonTakePicture(handler, takePictureListener, bArr, size, cameraParams, i, aPTakePictureOption);
    }

    /* access modifiers changed from: protected */
    public File getSaveFile(APTakePictureOption aPTakePictureOption) {
        if (aPTakePictureOption == null || !aPTakePictureOption.saveToPrivateDir) {
            return FileUtils.makeTakenPicturePath();
        }
        return FileUtils.makeTakenPicturePrivatePath();
    }

    /* access modifiers changed from: protected */
    public Bitmap convertPicture(Bitmap bitmap, byte[] bArr, Camera.Size size, CameraParams cameraParams) {
        Camera.Size size2 = size;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            int orientation = Exif.getOrientation(bArr);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            int[] iArr = {width, height};
            StringBuilder sb = new StringBuilder("convertPicture w: ");
            sb.append(width);
            sb.append(", h: ");
            sb.append(height);
            sb.append(", picSize w: ");
            sb.append(size2.width);
            sb.append(", h: ");
            sb.append(size2.height);
            sb.append(", fixed w: ");
            sb.append(iArr[0]);
            sb.append(", h: ");
            sb.append(iArr[1]);
            sb.append(", rotation: ");
            sb.append(orientation);
            sb.append(", facing: ");
            sb.append(this.mCameraFacing);
            RVLogger.d(TAG, sb.toString());
            if (this.mCameraFacing == 1 && cameraParams.isConvertPicture()) {
                RVLogger.d(TAG, "convertPicture doMirror");
                matrix.postScale(-1.0f, 1.0f);
            }
            if (!(iArr[0] == size2.height && iArr[1] == size2.width)) {
                float scale = ImageUtils.getScale(size2.height, size2.width, (float) iArr[0], (float) iArr[1]);
                RVLogger.d(TAG, "convertPicture before  fixScale: ".concat(String.valueOf(scale)));
                float a2 = a(scale, size2.height, size2.width, iArr[0], iArr[1]);
                matrix.postScale(a2, a2);
                RVLogger.d(TAG, "convertPicture doScale scale: ".concat(String.valueOf(a2)));
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            StringBuilder sb2 = new StringBuilder("convert bitmap result:");
            sb2.append(createBitmap.getWidth());
            sb2.append("x");
            sb2.append(createBitmap.getHeight());
            sb2.append(", cost:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            RVLogger.d(TAG, sb2.toString());
            return createBitmap;
        } catch (Throwable th) {
            RVLogger.e(TAG, "convert bitmap error", th);
            return null;
        }
    }

    private float a(float f, int i, int i2, int i3, int i4) {
        float pow = (float) (1.0d / Math.pow(10.0d, (double) (String.valueOf(Math.min(i, i2)).length() - 1)));
        RVLogger.d(TAG, "fixScale decScale: ".concat(String.valueOf(pow)));
        while (true) {
            if (a(f, i3) && a(f, i4)) {
                return f;
            }
            f -= pow;
        }
    }

    private boolean a(float f, int i) {
        return Math.round(f * ((float) i)) % 2 == 0;
    }

    /* access modifiers changed from: protected */
    public String savePicture(byte[] bArr, Camera.Size size, CameraParams cameraParams, int i, APTakePictureOption aPTakePictureOption) {
        StringBuilder sb = new StringBuilder("savePicture data: ");
        sb.append(bArr);
        sb.append(", picSize: ");
        sb.append(size);
        sb.append(", params: ");
        sb.append(cameraParams);
        sb.append(", orientation: ");
        sb.append(i);
        RVLogger.d(TAG, sb.toString());
        if (bArr == null) {
            return null;
        }
        try {
            return savePicture(FalconFacade.get().cutImageKeepRatio(bArr, size.height, size.width), i, (Point) null, cameraParams, aPTakePictureOption);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("falcon decode bitmap error, ");
            sb2.append(th);
            sb2.append(", save normal");
            RVLogger.w(TAG, sb2.toString());
            File saveFile = getSaveFile(aPTakePictureOption);
            try {
                if (FileUtils.safeCopyToFile(bArr, saveFile)) {
                    return saveFile.getAbsolutePath();
                }
                return null;
            } catch (IOException e) {
                RVLogger.e(TAG, "savePicture error", e);
                return null;
            }
        }
    }

    public static boolean compressJpg(Bitmap bitmap, String str, int i) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            return false;
        }
        APEncodeOptions aPEncodeOptions = new APEncodeOptions();
        aPEncodeOptions.outputFile = str;
        aPEncodeOptions.quality = 2;
        try {
            APEncodeResult compress = ImageEncoder.compress(bitmap, aPEncodeOptions);
            StringBuilder sb = new StringBuilder("compressJpg bitmap: ");
            sb.append(bitmap);
            sb.append(", outPath: ");
            sb.append(str);
            sb.append(", result: ");
            sb.append(compress);
            RVLogger.d(TAG, sb.toString());
            return compress.isSuccess();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("compressJpg native error, bitmap: ");
            sb2.append(bitmap);
            sb2.append(", outPath: ");
            sb2.append(str);
            RVLogger.e(TAG, sb2.toString(), th);
            return false;
        }
    }

    private void a(int i, CameraParams cameraParams) {
        if (i != 0 && !cameraParams.autoRotateTakenPicture) {
            if (cameraParams.exif == null) {
                cameraParams.exif = new HashMap();
            }
            if (i == 90) {
                cameraParams.exif.put("Orientation", "6");
            } else if (i == 180) {
                cameraParams.exif.put("Orientation", "3");
            } else if (i == 270) {
                cameraParams.exif.put("Orientation", PrepareException.ERROR_AUTH_FAIL);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void notifyProcessPictureError(Handler handler, final SightCameraView.TakePictureListener takePictureListener, final int i, final byte[] bArr) {
        handler.post(new Runnable() {
            public void run() {
                takePictureListener.onPictureProcessError(i, bArr);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void notifyTakenPictureError(final Camera camera, Handler handler, final SightCameraView.TakePictureListener takePictureListener) {
        handler.post(new Runnable() {
            public void run() {
                takePictureListener.onPictureTakenError(1, camera);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void notifyTakenPictureData(final byte[] bArr, Camera camera, Handler handler, final SightCameraView.TakePictureListener takePictureListener) {
        handler.post(new Runnable() {
            public void run() {
                if (takePictureListener instanceof SightCameraView.APTakePictureListener) {
                    APTakePicRsp aPTakePicRsp = new APTakePicRsp();
                    aPTakePicRsp.data = bArr;
                    aPTakePicRsp.dataType = 1;
                    ((SightCameraView.APTakePictureListener) takePictureListener).onPictureProcessFinish(aPTakePicRsp);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void notifyTakenPictureBitmap(Bitmap bitmap, Handler handler, SightCameraView.TakePictureListener takePictureListener, int i, byte[] bArr) {
        final Bitmap bitmap2 = bitmap;
        final SightCameraView.TakePictureListener takePictureListener2 = takePictureListener;
        final byte[] bArr2 = bArr;
        final int i2 = i;
        handler.post(new Runnable() {
            public void run() {
                if (!ImageUtils.checkBitmap(bitmap2)) {
                    takePictureListener2.onPictureProcessError(2, bArr2);
                } else if (takePictureListener2 instanceof SightCameraView.APTakePictureListener) {
                    APTakePicRsp aPTakePicRsp = new APTakePicRsp();
                    aPTakePicRsp.bitmap = bitmap2;
                    aPTakePicRsp.orientation = i2;
                    aPTakePicRsp.dataType = 2;
                    ((SightCameraView.APTakePictureListener) takePictureListener2).onPictureProcessFinish(aPTakePicRsp);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void notifyProcessFinished(String str, APImageInfo aPImageInfo, Handler handler, SightCameraView.TakePictureListener takePictureListener) {
        if (aPImageInfo == null) {
            notifyProcessPictureError(handler, takePictureListener, 103, (byte[]) null);
            return;
        }
        long j = 0;
        if (takePictureListener instanceof SightCameraView.TakePictureMPListener) {
            try {
                j = new File(str).length();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("notifyProcessFinished get file size error,  ");
                sb.append(th.toString());
                RVLogger.d(TAG, sb.toString());
            }
        }
        final long j2 = j;
        final String str2 = str;
        final APImageInfo aPImageInfo2 = aPImageInfo;
        final SightCameraView.TakePictureListener takePictureListener2 = takePictureListener;
        handler.post(new Runnable() {
            public void run() {
                StringBuilder sb = new StringBuilder("notifyProcessFinished notify save process picture success, path: ");
                sb.append(str2);
                sb.append(", info: ");
                sb.append(aPImageInfo2);
                RVLogger.d(TakePictureProcessor.TAG, sb.toString());
                SightCameraView.TakePictureListener takePictureListener = takePictureListener2;
                if (takePictureListener instanceof SightCameraView.TakePictureMPListener) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("picSize", j2);
                    ((SightCameraView.TakePictureMPListener) takePictureListener2).onPictureProcessFinish(str2, aPImageInfo2.width, aPImageInfo2.height, aPImageInfo2.orientation, bundle);
                } else if (takePictureListener instanceof SightCameraView.APTakePictureListener) {
                    APTakePicRsp aPTakePicRsp = new APTakePicRsp();
                    aPTakePicRsp.dataType = 0;
                    aPTakePicRsp.savePath = str2;
                    aPTakePicRsp.width = aPImageInfo2.width;
                    aPTakePicRsp.height = aPImageInfo2.height;
                    aPTakePicRsp.orientation = aPImageInfo2.orientation;
                    ((SightCameraView.APTakePictureListener) takePictureListener2).onPictureProcessFinish(aPTakePicRsp);
                } else {
                    takePictureListener.onPictureProcessFinish(str2, aPImageInfo2.width, aPImageInfo2.height, aPImageInfo2.orientation);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public Looper selectLooper(Looper looper) {
        return looper == null ? Looper.getMainLooper() : looper;
    }

    /* access modifiers changed from: protected */
    public boolean saveCommonTakePicture(Handler handler, SightCameraView.TakePictureListener takePictureListener, byte[] bArr, Camera.Size size, CameraParams cameraParams, int i, APTakePictureOption aPTakePictureOption) {
        RVLogger.d(TAG, "saveCommonTakePicture");
        final APTakePictureOption aPTakePictureOption2 = aPTakePictureOption;
        final byte[] bArr2 = bArr;
        final Camera.Size size2 = size;
        final CameraParams cameraParams2 = cameraParams;
        final int i2 = i;
        final Handler handler2 = handler;
        final SightCameraView.TakePictureListener takePictureListener2 = takePictureListener;
        GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
            public void run() {
                APTakePictureOption aPTakePictureOption = aPTakePictureOption2;
                if (aPTakePictureOption == null || aPTakePictureOption.getDataType() != 2) {
                    String savePicture = TakePictureProcessor.this.savePicture(bArr2, size2, cameraParams2, i2, aPTakePictureOption2);
                    APImageInfo imageInfo = APImageInfo.getImageInfo(savePicture);
                    if (TextUtils.isEmpty(savePicture) || imageInfo == null) {
                        TakePictureProcessor.this.notifyProcessPictureError(handler2, takePictureListener2, 103, bArr2);
                    } else {
                        TakePictureProcessor.this.notifyProcessFinished(savePicture, imageInfo, handler2, takePictureListener2);
                    }
                } else {
                    Bitmap bitmap = null;
                    if (bArr2 != null) {
                        try {
                            bitmap = TakePictureProcessor.this.a(aPTakePictureOption2, cameraParams2, FalconFacade.get().cutImageKeepRatio(bArr2, size2.height, size2.width), i2);
                        } catch (Throwable th) {
                            RVLogger.e(TakePictureProcessor.TAG, "saveCommonTakePicture exp", th);
                        }
                    }
                    TakePictureProcessor.this.notifyTakenPictureBitmap(bitmap, handler2, takePictureListener2, i2, bArr2);
                }
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public Bitmap a(APTakePictureOption aPTakePictureOption, CameraParams cameraParams, Bitmap bitmap, int i) {
        boolean z = true;
        if (cameraParams.mActivityRotation >= 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) cameraParams.mActivityRotation);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else if (i == 0 || !cameraParams.autoRotateTakenPicture || !ImageUtils.checkBitmap(bitmap)) {
            z = false;
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.postRotate((float) i);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
        }
        if (!z) {
            i = 0;
        }
        return cropBitmap(aPTakePictureOption, bitmap, i);
    }

    private void a(Handler handler, SightCameraView.TakePictureListener takePictureListener, byte[] bArr, Camera.Size size, CameraParams cameraParams, int i, APTakePictureOption aPTakePictureOption) {
        String str;
        Handler handler2 = handler;
        SightCameraView.TakePictureListener takePictureListener2 = takePictureListener;
        byte[] bArr2 = bArr;
        Camera.Size size2 = size;
        APTakePictureOption aPTakePictureOption2 = aPTakePictureOption;
        try {
            StringBuilder sb = new StringBuilder("falconFacade decode picture, pictureSize: [");
            sb.append(size2.height);
            sb.append("x");
            sb.append(size2.width);
            sb.append("]");
            RVLogger.d(TAG, sb.toString());
            Bitmap convertPicture = convertPicture(FalconFacade.get().cutImageKeepRatio(bArr, size2.height, size2.width), bArr, size2, cameraParams);
            if (aPTakePictureOption2 == null || aPTakePictureOption.getDataType() != 2) {
                int i2 = i;
                str = savePicture(convertPicture, i, (Point) null, cameraParams, aPTakePictureOption);
                if (str != null) {
                    notifyProcessFinished(str, APImageInfo.getImageInfo(str), handler, takePictureListener);
                } else {
                    notifyProcessPictureError(handler, takePictureListener, 103, bArr);
                }
            } else {
                notifyTakenPictureBitmap(cropBitmap(aPTakePictureOption2, convertPicture, i), handler, takePictureListener, i, bArr);
            }
        } catch (Throwable th) {
            RVLogger.e(TAG, "process mirror error", th);
            str = null;
        }
    }

    private void a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("addExif path: ");
        sb.append(str);
        sb.append(", exif: ");
        sb.append(map);
        RVLogger.d(TAG, sb.toString());
        if (map != null && !map.isEmpty() && FileUtils.checkFile(str)) {
            try {
                ExifInterface exifInterface = new ExifInterface(str);
                for (Map.Entry next : map.entrySet()) {
                    exifInterface.setAttribute((String) next.getKey(), (String) next.getValue());
                }
                exifInterface.saveAttributes();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("addExif error, path: ");
                sb2.append(str);
                sb2.append(", exif: ");
                sb2.append(map);
                RVLogger.e(TAG, sb2.toString(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Bitmap cropBitmap(APTakePictureOption aPTakePictureOption, Bitmap bitmap, int i) {
        int i2;
        int i3;
        if (aPTakePictureOption == null || aPTakePictureOption.getAspectRatio() <= 0.0f || !ImageUtils.checkBitmap(bitmap)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        float f3 = f / f2;
        try {
            float aspectRatio = aPTakePictureOption.getAspectRatio();
            if (i == 90 || i == 270) {
                aspectRatio = 1.0f / aPTakePictureOption.getAspectRatio();
            }
            if (f3 > aspectRatio) {
                i3 = (int) (f2 * aspectRatio);
                i2 = height;
            } else {
                i2 = (int) (f / aspectRatio);
                i3 = width;
            }
            StringBuilder sb = new StringBuilder("bitmap crop cropW:");
            sb.append(i3);
            sb.append("cropH:");
            sb.append(i2);
            RVLogger.d(TAG, sb.toString());
            return Bitmap.createBitmap(bitmap, (width - i3) / 2, (height - i2) / 2, i3, i2);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("cropBitmap error: ");
            sb2.append(th.toString());
            RVLogger.e(TAG, sb2.toString(), th);
            return bitmap;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0096 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4 A[ADDED_TO_REGION, Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e9 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0165 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0172 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0175 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017f A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ba A[Catch:{ all -> 0x01c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String savePicture(android.graphics.Bitmap r21, int r22, android.graphics.Point r23, com.alibaba.griver.image.capture.meta.CameraParams r24, com.alibaba.griver.image.capture.meta.APTakePictureOption r25) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            java.io.File r5 = r1.getSaveFile(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "savePicture path: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = ", checkBitmap: "
            r6.append(r7)
            boolean r7 = com.alibaba.griver.base.common.utils.ImageUtils.checkBitmap(r21)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "TakePictureProcessor"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r6)
            r6 = 0
            int r8 = r21.getWidth()     // Catch:{ all -> 0x01c7 }
            int r9 = r21.getHeight()     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            java.lang.String r11 = "picture w,h:"
            r10.<init>(r11)     // Catch:{ all -> 0x01c7 }
            r10.append(r8)     // Catch:{ all -> 0x01c7 }
            java.lang.String r11 = ","
            r10.append(r11)     // Catch:{ all -> 0x01c7 }
            r10.append(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r10)     // Catch:{ all -> 0x01c7 }
            android.hardware.Camera$Size r10 = r24.getPictureSize()     // Catch:{ all -> 0x01c7 }
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 != 0) goto L_0x0090
            if (r8 <= r9) goto L_0x005b
            r10 = r8
            goto L_0x005c
        L_0x005b:
            r10 = r9
        L_0x005c:
            int r12 = r1.f10456a     // Catch:{ all -> 0x01c7 }
            if (r10 <= r12) goto L_0x0090
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch:{ all -> 0x01c7 }
            r12.<init>()     // Catch:{ all -> 0x01c7 }
            if (r10 != r9) goto L_0x006f
            int r8 = r1.f10456a     // Catch:{ all -> 0x01c7 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r8 = r8 * r11
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r9
            goto L_0x0077
        L_0x006f:
            int r9 = r1.f10456a     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r11
            float r8 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r8 = r9 / r8
        L_0x0077:
            r12.postScale(r8, r8)     // Catch:{ all -> 0x01c7 }
            r14 = 0
            r15 = 0
            int r16 = r21.getWidth()     // Catch:{ all -> 0x01c7 }
            int r17 = r21.getHeight()     // Catch:{ all -> 0x01c7 }
            r19 = 1
            r13 = r21
            r18 = r12
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01c7 }
            r12 = r8
            goto L_0x0092
        L_0x0090:
            r12 = r21
        L_0x0092:
            int r8 = r3.mActivityRotation     // Catch:{ all -> 0x01c7 }
            if (r8 < 0) goto L_0x00b4
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ all -> 0x01c7 }
            r8.<init>()     // Catch:{ all -> 0x01c7 }
            int r9 = r3.mActivityRotation     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            r8.postRotate(r9)     // Catch:{ all -> 0x01c7 }
            r13 = 0
            r14 = 0
            int r15 = r12.getWidth()     // Catch:{ all -> 0x01c7 }
            int r16 = r12.getHeight()     // Catch:{ all -> 0x01c7 }
            r18 = 1
            r17 = r8
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01c7 }
            goto L_0x00db
        L_0x00b4:
            if (r0 == 0) goto L_0x00db
            boolean r8 = r3.autoRotateTakenPicture     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x00db
            boolean r8 = com.alibaba.griver.base.common.utils.ImageUtils.checkBitmap(r12)     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x00db
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ all -> 0x01c7 }
            r8.<init>()     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r0     // Catch:{ all -> 0x01c7 }
            r8.postRotate(r9)     // Catch:{ all -> 0x01c7 }
            r13 = 0
            r14 = 0
            int r15 = r12.getWidth()     // Catch:{ all -> 0x01c7 }
            int r16 = r12.getHeight()     // Catch:{ all -> 0x01c7 }
            r18 = 1
            r17 = r8
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01c7 }
        L_0x00db:
            android.graphics.Rect r8 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x0165
            android.graphics.Rect r8 = r3.mSrcRect     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x0165
            boolean r8 = com.alibaba.griver.base.common.utils.ImageUtils.checkBitmap(r12)     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x0165
            int r8 = r12.getWidth()     // Catch:{ all -> 0x01c7 }
            int r9 = r12.getHeight()     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r10 = r3.mSrcRect     // Catch:{ all -> 0x01c7 }
            int r10 = r10.right     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r13 = r3.mSrcRect     // Catch:{ all -> 0x01c7 }
            int r13 = r13.left     // Catch:{ all -> 0x01c7 }
            int r10 = r10 - r13
            android.graphics.Rect r13 = r3.mSrcRect     // Catch:{ all -> 0x01c7 }
            int r13 = r13.bottom     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r14 = r3.mSrcRect     // Catch:{ all -> 0x01c7 }
            int r14 = r14.top     // Catch:{ all -> 0x01c7 }
            int r13 = r13 - r14
            float r8 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r8 = r8 * r11
            float r10 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r10
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r11
            float r10 = (float) r13     // Catch:{ all -> 0x01c7 }
            float r9 = r9 / r10
            android.graphics.Rect r10 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r10 = r10.right     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r11 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r11 = r11.left     // Catch:{ all -> 0x01c7 }
            int r10 = r10 - r11
            float r10 = (float) r10     // Catch:{ all -> 0x01c7 }
            float r10 = r10 * r8
            int r10 = (int) r10     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r11 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r11 = r11.bottom     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r13 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r13 = r13.top     // Catch:{ all -> 0x01c7 }
            int r11 = r11 - r13
            float r11 = (float) r11     // Catch:{ all -> 0x01c7 }
            float r11 = r11 * r9
            int r11 = (int) r11     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r13 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r13 = r13.left     // Catch:{ all -> 0x01c7 }
            float r13 = (float) r13     // Catch:{ all -> 0x01c7 }
            float r13 = r13 * r8
            int r8 = (int) r13     // Catch:{ all -> 0x01c7 }
            android.graphics.Rect r13 = r3.mCropRect     // Catch:{ all -> 0x01c7 }
            int r13 = r13.top     // Catch:{ all -> 0x01c7 }
            float r13 = (float) r13     // Catch:{ all -> 0x01c7 }
            float r13 = r13 * r9
            int r9 = (int) r13     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            java.lang.String r14 = "bitmap crop rect: left:"
            r13.<init>(r14)     // Catch:{ all -> 0x01c7 }
            r13.append(r8)     // Catch:{ all -> 0x01c7 }
            java.lang.String r14 = ", top:"
            r13.append(r14)     // Catch:{ all -> 0x01c7 }
            r13.append(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.String r14 = ", w:"
            r13.append(r14)     // Catch:{ all -> 0x01c7 }
            r13.append(r10)     // Catch:{ all -> 0x01c7 }
            java.lang.String r14 = "h:"
            r13.append(r14)     // Catch:{ all -> 0x01c7 }
            r13.append(r11)     // Catch:{ all -> 0x01c7 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r13)     // Catch:{ all -> 0x01c7 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r12, r8, r9, r10, r11)     // Catch:{ all -> 0x01c7 }
            goto L_0x0169
        L_0x0165:
            android.graphics.Bitmap r8 = r1.cropBitmap(r4, r12, r0)     // Catch:{ all -> 0x01c7 }
        L_0x0169:
            r1.a((int) r0, (com.alibaba.griver.image.capture.meta.CameraParams) r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x01c7 }
            if (r4 != 0) goto L_0x0175
            r4 = 100
            goto L_0x0179
        L_0x0175:
            int r4 = r25.getQuality()     // Catch:{ all -> 0x01c7 }
        L_0x0179:
            boolean r0 = compressJpg(r8, r0, r4)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x01b8
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ all -> 0x01c7 }
            r1.a((android.graphics.Bitmap) r8, (java.lang.String) r6)     // Catch:{ all -> 0x01c7 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.exif     // Catch:{ all -> 0x01c7 }
            r1.a((java.lang.String) r6, (java.util.Map<java.lang.String, java.lang.String>) r0)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = "double check picture, outPath.exists(): "
            r0.<init>(r3)     // Catch:{ all -> 0x01c7 }
            boolean r3 = r5.exists()     // Catch:{ all -> 0x01c7 }
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = ", length: "
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            long r3 = r5.length()     // Catch:{ all -> 0x01c7 }
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = ", modifyTime: "
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            long r3 = r5.lastModified()     // Catch:{ all -> 0x01c7 }
            r0.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01c7 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r7, (java.lang.String) r0)     // Catch:{ all -> 0x01c7 }
        L_0x01b8:
            if (r2 == 0) goto L_0x01cd
            int r0 = r8.getWidth()     // Catch:{ all -> 0x01c7 }
            r2.x = r0     // Catch:{ all -> 0x01c7 }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x01c7 }
            r2.y = r0     // Catch:{ all -> 0x01c7 }
            goto L_0x01cd
        L_0x01c7:
            r0 = move-exception
            java.lang.String r2 = "savePicture error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r7, r2, r0)
        L_0x01cd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.capture.TakePictureProcessor.savePicture(android.graphics.Bitmap, int, android.graphics.Point, com.alibaba.griver.image.capture.meta.CameraParams, com.alibaba.griver.image.capture.meta.APTakePictureOption):java.lang.String");
    }
}
