package id.dana.pay;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.OnClick;
import com.andrognito.flashbar.Flashbar;
import com.andrognito.flashbar.FlashbarContainerView;
import com.andrognito.flashbar.anim.FlashAnimBarBuilder;
import com.google.android.material.tabs.TabLayout;
import id.dana.AppLifeCycleObserver;
import id.dana.R;
import id.dana.base.ViewPagerBaseActivity;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.globalnetwork.pay.BalanceGnPayFragment;
import id.dana.home.view.NavigationTabView;
import id.dana.pay.PayActivity;
import id.dana.pay.screen.AddNewCardFragment;
import id.dana.popup.LockableViewPager;
import id.dana.richview.DanaProtectionView;
import id.dana.richview.LogoProgressView;
import id.dana.scanner.ScannerFragment;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import o.BlurProcess;
import o.CornerMarkingDataProvider;
import o.CustomPopMenuExtension;
import o.FragmentStateAdapter$5;
import o.FtsOptions$Order;
import o.IH5TinyPopMenu;
import o.IntRange;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.RedDotManager;
import o.Workflow;
import o.closeAllSocket;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.fakeDragBy;
import o.genTextSelector;
import o.getMaxSize;
import o.getPackage;
import o.getPageSize;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.isInAccessExternalPathWhiteList;
import o.isUserInputEnabled;
import o.onCancelLoad;
import o.onCanceled;
import o.onInvalidation;
import o.onNext;
import o.onSwitchToWhiteTheme;
import o.sendSizeLimitationCallback;
import o.setCancelOnTouchOutside$core;
import o.setCollapseContentDescription;
import o.setStateOn;
import o.setSubmitTextColor;
import o.stopIgnoring;
import o.updateActionSheetContent;

public class PayActivity extends ViewPagerBaseActivity implements AppLifeCycleObserver.setMin {
    public static final String CANCEL_TO_SCAN = "cancel_to_scan";
    public static final String MP_POSITION = "mp_position";
    /* access modifiers changed from: private */
    public List<PayCardInfo> FastBitmap$CoordinateSystem;
    private closeAllSocket IsOverlapping;
    @Inject
    public AppLifeCycleObserver appLifeCycleObserver;
    DanaProtectionView danaProtectionView;
    /* access modifiers changed from: private */
    public int equals = -1;
    /* access modifiers changed from: private */
    public boolean getMax;
    private Flashbar getMin;
    @Inject
    public FragmentStateAdapter$5.setMin getPaymentResultPresenter;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    /* access modifiers changed from: private */
    public boolean isInside = false;
    LogoProgressView logoProgressView;
    @Inject
    public getPageSize.setMin offlinePresenter;
    @Inject
    public isUserInputEnabled.getMax payQrPresenter;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public fakeDragBy.length queryPayMethodPresenter;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    /* access modifiers changed from: private */
    public boolean setMax;
    TabLayout tabLayout;
    private setStateOn toFloatRange;
    private setMin toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    /* access modifiers changed from: private */
    public boolean values;
    LockableViewPager viewPager;

    public void configToolbar() {
    }

    public int getLayout() {
        return R.layout.activity_pay;
    }

