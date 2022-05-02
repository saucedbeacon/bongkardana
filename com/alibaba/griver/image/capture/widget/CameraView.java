package com.alibaba.griver.image.capture.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.capture.listener.IRecordListener;
import com.alibaba.griver.image.capture.meta.APVideoRecordRsp;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.alibaba.griver.image.capture.utils.OrientationDetector;
import com.alibaba.griver.image.capture.utils.VideoUtils;
import com.alibaba.griver.image.capture.widget.SightCameraView;
import com.alibaba.griver.image.framework.utils.PermissionHelper;
import com.alibaba.griver.image.framework.utils.StringUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import id.dana.util.permission.ManifestPermission;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(15)
public abstract class CameraView extends TextureView implements Camera.AutoFocusCallback, TextureView.SurfaceTextureListener {
    protected static final int CAMERA_INIT_FAILED = 1;
    protected static final int CAMERA_INIT_SUCCESS = 2;
    protected static final int CAMERA_NOT_INIT = 0;
    public static final String TAG = "CameraView";
    public static int mMode = 1;
    public static long sCreateTime = 0;
    protected static final AtomicBoolean sRequirePermissions = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    private final Object f10464a = new Object();
    protected WeakReference<Object> activityOrFragment;
    protected long audioCurTimeStamp = 0;
    protected boolean audioPermissionDelay = false;
    private int b = 90;
    private int c = -1;
    protected CameraParams cameraParams;
    protected Camera.CameraInfo curCameraInfo = null;
    private boolean d;
    private boolean e;
    /* access modifiers changed from: private */
    public boolean f = false;
    private int g = 0;
    private float h = 0.08f;
    private int i = 0;
    protected boolean initCameraError = false;
    protected boolean isSwitching = false;
    private int j = 0;
    private APVideoRecordRsp.RecordPhase k = APVideoRecordRsp.RecordPhase.INIT;
    private boolean l = true;
    protected String lastChannelId;
    protected String lastPublishUrl;
    protected volatile int loseCount = 0;
    private Handler m = new Handler() {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                CameraView.this.notifyOpenCameraError();
            } else if (i == 2) {
                boolean unused = CameraView.this.f = false;
            }
        }
    };
    protected volatile int mBeautyValue = -1;
    protected Camera mCamera;
    protected int mCameraFacing = 0;
    protected Object mCameraInitLock = new Object();
    protected int mCameraStatus = 0;
    protected Context mContext;
    protected boolean mHasReqPermissionTime = false;
    protected boolean mInitCameraAsync = false;
    protected boolean mIsOpened = false;
    protected WrapperListener mListener = new WrapperListener();
    protected Camera.Size mPreviewSize;
    protected int mRotation = 90;
    protected int mScreenRotation = -1;
    protected SurfaceTexture mSurfaceTexture;
    protected boolean mUseEventbus = false;
    protected boolean mUseFrameData = false;
    protected boolean permissionAftsReopen = false;
    protected long videoCurTimeStamp = 0;

    private int a(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private static boolean a(Context context) {
        return false;
    }

    protected static int mapScreenDegree(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 270;
        }
        return 180;
    }

    /* access modifiers changed from: protected */
    public abstract void afterReopen();

    /* access modifiers changed from: protected */
    public abstract void handleOnSurfaceTextureAvailable(SurfaceTexture surfaceTexture);

    /* access modifiers changed from: protected */
    public abstract Camera reopenCamera(int i2);

    /* access modifiers changed from: protected */
    public abstract Camera switchCamera();

    public CameraView(Context context) {
        super(context);
        sCreateTime = System.currentTimeMillis();
        this.mContext = context;
        setSurfaceTextureListener(this);
        RVLogger.d("CameraView construct!");
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sCreateTime = System.currentTimeMillis();
        this.mContext = context;
        setSurfaceTextureListener(this);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        sCreateTime = System.currentTimeMillis();
        this.mContext = context;
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: protected */
    public void setOnRecordListener(SightCameraView.OnRecordListener onRecordListener) {
        this.mListener.setVideoRecordListener(onRecordListener);
    }

    /* access modifiers changed from: protected */
    public void setActivityOrFragment(WeakReference<Object> weakReference) {
        this.activityOrFragment = weakReference;
    }

    public void setRecordPhase(APVideoRecordRsp.RecordPhase recordPhase) {
        this.k = recordPhase;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        WeakReference<Object> weakReference;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("###onSurfaceTextureAvailable w:");
        sb.append(i2);
        sb.append(", h:");
        sb.append(i3);
        RVLogger.d(sb.toString());
        StringBuilder sb2 = new StringBuilder("onSurfaceTextureAvailable activityOrFragment: ");
        WeakReference<Object> weakReference2 = this.activityOrFragment;
        sb2.append(weakReference2 != null ? weakReference2.get() : null);
        RVLogger.d(sb2.toString());
        this.mSurfaceTexture = surfaceTexture;
        if (PermissionHelper.checkVideoPermission(mMode, this.audioPermissionDelay) || (weakReference = this.activityOrFragment) == null || weakReference.get() == null) {
            handleOnSurfaceTextureAvailable(this.mSurfaceTexture);
        } else if (this.audioPermissionDelay) {
            RVLogger.d("onSurfaceTextureAvailable requireCameraPermission");
            this.mHasReqPermissionTime = true;
            PermissionHelper.requireVideoPermission(this.activityOrFragment.get(), 1, 2);
        } else {
            RVLogger.d("onSurfaceTextureAvailable requireVideoPermission");
            this.mHasReqPermissionTime = true;
            PermissionHelper.requireVideoPermission(this.activityOrFragment.get(), mMode, 2);
        }
    }

    /* access modifiers changed from: protected */
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 0;
        boolean z = true;
        while (true) {
            if (i3 >= iArr.length) {
                break;
            }
            boolean z2 = iArr[i3] == 0;
            z &= z2;
            if (!z2) {
                if ("android.permission.CAMERA".equals(strArr[i3])) {
                    notifyOpenCameraError();
                    break;
                } else if (ManifestPermission.RECORD_AUDIO.equals(strArr[i3])) {
                    notifyMicError();
                    break;
                }
            }
            i3++;
        }
        StringBuilder sb = new StringBuilder("onRequestPermissionsResult granted:");
        sb.append(z);
        sb.append(", requestCode:");
        sb.append(i2);
        RVLogger.d(sb.toString());
        if (!z) {
            return;
        }
        if (i2 == 4) {
            this.permissionAftsReopen = true;
            if (!this.audioPermissionDelay) {
                afterReopen();
            }
            this.permissionAftsReopen = false;
            return;
        }
        handleOnSurfaceTextureAvailable(this.mSurfaceTexture);
    }

    /* access modifiers changed from: protected */
    public void setCameraParams(CameraParams cameraParams2) {
        this.cameraParams = cameraParams2;
        if (cameraParams2 != null) {
            this.mCameraFacing = cameraParams2.isDefaultCameraFront() ? 1 : 0;
            StringBuilder sb = new StringBuilder("setCameraParams mCameraFacing:");
            sb.append(this.mCameraFacing);
            sb.append(";flashmode=");
            sb.append(cameraParams2.getFlashMode());
            RVLogger.d(sb.toString());
            this.audioPermissionDelay = cameraParams2.audioPermissionDelay;
        }
    }

    private boolean a() {
        CameraParams cameraParams2 = this.cameraParams;
        return cameraParams2 != null && !StringUtils.isEmptyOrNullStr(cameraParams2.getFlashMode());
    }

    /* access modifiers changed from: protected */
    public int getRecordType() {
        CameraParams cameraParams2 = this.cameraParams;
        if (cameraParams2 == null) {
            return 0;
        }
        return cameraParams2.recordType;
    }

    public boolean isLive() {
        return getRecordType() == 1;
    }

    /* access modifiers changed from: protected */
    public void initCamera(boolean z) {
        boolean z2;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        StringBuilder sb = new StringBuilder("initCamera start mCameraFacing=");
        sb.append(this.mCameraFacing);
        RVLogger.d(sb.toString());
        if (!Environment.getExternalStorageState().equals("mounted")) {
            notifySdcardError();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i5 = 0;
        while (true) {
            if (i5 >= numberOfCameras) {
                z2 = false;
                break;
            }
            Camera.getCameraInfo(i5, cameraInfo);
            this.c = i5;
            StringBuilder sb2 = new StringBuilder(" initCamera > facing=");
            sb2.append(cameraInfo.facing);
            sb2.append(" mCameraFacing=");
            sb2.append(this.mCameraFacing);
            sb2.append(" i= ");
            sb2.append(i5);
            sb2.append(" total=");
            sb2.append(numberOfCameras);
            RVLogger.d(sb2.toString());
            if (cameraInfo.facing == this.mCameraFacing || numberOfCameras == 1) {
                a(cameraInfo, i5);
                z2 = true;
            } else {
                i5++;
            }
        }
        if (!z2 && numberOfCameras > 0) {
            RVLogger.d("> not exist needed camera,default to open first camera");
            Camera.getCameraInfo(0, cameraInfo);
            this.c = 0;
            a(cameraInfo, 0);
        }
        Camera camera = this.mCamera;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(CameraParams.FLASH_MODE_OFF) && !a()) {
                RVLogger.d("setFlashMode off");
                parameters.setFlashMode(CameraParams.FLASH_MODE_OFF);
            } else if (a() && supportedFlashModes != null && supportedFlashModes.contains(this.cameraParams.getFlashMode())) {
                StringBuilder sb3 = new StringBuilder("setFlashMode mode=");
                sb3.append(this.cameraParams.getFlashMode());
                RVLogger.d(sb3.toString());
                parameters.setFlashMode(this.cameraParams.getFlashMode());
            }
            if (parameters.getMaxNumFocusAreas() > 0) {
                this.d = true;
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                this.e = true;
            }
            a(parameters);
            parameters.setPreviewFormat(17);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.l) {
                if (supportedFocusModes.contains("auto") && getRecordType() == 3 && mMode == 0) {
                    parameters.setFocusMode("auto");
                } else if (supportedFocusModes.contains("continuous-video") && mMode == 0) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                }
            }
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            Collections.sort(supportedPreviewFpsRange, new Comparator<int[]>() {
                public int compare(int[] iArr, int[] iArr2) {
                    return iArr2[0] - iArr[0];
                }
            });
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 >= supportedPreviewFpsRange.size()) {
                    break;
                }
                iArr = supportedPreviewFpsRange.get(i6);
                i2 = iArr[0];
                i3 = iArr[1];
                StringBuilder sb4 = new StringBuilder("camera fpsRange minfps=");
                sb4.append(i2);
                sb4.append(";maxfps=");
                sb4.append(i3);
                RVLogger.d(sb4.toString());
                if (iArr[1] > 30000 || (i6 < supportedPreviewFpsRange.size() - 1 && iArr[0] >= iArr[1] && supportedPreviewFpsRange.get(i6 + 1)[1] >= 20000)) {
                    i6++;
                    i7 = i2;
                    i8 = i3;
                }
            }
            if (iArr[1] >= 18000 || (i4 = i6 - 1) < 0) {
                i7 = i2;
                i8 = i3;
            } else {
                i7 = supportedPreviewFpsRange.get(i4)[0];
                i8 = supportedPreviewFpsRange.get(i4)[1];
                StringBuilder sb5 = new StringBuilder("camera fpsRange minfps=");
                sb5.append(i7);
                sb5.append(";maxfps=");
                sb5.append(i8);
                RVLogger.d(sb5.toString());
            }
            parameters.setPreviewFpsRange(i7, i8);
            StringBuilder sb6 = new StringBuilder("camera current scene mode : ");
            sb6.append(parameters.getSceneMode());
            sb6.append("; min fps:");
            sb6.append(i7);
            sb6.append(", max fps");
            sb6.append(i8);
            RVLogger.d(sb6.toString());
            int a2 = a((Activity) this.mContext, cameraInfo.facing, this.curCameraInfo);
            this.mRotation = a2;
            parameters.setRotation(a2);
            this.mCamera.setParameters(parameters);
            if (z && (getParent() instanceof SightCameraViewImpl)) {
                post(new Runnable() {
                    public void run() {
                        CameraView.this.reLayout();
                    }
                });
            }
            this.f = false;
            notifyCameraOpen();
            return;
        }
        RVLogger.d("open camera error 2");
        throw new RuntimeException("open camera error");
    }

    private void a(Camera.CameraInfo cameraInfo, int i2) {
        try {
            this.mCamera = Camera.open(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("open camera error exp=");
            sb.append(e2.getMessage());
            RVLogger.d(sb.toString());
            this.mCamera = Camera.open(i2);
        }
        if (this.mCamera != null) {
            this.mCameraFacing = cameraInfo.facing;
            this.curCameraInfo = cameraInfo;
            return;
        }
        RVLogger.d("open camera error 1");
        throw new RuntimeException("open camera error");
    }

    public void startPreview() {
        this.mCamera.startPreview();
        this.mIsOpened = true;
    }

    private int a(Activity activity, int i2, Camera.CameraInfo cameraInfo) {
        int i3;
        int i4;
        if (cameraInfo == null) {
            try {
                Camera.getCameraInfo(i2, cameraInfo);
            } catch (Exception unused) {
            }
        }
        updateScreenRotation(activity);
        StringBuilder sb = new StringBuilder("getDefaultDisplay().getRotation(): ");
        sb.append(this.mScreenRotation);
        RVLogger.d(sb.toString());
        int mapScreenDegree = mapScreenDegree(this.mScreenRotation);
        if (cameraInfo.facing == 1) {
            i4 = (360 - ((cameraInfo.orientation + mapScreenDegree) % AUScreenAdaptTool.WIDTH_BASE)) % AUScreenAdaptTool.WIDTH_BASE;
            i3 = 270;
        } else {
            i4 = ((cameraInfo.orientation - mapScreenDegree) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
            i3 = 90;
        }
        this.mCamera.setDisplayOrientation(i4);
        this.b = i4;
        StringBuilder sb2 = new StringBuilder("############ mCamera.setDisplayOrientation:");
        sb2.append(i4);
        sb2.append(", cur camera orientation=");
        sb2.append(cameraInfo.orientation);
        RVLogger.d(sb2.toString());
        return (cameraInfo.orientation > 270 || cameraInfo.orientation <= 0) ? i3 : cameraInfo.orientation;
    }

    /* access modifiers changed from: protected */
    public void releaseCamera() {
        boolean z = false;
        this.mIsOpened = false;
        StringBuilder sb = new StringBuilder("releaseCamera -- enter initCameraError=");
        sb.append(this.initCameraError);
        sb.append(">>>mCamera==null?");
        if (this.mCamera == null) {
            z = true;
        }
        sb.append(z);
        RVLogger.d(sb.toString());
        try {
            synchronized (this.f10464a) {
                if (this.mCamera != null && !this.initCameraError) {
                    this.mCamera.stopPreview();
                    this.mCamera.release();
                    this.mCamera = null;
                    RVLogger.d("releaseCamera -- done");
                }
            }
        } catch (Exception e2) {
            RVLogger.e(TAG, "releaseCamera error", e2);
        }
    }

    public void reLayout() {
        if (a(getContext())) {
            RVLogger.d(" screen is off");
            return;
        }
        boolean z = false;
        int i2 = VideoUtils.getScreenSize(getContext()).x;
        int i3 = VideoUtils.getScreenSize(getContext()).y;
        if (Math.abs(i2 - this.i) > 200 || Math.abs(i3 - this.j) > 200) {
            StringBuilder sb = new StringBuilder("reLayout x=");
            sb.append(i2);
            sb.append(" ;y=");
            sb.append(i3);
            sb.append("; mScreenWidth=");
            sb.append(this.i);
            sb.append(" ;mScreenHeight=");
            sb.append(this.j);
            RVLogger.d(sb.toString());
            this.i = i2;
            this.j = i3;
            z = true;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.i + 1, this.j);
        if (!(mMode == 1 || this.mPreviewSize == null)) {
            try {
                b();
                StringBuilder sb2 = new StringBuilder("reLayout display w:");
                sb2.append(this.i);
                sb2.append(",h:");
                sb2.append(this.j);
                RVLogger.d(sb2.toString());
                int i4 = (this.j * this.mPreviewSize.height) / this.mPreviewSize.width;
                boolean isActivityLandscape = VideoUtils.isActivityLandscape((Activity) getContext());
                if (isActivityLandscape) {
                    RVLogger.d("isActivityLandscape");
                    i4 = (this.j * this.mPreviewSize.width) / this.mPreviewSize.height;
                }
                if (i4 < this.i && this.i - i4 <= ((int) (((float) this.i) * this.h))) {
                    i4 = this.i;
                }
                layoutParams.width = i4 + 1;
                layoutParams.height = this.j;
                if (z) {
                    int i5 = this.mPreviewSize.width;
                    int i6 = this.mPreviewSize.height;
                    if (i5 > i6) {
                        i5 = this.mPreviewSize.height;
                        i6 = this.mPreviewSize.width;
                    }
                    float f2 = ((float) i5) / ((float) i6);
                    int i7 = this.i;
                    int i8 = this.j;
                    if (isActivityLandscape) {
                        i7 = this.j;
                        i8 = this.i;
                    }
                    float f3 = ((float) i7) / ((float) i8);
                    if (this.h + f2 < f3) {
                        layoutParams.width = i7;
                        layoutParams.height = (i7 * i6) / i5;
                    }
                    StringBuilder sb3 = new StringBuilder("reLayout isFold preRation=");
                    sb3.append(f2);
                    sb3.append(";screenRation=");
                    sb3.append(f3);
                    sb3.append(";width=");
                    sb3.append(layoutParams.width);
                    sb3.append(";height=");
                    sb3.append(layoutParams.height);
                    sb3.append(";preW=");
                    sb3.append(i5);
                    sb3.append(";preH=");
                    sb3.append(i6);
                    RVLogger.d(sb3.toString());
                }
            } catch (Exception unused) {
                layoutParams.width = this.i;
                layoutParams.height = this.j;
                RVLogger.e(TAG, "reLayout exp");
            }
        }
        StringBuilder sb4 = new StringBuilder("reLayout final w:");
        sb4.append(layoutParams.width);
        sb4.append(",h:");
        sb4.append(layoutParams.height);
        RVLogger.d(sb4.toString());
        setLayoutParams(layoutParams);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void focusOnTouch(MotionEvent motionEvent) {
        List<String> supportedFocusModes;
        Camera camera = this.mCamera;
        if (camera != null && this.mIsOpened && !this.f) {
            try {
                camera.cancelAutoFocus();
            } catch (Exception e2) {
                RVLogger.w("focusOnTouch cancelAutoFocus error, e: ".concat(String.valueOf(e2)));
            }
            Rect a2 = a(motionEvent.getX(), motionEvent.getY(), 1.0f);
            Rect a3 = a(motionEvent.getX(), motionEvent.getY(), 1.5f);
            Camera.Parameters parameters = null;
            try {
                parameters = this.mCamera.getParameters();
            } catch (Exception e3) {
                StringBuilder sb = new StringBuilder("focusOnTouch getParameters exp");
                sb.append(e3.getMessage());
                RVLogger.e(TAG, sb.toString(), e3);
            }
            if (parameters != null && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
                if (this.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new Camera.Area(a2, 1000));
                    parameters.setFocusAreas(arrayList);
                }
                if (this.e) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(new Camera.Area(a3, 1000));
                    parameters.setMeteringAreas(arrayList2);
                }
                try {
                    this.mCamera.setParameters(parameters);
                    this.mCamera.autoFocus(this);
                    this.f = true;
                    this.m.sendEmptyMessageDelayed(2, 5000);
                } catch (Exception e4) {
                    StringBuilder sb2 = new StringBuilder("setParameters exp:");
                    sb2.append(e4.getMessage());
                    RVLogger.e(TAG, sb2.toString(), e4);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("\tonAttachedToWindow 1");
        RVLogger.e(sb.toString());
        a(mMode);
        super.onAttachedToWindow();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\tonAttachedToWindow 2");
        RVLogger.e(sb2.toString());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setScaleX(1.00001f);
        setScaleY(1.00001f);
        OrientationDetector.getInstance(getContext()).register();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RVLogger.d("onDetachedFromWindow");
        OrientationDetector.getInstance(getContext()).unregister();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        RVLogger.d("onFinishInflate");
    }

    private Rect a(float f2, float f3, float f4) {
        int intValue = Float.valueOf(((float) ((int) ((getContext().getResources().getDisplayMetrics().density * 72.0f) + 0.5f))) * f4).intValue();
        int width = (int) (((f2 / ((float) getWidth())) * 2000.0f) - 1000.0f);
        int height = (int) (((f3 / ((float) getHeight())) * 2000.0f) - 1000.0f);
        int i2 = intValue / 2;
        return new Rect(a(width - i2, -1000, 1000), a(height - i2, -1000, 1000), a(width + i2, -1000, 1000), a(height + i2, -1000, 1000));
    }

    public void onAutoFocus(boolean z, Camera camera) {
        RVLogger.d("onAutoFocus result: ".concat(String.valueOf(z)));
        this.m.removeMessages(2);
        this.f = false;
    }

    /* access modifiers changed from: protected */
    public void zoom() {
        if (this.mCamera != null && this.mIsOpened) {
            CameraParams cameraParams2 = this.cameraParams;
            if (cameraParams2 == null || cameraParams2.bZoomEnable) {
                Camera.Parameters parameters = null;
                try {
                    parameters = this.mCamera.getParameters();
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder("zoom getParameters exp:");
                    sb.append(e2.getMessage());
                    RVLogger.e(TAG, sb.toString(), e2);
                }
                if (parameters != null && parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    int zoom = parameters.getZoom();
                    RVLogger.d("curr: ".concat(String.valueOf(zoom)));
                    if (zoom == 0) {
                        parameters.setZoom(maxZoom / 2);
                    } else {
                        parameters.setZoom(0);
                    }
                    try {
                        this.mCamera.setParameters(parameters);
                    } catch (Exception e3) {
                        StringBuilder sb2 = new StringBuilder("zoom setParameters exp:");
                        sb2.append(e3.getMessage());
                        RVLogger.e(TAG, sb2.toString(), e3);
                    }
                }
            }
        }
    }

    private void a(Camera.Parameters parameters) {
        b();
        Point findBestPreviewSizeValue = VideoUtils.findBestPreviewSizeValue(parameters, new Point(this.i, this.j));
        parameters.setPreviewSize(findBestPreviewSizeValue.x, findBestPreviewSizeValue.y);
        this.mPreviewSize = parameters.getPreviewSize();
    }

    /* access modifiers changed from: protected */
    public int getCameraId() {
        return this.c;
    }

    public void notifyOpenCameraError() {
        this.initCameraError = true;
        APVideoRecordRsp aPVideoRecordRsp = new APVideoRecordRsp();
        aPVideoRecordRsp.mRspCode = 100;
        notifyError(aPVideoRecordRsp);
        RVLogger.e(TAG, "take it easy, only use to fix camera on dev", new IllegalStateException("notifyOpenCameraError"));
    }

    /* access modifiers changed from: protected */
    public void notifySdcardError() {
        APVideoRecordRsp aPVideoRecordRsp = new APVideoRecordRsp();
        aPVideoRecordRsp.mRspCode = 200;
        notifyError(aPVideoRecordRsp);
        RVLogger.e(TAG, "take it easy, only use to fix sdcard on dev", new IllegalStateException("notifySdcardError"));
    }

    /* access modifiers changed from: protected */
    public void notifyCameraOpen() {
        notifyInfo(APVideoRecordRsp.CODE_INFO_CAMERA_OPEN, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public void notifyInfo(int i2, Bundle bundle) {
        WrapperListener wrapperListener = this.mListener;
        if (wrapperListener != null) {
            wrapperListener.onInfo(i2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyError(APVideoRecordRsp aPVideoRecordRsp) {
        RVLogger.e("notifyError, rsp: ".concat(String.valueOf(aPVideoRecordRsp)));
        if (this.mListener != null) {
            aPVideoRecordRsp.recordPhase = this.k;
            this.mListener.onError(aPVideoRecordRsp);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyPrepared() {
        RVLogger.d("notifyPrepared");
        if (this.mListener != null) {
            APVideoRecordRsp aPVideoRecordRsp = new APVideoRecordRsp();
            aPVideoRecordRsp.mCamera = this.mCamera;
            aPVideoRecordRsp.mPreviewH = this.mPreviewSize.height;
            aPVideoRecordRsp.mPreviewW = this.mPreviewSize.width;
            aPVideoRecordRsp.mDisplayOrientation = this.b;
            this.mListener.onPrepared(aPVideoRecordRsp);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyMicError() {
        RVLogger.d("notifyMicError permission denied");
        RVLogger.e(TAG, "take it easy, only use to fix mic on dev", new IllegalStateException("notifyMicError"));
        APVideoRecordRsp aPVideoRecordRsp = new APVideoRecordRsp();
        aPVideoRecordRsp.mRspCode = 2;
        notifyError(aPVideoRecordRsp);
    }

    public void setVideoCurTimeStamp(long j2) {
        this.videoCurTimeStamp = j2;
    }

    private void a(int i2) {
        if (i2 == 1 || this.audioPermissionDelay) {
            RVLogger.d("acquire audio permission but mode being photo or using mic hardware encoding, just skip.");
        } else if (!sRequirePermissions.get()) {
            synchronized (sRequirePermissions) {
                if (!sRequirePermissions.get()) {
                    PermissionHelper.acquirePermissions(1);
                    sRequirePermissions.set(true);
                }
            }
        }
    }

    private void b() {
        if (isLive()) {
            if (this.j <= 0 || this.i <= 0) {
                this.j = VideoUtils.getScreenSize(getContext()).y;
                this.i = VideoUtils.getScreenSize(getContext()).x;
            } else {
                return;
            }
        } else if (this.j <= 0 || this.i <= 0 || (hasWindowFocus() && isShown())) {
            this.j = VideoUtils.getScreenSize(getContext()).y;
            this.i = VideoUtils.getScreenSize(getContext()).x;
        }
        StringBuilder sb = new StringBuilder("screen property updateScreenSize.mScreenWidth=");
        sb.append(this.i);
        sb.append(",mScreenHeight=");
        sb.append(this.j);
        RVLogger.d(sb.toString());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void updateScreenRotation(Activity activity) {
        if (isLive()) {
            if (this.mScreenRotation <= 0) {
                this.mScreenRotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } else {
                return;
            }
        } else if (this.mScreenRotation < 0 || (hasWindowFocus() && isShown())) {
            this.mScreenRotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        }
        StringBuilder sb = new StringBuilder("screen property updateScreenRotation.mScreenRotation=");
        sb.append(this.mScreenRotation);
        RVLogger.d(sb.toString());
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public void enableEventbus(boolean z) {
        this.mUseEventbus = z;
    }

    public boolean isEnableFrameData() {
        return this.mUseFrameData;
    }

    public boolean isEnableEventbus() {
        return this.mUseEventbus;
    }

    protected class WrapperListener implements IRecordListener, SightCameraView.ICameraFrameListener {

        /* renamed from: a  reason: collision with root package name */
        private SightCameraView.ICameraFrameListener f10465a;
        private SightCameraView.OnRecordListener b;

        protected WrapperListener() {
        }

        public void setVideoRecordListener(SightCameraView.OnRecordListener onRecordListener) {
            this.b = onRecordListener;
        }

        public void setCameraFrameListener(SightCameraView.ICameraFrameListener iCameraFrameListener) {
            this.f10465a = iCameraFrameListener;
        }

        public void onFrameData(Object obj, @SightCameraView.FrameType int i, Bundle bundle) {
            SightCameraView.ICameraFrameListener iCameraFrameListener = this.f10465a;
            if (iCameraFrameListener != null) {
                iCameraFrameListener.onFrameData(obj, i, bundle);
            }
        }

        public void onStart() {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onStart();
            }
        }

        public void onError(APVideoRecordRsp aPVideoRecordRsp) {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onError(aPVideoRecordRsp);
            }
        }

        public void onFinish(APVideoRecordRsp aPVideoRecordRsp) {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onFinish(aPVideoRecordRsp);
            }
        }

        public void onCancel() {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onCancel();
            }
        }

        public void onInfo(int i, Bundle bundle) {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onInfo(i, bundle);
            }
        }

        public void onPrepared(APVideoRecordRsp aPVideoRecordRsp) {
            SightCameraView.OnRecordListener onRecordListener = this.b;
            if (onRecordListener != null) {
                onRecordListener.onPrepared(aPVideoRecordRsp);
            }
        }
    }
}
