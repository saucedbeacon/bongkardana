package id.dana.onboarding.verify;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseKey;
import id.dana.base.KeyBaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.ChallengeScenario;
import id.dana.contract.permission.PermissionStateModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.VerifyNumberModule;
import id.dana.dialog.DialogPermission;
import id.dana.dialog.DialogWithImage;
import id.dana.dialog.LoginInfoDialog;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.domain.otp.model.OtpChannel;
import id.dana.domain.registration.CheckUserAction;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.oauth.activity.BlockRegistrationActivity;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.boku.BokuVerifyActivity;
import id.dana.onboarding.referral.VerifyReferralCodeKey;
import id.dana.richview.InputPhoneView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.rds.RDSConstant;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.webview.WebViewActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.BlurProcess;
import o.CompassSensorService;
import o.CornerMarkingDataProvider;
import o.FtsOptions$Order;
import o.Helper;
import o.MultiInstanceInvalidationClient$1;
import o.MultiInstanceInvalidationService;
import o.OrientationBridgeExtension;
import o.PrepareException;
import o.ScreenBrightnessBridgeExtension;
import o.SensorBridgeExtension;
import o.ViewPager2;
import o.WheelView;
import o.checkApFlag;
import o.click;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getShortName;
import o.getStartDelay;
import o.inputFocus4Android;
import o.isAlipayApp;
import o.isOriginHasAppInfo;
import o.isShowMenu;
import o.onDelete;
import o.resetInternal;
import o.setEncryptProxy;
import o.setOnWheelViewListener;
import o.setPublishStatus;
import o.setStateOn;
import o.setWhiteListAP;
import o.stopIgnoring;
import o.toJavaScript;
import o.translate;
import o.unlockAndMoveToNext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ¡\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004 \u0001¡\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00152\u0006\u00105\u001a\u000206H\u0002J\u001a\u0010O\u001a\u00020M2\u0006\u0010P\u001a\u0002062\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u0012\u0010S\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\b\u0010T\u001a\u00020MH\u0002J\b\u0010U\u001a\u00020MH\u0002J\u0012\u0010V\u001a\u0002062\b\u0010Q\u001a\u0004\u0018\u00010WH\u0002J\b\u0010X\u001a\u00020YH\u0014J\b\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020M2\u0006\u0010_\u001a\u00020\u0015H\u0002J\u0010\u0010`\u001a\u00020M2\u0006\u0010_\u001a\u00020\u0015H\u0002J,\u0010a\u001a\u00020M2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u0010b\u001a\u00020Y2\u0006\u0010c\u001a\u00020Y2\b\u0010d\u001a\u0004\u0018\u000106H\u0002J\"\u0010e\u001a\u00020M2\b\u0010d\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u0002062\u0006\u0010_\u001a\u00020\u0015H\u0002J*\u0010f\u001a\u00020M2\u0006\u00105\u001a\u0002062\b\u0010g\u001a\u0004\u0018\u0001062\u0006\u0010_\u001a\u00020\u00152\u0006\u0010d\u001a\u000206H\u0002J\b\u0010h\u001a\u00020MH\u0015J\b\u0010i\u001a\u00020MH\u0002J\b\u0010j\u001a\u00020MH\u0002J\b\u0010k\u001a\u00020MH\u0002J\b\u0010l\u001a\u00020MH\u0002J\b\u0010m\u001a\u00020MH\u0002J\b\u0010n\u001a\u00020MH\u0002J\b\u0010o\u001a\u00020MH\u0002J\b\u0010p\u001a\u00020MH\u0002J\b\u0010q\u001a\u00020MH\u0002J\b\u0010r\u001a\u00020\u0015H\u0002J\b\u0010s\u001a\u00020\u0015H\u0002J\b\u0010t\u001a\u00020\u0015H\u0002J\b\u0010u\u001a\u00020\u0015H\u0002J\"\u0010v\u001a\u00020M2\u0006\u0010w\u001a\u00020Y2\u0006\u0010x\u001a\u00020Y2\b\u0010Q\u001a\u0004\u0018\u00010WH\u0016J\u001a\u0010y\u001a\u00020M2\u0006\u0010x\u001a\u00020Y2\b\u0010Q\u001a\u0004\u0018\u00010WH\u0002J\u001a\u0010z\u001a\u00020M2\u0006\u0010x\u001a\u00020Y2\b\u0010Q\u001a\u0004\u0018\u00010WH\u0002J\u001a\u0010{\u001a\u00020M2\u0006\u0010x\u001a\u00020Y2\b\u0010Q\u001a\u0004\u0018\u00010WH\u0002J\b\u0010|\u001a\u00020MH\u0016J\b\u0010}\u001a\u00020~H\u0002J\t\u0010\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\u001b\u0010\u0001\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u000106H\u0002J1\u0010\u0001\u001a\u00020M2\u0006\u0010w\u001a\u00020Y2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u0002060\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0003\u0010\u0001J\t\u0010\u0001\u001a\u00020MH\u0016J\u001d\u0010\u0001\u001a\u00020\u00152\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0017J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0011\u0010\u0001\u001a\u00020M2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\t\u0010\u0001\u001a\u00020\u0015H\u0002J\u0013\u0010\u0001\u001a\u00020M2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J#\u0010\u0001\u001a\u00020M2\u0006\u00105\u001a\u0002062\b\u0010g\u001a\u0004\u0018\u0001062\u0006\u0010d\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\u0012\u0010\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u000206H\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J!\u0010\u0001\u001a\u00020M2\u0006\u0010_\u001a\u00020\u00152\u0006\u0010d\u001a\u0002062\u0006\u00105\u001a\u000206H\u0002J\u0014\u0010\u0001\u001a\u00020M2\t\u0010\u0001\u001a\u0004\u0018\u000106H\u0002J\r\u0010\u0001\u001a\u00020M*\u00020WH\u0002J\u000e\u0010\u0001\u001a\u00020M*\u00030\u0001H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020;8BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020;8BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010=R\u000e\u0010C\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX.¢\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u00020G8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006¢\u0001"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberFragment;", "Lid/dana/base/KeyBaseFragment;", "Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/onboarding/verify/VerifyNumberKey;", "Landroid/view/View$OnTouchListener;", "()V", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "faceAuthenticationModel", "Lid/dana/model/FaceAuthenticationModel;", "faceOnlyLogin", "", "isEditablePhoneNumber", "isMasked", "isVerifyToResetPin", "locationPermissionDialog", "Lid/dana/dialog/DialogPermission;", "locationPermissionSubject", "Lid/dana/toggle/locationpermission/LocationPermissionSubject;", "getLocationPermissionSubject", "()Lid/dana/toggle/locationpermission/LocationPermissionSubject;", "setLocationPermissionSubject", "(Lid/dana/toggle/locationpermission/LocationPermissionSubject;)V", "locationStoragePermission", "Lid/dana/utils/permission/Permission;", "loginInfoDialog", "Lid/dana/dialog/LoginInfoDialog;", "mobileDataPermissionDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "onboardingNavigationManager", "Lid/dana/onboarding/OnboardingNavigationManager;", "otpRegisterListener", "Lid/dana/onboarding/verify/VerifyNumberFragment$ChallengeListener;", "getOtpRegisterListener", "()Lid/dana/onboarding/verify/VerifyNumberFragment$ChallengeListener;", "setOtpRegisterListener", "(Lid/dana/onboarding/verify/VerifyNumberFragment$ChallengeListener;)V", "permissionStatePresenter", "Lid/dana/contract/permission/PermissionStateContract$Presenter;", "getPermissionStatePresenter", "()Lid/dana/contract/permission/PermissionStateContract$Presenter;", "setPermissionStatePresenter", "(Lid/dana/contract/permission/PermissionStateContract$Presenter;)V", "phoneNumber", "", "phoneNumberTextWatcher", "Lid/dana/onboarding/verify/VerifyNumberTextWatcher;", "phonePermission", "pinLockedListener", "Landroid/content/DialogInterface$OnClickListener;", "getPinLockedListener", "()Landroid/content/DialogInterface$OnClickListener;", "prizeName", "referralCampaignEnabled", "registrationSource", "riskRejectDialogListener", "getRiskRejectDialogListener", "valid", "verifyNumberComponent", "Lid/dana/di/component/VerifyNumberComponent;", "verifyPresenter", "Lid/dana/onboarding/verify/VerifyNumberContract$Presenter;", "getVerifyPresenter", "()Lid/dana/onboarding/verify/VerifyNumberContract$Presenter;", "setVerifyPresenter", "(Lid/dana/onboarding/verify/VerifyNumberContract$Presenter;)V", "activityResultOtpRegister", "", "referralFeatureEnabled", "checkCancelReason", "cancelReason", "data", "Landroid/os/Bundle;", "checkMessage", "checkPermissionOrContinue", "dismissLocationAndContinue", "getCancelReason", "Landroid/content/Intent;", "getLayout", "", "getPermissionStateModule", "Lid/dana/contract/permission/PermissionStateModule;", "getVerifyNumberModule", "Lid/dana/di/modules/VerifyNumberModule;", "goLogin", "withMobileData", "goLoginWithTrustRisk", "goOtp", "otpCodeLength", "retrySendSeconds", "securityId", "goToBokuVerify", "handleUserMobileDataPermissionResponse", "action", "init", "initAutofill", "initAutofillWithMasked", "initContinueButtonListener", "initEnterPhoneNumberTextStyling", "initInjector", "initPermission", "initPhoneView", "initTnCAndPrivacyPolicy", "initVerifyNumberTextWatcher", "isMobileNetworkOn", "isOreoAndAbove", "isTrackOnBoardingPhoneNumberOpen", "isWifiEnabled", "onActivityResult", "requestCode", "resultCode", "onChallengeControlLoginActivityResult", "onChallengeControlOtpRegisterActivityResult", "onChallengeControlTrustRiskLoginActivityResult", "onDestroy", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "onKeyListener", "Landroid/view/View$OnKeyListener;", "onNext", "onRegisterChallengeCompleted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onValidatedListener", "Lid/dana/textbehavior/OnValidatedListener;", "setIsMasked", "shouldShowMobileDataPermission", "showAccountFrozenDialog", "showLocationPermissionDialog", "showMobileDataPermissionDialog", "showPinLockedDialog", "trackAccountLock", "userAction", "trackOnBoardingPhoneNumberOpen", "verifyByChallenge", "warning", "message", "checkErrorMessage", "setAccountFrozenDialogButtonCallback", "Lid/dana/dialog/LoginInfoDialog$Builder;", "ChallengeListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class VerifyNumberFragment extends MultiInstanceInvalidationService<OnboardingActivity, VerifyNumberKey> implements View.OnTouchListener {
    private static final String getCause = Reflection.getOrCreateKotlinClass(VerifyNumberFragment.class).getSimpleName();
    @NotNull
    public static final getMax setMax = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public DialogPermission FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public boolean Grayscale$Algorithm;
    private HashMap ICustomTabsCallback;
    private CompassSensorService.AnonymousClass1 IsOverlapping;
    private boolean Mean$Arithmetic;
    /* access modifiers changed from: private */
    public boolean b;
    /* access modifiers changed from: private */
    public LoginInfoDialog create;
    @Inject
    public getShortName dynamicUrlWrapper;
    private translate equals;
    private setStateOn getMin;
    /* access modifiers changed from: private */
    public String hashCode = "";
    private boolean invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend;
    private final Lazy isInside = LazyKt.lazy(new setMin(this));
    @Inject
    public isAlipayApp locationPermissionSubject;
    /* access modifiers changed from: private */
    @Nullable
    public length onNavigationEvent;
    @Inject
    public ViewPager2.OffscreenPageLimit.length permissionStatePresenter;
    private setStateOn setMin;
    /* access modifiers changed from: private */
    public String toDoubleRange = "";
    private TwoButtonWithImageDialog toFloatRange;
    private SensorBridgeExtension toIntRange;
    /* access modifiers changed from: private */
    public String toString = "";
    /* access modifiers changed from: private */
    public boolean valueOf;
    /* access modifiers changed from: private */
    public inputFocus4Android values;
    @Inject
    public CompassSensorService.length verifyPresenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberFragment$ChallengeListener;", "", "onCancelled", "", "reason", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void setMax();
    }

    public final View getMax(int i) {
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = new HashMap();
        }
        View view = (View) this.ICustomTabsCallback.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.ICustomTabsCallback.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void getMax() {
        HashMap hashMap = this.ICustomTabsCallback;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.fragment_verify_number;
    }

    public static final /* synthetic */ setStateOn FastBitmap$CoordinateSystem(VerifyNumberFragment verifyNumberFragment) {
        setStateOn setstateon = verifyNumberFragment.getMin;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationStoragePermission");
        }
        return setstateon;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog invoke(VerifyNumberFragment verifyNumberFragment) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = verifyNumberFragment.toFloatRange;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mobileDataPermissionDialog");
        }
        return twoButtonWithImageDialog;
    }

    public static final /* synthetic */ setStateOn invokeSuspend(VerifyNumberFragment verifyNumberFragment) {
        setStateOn setstateon = verifyNumberFragment.setMin;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        return setstateon;
    }

    public static final /* synthetic */ SensorBridgeExtension length(VerifyNumberFragment verifyNumberFragment) {
        SensorBridgeExtension sensorBridgeExtension = verifyNumberFragment.toIntRange;
        if (sensorBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        return sensorBridgeExtension;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ VerifyNumberFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(VerifyNumberFragment verifyNumberFragment) {
            super(0);
            this.this$0 = verifyNumberFragment;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0.requireActivity());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setMax() {
        EditText input;
        EditText input2;
        EditText input3;
        EditText input4;
        EditText input5;
        InputPhoneView inputPhoneView;
        PrepareException.AnonymousClass1 r7;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("phoneNumber")) {
            String string = arguments.getString("phoneNumber", "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(Onboardin…Manager.PHONE_NUMBER, \"\")");
            this.toDoubleRange = string;
            this.Mean$Arithmetic = arguments.getBoolean("isEditablePhoneNumber");
            this.invoke = Intrinsics.areEqual((Object) OnboardingActivity.DEEPLINK_RESET_PIN, (Object) arguments.getString("source", ""));
        }
        boolean z = arguments != null && arguments.getBoolean("FROM_LOGOUT", false);
        if (this.equals == null) {
            unlockAndMoveToNext.length length2 = new unlockAndMoveToNext.length((byte) 0);
            if (this.getMax != null) {
                r7 = this.getMax.getApplicationComponent();
            } else {
                r7 = null;
            }
            if (r7 != null) {
                length2.setMin = r7;
                length2.length = new AuthenticationModule(getActivity());
                length2.getMax = new PermissionStateModule(new setMax(this));
                length2.setMax = new VerifyNumberModule(new equals(this), this.invoke);
                stopIgnoring.setMin(length2.setMax, VerifyNumberModule.class);
                stopIgnoring.setMin(length2.getMax, PermissionStateModule.class);
                stopIgnoring.setMin(length2.length, AuthenticationModule.class);
                stopIgnoring.setMin(length2.setMin, PrepareException.AnonymousClass1.class);
                unlockAndMoveToNext unlockandmovetonext = new unlockAndMoveToNext(length2.setMax, length2.getMax, length2.length, length2.setMin, (byte) 0);
                Intrinsics.checkNotNullExpressionValue(unlockandmovetonext, "DaggerVerifyNumberCompon…\n                .build()");
                this.equals = unlockandmovetonext;
            } else {
                throw null;
            }
        }
        translate translate = this.equals;
        if (translate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyNumberComponent");
        }
        translate.getMin(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        CompassSensorService.length length3 = this.verifyPresenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
        }
        getminArr[0] = length3;
        getMin(getminArr);
        Fragment fragment = this;
        setStateOn.getMin getmin = new setStateOn.getMin(fragment);
        getmin.length.add("android.permission.CALL_PHONE");
        getmin.getMax = new toFloatRange(this);
        setStateOn setstateon = new setStateOn(getmin, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(setstateon, "Permission.Builder(this)…  })\n            .build()");
        this.setMin = setstateon;
        setStateOn.getMin getmin2 = new setStateOn.getMin(fragment);
        Collections.addAll(getmin2.length, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE"});
        getmin2.getMax = new isInside(this);
        getmin2.getMin = new toString(this);
        setStateOn setstateon2 = new setStateOn(getmin2, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(setstateon2, "Permission.Builder(this)…() }\n            .build()");
        this.getMin = setstateon2;
        this.b = false;
        CompassSensorService.AnonymousClass1 r5 = this.IsOverlapping;
        if (!(r5 == null || r5 == null)) {
            r5.length = false;
        }
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.toIntRange = sensorBridgeExtension;
            if (z) {
                if (sensorBridgeExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
                }
                sensorBridgeExtension.length.setMenuLeftButton((String) null);
            } else {
                if (sensorBridgeExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
                }
                sensorBridgeExtension.length.setMenuLeftButton((int) R.drawable.btn_arrow_left);
            }
            SensorBridgeExtension sensorBridgeExtension2 = this.toIntRange;
            if (sensorBridgeExtension2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension2.length.setMenuRightButton((String) null);
            SensorBridgeExtension sensorBridgeExtension3 = this.toIntRange;
            if (sensorBridgeExtension3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            sensorBridgeExtension3.setMin = new IsOverlapping(this);
            ConstraintLayout constraintLayout = (ConstraintLayout) getMax(resetInternal.setMax.getActivityResultRegistry);
            if (constraintLayout != null) {
                constraintLayout.setOnTouchListener(this);
            }
            InputPhoneView inputPhoneView2 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
            Intrinsics.checkNotNullExpressionValue(inputPhoneView2, "ipv_phone");
            EditText input6 = inputPhoneView2.getInput();
            Intrinsics.checkNotNullExpressionValue(input6, "ipv_phone.input");
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            this.IsOverlapping = new TextWatcher(input6, requireContext, this.b) {
                @NotNull
                public static final getMax setMax = new getMax((byte) 0);
                private final EditText equals;
                private boolean getMax;
                private boolean getMin;
                public boolean length;
                private final StringBuilder setMin = new StringBuilder();
                private final Context toIntRange;

                {
                    Intrinsics.checkNotNullParameter(r2, "editText");
                    Intrinsics.checkNotNullParameter(r3, HummerConstants.CONTEXT);
                    this.equals = r2;
                    this.toIntRange = r3;
                    this.length = r4;
                }

                public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                    Intrinsics.checkNotNullParameter(charSequence, "phoneNumber");
                    this.getMin = Intrinsics.areEqual((Object) "-", (Object) charSequence.subSequence(i, i2 + i).toString());
                }

                public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
                    this.getMax = i3 > 3;
                }

                public final void afterTextChanged(@NotNull Editable editable) {
                    Intrinsics.checkNotNullParameter(editable, "editable");
                    TextWatcher textWatcher = this;
                    this.equals.removeTextChangedListener(textWatcher);
                    int selectionStart = this.equals.getSelectionStart();
                    CharSequence charSequence = editable;
                    this.setMin.setLength(0);
                    if (this.length) {
                        int length2 = charSequence.length();
                        StringBuilder sb = this.setMin;
                        sb.delete(0, sb.length());
                        int i = 0;
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (i == 3 || i == 7) {
                                this.setMin.append(" ");
                            }
                            this.setMin.append(charSequence.charAt(i2));
                            i++;
                        }
                        String obj = this.setMin.toString();
                        Intrinsics.checkNotNullExpressionValue(obj, "formatted.toString()");
                        this.length = obj.length() > 0;
                    } else {
                        if ((!StringsKt.isBlank(charSequence)) && charSequence.charAt(0) == '0') {
                            charSequence = charSequence.subSequence(1, charSequence.length());
                        }
                        int length3 = charSequence.length();
                        StringBuilder sb2 = this.setMin;
                        sb2.delete(0, sb2.length());
                        int i3 = 0;
                        for (int i4 = 0; i4 < length3; i4++) {
                            if (Character.isDigit(charSequence.charAt(i4))) {
                                if (i3 == 3 || i3 == 7) {
                                    this.setMin.append("-");
                                }
                                this.setMin.append(charSequence.charAt(i4));
                                i3++;
                            }
                        }
                    }
                    String obj2 = this.setMin.toString();
                    Intrinsics.checkNotNullExpressionValue(obj2, "formatted.toString()");
                    int length4 = selectionStart + (obj2.length() - editable.length());
                    Integer num = this.toIntRange.getResources() != null ? 15 : null;
                    Intrinsics.checkNotNull(num);
                    int max = Math.max(Math.min(length4, num.intValue()), 0);
                    if (this.length) {
                        this.equals.setText(obj2);
                    } else {
                        editable.replace(0, editable.length(), obj2);
                    }
                    this.equals.setSelection(max);
                    if (this.getMin) {
                        EditText editText = this.equals;
                        editText.setSelection(editText.getSelectionStart() - 1);
                        this.getMin = false;
                    }
                    if (this.getMax) {
                        this.getMax = false;
                        EditText editText2 = this.equals;
                        editText2.setSelection(editText2.getText().length());
                    }
                    this.equals.addTextChangedListener(textWatcher);
                    convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_key_down", (String) RDSConstant.INPUT_PHONE_NUMBER, editable.toString())};
                    for (int i5 = 0; i5 <= 0; i5++) {
                        convertsptopxArr[i5].length();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberTextWatcher$Companion;", "", "()V", "GROUP_SEPARATOR", "", "MASKED_SEPARATOR", "POSSIBLE_PASTE_MINIMUM_CHAR_COUNT", "", "SEPARATOR_POSITION_1", "SEPARATOR_POSITION_2", "ZERO_PREFIX", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.CompassSensorService$1$getMax */
                public static final class getMax {
                    private getMax() {
                    }

                    public /* synthetic */ getMax(byte b) {
                        this();
                    }
                }
            };
            InputPhoneView inputPhoneView3 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
            if (inputPhoneView3 != null) {
                inputPhoneView3.requestFocus();
                inputPhoneView3.setPrefix(getString(R.string.id_prefix));
                inputPhoneView3.setOnValidatedListener(new values(this));
                EditText input7 = inputPhoneView3.getInput();
                if (input7 != null) {
                    input7.setOnKeyListener(new hashCode(this));
                }
                EditText input8 = inputPhoneView3.getInput();
                if (input8 != null) {
                    input8.setOnFocusChangeListener(VerifyNumberFragment$FastBitmap$CoordinateSystem.length);
                }
                EditText input9 = inputPhoneView3.getInput();
                if (input9 != null) {
                    input9.addTextChangedListener(this.IsOverlapping);
                }
            }
            CharSequence charSequence = this.toDoubleRange;
            if (!(charSequence == null || charSequence.length() == 0) && (inputPhoneView = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon)) != null) {
                inputPhoneView.setInput(new Regex("0").replaceFirst(this.toDoubleRange, ""));
                inputPhoneView.setEditable(this.Mean$Arithmetic);
            }
            String string2 = getString(R.string.lbl_enter_phone_number_intro);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.lbl_enter_phone_number_intro)");
            String string3 = getString(R.string.lbl_intro_phone_number_highlight);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.lbl_i…o_phone_number_highlight)");
            CharSequence charSequence2 = string2;
            int indexOf$default = StringsKt.indexOf$default(charSequence2, string3, 0, false, 6, (Object) null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, string3.length() + indexOf$default, 33);
            TextView textView = (TextView) getMax(resetInternal.setMax.setOffStateDescriptionOnRAndAbove);
            if (textView != null) {
                textView.setText(spannableStringBuilder);
            }
            String string4 = getString(R.string.intro_tnc);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.intro_tnc)");
            String string5 = getString(R.string.tnc);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.tnc)");
            String string6 = getString(R.string.privacy_policy_highlighted);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.privacy_policy_highlighted)");
            CharSequence charSequence3 = string4;
            int indexOf$default2 = StringsKt.indexOf$default(charSequence3, string5, 0, false, 6, (Object) null);
            int length4 = indexOf$default2 + string5.length();
            int indexOf$default3 = StringsKt.indexOf$default(charSequence3, string6, 0, false, 6, (Object) null);
            int length5 = string6.length() + indexOf$default3;
            toJavaScript tojavascript = new toJavaScript(getContext(), WebViewActivity.ContentBuilder(getContext(), string5, isShowMenu.setMin("/m/standalone/tnc")));
            toJavaScript tojavascript2 = new toJavaScript(getContext(), WebViewActivity.ContentBuilder(getContext(), string6, isShowMenu.setMin("/m/standalone/policy")));
            SpannableString spannableString = new SpannableString(charSequence3);
            spannableString.setSpan(tojavascript, indexOf$default2, length4, 33);
            spannableString.setSpan(tojavascript2, indexOf$default3, length5, 33);
            spannableString.setSpan(new StyleSpan(1), indexOf$default2, length4, 33);
            spannableString.setSpan(new StyleSpan(1), indexOf$default3, length5, 33);
            TextView textView2 = (TextView) getMax(resetInternal.setMax.CustomTabsService$FilePurpose);
            if (textView2 != null) {
                textView2.setText(spannableString);
            }
            TextView textView3 = (TextView) getMax(resetInternal.setMax.CustomTabsService$FilePurpose);
            if (textView3 != null) {
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
            Button button = (Button) getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setOnClickListener(new toIntRange(this));
            }
            BaseActivity baseActivity2 = this.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            setOnWheelViewListener.setMin(baseActivity2);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            if (ScreenBrightnessBridgeExtension.length()) {
                InputPhoneView inputPhoneView4 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (!(inputPhoneView4 == null || (input5 = inputPhoneView4.getInput()) == null)) {
                    input5.setText(ScreenBrightnessBridgeExtension.toDoubleRange());
                }
                InputPhoneView inputPhoneView5 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (!(inputPhoneView5 == null || (input4 = inputPhoneView5.getInput()) == null)) {
                    input4.setFocusable(false);
                }
                equals();
            }
            getStartDelay min = getStartDelay.IsOverlapping.setMin();
            String str = min.setMax;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                this.b = true;
                CompassSensorService.AnonymousClass1 r4 = this.IsOverlapping;
                if (!(r4 == null || r4 == null)) {
                    r4.length = true;
                }
                String str2 = min.setMax;
                if (str2 == null) {
                    str2 = "";
                }
                String max = WheelView.ScrollerTask.AnonymousClass2.getMax(str2, "••••");
                Intrinsics.checkNotNullExpressionValue(max, "MaskedTextUtil\n         …honeNumberData(), \"••••\")");
                String replaceFirst = new Regex("62-").replaceFirst(max, "");
                SensorBridgeExtension sensorBridgeExtension4 = this.toIntRange;
                if (sensorBridgeExtension4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
                }
                sensorBridgeExtension4.length.setMenuLeftButton((int) R.drawable.btn_arrow_left);
                InputPhoneView inputPhoneView6 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (!(inputPhoneView6 == null || (input3 = inputPhoneView6.getInput()) == null)) {
                    input3.setText(replaceFirst);
                }
                InputPhoneView inputPhoneView7 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (inputPhoneView7 != null) {
                    inputPhoneView7.setFocusable(false);
                }
                try {
                    InputPhoneView inputPhoneView8 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                    if (!(inputPhoneView8 == null || (input2 = inputPhoneView8.getInput()) == null)) {
                        input2.setSelection(replaceFirst.length() + 2);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    InputPhoneView inputPhoneView9 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                    if (!(inputPhoneView9 == null || (input = inputPhoneView9.getInput()) == null)) {
                        input.setSelection(replaceFirst.length());
                    }
                }
                equals();
            }
            if (invoke()) {
                convertDipToPx.length length6 = new convertDipToPx.length(getContext());
                length6.getMax = TrackerKey.Event.ONBOARDING_PHONE_NUMBER_OPEN;
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                if (!TextUtils.isEmpty(ScreenBrightnessBridgeExtension.Grayscale$Algorithm())) {
                    ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
                    length6.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
                } else {
                    length6.setMax("Merchant Name", getString(R.string.dana_string));
                }
                length6.setMin();
                genTextSelector.getMax(new convertDipToPx(length6, (byte) 0));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements MultiInstanceInvalidationClient$1 {
        final /* synthetic */ VerifyNumberFragment getMin;

        IsOverlapping(VerifyNumberFragment verifyNumberFragment) {
            this.getMin = verifyNumberFragment;
        }

        public final void getMax() {
            this.getMin.n_();
        }
    }

    public final void onResume() {
        InputPhoneView inputPhoneView = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
        if (inputPhoneView != null) {
            inputPhoneView.setEnabled(true);
        }
        Button button = (Button) getMax(resetInternal.setMax.ITrustedWebActivityService);
        if (button != null) {
            button.setEnabled(true);
        }
        super.onResume();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r0 = r10.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, @org.jetbrains.annotations.Nullable android.content.Intent r10) {
        /*
            r7 = this;
            id.dana.onboarding.boku.BokuVerifyActivity$getMin r0 = id.dana.onboarding.boku.BokuVerifyActivity.Companion
            int r0 = id.dana.onboarding.boku.BokuVerifyActivity.getMin.getMax()
            java.lang.String r1 = "verifyPresenter"
            r2 = 1
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r8) goto L_0x001b
            if (r3 != r9) goto L_0x001b
            o.CompassSensorService$length r0 = r7.verifyPresenter
            if (r0 != 0) goto L_0x0016
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0016:
            r0.length(r2)
            goto L_0x00f1
        L_0x001b:
            id.dana.onboarding.boku.BokuVerifyActivity$getMin r0 = id.dana.onboarding.boku.BokuVerifyActivity.Companion
            int r0 = id.dana.onboarding.boku.BokuVerifyActivity.getMin.getMax()
            if (r0 != r8) goto L_0x0033
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r0 != r9) goto L_0x0033
            o.CompassSensorService$length r0 = r7.verifyPresenter
            if (r0 != 0) goto L_0x002e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002e:
            r0.setMin()
            goto L_0x00f1
        L_0x0033:
            id.dana.onboarding.boku.BokuVerifyActivity$getMin r0 = id.dana.onboarding.boku.BokuVerifyActivity.Companion
            int r0 = id.dana.onboarding.boku.BokuVerifyActivity.getMin.getMax()
            if (r0 != r8) goto L_0x005b
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r0 != r9) goto L_0x005b
            if (r10 == 0) goto L_0x00f1
            java.lang.String r0 = "errorMessage"
            java.lang.String r0 = r10.getStringExtra(r0)
            id.dana.base.BaseActivity r1 = r7.getMax
            r1.showWarningDialog(r0)
            int r0 = o.resetInternal.setMax.ITrustedWebActivityService
            android.view.View r0 = r7.getMax(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x00f1
            r0.setEnabled(r2)
            goto L_0x00f1
        L_0x005b:
            r0 = 998(0x3e6, float:1.398E-42)
            java.lang.String r1 = ""
            java.lang.String r2 = "cancel_reason"
            java.lang.String r4 = "onboardingNavigationManager"
            r5 = -1
            r6 = 0
            if (r0 != r8) goto L_0x00a4
            if (r9 == r5) goto L_0x0099
            if (r10 == 0) goto L_0x0076
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0077
        L_0x0076:
            r0 = r6
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r1 = r0
        L_0x007b:
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008a
            android.os.Bundle r6 = r10.getExtras()
        L_0x008a:
            r7.getMin((java.lang.String) r1, (android.os.Bundle) r6)
            goto L_0x00f1
        L_0x008f:
            if (r10 == 0) goto L_0x0095
            android.os.Bundle r6 = r10.getExtras()
        L_0x0095:
            r7.getMax((android.os.Bundle) r6)
            goto L_0x00f1
        L_0x0099:
            o.SensorBridgeExtension r0 = r7.toIntRange
            if (r0 != 0) goto L_0x00a0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00a0:
            r0.getMin()
            goto L_0x00f1
        L_0x00a4:
            r0 = 999(0x3e7, float:1.4E-42)
            if (r0 != r8) goto L_0x00d1
            if (r9 == r5) goto L_0x00c6
            if (r10 == 0) goto L_0x00b7
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = r0.getString(r2)
            goto L_0x00b8
        L_0x00b7:
            r0 = r6
        L_0x00b8:
            if (r0 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r1 = r0
        L_0x00bc:
            if (r10 == 0) goto L_0x00c2
            android.os.Bundle r6 = r10.getExtras()
        L_0x00c2:
            r7.getMin((java.lang.String) r1, (android.os.Bundle) r6)
            goto L_0x00f1
        L_0x00c6:
            o.SensorBridgeExtension r0 = r7.toIntRange
            if (r0 != 0) goto L_0x00cd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00cd:
            r0.getMin()
            goto L_0x00f1
        L_0x00d1:
            if (r3 != r8) goto L_0x00f1
            if (r9 == r5) goto L_0x00ea
            kotlin.Lazy r0 = r7.isInside
            java.lang.Object r0 = r0.getValue()
            o.setPublishStatus r0 = (o.setPublishStatus) r0
            r0.getMax()
            if (r10 == 0) goto L_0x00e6
            android.os.Bundle r6 = r10.getExtras()
        L_0x00e6:
            r7.getMax((android.os.Bundle) r6)
            goto L_0x00f1
        L_0x00ea:
            id.dana.onboarding.verify.VerifyNumberFragment$length r0 = r7.onNavigationEvent
            if (r0 == 0) goto L_0x00f1
            r0.setMax()
        L_0x00f1:
            super.onActivityResult(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.onboarding.verify.VerifyNumberFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        setStateOn setstateon = this.setMin;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        if (!setstateon.getMin(i, strArr, iArr)) {
            setStateOn setstateon2 = this.getMin;
            if (setstateon2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationStoragePermission");
            }
            if (!setstateon2.getMin(i, strArr, iArr)) {
                super.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    public final void onDestroy() {
        if (this.invoke) {
            CompassSensorService.length length2 = this.verifyPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
            }
            length2.getMax();
        }
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$getPermissionStateModule$1", "Lid/dana/contract/permission/PermissionStateContract$View;", "dismissProgress", "", "onCheckLocationPermissionDenied", "isDeniedAndNeverAskAgain", "", "onDenyLocationPermission", "onError", "errorMessage", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements ViewPager2.OffscreenPageLimit.setMin {
        final /* synthetic */ VerifyNumberFragment getMin;

        public final void dismissProgress() {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        setMax(VerifyNumberFragment verifyNumberFragment) {
            this.getMin = verifyNumberFragment;
        }

        public final void length(boolean z) {
            if (z) {
                this.getMin.toDoubleRange();
            } else {
                VerifyNumberFragment.setMax(this.getMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J2\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u0018\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016J,\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016¨\u0006\""}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$getVerifyNumberModule$1", "Lid/dana/onboarding/verify/VerifyNumberContract$View;", "dismissProgress", "", "needVerifyByChallenge", "securityId", "", "phoneNumber", "withMobileData", "", "onError", "errorMessage", "onGoogleRegistrationBlock", "onInvalidPhoneNumber", "onMobileDataPermissionAccepted", "action", "onMobileDataPermissionNotAccepted", "onNumberNotExist", "checkRegistrationResponse", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "referralFeatureEnabled", "otpCodeLength", "", "retrySendSeconds", "onNumberVerified", "registrationSource", "onNumberVerifiedWithTrustRiskLogin", "faceOnlyLogin", "faceAuthenticationModel", "Lid/dana/model/FaceAuthenticationModel;", "onRegisterChallengeCompleted", "onResetPin", "onRiskReject", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements CompassSensorService.getMin {
        final /* synthetic */ VerifyNumberFragment getMax;

        equals(VerifyNumberFragment verifyNumberFragment) {
            this.getMax = verifyNumberFragment;
        }

        public final void getMin(@Nullable String str, @Nullable String str2) {
            Button button = (Button) this.getMax.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            this.getMax.toDoubleRange = str == null ? "" : str;
            VerifyNumberFragment verifyNumberFragment = this.getMax;
            if (str2 == null) {
                str2 = "";
            }
            verifyNumberFragment.toString = str2;
            CompassSensorService.length length = this.getMax.verifyPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
            }
            if (str == null) {
                str = "";
            }
            length.getMin(str, "");
        }

        public final void getMin(@NotNull setEncryptProxy setencryptproxy, boolean z, @Nullable String str, int i, int i2) {
            Intrinsics.checkNotNullParameter(setencryptproxy, "checkRegistrationResponse");
            VerifyNumberFragment verifyNumberFragment = this.getMax;
            String prizeName = setencryptproxy.getPrizeName();
            String str2 = "";
            if (prizeName == null) {
                prizeName = str2;
            }
            verifyNumberFragment.hashCode = prizeName;
            this.getMax.invokeSuspend = setencryptproxy.getCampaignEnabled();
            VerifyNumberFragment.length(this.getMax).length.setMenuRightProgressBar(false);
            VerifyNumberFragment.getMax(this.getMax, setencryptproxy.getLocalPhoneNumber(), i, i2, str);
            VerifyNumberFragment verifyNumberFragment2 = this.getMax;
            String localPhoneNumber = setencryptproxy.getLocalPhoneNumber();
            if (localPhoneNumber != null) {
                str2 = localPhoneNumber;
            }
            verifyNumberFragment2.onNavigationEvent = new getMin(verifyNumberFragment2, z, str2);
        }

        public final void getMax(boolean z, @Nullable String str, @Nullable String str2, @NotNull inputFocus4Android inputfocus4android) {
            Intrinsics.checkNotNullParameter(inputfocus4android, "faceAuthenticationModel");
            Button button = (Button) this.getMax.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            this.getMax.Grayscale$Algorithm = z;
            this.getMax.toDoubleRange = str == null ? "" : str;
            VerifyNumberFragment verifyNumberFragment = this.getMax;
            if (str2 == null) {
                str2 = "";
            }
            verifyNumberFragment.toString = str2;
            this.getMax.values = inputfocus4android;
            CompassSensorService.length length = this.getMax.verifyPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
            }
            if (str == null) {
                str = "";
            }
            length.getMin(str, "");
        }

        public final void getMin() {
            this.getMax.getMax.showWarningDialog(this.getMax.getString(R.string.phone_number_invalid));
        }

        public final void setMin() {
            this.getMax.startActivity(new Intent(this.getMax.getMax, BlockRegistrationActivity.class));
            dismissProgress();
        }

        public final void getMax() {
            DialogWithImage.getMin getmin = new DialogWithImage.getMin();
            getmin.length = VerifyNumberFragment.isInside(this.getMax);
            getmin.toFloatRange = R.drawable.ic_customer_service_png;
            getmin.getMax = this.getMax.getString(R.string.risk_reject_dialog_title);
            getmin.setMin = this.getMax.getString(R.string.risk_reject_dialog_description);
            getmin.getMin = this.getMax.getString(R.string.risk_reject_positive_button_msg);
            new DialogWithImage(this.getMax.getMax, getmin.setMax, getmin, (byte) 0).setMin();
        }

        public final void length() {
            getShortName getshortname = this.getMax.dynamicUrlWrapper;
            if (getshortname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            String forgotPinUrl = getshortname.getForgotPinUrl();
            Intrinsics.checkNotNullExpressionValue(forgotPinUrl, "dynamicUrlWrapper.forgotPinUrl");
            DanaH5.startContainerFullUrl(forgotPinUrl);
        }

        public final void length(boolean z, @Nullable String str) {
            String str2 = "";
            if (!this.getMax.invokeSuspend || !z) {
                SensorBridgeExtension length = VerifyNumberFragment.length(this.getMax);
                if (str != null) {
                    str2 = str;
                }
                String prependZeroToPhoneNumber = isOriginHasAppInfo.prependZeroToPhoneNumber(str);
                Intrinsics.checkNotNullExpressionValue(prependZeroToPhoneNumber, "NumberUtils.prependZeroToPhoneNumber(phoneNumber)");
                length.setMax(str2, prependZeroToPhoneNumber, (String) null, (String) null);
                return;
            }
            SensorBridgeExtension length2 = VerifyNumberFragment.length(this.getMax);
            if (str == null) {
                str = str2;
            }
            String min = this.getMax.hashCode;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(min, "prizeName");
            BaseKey verifyReferralCodeKey = new VerifyReferralCodeKey(str, min);
            Intrinsics.checkNotNullParameter(verifyReferralCodeKey, "key");
            length2.getMin.getBackstack().goTo(verifyReferralCodeKey);
        }

        public final void setMin(@Nullable String str) {
            if (Intrinsics.areEqual((Object) str, (Object) CheckUserAction.LOGIN)) {
                this.getMax.setMax(true);
            } else if (Intrinsics.areEqual((Object) str, (Object) CheckUserAction.TRUST_RISK_LOGIN)) {
                this.getMax.getMax(true);
            }
        }

        public final void setMax(@NotNull String str, @Nullable String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, BioUtilityBridge.SECURITY_ID);
            Button button = (Button) this.getMax.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            if (this.getMax.FastBitmap$CoordinateSystem()) {
                VerifyNumberFragment.getMin(this.getMax, str, str2, str3);
            } else {
                VerifyNumberFragment.getMin(this.getMax, str, str2, false, str3);
            }
        }

        public final void getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            this.getMax.getMin(true, str, str2);
        }

        public final void showProgress() {
            Button button = (Button) this.getMax.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            setPublishStatus IsOverlapping = VerifyNumberFragment.IsOverlapping(this.getMax);
            if (!IsOverlapping.length.isShowing()) {
                IsOverlapping.length.show();
                IsOverlapping.getMax.startRefresh();
            }
        }

        public final void dismissProgress() {
            VerifyNumberFragment.IsOverlapping(this.getMax).getMax();
        }

        public final void onError(@Nullable String str) {
            this.getMax.getMax.showWarningDialog(str);
            Button button = (Button) this.getMax.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$initPermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements setStateOn.length {
        final /* synthetic */ VerifyNumberFragment length;

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
        }

        toFloatRange(VerifyNumberFragment verifyNumberFragment) {
            this.length = verifyNumberFragment;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            click.getMin(this.length.getMax, "1500445", setmin.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$initPermission$2", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements setStateOn.length {
        final /* synthetic */ VerifyNumberFragment length;

        isInside(VerifyNumberFragment verifyNumberFragment) {
            this.length = verifyNumberFragment;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            String str = setmin.getMin;
            BaseActivity baseActivity = this.length.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            BlurProcess.getMin(baseActivity.getApplicationContext(), true);
            if (Intrinsics.areEqual((Object) "android.permission.ACCESS_FINE_LOCATION", (Object) str)) {
                isAlipayApp isalipayapp = this.length.locationPermissionSubject;
                if (isalipayapp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationPermissionSubject");
                }
                isalipayapp.setMin(true);
            }
        }

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            String str = setmin.getMin;
            if (Intrinsics.areEqual((Object) "android.permission.ACCESS_FINE_LOCATION", (Object) str)) {
                boolean shouldShowRequestPermissionRationale = this.length.shouldShowRequestPermissionRationale(str);
                isAlipayApp isalipayapp = this.length.locationPermissionSubject;
                if (isalipayapp == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationPermissionSubject");
                }
                isalipayapp.setMin(false);
                ViewPager2.OffscreenPageLimit.length length2 = this.length.permissionStatePresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permissionStatePresenter");
                }
                length2.length(shouldShowRequestPermissionRationale);
            }
            BaseActivity baseActivity = this.length.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            BlurProcess.getMin(baseActivity.getApplicationContext(), false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/utils/permission/Permission$PermissionReport;", "kotlin.jvm.PlatformType", "", "onPermissionsChecked"}, k = 3, mv = {1, 4, 2})
    static final class toString implements setStateOn.getMax {
        final /* synthetic */ VerifyNumberFragment getMax;

        toString(VerifyNumberFragment verifyNumberFragment) {
            this.getMax = verifyNumberFragment;
        }

        public final void setMax(List<setStateOn.setMin> list) {
            VerifyNumberFragment.values(this.getMax);
        }
    }

    /* access modifiers changed from: private */
    public final void equals() {
        if (!CornerMarkingDataProvider.IsOverlapping() || setStateOn.getMin(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            toDoubleRange();
            return;
        }
        ViewPager2.OffscreenPageLimit.length length2 = this.permissionStatePresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionStatePresenter");
        }
        length2.length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ VerifyNumberFragment getMin;

        toIntRange(VerifyNumberFragment verifyNumberFragment) {
            this.getMin = verifyNumberFragment;
        }

        public final void onClick(View view) {
            Button button = (Button) this.getMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            this.getMin.equals();
        }
    }

    /* access modifiers changed from: private */
    public final void toDoubleRange() {
        convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.PHONE_NUMBER_LOST_FOCUS, false), new Helper("Onboarding", "rds_on_control_click", RDSConstant.PHONE_NUMBER_CONTINUE_BUTTON)};
        for (int i = 0; i < 2; i++) {
            convertsptopxArr[i].length();
        }
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            setOnWheelViewListener.getMax((Activity) (KeyBaseActivity) baseActivity);
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            String str = null;
            String str2 = "";
            if (ScreenBrightnessBridgeExtension.Mean$Arithmetic()) {
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                String Grayscale$Algorithm2 = ScreenBrightnessBridgeExtension.Grayscale$Algorithm();
                CompassSensorService.length length2 = this.verifyPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
                }
                InputPhoneView inputPhoneView = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (inputPhoneView != null) {
                    str = inputPhoneView.getCompletePhoneNumber();
                }
                if (str != null) {
                    str2 = str;
                }
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
                String FastBitmap$CoordinateSystem2 = ScreenBrightnessBridgeExtension.FastBitmap$CoordinateSystem();
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension4 = ScreenBrightnessBridgeExtension.getMin;
                length2.length(str2, FastBitmap$CoordinateSystem2, ScreenBrightnessBridgeExtension.values(), Grayscale$Algorithm2);
                return;
            }
            CompassSensorService.length length3 = this.verifyPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
            }
            if (this.b) {
                String str3 = getStartDelay.IsOverlapping.setMin().setMax;
                if (str3 != null) {
                    str2 = str3;
                }
                Regex regex = new Regex("62-");
                String string = getString(R.string.id_prefix);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.id_prefix)");
                str2 = regex.replaceFirst(str2, string);
            } else {
                InputPhoneView inputPhoneView2 = (InputPhoneView) getMax(resetInternal.setMax.setNeutralButtonIcon);
                if (inputPhoneView2 != null) {
                    str = inputPhoneView2.getCompletePhoneNumber();
                }
                if (str != null) {
                    str2 = str;
                }
            }
            length3.setMax(str2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class valueOf implements View.OnClickListener {
        public static final valueOf setMin = new valueOf();

        valueOf() {
        }

        public final void onClick(View view) {
            String min = isShowMenu.setMin("/m/standalone/tnc");
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(DanaUrl.TERMS_AND_CONDITION)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnKeyListener {
        final /* synthetic */ VerifyNumberFragment setMax;

        hashCode(VerifyNumberFragment verifyNumberFragment) {
            this.setMax = verifyNumberFragment;
        }

        public final boolean onKey(@Nullable View view, int i, @NotNull KeyEvent keyEvent) {
            InputPhoneView inputPhoneView;
            EditText input;
            Editable text;
            Intrinsics.checkNotNullParameter(keyEvent, "event");
            if (keyEvent.getAction() == 0 && i == 66 && this.setMax.valueOf) {
                this.setMax.equals();
                return false;
            } else if (keyEvent.getAction() != 0 || !this.setMax.b || (inputPhoneView = (InputPhoneView) this.setMax.getMax(resetInternal.setMax.setNeutralButtonIcon)) == null || (input = inputPhoneView.getInput()) == null || (text = input.getText()) == null) {
                return false;
            } else {
                text.clear();
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$onValidatedListener$1", "Lid/dana/textbehavior/OnValidatedListener;", "onInvalid", "", "s", "", "list", "", "Lid/dana/textbehavior/InvalidReason;", "onValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements checkApFlag {
        final /* synthetic */ VerifyNumberFragment setMin;

        values(VerifyNumberFragment verifyNumberFragment) {
            this.setMin = verifyNumberFragment;
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
            this.setMin.valueOf = true;
            VerifyNumberFragment.length(this.setMin).length.setMenuRightButtonEnabled(true);
            Button button = (Button) this.setMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(true);
            }
            Button button2 = (Button) this.setMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button2 != null) {
                button2.setAlpha(1.0f);
            }
        }

        public final void getMin(@NotNull String str, @NotNull List<? extends setWhiteListAP> list) {
            Intrinsics.checkNotNullParameter(str, "s");
            Intrinsics.checkNotNullParameter(list, BottomSheetType.LIST);
            this.setMin.valueOf = false;
            VerifyNumberFragment.length(this.setMin).length.setMenuRightButtonEnabled(false);
            Button button = (Button) this.setMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button != null) {
                button.setEnabled(false);
            }
            Button button2 = (Button) this.setMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
            if (button2 != null) {
                button2.setAlpha(0.48f);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean FastBitmap$CoordinateSystem() {
        if (!values()) {
            return false;
        }
        if (Grayscale$Algorithm()) {
            return valueOf();
        }
        return true;
    }

    private static boolean valueOf() {
        return CornerMarkingDataProvider.FastBitmap$CoordinateSystem();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getCause implements View.OnClickListener {
        final /* synthetic */ String getMin;
        final /* synthetic */ VerifyNumberFragment length;
        final /* synthetic */ String setMax;
        final /* synthetic */ String setMin;

        getCause(VerifyNumberFragment verifyNumberFragment, String str, String str2, String str3) {
            this.length = verifyNumberFragment;
            this.setMax = str;
            this.setMin = str2;
            this.getMin = str3;
        }

        public final void onClick(View view) {
            VerifyNumberFragment.invoke(this.length).setMax();
            CompassSensorService.length length2 = this.length.verifyPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
            }
            length2.getMin();
            VerifyNumberFragment.getMin(this.length, this.setMax, this.setMin, true, this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback implements View.OnClickListener {
        final /* synthetic */ String getMax;
        final /* synthetic */ VerifyNumberFragment getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        ICustomTabsCallback(VerifyNumberFragment verifyNumberFragment, String str, String str2, String str3) {
            this.getMin = verifyNumberFragment;
            this.length = str;
            this.setMax = str2;
            this.getMax = str3;
        }

        public final void onClick(View view) {
            VerifyNumberFragment.invoke(this.getMin).setMax();
            VerifyNumberFragment.getMin(this.getMin, this.length, this.setMax, false, this.getMax);
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(boolean z) {
        ChallengeControl.length length2 = new ChallengeControl.length((FtsOptions$Order) this);
        length2.getMin = "login";
        ChallengeControl.length min = length2.setMin(this.toDoubleRange);
        String str = this.toString;
        ChallengeControl.length length3 = min;
        if (str == null) {
            str = "";
        }
        length3.setMax = str;
        ChallengeControl.length length4 = length3;
        length4.Mean$Arithmetic = z;
        new ChallengeControl(length4, (byte) 0).getMin();
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        String str;
        ChallengeControl.length length2 = new ChallengeControl.length((FtsOptions$Order) this);
        length2.getMin = ChallengeScenario.TRUST_RISK_LOGIN;
        ChallengeControl.length min = length2.setMin(this.toDoubleRange);
        String str2 = this.toString;
        ChallengeControl.length length3 = min;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        length3.setMax = str2;
        boolean z2 = this.Grayscale$Algorithm;
        inputFocus4Android inputfocus4android = this.values;
        if (inputfocus4android != null) {
            str = inputfocus4android.length;
        } else {
            str = null;
        }
        inputFocus4Android inputfocus4android2 = this.values;
        Intrinsics.checkNotNull(inputfocus4android2);
        OrientationBridgeExtension orientationBridgeExtension = inputfocus4android2.setMin;
        Intrinsics.checkNotNullParameter(orientationBridgeExtension, "faceLoginAuthMethod");
        ChallengeControl.length length4 = length3;
        length4.hashCode = z2;
        if (str != null) {
            str3 = str;
        }
        length4.IsOverlapping = str3;
        length4.values = orientationBridgeExtension.setMin();
        length4.toDoubleRange = orientationBridgeExtension.setMax();
        length4.valueOf = orientationBridgeExtension.length();
        ChallengeControl.length length5 = length4;
        length5.Mean$Arithmetic = z;
        new ChallengeControl(length5, (byte) 0).getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$activityResultOtpRegister$1", "Lid/dana/onboarding/verify/VerifyNumberFragment$ChallengeListener;", "onCancelled", "", "reason", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements length {
        final /* synthetic */ VerifyNumberFragment getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ boolean setMax;

        getMin(VerifyNumberFragment verifyNumberFragment, boolean z, String str) {
            this.getMax = verifyNumberFragment;
            this.setMax = z;
            this.getMin = str;
        }

        public final void setMax() {
            VerifyNumberFragment.getMax(this.getMax, this.setMax, this.getMin);
        }
    }

    private final void getMin(String str, Bundle bundle) {
        switch (str.hashCode()) {
            case -305104263:
                if (str.equals("forgot_pin")) {
                    setStateOn setstateon = this.setMin;
                    if (setstateon == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
                    }
                    setstateon.setMin();
                    return;
                }
                break;
            case -109866462:
                if (str.equals(ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED)) {
                    DialogWithImage.length(this.getMax, new toDoubleRange(this)).setMin();
                    return;
                }
                break;
            case 462997423:
                if (str.equals(ChallengeControl.CancelReason.SESSION_EXPIRED)) {
                    this.getMax.showWarningDialog(getString(R.string.session_expired));
                    return;
                }
                break;
            case 495659250:
                if (str.equals(ChallengeControl.CancelReason.ACCOUNT_FROZEN)) {
                    setMax(bundle);
                    return;
                }
                break;
        }
        getMax(bundle);
    }

    private final void getMax(Bundle bundle) {
        String string = bundle != null ? bundle.getString("message") : null;
        if (!TextUtils.isEmpty(string)) {
            this.getMax.showWarningDialog(string);
        }
    }

    private final void setMax(Bundle bundle) {
        String string = bundle != null ? bundle.getString("message") : null;
        LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(this.getMax);
        getmax.equals = getString(R.string.lbl_dialog_account_freeze);
        getmax.IsOverlapping = string;
        LoginInfoDialog.getMax length2 = getmax.setMin().length();
        length2.getMax = false;
        length2.hashCode = R.drawable.rounded_white_8dp;
        length2.values = R.drawable.ic_lock_account;
        length2.toFloatRange = getString(R.string.lbl_dialog_call_customer_care);
        length2.toDoubleRange = new invokeSuspend(this);
        Unit unit = Unit.INSTANCE;
        LoginInfoDialog loginInfoDialog = new LoginInfoDialog(length2.setMax, length2.setMin, length2.length, length2, (byte) 0);
        loginInfoDialog.setMin();
        Unit unit2 = Unit.INSTANCE;
        this.create = loginInfoDialog;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend implements View.OnClickListener {
        final /* synthetic */ VerifyNumberFragment setMax;

        invokeSuspend(VerifyNumberFragment verifyNumberFragment) {
            this.setMax = verifyNumberFragment;
        }

        public final void onClick(View view) {
            LoginInfoDialog Grayscale$Algorithm = this.setMax.create;
            if (Grayscale$Algorithm != null) {
                Grayscale$Algorithm.setMax();
            }
            VerifyNumberFragment.invokeSuspend(this.setMax).setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyNumberFragment setMax;

        invoke(VerifyNumberFragment verifyNumberFragment) {
            this.setMax = verifyNumberFragment;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (-1 == i) {
                VerifyNumberFragment.invokeSuspend(this.setMax).setMin();
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyNumberFragment setMin;

        toDoubleRange(VerifyNumberFragment verifyNumberFragment) {
            this.setMin = verifyNumberFragment;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (i == -2) {
                dialogInterface.dismiss();
                VerifyNumberFragment.getMin(this.setMin, TrackerKey.AccountLockProperty.WAIT);
            } else if (i == -1) {
                VerifyNumberFragment.invokeSuspend(this.setMin).setMin();
                dialogInterface.dismiss();
                VerifyNumberFragment.getMin(this.setMin, TrackerKey.AccountLockProperty.CALL_HELP);
            }
        }
    }

    private static boolean invoke() {
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        return ScreenBrightnessBridgeExtension.setMax() != null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, SecurityConstants.KEY_VALUE);
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_touch_screen", RDSConstant.PHONE_NUMBER_TOUCH, (double) motionEvent.getX(), (double) motionEvent.getY())};
        for (int i = 0; i <= 0; i++) {
            convertsptopxArr[0].length();
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J$\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberFragment$Companion;", "", "()V", "ARG_FROM_LOGOUT", "", "RESULT_CODE_CHECK_REFERRAL", "", "RESULT_CODE_ERROR_VERIFY", "RESULT_CODE_NEED_RESEND_OTP", "TAG", "newInstance", "Lid/dana/onboarding/verify/VerifyNumberFragment;", "fromLogout", "", "newInstanceWithData", "phoneNumber", "isEditablePhoneNumber", "source", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    private final boolean values() {
        Object systemService = this.getMax.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            try {
                Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(declaredMethod, FirebaseAnalytics.Param.METHOD);
                declaredMethod.setAccessible(true);
                Object invoke2 = declaredMethod.invoke(connectivityManager, new Object[0]);
                if (invoke2 != null) {
                    return ((Boolean) invoke2).booleanValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Throwable unused) {
                return false;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    private final boolean Grayscale$Algorithm() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        Object systemService = baseActivity.getApplicationContext().getSystemService("wifi");
        if (systemService != null) {
            WifiManager wifiManager = (WifiManager) systemService;
            if (wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                Intrinsics.checkNotNullExpressionValue(connectionInfo, "wifiInfo");
                if (connectionInfo.getNetworkId() != -1) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z, String str, String str2) {
        if (z) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(getContext(), BokuVerifyActivity.class);
            bundle.putString(ChallengeControl.Key.SCENARIO, ChallengeScenario.REGISTRATION);
            bundle.putString(ChallengeControl.Key.SECURITY_ID, str);
            bundle.putString(ChallengeControl.Key.PHONE_NUMBER, str2);
            bundle.putBoolean(ChallengeControl.Key.WITH_MOBILE_DATA, z);
            intent.putExtras(bundle);
            BokuVerifyActivity.getMin getmin = BokuVerifyActivity.Companion;
            startActivityForResult(intent, BokuVerifyActivity.getMin.getMax());
            return;
        }
        CompassSensorService.length length2 = this.verifyPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyPresenter");
        }
        length2.setMin();
    }

    public static final /* synthetic */ void setMax(VerifyNumberFragment verifyNumberFragment) {
        if (verifyNumberFragment.FastBitmap$CoordinateSystem == null) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(verifyNumberFragment.getMax, new VerifyNumberFragment$Mean$Arithmetic(verifyNumberFragment));
            setmin.setMin = R.drawable.ic_location_permission_icon;
            setmin.length = verifyNumberFragment.getString(R.string.allow_location_access_question);
            setmin.toDoubleRange = Typeface.DEFAULT_BOLD;
            setmin.toFloatRange = R.color.f20392131099953;
            setmin.getMax = verifyNumberFragment.getString(R.string.msg_location_dialog_verifynumber_desc);
            setmin.Grayscale$Algorithm = valueOf.setMin;
            setmin.IsOverlapping = verifyNumberFragment.getString(R.string.option_allow);
            setmin.isInside = verifyNumberFragment.getString(R.string.maybe_later);
            setmin.invoke = true;
            setmin.FastBitmap$CoordinateSystem = new VerifyNumberFragment$Grayscale$Algorithm(verifyNumberFragment);
            DialogPermission.setMin min = setmin.getMin().getMin(false);
            verifyNumberFragment.FastBitmap$CoordinateSystem = new DialogPermission(min.getMin, min.setMax, min, (byte) 0);
        }
        DialogPermission dialogPermission = verifyNumberFragment.FastBitmap$CoordinateSystem;
        if (dialogPermission != null) {
            dialogPermission.setMin();
        }
    }

    public static final /* synthetic */ void getMax(VerifyNumberFragment verifyNumberFragment, String str, int i, int i2, String str2) {
        ChallengeControl.length length2 = new ChallengeControl.length((FtsOptions$Order) verifyNumberFragment);
        length2.getMin = ChallengeScenario.REGISTRATION;
        ChallengeControl.length min = length2.setMin(str);
        if (str2 == null) {
            str2 = "";
        }
        min.IsOverlapping = str2;
        ChallengeControl.length length3 = min;
        length3.equals = 0;
        length3.isInside = i2;
        length3.FastBitmap$CoordinateSystem = i;
        length3.toIntRange = OtpChannel.SMS;
        new ChallengeControl(length3, (byte) 0).getMin();
    }

    public static final /* synthetic */ DialogInterface.OnClickListener isInside(VerifyNumberFragment verifyNumberFragment) {
        return new invoke(verifyNumberFragment);
    }

    public static final /* synthetic */ void getMin(VerifyNumberFragment verifyNumberFragment, String str, String str2, String str3) {
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(verifyNumberFragment.getMax);
        setmax.setMin = verifyNumberFragment.getString(R.string.mobile_data_permission_title);
        setmax.length = verifyNumberFragment.getString(R.string.mobile_data_permission_message);
        setmax.equals = R.drawable.ic_user_privacy;
        setmax.values = verifyNumberFragment.getString(R.string.option_continue);
        setmax.toString = new getCause(verifyNumberFragment, str, str2, str3);
        setmax.FastBitmap$CoordinateSystem = verifyNumberFragment.getString(R.string.option_cancel);
        setmax.hashCode = new ICustomTabsCallback(verifyNumberFragment, str, str2, str3);
        TwoButtonWithImageDialog min = setmax.setMax(false).getMax(false).getMin();
        Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…lse)\n            .build()");
        verifyNumberFragment.toFloatRange = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mobileDataPermissionDialog");
        }
        Button max = min.getMax(-2);
        Intrinsics.checkNotNullExpressionValue(max, "mobileDataPermissionDial…nterface.BUTTON_NEGATIVE)");
        max.setContentDescription(verifyNumberFragment.getString(R.string.btn_boku_cancel));
        TwoButtonWithImageDialog twoButtonWithImageDialog = verifyNumberFragment.toFloatRange;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mobileDataPermissionDialog");
        }
        Button max2 = twoButtonWithImageDialog.getMax(-1);
        Intrinsics.checkNotNullExpressionValue(max2, "mobileDataPermissionDial…nterface.BUTTON_POSITIVE)");
        max2.setContentDescription(verifyNumberFragment.getString(R.string.btn_boku_continue));
        TwoButtonWithImageDialog twoButtonWithImageDialog2 = verifyNumberFragment.toFloatRange;
        if (twoButtonWithImageDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mobileDataPermissionDialog");
        }
        twoButtonWithImageDialog2.setMin();
    }

    public static final /* synthetic */ void getMin(VerifyNumberFragment verifyNumberFragment, String str, String str2, boolean z, String str3) {
        if (str2 != null) {
            int hashCode2 = str2.hashCode();
            if (hashCode2 != -1874218814) {
                if (hashCode2 != -1473941087) {
                    if (hashCode2 == 520970604 && str2.equals(CheckUserAction.REGISTER)) {
                        verifyNumberFragment.getMin(z, str3, str);
                    }
                } else if (str2.equals(CheckUserAction.LOGIN)) {
                    verifyNumberFragment.setMax(z);
                }
            } else if (str2.equals(CheckUserAction.TRUST_RISK_LOGIN)) {
                verifyNumberFragment.getMax(z);
            }
        }
    }

    public static final /* synthetic */ setPublishStatus IsOverlapping(VerifyNumberFragment verifyNumberFragment) {
        return (setPublishStatus) verifyNumberFragment.isInside.getValue();
    }

    public static final /* synthetic */ void values(VerifyNumberFragment verifyNumberFragment) {
        DialogPermission dialogPermission = verifyNumberFragment.FastBitmap$CoordinateSystem;
        if (!(dialogPermission == null || dialogPermission == null)) {
            dialogPermission.setMax();
        }
        verifyNumberFragment.toDoubleRange();
    }

    public static final /* synthetic */ void getMax(VerifyNumberFragment verifyNumberFragment, boolean z, String str) {
        String str2 = "";
        if (!verifyNumberFragment.invokeSuspend || !z) {
            SensorBridgeExtension sensorBridgeExtension = verifyNumberFragment.toIntRange;
            if (sensorBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
            }
            if (str != null) {
                str2 = str;
            }
            String prependZeroToPhoneNumber = isOriginHasAppInfo.prependZeroToPhoneNumber(str);
            Intrinsics.checkNotNullExpressionValue(prependZeroToPhoneNumber, "NumberUtils.prependZeroToPhoneNumber(phoneNumber)");
            sensorBridgeExtension.setMax(str2, prependZeroToPhoneNumber, (String) null, (String) null);
            return;
        }
        SensorBridgeExtension sensorBridgeExtension2 = verifyNumberFragment.toIntRange;
        if (sensorBridgeExtension2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingNavigationManager");
        }
        if (str == null) {
            str = str2;
        }
        String str3 = verifyNumberFragment.hashCode;
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str3, "prizeName");
        BaseKey verifyReferralCodeKey = new VerifyReferralCodeKey(str, str3);
        Intrinsics.checkNotNullParameter(verifyReferralCodeKey, "key");
        sensorBridgeExtension2.getMin.getBackstack().goTo(verifyReferralCodeKey);
    }

    public static final /* synthetic */ void getMin(VerifyNumberFragment verifyNumberFragment, String str) {
        BaseActivity baseActivity = verifyNumberFragment.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        convertDipToPx.length length2 = new convertDipToPx.length(baseActivity.getApplicationContext());
        length2.getMax = TrackerKey.Event.ACCOUNT_LOCK_HELP;
        convertDipToPx.length max = length2.setMax(TrackerKey.AccountLockProperty.ACTION, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.ICustomTabsCallback;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
