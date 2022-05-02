package com.alipay.zoloz.hardware.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.impl.PermissionAndroidImpl;
import com.alipay.zoloz.hardware.camera.utils.DeviceSettingUtil;
import com.alipay.zoloz.hardware.camera.widget.permission.CameraPermissionManager;

public class PermissionCameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private boolean isFirst = true;
    @NonNull
    private ICameraCallback mCameraCallback;
    private ICameraInterface mCameraInterface = null;
    private Context mContext;
    private DeviceSetting mDeviceSetting;
    private CameraPermissionManager mPermissionManager;
    private float mPreviewRate;
    private SurfaceHolder mSurfaceHolder;

    public PermissionCameraSurfaceView(Context context) {
        super(context);
        onInitialize(context, (AttributeSet) null);
    }

    public PermissionCameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onInitialize(context, attributeSet);
    }

    public PermissionCameraSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onInitialize(context, attributeSet);
    }

    private void onInitialize(Context context, AttributeSet attributeSet) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mPreviewRate = DisplayUtil.getScreenRate(applicationContext);
        SurfaceHolder holder = getHolder();
        this.mSurfaceHolder = holder;
        holder.setFormat(-2);
        this.mSurfaceHolder.setType(3);
        this.mSurfaceHolder.addCallback(this);
        this.mPermissionManager = new CameraPermissionManager(this);
    }

    private void initCameraInterface() {
        this.mCameraInterface = new PermissionAndroidImpl(this.mContext);
    }

    public void init(DeviceSetting[] deviceSettingArr, @NonNull ICameraCallback iCameraCallback) {
        this.mDeviceSetting = DeviceSettingUtil.getPropertyDeviceSetting(deviceSettingArr);
        this.mCameraCallback = iCameraCallback;
        initCameraInterface();
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.initCamera(this.mDeviceSetting);
            this.mCameraInterface.setCallback(iCameraCallback);
            return;
        }
        this.mCameraCallback.onError(1);
    }

    public void init(int i, int i2, boolean z, @NonNull ICameraCallback iCameraCallback) {
        this.mCameraCallback = iCameraCallback;
        initCameraInterface();
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.initCamera(i, i2, true);
            this.mCameraInterface.setCallback(iCameraCallback);
            return;
        }
        this.mCameraCallback.onError(1);
    }

    public ICameraInterface getCameraInterface() {
        return this.mCameraInterface;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.setCallback(this.mCameraCallback);
        }
        if (this.mPermissionManager.hasCameraPermission()) {
            try {
                this.mCameraInterface.startCamera();
                this.mCameraCallback.onSurfaceCreated();
            } catch (Exception unused) {
                this.mCameraCallback.onError(2);
            }
        } else if (this.isFirst) {
            this.mPermissionManager.requestPermission();
            this.isFirst = false;
        } else {
            this.mCameraCallback.onError(-1);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.mPermissionManager.hasCameraPermission()) {
            try {
                this.mCameraInterface.startPreview(this.mSurfaceHolder, this.mPreviewRate, i2, i3);
            } catch (Exception unused) {
                this.mCameraCallback.onError(2);
            }
            int cameraViewRotation = this.mCameraInterface.getCameraViewRotation();
            if (cameraViewRotation == 90 || cameraViewRotation == 270) {
                i2 = this.mCameraInterface.getPreviewHeight();
                i3 = this.mCameraInterface.getPreviewWidth();
            } else if (cameraViewRotation == 0 || cameraViewRotation == 180) {
                i2 = this.mCameraInterface.getPreviewWidth();
                i3 = this.mCameraInterface.getPreviewHeight();
            }
            this.mCameraCallback.onSurfaceChanged((double) i2, (double) i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.stopCamera();
            this.mCameraInterface.setCallback((ICameraCallback) null);
        }
        this.mCameraCallback.onSurfaceDestroyed();
    }

    public void release() {
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.releaseCamera();
        }
        this.mCameraInterface = null;
    }
}
