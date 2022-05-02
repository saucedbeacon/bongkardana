package com.alibaba.griver.image.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.content.PermissionChecker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.framework.api.GriverImageLoadExtension;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alibaba.griver.image.photo.PhotoResolver;
import com.alibaba.griver.image.photo.adapter.BucketAdapter;
import com.alibaba.griver.image.photo.adapter.GridAdapter;
import com.alibaba.griver.image.photo.meta.BucketInfo;
import com.alibaba.griver.image.photo.meta.PhotoGrid;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoItem;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.utils.AnimationUtil;
import com.alibaba.griver.image.photo.utils.CommonUtils;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alibaba.griver.image.photo.widget.PhotoGridView;
import com.alipay.multimedia.adjuster.api.APMSandboxProcessor;
import com.alipay.multimedia.adjuster.api.data.APMInsertReq;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import o.FontRes;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.restorePresenterStates;

public class GriverPhotoSelectActivity extends GriverMediaBaseActivity implements View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener, GridAdapter.OnGridListener, PhotoGridView.OnOverScrolledListener {
    public static final String ACTION_PHOTO_ADAPTER_CHANGE = "com.alipay.mobile.beehive.photo.ACTION_PHOTO_ADAPTER_CHANGE";
    public static final int CODE_EDIT_VIDEO = 1001;
    public static final int GRID_WIDTH = 60;
    public static final int REQUEST_CAMERA = 701;
    public static final int REQUEST_PREVIEW = 702;
    public static final String TAG = "GriverPhotoSelectActivity";
    private static final String[] af = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static boolean enableGifDynamicPreview;
    public static final int getMin = FileUtils.JPEG_MARKER_EOI;
    public static boolean selectGif;
    public static final byte[] setMax = {111, -124, 63, -24, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private LinearLayout A;
    private Button B;
    private boolean C;
    /* access modifiers changed from: private */
    public TextView D;
    private TextView E;
    private boolean F;
    private boolean G;
    private ImageView H;
    private int I;
    private PhotoItem J;
    private Handler K = new Handler(Looper.getMainLooper());
    private int L;
    private FrameLayout M;
    /* access modifiers changed from: private */
    public boolean N;
    private LinkedHashSet<String> O;
    private TextView P;
    private boolean Q;
    private boolean R = false;
    private float S;
    private TextView T;
    private boolean U;
    private boolean V;
    private LinearLayout W;
    /* access modifiers changed from: private */
    public CheckBox X;
    private int Y;
    private int Z;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public PhotoGridView f10453a;
    private String aa;
    private boolean ab;
    /* access modifiers changed from: private */
    public View ac;
    private boolean ad;
    private int ae;
    /* access modifiers changed from: private */
    public boolean ag = false;
    private String ah;
    private boolean ai;
    private Runnable aj = new Runnable() {
        public void run() {
            GriverPhotoSelectActivity.this.D.setVisibility(8);
        }
    };
    private ListView b;
    private Button c;
    private TextView d;
    private TextView e;
    private PhotoResolver f;
    private String g;
    /* access modifiers changed from: private */
    public PhotoContext h;
    private LinearLayout i;
    private GridAdapter j;
    private BucketAdapter k;
    private File l;
    private List<PhotoItem> m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f10454o;
    private boolean p;
    private int q;
    private boolean r;
    private int s;
    private boolean t;
    private String u;
    private String v;
    private String w;
    private View x;
    private String y;
    private RelativeLayout z;

    /* access modifiers changed from: private */
    public void j() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(947284441, oncanceled);
            onCancelLoad.getMin(947284441, oncanceled);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r6, byte r7, int r8) {
        /*
            byte[] r0 = setMax
            int r7 = r7 * 165
            int r7 = 176 - r7
            int r6 = r6 * 175
            int r6 = 178 - r6
            int r8 = r8 * 45
            int r8 = 101 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r8
            goto L_0x0035
        L_0x001c:
            r3 = 0
        L_0x001d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0028:
            int r6 = r6 + 1
            byte r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0035:
            int r8 = r8 + r6
            int r8 = r8 + -2
            r6 = r7
            r7 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.activity.GriverPhotoSelectActivity.length(short, byte, int):java.lang.String");
    }

    private void s() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(431549412, oncanceled);
            onCancelLoad.getMin(431549412, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(431549412, oncanceled2);
            onCancelLoad.getMin(431549412, oncanceled2);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && i2 != (min = dispatchOnCancelled.setMin(applicationContext, i2))) {
            onCanceled oncanceled = new onCanceled(i2, min, 8);
            onCancelLoad.setMax(173281106, oncanceled);
            onCancelLoad.getMin(173281106, oncanceled);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        int length2;
        byte[] bArr = setMax;
        byte b2 = (byte) bArr[8];
        String length3 = length((byte) bArr[85], b2, (byte) b2);
        byte[] bArr2 = setMax;
        byte b3 = (byte) bArr2[85];
        String length4 = length((byte) bArr2[8], b3, (byte) b3);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(2022177306, oncanceled);
            onCancelLoad.getMin(2022177306, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(2022177306, oncanceled2);
            onCancelLoad.getMin(2022177306, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || 2022177306 == (max = dispatchOnCancelled.getMax(applicationContext3, 2022177306)))) {
            onCanceled oncanceled3 = new onCanceled(2022177306, max, 512);
            onCancelLoad.setMax(2022177306, oncanceled3);
            onCancelLoad.getMin(2022177306, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(2022177306, oncanceled4);
            onCancelLoad.getMin(2022177306, oncanceled4);
        }
        RVLogger.d("videoCompact", "version:6");
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.Q = false;
        this.I = 0;
        if (bundle == null) {
            bundle = getIntent().getExtras();
            if (bundle == null) {
                finish();
                return;
            }
        } else {
            RVLogger.d(TAG, "initialize photo select with save instance.");
        }
        setContentView(R.layout.griver_image_activity_photo_select);
        f();
        c(bundle);
        a(bundle);
        b();
        ((GriverImageLoadExtension) RVProxy.get(GriverImageLoadExtension.class)).init();
    }

    private boolean a() {
        PackageManager packageManager = getPackageManager();
        for (String checkPermission : af) {
            if (packageManager.checkPermission(checkPermission, getPackageName()) != 0) {
                return false;
            }
        }
        return true;
    }

    private void b() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1067568977 == (max = dispatchOnCancelled.getMax(applicationContext, 1067568977)))) {
            onCanceled oncanceled = new onCanceled(1067568977, max, 512);
            onCancelLoad.setMax(1067568977, oncanceled);
            onCancelLoad.getMin(1067568977, oncanceled);
        }
        if (Build.VERSION.SDK_INT >= 23 && !a()) {
            requestPermissions(af, 101);
        }
    }

    private void a(Bundle bundle) {
        int i2 = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1738875680, oncanceled);
            onCancelLoad.getMin(1738875680, oncanceled);
        }
        boolean z2 = true;
        if (this.p) {
            PhotoItem photoItem = new PhotoItem();
            this.J = photoItem;
            photoItem.takePhoto = true;
        }
        if (TextUtils.isEmpty(this.f10454o)) {
            this.f10454o = getString(R.string.griver_image_preview);
        }
        if (TextUtils.isEmpty(this.u)) {
            this.u = getString(R.string.griver_image_max_message, new Object[]{Integer.valueOf(this.s)});
        }
        if (TextUtils.isEmpty(this.n)) {
            this.n = getString(R.string.griver_image_send);
        }
        if (TextUtils.isEmpty(this.v)) {
            this.v = getString(R.string.griver_image_all_bucket);
            if (this.R) {
                this.v = getString(R.string.griver_image_all_bucket_with_video);
            }
        }
        this.E.setText(this.v);
        this.i.setVisibility(this.t ? 0 : 8);
        this.e.setText(this.f10454o);
        this.e.setVisibility((!this.r || this.s <= 1) ? 8 : 0);
        this.T.setVisibility(this.U ? 0 : 8);
        GridAdapter gridAdapter = new GridAdapter(this, (ArrayList<PhotoItem>) null, this.F && this.s > 1);
        this.j = gridAdapter;
        gridAdapter.setGridListener(this);
        this.j.setEnableVideoEdit(this.V);
        this.f10453a.setAdapter(this.j);
        this.z.setVisibility(this.F && this.s > 0 ? 0 : 8);
        if (!this.F || this.s <= 1) {
            z2 = false;
        }
        this.c.setVisibility(z2 ? 0 : 8);
        this.h = PhotoContext.get(this.g);
        PhotoContext.remove(this.g);
        this.m = this.h.photoList;
        ArrayList<String> stringArrayList = bundle.getStringArrayList(PhotoParam.SELECTED_PHOTO_PATHS);
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            this.O = linkedHashSet;
            linkedHashSet.addAll(stringArrayList);
        }
        this.w = getString(R.string.griver_image_all_bucket);
        if (this.R) {
            this.w = getString(R.string.griver_image_all_bucket_with_video);
        }
        this.d.setText(this.w);
        this.D.setVisibility(8);
        if (!this.F) {
            this.x.setVisibility(8);
        }
        this.B.setOnClickListener(this);
        Button button = this.B;
        if (!this.G) {
            i2 = 8;
        }
        button.setVisibility(i2);
        ImageHelper.optimizeView(this.f10453a, (AbsListView.OnScrollListener) null);
        this.f10453a.setOnOverScrolledListener(this);
        k();
        if (this.C) {
            p();
        }
        long currentTimeMillis = System.currentTimeMillis();
        RVLogger.d("PhotoDisplayLink", "updateViewsByConfig:###");
        c();
        h();
        StringBuilder sb = new StringBuilder("initPhotoResolver cost time(ms) = ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d(TAG, sb.toString());
        b(bundle);
    }

    private void b(Bundle bundle) {
        this.W.setVisibility(this.ad ? 0 : 8);
        if (this.ad) {
            this.h.userOriginPhoto = bundle.getBoolean(PhotoParam.USE_ORIGIN_PHOTO, false);
            this.X.setChecked(this.h.userOriginPhoto);
            this.W.findViewById(R.id.tv_origin).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    GriverPhotoSelectActivity.this.X.toggle();
                }
            });
        }
    }

    public static int readPictureDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    private void c() {
        RVLogger.d("PhotoDisplayLink", "initPhotoResolver:###");
        if (!this.t || !this.F || !d()) {
            this.t = false;
        } else if (this.h.photoResolver == null) {
            i();
            e();
            this.i.setOnClickListener(this);
        } else {
            this.f = this.h.photoResolver;
        }
    }

    private boolean d() {
        List<PhotoItem> list = this.m;
        return list == null || list.isEmpty();
    }

    private void e() {
        RVLogger.d("PhotoDisplayLink", "callResolverToStartScan:###");
        this.ag = false;
        if (this.ab) {
            this.f.asyncScanPhotoAndVideo(false, true);
        } else {
            this.f.asyncScanPhotoAndVideo(true, this.R);
        }
        this.K.postDelayed(new Runnable() {
            public void run() {
                if (GriverPhotoSelectActivity.this.ag || GriverPhotoSelectActivity.this.isFinishing()) {
                    RVLogger.d(GriverPhotoSelectActivity.TAG, "Cost less than 1000ms.");
                    return;
                }
                RVLogger.d(GriverPhotoSelectActivity.TAG, "Cost more than 1000ms ,display progressbar.");
                GriverPhotoSelectActivity.this.ac.setVisibility(0);
            }
        }, 1000);
    }

    private void f() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 118685749 == (max = dispatchOnCancelled.getMax(applicationContext, 118685749)))) {
            onCanceled oncanceled = new onCanceled(118685749, max, 512);
            onCancelLoad.setMax(118685749, oncanceled);
            onCancelLoad.getMin(118685749, oncanceled);
        }
        this.W = (LinearLayout) findViewById(R.id.ll_select_original_photo);
        CheckBox checkBox = (CheckBox) findViewById(R.id.cb_origin);
        this.X = checkBox;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (GriverPhotoSelectActivity.this.h != null) {
                    GriverPhotoSelectActivity.this.h.userOriginPhoto = z;
                    GriverPhotoSelectActivity griverPhotoSelectActivity = GriverPhotoSelectActivity.this;
                    boolean unused = griverPhotoSelectActivity.N = griverPhotoSelectActivity.h.userOriginPhoto;
                }
            }
        });
        this.A = (LinearLayout) findViewById(R.id.ll_bottom_menu);
        this.D = (TextView) findViewById(R.id.tv_timetext);
        this.B = (Button) findViewById(R.id.bt_select);
        this.i = (LinearLayout) findViewById(R.id.ll_buckets);
        ImageView imageView = (ImageView) findViewById(R.id.bt_back);
        this.H = imageView;
        CommonUtils.setTitleBarBackDrawable(imageView);
        this.c = (Button) findViewById(R.id.bt_finish);
        this.d = (TextView) findViewById(R.id.tv_bucket);
        this.x = findViewById(R.id.iv_bucket);
        this.e = (TextView) findViewById(R.id.tv_preview);
        TextView textView = (TextView) findViewById(R.id.tv_edit);
        this.T = textView;
        textView.setOnClickListener(this);
        this.f10453a = (PhotoGridView) findViewById(R.id.gv_photo);
        this.z = (RelativeLayout) findViewById(R.id.rl_bottom_bar);
        this.b = (ListView) findViewById(R.id.lv_buckets);
        this.E = (TextView) findViewById(R.id.tv_title);
        this.ac = findViewById(R.id.pb_loading_data);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_buckets);
        this.M = frameLayout;
        frameLayout.setOnClickListener(this);
        this.b.setOnItemClickListener(this);
        this.P = (TextView) findViewById(R.id.empty_tips);
        this.H.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    private void c(Bundle bundle) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(72763506, oncanceled);
            onCancelLoad.getMin(72763506, oncanceled);
        }
        this.ad = bundle.getBoolean(PhotoParam.ENABLE_SELECT_ORIGIN, true);
        String string = bundle.getString("businessId");
        this.aa = string;
        ImageHelper.updateBusinessId(string, TAG);
        this.R = bundle.getBoolean(PhotoParam.PHOTO_SELECT_CONTAIN_VIDEO, false);
        boolean z2 = bundle.getBoolean(PhotoParam.SELECT_VIDEO_ONLY, false);
        this.ab = z2;
        this.R = z2 || this.R;
        this.S = bundle.getFloat(PhotoParam.BEAUTY_IMAGE_LEVEL, -1.0f);
        this.ae = bundle.getInt(PhotoParam.COMPRESS_IMAGE_QUALITY, -1);
        this.F = bundle.getBoolean(PhotoParam.PHOTO_SELECT, false);
        this.p = bundle.getBoolean(PhotoParam.ENABLE_CAMERA, true);
        this.r = bundle.getBoolean(PhotoParam.ENABLE_PREVIEW, true);
        this.U = bundle.getBoolean(PhotoParam.ENABLE_EDIT_PHOTO, false);
        this.t = bundle.getBoolean(PhotoParam.ENABLE_BUCKET, true);
        this.G = bundle.getBoolean(PhotoParam.ENABLE_GRID_OPTION, false);
        this.V = bundle.getBoolean(PhotoParam.ENABLE_VIDEO_CUT, false);
        this.f10454o = bundle.getString(PhotoParam.PREVIEW_BUTTON);
        this.s = bundle.getInt(PhotoParam.MAX_SELECT, 9);
        this.u = bundle.getString(PhotoParam.MAX_SELECT_MSG);
        this.n = bundle.getString(PhotoParam.FINISH_TEXT);
        this.g = bundle.getString(PhotoParam.CONTEXT_INDEX);
        StringBuilder sb = new StringBuilder("PhotoSelect context index ");
        sb.append(this.g);
        RVLogger.d(TAG, sb.toString());
        this.v = bundle.getString(PhotoParam.BUCKET_NAME);
        int i2 = bundle.getInt(PhotoParam.FINISH_BTN_BG_COLOR, -1);
        if (i2 != -1) {
            this.c.setBackgroundColor(i2);
        }
        this.C = bundle.getBoolean("optionActive", false);
        selectGif = bundle.getBoolean(PhotoParam.SELECT_GIF, false);
        enableGifDynamicPreview = bundle.getBoolean(PhotoParam.ENABLE_GIF_DYNAMIC_PREVIEW, true);
        this.L = bundle.getInt(PhotoParam.MIN_PHOTO_SIZE, PhotoParam.DEFAULT_MIN_PHOTO_SIZE);
        this.Y = bundle.getInt(PhotoParam.KEY_MIN_PHOTO_WIDTH, 0);
        this.Z = bundle.getInt(PhotoParam.KEY_MIN_PHOTO_HEIGHT, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.g);
        sb2.append("_camera");
        this.y = sb2.toString();
    }

    private void g() {
        this.P.setVisibility(this.k.getData().isEmpty() ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -693037677 == (max = dispatchOnCancelled.getMax(applicationContext, -693037677)))) {
            onCanceled oncanceled = new onCanceled(-693037677, max, 512);
            onCancelLoad.setMax(-693037677, oncanceled);
            onCancelLoad.getMin(-693037677, oncanceled);
        }
        super.onSaveInstanceState(bundle);
        StringBuilder sb = new StringBuilder("onSaveInstanceState ");
        sb.append(this.g);
        RVLogger.d(TAG, sb.toString());
        this.Q = true;
        bundle.putAll(getIntent().getExtras());
        bundle.putInt(PhotoParam.PREVIEW_POSITION, this.f10453a.getFirstVisiblePosition());
        bundle.putString(PhotoParam.CONTEXT_INDEX, this.g);
        bundle.putBoolean("optionActive", this.C);
        PhotoContext.contextMap.put(this.g, this.h);
    }

    private void h() {
        if (this.t) {
            a(this.w, "onBucketReady");
            BucketAdapter bucketAdapter = new BucketAdapter(this, this.f.getBucketList());
            this.k = bucketAdapter;
            this.b.setAdapter(bucketAdapter);
            g();
            this.q = 0;
            return;
        }
        if (d()) {
            ((TextView) findViewById(R.id.tv_no_photo)).setVisibility(0);
        } else {
            this.j.setData(this.m);
        }
        RVLogger.d(TAG, "disable bucket for user set photoList.");
        this.x.setVisibility(8);
    }

    private void i() {
        RVLogger.d("PhotoDisplayLink", "doInitPhotoResolver:###");
        PhotoResolver photoResolver = new PhotoResolver(this, new PhotoResolver.BucketUpdateListener() {
            public void onScanFinished() {
                boolean unused = GriverPhotoSelectActivity.this.ag = true;
                GriverPhotoSelectActivity.this.ac.setVisibility(8);
                GriverPhotoSelectActivity.this.w();
                GriverPhotoSelectActivity.this.C();
            }

            public void onScanStep() {
                if (!GriverPhotoSelectActivity.this.isFinishing()) {
                    GriverPhotoSelectActivity.this.j();
                    GriverPhotoSelectActivity.this.b("onScanStep");
                }
            }
        });
        this.f = photoResolver;
        LinkedHashSet<String> linkedHashSet = this.O;
        photoResolver.setEnableStepScan(linkedHashSet == null || linkedHashSet.isEmpty());
        this.f.setAllBucketName(this.w);
        this.f.setEnableGif(selectGif);
        this.f.setMinPhotoSize(this.L);
        this.f.setMinPhotoWidth(this.Y);
        this.f.setMinPhotoHeight(this.Z);
        this.f.setSelectedPhotoPaths(this.O);
        this.h.photoResolver = this.f;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PhotoContext.remove(this.g);
        final int intExtra = intent.getIntExtra(PhotoParam.PREVIEW_POSITION, -1);
        int firstVisiblePosition = this.f10453a.getFirstVisiblePosition();
        int lastVisiblePosition = this.f10453a.getLastVisiblePosition();
        if (intExtra != -1 && (intExtra > lastVisiblePosition || intExtra < firstVisiblePosition)) {
            this.f10453a.setSelection(intExtra);
        }
        if (intExtra == 0) {
            RVLogger.d(TAG, "no need to indicate current position.");
        } else {
            this.f10453a.postDelayed(new Runnable() {
                public void run() {
                    PhotoGrid photoGrid = (PhotoGrid) GriverPhotoSelectActivity.this.f10453a.getChildAt(intExtra - GriverPhotoSelectActivity.this.f10453a.getFirstVisiblePosition());
                    if (photoGrid != null) {
                        photoGrid.animateSelection();
                    }
                }
            }, 400);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1737173175 == (max = dispatchOnCancelled.getMax(applicationContext, -1737173175)))) {
            onCanceled oncanceled = new onCanceled(-1737173175, max, 512);
            onCancelLoad.setMax(-1737173175, oncanceled);
            onCancelLoad.getMin(-1737173175, oncanceled);
        }
        try {
            super.onResume();
            q();
            r();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("OnResume exception :");
            sb.append(e2.getMessage());
            RVLogger.e(TAG, sb.toString());
            finish();
        }
    }

    private void k() {
        this.A.setVisibility(8);
    }

    private void l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.h.selectedList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.h.selectedList);
        this.h.photoList = arrayList;
        this.h.selectedList = arrayList2;
        a(0, true);
    }

    private void m() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-338340014, oncanceled);
            onCancelLoad.getMin(-338340014, oncanceled);
        }
        this.h.sendSelectedPhoto(this, this.S, this.ae, new Runnable() {
            public void run() {
                GriverPhotoSelectActivity.this.n();
            }
        }, this.X.isChecked());
    }

    /* access modifiers changed from: private */
    public void n() {
        StringBuilder sb = new StringBuilder("toggleFinish ");
        sb.append(this.g);
        RVLogger.d(TAG, sb.toString());
        finish();
    }

    private void o() {
        boolean z2 = !this.C;
        this.C = z2;
        if (!z2) {
            for (PhotoItem selected : this.m) {
                selected.setSelected(false);
            }
            this.h.selectedList.clear();
        }
        p();
    }

    private void p() {
        boolean z2 = false;
        if (!this.C) {
            this.B.setText(getString(R.string.griver_image_select));
            this.A.setVisibility(8);
        } else {
            this.B.setText(getString(R.string.griver_image_cancel));
            this.A.setVisibility(0);
        }
        if (this.C || (this.F && this.s > 1)) {
            z2 = true;
        }
        this.j.setCheckable(z2);
        r();
        q();
    }

    private void q() {
        String str;
        String str2;
        PhotoContext photoContext;
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1600409098, oncanceled);
            onCancelLoad.getMin(-1600409098, oncanceled);
        }
        RVLogger.d(TAG, "updateContent:###");
        int size = this.h.selectedList != null ? this.h.selectedList.size() : 0;
        RVLogger.d(TAG, "selectedCount =".concat(String.valueOf(size)));
        if (this.A.getVisibility() == 0) {
            int childCount = this.A.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.A.getChildAt(i2).setEnabled(size > 0);
            }
        }
        this.c.setEnabled(size > 0);
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10454o);
            sb.append("(");
            sb.append(size);
            sb.append(")");
            str = sb.toString();
        } else {
            str = this.f10454o;
        }
        this.e.setText(str);
        this.e.setEnabled(size > 0);
        if (size != 1 || (photoContext = this.h) == null || photoContext.selectedList == null || this.h.selectedList.isEmpty() || this.h.selectedList.get(0).getMediaType() != 0 || (this.h.selectedList.get(0).isGif() && enableGifDynamicPreview)) {
            this.T.setEnabled(false);
        } else {
            this.T.setEnabled(true);
        }
        if (size > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.n);
            sb2.append("(");
            sb2.append(size);
            sb2.append("/");
            sb2.append(this.s);
            sb2.append(")");
            str2 = sb2.toString();
        } else {
            str2 = this.n;
        }
        this.c.setText(str2);
        if (!this.G) {
            return;
        }
        if (!this.C) {
            this.E.setText(this.v);
        } else {
            this.E.setText(getString(R.string.griver_image_select_photo_count, new Object[]{Integer.valueOf(size)}));
        }
    }

    public void finish() {
        super.finish();
        AnimationUtil.fadeInFadeOut(this);
        PhotoContext photoContext = this.h;
        if (photoContext == null) {
            RVLogger.w(TAG, "finish called,photoContent happend to be Null!");
        } else if (!photoContext.selectSent && this.h.selectListener != null) {
            this.h.selectListener.onSelectCanceled();
        }
    }

    public void onClick(View view) {
        if (view.equals(this.c)) {
            m();
        } else if (view.equals(this.i)) {
            u();
        } else if (view.equals(this.e)) {
            l();
        } else if (view.equals(this.H)) {
            n();
        } else if (view.equals(this.B)) {
            o();
        } else if (view.equals(this.M)) {
            u();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        int min;
        int min2;
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(1339405775, oncanceled);
            onCancelLoad.getMin(1339405775, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (min2 = dispatchOnCancelled.setMin(applicationContext, i2)))) {
            onCanceled oncanceled2 = new onCanceled(i2, min2, 8);
            onCancelLoad.setMax(1339405775, oncanceled2);
            onCancelLoad.getMin(1339405775, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i2 == (min = dispatchOnCancelled.getMin(context, i2)))) {
            onCanceled oncanceled3 = new onCanceled(i2, min, 32);
            onCancelLoad.setMax(1339405775, oncanceled3);
            onCancelLoad.getMin(1339405775, oncanceled3);
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 701 && i3 == -1) {
            t();
        } else if (i2 == 702 && i3 == -1) {
            this.h.selectSent = true;
            n();
        } else if (i2 == 702 && i3 == 0) {
            if (intent != null) {
                this.N = intent.getBooleanExtra(PhotoParam.USE_ORIGIN_PHOTO, false);
                if (this.X.getVisibility() == 0) {
                    this.X.setChecked(this.N);
                }
            }
            this.h.photoList = this.m;
            if (PhotoContext.contextMap.containsKey(this.y)) {
                PhotoContext.contextMap.remove(this.y);
            }
        } else if (i2 == 1001 && i3 == -1) {
            n();
        }
    }

    private void r() {
        int firstVisiblePosition = this.f10453a.getFirstVisiblePosition();
        int lastVisiblePosition = this.f10453a.getLastVisiblePosition();
        boolean z2 = true;
        if ((this.s <= 1 || !this.F) && !this.C) {
            z2 = false;
        }
        for (int i2 = firstVisiblePosition; i2 <= lastVisiblePosition; i2++) {
            PhotoGrid photoGrid = (PhotoGrid) this.f10453a.getChildAt(i2 - firstVisiblePosition);
            photoGrid.setCheckable(z2);
            photoGrid.updateGrid();
        }
    }

    private void a(int i2, boolean z2) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (length = dispatchOnCancelled.length(applicationContext, i2)))) {
            onCanceled oncanceled = new onCanceled(i2, length, 4);
            onCancelLoad.setMax(516835229, oncanceled);
            onCancelLoad.getMin(516835229, oncanceled);
        }
        RVLogger.w(TAG, "preview:### index = ".concat(String.valueOf(i2)));
        PhotoContext.contextMap.put(this.g, this.h);
        Intent intent = new Intent(this, GriverPhotoPreviewActivity.class);
        intent.putExtras(getIntent().getExtras());
        if (this.V) {
            i2 = a(i2);
        }
        intent.putExtra(PhotoParam.PREVIEW_POSITION, i2);
        intent.putExtra(PhotoParam.PHOTO_SELECT, this.F);
        intent.addFlags(131072);
        intent.addFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
        intent.putExtra(PhotoParam.USE_ORIGIN_PHOTO, this.N);
        intent.putExtra(PhotoParam.SELECT_GRID, this.C);
        intent.setFlags(67108864);
        startActivityForResult(intent, 702);
        AnimationUtil.fadeInFadeOut(this);
    }

    private void t() {
        Uri uri;
        if (this.l == null) {
            RVLogger.e(TAG, "CameraPath empty!");
            return;
        }
        if (PhotoUtil.isQCompact()) {
            uri = FileProvider.getUriForFile(this, "com.alipay.mobile.camera.fileprovider", this.l);
        } else {
            uri = Uri.fromFile(this.l);
        }
        StringBuilder sb = new StringBuilder(PhotoContext.FILE_SCHEME);
        sb.append(this.l.getAbsolutePath());
        String obj = sb.toString();
        if (!this.l.exists()) {
            RVLogger.d(TAG, "failed to get camera file");
            return;
        }
        if (PhotoUtil.isQCompact()) {
            APMSandboxProcessor.insertMediaFile(new APMInsertReq.Builder(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, uri, this.l.getName()).mimeType("image/jpeg").build());
        } else {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uri);
            sendBroadcast(intent);
        }
        RVLogger.d(TAG, "onTakePhoto from camera ".concat(String.valueOf(obj)));
        PhotoItem photoItem = new PhotoItem(obj, true);
        photoItem.setIsPicCurrentlyTaked(true);
        photoItem.setPhotoSize(this.l.length());
        photoItem.setPhotoOrientation(readPictureDegree(this.l.getAbsolutePath()));
        if (this.s == 1) {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(photoItem);
            this.h.selectedList.add(photoItem);
            m();
            return;
        }
        PhotoContext photoContext = PhotoContext.get(this.y);
        photoContext.selectedList = new ArrayList();
        photoContext.photoList = new ArrayList();
        PhotoContext photoContext2 = this.h;
        if (!(photoContext2 == null || photoContext2.selectedList == null || this.h.selectedList.size() <= 0)) {
            photoContext.selectedList.addAll(this.h.selectedList);
            photoContext.photoList.addAll(this.h.selectedList);
        }
        photoContext.selectedList.add(photoItem);
        photoContext.photoList.add(photoItem);
        photoContext.selectListener = this.h.selectListener;
        Intent intent2 = new Intent(this, GriverPhotoPreviewActivity.class);
        intent2.putExtras(getIntent().getExtras());
        int size = photoContext.photoList.size() - 1;
        if (size < 0) {
            size = 0;
        }
        intent2.putExtra(PhotoParam.PREVIEW_POSITION, size);
        intent2.putExtra(PhotoParam.PHOTO_SELECT, this.F);
        intent2.putExtra(PhotoParam.MAX_SELECT, this.s);
        intent2.putExtra(PhotoParam.CONTEXT_INDEX, this.y);
        intent2.putExtra(PhotoParam.USE_ORIGIN_PHOTO, this.N);
        startActivityForResult(intent2, 702);
        AnimationUtil.fadeInFadeOut(this);
    }

    private int a(int i2) {
        int i3;
        RVLogger.w(TAG, "getIndexAfterFilterVideo:###");
        try {
            if (this.m != null && !this.m.isEmpty()) {
                PhotoInfo photoInfo = this.m.get(i2);
                int i4 = 0;
                i3 = 0;
                while (true) {
                    if (i4 >= this.m.size()) {
                        break;
                    }
                    PhotoItem photoItem = this.m.get(i4);
                    if (!photoItem.isVideo()) {
                        if (photoItem == photoInfo) {
                            break;
                        }
                        i3++;
                    }
                    i4++;
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("getIndexAfterFilterVideo:Should not be here. ");
            sb.append(e2.getMessage());
            RVLogger.w(TAG, sb.toString());
        }
        i3 = i2;
        StringBuilder sb2 = new StringBuilder("Before = ");
        sb2.append(i2);
        sb2.append(" after = ");
        sb2.append(i3);
        RVLogger.w(TAG, sb2.toString());
        return i3;
    }

    private void u() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(895811834, oncanceled);
            onCancelLoad.getMin(895811834, oncanceled);
        }
        if (this.b.getVisibility() != 0) {
            this.M.setVisibility(0);
            this.M.startAnimation(AnimationUtils.loadAnimation(this, R.anim.griver_image_fade_in));
            this.b.setVisibility(0);
            this.b.startAnimation(AnimationUtils.loadAnimation(this, R.anim.griver_image_select_pop_up));
            return;
        }
        this.M.setVisibility(4);
        this.M.startAnimation(AnimationUtils.loadAnimation(this, R.anim.griver_image_fade_out));
        this.b.setVisibility(4);
        this.b.startAnimation(AnimationUtils.loadAnimation(this, R.anim.griver_image_effect_select_pop_down));
    }

    public void onBackPressed() {
        if (this.b.getVisibility() == 0) {
            u();
        } else if (!this.G || !this.C) {
            super.onBackPressed();
        } else {
            o();
        }
    }

    private void a(String str, String str2) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        PhotoItem photoItem = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2028441690, oncanceled);
            onCancelLoad.getMin(-2028441690, oncanceled);
        }
        StringBuilder sb = new StringBuilder("onBucketSelected: ");
        sb.append(str);
        sb.append(",caller -> ");
        sb.append(str2);
        RVLogger.d("PhotoDisplayLink", sb.toString());
        RVLogger.d(TAG, "Selected album: ".concat(String.valueOf(str)));
        PhotoResolver photoResolver = this.f;
        if (photoResolver != null) {
            this.m = photoResolver.getBucketList(str);
            if (this.ag) {
                q();
            }
        }
        GridAdapter gridAdapter = this.j;
        if (this.p && this.q == 0) {
            photoItem = this.J;
        }
        gridAdapter.cameraItem = photoItem;
        PhotoContext photoContext = this.h;
        if (photoContext == null) {
            RVLogger.w(TAG, "onBucketSelected photoContext null!");
            return;
        }
        photoContext.photoList = this.m;
        this.j.setData(this.m);
        if (!TextUtils.equals(this.ah, str)) {
            this.f10453a.post(new Runnable() {
                public void run() {
                    GriverPhotoSelectActivity.this.f10453a.setSelection(0);
                }
            });
        }
        this.ah = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(644823776, oncanceled);
            onCancelLoad.getMin(644823776, oncanceled);
        }
        BucketInfo bucketInfo = (BucketInfo) adapterView.getItemAtPosition(i2);
        for (int i3 = 0; i3 < adapterView.getCount(); i3++) {
            BucketInfo bucketInfo2 = (BucketInfo) adapterView.getItemAtPosition(i3);
            if (i3 == i2) {
                bucketInfo2.setSelected(true);
            } else {
                bucketInfo2.setSelected(false);
            }
        }
        this.q = i2;
        this.w = bucketInfo.getName();
        this.k.notifyDataSetChanged();
        this.d.setText(this.w);
        u();
        a(this.w, "onItemClick");
    }

    private void v() {
        LinkedHashSet<String> linkedHashSet = this.O;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            Collections.sort(this.h.selectedList, new Comparator<PhotoItem>() {
                public int compare(PhotoItem photoItem, PhotoItem photoItem2) {
                    return GriverPhotoSelectActivity.this.a(photoItem.getPhotoPath()) - GriverPhotoSelectActivity.this.a(photoItem2.getPhotoPath());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public int a(String str) {
        Iterator<String> it = this.O.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void onGridClick(PhotoGrid photoGrid, int i2) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1387867316, oncanceled);
            onCancelLoad.getMin(1387867316, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1387867316, oncanceled2);
            onCancelLoad.getMin(1387867316, oncanceled2);
        }
        if (this.q == 0 && i2 == -1 && this.p) {
            x();
        } else if (this.r) {
            c(i2);
        } else if (this.s == 1) {
            b(i2);
        }
    }

    private void b(int i2) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (max = dispatchOnCancelled.setMax(applicationContext, i2, 0)))) {
            onCanceled oncanceled = new onCanceled(i2, max, 2);
            onCancelLoad.setMax(-1424019154, oncanceled);
            onCancelLoad.getMin(-1424019154, oncanceled);
        }
        List<PhotoItem> list = this.m;
        if (list == null || i2 >= list.size()) {
            RVLogger.w(TAG, "OnGridClick,but index invalid!");
            return;
        }
        PhotoItem photoItem = this.m.get(i2);
        photoItem.setSelected(true);
        this.h.selectedList.add(photoItem);
        m();
    }

    private void c(int i2) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (max = dispatchOnCancelled.setMax(applicationContext, i2, 0)))) {
            onCanceled oncanceled = new onCanceled(i2, max, 2);
            onCancelLoad.setMax(1439580057, oncanceled);
            onCancelLoad.getMin(1439580057, oncanceled);
        }
        List<PhotoItem> list = this.m;
        if (list == null || i2 >= list.size()) {
            RVLogger.w(TAG, "OnGridClick,but index invalid!");
            return;
        }
        this.h.photoList = this.m;
        a(i2, false);
    }

    /* access modifiers changed from: private */
    public void w() {
        RVLogger.d(TAG, "restorePreSelectedPhotos:###");
        List<PhotoItem> bucketList = this.f.getBucketList(this.w);
        if (this.h.selectedList != null && bucketList != null && !bucketList.isEmpty()) {
            try {
                for (PhotoItem next : bucketList) {
                    if (next != null && next.getSelected() && !this.h.selectedList.contains(next)) {
                        this.h.selectedList.add(next);
                    }
                }
                v();
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("restorePreSelectedPhotos Exception :");
                sb.append(e2.getMessage());
                RVLogger.w(TAG, sb.toString());
            }
            q();
        }
    }

    private void x() {
        PhotoContext photoContext = this.h;
        if (photoContext == null || photoContext.selectedList == null || this.h.selectedList.size() < this.s) {
            y();
        } else {
            ToastUtils.showToast(this, this.u, 0);
        }
    }

    private void y() {
        if (z()) {
            s();
            return;
        }
        FontRes.getMax(this, "android.permission.CAMERA");
        A();
    }

    private boolean z() {
        boolean z2 = true;
        boolean z3 = Build.VERSION.SDK_INT < 23;
        try {
            if (PermissionChecker.setMin(this, "android.permission.CAMERA") != 0) {
                z2 = false;
            }
            return z2;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("checkSelfPermission exception:");
            sb.append(e2.getMessage());
            RVLogger.d(TAG, sb.toString());
            return z3;
        }
    }

    private void A() {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-371265978, oncanceled);
            onCancelLoad.getMin(-371265978, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-371265978, oncanceled2);
            onCancelLoad.getMin(-371265978, oncanceled2);
        }
        this.ai = FontRes.getMax(this, "android.permission.CAMERA");
        FontRes.getMin(this, new String[]{"android.permission.CAMERA"}, 1001);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (min = dispatchOnCancelled.setMin(applicationContext, i2)))) {
            onCanceled oncanceled = new onCanceled(i2, min, 8);
            onCancelLoad.setMax(715756506, oncanceled);
            onCancelLoad.getMin(715756506, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i2);
        if (i2 != max) {
            onCanceled oncanceled2 = new onCanceled(i2, max, 16);
            onCancelLoad.setMax(715756506, oncanceled2);
            onCancelLoad.getMin(715756506, oncanceled2);
        }
        if (i2 != 101) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            RVLogger.d(TAG, "user denie the PERMISSION_CAMERA");
            boolean max2 = FontRes.getMax(this, "android.permission.CAMERA");
            if (!this.ai && !max2) {
                ToastUtils.showToast(this, getString(R.string.griver_image_permisson_rationale), 1);
                return;
            }
            return;
        }
        e();
    }

    public void onGridChecked(PhotoGrid photoGrid, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (min = dispatchOnCancelled.setMin(applicationContext, i2)))) {
            onCanceled oncanceled = new onCanceled(i2, min, 8);
            onCancelLoad.setMax(1521825735, oncanceled);
            onCancelLoad.getMin(1521825735, oncanceled);
        }
        int i3 = 0;
        if (!CommonUtils.isIndexValidInList(this.m, i2)) {
            StringBuilder sb = new StringBuilder("onGridChecked:invalid index = ");
            sb.append(i2);
            sb.append(",list size = ");
            List<PhotoItem> list = this.m;
            if (list != null) {
                i3 = list.size();
            }
            sb.append(i3);
            RVLogger.w(TAG, sb.toString());
            return;
        }
        PhotoItem photoItem = this.m.get(i2);
        boolean selected = photoItem.getSelected();
        boolean isChecked = photoGrid.isChecked();
        if (isChecked && selected) {
            return;
        }
        if (selected || isChecked) {
            int size = this.h.selectedList.size();
            if (!isChecked || selected) {
                if (!isChecked && selected) {
                    photoItem.setSelected(false);
                    this.h.selectedList.remove(photoItem);
                }
            } else if (size >= this.s) {
                ToastUtils.showToast(this, this.u, 0);
                photoGrid.setChecked(false);
                return;
            } else {
                photoItem.setSelected(true);
                this.h.selectedList.add(photoItem);
            }
            q();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        PhotoResolver photoResolver = this.f;
        if (photoResolver != null) {
            photoResolver.setBucketListener((PhotoResolver.BucketUpdateListener) null);
        }
        this.f = null;
        this.aj = null;
        if (this.h != null && !this.Q) {
            PhotoContext.contextMap.clear();
        }
        this.h = null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-911443697, oncanceled);
            onCancelLoad.getMin(-911443697, oncanceled);
        }
        if (this.b.getVisibility() != 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.D.removeCallbacks(this.aj);
            } else if (action == 1) {
                this.D.postDelayed(this.aj, 1000);
            }
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private void B() {
        String str;
        if (this.h.photoList != null) {
            try {
                long modifiedTime = this.h.photoList.get(this.f10453a.getFirstVisiblePosition()).getModifiedTime();
                if (modifiedTime <= 0) {
                    RVLogger.d(TAG, "photo modified time not set!");
                    return;
                }
                if (modifiedTime >= PhotoUtil.getThisMonth()) {
                    str = getString(R.string.griver_image_this_month);
                } else {
                    str = new SimpleDateFormat(getString(R.string.griver_image_time_pattern)).format(new Date(modifiedTime));
                }
                this.D.setVisibility(0);
                this.D.setText(str);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("updateTime called when gvPhoto`s Adapter`s related data is not same as photoContext.photoList. Exception :");
                sb.append(e2.getMessage());
                RVLogger.w(TAG, sb.toString());
            }
        }
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        int length;
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i2 == (min2 = dispatchOnCancelled.setMin(applicationContext, i2)))) {
            onCanceled oncanceled = new onCanceled(i2, min2, 8);
            onCancelLoad.setMax(1731558247, oncanceled);
            onCancelLoad.getMin(1731558247, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i2);
        if (i2 != max) {
            onCanceled oncanceled2 = new onCanceled(i2, max, 16);
            onCancelLoad.setMax(1731558247, oncanceled2);
            onCancelLoad.getMin(1731558247, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1731558247, oncanceled3);
            onCancelLoad.getMin(1731558247, oncanceled3);
        }
        if (this.I != i2) {
            this.I = i2;
            B();
        }
    }

    public void onOverScrolled(int i2, int i3) {
        if (this.D.getVisibility() != 0) {
            B();
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.k != null) {
            RVLogger.d("PhotoDisplayLink", "Update bucket.");
            b("onScanFinish");
            Intent intent = new Intent();
            intent.setAction(ACTION_PHOTO_ADAPTER_CHANGE);
            restorePresenterStates.length(getApplicationContext()).setMin(intent);
        }
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        this.k.setData(this.f.getBucketList());
        this.k.notifyDataSetChanged();
        a(this.w, str);
        g();
    }
}
