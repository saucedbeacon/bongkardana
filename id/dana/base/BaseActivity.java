package id.dana.base;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.RpcException;
import id.dana.di.modules.ActivityModule;
import id.dana.dialog.CommonDialog;
import id.dana.home.HomeTabActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.ForeignKey;
import o.Fts3;
import o.Fts4;
import o.GriverProgressBar;
import o.IRedDotManager;
import o.IntRange;
import o.MultiInstanceInvalidationService;
import o.PrepareException;
import o.RawQuery;
import o.RedDotDrawable;
import o.SecuritySignature;
import o.autoGenerate;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deferred;
import o.dismissBadgeView;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getContentInsetEnd;
import o.getDeviceName;
import o.getSecureSignatureComp;
import o.hasCornerMarking;
import o.hideProgress;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onInput;
import o.parentColumn;
import o.registerOnLoadCanceledListener;
import o.removeStateDidChangeHandler;
import o.setFavoriteBtnVisibility;
import o.setHeaderViewHeight;
import o.setRefreshAnimation;
import o.setRefreshOffset;
import o.tokenizer;
import o.tokenizerArgs;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

public abstract class BaseActivity extends AppCompatActivity implements parentColumn, MultiInstanceInvalidationService.AnonymousClass2, autoGenerate {
    public static final byte[] length = {SignedBytes.MAX_POWER_OF_TWO, 10, 92, -38, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 24;
    @Inject
    public AppLifeCycleObserver appLifeCycleObserver;
    private boolean canTapNfc;
    private boolean clickable;
    @Inject
    public ConnectionStatusReceiver connectionStatusReceiver;
    private IRedDotManager disposables;
    private String emoneyUrl;
    @Nullable
    @BindView(2131363152)
    ImageView icImageFg;
    protected boolean lazyInit = false;
    @Nullable
    @BindView(2131363774)
    TextView leftButton;
    private NfcAdapter nfcAdapter;
    private PendingIntent pendingIntent;
    private List<onDelete.getMin> presenterList;
    @Nullable
    @BindView(2131364386)
    TextView rightButton;
    @Nullable
    @BindView(2131363949)
    RelativeLayout rightProgressBar;
    @Nullable
    @BindView(2131364441)
    RelativeLayout rlToolbar;
    @Nullable
    @BindView(2131364862)
    Toolbar toolbar;
    @Nullable
    @BindView(2131363656)
    ImageView toolbarImage;
    @Nullable
    @BindView(2131364867)
    TextView toolbarTitle;
    private Unbinder unbinder;
    private boolean warmStart;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r5, int r6, int r7) {
        /*
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r5 = r5 * 175
            int r5 = r5 + 4
            byte[] r0 = length
            int r6 = r6 * 45
            int r6 = r6 + 56
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x001a
            r6 = r5
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            goto L_0x0032
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L_0x0028
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0028:
            byte r3 = r0[r5]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            r7 = r4
        L_0x0032:
            int r7 = r7 + r5
            int r5 = r7 + -2
            int r6 = r6 + 1
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.base.BaseActivity.getMin(short, int, int):java.lang.String");
    }

    @OnClick({2131364867})
    @Optional
    public void OnClickTitle(View view) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1797005944, oncanceled);
            onCancelLoad.getMin(1797005944, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length2 = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1797005944, oncanceled2);
            onCancelLoad.getMin(1797005944, oncanceled2);
        }
    }

    /* access modifiers changed from: protected */
    public void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-515245160, oncanceled);
            onCancelLoad.getMin(-515245160, oncanceled);
        }
    }

    public void doAction(String str, Object obj) {
    }

    public abstract int getLayout();

    public abstract void init();

    @OnClick({2131363774})
    @Optional
    public void onClickLeftMenuButton(View view) {
    }

    @OnClick({2131364386})
    @Optional
    public void onClickRightMenuButton(View view) {
    }

    static {
        AppCompatDelegate.getMin(true);
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        int length3;
        byte[] bArr = length;
        byte b = (byte) bArr[85];
        String min2 = getMin((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = length;
        byte b2 = (byte) bArr2[8];
        String min3 = getMin((byte) bArr2[85], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(-1312500478, oncanceled);
            onCancelLoad.getMin(-1312500478, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1312500478, oncanceled2);
            onCancelLoad.getMin(-1312500478, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || -1312500478 == (max = dispatchOnCancelled.getMax(applicationContext3, -1312500478)))) {
            onCanceled oncanceled3 = new onCanceled(-1312500478, max, 512);
            onCancelLoad.setMax(-1312500478, oncanceled3);
            onCancelLoad.getMin(-1312500478, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1312500478, oncanceled4);
            onCancelLoad.getMin(-1312500478, oncanceled4);
        }
        super.onCreate(bundle);
        if (this.lazyInit) {
            lazyInitComponents(bundle);
        } else {
            normalInitComponents(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.connectionStatusReceiver, intentFilter);
    }

    public void onStop() {
        getContentInsetEnd.getMax((Context) this, (BroadcastReceiver) this.connectionStatusReceiver);
        super.onStop();
    }

    public void onDestroy() {
        Unbinder unbinder2 = this.unbinder;
        if (unbinder2 != null) {
            RawQuery.getMax(unbinder2, RawQuery.length.getMin);
        }
        dispose();
        disposePresenter();
        onInput.getDefault().unregister(this);
        super.onDestroy();
    }

    private void normalInitComponents(@Nullable Bundle bundle) {
        getApplicationComponent().getMax(this);
        adjustFontScale(getResources().getConfiguration());
        onInput.getDefault().register(this);
        setContentView(getLayout());
        this.unbinder = ButterKnife.length(this);
        listenAppLifecycle();
        lambda$lazyInitComponents$1(bundle);
    }

    private void lazyInitComponents(@Nullable Bundle bundle) {
        adjustFontScale(getResources().getConfiguration());
        setContentView(getLayout());
        this.unbinder = ButterKnife.length(this);
        initAsync(new deferred(this), new Fts3(this, bundle));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$lazyInitComponents$0() throws Exception {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 727724268 == (max = dispatchOnCancelled.getMax(applicationContext, 727724268)))) {
            onCanceled oncanceled = new onCanceled(727724268, max, 512);
            onCancelLoad.setMax(727724268, oncanceled);
            onCancelLoad.getMin(727724268, oncanceled);
        }
        getApplicationComponent().getMax(this);
        onInput.getDefault().register(this);
        listenAppLifecycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: initComponents */
    public void lambda$lazyInitComponents$1(@Nullable Bundle bundle) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1204078997, oncanceled);
            onCancelLoad.getMin(1204078997, oncanceled);
        }
        initToolbar();
        init(bundle);
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        this.nfcAdapter = defaultAdapter;
        if (defaultAdapter != null) {
            this.pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(C.ENCODING_PCM_A_LAW), 0);
            if (this.disposables == null) {
                this.disposables = new IRedDotManager();
            }
            this.disposables.getMin(getDeviceName.length().subscribe(new tokenizer(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initComponents$2(Boolean bool) throws Exception {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(554661889, oncanceled);
            onCancelLoad.getMin(554661889, oncanceled);
        }
        this.canTapNfc = bool.booleanValue();
    }

    private void listenAppLifecycle() {
        AppLifeCycleObserver appLifeCycleObserver2 = this.appLifeCycleObserver;
        tokenizerArgs tokenizerargs = new tokenizerArgs(this);
        appLifeCycleObserver2.length = null;
        appLifeCycleObserver2.length = tokenizerargs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$listenAppLifecycle$3(boolean z) {
        this.warmStart = z;
        if (!z) {
            trackAppStart(TrackerKey.AppStartProperty.APP_START_COLD);
        }
    }

    public void trackAppStart(String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(getBaseContext());
        length2.getMax = TrackerKey.Event.APP_START;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.START_TYPE, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    @CallSuper
    public void backToHomepage(@Nullable Bundle bundle) {
        onInput.getDefault().post(new HomeTabActivity.setMax());
        onInput.getDefault().post(new HomeTabActivity.length(bundle));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onActivityShouldFinished(HomeTabActivity.setMax setmax) {
        if (!(this instanceof HomeTabActivity)) {
            finish();
        }
    }

    public PrepareException.AnonymousClass1 getApplicationComponent() {
        return getDanaApplication().getApplicationComponent();
    }

    public DanaApplication getDanaApplication() {
        return (DanaApplication) getApplication();
    }

    private void initToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1423852156, oncanceled);
            onCancelLoad.getMin(1423852156, oncanceled);
        }
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null) {
            setSupportActionBar(toolbar2);
            getSupportActionBar().getMin((CharSequence) "");
            setTitle("");
            configToolbar();
        }
    }

    public void init(Bundle bundle) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-130945719, oncanceled);
            onCancelLoad.getMin(-130945719, oncanceled);
        }
        init();
    }

    /* access modifiers changed from: protected */
    public void initAsync(removeStateDidChangeHandler removestatedidchangehandler, removeStateDidChangeHandler removestatedidchangehandler2) {
        setFavoriteBtnVisibility length2 = setFavoriteBtnVisibility.length(removestatedidchangehandler);
        hasCornerMarking length3 = hideProgress.length();
        setRefreshAnimation.getMax(length3, "scheduler is null");
        dismissBadgeView setrefreshoffset = new setRefreshOffset(length2, length3);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
        if (redDotDrawable != null) {
            setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setrefreshoffset);
        }
        hasCornerMarking min = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min, "scheduler is null");
        setFavoriteBtnVisibility setheaderviewheight = new setHeaderViewHeight(setrefreshoffset, min);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
        if (redDotDrawable2 != null) {
            setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setheaderviewheight);
        }
        addDisposable(setheaderviewheight.getMin(removestatedidchangehandler2));
    }

    public void onPause() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 406775196 == (max = dispatchOnCancelled.getMax(applicationContext, 406775196)))) {
            onCanceled oncanceled = new onCanceled(406775196, max, 512);
            onCancelLoad.setMax(406775196, oncanceled);
            onCancelLoad.getMin(406775196, oncanceled);
        }
        NfcAdapter nfcAdapter2 = this.nfcAdapter;
        if (!(nfcAdapter2 == null || this.pendingIntent == null)) {
            nfcAdapter2.disableForegroundDispatch(this);
        }
        super.onPause();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent.getAction();
        if (!this.canTapNfc) {
            return;
        }
        if ("android.nfc.action.TAG_DISCOVERED".equals(action) || "android.nfc.action.TECH_DISCOVERED".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            this.disposables.getMin(getDeviceName.setMin().subscribe(new ForeignKey.Action(this)));
            if (!TextUtils.isEmpty(this.emoneyUrl)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", this.emoneyUrl);
                bundle.putParcelable("android.nfc.extra.TAG", intent);
                DanaH5.startContainerActivity(bundle);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$4(String str) throws Exception {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1409864173, oncanceled);
            onCancelLoad.getMin(-1409864173, oncanceled);
        }
        this.emoneyUrl = str;
    }

    public void onResume() {
        PendingIntent pendingIntent2;
        super.onResume();
        enableClick();
        NfcAdapter nfcAdapter2 = this.nfcAdapter;
        if (nfcAdapter2 != null && (pendingIntent2 = this.pendingIntent) != null) {
            nfcAdapter2.enableForegroundDispatch(this, pendingIntent2, (IntentFilter[]) null, (String[][]) null);
        }
    }

    public ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    /* access modifiers changed from: protected */
    public ConnectionStatusReceiver getConnectionStatusReceiver() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(876061987, oncanceled);
            onCancelLoad.getMin(876061987, oncanceled);
        }
        return this.connectionStatusReceiver;
    }

    /* access modifiers changed from: protected */
    public void setTitle(String str, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1731474481, oncanceled);
            onCancelLoad.getMin(1731474481, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1731474481, oncanceled2);
            onCancelLoad.getMin(1731474481, oncanceled2);
        }
        this.toolbarTitle.setText(str);
        this.toolbarTitle.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void setTitle(String str, int i) {
        setTitle(str);
        this.toolbarTitle.setTextColor(i);
    }

    public void setTitle(String str) {
        this.toolbarTitle.setText(str);
    }

    /* access modifiers changed from: protected */
    public void setCenterTitle(String str, int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(720072865, oncanceled);
            onCancelLoad.getMin(720072865, oncanceled);
        }
        setCenterTitle(str);
        this.toolbarTitle.setTextColor(i);
    }

    public void setCenterTitle(String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-73180420, oncanceled);
            onCancelLoad.getMin(-73180420, oncanceled);
        }
        setTitle(str);
    }

    private Toolbar.LayoutParams getCenterParams() {
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams();
        layoutParams.setMin = 17;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void setToolbarImage(@DrawableRes int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.setMax(applicationContext, i, 0)))) {
            onCanceled oncanceled = new onCanceled(i, max, 2);
            onCancelLoad.setMax(-2078853956, oncanceled);
            onCancelLoad.getMin(-2078853956, oncanceled);
        }
        this.toolbarTitle.setVisibility(8);
        this.toolbarImage.setVisibility(0);
        this.toolbarImage.setImageDrawable(getDrawableFromRes(i));
    }

    public Drawable getDrawableFromRes(@DrawableRes int i) {
        return IntRange.length((Context) this, i);
    }

    public void setMenuLeftButton(String str) {
        if (this.leftButton != null) {
            setMarginLeft(10);
            this.leftButton.setText(str);
            if (str == null || str.isEmpty()) {
                this.leftButton.setVisibility(4);
            } else {
                this.leftButton.setVisibility(0);
            }
        }
    }

    public void setMenuLeftButtonEnabled(boolean z) {
        TextView textView = this.leftButton;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public void setMenuRightButton(String str) {
        if (this.rightButton != null) {
            setMarginRight(10);
            this.rightButton.setText(str);
            if (str == null || str.isEmpty()) {
                this.rightButton.setVisibility(4);
            } else {
                this.rightButton.setVisibility(0);
            }
        }
    }

    public void setMenuRightButtonEnabled(boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-30182283, oncanceled);
            onCancelLoad.getMin(-30182283, oncanceled);
        }
        TextView textView = this.rightButton;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public void setMenuRightProgressBar(boolean z) {
        setMenuRightButtonEnabled(!z);
        TextView textView = this.rightButton;
        int i = 8;
        if (textView != null) {
            textView.setVisibility(z ? 8 : 0);
        }
        RelativeLayout relativeLayout = this.rightProgressBar;
        if (relativeLayout != null) {
            if (z) {
                i = 0;
            }
            relativeLayout.setVisibility(i);
            animateProgress();
        }
    }

    public void setMenuRightContentDescription(String str) {
        this.rightButton.setContentDescription(str);
    }

    public void setMenuLeftButton(@DrawableRes int i) {
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-225699094, oncanceled);
            onCancelLoad.getMin(-225699094, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 16);
            onCancelLoad.setMax(-225699094, oncanceled2);
            onCancelLoad.getMin(-225699094, oncanceled2);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-225699094, oncanceled3);
            onCancelLoad.getMin(-225699094, oncanceled3);
        }
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null && i != 0) {
            toolbar2.setNavigationIcon(i);
            this.toolbar.setNavigationOnClickListener(new Fts4(this));
            this.leftButton.setVisibility(4);
            getNavigationButton(this.toolbar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setMenuLeftButton$5(View view) {
        onBackPressed();
    }

    private void getNavigationButton(Toolbar toolbar2) {
        for (int i = 0; i < toolbar2.getChildCount(); i++) {
            View childAt = toolbar2.getChildAt(i);
            if (childAt instanceof ImageButton) {
                childAt.setContentDescription(getResources().getString(R.string.imgBtnLeft));
            }
        }
    }

    public void clearMenuLeftButtonIcon() {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-616373595, oncanceled);
            onCancelLoad.getMin(-616373595, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-616373595, oncanceled2);
            onCancelLoad.getMin(-616373595, oncanceled2);
        }
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon((Drawable) null);
        }
    }

    private void animateProgress() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.f732130772045);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.icImageFg.startAnimation(loadAnimation);
    }

    private void setMarginRight(int i) {
        ViewGroup.MarginLayoutParams toolbarParam = getToolbarParam();
        toolbarParam.setMargins(toolbarParam.leftMargin, toolbarParam.topMargin, (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density), toolbarParam.bottomMargin);
        this.rlToolbar.setLayoutParams(toolbarParam);
    }

    private void setMarginLeft(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1307678821, oncanceled);
            onCancelLoad.getMin(-1307678821, oncanceled);
        }
        ViewGroup.MarginLayoutParams toolbarParam = getToolbarParam();
        toolbarParam.setMargins((int) (((float) i) * Resources.getSystem().getDisplayMetrics().density), toolbarParam.topMargin, toolbarParam.rightMargin, toolbarParam.bottomMargin);
        this.rlToolbar.setLayoutParams(toolbarParam);
    }

    private ViewGroup.MarginLayoutParams getToolbarParam() {
        return (ViewGroup.MarginLayoutParams) this.rlToolbar.getLayoutParams();
    }

    public void setMenuLeftButton(Drawable drawable, View.OnClickListener onClickListener) {
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null && drawable != null) {
            toolbar2.setNavigationIcon(drawable);
            this.toolbar.setNavigationOnClickListener(onClickListener);
            this.leftButton.setVisibility(4);
        }
    }

    public void setMenuLeftButtonOnClick(View.OnClickListener onClickListener) {
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null && toolbar2.getNavigationIcon() != null) {
            this.toolbar.setNavigationOnClickListener(onClickListener);
        }
    }

    public void setMenuRightButton(@DrawableRes int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1583184409, oncanceled);
            onCancelLoad.getMin(-1583184409, oncanceled);
        }
        if (this.rightButton != null && i != 0) {
            setMarginRight(10);
            this.rightButton.setBackground(getDrawableFromRes(i));
            this.rightButton.setVisibility(0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1262217417, oncanceled);
            onCancelLoad.getMin(-1262217417, oncanceled);
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onHomeIndicatorClick();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onHomeIndicatorClick() {
        super.onBackPressed();
    }

    private int getStatusBarHeight() {
        int identifier;
        if (!CornerMarkingDataProvider.getMax() || (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return getResources().getDimensionPixelSize(identifier);
    }

    public void showToast(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void addDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.disposables == null) {
            this.disposables = new IRedDotManager();
        }
        if (updateRunnable != null) {
            IRedDotManager iRedDotManager = this.disposables;
            if (iRedDotManager != null) {
                iRedDotManager.getMin(updateRunnable);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void dispose() {
        IRedDotManager iRedDotManager = this.disposables;
        if (iRedDotManager != null && !iRedDotManager.isDisposed()) {
            this.disposables.dispose();
            this.disposables = null;
        }
    }

    public void registerPresenter(onDelete.getMin... getminArr) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1880666381, oncanceled);
            onCancelLoad.getMin(1880666381, oncanceled);
        }
        if (this.presenterList == null) {
            this.presenterList = new ArrayList();
        }
        if (getminArr != null && getminArr.length > 0) {
            this.presenterList.addAll(Arrays.asList(getminArr));
        }
    }

    public void disposePresenter() {
        List<onDelete.getMin> list = this.presenterList;
        if (list != null) {
            for (onDelete.getMin max : list) {
                max.setMax();
            }
        }
    }

    public void showWarningDialog(String str) {
        showWarningDialog(str, (DialogInterface.OnDismissListener) null);
    }

    public void showWarningDialog(String str, DialogInterface.OnDismissListener onDismissListener) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1464788027, oncanceled);
            onCancelLoad.getMin(1464788027, oncanceled);
        }
        showWarningDialog(str, onDismissListener, true, 0);
    }

    public void showWarningDialog(String str, DialogInterface.OnDismissListener onDismissListener, boolean z, int i) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1920860202, oncanceled);
            onCancelLoad.getMin(-1920860202, oncanceled);
        }
        if (str != null && str.contains("RpcException")) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.system_is_busy));
            sb.append(" : RpcError[10]");
            String obj = sb.toString();
            trackAsNonFatal(str);
            str = obj;
        }
        CommonDialog.getMax getmax = new CommonDialog.getMax(this);
        getmax.toFloatRange = str;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_warning_14;
        if (onDismissListener != null) {
            getmax.setMin = onDismissListener;
        }
        if (z) {
            getmax.length = z;
        }
        if (i > 0) {
            getmax.getMin = Integer.valueOf(i).intValue();
        }
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    private void trackAsNonFatal(String str) {
        try {
            FirebaseCrashlytics.getInstance().recordException(new RpcException(str));
        } catch (Exception unused) {
        }
    }

    public void showWarningDialog(String str, DialogInterface.OnDismissListener onDismissListener, boolean z) {
        showWarningDialog(str, onDismissListener, z, 0);
    }

    public void showWarningDialog(String str, DialogInterface.OnDismissListener onDismissListener, int i) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1934802532, oncanceled);
            onCancelLoad.getMin(-1934802532, oncanceled);
        }
        showWarningDialog(str, onDismissListener, true, i);
    }

    public void showSuccessDialog(String str, DialogInterface.OnDismissListener onDismissListener) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1734241364, oncanceled);
            onCancelLoad.getMin(1734241364, oncanceled);
        }
        CommonDialog.getMax getmax = new CommonDialog.getMax(this);
        getmax.toFloatRange = str;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_success;
        getmax.setMin = onDismissListener;
        new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0).setMin();
    }

    public void adjustFontScale(Configuration configuration) {
        configuration.fontScale = 1.0f;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
    }

    public void disableClick() {
        this.clickable = false;
    }

    public void enableClick() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1264706900, oncanceled);
            onCancelLoad.getMin(-1264706900, oncanceled);
        }
        this.clickable = true;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public Intent getIntentClassWithTracking(@NotNull Class<?> cls) {
        return getIntentClassWithTracking(cls, getSource());
    }

    public Intent getIntentClassWithTracking(@NotNull Class<?> cls, String str) {
        Intent intent = new Intent(this, cls);
        intent.putExtra("source", str);
        return intent;
    }

    public String getSource() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(796109014, oncanceled);
            onCancelLoad.getMin(796109014, oncanceled);
        }
        return getSource(getIntent().getExtras());
    }

    public String getSource(Bundle bundle) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1576898048, oncanceled);
            onCancelLoad.getMin(1576898048, oncanceled);
        }
        return bundle != null ? bundle.getString("source") : "";
    }

    public Bundle getBundleWithSource() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1950774554, oncanceled);
            onCancelLoad.getMin(1950774554, oncanceled);
        }
        Bundle bundle = new Bundle();
        bundle.putString("source", getSource());
        return bundle;
    }

    public boolean isWarmStart() {
        return this.warmStart;
    }

    public boolean isActivityAvailable() {
        return !isFinishing() && !isDestroyed();
    }
}