    static /* synthetic */ void access$1100(PayActivity payActivity, String str, String str2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-543433914, oncanceled);
            onCancelLoad.getMin(-543433914, oncanceled);
        }
        payActivity.getMin();
        Flashbar.setMin setmin = new Flashbar.setMin(payActivity);
        Flashbar.Gravity gravity = Flashbar.Gravity.TOP;
        Intrinsics.checkParameterIsNotNull(gravity, "gravity");
        Flashbar.setMin setmin2 = setmin;
        setmin2.setMin = gravity;
        Intrinsics.checkParameterIsNotNull(str, "title");
        Flashbar.setMin setmin3 = setmin2;
        setmin3.toString = str;
        int max2 = dispatchOnCancelled.setMax(R.color.f20412131099955);
        if (R.color.f20412131099955 != max2) {
            onCanceled oncanceled2 = new onCanceled(R.color.f20412131099955, max2, 1);
            onCancelLoad.setMax(1829834291, oncanceled2);
            onCancelLoad.getMin(1829834291, oncanceled2);
        }
        Flashbar.setMin setmin4 = setmin3;
        setmin4.Grayscale$Algorithm = Integer.valueOf(IntRange.setMax(setmin4.ITrustedWebActivityCallback$Default, R.color.f20412131099955));
        Flashbar.setMin setmin5 = setmin4;
        setmin5.ICustomTabsCallback = setmin5.ITrustedWebActivityCallback$Default.getString(R.string.transaction_success);
        Flashbar.setMin setmin6 = setmin5;
        setmin6.onRelationshipValidationResult = Integer.valueOf(IntRange.setMax(setmin6.ITrustedWebActivityCallback$Default, R.color.f20412131099955));
        Flashbar.setMin setmin7 = setmin6;
        setmin7.ICustomTabsService$Stub = IntRange.length((Context) setmin7.ITrustedWebActivityCallback$Default, (int) R.drawable.ic_pay_success);
        Flashbar.setMin floatRange = setmin7.setMax(R.color.f24002131100339).toFloatRange();
        String string = floatRange.ITrustedWebActivityCallback$Default.getString(R.string.see);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(actionTextId)");
        Intrinsics.checkParameterIsNotNull(string, "text");
        Flashbar.setMin setmin8 = floatRange;
        if (setmin8.ITrustedWebActivityCallback != Flashbar.ProgressPosition.RIGHT) {
            setmin8.onPostMessage = string;
            setmin8.asBinder = Integer.valueOf(IntRange.setMax(setmin8.ITrustedWebActivityCallback$Default, R.color.f18392131099713));
            sendSizeLimitationCallback sendsizelimitationcallback = new sendSizeLimitationCallback(str2);
            Intrinsics.checkParameterIsNotNull(sendsizelimitationcallback, "onActionTapListener");
            Flashbar.setMin setmin9 = setmin8;
            setmin9.onTransact = sendsizelimitationcallback;
            Flashbar.setMin setmin10 = setmin9;
            setmin10.setMax = Integer.valueOf(IntRange.setMax(setmin10.ITrustedWebActivityCallback$Default, R.color.f24762131100430));
            Flashbar.setMin max3 = setmin10.getMax(TimeUnit.SECONDS.toMillis(5));
            max3.toFloatRange = true;
            Flashbar.setMin setmin11 = max3;
            setmin11.values = true;
            Flashbar.Vibration[] vibrationArr = {Flashbar.Vibration.SHOW};
            Intrinsics.checkParameterIsNotNull(vibrationArr, "vibrate");
            Flashbar.setMin setmin12 = setmin11;
            setmin12.FastBitmap$CoordinateSystem = ArraysKt.toList((T[]) vibrationArr);
            FlashAnimBarBuilder values2 = new FlashAnimBarBuilder(setCollapseContentDescription.setMin((Context) payActivity).setMin).getMax(400).equals().values();
            Intrinsics.checkParameterIsNotNull(values2, "builder");
            Flashbar.setMin setmin13 = setmin12;
            setmin13.ITrustedWebActivityService = values2;
            FlashAnimBarBuilder isInside2 = new FlashAnimBarBuilder(setCollapseContentDescription.setMin((Context) payActivity).setMin).getMax(200).isInside();
            Intrinsics.checkParameterIsNotNull(isInside2, "builder");
            Flashbar.setMin setmin14 = setmin13;
            setmin14.areNotificationsEnabled = isInside2;
            Flashbar equals2 = setmin14.equals();
            payActivity.getMin = equals2;
            FlashbarContainerView flashbarContainerView = equals2.getMin;
            if (flashbarContainerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
            }
            flashbarContainerView.show$flashbar_release(equals2.setMax.ITrustedWebActivityCallback$Default);
            return;
        }
        throw new IllegalArgumentException("Cannot show action button if right progress is set".toString());
    }

    static /* synthetic */ void access$1500(PayActivity payActivity) {
        int length;
        int min;
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-814252392, oncanceled);
            onCancelLoad.getMin(-814252392, oncanceled);
        }
        payActivity.getMin();
        Flashbar.setMin setmin = new Flashbar.setMin(payActivity);
        Flashbar.Gravity gravity = Flashbar.Gravity.TOP;
        Intrinsics.checkParameterIsNotNull(gravity, "gravity");
        Flashbar.setMin setmin2 = setmin;
        setmin2.setMin = gravity;
        Flashbar.setMin setmin3 = setmin2;
        setmin3.ICustomTabsCallback = setmin3.ITrustedWebActivityCallback$Default.getString(R.string.transaction_failed);
        Flashbar.setMin setmin4 = setmin3;
        setmin4.onRelationshipValidationResult = Integer.valueOf(IntRange.setMax(setmin4.ITrustedWebActivityCallback$Default, R.color.f20412131099955));
        Flashbar.setMin setmin5 = setmin4;
        setmin5.ICustomTabsService$Stub = IntRange.length((Context) setmin5.ITrustedWebActivityCallback$Default, (int) R.drawable.ic_pay_failed);
        Flashbar.setMin floatRange = setmin5.setMax(R.color.f20212131099924).toFloatRange();
        floatRange.setMax = Integer.valueOf(IntRange.setMax(floatRange.ITrustedWebActivityCallback$Default, R.color.f24762131100430));
        Flashbar.setMin max = floatRange.getMax(TimeUnit.SECONDS.toMillis(5));
        max.toFloatRange = true;
        Flashbar.setMin setmin6 = max;
        setmin6.values = true;
        Flashbar.Vibration[] vibrationArr = {Flashbar.Vibration.SHOW};
        Intrinsics.checkParameterIsNotNull(vibrationArr, "vibrate");
        Flashbar.setMin setmin7 = setmin6;
        setmin7.FastBitmap$CoordinateSystem = ArraysKt.toList((T[]) vibrationArr);
        FlashAnimBarBuilder values2 = new FlashAnimBarBuilder(setCollapseContentDescription.setMin((Context) payActivity).setMin).getMax(400).equals().values();
        Intrinsics.checkParameterIsNotNull(values2, "builder");
        Flashbar.setMin setmin8 = setmin7;
        setmin8.ITrustedWebActivityService = values2;
        FlashAnimBarBuilder isInside2 = new FlashAnimBarBuilder(setCollapseContentDescription.setMin((Context) payActivity).setMin).getMax(200).isInside();
        Intrinsics.checkParameterIsNotNull(isInside2, "builder");
        Flashbar.setMin setmin9 = setmin8;
        setmin9.areNotificationsEnabled = isInside2;
        Flashbar equals2 = setmin9.equals();
        payActivity.getMin = equals2;
        FlashbarContainerView flashbarContainerView = equals2.getMin;
        if (flashbarContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarContainerView.show$flashbar_release(equals2.setMax.ITrustedWebActivityCallback$Default);
    }

    static /* synthetic */ void access$800(PayActivity payActivity, int i) {
        int length;
        int min;
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1577205195, oncanceled);
            onCancelLoad.getMin(-1577205195, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(payActivity.getApplicationContext());
        length2.getMax = TrackerKey.Event.PAY_QR_OPEN;
        convertDipToPx.length max = length2.setMax("Source", payActivity.getSource()).getMax(TrackerKey.Property.PAYMENT_METHOD_COUNT, i).setMax();
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static Intent createPayActivityIntent(Activity activity, String str) {
        Intent intent = new Intent(activity, PayActivity.class);
        intent.putExtra("source", str);
        return intent;
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public void init() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(999477192, oncanceled);
            onCancelLoad.getMin(999477192, oncanceled);
        }
        if (this.IsOverlapping == null) {
            getPackage.getMin getmin = new getPackage.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.equals = applicationComponent;
                getmin.getMin = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(this));
                int max = dispatchOnCancelled.getMax(0);
                if (max != 0) {
                    onCanceled oncanceled2 = new onCanceled(0, max, 16);
                    onCancelLoad.setMax(1988519994, oncanceled2);
                    onCancelLoad.getMin(1988519994, oncanceled2);
                }
                getmin.getMax = new GetPaymentResultModule(new FragmentStateAdapter$5.getMax() {
                    public final void dismissProgress() {
                    }

                    public final void showProgress() {
                    }

                    public final void setMin(String str, String str2) {
                        PayActivity.access$1000(PayActivity.this, "Success");
                        PayActivity.access$1100(PayActivity.this, str, str2);
                        PayActivity.access$1200(PayActivity.this, str2);
                        boolean unused = PayActivity.this.isInside = true;
                        PayActivity.access$1400(PayActivity.this);
                    }

                    public final void getMin(String str) {
                        PayActivity.access$1000(PayActivity.this, "Pending");
                        Vibrator vibrator = (Vibrator) PayActivity.this.getSystemService("vibrator");
                        if (CornerMarkingDataProvider.FastBitmap$CoordinateSystem()) {
                            vibrator.vibrate(VibrationEffect.createOneShot(500, -1));
                        } else {
                            vibrator.vibrate(500);
                        }
                        DanaH5.startContainerFullUrl(str);
                        boolean unused = PayActivity.this.isInside = true;
                        PayActivity.access$1400(PayActivity.this);
                    }

                    public final void setMin(String str) {
                        PayActivity.access$1000(PayActivity.this, TrackerKey.ResultType.FAILED);
                        boolean unused = PayActivity.this.isInside = true;
                        if (!TextUtils.isEmpty(str)) {
                            DanaH5.startContainerFullUrl(str);
                        } else {
                            PayActivity.access$1500(PayActivity.this);
                        }
                        PayActivity.access$1400(PayActivity.this);
                    }

                    public final void onError(String str) {
                        PayActivity.access$1400(PayActivity.this);
                    }
                });
                getmin.setMin = new QueryPayMethodModule(new fakeDragBy.getMin() {
                    public final void length() {
                    }

                    public final void length(int i) {
                    }

                    public final void setMin(Boolean bool) {
                        boolean unused = PayActivity.this.setMax = bool.booleanValue();
                    }

                    public final void length(String str, String str2, List<PayCardInfo> list, boolean z, boolean z2) {
                        boolean unused = PayActivity.this.values = z;
                        List unused2 = PayActivity.this.FastBitmap$CoordinateSystem = list;
                        PayActivity.access$500(PayActivity.this, str2, list, false);
                        if (!z || !z2) {
                            PayActivity.access$600(PayActivity.this, str, list);
                        } else if (PayActivity.this.getCurrentFragment() instanceof ScannerFragment) {
                            ((ScannerFragment) PayActivity.this.getCurrentFragment()).o_();
                        }
                        PayActivity payActivity = PayActivity.this;
                        PayActivity.access$800(payActivity, PayActivity.access$700(payActivity, list));
                        BlurProcess.getMin(TrackerKey.Event.PAY_QR_RESULT);
                    }

                    public final void setMax(String str, List<PayCardInfo> list) {
                        boolean unused = PayActivity.this.values = false;
                        boolean unused2 = PayActivity.this.setMax = false;
                        List unused3 = PayActivity.this.FastBitmap$CoordinateSystem = list;
                        PayActivity.access$500(PayActivity.this, str, list, true);
                        PayActivity.access$900(PayActivity.this);
                        PayActivity payActivity = PayActivity.this;
                        PayActivity.access$800(payActivity, PayActivity.access$700(payActivity, list));
                        BlurProcess.getMin(TrackerKey.Event.PAY_QR_RESULT);
                    }

                    public final void getMax() {
                        CustomPopMenuExtension customPopMenuExtension = PayActivity.this.sessionExpiredManager;
                        PayActivity payActivity = PayActivity.this;
                        customPopMenuExtension.setMax = payActivity;
                        customPopMenuExtension.length = new deleteAppInfoById(customPopMenuExtension.setMax);
                        payActivity.showWarningDialog(payActivity.getString(R.string.session_expired_desc), (DialogInterface.OnDismissListener) new onSwitchToWhiteTheme(customPopMenuExtension), false);
                    }

                    public final void showProgress() {
                        if (!PayActivity.this.offlinePresenter.length().booleanValue()) {
                            PayActivity.this.logoProgressView.setVisibility(0);
                            PayActivity.this.logoProgressView.startRefresh();
                        }
                    }

                    public final void dismissProgress() {
                        if (!PayActivity.this.offlinePresenter.length().booleanValue()) {
                            PayActivity.this.logoProgressView.setVisibility(8);
                            PayActivity.this.logoProgressView.stopRefresh();
                        }
                    }

                    public final void onError(String str) {
                        updateActionSheetContent.exception(DanaLogConstants.TAG.QRCODE_TAG, DanaLogConstants.Prefix.QRCODE_QUERY_PAY_METHOD_PREFIX, str);
                    }
                });
                getmin.setMax = new PayQrModule(new isUserInputEnabled.length() {
                    public final void dismissProgress() {
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

                    public final void getMax() {
                        if (PayActivity.this.queryPayMethodPresenter != null) {
                            PayActivity.this.queryPayMethodPresenter.getMin();
                        }
                    }
                });
                getmin.length = new OfflinePayModule(new getPageSize.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void length(Boolean bool) {
                        boolean unused = PayActivity.this.toString = bool.booleanValue();
                        PayActivity.this.globalNetworkPresenter.setMin();
                    }
                });
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(-1458344543, oncanceled3);
                    onCancelLoad.getMin(-1458344543, oncanceled3);
                }
                getmin.toFloatRange = new GlobalNetworkModule(new Workflow() {
                    public final void setMax(boolean z, String str) {
                        PayActivity payActivity = PayActivity.this;
                        PayActivity.access$100(payActivity, payActivity.toString, z);
                    }
                });
                stopIgnoring.setMin(getmin.getMax, GetPaymentResultModule.class);
                stopIgnoring.setMin(getmin.setMin, QueryPayMethodModule.class);
                stopIgnoring.setMin(getmin.setMax, PayQrModule.class);
                stopIgnoring.setMin(getmin.length, OfflinePayModule.class);
                stopIgnoring.setMin(getmin.getMin, PlayStoreReviewModules.class);
                stopIgnoring.setMin(getmin.toFloatRange, GlobalNetworkModule.class);
                stopIgnoring.setMin(getmin.equals, PrepareException.AnonymousClass1.class);
                this.IsOverlapping = new getPackage(getmin.getMax, getmin.setMin, getmin.setMax, getmin.length, getmin.getMin, getmin.toFloatRange, getmin.equals, (byte) 0);
            } else {
                throw null;
            }
        }
        this.IsOverlapping.setMin(this);
        registerPresenter(this.getPaymentResultPresenter, this.queryPayMethodPresenter, this.payQrPresenter, this.offlinePresenter, this.globalNetworkPresenter);
        this.viewPager = (LockableViewPager) findViewById(R.id.f72802131365915);
        this.tabLayout = (TabLayout) findViewById(R.id.f35172131361963);
        this.danaProtectionView = (DanaProtectionView) findViewById(R.id.f72242131365859);
        this.logoProgressView = (LogoProgressView) findViewById(R.id.f57112131364288);
        this.globalNetworkPresenter.isInside();
        this.offlinePresenter.setMin();
    }

    public void onPause() {
        super.onPause();
        dispose();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    public void onResume() {
        int max;
        super.onResume();
        if (this.offlinePresenter.length().booleanValue() && !this.isInside) {
            this.payQrPresenter.getMin();
        }
        this.isInside = false;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -331224580 == (max = dispatchOnCancelled.getMax(applicationContext, -331224580)))) {
            onCanceled oncanceled = new onCanceled(-331224580, max, 512);
            onCancelLoad.setMax(-331224580, oncanceled);
            onCancelLoad.getMin(-331224580, oncanceled);
        }
        if (this.toFloatRange == null) {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this);
            Collections.addAll(getmin.length, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
            getmin.getMax = new setStateOn.length() {
                public final void getMin(setStateOn.setMin setmin) {
                    PayActivity.this.addDisposable(setSubmitTextColor.getMin(PayActivity.this).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new RedDotManager(PayActivity.this) {
                        private final PayActivity setMax;

                        {
                            this.setMax = r1;
                        }

                        public final void accept(Object obj) {
                            PayActivity.setMax(this.setMax);
                        }
                    }));
                }

                public final void setMin(setStateOn.setMin setmin) {
                    boolean unused = PayActivity.this.getMax = true;
                }
            };
            this.toFloatRange = new setStateOn(getmin, (byte) 0);
        }
        if (!this.getMax) {
            this.toFloatRange.setMin();
        }
    }

    private boolean getMin(int i) {
        return this.FastBitmap$CoordinateSystem != null && i >= 0;
    }

    private void getMin() {
        Flashbar flashbar = this.getMin;
        if (flashbar != null && flashbar.setMax()) {
            FlashbarContainerView flashbarContainerView = this.getMin.getMin;
            if (flashbarContainerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
            }
            flashbarContainerView.dismiss$flashbar_release();
            this.getMin = null;
        }
    }

    private void getMax(String str, List<PayCardInfo> list, List<FtsOptions$Order> list2) {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1213250012, oncanceled);
            onCancelLoad.getMin(-1213250012, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1213250012, oncanceled2);
            onCancelLoad.getMin(-1213250012, oncanceled2);
        }
        list2.add(BalanceQrisPayFragment.length(str));
        if (list != null && !list.isEmpty()) {
            for (PayCardInfo min2 : list) {
                list2.add(CardQrisPayFragment.setMin(min2));
            }
        }
    }

    private static void setMax(String str, List<PayCardInfo> list, List<FtsOptions$Order> list2) {
        list2.add(BalancePayFragment.getMax(str));
        if (list != null && !list.isEmpty()) {
            for (PayCardInfo min : list) {
                list2.add(CardPayFragment.setMin(min));
            }
        }
    }

    private boolean setMin() {
        setMin setmin = this.toIntRange;
        return setmin != null && setmin.getCount() > 0;
    }

    private boolean setMax() {
        if (!setMin() || !(this.toIntRange.getMax(0) instanceof PayScannerFragment)) {
            return false;
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1442001934, oncanceled);
            onCancelLoad.getMin(-1442001934, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1442001934, oncanceled2);
            onCancelLoad.getMin(-1442001934, oncanceled2);
        }
        setStateOn setstateon = this.toFloatRange;
        if (setstateon == null || !setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @OnClick({2131365859})
    public void openGuarantee() {
        DanaH5.startContainerFullUrl("https://a.m.dana.id/resource/htmls/info/secure.html");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363985, 2131362588})
    public void dismissActivity() {
        finish();
    }

    public void onHomeClicked() {
        FtsOptions$Order currentFragment;
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-68438986, oncanceled);
            onCancelLoad.getMin(-68438986, oncanceled);
        }
        try {
            if (this.offlinePresenter.length().booleanValue() && (currentFragment = getCurrentFragment()) != null && (currentFragment instanceof BasePayFragment)) {
                ((BasePayFragment) currentFragment).invokeSuspend();
            }
        } catch (Exception unused) {
        }
    }

    public static class setMin extends onInvalidation {
        setMin(FragmentManager fragmentManager, List<FtsOptions$Order> list) {
            super(fragmentManager, list);
        }
    }

    public void onDestroy() {
        Flashbar flashbar = this.getMin;
        if (flashbar != null && flashbar.setMax()) {
            FlashbarContainerView flashbarContainerView = this.getMin.getMin;
            if (flashbarContainerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
            }
            flashbarContainerView.dismiss$flashbar_release();
            this.getMin = null;
        }
        this.payQrPresenter.getMax();
        AppLifeCycleObserver appLifeCycleObserver2 = this.appLifeCycleObserver;
        if (appLifeCycleObserver2 != null) {
            try {
                appLifeCycleObserver2.setMax.remove(this);
            } catch (Exception unused) {
            }
        }
        super.onDestroy();
    }

    @OnClick({2131363119})
    public void onClickHelp() {
        DanaH5.startContainerFullUrl("https://a.m.dana.id/resource/htmls/info/pay.html");
    }

    static /* synthetic */ void access$100(PayActivity payActivity, boolean z, boolean z2) {
        NavigationTabView navigationTabView;
        int length;
        int min;
        TabLayout tabLayout2 = payActivity.tabLayout;
        tabLayout2.addTab(tabLayout2.newTab().setCustomView((View) new NavigationTabView((Context) payActivity, (int) R.drawable.ic_pay_scan, payActivity.getString(R.string.pay_scan_title))));
        TabLayout tabLayout3 = payActivity.tabLayout;
        tabLayout3.addTab(tabLayout3.newTab().setCustomView((View) new NavigationTabView((Context) payActivity, (int) R.drawable.ic_pay_close, payActivity.getString(R.string.pay_close_title))));
        TabLayout tabLayout4 = payActivity.tabLayout;
        TabLayout.Tab newTab = tabLayout4.newTab();
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1832491326, oncanceled);
            onCancelLoad.getMin(-1832491326, oncanceled);
        }
        if (z2) {
            navigationTabView = new NavigationTabView(payActivity, R.drawable.ic_add_card_pay_disabled, payActivity.getString(R.string.add_card), -4210753, z2);
        } else {
            navigationTabView = new NavigationTabView((Context) payActivity, (int) R.drawable.ic_add_card_pay, payActivity.getString(R.string.add_card));
        }
        tabLayout4.addTab(newTab.setCustomView((View) navigationTabView));
        payActivity.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            public final void onTabSelected(TabLayout.Tab tab) {
                tab.getCustomView().setSelected(false);
                PayActivity.access$1600(PayActivity.this, tab.getPosition());
            }

            public final void onTabReselected(TabLayout.Tab tab) {
                tab.getCustomView().setSelected(false);
                PayActivity.access$1600(PayActivity.this, tab.getPosition());
            }
        });
        int dimensionPixelSize = payActivity.getResources().getDimensionPixelSize(R.dimen.f32092131165947);
        int dimensionPixelSize2 = payActivity.getResources().getDimensionPixelSize(R.dimen.f32082131165946);
        payActivity.viewPager.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        payActivity.viewPager.setPageMargin(dimensionPixelSize2);
        payActivity.viewPager.setClipToPadding(false);
        if (z) {
            payActivity.viewPager.setOffscreenPageLimit(5);
        }
        payActivity.viewPager.addOnPageChangeListener(new ViewPager.setMax() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (PayActivity.this.equals >= 0) {
                    PayActivity payActivity = PayActivity.this;
                    isInAccessExternalPathWhiteList isinaccessexternalpathwhitelist = (isInAccessExternalPathWhiteList) payActivity.getFragment(payActivity.equals);
                    if (isinaccessexternalpathwhitelist != null) {
                        isinaccessexternalpathwhitelist.toDoubleRange();
                    }
                }
                int unused = PayActivity.this.equals = i;
                isInAccessExternalPathWhiteList isinaccessexternalpathwhitelist2 = (isInAccessExternalPathWhiteList) PayActivity.this.getCurrentFragment();
                if (isinaccessexternalpathwhitelist2 != null) {
                    isinaccessexternalpathwhitelist2.FastBitmap$CoordinateSystem();
                }
            }
        });
        payActivity.equals = payActivity.viewPager.getCurrentItem();
        AppLifeCycleObserver appLifeCycleObserver2 = payActivity.appLifeCycleObserver;
        if (appLifeCycleObserver2 != null) {
            appLifeCycleObserver2.setMax.add(payActivity);
        }
        payActivity.tabLayout.getTabAt(0).getCustomView().setSelected(false);
        payActivity.payQrPresenter.IsOverlapping();
        payActivity.getPaymentResultPresenter.length();
        payActivity.getPaymentResultPresenter.getMax();
        payActivity.queryPayMethodPresenter.setMin();
        payActivity.queryPayMethodPresenter.getMin();
    }

    static /* synthetic */ void access$500(PayActivity payActivity, String str, List list, boolean z) {
        int i;
        if (payActivity.getViewPagerAdapter() != null) {
            IH5TinyPopMenu viewPagerAdapter = payActivity.getViewPagerAdapter();
            if (viewPagerAdapter.setMin != null) {
                viewPagerAdapter.setMin.removeAllViews();
            }
        }
        ArrayList arrayList = new ArrayList();
        if (payActivity.values && !z) {
            arrayList.add(PayScannerFragment.setMin(new getMaxSize(payActivity)));
        }
        if (z) {
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(1026738841, oncanceled);
                onCancelLoad.getMin(1026738841, oncanceled);
            }
            arrayList.add(BalanceGnPayFragment.getMin(str));
        } else if (payActivity.payQrPresenter.isInside()) {
            payActivity.getMax(str, list, arrayList);
        } else {
            setMax(str, list, arrayList);
        }
        if (payActivity.setMax && !z) {
            arrayList.add(AddNewCardFragment.getMin(new AddNewCardFragment.getMin(payActivity) {
                private final PayActivity setMax;

                {
                    this.setMax = r1;
                }

                public final void length() {
                    PayActivity.setMin(this.setMax);
                }
            }));
        }
        setMin setmin = payActivity.toIntRange;
        if (setmin == null) {
            payActivity.toIntRange = new setMin(payActivity.getSupportFragmentManager(), arrayList);
        } else {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            setmin.length = arrayList;
            payActivity.toIntRange.startUpdate((ViewGroup) payActivity.viewPager);
        }
        payActivity.registerViewPager(payActivity.viewPager, payActivity.toIntRange);
        if (payActivity.getIntent().getExtras() != null && (i = payActivity.getIntent().getExtras().getInt(MP_POSITION, 0)) != 0) {
            payActivity.viewPager.setCurrentItem(i, true);
        }
    }

    static /* synthetic */ void access$600(PayActivity payActivity, String str, List list) {
        int length;
        int min;
        if (TextUtils.isEmpty(str) || "BALANCE".equals(str) || list == null || list.isEmpty()) {
            payActivity.setCurrentPosition(payActivity.setMax() ? 1 : 0);
            if (!payActivity.values && payActivity.getCurrentFragment() != null) {
                ((BasePayFragment) payActivity.getCurrentFragment()).FastBitmap$CoordinateSystem();
                return;
            }
            return;
        }
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1702947829, oncanceled);
            onCancelLoad.getMin(1702947829, oncanceled);
        }
        payActivity.setCurrentPosition(payActivity.setMax() ? 2 : 1);
    }

    static /* synthetic */ int access$700(PayActivity payActivity, List list) {
        int length;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1196879668, oncanceled);
            onCancelLoad.getMin(1196879668, oncanceled);
        }
        return size + (payActivity.values ? 2 : 1);
    }

    static /* synthetic */ void access$900(PayActivity payActivity) {
        if (!payActivity.values && payActivity.getCurrentFragment() != null) {
            ((BasePayFragment) payActivity.getCurrentFragment()).FastBitmap$CoordinateSystem();
        }
    }

    static /* synthetic */ void access$1000(PayActivity payActivity, String str) {
        String str2;
        convertDipToPx.length length = new convertDipToPx.length(payActivity.getApplicationContext());
        length.getMax = TrackerKey.Event.PAY_QR_RESULT;
        convertDipToPx.length max = length.setMax("Source", payActivity.getSource());
        int currentPosition = payActivity.getCurrentPosition() - 1;
        String str3 = "";
        if (payActivity.getMin(currentPosition)) {
            str2 = payActivity.FastBitmap$CoordinateSystem.get(currentPosition).FastBitmap$CoordinateSystem;
        } else {
            str2 = str3;
        }
        convertDipToPx.length max2 = max.setMax(TrackerKey.Property.PAY_QR_PAYMENT_METHOD, str2);
        int currentPosition2 = payActivity.getCurrentPosition() - 1;
        if (payActivity.getMin(currentPosition2)) {
            str3 = payActivity.FastBitmap$CoordinateSystem.get(currentPosition2).toFloatRange;
        }
        convertDipToPx.length max3 = max2.setMax(TrackerKey.Property.PAY_QR_CHANNEL_NAME, str3);
        List<PayCardInfo> list = payActivity.FastBitmap$CoordinateSystem;
        convertDipToPx.length max4 = max3.getMax(TrackerKey.Property.PAYMENT_METHOD_COUNT, list == null ? 0 : list.size()).setMax(TrackerKey.Property.QR_PAYMENT_PROCESSING_RESULT, str).setMax();
        max4.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max4, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    static /* synthetic */ void access$1200(PayActivity payActivity, String str) {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(String.format("/m/portal/cashier/result?cashierRequestId=%s", new Object[]{str}));
        DanaH5.startContainerFullUrl(sb.toString(), new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                PayActivity.this.playStoreReviewPresenter.length();
            }
        });
    }

    static /* synthetic */ void access$1400(PayActivity payActivity) {
        FtsOptions$Order currentFragment = payActivity.getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof BasePayFragment)) {
            ((BasePayFragment) currentFragment).invokeSuspend();
        }
    }

    static /* synthetic */ void access$1600(PayActivity payActivity, int i) {
        if (i != 0) {
            if (i == 1) {
                payActivity.finish();
            } else if (i == 2 && payActivity.setMax && payActivity.setMin()) {
                payActivity.setCurrentPosition(payActivity.toIntRange.getCount() - 1);
            }
        } else if (payActivity.setMax()) {
            payActivity.setCurrentPosition(0);
        } else {
            Intent intent = new Intent();
            intent.putExtra(CANCEL_TO_SCAN, true);
            payActivity.setResult(0, intent);
            payActivity.finish();
        }
    }

    public static /* synthetic */ void setMin(PayActivity payActivity) {
        int length;
        int min;
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-48840137, oncanceled);
            onCancelLoad.getMin(-48840137, oncanceled);
        }
        DanaH5.startContainerFullUrl("https://m.dana.id/m/portal/bankcardadd?isClosable=true", new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                if (!PayActivity.this.offlinePresenter.length().booleanValue()) {
                    PayActivity.this.queryPayMethodPresenter.getMin();
                }
            }
        });
    }

    public static /* synthetic */ void setMax(PayActivity payActivity) {
        int length;
        int min;
        Context baseContext = payActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1738211124, oncanceled);
            onCancelLoad.getMin(1738211124, oncanceled);
        }
        payActivity.showWarningDialog(payActivity.getString(R.string.screenshot_warning));
    }

    public static /* synthetic */ void getMax(String str) {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(String.format("/m/portal/transaction?bizOrderId=%s&isClosable=true", new Object[]{str}));
        DanaH5.startContainerFullUrl(sb.toString());
    }
}
