package com.alibaba.griver.image.capture.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Camera;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.image.capture.TakePictureProcessor;
import com.alibaba.griver.image.capture.meta.APTakePictureOption;
import com.alibaba.griver.image.capture.meta.APVideoRecordRsp;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.alibaba.griver.image.capture.widget.SightCameraView;
import java.lang.ref.WeakReference;
import o.setNeutralButton;

@TargetApi(14)
public class SightCameraViewImpl extends SightCameraView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public CameraView f10467a;
    private CameraFrontSightView b;
    private setNeutralButton c;
    protected CameraParams cameraParams = new CameraParams();
    /* access modifiers changed from: private */
    public int d = 0;
    /* access modifiers changed from: private */
    public int e = 0;
    private SightCameraView.OnRecordListener f;
    /* access modifiers changed from: private */
    public SightCameraView.OnScrollListener g;
    private WeakReference<Object> h;
    private int i = -1;
    /* access modifiers changed from: private */
    public int j = 0;
    /* access modifiers changed from: private */
    public int k = 0;

    public SightCameraViewImpl(Context context) {
        super(context);
        a();
    }

    public SightCameraViewImpl(Context context, CameraParams cameraParams2) {
        super(context);
        this.cameraParams = cameraParams2;
        this.h = new WeakReference<>(context);
        a();
    }

    private void a() {
        StringBuilder sb = new StringBuilder("camera view init~~~ ");
        sb.append(this.cameraParams);
        RVLogger.d(sb.toString());
        b();
        this.f10467a.setCameraParams(this.cameraParams);
        this.f10467a.setActivityOrFragment(this.h);
        if (this.cameraParams != null && !this.f10467a.isEnableEventbus()) {
            this.f10467a.enableEventbus(this.cameraParams.isEnableEventBus());
        }
        addView(this.f10467a, 0);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if ((SightCameraViewImpl.this.j == 0 || Math.abs(SightCameraViewImpl.this.j - SightCameraViewImpl.this.getWidth()) <= 200) && (SightCameraViewImpl.this.k == 0 || Math.abs(SightCameraViewImpl.this.k - SightCameraViewImpl.this.getHeight()) <= 200)) {
                    SightCameraViewImpl sightCameraViewImpl = SightCameraViewImpl.this;
                    int unused = sightCameraViewImpl.d = (sightCameraViewImpl.f10467a.getWidth() - SightCameraViewImpl.this.getWidth()) / 2;
                    SightCameraViewImpl sightCameraViewImpl2 = SightCameraViewImpl.this;
                    int unused2 = sightCameraViewImpl2.e = (sightCameraViewImpl2.f10467a.getHeight() - SightCameraViewImpl.this.getHeight()) / 2;
                    SightCameraViewImpl sightCameraViewImpl3 = SightCameraViewImpl.this;
                    sightCameraViewImpl3.scrollTo(sightCameraViewImpl3.d, SightCameraViewImpl.this.e);
                    SightCameraViewImpl sightCameraViewImpl4 = SightCameraViewImpl.this;
                    int unused3 = sightCameraViewImpl4.j = sightCameraViewImpl4.getWidth();
                    SightCameraViewImpl sightCameraViewImpl5 = SightCameraViewImpl.this;
                    int unused4 = sightCameraViewImpl5.k = sightCameraViewImpl5.getHeight();
                    StringBuilder sb = new StringBuilder("offset_x: ");
                    sb.append(SightCameraViewImpl.this.d);
                    sb.append(";mOffsety=");
                    sb.append(SightCameraViewImpl.this.e);
                    RVLogger.d(sb.toString());
                    StringBuilder sb2 = new StringBuilder("mCameraView:");
                    sb2.append(SightCameraViewImpl.this.f10467a.getWidth());
                    sb2.append(",");
                    sb2.append(SightCameraViewImpl.this.f10467a.getHeight());
                    RVLogger.d(sb2.toString());
                    StringBuilder sb3 = new StringBuilder("sightcameraview:");
                    sb3.append(SightCameraViewImpl.this.getWidth());
                    sb3.append(",");
                    sb3.append(SightCameraViewImpl.this.getHeight());
                    RVLogger.d(sb3.toString());
                    return;
                }
                SightCameraViewImpl.this.f10467a.reLayout();
                SightCameraViewImpl sightCameraViewImpl6 = SightCameraViewImpl.this;
                int unused5 = sightCameraViewImpl6.j = sightCameraViewImpl6.getWidth();
                SightCameraViewImpl sightCameraViewImpl7 = SightCameraViewImpl.this;
                int unused6 = sightCameraViewImpl7.k = sightCameraViewImpl7.getHeight();
                StringBuilder sb4 = new StringBuilder("reLayout offset_x: ");
                sb4.append(SightCameraViewImpl.this.d);
                sb4.append(";mOffsety=");
                sb4.append(SightCameraViewImpl.this.e);
                RVLogger.d(sb4.toString());
                StringBuilder sb5 = new StringBuilder("reLayout mCameraView:");
                sb5.append(SightCameraViewImpl.this.f10467a.getWidth());
                sb5.append(",");
                sb5.append(SightCameraViewImpl.this.f10467a.getHeight());
                RVLogger.d(sb5.toString());
                StringBuilder sb6 = new StringBuilder("reLayout sightcameraview:");
                sb6.append(SightCameraViewImpl.this.getWidth());
                sb6.append(",");
                sb6.append(SightCameraViewImpl.this.getHeight());
                RVLogger.d(sb6.toString());
            }
        });
        this.c = new setNeutralButton(getContext(), new GestureListener());
        CameraFrontSightView cameraFrontSightView = new CameraFrontSightView(getContext());
        this.b = cameraFrontSightView;
        addView(cameraFrontSightView, 1);
        this.b.init(120, 120);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private void b() {
        if (this.f10467a == null) {
            this.f10467a = new SightCameraTextureView(getContext());
        }
    }

    /* access modifiers changed from: private */
    public void a(float f2, float f3) {
        CameraFrontSightView cameraFrontSightView = this.b;
        if (cameraFrontSightView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cameraFrontSightView.getLayoutParams();
            layoutParams.leftMargin = ((int) f2) - (this.b.mWidth / 2);
            layoutParams.topMargin = ((int) f3) - (this.b.mHeight / 2);
            this.b.setLayoutParams(layoutParams);
            this.b.startDraw();
            this.b.requestLayout();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.setMin(motionEvent);
    }

    public void setOnRecordListener(SightCameraView.OnRecordListener onRecordListener) {
        this.f = onRecordListener;
        CameraView cameraView = this.f10467a;
        if (cameraView != null) {
            cameraView.setOnRecordListener(onRecordListener);
        }
    }

    public Camera switchCamera() {
        this.f10467a.setRecordPhase(APVideoRecordRsp.RecordPhase.SWITCHCAMERA);
        return this.f10467a.switchCamera();
    }

    public Camera reopenCamera(int i2) {
        this.f10467a.setRecordPhase(APVideoRecordRsp.RecordPhase.REOPENCAMERA);
        return this.f10467a.reopenCamera(i2);
    }

    public void setOnScrollListener(SightCameraView.OnScrollListener onScrollListener) {
        this.g = onScrollListener;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        CameraView cameraView = this.f10467a;
        if (cameraView != null) {
            cameraView.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public void takePicture(final SightCameraView.TakePictureListener takePictureListener, final Looper looper, final APTakePictureOption aPTakePictureOption) {
        CameraView cameraView = this.f10467a;
        if (cameraView != null) {
            cameraView.setRecordPhase(APVideoRecordRsp.RecordPhase.SNAPSHOTING);
        }
        if (this.f10467a == null) {
            throw new IllegalStateException("Sorry, please check camera view init!!!");
        } else if (ExecutorUtils.isMainThread()) {
            GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                public void run() {
                    try {
                        new TakePictureProcessor().takePicture(SightCameraViewImpl.this.f10467a.getCamera(), SightCameraViewImpl.this.f10467a.getCameraId(), takePictureListener, looper, SightCameraViewImpl.this.f10467a.cameraParams, aPTakePictureOption);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("takePicture error! listener: ");
                        sb.append(takePictureListener);
                        sb.append(", looper: ");
                        sb.append(looper);
                        sb.append(", params: ");
                        sb.append(SightCameraViewImpl.this.f10467a.cameraParams);
                        RVLogger.e("SightCameraViewImpl", sb.toString(), th);
                        SightCameraView.TakePictureListener takePictureListener = takePictureListener;
                        if (takePictureListener != null) {
                            takePictureListener.onPictureProcessError(1, (byte[]) null);
                        }
                    }
                }
            });
        } else {
            try {
                new TakePictureProcessor().takePicture(this.f10467a.getCamera(), this.f10467a.getCameraId(), takePictureListener, looper, this.f10467a.cameraParams, aPTakePictureOption);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("takePicture error! listener: ");
                sb.append(takePictureListener);
                sb.append(", looper: ");
                sb.append(looper);
                sb.append(", params: ");
                sb.append(this.f10467a.cameraParams);
                RVLogger.e("SightCameraViewImpl", sb.toString(), th);
                if (takePictureListener != null) {
                    takePictureListener.onPictureProcessError(1, (byte[]) null);
                }
            }
        }
    }

    public void releaseCamera() {
        CameraView cameraView = this.f10467a;
        if (cameraView != null) {
            cameraView.setRecordPhase(APVideoRecordRsp.RecordPhase.RELEASECAMERA);
            this.f10467a.releaseCamera();
        }
    }

    public Camera getCamera() {
        CameraView cameraView = this.f10467a;
        if (cameraView != null) {
            return cameraView.getCamera();
        }
        return null;
    }

    class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            RVLogger.d("onDown");
            motionEvent.offsetLocation((float) SightCameraViewImpl.this.d, (float) SightCameraViewImpl.this.e);
            SightCameraViewImpl.this.a(motionEvent.getX(), motionEvent.getY());
            SightCameraViewImpl.this.f10467a.focusOnTouch(motionEvent);
            return true;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            RVLogger.d("onDoubleTap");
            SightCameraViewImpl.this.f10467a.zoom();
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (SightCameraViewImpl.this.g == null) {
                return false;
            }
            SightCameraViewImpl.this.g.onScroll(motionEvent, motionEvent2, f, f2);
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (SightCameraViewImpl.this.g == null) {
                return false;
            }
            SightCameraViewImpl.this.g.onFling(motionEvent, motionEvent2, f, f2);
            return false;
        }
    }
}
