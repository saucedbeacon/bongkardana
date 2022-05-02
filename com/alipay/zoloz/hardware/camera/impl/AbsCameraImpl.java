package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.WindowManager;
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
import com.alipay.zoloz.hardware.camera.widget.CameraSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;

public abstract class AbsCameraImpl implements ICameraInterface, Camera.AutoFocusMoveCallback {
    private final int AUTO_FOCUS_DELAY = 5000;
    /* access modifiers changed from: private */
    public boolean focusStatus = false;
    private boolean isCameraInit = false;
    private boolean isCameraOpen = false;
    public boolean isCameraStart = false;
    private boolean isFront = true;
    protected boolean isPreviewing = false;
    protected Camera mCamera;
    protected ICameraCallback mCameraCallback;
    private int mCameraID;
    private int mCameraNumber;
    protected int mCameraViewRotationAngle = 90;
    /* access modifiers changed from: private */
    public Context mContext;
    private DeviceSetting mDeviceSetting = new DeviceSetting();
    /* access modifiers changed from: private */
    public int mHeight = 0;
    private final Object mLock = new Object();
    private Camera.Parameters mParams;
    /* access modifiers changed from: private */
    public int mPreviewHeight = 0;
    /* access modifiers changed from: private */
    public int mPreviewWidth = 0;
    /* access modifiers changed from: private */
    public Runnable mRestFocusRunnable = new Runnable() {
        public void run() {
            if (AbsCameraImpl.this.mCamera != null) {
                Camera.Parameters parameters = AbsCameraImpl.this.mCamera.getParameters();
                int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                if (maxNumFocusAreas > 0) {
                    parameters.setFocusAreas((List) null);
                }
                if (maxNumMeteringAreas > 0) {
                    parameters.setMeteringAreas((List) null);
                }
                AbsCameraImpl.this.adjustBestFocusMode(parameters);
            }
        }
    };
    /* access modifiers changed from: private */
    public int mWidth = 0;
    /* access modifiers changed from: private */
    public Handler mWorkHandler;
    private HandlerThread mWorkHandlerThread;

    /* access modifiers changed from: protected */
    public void adjustPreview() {
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

    public void initCamera(int i, int i2, boolean z) {
    }

    public boolean isMirror() {
        return false;
    }

    public void resumePreview() {
    }

    public void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
    }

    public void setOntShotPreviewCallback() {
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

    public AbsCameraImpl(Context context) {
        if (context != null) {
            this.mContext = context;
            this.isCameraInit = false;
            this.isCameraOpen = false;
            this.isCameraStart = false;
            this.isPreviewing = false;
            HandlerThread handlerThread = new HandlerThread("Camera-work");
            this.mWorkHandlerThread = handlerThread;
            handlerThread.start();
            this.mWorkHandler = new Handler(this.mWorkHandlerThread.getLooper());
            return;
        }
        throw new IllegalArgumentException("Context can't be null");
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public Camera.Parameters getParams() {
        return this.mParams;
    }

    public void initCamera(DeviceSetting deviceSetting) {
        if (!this.isCameraInit) {
            recordLog("ztech_enter");
            if (deviceSetting != null) {
                this.mDeviceSetting = deviceSetting;
            }
            this.isCameraInit = true;
        }
    }

    public void releaseCamera() {
        Handler handler = this.mWorkHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mRestFocusRunnable);
            this.mWorkHandlerThread.quitSafely();
        }
        stopCamera();
        if (this.isCameraInit) {
            this.isCameraInit = false;
            this.mContext = null;
            CameraSurfaceView.release();
        }
    }

