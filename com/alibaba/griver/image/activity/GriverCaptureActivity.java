package com.alibaba.griver.image.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.capture.CaptureServiceImpl;
import com.alibaba.griver.image.capture.meta.APTakePictureOption;
import com.alibaba.griver.image.capture.meta.APVideoRecordRsp;
import com.alibaba.griver.image.capture.meta.CameraParams;
import com.alibaba.griver.image.capture.meta.CaptureParam;
import com.alibaba.griver.image.capture.meta.MediaInfo;
import com.alibaba.griver.image.capture.utils.CameraUtils;
import com.alibaba.griver.image.capture.widget.CaptureBtn;
import com.alibaba.griver.image.capture.widget.SightCameraView;
import com.alibaba.griver.image.capture.widget.SightCameraViewImpl;
import com.alibaba.griver.image.capture.widget.TitleBar;
import com.alibaba.griver.image.capture.widget.TouchInterceptFrameLayout;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alibaba.griver.ui.ant.utils.ToolUtils;
import com.google.common.base.Ascii;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverCaptureActivity extends GriverMediaBaseActivity implements View.OnClickListener, SightCameraView.OnScrollListener {
    public static final int MODE_CHANGING = 2;
    public static final int MODE_PHOTO = 1;
    public static final int MODE_VIDEO = 0;
    public static final String TAG = "GriverCaptureActivity";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static int f10447a = 0;
    /* access modifiers changed from: private */
    public static int b = 1;
    /* access modifiers changed from: private */
    public static int c = 0;
    private static int d = 1;
    public static final int getMin = 182;
    public static final byte[] setMax = {112, -73, Ascii.NAK, 81, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private Bundle A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public int C;
    /* access modifiers changed from: private */
    public Handler D;
    private int E;
    /* access modifiers changed from: private */
    public APTakePictureOption F = new APTakePictureOption();
    /* access modifiers changed from: private */
    public int G;
    private boolean H;
    private boolean I;
    /* access modifiers changed from: private */
    public SightCameraView.TakePictureMPListener J = new SightCameraView.TakePictureMPListener() {
        public void onPictureProcessStart() {
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
        }

        public void onPictureTakenError(int i, Camera camera) {
            RVLogger.e(GriverCaptureActivity.TAG, "onPictureTakenError errorCode = ".concat(String.valueOf(i)));
            GriverCaptureActivity griverCaptureActivity = GriverCaptureActivity.this;
            ToastUtils.showToast(griverCaptureActivity, griverCaptureActivity.getString(R.string.griver_image_tips_take_pic_error), 0);
            GriverCaptureActivity.this.x();
            GriverCaptureActivity.this.finish();
            GriverCaptureActivity.this.b(i);
        }

        public void onPictureProcessFinish(String str, int i, int i2, int i3) {
            GriverCaptureActivity.this.a(str, i, i2, i3, (Bundle) null);
        }

        public void onPictureProcessFinish(String str, int i, int i2, int i3, Bundle bundle) {
            GriverCaptureActivity.this.a(str, i, i2, i3, bundle);
        }

        public void onPictureProcessError(int i, byte[] bArr) {
            RVLogger.e(GriverCaptureActivity.TAG, "onPictureProcessError errorCode = ".concat(String.valueOf(i)));
            GriverCaptureActivity griverCaptureActivity = GriverCaptureActivity.this;
            ToastUtils.showToast(griverCaptureActivity, griverCaptureActivity.getString(R.string.griver_image_tips_take_pic_error), 0);
            GriverCaptureActivity.this.x();
            GriverCaptureActivity.this.finish();
        }
    };
    private View.OnClickListener K = new View.OnClickListener() {
        public void onClick(View view) {
            String str;
            if (GriverCaptureActivity.this.u != 2) {
                GriverCaptureActivity griverCaptureActivity = GriverCaptureActivity.this;
                int unused = griverCaptureActivity.w = Math.abs(griverCaptureActivity.w - 1);
                try {
                    GriverCaptureActivity.this.n();
                    GriverCaptureActivity griverCaptureActivity2 = GriverCaptureActivity.this;
                    if (GriverCaptureActivity.this.w == GriverCaptureActivity.b) {
                        str = GriverCaptureActivity.this.getString(R.string.griver_image_flashlight_opend);
                    } else {
                        str = GriverCaptureActivity.this.getString(R.string.griver_image_flashlight_closed);
                    }
                    griverCaptureActivity2.a(str);
                } catch (Exception unused2) {
                    GriverCaptureActivity.this.o();
                }
            }
        }
    };
    private CameraUtils.CameraHelperListener L = new CameraUtils.CameraHelperListener() {
        public void onCameraFacingChanged(Camera camera, int i, int i2) {
            Camera unused = GriverCaptureActivity.this.t = camera;
            int unused2 = GriverCaptureActivity.this.C = i;
            int unused3 = GriverCaptureActivity.this.u = i2;
            if (GriverCaptureActivity.this.u == 0) {
                GriverCaptureActivity.this.p();
            } else {
                GriverCaptureActivity.this.q();
            }
            int unused4 = GriverCaptureActivity.this.w = GriverCaptureActivity.f10447a;
            GriverCaptureActivity.this.n();
            if (GriverCaptureActivity.this.C != GriverCaptureActivity.c) {
                GriverCaptureActivity.this.mTitle.ivFlash.setVisibility(8);
                if (!GriverCaptureActivity.this.z) {
                    boolean unused5 = GriverCaptureActivity.this.f10448o;
                }
                GriverCaptureActivity.this.mTitle.ivCamera.setContentDescription(GriverCaptureActivity.this.getString(R.string.griver_image_switch_to_back_camera));
            } else if (GriverCaptureActivity.this.B) {
                GriverCaptureActivity.this.mTitle.ivFlash.setVisibility(0);
                GriverCaptureActivity.this.mTitle.ivCamera.setContentDescription(GriverCaptureActivity.this.getString(R.string.griver_image_switch_to_front_camera));
            }
        }

        public void onVideoModeReached(Camera camera) {
            RVLogger.d(GriverCaptureActivity.TAG, "onVideoModeReached-----------");
            Camera unused = GriverCaptureActivity.this.t = camera;
            GriverCaptureActivity.this.p();
        }

        public void onCaptureModeReached(Camera camera) {
            RVLogger.d(GriverCaptureActivity.TAG, "onCaptureModeReached-----------");
            Camera unused = GriverCaptureActivity.this.t = camera;
            GriverCaptureActivity.this.q();
        }
    };
    private View.OnClickListener M = new View.OnClickListener() {
        public void onClick(View view) {
            if (!GriverCaptureActivity.this.x && GriverCaptureActivity.this.u != 2) {
                GriverCaptureActivity griverCaptureActivity = GriverCaptureActivity.this;
                griverCaptureActivity.a(griverCaptureActivity.u);
            }
        }
    };
    protected ImageView btnFilter;
    protected CaptureBtn btnRecord;
    protected TouchInterceptFrameLayout cameraContainer;
    protected SightCameraView cameraView;
    View.OnClickListener captureClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (GriverCaptureActivity.this.u != 2) {
                int unused = GriverCaptureActivity.this.u = 2;
                StringBuilder sb = new StringBuilder("Click to shoot time ");
                sb.append(System.currentTimeMillis());
                RVLogger.d(GriverCaptureActivity.TAG, sb.toString());
                GriverCaptureActivity.this.cameraView.takePicture(GriverCaptureActivity.this.J, Looper.getMainLooper(), GriverCaptureActivity.this.F);
            }
        }
    };
    protected TextView captureIndicator;
    protected RelativeLayout controlPanel;
    View.OnTouchListener coverBlockTouch = new View.OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    protected View coverView;
    private int e;
    private boolean f;
    /* access modifiers changed from: private */
    public boolean g;
    private boolean h;
    private int i;
    protected ImageView ivPrepare;
    private int j;
    private boolean k;
    private boolean l;
    private String m;
    protected TitleBar mTitle;
    private boolean n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f10448o;
    SightCameraView.OnRecordListener onRecordListener = new SightCameraView.OnRecordListener() {
        public void onInfo(int i, Bundle bundle) {
        }

        public void onStart() {
            RVLogger.d(GriverCaptureActivity.TAG, "onRecordListener onStart");
        }

        public void onError(APVideoRecordRsp aPVideoRecordRsp) {
            String str;
            int i = aPVideoRecordRsp.mRspCode;
            if (i == 100) {
                str = GriverCaptureActivity.this.getString(R.string.griver_image_tips_camera_error);
            } else if (i == 200) {
                str = GriverCaptureActivity.this.getString(R.string.griver_image_tips_sdcard_error);
            } else if (i != 300) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        str = GriverCaptureActivity.this.getString(R.string.griver_image_tips_mic_error);
                        break;
                    default:
                        str = "Camera error";
                        break;
                }
            } else {
                str = GriverCaptureActivity.this.getString(R.string.griver_image_tips_sdcard_not_enough);
            }
            GriverCaptureActivity.this.a(aPVideoRecordRsp, str);
        }

        public void onFinish(APVideoRecordRsp aPVideoRecordRsp) {
            RVLogger.d(GriverCaptureActivity.TAG, "onRecordListener onFinish");
        }

        public void onCancel() {
            GriverCaptureActivity.this.resetState();
            RVLogger.d(GriverCaptureActivity.TAG, "onRecordListener onCancel");
        }

        public void onPrepared(APVideoRecordRsp aPVideoRecordRsp) {
            RVLogger.d(GriverCaptureActivity.TAG, "onRecordListener onPrepared");
            GriverCaptureActivity.access$2108(GriverCaptureActivity.this);
            if (GriverCaptureActivity.this.G > 1) {
                StringBuilder sb = new StringBuilder("Prepared count = ");
                sb.append(GriverCaptureActivity.this.G);
                sb.append(",ignore it!");
                RVLogger.d(GriverCaptureActivity.TAG, sb.toString());
                return;
            }
            GriverCaptureActivity.this.a(aPVideoRecordRsp);
            GriverCaptureActivity.this.D.post(new Runnable() {
                public void run() {
                    GriverCaptureActivity.this.ivPrepare.setVisibility(8);
                }
            });
        }
    };
    private ImageView p;
    private ImageView q;
    private ImageView r;
    private View s;
    /* access modifiers changed from: private */
    public Camera t;
    protected TextView tipsText;
    protected TextView tipsText2;
    protected TextView topTips;
    /* access modifiers changed from: private */
    public int u = 0;
    private int v = 0;
    protected TextView videoIndicator;
    /* access modifiers changed from: private */
    public int w;
    /* access modifiers changed from: private */
    public boolean x;
    private GriverImageService y;
    /* access modifiers changed from: private */
    public boolean z = false;

    /* access modifiers changed from: private */
    public void a(APVideoRecordRsp aPVideoRecordRsp, String str) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1298522577, oncanceled);
            onCancelLoad.getMin(-1298522577, oncanceled);
        }
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-71404868, oncanceled);
            onCancelLoad.getMin(-71404868, oncanceled);
        }
    }

    /* access modifiers changed from: private */
    public void l() {
    }

    /* access modifiers changed from: private */
    public void p() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, short r8) {
        /*
            byte[] r0 = setMax
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r8 = r8 * 175
            int r8 = r8 + 4
            int r6 = r6 * 45
            int r6 = 101 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0030
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0030:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r0 + 1
            int r6 = r6 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.activity.GriverCaptureActivity.setMax(int, byte, short):java.lang.String");
    }

    private void v() {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    static /* synthetic */ int access$2108(GriverCaptureActivity griverCaptureActivity) {
        int i2 = griverCaptureActivity.G;
        griverCaptureActivity.G = i2 + 1;
        return i2;
    }

    private void a() {
        this.F.saveToPrivateDir = this.A.getBoolean(CaptureParam.SAVE_FILE_TO_PRIVATE_DIRECTORY, false);
        this.F.setQuality(this.A.getInt(CaptureParam.KEY_CAPTURE_QUALITY, 100));
        this.E = this.A.getInt(CaptureParam.KEY_MAX_DURATION, 6000);
        this.n = this.A.getBoolean(CaptureParam.ENABLE_SWITCH_CAMERA, true);
        this.k = this.A.getBoolean(CaptureParam.ENABLE_MULTI_TIME_RECORD, false);
        this.l = this.A.getBoolean(CaptureParam.ENABLE_SHOW_LATEST_RECORD_ENTRY, false);
        this.m = this.A.getString(CaptureParam.LATEST_RECORD_ENTRY_ICON_PATH);
        this.e = this.A.getInt(CaptureParam.CAPTURE_MODE, 3);
        this.j = this.A.getInt(CaptureParam.INIT_TYPE, 0);
        int i2 = this.A.getInt(CaptureParam.INIT_CAMERA_FACING, 0);
        this.i = i2;
        if (i2 == 1 && !b()) {
            RVLogger.d(TAG, "Front camera is not exist,force set to back camera");
            this.i = 0;
        }
        this.C = this.i;
        this.f = this.A.getBoolean(CaptureParam.ENABLE_SET_WATER_MARK, true);
        this.h = this.A.getBoolean(CaptureParam.ENABLE_SET_FILTER, true);
        this.f10448o = this.A.getBoolean(CaptureParam.ENABLE_SET_BEAUTY, true);
        c();
        this.g = this.A.getBoolean(CaptureParam.FINISH_AFTER_CALLBACK, true);
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.e);
        objArr[1] = this.j == 0 ? "video" : "photo";
        objArr[2] = Boolean.valueOf(this.f);
        objArr[3] = Boolean.valueOf(this.g);
        objArr[4] = this.i == 0 ? "back" : "front";
        objArr[5] = Boolean.valueOf(this.k);
        RVLogger.d(TAG, String.format("mCaptureMode = %d,initType = %s,mEnableWaterMark = %s,finishAfterCallback = %s,initCameraFacing = %s,EnableMultiTimeRecord = %s", objArr));
    }

    private boolean b() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i2 = 0; i2 < numberOfCameras; i2++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return true;
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Parse camera info exception :");
            sb.append(e2.getMessage());
            RVLogger.w(TAG, sb.toString());
        }
        return false;
    }

    private void c() {
        this.f = false;
        this.h = false;
        this.f10448o = false;
        StringBuilder sb = new StringBuilder();
        sb.append("checkWhiteList: ");
        sb.append(" Enable waterMark =");
        sb.append(this.f);
        sb.append(",Enable filter = ");
        sb.append(this.h);
        sb.append(",Enable beauty = ");
        sb.append(this.f10448o);
        RVLogger.d(TAG, sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        int min2;
        int max;
        byte[] bArr = setMax;
        String max2 = setMax((byte) bArr[8], (byte) bArr[96], (byte) bArr[8]);
        byte[] bArr2 = setMax;
        String max3 = setMax((byte) bArr2[96], (byte) bArr2[8], (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(502223528, oncanceled);
            onCancelLoad.getMin(502223528, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 502223528 == (max = dispatchOnCancelled.getMax(applicationContext2, 502223528)))) {
            onCanceled oncanceled2 = new onCanceled(502223528, max, 512);
            onCancelLoad.setMax(502223528, oncanceled2);
            onCancelLoad.getMin(502223528, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min2 = dispatchOnCancelled.setMin(applicationContext3, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min2, 8);
            onCancelLoad.setMax(502223528, oncanceled3);
            onCancelLoad.getMin(502223528, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(502223528, oncanceled4);
            onCancelLoad.getMin(502223528, oncanceled4);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled5 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(502223528, oncanceled5);
            onCancelLoad.getMin(502223528, oncanceled5);
        }
        super.onCreate(bundle);
        d();
        setContentView(R.layout.griver_image_activity_capture);
        this.B = getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        StringBuilder sb = new StringBuilder("Device support flash ? ");
        sb.append(this.B);
        RVLogger.d(TAG, sb.toString());
        DensityUtil.dip2px(this, 125.0f);
        Bundle extras = getIntent().getExtras();
        this.A = extras;
        if (extras == null) {
            this.A = new Bundle();
            RVLogger.d(TAG, "Activity extras is null!");
        }
        a();
        f();
        e();
    }

    private void d() {
        if (ToolUtils.isConcaveScreen(this)) {
            RVLogger.d(TAG, "concaveScreenCompact:full screen.");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
        }
    }

    private void e() {
        if (ToolUtils.isConcaveScreen(this)) {
            RVLogger.d(TAG, "concaveScreenCompact:adjust top place holder height.");
            View findViewById = findViewById(R.id.v_full_screen_top_place_holder);
            findViewById.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = StatusBarUtils.getStatusBarHeight(this);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    private void f() {
        this.coverView = findViewById(R.id.coverView);
        this.cameraContainer = (TouchInterceptFrameLayout) findViewById(R.id.cameraContainer);
        this.topTips = (TextView) findViewById(R.id.top_tips);
        TextView textView = (TextView) findViewById(R.id.indicator_capture);
        this.captureIndicator = textView;
        int i2 = 4;
        int i3 = 0;
        textView.setVisibility(this.e == 1 ? 4 : 0);
        this.ivPrepare = (ImageView) findViewById(R.id.ivCameraPrepare);
        this.controlPanel = (RelativeLayout) findViewById(R.id.control_panel);
        this.tipsText = (TextView) findViewById(R.id.tips);
        TextView textView2 = (TextView) findViewById(R.id.indicator_video);
        this.videoIndicator = textView2;
        if (this.e != 2) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        this.btnFilter = (ImageView) findViewById(R.id.btnFilter);
        ImageView imageView = (ImageView) findViewById(R.id.btnEffectSelect);
        this.p = imageView;
        imageView.setVisibility(this.f ? 0 : 8);
        ImageView imageView2 = (ImageView) findViewById(R.id.btnEffectSelect2);
        this.q = imageView2;
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) findViewById(R.id.bt_latest_record_entry);
        this.r = imageView3;
        imageView3.setOnClickListener(this);
        g();
        this.btnFilter.setOnClickListener(this);
        this.btnFilter.setVisibility(this.h ? 0 : 8);
        this.p.setOnClickListener(this);
        this.tipsText2 = (TextView) findViewById(R.id.tips_common);
        this.mTitle = (TitleBar) findViewById(R.id.title);
        if (this.i == 1 || !this.B) {
            i3 = 8;
        }
        this.mTitle.ivFlash.setVisibility(i3);
        this.btnRecord = (CaptureBtn) findViewById(R.id.btnRecord);
        this.s = findViewById(R.id.recordProgress);
        this.btnRecord.takePictureBtn.setOnClickListener(this.captureClickListener);
        this.mTitle.ivFlash.setOnClickListener(this.K);
        this.btnRecord.setViewType(h() ? CaptureBtn.Type.PICTURE : CaptureBtn.Type.VIDEO);
        TitleBar titleBar = this.mTitle;
        h();
        titleBar.setTitleText(getString(R.string.griver_image_capture));
        i();
        j();
    }

    private void g() {
        int i2 = 0;
        if (!this.l || TextUtils.isEmpty(this.m)) {
            ImageView imageView = this.p;
            if (!this.f) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            return;
        }
        this.q.setVisibility(this.f ? 0 : 8);
        this.r.setVisibility(0);
        if (this.q.getVisibility() == 0) {
            this.p.setVisibility(8);
        }
    }

    private boolean h() {
        int i2 = this.e;
        return i2 == 2 || (i2 == 3 && this.j == 1);
    }

    private void i() {
        this.coverView.bringToFront();
        this.ivPrepare.bringToFront();
        this.ivPrepare.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    private void j() {
        InnerHandler innerHandler = new InnerHandler(this);
        this.D = innerHandler;
        innerHandler.postDelayed(new Runnable() {
            public void run() {
            }
        }, 1500);
        GriverImageService griverImageService = (GriverImageService) RVProxy.get(GriverImageService.class);
        this.y = griverImageService;
        if (griverImageService == null) {
            x();
            finish();
            return;
        }
        this.mTitle.ivBack.setOnClickListener(this);
        k();
    }

    private void k() {
        this.cameraContainer.setOnTapListener(new TouchInterceptFrameLayout.TapListener() {
            public void onTap(View view) {
                GriverCaptureActivity.this.l();
            }
        });
    }

    public void onWindowFocusChanged(boolean z2) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1621538438, oncanceled);
            onCancelLoad.getMin(-1621538438, oncanceled);
        }
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.D.post(new Runnable() {
                public void run() {
                    GriverCaptureActivity.this.m();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        String str;
        if (this.cameraView == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            CameraParams cameraParams = new CameraParams();
            cameraParams.setDefaultCameraFront(this.i == 1);
            ImageView imageView = this.mTitle.ivCamera;
            if (this.i == 1) {
                str = getString(R.string.griver_image_switch_to_back_camera);
            } else {
                str = getString(R.string.griver_image_switch_to_front_camera);
            }
            imageView.setContentDescription(str);
            cameraParams.recordType = 2;
            cameraParams.enableBeauty(true);
            if (this.e == 2) {
                cameraParams.mMode = 1;
            }
            SightCameraViewImpl sightCameraViewImpl = new SightCameraViewImpl(this, cameraParams);
            this.cameraView = sightCameraViewImpl;
            sightCameraViewImpl.setLayoutParams(layoutParams);
            this.cameraView.setOnScrollListener(this);
            this.cameraView.setOnRecordListener(this.onRecordListener);
            this.cameraContainer.addView(this.cameraView);
        }
    }

    /* access modifiers changed from: private */
    public void a(APVideoRecordRsp aPVideoRecordRsp) {
        this.t = aPVideoRecordRsp.mCamera;
        this.captureIndicator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (GriverCaptureActivity.this.u != 2 && GriverCaptureActivity.this.u == 0) {
                    GriverCaptureActivity.this.e(false);
                }
            }
        });
        this.videoIndicator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (GriverCaptureActivity.this.u != 2 && GriverCaptureActivity.this.u == 1) {
                    GriverCaptureActivity.this.d(false);
                }
            }
        });
        this.btnRecord.setVisibility(0);
        if (h()) {
            e(true);
        } else {
            d(true);
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1800180263, oncanceled);
            onCancelLoad.getMin(1800180263, oncanceled);
        }
        if (this.C == d) {
            this.w = f10447a;
        } else if (this.w == f10447a) {
            try {
                if (this.t != null) {
                    Camera.Parameters parameters = this.t.getParameters();
                    parameters.setFlashMode(CameraParams.FLASH_MODE_OFF);
                    this.t.setParameters(parameters);
                }
                this.mTitle.ivFlash.setImageResource(R.drawable.griver_image_ic_flash_off);
                this.mTitle.ivFlash.setContentDescription(getString(R.string.griver_image_turn_on_flash));
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Shutdown flash error! camera.setParameters exception ,");
                sb.append(e2.getMessage());
                RVLogger.w(TAG, sb.toString());
            }
        } else {
            a(this.t, this.u);
        }
    }

    private void a(Camera camera, int i2) {
        if (camera == null) {
            o();
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null) {
            o();
            return;
        }
        if (i2 == 0) {
            if (supportedFlashModes.contains("torch")) {
                parameters.setFlashMode("torch");
            } else if (supportedFlashModes.contains(CameraParams.FLASH_MODE_ON)) {
                parameters.setFlashMode(CameraParams.FLASH_MODE_ON);
            } else {
                o();
                return;
            }
        } else if (i2 == 1) {
            if (!supportedFlashModes.contains(CameraParams.FLASH_MODE_ON) || !CameraUtils.isSupportCaptureFlush()) {
                o();
                return;
            }
            parameters.setFlashMode(CameraParams.FLASH_MODE_ON);
        }
        try {
            camera.setParameters(parameters);
            this.mTitle.ivFlash.setImageResource(R.drawable.griver_image_ic_flash_on);
            this.mTitle.ivFlash.setContentDescription(getString(R.string.griver_image_turn_off_flash));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("camera.setParameters exception,");
            sb.append(e2.getMessage());
            RVLogger.w(TAG, sb.toString());
            o();
        }
    }

    /* access modifiers changed from: private */
    public void o() {
        ToastUtils.showToast(this, getString(R.string.griver_image_tips_unable_to_flush), 0);
        this.w = f10447a;
        this.mTitle.ivFlash.setImageResource(R.drawable.griver_image_ic_flash_off);
        this.mTitle.ivFlash.setContentDescription(getString(R.string.griver_image_turn_on_flash));
    }

    private void a(boolean z2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(366551732, oncanceled);
            onCancelLoad.getMin(366551732, oncanceled);
        }
        if (this.v != 0) {
            TextView textView = this.videoIndicator;
            float f2 = (float) (-((this.videoIndicator.getWidth() + this.captureIndicator.getWidth()) / 2));
            long j2 = 0;
            ObjectAnimator.ofFloat(textView, "translationX", new float[]{f2, 0.0f}).setDuration(z2 ? 0 : 500).start();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.captureIndicator, "translationX", new float[]{f2, 0.0f});
            if (!z2) {
                j2 = 500;
            }
            ofFloat.setDuration(j2).start();
            this.captureIndicator.setTextColor(getResources().getColor(R.color.griver_image_colorWhite));
            this.videoIndicator.setTextColor(getResources().getColor(R.color.griver_image_captureBlue));
            this.v = 0;
        }
    }

    /* access modifiers changed from: private */
    public void q() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -864399364 == (max = dispatchOnCancelled.getMax(applicationContext, -864399364)))) {
            onCanceled oncanceled = new onCanceled(-864399364, max, 512);
            onCancelLoad.setMax(-864399364, oncanceled);
            onCancelLoad.getMin(-864399364, oncanceled);
        }
        r();
        this.u = 1;
        this.btnRecord.setViewType(CaptureBtn.Type.PICTURE);
        this.btnRecord.setVisibility(0);
        this.mTitle.setTitleText(getString(R.string.griver_image_capture));
        this.w = f10447a;
        n();
    }

    private void b(boolean z2) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -14735463 == (max = dispatchOnCancelled.getMax(applicationContext, -14735463)))) {
            onCanceled oncanceled = new onCanceled(-14735463, max, 512);
            onCancelLoad.setMax(-14735463, oncanceled);
            onCancelLoad.getMin(-14735463, oncanceled);
        }
        if (this.v != 1) {
            TextView textView = this.videoIndicator;
            float f2 = (float) (-((this.videoIndicator.getWidth() + this.captureIndicator.getWidth()) / 2));
            long j2 = 0;
            ObjectAnimator.ofFloat(textView, "translationX", new float[]{0.0f, f2}).setDuration(z2 ? 0 : 500).start();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.captureIndicator, "translationX", new float[]{0.0f, f2});
            if (!z2) {
                j2 = 500;
            }
            ofFloat.setDuration(j2).start();
            this.videoIndicator.setTextColor(getResources().getColor(R.color.griver_image_colorWhite));
            this.captureIndicator.setTextColor(getResources().getColor(R.color.griver_image_captureBlue));
            this.v = 1;
        }
    }

    private void r() {
        this.mTitle.llOptions.setVisibility(0);
        if (Camera.getNumberOfCameras() < 2 || !this.n) {
            this.mTitle.ivCamera.setVisibility(8);
            return;
        }
        this.mTitle.ivCamera.setVisibility(0);
        this.mTitle.ivCamera.setOnClickListener(this.M);
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        int min;
        int length;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-450990255, oncanceled);
            onCancelLoad.getMin(-450990255, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i2 == (min = dispatchOnCancelled.getMin(context, i2)))) {
            onCanceled oncanceled2 = new onCanceled(i2, min, 32);
            onCancelLoad.setMax(-450990255, oncanceled2);
            onCancelLoad.getMin(-450990255, oncanceled2);
        }
        this.u = 2;
        CameraUtils.switchCameraFacing(this.cameraView, this.C, this.L, i2);
    }

    private void c(boolean z2) {
        if (z2) {
            this.controlPanel.setVisibility(0);
            this.btnRecord.setVisibility(0);
            return;
        }
        this.controlPanel.setVisibility(8);
        this.btnRecord.setVisibility(8);
    }

    private void s() {
        this.s.setVisibility(8);
        this.s.clearAnimation();
    }

    /* access modifiers changed from: private */
    public void t() {
        this.x = false;
        s();
        this.controlPanel.setVisibility(0);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2044305806, oncanceled);
            onCancelLoad.getMin(-2044305806, oncanceled);
        }
        if (this.e != 3 || Math.abs(motionEvent.getX() - motionEvent2.getX()) < Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            return true;
        }
        l();
        int i2 = this.u;
        if (i2 != 0) {
            if (i2 == 1 && motionEvent.getX() - motionEvent2.getX() < 0.0f) {
                d(false);
            }
        } else if (motionEvent.getX() - motionEvent2.getX() > 0.0f) {
            e(false);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void d(boolean z2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-429448653, oncanceled);
            onCancelLoad.getMin(-429448653, oncanceled);
        }
        this.u = 2;
        RVLogger.d(TAG, "changeToVideoState------------------");
        a(z2);
        CameraUtils.openRecordMode(this.t, this.L);
    }

    /* access modifiers changed from: private */
    public void e(boolean z2) {
        RVLogger.d(TAG, "changeToPhotoState------------------");
        this.u = 2;
        b(z2);
        CameraUtils.openCaptureMode(this.t, this.L);
    }

    /* access modifiers changed from: package-private */
    public void publishImageAction(final MediaInfo mediaInfo) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1171624086, oncanceled);
            onCancelLoad.getMin(-1171624086, oncanceled);
        }
        runOnUiThread(new Runnable() {
            public void run() {
                GriverCaptureActivity.this.a(mediaInfo);
                if (GriverCaptureActivity.this.g) {
                    GriverCaptureActivity.this.finish();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(MediaInfo mediaInfo) {
        this.H = true;
        Intent intent = new Intent(GriverEnv.getApplicationContext(), GriverCapturePreviewActivity.class);
        intent.putExtras(this.A);
        intent.putExtra(GriverCapturePreviewActivity.EXTRA_KEY_MEDIA_INFO, mediaInfo);
        intent.putExtra(CaptureParam.INIT_CAMERA_FACING, this.C);
        startActivity(intent);
        overridePendingTransition(17432576, 17432577);
    }

    public void onStop() {
        super.onStop();
        this.D.removeCallbacksAndMessages((Object) null);
        if (!this.I) {
            x();
        } else {
            RVLogger.d(TAG, "Notify called before,do nothing.");
        }
        RVLogger.d(TAG, "onStop reached,call finish to release recourse.");
        manuallyReleaseCamera(this.cameraView);
        finish();
    }

    public void manuallyReleaseCamera(SightCameraView sightCameraView) {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(702355647, oncanceled);
            onCancelLoad.getMin(702355647, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(702355647, oncanceled2);
            onCancelLoad.getMin(702355647, oncanceled2);
        }
        if (sightCameraView != null) {
            RVLogger.d(TAG, "Manually release camera.");
            sightCameraView.releaseCamera();
            return;
        }
        RVLogger.d(TAG, "manuallyReleaseCamera:### cameraView null!");
    }

    public void onClick(View view) {
        if (view == this.mTitle.ivBack) {
            x();
            finish();
        } else if (view == this.btnFilter) {
            if (this.u != 2) {
                c(false);
            }
        } else if (view == this.p || view == this.q) {
            if (this.u != 2) {
                c(false);
                u();
                v();
            }
        } else if (view == this.r) {
            finish();
        }
    }

    private void u() {
        RVLogger.d(TAG, "changeToFrontCamera:");
        if (this.C == c) {
            RVLogger.d(TAG, "Perform changing");
            a(this.u);
            return;
        }
        RVLogger.d(TAG, "Now is front camera,no need to change.");
    }

    /* access modifiers changed from: protected */
    public void resetState() {
        runOnUiThread(new Runnable() {
            public void run() {
                GriverCaptureActivity.this.w();
                GriverCaptureActivity.this.t();
            }
        });
    }

    /* access modifiers changed from: private */
    public void w() {
        this.D.removeMessages(1);
        this.D.removeMessages(2);
        this.tipsText2.setVisibility(8);
        this.D.sendEmptyMessageDelayed(1, 1000);
    }

    /* access modifiers changed from: private */
    public void a(String str, int i2, int i3, int i4, Bundle bundle) {
        if (str.startsWith(File.separator)) {
            str = PhotoContext.FILE_SCHEME.concat(String.valueOf(str));
        }
        MediaInfo mediaInfo = new MediaInfo(0, str, i2, i3, i4, 0);
        if (bundle != null) {
            mediaInfo.mediaFileSize = bundle.getLong("picSize");
        }
        mediaInfo.isTakenByFrontCamera = this.C == d;
        publishImageAction(mediaInfo);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1519018680, oncanceled);
            onCancelLoad.getMin(-1519018680, oncanceled);
        }
        this.D.removeMessages(3);
        this.topTips.setVisibility(0);
        this.topTips.setText(str);
        this.D.sendEmptyMessageDelayed(3, 3000);
    }

    @SuppressLint({"Override"})
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 16);
            onCancelLoad.setMax(-1805617408, oncanceled);
            onCancelLoad.getMin(-1805617408, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1805617408, oncanceled2);
            onCancelLoad.getMin(-1805617408, oncanceled2);
        }
        SightCameraView sightCameraView = this.cameraView;
        if (sightCameraView != null) {
            sightCameraView.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (this.H) {
            RVLogger.d(TAG, "Need preview ,not notify at \"notifyFail\"");
            return;
        }
        this.I = true;
        CaptureServiceImpl.notifyAction(true, (MediaInfo) null, true);
    }

    static class InnerHandler extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<GriverCaptureActivity> f10449a;

        public InnerHandler(GriverCaptureActivity griverCaptureActivity) {
            this.f10449a = new WeakReference<>(griverCaptureActivity);
        }

        public void handleMessage(Message message) {
            GriverCaptureActivity griverCaptureActivity = this.f10449a.get();
            if (griverCaptureActivity == null) {
                return;
            }
            if (message.what == 1) {
                griverCaptureActivity.tipsText.setText((CharSequence) null);
                griverCaptureActivity.tipsText.setVisibility(8);
            } else if (message.what == 2) {
                griverCaptureActivity.tipsText2.setText((CharSequence) null);
                griverCaptureActivity.tipsText2.setVisibility(8);
            } else if (message.what == 3) {
                griverCaptureActivity.topTips.setText((CharSequence) null);
            }
        }
    }
}
