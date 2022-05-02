package id.dana.onboarding.splash;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.airbnb.lottie.LottieAnimationView;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.common.base.Ascii;
import com.iap.ac.config.lite.ConfigCenter;
import dagger.Lazy;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.appshortcut.DanaAppShortcut;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.ChallengeScenario;
import id.dana.constants.AnalyticEventConstant;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.login.HoldLoginModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.LoginTrackingConstants;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.MixpanelEnableModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.SplashModule;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.googleplay.updates.DanaUpdateManager;
import id.dana.home.HomeTabActivity;
import id.dana.model.ThirdPartyService;
import id.dana.oauth.MatchPhoneNumberDialog;
import id.dana.oauth.OauthConstant;
import id.dana.onboarding.IntroductionActivity;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.splash.SplashActivity;
import id.dana.onboarding.unsafe.UnsafeDeviceActivity;
import id.dana.scanner.handler.ScannerViewType;
import id.dana.tracker.TrackerKey;
import id.dana.utils.JNIKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ArcMotion;
import o.AutoMigration;
import o.AutoTransition;
import o.ConfirmPopup;
import o.CornerMarkingDataProvider;
import o.CustomPopMenuExtension;
import o.H5TinyPopMenu;
import o.ListPopupWindow;
import o.PrepareException;
import o.ScreenBrightnessBridgeExtension;
import o.SerializableMap;
import o.StackBlurManager;
import o.SwipeRefreshLayout;
import o.TitleBarRightButtonView;
import o.WifiInfoExtension;
import o.WifiManagerBridgeExtension;
import o.WindowBridgeExtension;
import o.click;
import o.connectWifi;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getChildrenSkipCount;
import o.getConnectedWifi;
import o.getMap;
import o.getOrientation;
import o.getPerformanceTracker;
import o.getSSID;
import o.getSecureSignatureComp;
import o.getSelectedItem;
import o.getWifiInfo;
import o.getWifiList;
import o.hideProgress;
import o.inTransaction;
import o.interceptBefore;
import o.isAlipayApp;
import o.isBaselineAligned;
import o.onActivityPreDestroyed;
import o.onCancelLoad;
import o.onCanceled;
import o.onSwitchToWhiteTheme;
import o.readAll;
import o.registerDataSetObserver;
import o.registerOnLoadCanceledListener;
import o.remover;
import o.setContentViewAfter;
import o.setHorizontalGravity;
import o.setMap;
import o.setScreenAutolock;
import o.setStateOn;
import o.setVerticalGravity;
import o.showSoftInput;
import o.startWifi;
import o.stopIgnoring;
import o.stopMonitorMemoryWarning;
import o.stopWifi;
import o.style;
import o.updateActionSheetContent;
import o.updateFavoriteMenuItem;
import o.vibrate;
import o.vibrateShort;
import org.jetbrains.annotations.NotNull;

public class SplashActivity extends BaseActivity implements setMap.length {
    public static final byte[] getMin = {65, 70, 79, -115, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 242;
    private boolean FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public setStateOn IsOverlapping;
    private boolean Mean$Arithmetic;
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    private readAll equals;
    private ChallengeControl getMax;
    private boolean hashCode;
    @Inject
    public Lazy<registerDataSetObserver.setMax> holdLoginPresenter;
    private MatchPhoneNumberDialog invoke;
    private boolean invokeSuspend;
    /* access modifiers changed from: private */
    public boolean isInside;
    @BindView(2131363643)
    ImageView ivSplash;
    @BindView(2131363723)
    LottieAnimationView lavSplash;
    @Inject
    public isAlipayApp locationPermissionSubject;
    @Inject
    public Lazy<inTransaction.getMax> logoutPresenter;
    @Inject
    public Lazy<stopMonitorMemoryWarning.getMin> mixpanelEnablePresenter;
    private DanaUpdateManager onNavigationEvent;
    @Inject
    public Lazy<AutoTransition.length> sessionDeepLinkPresenter;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    @Inject
    public Lazy<setMap.getMax> splashPresenter;
    private TwoButtonWithImageDialog toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    private isBaselineAligned toIntRange;
    private boolean toString;
    private boolean valueOf;
    private deleteAppInfoById values;
    @BindView(2131365757)
    TextView versionName;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 175
            int r6 = 179 - r6
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r0 = getMin
            int r8 = r8 * 45
            int r8 = 101 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r7
            r7 = r6
            goto L_0x0035
        L_0x001b:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0020:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002b:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0035:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + -2
            int r7 = r7 + 1
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.onboarding.splash.SplashActivity.getMax(short, short, int):java.lang.String");
    }

    public static /* synthetic */ void length() {
    }

