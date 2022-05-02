package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.hardware.camera.CameraParams;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.utils.AndroidCameraUtil;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;

@RequiresApi(api = 16)
public class PermissionAndroidImpl implements ICameraInterface, Camera.AutoFocusMoveCallback {
    private final int AUTO_FOCUS_DELAY = 5000;
    /* access modifiers changed from: private */
    public boolean focusStatus = false;
    private boolean isCameraInit = false;
    private boolean isCameraStart = false;
    private boolean isFront = true;
    private boolean isPreviewing = false;
    /* access modifiers changed from: private */
    public Camera mCamera;
    /* access modifiers changed from: private */
    public ICameraCallback mCameraCallback;
    private int mCameraID;
    private int mCameraViewRotationAngle = 90;
    private Context mContext;
    private DeviceSetting mDeviceSetting = null;
    /* access modifiers changed from: private */
    public int mHeight = 0;
    private final Object mLock = new Object();
    private boolean mOneShotePreviewCallback = false;
    private Camera.Parameters mParams;
    private int mPreferPreviewHeight = 0;
    private int mPreferPreviewWidth = 0;
    /* access modifiers changed from: private */
    public int mPreviewHeight = 0;
    /* access modifiers changed from: private */
    public int mPreviewWidth = 0;
    /* access modifiers changed from: private */
    public Runnable mRestFocusRunnable = new Runnable() {
        public void run() {
            if (PermissionAndroidImpl.this.mCamera != null) {
                try {
                    Camera.Parameters parameters = PermissionAndroidImpl.this.mCamera.getParameters();
                    int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                    int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                    if (maxNumFocusAreas > 0) {
                        parameters.setFocusAreas((List) null);
                    }
                    if (maxNumMeteringAreas > 0) {
                        parameters.setMeteringAreas((List) null);
                    }
                    PermissionAndroidImpl.this.adjustBestFocusMode(parameters);
                } catch (Exception unused) {
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public int mWidth = 0;
    /* access modifiers changed from: private */
    public Handler mWorkHandler;
    private HandlerThread mWorkHandlerThread;

    public void closeCamera() {
    }

    public PointF colorToDepth(PointF pointF) {
        return null;
    }

    public PointF depthToColor(PointF pointF) {
        return null;
    }

    public CameraParams getCameraParams() {
        return null;
    }

    public String getCameraSN() {
        return null;
    }

    public int getColorMode() {
        return 0;
    }

    public int getDepthHeight() {
        return 0;
    }

    public int getDepthWidth() {
        return 0;
    }

    public String getFirmwareVersion() {
        return null;
    }

    public Rect getROI() {
        return null;
    }

    public Object getUVCCamera() {
        return null;
    }

    public boolean isMirror() {
        return false;
    }

    public void openCamera(DeviceSetting deviceSetting) {
    }

    public void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
    }

    /* access modifiers changed from: private */
    public void adjustBestFocusMode(Camera.Parameters parameters) {
        String bestFocusMode = getBestFocusMode(parameters, this.isFront);
        if (!TextUtils.isEmpty(bestFocusMode)) {
            parameters.setFocusMode(bestFocusMode);
        }
        this.mCamera.setParameters(parameters);
        this.mCamera.setAutoFocusMoveCallback(this);
    }

    public PermissionAndroidImpl(Context context) {
        this.mContext = context;
        HandlerThread handlerThread = new HandlerThread("Camera-work");
        this.mWorkHandlerThread = handlerThread;
        handlerThread.start();
        this.mWorkHandler = new Handler(this.mWorkHandlerThread.getLooper());
    }

    public void initCamera(@NonNull DeviceSetting deviceSetting) {
        if (!this.isCameraInit) {
            recordLog("ztech_enter");
            this.mDeviceSetting = deviceSetting;
            this.isCameraInit = true;
        }
    }

    public void initCamera(int i, int i2, boolean z) {
        this.mPreferPreviewWidth = i;
        this.mPreferPreviewHeight = i2;
        this.mOneShotePreviewCallback = z;
        this.mDeviceSetting = new DeviceSetting();
    }

    @RequiresApi(api = 18)
    public void releaseCamera() {
        this.mWorkHandler.removeCallbacks(this.mRestFocusRunnable);
        this.mWorkHandlerThread.quitSafely();
        this.isCameraInit = false;
        this.mContext = null;
    }

    public void startCamera() {
        if (!this.isCameraStart) {
            DeviceSetting deviceSetting = this.mDeviceSetting;
            if (realStartCamera(AndroidCameraUtil.adjustCameraId(this.mContext, (deviceSetting == null || deviceSetting.isCameraAuto()) ? 1 : this.mDeviceSetting.getCameraID(), Camera.getNumberOfCameras()))) {
                this.isCameraStart = true;
                ICameraCallback iCameraCallback = this.mCameraCallback;
                if (iCameraCallback != null) {
                    iCameraCallback.onSuccess();
                }
            }
        }
    }

    private boolean realStartCamera(int i) {
        Camera open = Camera.open(i);
        this.mCamera = open;
        if (open == null) {
            this.mCameraCallback.onError(1);
            return false;
        }
        this.mCameraID = i;
        if (open == null) {
            return false;
        }
        this.mParams = open.getParameters();
        adjustCameraParams();
        if (this.mOneShotePreviewCallback) {
            this.mCamera.setOneShotPreviewCallback(new Camera.PreviewCallback() {
                public void onPreviewFrame(byte[] bArr, Camera camera) {
                }
            });
        } else if (this.mCameraCallback != null) {
            this.mCamera.setPreviewCallback(new Camera.PreviewCallback() {
                public void onPreviewFrame(byte[] bArr, Camera camera) {
                    if (bArr != null && PermissionAndroidImpl.this.mCameraCallback != null) {
                        PermissionAndroidImpl.this.mCameraCallback.onPreviewFrame(new CameraData(ByteBuffer.wrap(bArr), PermissionAndroidImpl.this.mWidth, PermissionAndroidImpl.this.mHeight, 0, (ShortBuffer) null, 0, 0, PermissionAndroidImpl.this.mPreviewWidth, PermissionAndroidImpl.this.mPreviewHeight));
                    }
                }
            });
        }
        return true;
    }

    private void adjustCameraParams() {
        if (this.mParams != null) {
            if (this.mCameraID == AndroidCameraUtil.findBackCameraId()) {
                this.isFront = false;
                adjustBackCameraParams();
                return;
            }
            this.isFront = true;
            adjustFrontCameraParams();
        }
    }

    private void adjustFrontCameraParams() {
        Camera.Parameters parameters = this.mParams;
        if (parameters != null) {
            if (isSupported(parameters.getSupportedPreviewSizes(), this.mPreferPreviewWidth, this.mPreferPreviewHeight)) {
                this.mPreviewWidth = this.mPreferPreviewWidth;
                this.mPreviewHeight = this.mPreferPreviewHeight;
            } else {
                Camera.Size propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSize(this.mParams.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.mContext), 600);
                if (propPreviewSize != null) {
                    this.mPreviewWidth = propPreviewSize.width;
                    this.mPreviewHeight = propPreviewSize.height;
                }
            }
            int i = this.mPreviewWidth;
            this.mWidth = i;
            int i2 = this.mPreviewHeight;
            this.mHeight = i2;
            this.mParams.setPreviewSize(i, i2);
            DeviceSetting deviceSetting = this.mDeviceSetting;
            if (deviceSetting != null) {
                int cameraAutoAngle = getCameraAutoAngle(deviceSetting);
                this.mCameraViewRotationAngle = cameraAutoAngle;
                this.mCamera.setDisplayOrientation(cameraAutoAngle);
            }
            adjustBestFocusMode(this.mParams);
        }
    }

    private void adjustBackCameraParams() {
        if (this.mParams != null) {
            Camera.Size backCameraPreviewSize = AndroidCameraUtil.getInstance().getBackCameraPreviewSize(this.mParams.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.mContext), 1024, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
            if (backCameraPreviewSize != null) {
                this.mPreviewWidth = backCameraPreviewSize.width;
                int i = backCameraPreviewSize.height;
                this.mPreviewHeight = i;
                int i2 = this.mPreviewWidth;
                this.mWidth = i2;
                this.mHeight = i;
                this.mParams.setPreviewSize(i2, i);
            }
            DeviceSetting deviceSetting = this.mDeviceSetting;
            if (deviceSetting != null) {
                int cameraAutoAngle = getCameraAutoAngle(deviceSetting);
                this.mCameraViewRotationAngle = cameraAutoAngle;
                this.mCamera.setDisplayOrientation(cameraAutoAngle);
            }
            adjustBestFocusMode(this.mParams);
        }
    }

    public void autoFocus(List<Camera.Area> list, final Camera.AutoFocusCallback autoFocusCallback) {
        try {
            List<Camera.Area> subList = list.subList(0, 1);
            Camera.Parameters parameters = this.mCamera.getParameters();
            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
            int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
            if (maxNumFocusAreas <= 0) {
                this.mWorkHandler.post(this.mRestFocusRunnable);
                autoFocusCallback.onAutoFocus(false, this.mCamera);
                return;
            }
            if (maxNumFocusAreas > 0) {
                parameters.setFocusAreas(maxNumFocusAreas > 1 ? list : subList);
            }
            if (maxNumMeteringAreas > 0) {
                if (maxNumMeteringAreas <= 1) {
                    list = subList;
                }
                parameters.setMeteringAreas(list);
            }
            parameters.setFocusMode("auto");
            this.mCamera.setParameters(parameters);
            try {
                this.focusStatus = false;
                this.mCamera.autoFocus(new Camera.AutoFocusCallback() {
                    public void onAutoFocus(boolean z, Camera camera) {
                        boolean unused = PermissionAndroidImpl.this.focusStatus = true;
                        if (PermissionAndroidImpl.this.mWorkHandler != null) {
                            PermissionAndroidImpl.this.mWorkHandler.postDelayed(PermissionAndroidImpl.this.mRestFocusRunnable, 5000);
                        }
                        autoFocusCallback.onAutoFocus(z, camera);
                    }
                });
            } catch (RuntimeException unused) {
            }
        } catch (Exception unused2) {
            this.mWorkHandler.post(this.mRestFocusRunnable);
            autoFocusCallback.onAutoFocus(false, this.mCamera);
        }
    }

    private int getCameraAutoAngle(DeviceSetting deviceSetting) {
        if (deviceSetting == null) {
            throw new IllegalArgumentException("deviceSetting can't be null");
        } else if (deviceSetting.isDisplayAuto()) {
            return getCameraAutoAngle(this.mCameraID);
        } else {
            return deviceSetting.getDisplayAngle();
        }
    }

    private int getCameraAutoAngle(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            if (BuildConfig.OFFLINE.booleanValue()) {
                cameraInfo.orientation = 270;
            }
            return (360 - ((cameraInfo.orientation + i2) % AUScreenAdaptTool.WIDTH_BASE)) % AUScreenAdaptTool.WIDTH_BASE;
        }
        if (BuildConfig.OFFLINE.booleanValue()) {
            cameraInfo.orientation = 90;
        }
        return ((cameraInfo.orientation - i2) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
    }

    private String getBestFocusMode(Camera.Parameters parameters, boolean z) {
        if (this.mCamera == null) {
            return null;
        }
        String str = z ? "continuous-video" : "continuous-picture";
        if (parameters.getSupportedFocusModes().contains(str)) {
            return str;
        }
        if (parameters.getSupportedFocusModes().contains("macro")) {
            return "macro";
        }
        if (parameters.getSupportedFocusModes().contains("fixed")) {
            return "fixed";
        }
        if (parameters.getSupportedFocusModes().size() == 1) {
            return parameters.getSupportedFocusModes().get(0);
        }
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopCamera() {
        /*
            r3 = this;
            r3.stopPreview()
            boolean r0 = r3.isCameraStart
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            android.hardware.Camera r0 = r3.mCamera
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.hardware.Camera r2 = r3.mCamera     // Catch:{ Exception -> 0x001d }
            r2.release()     // Catch:{ Exception -> 0x001d }
            r2 = 0
            r3.mCamera = r2     // Catch:{ Exception -> 0x001d }
            r3.isCameraStart = r1     // Catch:{ Exception -> 0x001d }
            goto L_0x001d
        L_0x001b:
            r1 = move-exception
            goto L_0x001f
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001f:
            monitor-exit(r0)
            throw r1
        L_0x0021:
            r3.isCameraStart = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.impl.PermissionAndroidImpl.stopCamera():void");
    }

    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        if (!this.isPreviewing) {
            try {
                this.mCamera.setPreviewDisplay(surfaceHolder);
            } catch (IOException unused) {
            }
            this.mCamera.startPreview();
            this.isPreviewing = true;
        }
    }

    public void resumePreview() {
        if (!this.isPreviewing) {
            this.mCamera.startPreview();
            this.isPreviewing = true;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopPreview() {
        /*
            r3 = this;
            boolean r0 = r3.isPreviewing
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.hardware.Camera r0 = r3.mCamera
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r1 = 0
            android.hardware.Camera r2 = r3.mCamera     // Catch:{ Exception -> 0x001f }
            r2.setOneShotPreviewCallback(r1)     // Catch:{ Exception -> 0x001f }
            android.hardware.Camera r2 = r3.mCamera     // Catch:{ Exception -> 0x001f }
            r2.setPreviewCallback(r1)     // Catch:{ Exception -> 0x001f }
            android.hardware.Camera r2 = r3.mCamera     // Catch:{ Exception -> 0x001f }
            r2.stopPreview()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x0026
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            r3.mCameraCallback = r1
            r0 = 0
            r3.isPreviewing = r0
            goto L_0x0028
        L_0x0026:
            monitor-exit(r0)
            throw r1
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.impl.PermissionAndroidImpl.stopPreview():void");
    }

    public void setCallback(ICameraCallback iCameraCallback) {
        this.mCameraCallback = iCameraCallback;
    }

    public int getCameraViewRotation() {
        return this.mCameraViewRotationAngle;
    }

    public int getColorWidth() {
        return this.mWidth;
    }

    public int getColorHeight() {
        return this.mHeight;
    }

    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    public void setOntShotPreviewCallback() {
        Camera camera = this.mCamera;
        if (camera != null && this.mCameraCallback != null) {
            camera.setOneShotPreviewCallback(new Camera.PreviewCallback() {
                public void onPreviewFrame(byte[] bArr, Camera camera) {
                    if (bArr != null && PermissionAndroidImpl.this.mCameraCallback != null) {
                        PermissionAndroidImpl.this.mCameraCallback.onPreviewFrame(new CameraData(ByteBuffer.wrap(bArr), PermissionAndroidImpl.this.mWidth, PermissionAndroidImpl.this.mHeight, 0, (ShortBuffer) null, 0, 0, PermissionAndroidImpl.this.mPreviewWidth, PermissionAndroidImpl.this.mPreviewHeight));
                    }
                }
            });
        }
    }

    private void recordLog(String str) {
        ZimRecordService zimRecordService;
        try {
            if (BioServiceManager.getCurrentInstance() != null && (zimRecordService = (ZimRecordService) BioServiceManager.getCurrentInstance().getBioService(ZimRecordService.class)) != null) {
                MetaRecord metaRecord = new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", str, 1);
                HashMap hashMap = new HashMap();
                hashMap.put("module", "hardware");
                zimRecordService.write(metaRecord, hashMap);
            }
        } catch (Exception unused) {
        }
    }

    private boolean isSupported(List<Camera.Size> list, int i, int i2) {
        if (list == null) {
            return false;
        }
        for (Camera.Size next : list) {
            if (next.width == i && next.height == i2) {
                int i3 = next.width;
                int i4 = next.height;
                return true;
            }
        }
        return false;
    }

    public void onAutoFocusMoving(boolean z, Camera camera) {
        this.focusStatus = !z;
    }
}
