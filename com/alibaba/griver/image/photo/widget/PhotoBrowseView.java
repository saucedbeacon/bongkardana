package com.alibaba.griver.image.photo.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.activity.GriverPhotoSelectActivity;
import com.alibaba.griver.image.framework.meta.APImageDownloadRsp;
import com.alibaba.griver.image.framework.meta.APImageRetMsg;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alibaba.griver.image.photo.listener.PhotoPagerListener;
import com.alibaba.griver.image.photo.meta.LoadInfo;
import com.alibaba.griver.image.photo.meta.PhotoGroup;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoItem;
import com.alibaba.griver.image.photo.meta.PhotoMenu;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.utils.AnimationUtil;
import com.alibaba.griver.image.photo.utils.CommonUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alibaba.griver.ui.ant.dialog.AUListDialog;
import com.alibaba.griver.ui.ant.model.PopMenuItem;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setExpandActivityOverflowButtonDrawable;

public class PhotoBrowseView extends FrameLayout implements ViewPager.setMax, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener, CompoundButton.OnCheckedChangeListener {
    public static final int NO_CUSTOM_FINISH_BTN_BG_COLOR = -1;
    public static final int PREFER_WIDTH_THUMB_DP = 125;
    public static int PREFER_WIDTH_THUMB_PX = 0;
    public static boolean gDisablePhotoViewHardwareAcc = false;
    public static boolean hasSameGifInContext = false;
    public static int maxGifPixelCanSend;
    public static int maxGifSizeCanSend;
    public static boolean sDisableVideoStreamPlay;
    public static boolean selectPhoto;
    private String A;
    private boolean B;
    private int C;
    private String D;
    private boolean E;
    private String F;
    private String G;
    private TextView H;
    /* access modifiers changed from: private */
    public View I;
    /* access modifiers changed from: private */
    public ArrayList<PhotoMenu> J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    /* access modifiers changed from: private */
    public IndicatorView O;
    private boolean P;
    private boolean Q;
    /* access modifiers changed from: private */
    public boolean R;
    private boolean S;
    private boolean T;
    /* access modifiers changed from: private */
    public RelativeLayout U;
    private NumberProgressBar V;
    private ImageButton W;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f10513a;
    private boolean aA;
    /* access modifiers changed from: private */
    public boolean aB;
    private Handler aC = new Handler(Looper.getMainLooper());
    private String aD;
    private boolean aE;
    private boolean aF;
    private boolean aG = true;
    private boolean aH;
    private int aI;
    private TextView aJ;
    private boolean aK;
    private boolean aL = false;
    private TextView aM;
    /* access modifiers changed from: private */
    public View aN;
    private View.OnLongClickListener aO = new View.OnLongClickListener() {
        public boolean onLongClick(View view) {
            if (PhotoBrowseView.this.aq != null) {
                PhotoItem photoItem = (PhotoItem) PhotoBrowseView.this.m.get(PhotoBrowseView.this.p);
                if (PhotoBrowseView.this.ar != null && photoItem.getPhotoGroupIndex() < PhotoBrowseView.this.ar.size()) {
                    PhotoGroup photoGroup = (PhotoGroup) PhotoBrowseView.this.ar.get(photoItem.getPhotoGroupIndex());
                    PhotoBrowseView.this.aq.onPageLongClicked(photoGroup.getId(), PhotoBrowseView.this.p - photoGroup.getOffset());
                }
            }
            if (PhotoBrowseView.this.J != null && !PhotoBrowseView.this.J.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                PhotoItem photoItem2 = (PhotoItem) PhotoBrowseView.this.m.get(PhotoBrowseView.this.p);
                String photoPath = photoItem2.getPhotoPath();
                for (int i = 0; i < PhotoBrowseView.this.J.size(); i++) {
                    PhotoMenu photoMenu = (PhotoMenu) PhotoBrowseView.this.J.get(i);
                    if (photoMenu.isPhotoSupport() && photoMenu.enabled) {
                        if (PhotoBrowseView.this.b(photoMenu)) {
                            RVLogger.debug("PhotoBrowseView", "Gif not ready, ignore save menu.");
                        } else if (!photoItem2.isGif() || !TextUtils.equals("collect", photoMenu.tag)) {
                            arrayList.add(photoMenu);
                        } else {
                            RVLogger.debug("PhotoBrowseView", "Giff not support collect,ignore it.");
                        }
                    }
                }
                if (!arrayList.isEmpty() && PhotoBrowseView.this.am != null && !PhotoBrowseView.this.am.isFinishing()) {
                    PhotoBrowseView.this.a(photoPath, (List<PhotoMenu>) arrayList, photoItem2.isGif());
                }
            }
            return true;
        }
    };
    /* access modifiers changed from: private */
    public PhotoPreview aP;
    /* access modifiers changed from: private */
    public Map<String, View> aQ = new HashMap();
    /* access modifiers changed from: private */
    public PhotoPagerAdapter aR = new PhotoPagerAdapter();
    private long aS = 0;
    private int aT = -1;
    private View.OnClickListener aU = new View.OnClickListener() {
        public void onClick(View view) {
            if (PhotoBrowseView.this.R) {
                PhotoBrowseView.this.toggleFinish();
                return;
            }
            if (PhotoBrowseView.this.aq != null) {
                PhotoBrowseView.this.aq.onPageClicked();
            }
            PhotoBrowseView.this.o();
        }
    };
    private boolean aV = false;
    private boolean aW = false;
    private Runnable aX = new Runnable() {
        public void run() {
            PhotoBrowseView.this.I.setVisibility(4);
            PhotoBrowseView.this.aN.setVisibility(4);
        }
    };
    private boolean aa;
    private boolean ab;
    private int ac;
    private int ad;
    private long ae;
    private long af;
    private boolean ag;
    private boolean ah = false;
    private int ai = 0;
    private Drawable aj;
    private CheckBox ak;
    private boolean al = false;
    /* access modifiers changed from: private */
    public Activity am;
    private BroadcastReceiver an;
    private boolean ao;
    private boolean ap;
    /* access modifiers changed from: private */
    public PhotoPagerListener aq;
    /* access modifiers changed from: private */
    public List<PhotoGroup> ar;
    private boolean as;

    /* renamed from: at  reason: collision with root package name */
    private int f10514at;
    private boolean au;
    private boolean av = false;
    private float aw;
    private int ax;
    private boolean ay = true;
    private TextView az;
    private RelativeLayout b;
    private RelativeLayout c;
    private RelativeLayout d;
    private View e;
    private View f;
    private ImageButton g;
    private ImageButton h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    ImageHelper.LoadListener loadListener = new ImageHelper.LoadListener() {
        public void onLoadProgress(LoadInfo loadInfo, int i, int i2) {
            PhotoBrowseView.this.a(loadInfo, i, i2);
        }

        public void onLoadComplete(LoadInfo loadInfo) {
            PhotoBrowseView.this.c(loadInfo);
        }

        public void onLoadCanceled(LoadInfo loadInfo) {
            PhotoBrowseView.this.f(loadInfo);
        }

        public void onLoadFailed(LoadInfo loadInfo, APImageDownloadRsp aPImageDownloadRsp) {
            PhotoBrowseView.this.a(loadInfo, aPImageDownloadRsp);
        }
    };
    /* access modifiers changed from: private */
    public List<PhotoItem> m;
    private List<PhotoItem> n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Map<PhotoItem, LoadInfo> f10515o;
    /* access modifiers changed from: private */
    public int p;
    private Button q;
    private CheckBox r;
    private CheckBox s;
    private TextView t;
    private View u;
    private boolean v;
    private String w;
    /* access modifiers changed from: private */
    public PhotoContext x;
    private String y;
    private int z;

    /* access modifiers changed from: private */
    public boolean b(PhotoMenu photoMenu) {
        return true;
    }

