package id.dana.home.view;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.AppLifeCycleObserver;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.home.view.ZoomDialog;
import javax.inject.Inject;
import o.BottomPopup;
import o.DefaultWebViewSettingExtensionImpl;
import o.GriverActivityRestoreExtensionImpl;
import o.GriverAppExtensionImpl;
import o.PrepareException;
import o.RedDotManager;
import o.Workflow;
import o.dispatchOnCancelled;
import o.getContentInsetEnd;
import o.getPageSize;
import o.getSecureSignatureComp;
import o.handlerParameterizedType;
import o.hideProgress;
import o.isUserInputEnabled;
import o.onCancelLoad;
import o.onCanceled;
import o.onInstallFinish;
import o.onLayoutChange;
import o.onNext;
import o.setContentViewBefore;
import o.setStateOn;
import o.setSubmitTextColor;
import o.stopIgnoring;

public class ZoomDialog extends BaseActivity implements AppLifeCycleObserver.setMin {
    public static final String QR_BAR_CODE = "QR_BAR_CODE";
    public static final String QR_DISPLAYED = "QR_DISPLAY";
    private handlerParameterizedType IsOverlapping;
    @Inject
    public AppLifeCycleObserver appLifeCycleObserver;
    private boolean getMax;
    private QrRefreshNotification getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @BindView(2131363676)
    ImageView ivBarcodeZoom;
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131363677)
    ImageView ivQrZoom;
    @BindView(2131363764)
    LinearLayout layoutBarcodeZoom;
    @BindView(2131364447)
    RelativeLayout layoutParent;
    @BindView(2131363765)
    RelativeLayout layoutQrZoom;
    @Inject
    public getPageSize.setMin offlinePayPresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    private setStateOn setMax;
    @BindView(2131365681)
    TextView tvCode;

    public void configToolbar() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && 1175617763 != (max = dispatchOnCancelled.getMax(applicationContext, 1175617763))) {
            onCanceled oncanceled = new onCanceled(1175617763, max, 512);
            onCancelLoad.setMax(1175617763, oncanceled);
            onCancelLoad.getMin(1175617763, oncanceled);
        }
    }

    public int getLayout() {
        return R.layout.dialog_zoom;
    }

    public void init() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1060382453, oncanceled);
            onCancelLoad.getMin(-1060382453, oncanceled);
        }
        if (this.IsOverlapping == null) {
            onInstallFinish.setMax setmax = new onInstallFinish.setMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                setmax.setMax = applicationComponent;
                setmax.getMax = new PayQrModule(new isUserInputEnabled.length() {
                    public final void dismissProgress() {
                    }

                    public final void getMax() {
                    }

                    public final void getMin() {
                    }

                    public final void getMin(String str) {
                    }

                    public final void length() {
                    }

                    public final void onError(String str) {
                    }

                    public final void setMax() {
                    }

                    public final void showProgress() {
                    }
                });
                setmax.getMin = new OfflinePayModule(new getPageSize.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void length(Boolean bool) {
                        if (bool.booleanValue()) {
                            ZoomDialog.this.payQrPresenter.length();
                        }
                    }
                });
                setmax.setMin = new GlobalNetworkModule(new Workflow() {
                    public final void setMax(boolean z, String str) {
                        ZoomDialog.access$000(ZoomDialog.this, z, str);
                    }
                });
                stopIgnoring.setMin(setmax.getMax, PayQrModule.class);
                stopIgnoring.setMin(setmax.getMin, OfflinePayModule.class);
                stopIgnoring.setMin(setmax.setMin, GlobalNetworkModule.class);
                stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
                this.IsOverlapping = new onInstallFinish(setmax.getMax, setmax.getMin, setmax.setMin, setmax.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.IsOverlapping.setMin(this);
        registerPresenter(this.payQrPresenter, this.globalNetworkPresenter);
        this.globalNetworkPresenter.getMin();
        this.globalNetworkPresenter.setMin();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(QR_BAR_CODE);
            this.getMax = intent.getBooleanExtra(QR_DISPLAYED, false);
            displayQrImage(stringExtra);
        }
        setContentViewBefore.setMin(this);
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) this);
        getmin.length.add("android.permission.WRITE_EXTERNAL_STORAGE");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                ZoomDialog.this.addDisposable(setSubmitTextColor.getMin(ZoomDialog.this).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new onLayoutChange(ZoomDialog.this)));
            }
        };
        setStateOn setstateon = new setStateOn(getmin, (byte) 0);
        this.setMax = setstateon;
        setstateon.setMin();
        if (this.getMin == null) {
            this.getMin = new QrRefreshNotification(this);
        }
        AppLifeCycleObserver appLifeCycleObserver2 = this.appLifeCycleObserver;
        if (appLifeCycleObserver2 != null) {
            appLifeCycleObserver2.setMax.add(this);
        }
    }

    public void displayQrImage(String str) {
        int length;
        int min;
        int length2;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min2, 32);
            onCancelLoad.setMax(1621392564, oncanceled);
            onCancelLoad.getMin(1621392564, oncanceled);
        }
        if (this.getMax) {
            this.layoutQrZoom.setVisibility(0);
            this.layoutBarcodeZoom.setVisibility(8);
            addDisposable(BottomPopup.getMin(str).subscribe(new GriverActivityRestoreExtensionImpl(this), new DefaultWebViewSettingExtensionImpl(this)));
            this.tvCode.setText("");
            return;
        }
        this.layoutQrZoom.setVisibility(8);
        this.layoutBarcodeZoom.setVisibility(0);
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1535220988, oncanceled2);
            onCancelLoad.getMin(1535220988, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1535220988, oncanceled3);
            onCancelLoad.getMin(1535220988, oncanceled3);
        }
        this.layoutBarcodeZoom.setRotation(90.0f);
        this.layoutBarcodeZoom.setScaleX(1.5f);
        this.layoutBarcodeZoom.setScaleY(1.5f);
        addDisposable(BottomPopup.setMin(str, 500).subscribe(new RedDotManager(this) {
            private final ZoomDialog getMax;

            {
                this.getMax = r1;
            }

            public final void accept(Object obj) {
                this.getMax.ivBarcodeZoom.setImageBitmap((Bitmap) obj);
            }
        }, new GriverAppExtensionImpl(this)));
        this.tvCode.setText(str);
    }

    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(QrRefreshNotification.ACTION);
        registerReceiver(this.getMin, intentFilter);
    }

    public void onStop() {
        getContentInsetEnd.getMax((Context) this, (BroadcastReceiver) this.getMin);
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
        AppLifeCycleObserver appLifeCycleObserver2 = this.appLifeCycleObserver;
        if (appLifeCycleObserver2 != null) {
            try {
                appLifeCycleObserver2.setMax.remove(this);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131364447})
    public void onParentLayoutClicked() {
        finish();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(884519239, oncanceled);
            onCancelLoad.getMin(884519239, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(884519239, oncanceled2);
            onCancelLoad.getMin(884519239, oncanceled2);
        }
        setStateOn setstateon = this.setMax;
        if (setstateon == null || !setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onHomeClicked() {
        this.offlinePayPresenter.setMin();
    }

    static /* synthetic */ void access$000(ZoomDialog zoomDialog, boolean z, String str) {
        if (!z || str.equals("ID")) {
            zoomDialog.ivLogo.setImageResource(R.drawable.dana_logo_blue);
        } else {
            zoomDialog.ivLogo.setImageResource(R.drawable.ic_gn_rounded);
        }
    }
}