    public void configToolbar() {
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_splash;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(1556267874, oncanceled);
        onCancelLoad.getMin(1556267874, oncanceled);
        return R.layout.activity_splash;
    }

    static /* synthetic */ void access$100(SplashActivity splashActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(298243755, oncanceled);
            onCancelLoad.getMin(298243755, oncanceled);
        }
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        SwipeRefreshLayout.length(splashActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_toast_payment_auth, splashActivity.getString(R.string.error_updating_app_toast));
    }

    static /* synthetic */ void access$1600(SplashActivity splashActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(722526767, oncanceled);
            onCancelLoad.getMin(722526767, oncanceled);
        }
        if (splashActivity.toDoubleRange == null) {
            TwoButtonWithImageDialog.setMax max2 = new TwoButtonWithImageDialog.setMax(splashActivity).setMax(false).getMax(false);
            max2.equals = R.drawable.ic_phone_number_already_registered;
            max2.setMin = splashActivity.getString(R.string.prompt_title_dana_id_is_different);
            max2.length = splashActivity.getString(R.string.prompt_desc_suggest_to_logout);
            String string = splashActivity.getString(R.string.option_cancel);
            WifiInfoExtension wifiInfoExtension = new WifiInfoExtension(splashActivity);
            max2.FastBitmap$CoordinateSystem = string;
            max2.hashCode = wifiInfoExtension;
            String string2 = splashActivity.getString(R.string.logout);
            getWifiInfo getwifiinfo = new getWifiInfo(splashActivity);
            max2.values = string2;
            max2.toString = getwifiinfo;
            splashActivity.toDoubleRange = max2.getMin();
        }
        splashActivity.toDoubleRange.setMin();
    }

    static /* synthetic */ void access$900(SplashActivity splashActivity) {
        int length;
        Context baseContext = splashActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1076505434, oncanceled);
            onCancelLoad.getMin(1076505434, oncanceled);
        }
        deleteAppInfoById deleteappinfobyid = new deleteAppInfoById(splashActivity);
        splashActivity.values = deleteappinfobyid;
        if (!deleteappinfobyid.length.isShowing()) {
            try {
                deleteappinfobyid.length.show();
            } catch (Exception unused) {
            }
        }
    }

    public static void raspCallback(onActivityPreDestroyed onactivitypredestroyed) {
        onactivitypredestroyed.length();
    }

    public void onCertificatePinned() {
        this.splashPresenter.get().toFloatRange();
    }

    public void onAccountChecking(boolean z) {
        if (z) {
            this.splashPresenter.get().getMax();
        } else {
            addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).subscribe(new vibrate(this)));
        }
    }

    public void onCheckActiveTime(boolean z) {
        if (z) {
            this.splashPresenter.get().IsOverlapping();
        } else {
            this.splashPresenter.get().length();
            this.splashPresenter.get().equals();
        }
        this.splashPresenter.get().isInside();
    }

    public void onOptionalAppUpdate() {
        DanaUpdateManager danaUpdateManager = this.onNavigationEvent;
        if (danaUpdateManager != null) {
            danaUpdateManager.getMin(false, (DanaUpdateManager.setMin) new DanaUpdateManager.setMin() {
                public final void getMax() {
                    SplashActivity.this.onNonUpdate();
                }

                public final void length() {
                    SplashActivity.access$000(SplashActivity.this);
                }

                public final void setMax() {
                    SplashActivity.access$100(SplashActivity.this);
                    SplashActivity.access$200(SplashActivity.this);
                }

                public final void setMin() {
                    SplashActivity.access$200(SplashActivity.this);
                }
            });
        }
    }

    public void onForcedAppUpdate() {
        DanaUpdateManager danaUpdateManager = this.onNavigationEvent;
        if (danaUpdateManager != null) {
            danaUpdateManager.getMin(true, (DanaUpdateManager.setMin) new DanaUpdateManager.setMin() {
                @JvmDefault
                public final void getMax() {
                }

                public final void length() {
                    SplashActivity.this.splashPresenter.get().getMin("Force", TrackerKey.AppUpdateAction.APP_UPDATE_INSTALL);
                    if (Build.VERSION.SDK_INT < 21) {
                        SplashActivity.this.finishAffinity();
                    }
                }

                public final void setMax() {
                    SplashActivity.access$100(SplashActivity.this);
                }

                public final void setMin() {
                    SplashActivity.this.finishAffinity();
                }
            });
        }
    }

    public void onNonUpdate() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1306822074, oncanceled);
            onCancelLoad.getMin(-1306822074, oncanceled);
        }
        this.splashPresenter.get().FastBitmap$CoordinateSystem();
    }

    public void onLoginNotify(boolean z) {
        String str;
        if (z) {
            if (!this.toFloatRange || !this.isInside) {
                StackBlurManager.getMin();
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.HoldLogin.SUCCESS_TO_HOME, "");
                IsOverlapping();
                return;
            }
            this.sessionDeepLinkPresenter.get().setMin(true);
        } else if (!this.toFloatRange || (str = this.Grayscale$Algorithm) == null) {
            equals();
        } else {
            OnboardingActivity.openToResetPin(this, str);
            this.Grayscale$Algorithm = null;
        }
    }

    public void onStorageUpdateChecked(boolean z) {
        this.splashPresenter.get().setMin(z, getApplicationContext());
    }

    public void onCheckDoHoldLogin(boolean z) {
        updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.HoldLogin.BEGIN, "");
        if (z) {
            this.holdLoginPresenter.get().length();
        } else {
            this.splashPresenter.get().getMin();
        }
    }

    public void onCheckAppFirstLaunch(boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 603226600 == (max = dispatchOnCancelled.getMax(applicationContext, 603226600)))) {
            onCanceled oncanceled = new onCanceled(603226600, max, 512);
            onCancelLoad.setMax(603226600, oncanceled);
            onCancelLoad.getMin(603226600, oncanceled);
        }
        boolean z2 = false;
        boolean z3 = z || updateFavoriteMenuItem.getMin();
        if (getIntent().getData() != null || z3) {
            z2 = true;
        }
        if (z2) {
            this.toFloatRange = true;
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.b();
            this.sessionDeepLinkPresenter.get().getMin(this);
            return;
        }
        toFloatRange();
    }

    public void onCheckUnsafeDevice(boolean z) {
        if (z || !setMax()) {
            getMin();
            return;
        }
        getSelectedItem getselecteditem = new getSelectedItem(getApplicationContext());
        if (this.FastBitmap$CoordinateSystem && getselecteditem.getMax()) {
            FastBitmap$CoordinateSystem();
            setMin();
            convertDipToPx.length length = new convertDipToPx.length(this);
            length.getMax = TrackerKey.Event.UNSAFE_IDENTIFIED_DEVICE;
            length.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(length, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            getMax(UnsafeDeviceActivity.UnsafeStatus.ROOTED.getStatus());
        } else if ((!this.toString || !getSelectedItem.getMin()) && (!this.hashCode || !getselecteditem.length())) {
            getMin();
        } else {
            FastBitmap$CoordinateSystem();
            setMin();
            convertDipToPx.length length3 = new convertDipToPx.length(this);
            length3.getMax = TrackerKey.Event.UNSAFE_IDENTIFIED_DEVICE;
            length3.setMin();
            genTextSelector.getMax(new convertDipToPx(length3, (byte) 0));
            getMax(UnsafeDeviceActivity.UnsafeStatus.TAMPERED.getStatus());
        }
    }

    public void onCheckDexguardIntegrityCheckEnabled(boolean z, boolean z2, boolean z3) {
        this.FastBitmap$CoordinateSystem = z;
        this.toString = z2;
        this.hashCode = z3;
        this.splashPresenter.get().values();
    }

    public void onMatchPhoneNumberFailed() {
        toFloatRange();
    }

    public void onGetMurotalConfig(Boolean bool) {
        ((DanaApplication) getApplicationContext()).setHomeRevamp(bool);
    }

    private void getMin() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-931722669, oncanceled);
            onCancelLoad.getMin(-931722669, oncanceled);
        }
        this.splashPresenter.get().toDoubleRange();
    }

    private boolean setMax() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(970009710, oncanceled);
            onCancelLoad.getMin(970009710, oncanceled);
        }
        return this.FastBitmap$CoordinateSystem || this.toString;
    }

    private void getMin(String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(392551495, oncanceled);
            onCancelLoad.getMin(392551495, oncanceled);
        }
        this.splashPresenter.get().getMin(TrackerKey.AppUpdateType.APP_UPDATE_OPTIONAL, str);
    }

    private void setMin() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-271655057, oncanceled);
            onCancelLoad.getMin(-271655057, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = AnalyticEventConstant.AE_UNSAFE_DEVICE;
        convertDipToPx.length max = length2.setMax("UTDID", this.deviceInformationProvider.getDeviceUtdId());
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    private void getMax(String str) {
        Intent intent = new Intent(this, UnsafeDeviceActivity.class);
        intent.putExtra(UnsafeDeviceActivity.UNSAFE_STATUS, str);
        intent.putExtra("egg_message", getMax());
        startActivity(intent);
    }

    private String getMax() {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            ConfigCenter instance = ConfigCenter.getInstance();
            if (instance.isInitialized()) {
                String configUserId = instance.getConfigContext().getIdentifierProvider().getConfigUserId(this);
                sb.append("reference-utdid: ");
                ConfigCenter instance2 = ConfigCenter.getInstance();
                if (instance2.isInitialized()) {
                    str = instance2.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax());
                } else {
                    str = "";
                }
                String md5 = MiscUtils.md5(str);
                if (md5.length() >= 16) {
                    str2 = md5.substring(0, 16).toUpperCase();
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append("\nlocal-reference-utdid: ");
                sb.append(this.deviceInformationProvider.getReferenceUtdId());
                sb.append("\nreference-uid: ");
                sb.append(configUserId);
                sb.append("\n");
            } else {
                sb.append("AMCS ConfigSdk not initialized!\n");
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public void toFloatRange() {
        if (CornerMarkingDataProvider.setMax()) {
            this.splashPresenter.get().toIntRange();
        } else {
            this.splashPresenter.get().toFloatRange();
        }
    }

    /* access modifiers changed from: private */
    public void IsOverlapping() {
        if (this.Mean$Arithmetic) {
            this.lavSplash.addAnimatorListener(new Animator.AnimatorListener() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    SplashActivity.this.isInside();
                }

                public final void onAnimationCancel(Animator animator) {
                    SplashActivity.this.isInside();
                }

                public final void onAnimationRepeat(Animator animator) {
                    SplashActivity.this.isInside();
                }
            });
            this.ivSplash.setVisibility(8);
            this.lavSplash.setVisibility(0);
            this.lavSplash.playAnimation();
            return;
        }
        isInside();
    }

    /* access modifiers changed from: private */
    public void isInside() {
        AutoMigration.setMin(getApplication());
        Intent intent = new Intent(this, HomeTabActivity.class);
        intent.setData(getIntent().getData());
        intent.addFlags(1);
        intent.addFlags(67108864);
        if (updateFavoriteMenuItem.getMin()) {
            intent.putExtra("android.nfc.extra.TAG", getIntent());
        }
        Bundle extras = getIntent().getExtras();
        if (DanaAppShortcut.setMax(extras)) {
            DanaAppShortcut.getMax(intent, extras);
        }
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public void equals() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1372819800, oncanceled);
            onCancelLoad.getMin(1372819800, oncanceled);
        }
        if (this.Mean$Arithmetic) {
            this.lavSplash.addAnimatorListener(new Animator.AnimatorListener() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    SplashActivity.this.toIntRange();
                }

                public final void onAnimationCancel(Animator animator) {
                    SplashActivity.this.toIntRange();
                }

                public final void onAnimationRepeat(Animator animator) {
                    SplashActivity.this.toIntRange();
                }
            });
            this.ivSplash.setVisibility(8);
            this.lavSplash.setVisibility(0);
            this.lavSplash.playAnimation();
            return;
        }
        toIntRange();
    }

    /* access modifiers changed from: private */
    public void toIntRange() {
        Intent intent = new Intent(this, IntroductionActivity.class);
        intent.setData(getIntent().getData());
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ChallengeControl challengeControl = this.getMax;
        if (challengeControl == null || !challengeControl.setMax(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
        DanaUpdateManager danaUpdateManager = this.onNavigationEvent;
        if (danaUpdateManager != null) {
            danaUpdateManager.getMin(i, i2);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-343728232, oncanceled);
            onCancelLoad.getMin(-343728232, oncanceled);
        }
        if (!this.IsOverlapping.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(2058503938, oncanceled);
            onCancelLoad.getMin(2058503938, oncanceled);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            StackBlurManager.isInside();
            StackBlurManager.length();
        }
    }

    public void finish() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1951515256, oncanceled);
            onCancelLoad.getMin(-1951515256, oncanceled);
        }
        FastBitmap$CoordinateSystem();
        super.finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = getMin;
        byte b = (byte) bArr[96];
        String max = getMax(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = getMin;
        byte b2 = (byte) bArr2[8];
        String max2 = getMax(b2, (byte) b2, (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-2050075008, oncanceled);
            onCancelLoad.getMin(-2050075008, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-2050075008, oncanceled2);
            onCancelLoad.getMin(-2050075008, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-2050075008, oncanceled3);
            onCancelLoad.getMin(-2050075008, oncanceled3);
        }
        this.lazyInit = true;
        super.onCreate(bundle);
    }

    public void init() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1130983403, oncanceled);
            onCancelLoad.getMin(-1130983403, oncanceled);
        }
        if (this.equals == null) {
            interceptBefore.setMax setmax = new interceptBefore.setMax((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                setmax.hashCode = applicationComponent;
                setmax.setMin = new SplashModule(this);
                setmax.IsOverlapping = new MixpanelEnableModule();
                setmax.length = new HoldLoginModule(new registerDataSetObserver.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void showProgress() {
                    }

                    public final void getMin() {
                        SplashActivity.this.addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).subscribe(new getMap(this)));
                    }

                    public final void getMax() {
                        CustomPopMenuExtension customPopMenuExtension = SplashActivity.this.sessionExpiredManager;
                        SplashActivity splashActivity = SplashActivity.this;
                        customPopMenuExtension.setMax = splashActivity;
                        customPopMenuExtension.length = new deleteAppInfoById(customPopMenuExtension.setMax);
                        splashActivity.showWarningDialog(splashActivity.getString(R.string.session_expired_desc), (DialogInterface.OnDismissListener) new onSwitchToWhiteTheme(customPopMenuExtension), false);
                    }

                    public final void onError(String str) {
                        SplashActivity.this.splashPresenter.get().IsOverlapping();
                    }
                });
                setmax.isInside = new ServicesModule((style.getMin) new style.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                        Intrinsics.checkNotNullParameter(str, "authCode");
                    }

                    @JvmDefault
                    public final void getMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void getMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void length() {
                    }

                    @JvmDefault
                    public final void onError(@org.jetbrains.annotations.Nullable String str) {
                    }

                    @JvmDefault
                    public final void setMax(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void setMax(boolean z) {
                    }

                    @JvmDefault
                    public final void setMin() {
                    }

                    @JvmDefault
                    public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                        Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    }

                    @JvmDefault
                    public final void setMin(@NotNull List<ThirdPartyService> list) {
                        Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
                max2.setMin = new ArcMotion() {
                    public final void getMin(showSoftInput showsoftinput) {
                        SplashActivity splashActivity = SplashActivity.this;
                        String unused = splashActivity.Grayscale$Algorithm = splashActivity.setMin(showsoftinput.isInside);
                        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
                        ScreenBrightnessBridgeExtension.getMin(showsoftinput.toString);
                        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                        if (ScreenBrightnessBridgeExtension.length()) {
                            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
                            SplashActivity.this.splashPresenter.get().setMin(ScreenBrightnessBridgeExtension.invoke());
                        } else {
                            SplashActivity.this.toFloatRange();
                        }
                        boolean unused2 = SplashActivity.this.isInside = showsoftinput.setMin();
                    }

                    public final void setMax() {
                        SplashActivity.this.finishAffinity();
                    }

                    public final void length(String str) {
                        if (BranchLinkConstant.DeepLinkErrorCodeView.PHONE_NUMBER_NOT_EQUALS.equals(str)) {
                            SplashActivity.access$1600(SplashActivity.this);
                            return;
                        }
                        boolean unused = SplashActivity.this.toFloatRange = false;
                        SplashActivity.this.toFloatRange();
                    }
                };
                setmax.getMax = new DeepLinkModule(max2, (byte) 0);
                ScanQrModule.setMin max3 = ScanQrModule.getMax();
                max3.setMin = this;
                max3.length = ScannerViewType.FRAGMENT;
                setmax.setMax = new ScanQrModule(max3, (byte) 0);
                setmax.getMin = new RestoreUrlModule(RestoreUrlModule.setMin(), (byte) 0);
                FeatureModule.length length = FeatureModule.length();
                length.setMax = this;
                setmax.toIntRange = new FeatureModule(length, (byte) 0);
                setmax.toFloatRange = new LogoutModule(new inTransaction.getMin() {
                    public final void dismissProgress() {
                    }

                    public final void onError(String str) {
                    }

                    public final void showProgress() {
                    }

                    public final void setMax() {
                        SplashActivity.access$900(SplashActivity.this);
                    }

                    public final void getMin() {
                        SplashActivity.access$1000(SplashActivity.this);
                    }

                    public final void getMax() {
                        SplashActivity.this.splashPresenter.get().Grayscale$Algorithm();
                        SplashActivity.access$1100(SplashActivity.this);
                    }
                });
                new FaceAuthPopUpConsultationModule(new remover.setMax() {
                    public final void dismissProgress() {
                    }

                    public final void length(boolean z) {
                    }

                    public final void onError(@org.jetbrains.annotations.Nullable String str) {
                    }

                    public final void showProgress() {
                    }
                });
                OauthModule.getMax min = OauthModule.setMin();
                min.setMin = this;
                setmax.equals = new OauthModule(min, (byte) 0);
                stopIgnoring.setMin(setmax.setMin, SplashModule.class);
                stopIgnoring.setMin(setmax.length, HoldLoginModule.class);
                stopIgnoring.setMin(setmax.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(setmax.setMax, ScanQrModule.class);
                stopIgnoring.setMin(setmax.getMin, RestoreUrlModule.class);
                stopIgnoring.setMin(setmax.toIntRange, FeatureModule.class);
                stopIgnoring.setMin(setmax.equals, OauthModule.class);
                if (setmax.isInside == null) {
                    setmax.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(setmax.toFloatRange, LogoutModule.class);
                if (setmax.IsOverlapping == null) {
                    setmax.IsOverlapping = new MixpanelEnableModule();
                }
                stopIgnoring.setMin(setmax.hashCode, PrepareException.AnonymousClass1.class);
                this.equals = new interceptBefore(setmax.setMin, setmax.length, setmax.getMax, setmax.setMax, setmax.getMin, setmax.toIntRange, setmax.equals, setmax.isInside, setmax.toFloatRange, setmax.IsOverlapping, setmax.hashCode, (byte) 0);
            } else {
                throw null;
            }
        }
        initAsync(new getConnectedWifi(this), new getWifiList(this));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: private */
    @Nullable
    public String setMin(Map<String, String> map) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2041187231 == (max = dispatchOnCancelled.getMax(applicationContext, -2041187231)))) {
            onCanceled oncanceled = new onCanceled(-2041187231, max, 512);
            onCancelLoad.setMax(-2041187231, oncanceled);
            onCancelLoad.getMin(-2041187231, oncanceled);
        }
        String str = map.get(BranchLinkConstant.Params.LOGIN_ID);
        String severity1 = JNIKey.severity1();
        if (!TextUtils.isEmpty(str) && severity1 != null) {
            try {
                return CornerMarkingDataProvider.AnonymousClass1.setMin(str, severity1);
            } catch (IllegalArgumentException e) {
                updateActionSheetContent.e(SplashActivity.class.getSimpleName(), "Bad Base64 format, possibly the format isn't safe for url", e);
            }
        }
        return null;
    }

    public void showProgress() {
        MatchPhoneNumberDialog matchPhoneNumberDialog = this.invoke;
        if (matchPhoneNumberDialog != null) {
            matchPhoneNumberDialog.lpvLoading.setVisibility(0);
            matchPhoneNumberDialog.lpvLoading.startRefresh();
            matchPhoneNumberDialog.btnLogin.setVisibility(8);
        }
    }

    public void dismissProgress() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 953343672 == (max = dispatchOnCancelled.getMax(applicationContext, 953343672)))) {
            onCanceled oncanceled = new onCanceled(953343672, max, 512);
            onCancelLoad.setMax(953343672, oncanceled);
            onCancelLoad.getMin(953343672, oncanceled);
        }
        MatchPhoneNumberDialog matchPhoneNumberDialog = this.invoke;
        if (matchPhoneNumberDialog != null) {
            matchPhoneNumberDialog.lpvLoading.setVisibility(8);
            matchPhoneNumberDialog.lpvLoading.stopRefresh();
            matchPhoneNumberDialog.btnLogin.setVisibility(0);
        }
    }

    public void onError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.general_error_msg);
        }
        Toast.makeText(this, str, 0).show();
    }

    private String values() {
        try {
            return (String) getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.get("deeplink_scheme");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private void FastBitmap$CoordinateSystem() {
        Lazy<stopMonitorMemoryWarning.getMin> lazy;
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-887921009, oncanceled);
            onCancelLoad.getMin(-887921009, oncanceled);
        }
        if (!this.invokeSuspend && (lazy = this.mixpanelEnablePresenter) != null && lazy.get() != null) {
            this.mixpanelEnablePresenter.get().length();
            this.invokeSuspend = true;
        }
    }

    public void onGetPhoneNumber(String str) {
        StackBlurManager.getMax();
        StackBlurManager.setMin(PerformanceConstant.SPLASH_TO_CHALLENGE_START_TIME);
        isBaselineAligned isbaselinealigned = this.toIntRange;
        if (isbaselinealigned != null && isbaselinealigned.isShowing()) {
            this.toIntRange.dismiss();
        }
        ChallengeControl.length length = new ChallengeControl.length((BaseActivity) this);
        length.getMin = ChallengeScenario.RELOGIN;
        ChallengeControl.length min = length.setMin(str);
        min.toString = new ChallengeControl.getMin() {
            public final void getMax() {
                SplashActivity.this.IsOverlapping();
            }

            public final void getMin(String str, String str2, Bundle bundle) {
                if ("forgot_pin".equals(str2)) {
                    SplashActivity.this.IsOverlapping.setMin();
                } else if (bundle == null || bundle.getString("message") == null) {
                    SplashActivity.access$500(SplashActivity.this);
                } else {
                    SplashActivity.this.showWarningDialog(bundle.getString("message"), new SerializableMap(this));
                }
            }
        };
        ChallengeControl challengeControl = new ChallengeControl(min, (byte) 0);
        this.getMax = challengeControl;
        challengeControl.getMin();
    }

    public void onMatchPhoneNumberSuccess(boolean z) {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-2095805411, oncanceled);
            onCancelLoad.getMin(-2095805411, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2095805411, oncanceled2);
            onCancelLoad.getMin(-2095805411, oncanceled2);
        }
        if (!z) {
            MatchPhoneNumberDialog.getMin getmin = new MatchPhoneNumberDialog.getMin(this, new vibrateShort(this));
            getmin.getMin = new getSSID(this);
            getmin.setMin = new startWifi(this);
            MatchPhoneNumberDialog matchPhoneNumberDialog = new MatchPhoneNumberDialog(getmin.getMax, getmin.setMax, getmin, (byte) 0);
            this.invoke = matchPhoneNumberDialog;
            matchPhoneNumberDialog.setMin();
            return;
        }
        toFloatRange();
    }

    public void onFinishLogout() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(537962857, oncanceled);
            onCancelLoad.getMin(537962857, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(537962857, oncanceled2);
            onCancelLoad.getMin(537962857, oncanceled2);
        }
        updateFavoriteMenuItem.getMin((Activity) null);
        AutoMigration.setMax(getApplication());
        Intent intent = new Intent(this, OnboardingActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    public void onGetSplashAnimationConfig(boolean z, String str) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1059737607, oncanceled);
            onCancelLoad.getMin(1059737607, oncanceled);
        }
        if (z) {
            ListPopupWindow<setVerticalGravity> min = getOrientation.setMin(getBaseContext(), str);
            min.length(new stopWifi(this));
            min.getMax((setHorizontalGravity<Throwable>) connectWifi.getMax);
        }
    }

    public void onDestroy() {
        int length;
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1546396594, oncanceled);
            onCancelLoad.getMin(-1546396594, oncanceled);
        }
        deleteAppInfoById deleteappinfobyid = this.values;
        if (deleteappinfobyid != null && deleteappinfobyid.setMin()) {
            this.values.getMin();
        }
        this.values = null;
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1805507584, oncanceled2);
            onCancelLoad.getMin(-1805507584, oncanceled2);
        }
        TwoButtonWithImageDialog twoButtonWithImageDialog = this.toDoubleRange;
        if (twoButtonWithImageDialog != null && twoButtonWithImageDialog.getMin()) {
            this.toDoubleRange.setMax();
        }
        this.toDoubleRange = null;
        super.onDestroy();
    }

    static /* synthetic */ void access$000(SplashActivity splashActivity) {
        splashActivity.splashPresenter.get().FastBitmap$CoordinateSystem();
        splashActivity.getMin(TrackerKey.AppUpdateAction.APP_UPDATE_INSTALL);
    }

    static /* synthetic */ void access$200(SplashActivity splashActivity) {
        splashActivity.splashPresenter.get().FastBitmap$CoordinateSystem();
        splashActivity.getMin(TrackerKey.AppUpdateAction.APP_UPDATE_LATER);
    }

    static /* synthetic */ void access$500(SplashActivity splashActivity) {
        isBaselineAligned negativeButton = new isBaselineAligned(splashActivity, isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelOnTouchOutside(false).message(Integer.valueOf(R.string.logout_message), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton(Integer.valueOf(R.string.option_yes), (CharSequence) null, new WifiManagerBridgeExtension(splashActivity)).negativeButton(Integer.valueOf(R.string.option_no), (CharSequence) null, new Function1(splashActivity) {
            private final SplashActivity length;

            {
                this.length = r1;
            }

            public final Object invoke(Object obj) {
                return this.length.finishAffinity();
            }
        });
        splashActivity.toIntRange = negativeButton;
        negativeButton.show();
    }

    static /* synthetic */ void access$1000(SplashActivity splashActivity) {
        deleteAppInfoById deleteappinfobyid = splashActivity.values;
        if (deleteappinfobyid != null && deleteappinfobyid.setMin()) {
            splashActivity.values.getMin();
        }
        splashActivity.values = null;
    }

    static /* synthetic */ void access$1100(SplashActivity splashActivity) {
        OnboardingActivity.open(splashActivity);
        splashActivity.Grayscale$Algorithm = null;
    }

    public static /* synthetic */ void setMin(SplashActivity splashActivity) {
        int length;
        int min;
        int max;
        Context baseContext = splashActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1024211635 == (max = dispatchOnCancelled.getMax(applicationContext, 1024211635)))) {
            onCanceled oncanceled = new onCanceled(1024211635, max, 512);
            onCancelLoad.setMax(1024211635, oncanceled);
            onCancelLoad.getMin(1024211635, oncanceled);
        }
        Context baseContext2 = splashActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1024211635, oncanceled2);
            onCancelLoad.getMin(1024211635, oncanceled2);
        }
        splashActivity.equals.length(splashActivity);
    }

    public static /* synthetic */ void getMin(SplashActivity splashActivity) {
        splashActivity.toDoubleRange.setMax();
        splashActivity.splashPresenter.get().Grayscale$Algorithm();
        splashActivity.IsOverlapping();
    }

    public static /* synthetic */ void length(SplashActivity splashActivity, setVerticalGravity setverticalgravity) {
        int length;
        int min;
        Context baseContext = splashActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1773223556, oncanceled);
            onCancelLoad.getMin(1773223556, oncanceled);
        }
        LottieAnimationView lottieAnimationView = splashActivity.lavSplash;
        if (lottieAnimationView != null) {
            lottieAnimationView.setComposition(setverticalgravity);
        }
        splashActivity.Mean$Arithmetic = true;
    }

    public static /* synthetic */ void getMax(SplashActivity splashActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(865101349, oncanceled);
            onCancelLoad.getMin(865101349, oncanceled);
        }
        splashActivity.registerPresenter(splashActivity.splashPresenter.get(), splashActivity.holdLoginPresenter.get(), splashActivity.sessionDeepLinkPresenter.get(), splashActivity.logoutPresenter.get(), splashActivity.mixpanelEnablePresenter.get());
        StackBlurManager.equals();
        Intent intent = splashActivity.getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if ("android.intent.action.SEND".equals(action) && type != null && type.startsWith("image/")) {
            Bitmap length = setContentViewAfter.length((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), splashActivity);
            if (length != null) {
                ConfirmPopup.AnonymousClass2.getMin(length, splashActivity);
            }
            splashActivity.valueOf = true;
        }
        boolean z = splashActivity.getIntent().getData() != null;
        if (UserInfoManager.instance().getUserInfo() == null) {
            splashActivity.splashPresenter.get().valueOf();
        }
        Intent intent2 = splashActivity.getIntent();
        if (intent2 != null && "com.google.android.payments.standard.AUTHENTICATE_V1".equals(intent2.getAction())) {
            z = true;
        }
        if (!z && !splashActivity.isTaskRoot() && !splashActivity.valueOf) {
            splashActivity.finish();
        }
        if (!CornerMarkingDataProvider.IsOverlapping() || setStateOn.getMin(splashActivity, "android.permission.ACCESS_FINE_LOCATION")) {
            splashActivity.locationPermissionSubject.setMin(true);
        }
        updateFavoriteMenuItem.getMin(splashActivity);
        splashActivity.splashPresenter.get().setMin();
        splashActivity.splashPresenter.get().invoke();
        splashActivity.onNavigationEvent = new DanaUpdateManager(splashActivity);
        splashActivity.splashPresenter.get().invokeSuspend();
        splashActivity.versionName.setText(H5TinyPopMenu.TitleBarTheme.length(splashActivity, true));
        AppsFlyerLib.getInstance().sendDeepLinkData(splashActivity);
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) splashActivity);
        getmin.length.add("android.permission.CALL_PHONE");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                click.getMin(SplashActivity.this, "1500445", setmin.setMax());
            }
        };
        splashActivity.IsOverlapping = new setStateOn(getmin, (byte) 0);
        splashActivity.splashPresenter.get().getCause();
    }

    public static /* synthetic */ void toIntRange(SplashActivity splashActivity) {
        splashActivity.toDoubleRange.setMax();
        splashActivity.logoutPresenter.get().length();
    }

    public static /* synthetic */ void equals(SplashActivity splashActivity) {
        String str;
        if (!splashActivity.toFloatRange || (str = splashActivity.Grayscale$Algorithm) == null) {
            StackBlurManager.setMax();
            splashActivity.equals();
            return;
        }
        OnboardingActivity.openToResetPin(splashActivity, str);
        splashActivity.Grayscale$Algorithm = null;
    }

    public static /* synthetic */ void IsOverlapping(SplashActivity splashActivity) {
        int length;
        int min;
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.setMax() != null) {
            setScreenAutolock setscreenautolock = new setScreenAutolock(splashActivity.values());
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            String min2 = setscreenautolock.setMin(ScreenBrightnessBridgeExtension.setMax(), OauthConstant.LocalErrorCode.ACCESS_CANCEL, splashActivity.getString(R.string.cancel_message));
            Context baseContext = splashActivity.getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(181863561, oncanceled);
                onCancelLoad.getMin(181863561, oncanceled);
            }
            splashActivity.FastBitmap$CoordinateSystem();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(min2));
            if (intent.resolveActivity(splashActivity.getPackageManager()) != null) {
                splashActivity.startActivity(intent);
                splashActivity.finishAffinity();
                return;
            }
            splashActivity.showWarningDialog(splashActivity.getString(R.string.redirect_not_found));
        }
    }
}