    private void getSpecialConfig() {
        try {
            RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
            if (rVConfigService != null) {
                if (TextUtils.equals(rVConfigService.getConfig("photoview_disable_hardware_acc", ""), SummaryActivity.CHECKED)) {
                    RVLogger.d("PhotoBrowseView", "DISABLE hardware acc");
                    gDisablePhotoViewHardwareAcc = true;
                } else {
                    RVLogger.d("PhotoBrowseView", "ENABLE hardware acc");
                    gDisablePhotoViewHardwareAcc = false;
                }
                if (TextUtils.equals(rVConfigService.getConfig("photo_browse_view_disable_landscape_support", ""), SummaryActivity.CHECKED)) {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Disable landscape browse");
                    this.aF = true;
                } else {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Enable landscape browse");
                    this.aF = false;
                }
                if (TextUtils.equals(rVConfigService.getConfig("disable_gif_dynamic_browse", ""), SummaryActivity.CHECKED)) {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Disable gif dynamic browse");
                    this.aH = true;
                } else {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Enable gif dynamic browse");
                    this.aH = false;
                }
                if (TextUtils.equals(rVConfigService.getConfig("disable_video_stream_play", ""), SummaryActivity.CHECKED)) {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Disable video stream play");
                    sDisableVideoStreamPlay = true;
                } else {
                    RVLogger.d("PhotoBrowseView", "CloudConfig:Enable video stream play");
                    sDisableVideoStreamPlay = false;
                }
                if (TextUtils.equals(rVConfigService.getConfig("disable_photo_preview_pull_down_finish", ""), SummaryActivity.CHECKED)) {
                    RVLogger.d("PhotoBrowseView", "DISABLE pull down finish");
                    this.aL = true;
                    return;
                }
                RVLogger.d("PhotoBrowseView", "ENABLE pull down finish");
                this.aL = false;
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("readSpecialConfig exception,");
            sb.append(e2.getMessage());
            RVLogger.w("PhotoBrowseView", sb.toString());
        }
    }

    public PhotoBrowseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    public PhotoBrowseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PhotoBrowseView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(697702117, oncanceled);
            onCancelLoad.getMin(697702117, oncanceled);
        }
        hasSameGifInContext = false;
        getSpecialConfig();
        LayoutInflater.from(context).inflate(R.layout.griver_image_photo_browse, this, true);
        this.p = 0;
        this.aj = getResources().getDrawable(R.drawable.griver_image_default_photo);
        this.f10515o = Collections.synchronizedMap(new HashMap());
        View findViewById = findViewById(R.id.iv_download_entry);
        this.aN = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = findViewById(R.id.iv_grid);
        this.I = findViewById2;
        findViewById2.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tv_left);
        this.j = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.f = findViewById(R.id.ll_select);
        TextView textView2 = (TextView) findViewById(R.id.tv_right);
        this.k = textView2;
        textView2.setMovementMethod(new ScrollingMovementMethod());
        this.l = (TextView) findViewById(R.id.tv_text_divider);
        this.e = (LinearLayout) findViewById(R.id.ll_bottom_text);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_option_bar);
        this.d = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.H = (TextView) findViewById(R.id.tv_text_indicator);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.rl_top_bar);
        this.b = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_bottom_bar);
        this.c = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        this.O = (IndicatorView) findViewById(R.id.iv_indicator);
        RelativeLayout relativeLayout4 = (RelativeLayout) findViewById(R.id.rl_show_origin);
        this.U = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        NumberProgressBar numberProgressBar = (NumberProgressBar) findViewById(R.id.pb_show_origin);
        this.V = numberProgressBar;
        numberProgressBar.setText(getContext().getString(R.string.griver_image_show_origin)).setProgress(0);
        ImageButton imageButton = (ImageButton) findViewById(R.id.ib_cancel_show);
        this.W = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.bt_back);
        this.g = imageButton2;
        CommonUtils.setTitleBarBackDrawable(imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.option_bt_back);
        this.h = imageButton3;
        CommonUtils.setTitleBarBackDrawable(imageButton3);
        this.i = (TextView) findViewById(R.id.tv_index);
        this.f10513a = (ViewPager) findViewById(R.id.vp_base_app);
        this.r = (CheckBox) findViewById(R.id.cb_select);
        TextView textView3 = (TextView) findViewById(R.id.tv_select);
        this.aM = textView3;
        ViewCompat.setMin((View) textView3, 2);
        this.r.setOnCheckedChangeListener(this);
        TextView textView4 = (TextView) findViewById(R.id.tv_edit);
        this.az = textView4;
        textView4.setOnClickListener(this);
        CheckBox checkBox = (CheckBox) findViewById(R.id.cb_select_top);
        this.ak = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        Button button = (Button) findViewById(R.id.bt_finish);
        this.q = button;
        button.setOnClickListener(this);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.cb_origin);
        this.s = checkBox2;
        checkBox2.setOnCheckedChangeListener(this);
        TextView textView5 = (TextView) findViewById(R.id.tv_origin);
        this.t = textView5;
        ViewCompat.setMin((View) textView5, 2);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.f10513a.setOnPageChangeListener(this);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        TextView textView6 = (TextView) findViewById(R.id.tv_edit_photo);
        this.aJ = textView6;
        textView6.setOnClickListener(this);
    }

    public void setActivity(Activity activity) {
        if (activity != null) {
            if (PREFER_WIDTH_THUMB_PX <= 0) {
                PREFER_WIDTH_THUMB_PX = PhotoUtil.reorderSize(PhotoUtil.dp2px(activity, 125)).getWidth();
            }
            a(activity);
            this.ap = false;
        } else {
            if (this.ay) {
                RVLogger.debug("PhotoBrowseView", "Cancel all downloading task.");
                for (LoadInfo loadInfo : this.f10515o.values()) {
                    ImageHelper.cancel(loadInfo.taskId);
                }
            } else {
                RVLogger.debug("PhotoBrowseView", "Keep download task in background!");
            }
            this.f10515o.clear();
            if (this.x != null && !this.ap) {
                PhotoContext.contextMap.clear();
            }
            this.x = null;
            b(this.am);
            l();
        }
        this.am = activity;
    }

    private void a() {
        LinkedList linkedList = new LinkedList();
        boolean z2 = false;
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            PhotoInfo photoInfo = this.m.get(i2);
            if (photoInfo.isGif()) {
                linkedList.add(photoInfo);
            }
        }
        if (linkedList.size() > 1) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < linkedList.size(); i3++) {
                hashSet.add(((PhotoInfo) linkedList.get(i3)).getPhotoPath());
            }
            if (hashSet.size() != linkedList.size()) {
                z2 = true;
            }
            hasSameGifInContext = z2;
        }
        StringBuilder sb = new StringBuilder("Has same gif file = ");
        sb.append(hasSameGifInContext);
        RVLogger.debug("PhotoBrowseView", sb.toString());
    }

    private void b() {
        if (!this.aE || this.aF) {
            RVLogger.w("PhotoBrowseView", "adaptLandscapeConfig: Disable landscape browse!");
        } else if (this.am != null) {
            RVLogger.w("PhotoBrowseView", "adaptLandscapeConfig: Enable landscape browse!");
            this.am.setRequestedOrientation(2);
        } else {
            RVLogger.w("PhotoBrowseView", "adaptLandscapeConfig:Activity is null.");
        }
    }

    private void c() {
        this.aN.setVisibility(this.au ? 0 : 8);
        this.I.setVisibility(this.L ? 0 : 4);
        this.d.setVisibility((this.K || this.Q) ? 0 : 8);
        this.e.setVisibility(this.E ? 8 : 0);
        if (this.E) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        }
        this.H.setVisibility((this.K || this.Q) ? 0 : 8);
        this.b.setVisibility(selectPhoto ? 0 : 8);
        this.c.setVisibility(selectPhoto ? 0 : 8);
        this.O.setVisibility(this.P ? 0 : 8);
        boolean z2 = this.al && (this.E || (!this.P && !this.Q));
        this.ak.setVisibility(z2 ? 0 : 8);
        if (z2) {
            this.L = false;
            this.I.setVisibility(4);
        }
        View findViewById = findViewById(R.id.ll_origin);
        this.u = findViewById;
        findViewById.setOnClickListener(this);
        int i2 = this.C;
        if (i2 < 0 || i2 >= this.x.photoList.size()) {
            this.C = 0;
        }
        if (this.ag && this.z == 1) {
            if (this.x.photoList != null && this.x.photoList.size() > 0) {
                this.m.clear();
                this.m.add(this.x.photoList.get(this.C));
                this.C = 0;
            }
            this.i.setVisibility(4);
        }
        updateContent();
        this.f10513a.setAdapter(this.aR);
        this.f10513a.setCurrentItem(this.C);
        this.O.setCount(this.m.size());
        this.O.setSelection(this.C);
        onPageScrollStateChanged(0);
        if (this.z == 1) {
            this.f.setVisibility(8);
            this.c.setVisibility(0);
            this.b.setVisibility(0);
        }
        int i3 = this.aI;
        if (i3 != -1) {
            this.q.setBackgroundColor(i3);
        }
        j();
    }

    private void a(Activity activity) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GriverPhotoSelectActivity.ACTION_PHOTO_ADAPTER_CHANGE);
        AnonymousClass2 r1 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (PhotoBrowseView.this.aR != null) {
                    PhotoBrowseView.this.aR.clear();
                    PhotoBrowseView.this.aR.addPhotos(PhotoBrowseView.this.x.photoList);
                    PhotoBrowseView.this.aR.notifyDataSetChanged();
                    PhotoBrowseView.this.f10513a.setAdapter(PhotoBrowseView.this.aR);
                    int size = PhotoBrowseView.this.x.photoList.size();
                    PhotoBrowseView.this.O.setCount(size);
                    if (size == 0) {
                        PhotoBrowseView.this.toggleFinish();
                        return;
                    }
                    if (PhotoBrowseView.this.p >= size) {
                        int unused = PhotoBrowseView.this.p = size - 1;
                    }
                    PhotoBrowseView.this.f10513a.setCurrentItem(PhotoBrowseView.this.p);
                    if (PhotoBrowseView.this.p == 0) {
                        PhotoBrowseView.this.onPageSelected(0);
                    }
                }
            }
        };
        this.an = r1;
        try {
            activity.registerReceiver(r1, intentFilter);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("registerReceiver exception,");
            sb.append(th.getMessage());
            RVLogger.debug("PhotoBrowseView", sb.toString());
        }
    }

    private void b(Activity activity) {
        if (activity != null) {
            RVLogger.debug("PhotoBrowseView", "unregisterReceiver called");
            activity.unregisterReceiver(this.an);
        }
    }

    public void setBundle(Bundle bundle) {
        if (bundle != null) {
            this.au = bundle.getBoolean(PhotoParam.KEY_ENABLE_SHOW_PHOTO_DOWNLOAD, false);
            maxGifPixelCanSend = PhotoParam.DEFAULT_MAX_GIF_PIXEL_CAN_SEND;
            maxGifSizeCanSend = 5242880;
            boolean z2 = bundle.getBoolean(PhotoParam.ENABLE_EDIT_WHEN_PREVIEW_IMAGE, false);
            this.aK = z2;
            int i2 = 8;
            this.aJ.setVisibility(z2 ? 0 : 8);
            this.aB = bundle.getBoolean(PhotoParam.ENABLE_VIDEO_CUT, false);
            this.aE = bundle.getBoolean(PhotoParam.ENABLE_PHOTO_LANDSCAPE_BROWSE, false);
            this.aG = bundle.getBoolean(PhotoParam.ENABLE_GIF_DYNAMIC_PREVIEW, true);
            maxGifSizeCanSend = bundle.getInt(PhotoParam.MAX_SIZE_GIF_SEND, 5242880);
            maxGifPixelCanSend = bundle.getInt(PhotoParam.MAX_GIF_PIXEL_CAN_SEND, PhotoParam.DEFAULT_MAX_GIF_PIXEL_CAN_SEND);
            b();
            String string = bundle.getString("businessId");
            this.aD = string;
            ImageHelper.updateBusinessId(string, "PhotoBrowseView");
            boolean z3 = bundle.getBoolean(PhotoParam.ENABLE_EDIT_PHOTO, false);
            this.aA = z3;
            TextView textView = this.az;
            if (z3) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            this.ay = bundle.getBoolean(PhotoParam.CANCEL_DOWNLOAD_WHEN_QUIT_PREVIEW, true);
            this.aw = bundle.getFloat(PhotoParam.BEAUTY_IMAGE_LEVEL, -1.0f);
            this.ax = bundle.getInt(PhotoParam.COMPRESS_IMAGE_QUALITY, -1);
            this.av = bundle.getBoolean(PhotoParam.SHOW_PHOTO_LOAD_PROGRESS, true);
            this.f10514at = bundle.getInt(PhotoParam.PHOTOVIEW_DISPLAY_TYPE, 2);
            this.J = bundle.getParcelableArrayList(PhotoParam.LONG_CLICK_MENU);
            selectPhoto = bundle.getBoolean(PhotoParam.PHOTO_SELECT, false);
            this.K = bundle.getBoolean(PhotoParam.ENABLE_DELETE, false);
            this.y = getResources().getString(R.string.griver_image_origin_photo);
            this.z = bundle.getInt(PhotoParam.MAX_SELECT, 9);
            String string2 = bundle.getString(PhotoParam.MAX_SELECT_MSG);
            this.A = string2;
            if (TextUtils.isEmpty(string2)) {
                this.A = getResources().getString(R.string.griver_image_max_message, new Object[]{Integer.valueOf(this.z)});
            }
            this.M = bundle.getInt(PhotoParam.PREVIEW_IMG_WIDTH);
            this.N = bundle.getInt(PhotoParam.PREVIEW_IMG_HEIGHT);
            this.ab = bundle.getBoolean(PhotoParam.ENABLE_SHOW_ORIGIN, false);
            this.aa = bundle.getBoolean(PhotoParam.AUTO_HIDE_GRID_GROUP, true);
            this.T = bundle.getBoolean(PhotoParam.FIT_SPACE, true);
            this.S = bundle.getBoolean(PhotoParam.ENABLE_PINCH, true);
            this.R = bundle.getBoolean(PhotoParam.PREVIEW_CLICK_EXIT, false);
            this.L = bundle.getBoolean(PhotoParam.ENABLE_GRID_GROUP, false);
            this.B = bundle.getBoolean(PhotoParam.ENABLE_SELECT_ORIGIN, true);
            this.C = bundle.getInt(PhotoParam.PREVIEW_POSITION, 0);
            String string3 = bundle.getString(PhotoParam.FINISH_TEXT);
            this.D = string3;
            if (TextUtils.isEmpty(string3)) {
                this.D = getResources().getString(R.string.griver_image_send);
            }
            this.aI = bundle.getInt(PhotoParam.FINISH_BTN_BG_COLOR, -1);
            this.E = bundle.getBoolean(PhotoParam.FULLSCREEN_PREVIEW, false);
            this.P = bundle.getBoolean(PhotoParam.SHOW_DOT_INDICATOR, false);
            this.Q = bundle.getBoolean(PhotoParam.SHOW_TEXT_INDICATOR, false);
            this.ag = bundle.getBoolean(PhotoParam.ONLY_PREVIEW_SELECT, false);
            this.ao = bundle.getBoolean(PhotoParam.FORCE_FULLSCREEN_PREVIEW, false);
            this.al = bundle.getBoolean(PhotoParam.SELECT_GRID, false);
            this.as = bundle.getBoolean(PhotoParam.FORCE_FETCCH_ORIGINAL_PHOTO, false);
            String string4 = bundle.getString(PhotoParam.CONTEXT_INDEX);
            this.w = string4;
            this.x = PhotoContext.get(string4);
            PhotoContext.remove(this.w);
            if (this.x.photoList == null || this.x.photoList.isEmpty()) {
                this.am.finish();
                AnimationUtil.fadeInFadeOut(this.am);
                return;
            }
            this.aR.addPhotos(this.x.photoList);
            this.m = this.aR.getPhotoList();
            try {
                a();
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("updateHasSameGifInContextFlag Exception :");
                sb.append(e2.getMessage());
                RVLogger.e("PhotoBrowseView", sb.toString());
            }
            this.n = this.x.selectedList;
            this.x.userOriginPhoto = bundle.getBoolean(PhotoParam.USE_ORIGIN_PHOTO, false);
            this.s.setChecked(this.x.userOriginPhoto);
        }
        c();
    }

    public void resume() {
        RVLogger.debug("PhotoBrowseView", RVEvents.RESUME);
        if (this.ah) {
            if (this.aV) {
                RVLogger.debug("PhotoBrowseView", "deleteGroup called before resume ,do nothing onResume!");
                this.aV = false;
            } else if (this.ai != this.aR.getCount()) {
                this.aR.clear();
                this.aR.addPhotos(this.x.photoList);
                this.aR.notifyDataSetChanged();
                this.f10513a.setAdapter(this.aR);
                int size = this.m.size();
                this.O.setCount(size);
                if (size == 0) {
                    toggleFinish();
                    return;
                }
                int i2 = this.p;
                if (i2 >= size) {
                    int i3 = size - 1;
                    this.p = i3;
                    this.f10513a.setCurrentItem(i3);
                } else {
                    this.f10513a.setCurrentItem(i2);
                    onPageSelected(this.p);
                }
            } else {
                this.f10513a.setCurrentItem(this.p);
                onPageSelected(this.p);
            }
        }
        this.ah = false;
        this.aW = true;
    }

    public void newIntent(Intent intent) {
        PhotoContext.remove(this.w);
        boolean booleanExtra = intent.getBooleanExtra(PhotoParam.SELECT_GRID, false);
        this.al = booleanExtra;
        boolean z2 = booleanExtra && (this.E || (!this.P && !this.Q));
        this.ak.setVisibility(z2 ? 0 : 8);
        if (z2) {
            this.L = false;
            this.I.setVisibility(4);
        }
        if (this.aa) {
            this.I.removeCallbacks(this.aX);
        }
        int intExtra = intent.getIntExtra(PhotoParam.PREVIEW_POSITION, -1);
        if (intExtra != -1 && intExtra != this.p && intExtra >= 0 && intExtra < this.m.size()) {
            this.f10513a.setCurrentItem(intExtra, false);
        }
    }

    public void saveInstanceState(Intent intent, Bundle bundle) {
        StringBuilder sb = new StringBuilder("onSaveInstanceState ");
        sb.append(this.w);
        RVLogger.debug("PhotoBrowseView", sb.toString());
        this.ap = true;
        bundle.putAll(intent.getExtras());
        bundle.putInt(PhotoParam.PREVIEW_POSITION, this.p);
        bundle.putString(PhotoParam.CONTEXT_INDEX, this.w);
        PhotoContext.contextMap.put(this.w, this.x);
    }

    public void pause() {
        RVLogger.debug("PhotoBrowseView", RVEvents.PAUSE);
        this.ah = true;
        this.ai = this.aR.getCount();
        Map<String, View> map = this.aQ;
        StringBuilder sb = new StringBuilder("");
        sb.append(this.aT);
        if (((PhotoPreview) map.get(sb.toString())) != null) {
            this.aT = -1;
        }
        this.aW = false;
    }

    /* access modifiers changed from: private */
    public View a(int i2) {
        ViewPager viewPager = this.f10513a;
        PhotoPreview photoPreview = this.aP;
        LayoutInflater from = LayoutInflater.from(viewPager.getContext());
        if (photoPreview == null) {
            RVLogger.debug("videoCompact", "viewPager  no cached View,create it!");
            photoPreview = (PhotoPreview) from.inflate(R.layout.griver_image_photo_preview, viewPager, false);
        } else {
            this.aP = null;
        }
        viewPager.addView(photoPreview);
        a(a(i2, photoPreview), photoPreview);
        return photoPreview;
    }

    private void a(PhotoPreview photoPreview, PhotoItem photoItem) {
        if (photoItem.getMediaType() == 0) {
            photoPreview.getPhotoView().setOnLongClickListener(this.aO);
        }
    }

    private PhotoItem a(int i2, PhotoPreview photoPreview) {
        PhotoView photoView = photoPreview.getPhotoView();
        photoView.setDisplayType(this.f10514at);
        if (!(this.N == 0 || this.M == 0)) {
            ViewGroup.LayoutParams layoutParams = photoView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.height = dip2px(getContext(), (float) this.N);
            layoutParams.width = dip2px(getContext(), (float) this.M);
            photoView.setLayoutParams(layoutParams);
        }
        photoView.setOnClickListener(this.aU);
        photoView.setEnableScale(this.S);
        photoView.setFitSpace(this.T);
        if (this.ao) {
            photoView.setDisplayType(4);
        }
        photoPreview.setTag(Integer.valueOf(i2));
        PhotoItem photoItem = this.m.get(i2);
        a(photoPreview, photoItem);
        return photoItem;
    }

    public int dip2px(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(PhotoItem photoItem, PhotoPreview photoPreview) {
        RVLogger.debug("PhotoBrowseView", "dispatchLoadAction");
        photoPreview.dismissProgress();
        if (!photoItem.isVideo()) {
            b(photoItem, photoPreview);
        }
    }

    private void b(PhotoItem photoItem, PhotoPreview photoPreview) {
        Drawable drawable;
        photoPreview.changeViewType(0);
        String photoPath = photoItem.getPhotoPath();
        PhotoView photoView = photoPreview.getPhotoView();
        photoView.setTag(R.id.griver_image_id_photo_info_tag, photoItem);
        if (TextUtils.isEmpty(photoPath)) {
            RVLogger.debug("PhotoBrowseView", "invalid photo path.");
            if (photoItem.getFail() == null) {
                drawable = getResources().getDrawable(R.drawable.griver_image_load_fail);
            } else {
                drawable = photoItem.getFail();
            }
            photoPreview.getPhotoView().failDrawableHashCode = drawable.hashCode();
            photoPreview.getPhotoView().setImageDrawable(drawable);
        } else if (photoItem.getPhoto() != null) {
            RVLogger.debug("PhotoBrowseView", "set photo view from photo info");
            photoView.setImageDrawable(photoItem.getPhoto());
        } else {
            boolean hasOriginPhoto = ImageHelper.hasOriginPhoto(photoPath);
            Drawable a2 = a(photoItem, photoView);
            LoadInfo c2 = c(photoItem, photoPreview);
            if (hasOriginPhoto) {
                a(c2, -1, -1, false);
                a(photoPreview, c2);
                ImageHelper.load(photoView, photoPath, a2, -1, -1, c2);
            } else if (this.as) {
                if (c2 != null) {
                    c2.loadingOrigin = true;
                    c2.thumbHeight = dip2px(getContext(), (float) a2.getIntrinsicHeight());
                    c2.thumbWidth = dip2px(getContext(), (float) a2.getIntrinsicWidth());
                    a(c2, -1, -1, !hasOriginPhoto);
                }
                a(photoPreview, c2);
                ImageHelper.load(photoView, photoPath, a2, -1, -1, c2);
            } else {
                int largePhotoWidth = photoItem.getLargePhotoWidth();
                int largePhotoHeight = photoItem.getLargePhotoHeight();
                a(c2, largePhotoWidth, largePhotoHeight, !hasOriginPhoto);
                a(photoPreview, c2);
                ImageHelper.load(photoView, photoPath, a2, largePhotoWidth, largePhotoHeight, c2);
            }
        }
    }

    private void a(PhotoPreview photoPreview, LoadInfo loadInfo) {
        if (loadInfo.isShowingPie) {
            photoPreview.showProgress(true);
            photoPreview.setProgress(loadInfo.progress);
            return;
        }
        photoPreview.showProgress(false);
    }

    private void a(LoadInfo loadInfo, int i2, int i3, boolean z2) {
        loadInfo.loadingWidth = i2;
        loadInfo.loadingHeight = i3;
        loadInfo.isShowingPie = this.av && z2;
    }

    private Drawable a(PhotoItem photoItem, PhotoView photoView) {
        RVLogger.debug("PhotoBrowseView", "getAndSetThumbDrawable()");
        String thumbPath = photoItem.getThumbPath();
        boolean z2 = true;
        if (photoItem.getThumb() != null) {
            RVLogger.debug("PhotoBrowseView", "set photo view from thumb drawable");
            photoView.thumbDrawableHashCode = photoItem.getThumb().hashCode();
            photoView.setImageDrawable(photoItem.getThumb());
        } else {
            Bitmap loadThumbPhoto = ImageHelper.loadThumbPhoto(photoItem, PREFER_WIDTH_THUMB_PX);
            if (loadThumbPhoto != null) {
                RVLogger.debug("PhotoBrowseView", "set photo view from cache image");
                a(photoView, loadThumbPhoto);
            } else {
                if (!TextUtils.isEmpty(thumbPath)) {
                    RVLogger.debug("PhotoBrowseView", "photo thumb path ".concat(String.valueOf(thumbPath)));
                    Bitmap bitmap = null;
                    try {
                        bitmap = BitmapFactory.decodeFile(thumbPath);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("decode bitmap exception.");
                        sb.append(th.toString());
                        RVLogger.debug("PhotoBrowseView", sb.toString());
                    }
                    if (bitmap != null) {
                        RVLogger.debug("PhotoBrowseView", "set photo view from local thumb path");
                        a(photoView, bitmap);
                    }
                }
                z2 = false;
            }
        }
        Drawable drawable = z2 ? photoView.getDrawable() : this.aj;
        if (!z2) {
            photoView.defaultDrawableHashCode = drawable.hashCode();
            RVLogger.debug("PhotoBrowseView", "cann`t find thumbnail,show default drawable");
        }
        RVLogger.debug("PhotoBrowseView", "hasThumb:".concat(String.valueOf(z2)));
        return z2 ? photoView.getDrawable() : this.aj;
    }

    private void a(PhotoView photoView, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmap);
        photoView.thumbDrawableHashCode = bitmapDrawable.hashCode();
        photoView.setImageDrawable(bitmapDrawable);
    }

    public void onClick(View view) {
        Activity activity;
        if (System.currentTimeMillis() - this.aS >= 200) {
            this.aS = System.currentTimeMillis();
            if ((view.equals(this.g) || view.equals(this.h)) && (activity = this.am) != null) {
                activity.onBackPressed();
            } else if (view == this.u) {
                this.s.setChecked(!this.s.isChecked());
            } else if (view.equals(this.q)) {
                if (this.z == 1 && !this.n.isEmpty()) {
                    this.n.clear();
                }
                if (this.n.isEmpty()) {
                    PhotoItem photoItem = this.m.get(this.p);
                    photoItem.setSelected(true);
                    this.n.add(photoItem);
                }
                d();
            } else if (view.equals(this.I)) {
                i();
            } else if (view.equals(this.U)) {
                g();
            } else if (view.equals(this.W)) {
                h();
            }
        }
    }

    private void d() {
        this.x.sendSelectedPhoto(this.am, this.aw, this.ax, new Runnable() {
            public void run() {
                if (PhotoBrowseView.this.am != null) {
                    PhotoBrowseView.this.am.setResult(-1);
                } else {
                    RVLogger.w("PhotoBrowseView", "activity is Null.");
                }
                PhotoBrowseView.this.toggleFinish();
            }
        }, this.s.isChecked());
    }

    public void backPressed() {
        Activity activity = this.am;
        if (activity != null) {
            Intent intent = activity.getIntent();
            intent.putExtra(PhotoParam.USE_ORIGIN_PHOTO, this.s.isChecked());
            this.am.setResult(0, intent);
            toggleFinish();
        }
    }

    private boolean e() {
        if (SystemClock.elapsedRealtime() - this.af <= 200) {
            return false;
        }
        this.af = SystemClock.elapsedRealtime();
        return true;
    }

    private boolean f() {
        if (SystemClock.elapsedRealtime() - this.ae <= 200) {
            return false;
        }
        this.ae = SystemClock.elapsedRealtime();
        return true;
    }

    private void g() {
        if (!f()) {
            return;
        }
        if (this.W.getVisibility() != 0) {
            this.W.setVisibility(0);
            PhotoItem photoItem = this.m.get(this.p);
            PhotoPreview photoPreview = (PhotoPreview) this.f10513a.findViewWithTag(Integer.valueOf(this.p));
            PhotoView photoView = photoPreview.getPhotoView();
            String photoPath = photoItem.getPhotoPath();
            LoadInfo c2 = c(photoItem, photoPreview);
            c2.loadingOrigin = true;
            NumberProgressBar numberProgressBar = this.V;
            StringBuilder sb = new StringBuilder();
            sb.append(c2.progress);
            sb.append("%");
            numberProgressBar.setText(sb.toString()).setProgress(c2.progress);
            ImageHelper.load(photoView, photoPath, photoView.getDrawable(), -1, -1, c2);
            return;
        }
        h();
    }

    private LoadInfo c(PhotoItem photoItem, PhotoPreview photoPreview) {
        LoadInfo loadInfo = this.f10515o.get(photoItem);
        if (loadInfo == null) {
            loadInfo = new LoadInfo();
            loadInfo.setProxy(this.loadListener);
            loadInfo.loading = false;
            loadInfo.photoItem = photoItem;
            loadInfo.progress = 0;
        }
        loadInfo.setPhotoPreview(photoPreview);
        this.f10515o.put(photoItem, loadInfo);
        return loadInfo;
    }

    private void h() {
        if (e()) {
            RVLogger.debug("PhotoBrowseView", "cancelShowOrigin");
            PhotoItem photoItem = this.m.get(this.p);
            this.W.setVisibility(8);
            setOriginText(photoItem.getPhotoSize());
            LoadInfo remove = this.f10515o.remove(photoItem);
            if (remove == null) {
                RVLogger.debug("PhotoBrowseView", "failed to cancel load!");
                return;
            }
            remove.setProxy((ImageHelper.LoadListener) null);
            ImageHelper.cancel(remove.taskId);
        }
    }

    private void i() {
        if (this.am != null) {
            PhotoContext.contextMap.put(this.w, this.x);
            Intent intent = new Intent(this.am, GriverPhotoSelectActivity.class);
            intent.putExtras(this.am.getIntent().getExtras());
            intent.putExtra(PhotoParam.PREVIEW_POSITION, this.p);
            intent.putExtra(PhotoParam.AUTO_PLAY_PREVIEW_POSITION, false);
            intent.addFlags(131072);
            GriverEnv.getApplicationContext().startActivity(intent);
            AnimationUtil.fadeInFadeOut(this.am);
        }
    }

    public void onPageScrollStateChanged(int i2) {
        if (this.aa && i2 == 1) {
            l();
        }
        if (i2 == 0) {
            j();
        }
    }

    private void j() {
        n();
        if (this.aa) {
            k();
        }
    }

    private void k() {
        RVLogger.debug("PhotoBrowseView", "triggerAutoDismiss:###");
        this.aC.postDelayed(this.aX, 3000);
    }

    private void l() {
        RVLogger.debug("PhotoBrowseView", "clearAutoDismiss:###");
        this.aC.removeCallbacksAndMessages((Object) null);
    }

    private void m() {
        if (this.au) {
            PhotoItem photoItem = this.m.get(this.p);
            if (photoItem.getMediaType() != 0 || photoItem.isGif()) {
                this.aN.setVisibility(4);
            } else {
                this.aN.setVisibility(0);
            }
        } else {
            this.aN.setVisibility(8);
        }
    }

    public void onPageScrolled(int i2, float f2, int i3) {
        n();
    }

    private void n() {
        if (this.L) {
            this.I.setVisibility(0);
        }
        m();
    }

    public void onPageSelected(int i2) {
        String str;
        List<PhotoItem> list = this.m;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            RVLogger.debug("PhotoBrowseView", "onPageSelected index = ".concat(String.valueOf(i2)));
            this.p = i2;
            PhotoItem photoItem = this.m.get(i2);
            PhotoPreview photoPreview = (PhotoPreview) this.f10513a.findViewWithTag(Integer.valueOf(this.p));
            if (photoPreview != null) {
                photoPreview.getPhotoView().onShow();
            }
            this.u.setVisibility((photoItem.isVideo() || !this.B) ? 8 : 0);
            boolean selected = photoItem.getSelected();
            this.r.setChecked(selected);
            this.ak.setChecked(selected);
            c(photoItem);
            a(photoItem);
            updateContent();
            if (this.aq != null) {
                List<PhotoGroup> list2 = this.ar;
                if (list2 == null) {
                    str = "";
                } else {
                    str = list2.get(photoItem.getPhotoGroupIndex()).getId();
                }
                int offset = i2 - this.ar.get(photoItem.getPhotoGroupIndex()).getOffset();
                this.aq.onPageSelected(offset, photoItem.getPhotoGroupIndex(), str);
                PhotoPagerListener photoPagerListener = this.aq;
                if (photoPagerListener instanceof PhotoPagerListener.V3) {
                    ((PhotoPagerListener.V3) photoPagerListener).onPageSelected(offset, photoItem);
                }
            }
        }
    }

    private void a(PhotoItem photoItem) {
        boolean loadOrigin = photoItem.getLoadOrigin();
        boolean hasOriginPhoto = ImageHelper.hasOriginPhoto(photoItem.getPhotoPath());
        StringBuilder sb = new StringBuilder("updateShowOrigin enableOrigin ");
        sb.append(loadOrigin);
        sb.append(" showOrigin ");
        sb.append(this.ab);
        sb.append(" hasOrigin ");
        sb.append(hasOriginPhoto);
        RVLogger.debug("PhotoBrowseView", sb.toString());
        boolean z2 = true;
        boolean z3 = !loadOrigin || !this.ab || hasOriginPhoto;
        if (z3 || !b(photoItem)) {
            z2 = false;
        }
        photoItem.isDisabledByIntercept = z2;
        if (z3 || z2) {
            StringBuilder sb2 = new StringBuilder("hide show origin area.");
            sb2.append(z2 ? "isDisabledByIntercept" : "isNaturallyDisabled");
            RVLogger.debug("PhotoBrowseView", sb2.toString());
            this.U.setVisibility(8);
            return;
        }
        this.U.setVisibility(0);
        LoadInfo loadInfo = this.f10515o.get(photoItem);
        if (loadInfo == null || !loadInfo.loadingOrigin) {
            setOriginText(photoItem.getPhotoSize());
            this.W.setVisibility(8);
            return;
        }
        NumberProgressBar numberProgressBar = this.V;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(loadInfo.progress);
        sb3.append("%");
        numberProgressBar.setText(sb3.toString()).setProgress(loadInfo.progress);
        this.W.setVisibility(0);
    }

    private boolean b(PhotoItem photoItem) {
        if (photoItem == null || !this.av || photoItem.isLoadedOnce) {
            return false;
        }
        RVLogger.debug("PhotoBrowseView", "Intercept show \"load origin image\"");
        return true;
    }

    private void setOriginText(long j2) {
        String string = getResources().getString(R.string.griver_image_show_origin);
        String format = new DiskFormatter().format((double) j2);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("(");
        sb.append(format);
        sb.append(")");
        this.V.setText(sb.toString()).setProgress(0);
    }

    /* access modifiers changed from: protected */
    public void updateContent() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p + 1);
        sb.append("/");
        sb.append(this.m.size());
        String obj = sb.toString();
        this.i.setText(obj);
        this.H.setText(obj);
        this.O.setSelection(this.p);
        int i2 = this.z;
        int i3 = 0;
        long j2 = 0;
        if (i2 > 1) {
            for (PhotoItem next : this.n) {
                if (next.getSelected()) {
                    i3++;
                    j2 += next.getPhotoSize();
                }
            }
        } else if (i2 == 1) {
            j2 = this.m.get(this.p).getPhotoSize();
        }
        if (i3 <= 0 || this.z == 1) {
            this.q.setText(this.D);
            a(this.y);
        } else {
            Button button = this.q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.D);
            sb2.append("(");
            sb2.append(i3);
            sb2.append("/");
            sb2.append(this.z);
            sb2.append(")");
            button.setText(sb2.toString());
        }
        this.az.setEnabled(b(i3));
        if (this.aJ.getVisibility() != 8) {
            this.aJ.setVisibility(4);
        }
        if (i3 > 0 || this.z == 1) {
            String format = new DiskFormatter().format((double) j2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.y);
            sb3.append("(");
            sb3.append(format);
            sb3.append(")");
            a(sb3.toString());
        }
    }

    private void a(String str) {
        this.t.setText(str);
        this.s.setContentDescription(str);
    }

    private boolean b(int i2) {
        PhotoContext photoContext;
        PhotoContext photoContext2;
        RVLogger.debug("PhotoBrowseView", "checkEditable:###");
        if (i2 == 1 && (photoContext2 = this.x) != null && photoContext2.selectedList != null && !this.x.selectedList.isEmpty() && this.x.selectedList.get(0).getMediaType() == 0) {
            RVLogger.debug("PhotoBrowseView", "Return True.");
            return true;
        } else if (i2 != 0 || (photoContext = this.x) == null || photoContext.photoList == null || this.x.photoList.size() <= this.p || this.x.photoList.get(this.p).getMediaType() != 0) {
            RVLogger.debug("PhotoBrowseView", "checkEditable return False.");
            return false;
        } else {
            RVLogger.debug("PhotoBrowseView", "Return True.");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void toggleFinish() {
        toggleFinish(true);
    }

    /* access modifiers changed from: protected */
    public void toggleFinish(boolean z2) {
        PhotoContext photoContext;
        if (this.K && (photoContext = this.x) != null) {
            photoContext.sendDeletedPhoto();
        }
        Activity activity = this.am;
        if (activity != null) {
            activity.finish();
            if (z2) {
                AnimationUtil.fadeInFadeOut(this.am);
            } else {
                this.am.overridePendingTransition(0, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void o() {
        Activity activity = this.am;
        if (!this.v) {
            this.v = true;
            if (activity != null) {
                if (this.b.getVisibility() != 8) {
                    new AnimationUtil(activity, R.anim.griver_image_slide_up).setFillAfter(true).startAnimation(this.b);
                }
                if (this.d.getVisibility() != 8) {
                    new AnimationUtil(activity, R.anim.griver_image_slide_up).setFillAfter(true).startAnimation(this.d);
                }
                if (this.c.getVisibility() != 8) {
                    new AnimationUtil(activity, R.anim.griver_image_effect_select_pop_down).setFillAfter(true).startAnimation(this.c);
                    return;
                }
                return;
            }
            return;
        }
        this.v = false;
        if (activity != null) {
            if (this.b.getVisibility() != 8) {
                new AnimationUtil(activity, R.anim.griver_image_slide_down).setFillAfter(true).startAnimation(this.b);
            }
            if (this.d.getVisibility() != 8) {
                new AnimationUtil(activity, R.anim.griver_image_slide_down).setFillAfter(true).startAnimation(this.d);
            }
            if (this.c.getVisibility() != 8) {
                new AnimationUtil(activity, R.anim.griver_image_select_pop_up).setFillAfter(true).startAnimation(this.c);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, List<PhotoMenu> list, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(new PopMenuItem(list.get(i2).title));
        }
        AUListDialog aUListDialog = new AUListDialog((ArrayList<PopMenuItem>) arrayList, (Context) this.am);
        aUListDialog.setOnItemClickListener((AUListDialog.OnItemClickListener) a((PhotoInfo) this.m.get(this.p), list));
        aUListDialog.setCanceledOnTouchOutside(true);
        aUListDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
            }
        });
        aUListDialog.show();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.alibaba.griver.image.photo.meta.PhotoMenu r7) {
        /*
            r6 = this;
            java.util.List<com.alibaba.griver.image.photo.meta.PhotoItem> r0 = r6.m
            java.lang.String r1 = "PhotoBrowseView"
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006a
            com.alibaba.griver.image.photo.PhotoContext r0 = r6.x
            if (r0 != 0) goto L_0x0011
            goto L_0x006a
        L_0x0011:
            java.util.List<com.alibaba.griver.image.photo.meta.PhotoItem> r0 = r6.m
            int r2 = r6.p
            java.lang.Object r0 = r0.get(r2)
            com.alibaba.griver.image.photo.meta.PhotoItem r0 = (com.alibaba.griver.image.photo.meta.PhotoItem) r0
            com.alibaba.griver.image.photo.PhotoContext r2 = r6.x
            android.app.Activity r3 = r6.am
            boolean r2 = r2.photoLongPressMenuClick(r3, r0, r7)
            com.alibaba.griver.image.photo.listener.PhotoPagerListener r3 = r6.aq
            boolean r4 = r3 instanceof com.alibaba.griver.image.photo.listener.PhotoPagerListener.V4
            if (r4 == 0) goto L_0x003f
            com.alibaba.griver.image.photo.listener.PhotoPagerListener$V4 r3 = (com.alibaba.griver.image.photo.listener.PhotoPagerListener.V4) r3
            androidx.viewpager.widget.ViewPager r4 = r6.f10513a
            int r5 = r6.p
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.view.View r4 = r4.findViewWithTag(r5)
            com.alibaba.griver.image.photo.widget.PhotoPreview r4 = (com.alibaba.griver.image.photo.widget.PhotoPreview) r4
            boolean r0 = r3.onMenuClicked(r7, r0, r4)
        L_0x003d:
            r2 = r2 | r0
            goto L_0x004a
        L_0x003f:
            boolean r0 = r3 instanceof com.alibaba.griver.image.photo.listener.PhotoPagerListener.V2
            if (r0 == 0) goto L_0x004a
            com.alibaba.griver.image.photo.listener.PhotoPagerListener$V2 r3 = (com.alibaba.griver.image.photo.listener.PhotoPagerListener.V2) r3
            boolean r0 = r3.onMenuClicked(r7)
            goto L_0x003d
        L_0x004a:
            if (r2 == 0) goto L_0x0052
            java.lang.String r7 = "press listener processed"
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r1, r7)
            return
        L_0x0052:
            boolean r0 = r7.enableImpl
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "default impl not enabled for "
            r0.<init>(r2)
            java.lang.String r7 = r7.tag
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r1, r7)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r7 = "processMenu called when photoList is Empty!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.photo.widget.PhotoBrowseView.a(com.alibaba.griver.image.photo.meta.PhotoMenu):void");
    }

    private MenuItemOnClickListener a(PhotoInfo photoInfo, List<PhotoMenu> list) {
        int mediaType = photoInfo.getMediaType();
        if (mediaType == 0 || mediaType == 1 || mediaType == 2) {
            return new MenuItemOnClickListener(list);
        }
        RVLogger.w("PhotoBrowseView", "buildListener():mediaType exception!");
        return null;
    }

    class MenuItemOnClickListener implements AUListDialog.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private List<PhotoMenu> f10516a;

        public MenuItemOnClickListener(List<PhotoMenu> list) {
            this.f10516a = list;
        }

        public void resetData(List<PhotoMenu> list) {
            this.f10516a = list;
        }

        public void onItemClick(int i) {
            PhotoMenu photoMenu = this.f10516a.get(i);
            if (!photoMenu.enableImpl) {
                PhotoBrowseView.this.a(photoMenu);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        List<PhotoItem> list = this.m;
        if (list != null) {
            PhotoItem photoItem = list.get(this.p);
            int size = this.n.size();
            if (compoundButton.equals(this.s)) {
                this.x.userOriginPhoto = z2;
                if (size == 0) {
                    this.r.setChecked(true);
                } else {
                    updateContent();
                }
            } else if (compoundButton.equals(this.r) || compoundButton.equals(this.ak)) {
                boolean selected = photoItem.getSelected();
                if (z2 && selected) {
                    return;
                }
                if (z2 || selected) {
                    if (!z2 || selected) {
                        photoItem.setSelected(false);
                        this.n.remove(photoItem);
                    } else if (size >= this.z) {
                        this.r.setChecked(false);
                        ToastUtils.showToast(getContext(), this.A, 0);
                        return;
                    } else {
                        photoItem.setSelected(true);
                        this.n.add(photoItem);
                    }
                    photoItem.setSelected(z2);
                    updateContent();
                }
            }
        }
    }

    private boolean a(LoadInfo loadInfo) {
        int indexOf;
        if (!loadInfo.loadingOrigin || loadInfo.progress < 100) {
            return false;
        }
        PhotoPreview photoPreview = loadInfo.getPhotoPreview();
        if (photoPreview == null && (indexOf = this.m.indexOf(loadInfo.photoItem)) >= 0) {
            photoPreview = (PhotoPreview) this.aQ.get(String.valueOf(indexOf));
        }
        if (photoPreview == null) {
            return false;
        }
        loadInfo.setPhotoPreview(photoPreview);
        ImageHelper.load(photoPreview.getPhotoView(), loadInfo.photoItem.getPhotoPath(), photoPreview.getPhotoView().getDrawable(), -1, -1, loadInfo);
        return true;
    }

    private void c(PhotoItem photoItem) {
        this.F = photoItem.getLeftText();
        this.G = photoItem.getRightText();
        boolean z2 = true;
        int i2 = 0;
        this.e.setVisibility(TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.G) ? 8 : 0);
        if (TextUtils.isEmpty(this.F) || TextUtils.isEmpty(this.G)) {
            z2 = false;
        }
        this.l.setVisibility(z2 ? 0 : 8);
        this.j.setText(this.F);
        this.j.scrollTo(0, 0);
        this.j.setVisibility(TextUtils.isEmpty(this.F) ? 8 : 0);
        this.k.setText(this.G);
        this.k.scrollTo(0, 0);
        TextView textView = this.k;
        if (TextUtils.isEmpty(this.G)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void onGlobalLayout() {
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.ac = this.f10513a.getMeasuredWidth();
        this.ad = this.f10513a.getMeasuredHeight();
        StringBuilder sb = new StringBuilder("photoViewWidth ");
        sb.append(this.ac);
        sb.append(" photoViewHeight ");
        sb.append(this.ad);
        RVLogger.debug("PhotoBrowseView", sb.toString());
        onPageSelected(this.C);
    }

    private void b(LoadInfo loadInfo) {
        PhotoItem photoItem = this.m.get(this.p);
        if (photoItem != null && photoItem == loadInfo.photoItem) {
            this.V.setText(getResources().getString(R.string.griver_image_finished));
            this.U.postDelayed(new Runnable() {
                public void run() {
                    PhotoBrowseView.this.U.setVisibility(8);
                    PhotoUtil.startAnimation(PhotoBrowseView.this.U, R.anim.griver_image_fade_out);
                }
            }, 500);
        }
    }

    /* access modifiers changed from: private */
    public void a(LoadInfo loadInfo, APImageDownloadRsp aPImageDownloadRsp) {
        a(aPImageDownloadRsp);
        APImageRetMsg retmsg = aPImageDownloadRsp.getRetmsg();
        if (retmsg == null || retmsg.getCode() != APImageRetMsg.RETCODE.REUSE) {
            String str = null;
            if (retmsg != null && retmsg.getCode() == APImageRetMsg.RETCODE.CURRENT_LIMIT) {
                str = getContext().getString(R.string.griver_image_current_limit);
            }
            a(loadInfo, str);
            return;
        }
        RVLogger.debug("PhotoBrowseView", "Reuse fail ####");
        if (a(loadInfo)) {
            RVLogger.debug("PhotoBrowseView", "Reuse fail,but perform load original photo again.");
        } else if (loadInfo.getPhotoPreview() == null) {
            RVLogger.debug("PhotoBrowseView", "Remove loadInfo when no view is related.");
            this.f10515o.remove(loadInfo.photoItem);
        } else {
            RVLogger.debug("PhotoBrowseView", "Ignore Reuse fail ####");
        }
    }

    /* access modifiers changed from: private */
    public void a(LoadInfo loadInfo, int i2, int i3) {
        if (loadInfo != null) {
            loadInfo.loading = true;
            loadInfo.progress = i2;
            d(loadInfo);
            if (!loadInfo.loadingOrigin) {
                RVLogger.debug("PhotoBrowseView", "not loading origin image");
                return;
            }
            try {
                if (loadInfo.photoItem != this.m.get(this.p)) {
                    RVLogger.debug("PhotoBrowseView", "This loadInfo`s target view is not in Foreground.");
                    return;
                }
                NumberProgressBar numberProgressBar = this.V;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append("%");
                numberProgressBar.setText(sb.toString()).setProgress(i2);
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("onLoadProgress_ get photo at ");
                sb2.append(this.p);
                sb2.append(" exception!PhotoList may changed already.");
                RVLogger.debug("PhotoBrowseView", sb2.toString());
            }
        }
    }

    private void a(APImageDownloadRsp aPImageDownloadRsp) {
        String str;
        StringBuilder sb = new StringBuilder("file at :");
        sb.append(aPImageDownloadRsp.getSourcePath());
        sb.append("\n---> fail msg :");
        String obj = sb.toString();
        APImageRetMsg retmsg = aPImageDownloadRsp.getRetmsg();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        String str2 = "";
        if (retmsg != null) {
            StringBuilder sb3 = new StringBuilder("code = ");
            sb3.append(retmsg.getCode());
            sb3.append(",");
            sb3.append(retmsg.getMsg());
            str = sb3.toString();
        } else {
            str = str2;
        }
        sb2.append(str);
        String obj2 = sb2.toString();
        APImageRetMsg aPImageRetMsg = aPImageDownloadRsp.originalRetMsg;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj2);
        if (aPImageRetMsg != null) {
            StringBuilder sb5 = new StringBuilder("code = ");
            sb5.append(aPImageRetMsg.getCode());
            sb5.append(",");
            sb5.append(aPImageRetMsg.getMsg());
            str2 = sb5.toString();
        }
        sb4.append(str2);
        RVLogger.debug("PhotoBrowseView", sb4.toString());
    }

    /* access modifiers changed from: private */
    public void c(LoadInfo loadInfo) {
        float f2;
        float f3;
        StringBuilder sb = new StringBuilder("onLoadComplete_, path:");
        sb.append(loadInfo.toString());
        RVLogger.debug("PhotoBrowseView", sb.toString());
        LoadInfo remove = this.f10515o.remove(loadInfo.photoItem);
        e(remove);
        if (remove != null && remove.getPhotoPreview() != null) {
            remove.loading = false;
            PhotoPreview photoPreview = remove.getPhotoPreview();
            photoPreview.dismissProgress();
            if (remove.loadingOrigin) {
                StringBuilder sb2 = new StringBuilder("rect width:");
                sb2.append(photoPreview.getPhotoView().getPhotoRect().width());
                sb2.append(",rect height:");
                sb2.append(photoPreview.getPhotoView().getPhotoRect().height());
                RVLogger.debug("PhotoBrowseView", sb2.toString());
                if (photoPreview.getPhotoView().getPhotoRect().width() <= 0.0f || photoPreview.getPhotoView().getPhotoRect().height() <= 0.0f) {
                    f3 = (float) photoPreview.getPhotoView().getWidth();
                    f2 = (float) photoPreview.getPhotoView().getHeight();
                } else {
                    f3 = photoPreview.getPhotoView().getPhotoRect().width();
                    f2 = photoPreview.getPhotoView().getPhotoRect().height();
                }
                if (remove.thumbWidth > 0 && remove.thumbHeight > 0 && f2 > 0.0f && f3 > 0.0f) {
                    float max = Math.max(((float) remove.thumbWidth) / f3, ((float) remove.thumbHeight) / f2);
                    if (max < 1.0f) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(max, 1.0f, max, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(300);
                        photoPreview.getPhotoView().startAnimation(scaleAnimation);
                    }
                }
                b(loadInfo);
            }
        }
    }

    private void d(LoadInfo loadInfo) {
        if (this.av && loadInfo != null) {
            PhotoPreview photoPreview = loadInfo.getPhotoPreview();
            if (photoPreview != null) {
                photoPreview.setProgress(loadInfo.progress);
                return;
            }
            StringBuilder sb = new StringBuilder("ignore pie progress,");
            sb.append(loadInfo.progress);
            RVLogger.debug("PhotoBrowseView", sb.toString());
        }
    }

    private void e(LoadInfo loadInfo) {
        if (loadInfo != null) {
            PhotoItem photoItem = loadInfo.photoItem;
            if (photoItem != null) {
                StringBuilder sb = new StringBuilder("mark path:");
                sb.append(photoItem.getPhotoPath());
                sb.append(" has loaded");
                RVLogger.debug("PhotoBrowseView", sb.toString());
                photoItem.isLoadedOnce = true;
                if (photoItem.isDisabledByIntercept && this.m.get(this.p) == photoItem) {
                    RVLogger.debug("PhotoBrowseView", "When \"updateShowOrigin\" isDisabledByIntercept ,Call \"updateShowOrigin()\" again.");
                    a(loadInfo.photoItem);
                    return;
                }
                return;
            }
            RVLogger.debug("PhotoBrowseView", "Photoitem should not be null!");
        }
    }

    class PhotoPagerAdapter extends setExpandActivityOverflowButtonDrawable {

        /* renamed from: a  reason: collision with root package name */
        private List<PhotoItem> f10517a = new ArrayList();

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        PhotoPagerAdapter() {
        }

        public void addPhotos(List<PhotoItem> list) {
            if (list != null && !list.isEmpty()) {
                if (PhotoBrowseView.this.aB) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < list.size(); i++) {
                        PhotoItem photoItem = list.get(i);
                        if (!photoItem.isVideo()) {
                            arrayList.add(photoItem);
                        }
                    }
                    this.f10517a.addAll(arrayList);
                    return;
                }
                this.f10517a.addAll(list);
            }
        }

        public void clear() {
            this.f10517a.clear();
        }

        public PhotoItem getItemData(int i) {
            if (i < 0 || i >= this.f10517a.size()) {
                return null;
            }
            return this.f10517a.get(i);
        }

        public int getCount() {
            List<PhotoItem> list = this.f10517a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public View instantiateItem(ViewGroup viewGroup, int i) {
            View view = (View) PhotoBrowseView.this.aQ.get("".concat(String.valueOf(i)));
            if (view != null) {
                return view;
            }
            View access$2400 = PhotoBrowseView.this.a(i);
            PhotoBrowseView.this.aQ.put("".concat(String.valueOf(i)), access$2400);
            return access$2400;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof PhotoPreview) {
                PhotoPreview photoPreview = (PhotoPreview) obj;
                viewGroup.removeView(photoPreview);
                Iterator it = PhotoBrowseView.this.f10515o.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LoadInfo loadInfo = (LoadInfo) it.next();
                    if (loadInfo.getPhotoPreview() == photoPreview) {
                        loadInfo.setPhotoPreview((PhotoPreview) null);
                        break;
                    }
                }
                PhotoBrowseView.this.aQ.remove("".concat(String.valueOf(i)));
                PhotoPreview unused = PhotoBrowseView.this.aP = photoPreview;
            }
        }

        public List<PhotoItem> getPhotoList() {
            return this.f10517a;
        }
    }

    /* access modifiers changed from: private */
    public void f(LoadInfo loadInfo) {
        a(loadInfo, (String) null);
    }

    private void a(LoadInfo loadInfo, String str) {
        LoadInfo remove = this.f10515o.remove(loadInfo.photoItem);
        if (remove != null && remove.getPhotoPreview() != null) {
            PhotoItem photoItem = remove.photoItem;
            PhotoPreview photoPreview = remove.getPhotoPreview();
            photoPreview.dismissProgress();
            if (photoPreview.getPhotoView().isShowingThumbnail()) {
                RVLogger.debug("PhotoBrowseView", "Thumbnail is showing when load failed,do nothing but toast.");
            } else {
                Drawable fail = photoItem.getFail();
                if (fail != null) {
                    photoPreview.getPhotoView().failDrawableHashCode = fail.hashCode();
                    photoPreview.getPhotoView().setImageDrawable(fail);
                } else {
                    Drawable drawable = getResources().getDrawable(R.drawable.griver_image_load_fail);
                    photoPreview.getPhotoView().failDrawableHashCode = drawable.hashCode();
                    photoPreview.getPhotoView().setImageDrawable(drawable);
                }
            }
            if (this.m.get(this.p) == photoItem) {
                String string = getResources().getString(R.string.griver_image_download_fail);
                if (TextUtils.isEmpty(str)) {
                    str = string;
                }
                ToastUtils.showToast(getContext(), str, 0);
            }
        }
    }
}
