package com.alipay.zoloz.hardware.camera.widget;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.utils.DeviceSettingUtil;
import com.alipay.zoloz.hardware.camera.widget.utils.FocusAreaUtils;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsCategories;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback, AbsSurfaceView {
    static ICameraInterface mCameraInterface;
    private final long CLICK_DISTANCE = 10;
    private final long DELAY_TIME = 200;
    ICameraCallback mCameraCallback;
    Context mContext;
    private DeviceSetting mDeviceSetting;
    private long mDownTime;
    private float mDownX;
    private float mDownY;
    /* access modifiers changed from: private */
    public FocusView mFocusView;
    float mPreviewRate;
    SurfaceHolder mSurfaceHolder;
    private long mTouchTime;

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mPreviewRate = DisplayUtil.getScreenRate(applicationContext);
        SurfaceHolder holder = getHolder();
        this.mSurfaceHolder = holder;
        holder.setFormat(-2);
        this.mSurfaceHolder.setType(3);
        this.mSurfaceHolder.addCallback(this);
        this.mFocusView = new FocusView(this.mContext);
    }

    public void init(DeviceSetting[] deviceSettingArr) {
        this.mDeviceSetting = DeviceSettingUtil.getPropertyDeviceSetting(deviceSettingArr);
        getCameraImpl(this.mContext);
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.initCamera(this.mDeviceSetting);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.setCallback(this.mCameraCallback);
        }
        try {
            if (mCameraInterface != null) {
                mCameraInterface.startCamera();
            }
            ICameraCallback iCameraCallback = this.mCameraCallback;
            if (iCameraCallback != null) {
                iCameraCallback.onSurfaceCreated();
            }
        } catch (Exception unused) {
            ICameraCallback iCameraCallback2 = this.mCameraCallback;
            if (iCameraCallback2 != null) {
                iCameraCallback2.onError(-1);
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            try {
                iCameraInterface.startPreview(this.mSurfaceHolder, this.mPreviewRate, i2, i3);
            } catch (Exception unused) {
            }
            if (this.mCameraCallback != null) {
                int cameraViewRotation = mCameraInterface.getCameraViewRotation();
                if (cameraViewRotation == 90 || cameraViewRotation == 270) {
                    i2 = mCameraInterface.getPreviewHeight();
                    i3 = mCameraInterface.getPreviewWidth();
                } else if (cameraViewRotation == 0 || cameraViewRotation == 180) {
                    i2 = mCameraInterface.getPreviewWidth();
                    i3 = mCameraInterface.getPreviewHeight();
                }
                this.mCameraCallback.onSurfaceChanged((double) i2, (double) i3);
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.stopCamera();
            mCameraInterface.setCallback((ICameraCallback) null);
        }
        ICameraCallback iCameraCallback = this.mCameraCallback;
        if (iCameraCallback != null) {
            iCameraCallback.onSurfaceDestroyed();
        }
    }

    @Deprecated
    public static ICameraInterface getCameraImpl(Context context) {
        if (mCameraInterface == null) {
            try {
                mCameraInterface = (ICameraInterface) Class.forName("com.alipay.zoloz.hardware.camera.impl.AndroidImpl").getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return mCameraInterface;
    }

    public ICameraInterface getCameraInterface() {
        return getCameraImpl(getContext());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownTime = System.currentTimeMillis();
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.mTouchTime = System.currentTimeMillis() - this.mDownTime;
            detectGesture(this.mDownX, motionEvent.getX(), this.mDownY, motionEvent.getY());
        }
        return true;
    }

    private void detectGesture(float f, float f2, float f3, float f4) {
        if (mCameraInterface != null) {
            float f5 = f4 - f3;
            if (Math.abs(f2 - f) < 10.0f && Math.abs(f5) < 10.0f && this.mTouchTime < 200) {
                ViewParent parent = this.mFocusView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.mFocusView);
                }
                ViewGroup viewGroup = (ViewGroup) getParent();
                viewGroup.addView(this.mFocusView, findIndex(viewGroup), new ViewGroup.LayoutParams(-2, -2));
                this.mFocusView.moveToPosition(f2, f4);
                this.mFocusView.startFocus();
                mCameraInterface.autoFocus(FocusAreaUtils.computeMeteringAreas(f2, f4, getWidth(), getHeight(), mCameraInterface.getCameraViewRotation()), new Camera.AutoFocusCallback() {
                    public void onAutoFocus(boolean z, Camera camera) {
                        CameraSurfaceView.this.mFocusView.hideFocusView();
                    }
                });
            }
        }
    }

    private int findIndex(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) == this) {
                return i + 1;
            }
        }
        return childCount;
    }

    public static void release() {
        mCameraInterface = null;
    }

    public static String getCameraName() {
        try {
            Field field = BuildConfig.class.getField(RequestPermissionsCategories.CAMERA);
            field.setAccessible(true);
            return (String) field.get(BuildConfig.class);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return "Android";
        }
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    public void setCameraCallback(ICameraCallback iCameraCallback) {
        this.mCameraCallback = iCameraCallback;
    }
}