    public void openCamera(DeviceSetting deviceSetting) {
        if (!this.isCameraOpen) {
            if (deviceSetting != null) {
                this.mDeviceSetting = deviceSetting;
            }
            this.isCameraOpen = true;
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

    public void closeCamera() {
        if (this.isCameraOpen) {
            this.isCameraOpen = false;
        }
    }

    public void startCamera() {
        if (!this.isCameraStart) {
            DeviceSetting deviceSetting = this.mDeviceSetting;
            int cameraID = (deviceSetting == null || deviceSetting.isCameraAuto()) ? 1 : this.mDeviceSetting.getCameraID();
            int numberOfCameras = Camera.getNumberOfCameras();
            this.mCameraNumber = numberOfCameras;
            if (realStartCamera(AndroidCameraUtil.adjustCameraId(this.mContext, cameraID, numberOfCameras))) {
                this.isCameraStart = true;
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopCamera() {
        /*
            r3 = this;
            r3.stopPreview()
            boolean r0 = r3.isCameraStart
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            android.os.Handler r0 = r3.mWorkHandler
            if (r0 == 0) goto L_0x0011
            java.lang.Runnable r1 = r3.mRestFocusRunnable
            r0.removeCallbacks(r1)
        L_0x0011:
            android.hardware.Camera r0 = r3.mCamera
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.hardware.Camera r2 = r3.mCamera     // Catch:{ Exception -> 0x0026 }
            r2.release()     // Catch:{ Exception -> 0x0026 }
            r2 = 0
            r3.mCamera = r2     // Catch:{ Exception -> 0x0026 }
            r3.isCameraStart = r1     // Catch:{ Exception -> 0x0026 }
            goto L_0x0026
        L_0x0024:
            r1 = move-exception
            goto L_0x0028
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0028:
            monitor-exit(r0)
            throw r1
        L_0x002a:
            r3.isCameraStart = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.impl.AbsCameraImpl.stopCamera():void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.impl.AbsCameraImpl.stopPreview():void");
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

    /* access modifiers changed from: protected */
    public void initContext(Context context) {
        this.mContext = context;
    }

    private boolean realStartCamera(int i) {
        try {
            Camera open = Camera.open(i);
            this.mCamera = open;
            if (open == null) {
                if (this.mCameraCallback != null) {
                    this.mCameraCallback.onError(-1);
                }
                return false;
            }
            this.mCameraID = i;
            if (open != null) {
                this.mParams = open.getParameters();
                adjustCameraParams();
                if (this.mCameraCallback == null) {
                    return true;
                }
                if (TestUtil.isRunTest() && TestUtil.isDebug(this.mContext) && TestUtil.isCaptureMode()) {
                    TestUtil.reset();
                }
                this.mCamera.setPreviewCallback(new Camera.PreviewCallback() {
                    public void onPreviewFrame(byte[] bArr, Camera camera) {
                        byte[] readFrame;
                        if (bArr != null && AbsCameraImpl.this.mCameraCallback != null) {
                            if (!TestUtil.isRunTest() || !TestUtil.isDebug(AbsCameraImpl.this.mContext)) {
                                CameraData cameraData = new CameraData(ByteBuffer.wrap(bArr), AbsCameraImpl.this.mWidth, AbsCameraImpl.this.mHeight, 0, (ShortBuffer) null, 0, 0, AbsCameraImpl.this.mPreviewWidth, AbsCameraImpl.this.mPreviewHeight);
                                cameraData.setFocusStatus(AbsCameraImpl.this.focusStatus);
                                AbsCameraImpl.this.mCameraCallback.onPreviewFrame(cameraData);
                            } else if (TestUtil.isCaptureMode()) {
                                TestUtil.saveFrame(bArr);
                                CameraData cameraData2 = new CameraData(ByteBuffer.wrap(bArr), AbsCameraImpl.this.mWidth, AbsCameraImpl.this.mHeight, 0, (ShortBuffer) null, 0, 0, AbsCameraImpl.this.mPreviewWidth, AbsCameraImpl.this.mPreviewHeight);
                                cameraData2.setFocusStatus(AbsCameraImpl.this.focusStatus);
                                AbsCameraImpl.this.mCameraCallback.onPreviewFrame(cameraData2);
                            } else if (TestUtil.isMockMode() && (readFrame = TestUtil.readFrame()) != null) {
                                CameraData cameraData3 = new CameraData(ByteBuffer.wrap(readFrame), AbsCameraImpl.this.mWidth, AbsCameraImpl.this.mHeight, 0, (ShortBuffer) null, 0, 0, AbsCameraImpl.this.mPreviewWidth, AbsCameraImpl.this.mPreviewHeight);
                                cameraData3.setFocusStatus(AbsCameraImpl.this.focusStatus);
                                AbsCameraImpl.this.mCameraCallback.onPreviewFrame(cameraData3);
                            }
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Exception unused) {
            ICameraCallback iCameraCallback = this.mCameraCallback;
            if (iCameraCallback != null) {
                iCameraCallback.onError(-1);
            }
        } catch (Throwable unused2) {
            ICameraCallback iCameraCallback2 = this.mCameraCallback;
            if (iCameraCallback2 != null) {
                iCameraCallback2.onError(-1);
            }
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

    private void adjustCameraParams() {
        if (this.mParams != null) {
            if (this.mCameraID == AndroidCameraUtil.findBackCameraId()) {
                this.isFront = false;
                adjustBackCameraParams();
            } else {
                this.isFront = true;
                adjustFrontCameraParams();
            }
        }
        adjustPreview();
    }

    private void adjustFrontCameraParams() {
        if (this.mParams != null) {
            Camera.Size propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSize(this.mParams.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.mContext), 600);
            if (propPreviewSize != null) {
                if (TestUtil.isRunTest()) {
                    this.mPreviewWidth = TestUtil.getWidth();
                    int height = TestUtil.getHeight();
                    this.mPreviewHeight = height;
                    this.mWidth = this.mPreviewWidth;
                    this.mHeight = height;
                } else {
                    this.mPreviewWidth = propPreviewSize.width;
                    int i = propPreviewSize.height;
                    this.mPreviewHeight = i;
                    this.mWidth = this.mPreviewWidth;
                    this.mHeight = i;
                }
                this.mParams.setPreviewSize(this.mPreviewWidth, this.mPreviewHeight);
            }
            DeviceSetting deviceSetting = this.mDeviceSetting;
            if (deviceSetting != null) {
                this.mCameraViewRotationAngle = getCameraAutoAngle(deviceSetting);
            }
            adjustBestFocusMode(this.mParams);
        }
    }

    private void adjustBackCameraParams() {
        if (this.mParams != null) {
            Camera.Size backCameraPreviewSize = AndroidCameraUtil.getInstance().getBackCameraPreviewSize(this.mParams.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.mContext), this.mDeviceSetting.getCameraPreviewMinSize(), this.mDeviceSetting.getCameraPreviewMaxSize());
            if (backCameraPreviewSize != null) {
                if (TestUtil.isRunTest()) {
                    this.mPreviewWidth = TestUtil.getWidth();
                    int height = TestUtil.getHeight();
                    this.mPreviewHeight = height;
                    this.mWidth = this.mPreviewWidth;
                    this.mHeight = height;
                } else {
                    this.mPreviewWidth = backCameraPreviewSize.width;
                    int i = backCameraPreviewSize.height;
                    this.mPreviewHeight = i;
                    this.mWidth = this.mPreviewWidth;
                    this.mHeight = i;
                }
                this.mParams.setPreviewSize(this.mPreviewWidth, this.mPreviewHeight);
            }
            DeviceSetting deviceSetting = this.mDeviceSetting;
            if (deviceSetting != null) {
                this.mCameraViewRotationAngle = getCameraAutoAngle(deviceSetting);
            }
            adjustBestFocusMode(this.mParams);
        }
    }

    public void autoFocus(List<Camera.Area> list, final Camera.AutoFocusCallback autoFocusCallback) {
        List<Camera.Area> subList = list.subList(0, 1);
        Camera.Parameters parameters = this.mCamera.getParameters();
        int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
        int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
        if (maxNumFocusAreas <= 0) {
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.post(this.mRestFocusRunnable);
            }
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
        try {
            this.mCamera.setParameters(parameters);
            try {
                this.focusStatus = false;
                this.mCamera.autoFocus(new Camera.AutoFocusCallback() {
                    public void onAutoFocus(boolean z, Camera camera) {
                        boolean unused = AbsCameraImpl.this.focusStatus = true;
                        if (AbsCameraImpl.this.mWorkHandler != null) {
                            AbsCameraImpl.this.mWorkHandler.postDelayed(AbsCameraImpl.this.mRestFocusRunnable, 5000);
                        }
                        autoFocusCallback.onAutoFocus(z, camera);
                    }
                });
            } catch (RuntimeException unused) {
            }
        } catch (Exception unused2) {
            Handler handler2 = this.mWorkHandler;
            if (handler2 != null) {
                handler2.post(this.mRestFocusRunnable);
            }
            autoFocusCallback.onAutoFocus(false, this.mCamera);
        }
    }

    private String getBestFocusMode(Camera.Parameters parameters, boolean z) {
        if (this.mCamera == null) {
            return null;
        }
        String str = z ? "continuous-video" : "continuous-picture";
        if (parameters.getSupportedFocusModes().contains(str)) {
            return str;
        }
        if (parameters.getSupportedFocusModes().contains("auto")) {
            return "auto";
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

    public void onAutoFocusMoving(boolean z, Camera camera) {
        this.focusStatus = !z;
    }
}
