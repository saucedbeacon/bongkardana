package id.dana.challenge;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.alibaba.wireless.security.SecExceptionCode;
import id.dana.R;
import id.dana.base.ViewPagerBaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.pinwithface.ChallengePinWithFaceModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.danah5.DanaH5;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.foundation.logger.log.LoginTrackingConstants;
import id.dana.data.login.source.network.model.VerifyMethod;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.PinChallengeModule;
import id.dana.dialog.LoginInfoDialog;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.boku.BokuVerifyActivity;
import id.dana.popup.LockableViewPager;
import id.dana.richview.PinEntryEditText;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.rds.RDSConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.Helper;
import o.JavaBlurProcess;
import o.PrepareException;
import o.ScreenBrightnessBridgeExtension;
import o.TinyAppActionStateListener;
import o.assertNotMainThread;
import o.beginTransaction;
import o.compileStatement;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.drawHorizontalDivider;
import o.expose;
import o.genTextSelector;
import o.getContentDescription;
import o.getInstalledAppVersion;
import o.getSeletedItem;
import o.getShortName;
import o.inTransaction;
import o.isBaselineAligned;
import o.isMainThread;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSubmit;
import o.remover;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.setParallaxDistance;
import o.setStateOn;
import o.smoothSlideOpen;
import o.stopIgnoring;
import o.updateActionSheetContent;
import o.updateFavoriteMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020:H\u0002J\u0010\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020:H\u0002J\b\u0010H\u001a\u00020CH\u0002J\b\u0010I\u001a\u00020CH\u0016J\b\u0010J\u001a\u00020CH\u0014J\b\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020CH\u0002J\b\u0010T\u001a\u00020UH\u0002J\u0012\u0010V\u001a\u00020W2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0016\u0010X\u001a\u00020C2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020:0ZH\u0002J\b\u0010[\u001a\u00020CH\u0016J\b\u0010\\\u001a\u00020CH\u0016J\u0012\u0010]\u001a\u00020C2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\"\u0010^\u001a\u00020C2\u0006\u0010_\u001a\u00020R2\u0006\u0010`\u001a\u00020R2\b\u0010\f\u001a\u0004\u0018\u00010aH\u0014J\b\u0010b\u001a\u00020CH\u0016J\b\u0010c\u001a\u00020CH\u0002J\b\u0010d\u001a\u00020CH\u0014J\b\u0010e\u001a\u00020CH\u0002J\u0018\u0010f\u001a\u00020C2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010ZH\u0016J \u0010g\u001a\u00020C2\u0006\u0010h\u001a\u00020i2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010ZH\u0016J\b\u0010j\u001a\u00020CH\u0002J+\u0010k\u001a\u00020C2\u0006\u0010_\u001a\u00020R2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020:0m2\u0006\u0010n\u001a\u00020oH\u0016¢\u0006\u0002\u0010pJ\b\u0010q\u001a\u00020CH\u0016J\b\u0010r\u001a\u00020CH\u0002J\u0014\u0010s\u001a\u00020C2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010uH\u0002J\b\u0010v\u001a\u00020CH\u0002J\b\u0010w\u001a\u00020CH\u0002J\u0010\u0010x\u001a\u00020C2\u0006\u0010y\u001a\u00020RH\u0002J\u0012\u0010z\u001a\u00020C2\b\u0010{\u001a\u0004\u0018\u00010:H\u0002J\u001e\u0010|\u001a\u00020C2\u0006\u0010}\u001a\u00020:2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020:0ZH\u0002J\u0017\u0010~\u001a\u0004\u0018\u00010C2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010J\t\u0010\u0001\u001a\u00020CH\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\u001a\u0010\u0001\u001a\u00020C2\u0006\u0010D\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\t\u0010\u0001\u001a\u00020CH\u0016JF\u0010\u0001\u001a\u00020C2\u0006\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J#\u0010\u0001\u001a\u00020C2\u0006\u0010D\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\t\u0010\u0001\u001a\u00020CH\u0002J\u001a\u0010\u0001\u001a\u00020C2\u0006\u0010D\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020:H\u0002J\r\u0010\u0001\u001a\u00020C*\u00020aH\u0002J\"\u0010\u0001\u001a\u00020\u0015*\u00020a2\u0007\u0010\u0001\u001a\u00020:2\t\b\u0002\u0010\u0001\u001a\u00020\u0015H\u0002J\u001f\u0010\u0001\u001a\u00020C*\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00152\u0006\u0010D\u001a\u00020:H\u0002J \u0010\u0001\u001a\u00020C*\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00152\u0007\u0010\u0001\u001a\u00020\u0015H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R#\u0010-\u001a\n /*\u0004\u0018\u00010.0.8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b0\u00101R\u001e\u00103\u001a\u0002048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X.¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X.¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/challenge/ChallengePinWithFaceActivity;", "Lid/dana/base/ViewPagerBaseActivity;", "Lid/dana/challenge/ChallengeScenarioListener;", "()V", "challengePinWithFacePresenter", "Lid/dana/challenge/pinwithface/ChallengePinWithFaceContract$Presenter;", "getChallengePinWithFacePresenter", "()Lid/dana/challenge/pinwithface/ChallengePinWithFaceContract$Presenter;", "setChallengePinWithFacePresenter", "(Lid/dana/challenge/pinwithface/ChallengePinWithFaceContract$Presenter;)V", "challengeScenario", "Lid/dana/challenge/scenario/ScenarioFacade;", "data", "Landroid/os/Bundle;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "faceOnlyLogin", "", "inputPinTextWatcher", "Lid/dana/utils/DanaTextWatcher;", "getInputPinTextWatcher", "()Lid/dana/utils/DanaTextWatcher;", "inputPinTextWatcher$delegate", "Lkotlin/Lazy;", "isShowFaceLoginActionVisible", "()Z", "keyboardHeightProvider", "Lid/dana/utils/KeyboardHeightProvider;", "knowledgeBasedAuthEnable", "loadingLogoutDialog", "Lid/dana/dialog/LoadingDialog;", "loginFaceDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "loginInfoDialog", "Lid/dana/dialog/LoginInfoDialog;", "logoutPresenter", "Lid/dana/challenge/pin/LogoutContract$Presenter;", "getLogoutPresenter", "()Lid/dana/challenge/pin/LogoutContract$Presenter;", "setLogoutPresenter", "(Lid/dana/challenge/pin/LogoutContract$Presenter;)V", "permission", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "getPermission", "()Lid/dana/utils/permission/Permission;", "permission$delegate", "presenter", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "getPresenter", "()Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "setPresenter", "(Lid/dana/challenge/pin/AbstractPinContract$Presenter;)V", "scenario", "", "securityId", "trackPinModel", "Lid/dana/tracker/model/TrackPinModel;", "userAlreadyEnrollFaceLogin", "userAlreadyKYC", "userRiskEnable", "withMobileData", "backToPhoneNumberFormAndViewPopUp", "", "errorMessage", "reason", "chooseLoginType", "text", "closeActivity", "closeChallengeSession", "configToolbar", "getChallengePinWithFaceModule", "Lid/dana/challenge/pinwithface/ChallengePinWithFaceModule;", "getFaceAuthPopUpConsultationModule", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationModule;", "getInputPinOnFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getLayout", "", "getLogSeedId", "getLogoutModule", "Lid/dana/di/modules/LogoutModule;", "getPinChallengeModule", "Lid/dana/di/modules/PinChallengeModule;", "goToBokuVerify", "challengeMethod", "", "hideClose", "init", "initInjector", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onBackPressed", "onComplete", "onDestroy", "onForgotPin", "onNext", "onNextBokuFirst", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onPadFaceClicked", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "openKnowledgeBasedAuthPage", "proceedLogout", "triggeringView", "Landroid/view/View;", "registerClickListener", "setKeyboardVisibilityListener", "setPopupViewPagerBottomPadding", "paddingBottom", "setTitleBasedOnRegistrationSource", "registrationSource", "setupChallengeScenario", "challengeScenarioMethod", "setupDataFromExtras", "(Landroid/os/Bundle;)Lkotlin/Unit;", "setupInputPin", "setupViewPagerChallenge", "showAccountFrozenDialog", "isTempLock", "showCallCustomerServiceDialog", "showClose", "showErrorMessage", "isTryAgain", "isWrongPin", "isShowCallCSDialog", "isAccountFroze", "showFaceLoginUpgradePremiumPopup", "showIncorrectPinDialog", "showProgressDialog", "showSuccessDialog", "trackDisplayedErrorLogin", "displayedMessage", "checkChallengeScenario", "get", "key", "defaultValue", "setAccountFrozenDialogButtonCallback", "Lid/dana/dialog/LoginInfoDialog$Builder;", "setIncorrectPinDialogButtonCallback", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChallengePinWithFaceActivity extends ViewPagerBaseActivity implements beginTransaction {
    @NotNull
    public static final String CHALLENGE_METHOD_LIST = "challengeMethod";
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String LOGIN_RESPONSE = "loginResponse";
    public static final int RESULT_CODE_NEED_FALLBACK = 1001;
    /* access modifiers changed from: private */
    public boolean FastBitmap$CoordinateSystem;
    private boolean Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public String IsOverlapping;
    private HashMap Mean$Arithmetic;
    @Inject
    public setParallaxDistance.length challengePinWithFacePresenter;
    @Inject
    public getShortName dynamicUrlWrapper;
    private final Lazy equals = LazyKt.lazy(toFloatRange.INSTANCE);
    private String getMax;
    private Bundle getMin;
    /* access modifiers changed from: private */
    public deleteAppInfoById hashCode;
    private boolean invoke;
    private final Lazy invokeSuspend = LazyKt.lazy(new isInside(this));
    /* access modifiers changed from: private */
    public boolean isInside;
    @Inject
    public inTransaction.getMax logoutPresenter;
    @Inject
    public isMainThread.getMax presenter;
    private smoothSlideOpen setMax;
    /* access modifiers changed from: private */
    public LoginInfoDialog toDoubleRange;
    private JavaBlurProcess toFloatRange;
    private getSeletedItem toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    private boolean valueOf;
    private TwoButtonWithImageDialog values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.Mean$Arithmetic;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.Mean$Arithmetic == null) {
            this.Mean$Arithmetic = new HashMap();
        }
        View view = (View) this.Mean$Arithmetic.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.Mean$Arithmetic.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_input_pin_or_face;
    }

    public final void hideClose() {
    }

    public final void onBackPressed() {
    }

    public final void showClose() {
    }

    public static final /* synthetic */ void access$chooseLoginType(ChallengePinWithFaceActivity challengePinWithFaceActivity, String str) {
        int length2;
        Context baseContext = challengePinWithFaceActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1107204437, oncanceled);
            onCancelLoad.getMin(1107204437, oncanceled);
        }
        String str2 = challengePinWithFaceActivity.getMax;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenario");
        }
        if (Intrinsics.areEqual((Object) ChallengeScenario.TRUST_RISK_LOGIN, (Object) str2)) {
            isMainThread.getMax getmax = challengePinWithFaceActivity.presenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            String str3 = challengePinWithFaceActivity.IsOverlapping;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BioUtilityBridge.SECURITY_ID);
            }
            getmax.getMin(str, str3, challengePinWithFaceActivity.isInside);
            return;
        }
        isMainThread.getMax getmax2 = challengePinWithFaceActivity.presenter;
        if (getmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmax2.getMax(str, challengePinWithFaceActivity.isInside);
    }

    public static final /* synthetic */ void access$closeActivity(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1866320760, oncanceled);
            onCancelLoad.getMin(1866320760, oncanceled);
        }
        Intent putExtra = new Intent().putExtra(ChallengeControl.Key.CANCEL_REASON, "forgot_pin");
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .pu….CancelReason.FORGOT_PIN)");
        challengePinWithFaceActivity.setResult(0, putExtra);
        challengePinWithFaceActivity.finish();
    }

    public static final /* synthetic */ String access$getSecurityId$p(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        String str = challengePinWithFaceActivity.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BioUtilityBridge.SECURITY_ID);
        }
        return str;
    }

    public static final /* synthetic */ void access$setPopupViewPagerBottomPadding(ChallengePinWithFaceActivity challengePinWithFaceActivity, int i) {
        int length2;
        int min;
        int min2;
        Context baseContext = challengePinWithFaceActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1624583662, oncanceled);
            onCancelLoad.getMin(1624583662, oncanceled);
        }
        Context baseContext2 = challengePinWithFaceActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1624583662, oncanceled2);
            onCancelLoad.getMin(1624583662, oncanceled2);
        }
        LockableViewPager lockableViewPager = (LockableViewPager) challengePinWithFaceActivity._$_findCachedViewById(resetInternal.setMax.isInOverlayMode);
        Intrinsics.checkNotNullExpressionValue(lockableViewPager, "it");
        lockableViewPager.setPadding(lockableViewPager.getPaddingLeft(), lockableViewPager.getPaddingTop(), lockableViewPager.getPaddingRight(), i);
    }

    public static final /* synthetic */ void access$showErrorMessage(ChallengePinWithFaceActivity challengePinWithFaceActivity, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        int i2;
        int max;
        int length2;
        int min;
        String str3;
        int length3;
        ChallengePinWithFaceActivity challengePinWithFaceActivity2 = challengePinWithFaceActivity;
        String str4 = str;
        String str5 = str2;
        boolean z6 = z2;
        if (str4 != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max2 = dispatchOnCancelled.setMax(i);
        boolean z7 = true;
        if (i != max2) {
            onCanceled oncanceled = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(836653853, oncanceled);
            onCancelLoad.getMin(836653853, oncanceled);
        }
        if (z3) {
            challengePinWithFaceActivity.toIntRange();
            return;
        }
        Context context = null;
        if (z4) {
            Context baseContext = challengePinWithFaceActivity.getBaseContext();
            if (baseContext != null) {
                context = baseContext.getApplicationContext();
            }
            if (!(context == null || (length3 = dispatchOnCancelled.length(context, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length3, 4);
                onCancelLoad.setMax(-1211758157, oncanceled2);
                onCancelLoad.getMin(-1211758157, oncanceled2);
            }
            if (z5) {
                str3 = challengePinWithFaceActivity.getString(R.string.lbl_dialog_account_temp_freeze);
                Intrinsics.checkNotNullExpressionValue(str3, "getString(R.string.lbl_dialog_account_temp_freeze)");
            } else {
                str3 = challengePinWithFaceActivity.getString(R.string.lbl_dialog_account_freeze);
                Intrinsics.checkNotNullExpressionValue(str3, "getString(R.string.lbl_dialog_account_freeze)");
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) challengePinWithFaceActivity._$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.clearFocus();
            }
            LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(challengePinWithFaceActivity2);
            getmax.equals = str3;
            getmax.IsOverlapping = str4;
            LoginInfoDialog.getMax length4 = getmax.setMin().length();
            length4.getMax = false;
            length4.hashCode = R.drawable.rounded_white_8dp;
            length4.values = R.drawable.ic_lock_account;
            if (z5) {
                String string = challengePinWithFaceActivity.getString(R.string.lbl_dialog_understand);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.lbl_dialog_understand)");
                if (string != null) {
                    String upperCase = string.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                    length4.toFloatRange = upperCase;
                    length4.toDoubleRange = new hashCode(challengePinWithFaceActivity);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                LoginInfoDialog loginInfoDialog = challengePinWithFaceActivity2.toDoubleRange;
                if (loginInfoDialog != null) {
                    loginInfoDialog.setMax();
                }
                Intent putExtra = new Intent().putExtra("message", str);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n               …LE_MESSAGE, errorMessage)");
                putExtra.putExtra(ChallengeControl.Key.CANCEL_REASON, ChallengeControl.CancelReason.ACCOUNT_FROZEN);
                challengePinWithFaceActivity.setResult(0, putExtra);
                challengePinWithFaceActivity.finish();
            }
            Unit unit = Unit.INSTANCE;
            LoginInfoDialog loginInfoDialog2 = new LoginInfoDialog(length4.setMax, length4.setMin, length4.length, length4, (byte) 0);
            loginInfoDialog2.setMin();
            Unit unit2 = Unit.INSTANCE;
            challengePinWithFaceActivity2.toDoubleRange = loginInfoDialog2;
        } else if (z6) {
            Context baseContext2 = challengePinWithFaceActivity.getBaseContext();
            Context applicationContext = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(1407371430, oncanceled3);
                onCancelLoad.getMin(1407371430, oncanceled3);
            }
            PinEntryEditText pinEntryEditText2 = (PinEntryEditText) challengePinWithFaceActivity._$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText2 != null) {
                pinEntryEditText2.clearFocus();
            }
            LoginInfoDialog.getMax getmax2 = new LoginInfoDialog.getMax(challengePinWithFaceActivity2);
            getmax2.equals = challengePinWithFaceActivity.getString(R.string.lbl_dialog_incorrect_pin_title);
            getmax2.IsOverlapping = str4;
            LoginInfoDialog.getMax length5 = getmax2.setMin().length();
            length5.getMax = false;
            length5.hashCode = R.drawable.rounded_white_8dp;
            length5.values = R.drawable.ic_warning_14;
            Context baseContext3 = challengePinWithFaceActivity.getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || 52132373 == (max = dispatchOnCancelled.getMax(context, 52132373)))) {
                onCanceled oncanceled4 = new onCanceled(52132373, max, 512);
                onCancelLoad.setMax(52132373, oncanceled4);
                onCancelLoad.getMin(52132373, oncanceled4);
            }
            if (z) {
                if (z6) {
                    String string2 = challengePinWithFaceActivity.getString(R.string.forgot_pin);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.forgot_pin)");
                    if (string2 != null) {
                        String upperCase2 = string2.toUpperCase();
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
                        length5.isInside = upperCase2;
                        length5.toIntRange = new values(challengePinWithFaceActivity, z6);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String string3 = challengePinWithFaceActivity.getString(R.string.try_again);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.try_again)");
                if (string3 != null) {
                    String upperCase3 = string3.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "(this as java.lang.String).toUpperCase()");
                    length5.toFloatRange = upperCase3;
                    length5.toDoubleRange = new toString(challengePinWithFaceActivity);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                length5.toFloatRange = challengePinWithFaceActivity.getString(17039370);
                length5.toDoubleRange = new valueOf(challengePinWithFaceActivity);
            }
            Unit unit3 = Unit.INSTANCE;
            LoginInfoDialog loginInfoDialog3 = new LoginInfoDialog(length5.setMax, length5.setMin, length5.length, length5, (byte) 0);
            loginInfoDialog3.setMin();
            Unit unit4 = Unit.INSTANCE;
            challengePinWithFaceActivity2.toDoubleRange = loginInfoDialog3;
        } else {
            if (str4 != null) {
                i2 = str.length();
            } else {
                i2 = 0;
            }
            int max3 = dispatchOnCancelled.setMax(i2);
            if (i2 != max3) {
                onCanceled oncanceled5 = new onCanceled(i2, max3, 1);
                onCancelLoad.setMax(1619650778, oncanceled5);
                onCancelLoad.getMin(1619650778, oncanceled5);
            }
            Intent putExtra2 = new Intent().putExtra("message", str);
            Intrinsics.checkNotNullExpressionValue(putExtra2, "Intent()\n            .pu…LE_MESSAGE, errorMessage)");
            if (str5.length() <= 0) {
                z7 = false;
            }
            if (z7) {
                putExtra2.putExtra(ChallengeControl.Key.CANCEL_REASON, str2);
            }
            challengePinWithFaceActivity.setResult(0, putExtra2);
            challengePinWithFaceActivity.finish();
        }
    }

    public static final /* synthetic */ void access$showProgressDialog(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1867726621, oncanceled);
            onCancelLoad.getMin(1867726621, oncanceled);
        }
        LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(challengePinWithFaceActivity);
        getmax.IsOverlapping = challengePinWithFaceActivity.getString(R.string.verifying_your_account);
        getmax.getMax = false;
        LoginInfoDialog.getMax length2 = getmax.setMin().length();
        length2.values = R.drawable.ic_loading_bg;
        LoginInfoDialog loginInfoDialog = new LoginInfoDialog(length2.setMax, length2.setMin, length2.length, length2, (byte) 0);
        loginInfoDialog.setMin();
        Unit unit = Unit.INSTANCE;
        challengePinWithFaceActivity.toDoubleRange = loginInfoDialog;
    }

    @NotNull
    public final setParallaxDistance.length getChallengePinWithFacePresenter() {
        setParallaxDistance.length length2 = this.challengePinWithFacePresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengePinWithFacePresenter");
        }
        return length2;
    }

    public final void setChallengePinWithFacePresenter(@NotNull setParallaxDistance.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.challengePinWithFacePresenter = length2;
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    @NotNull
    public final inTransaction.getMax getLogoutPresenter() {
        inTransaction.getMax getmax = this.logoutPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoutPresenter");
        }
        return getmax;
    }

    public final void setLogoutPresenter(@NotNull inTransaction.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.logoutPresenter = getmax;
    }

    @NotNull
    public final isMainThread.getMax getPresenter() {
        isMainThread.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmax;
    }

    public final void setPresenter(@NotNull isMainThread.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.presenter = getmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/utils/DanaTextWatcher;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<onSubmit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(0);
        }

        @NotNull
        public final onSubmit invoke() {
            return new onSubmit();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ ChallengePinWithFaceActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            super(0);
            this.this$0 = challengePinWithFaceActivity;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this.this$0);
            getmin.length.add("android.permission.CAMERA");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ isInside getMin;

                public final void setMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                }

                {
                    this.getMin = r1;
                }

                public final void getMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    if (ChallengePinWithFaceActivity.access$getSecurityId$p(this.getMin.this$0).length() > 0) {
                        this.getMin.this$0.getChallengePinWithFacePresenter().setMin(ChallengePinWithFaceActivity.access$getSecurityId$p(this.getMin.this$0));
                    }
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    public final void onStart() {
        super.onStart();
        isMainThread.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmax.setMin();
    }

    public final void configToolbar() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 671028788 == (max = dispatchOnCancelled.getMax(applicationContext, 671028788)))) {
            onCanceled oncanceled = new onCanceled(671028788, max, 512);
            onCancelLoad.setMax(671028788, oncanceled);
            onCancelLoad.getMin(671028788, oncanceled);
        }
        setToolbarImage(R.drawable.ic_dana_logo_icon_text);
        setMenuLeftButton(getString(R.string.logout));
    }

    public final void init() {
        String str;
        int length2;
        int length3;
        int min;
        this.toFloatRange = new JavaBlurProcess(getApplicationContext());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        Context context = null;
        int i = 0;
        if (extras != null) {
            Intrinsics.checkNotNullExpressionValue(extras, "it");
            this.getMin = extras;
            String string = extras.getString(ChallengeControl.Key.SCENARIO, ChallengeScenario.RELOGIN);
            Intrinsics.checkNotNullExpressionValue(string, "getString(ChallengeContr…hallengeScenario.RELOGIN)");
            this.getMax = string;
            if (string == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenario");
            }
            this.setMax = assertNotMainThread.setMax(string, extras);
            String str2 = "";
            String string2 = extras.getString(ChallengeControl.Key.SECURITY_ID, str2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(ChallengeControl.Key.SECURITY_ID, \"\")");
            this.IsOverlapping = string2;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                Intent intent3 = intent2;
                this.isInside = get$default(this, intent3, ChallengeControl.Key.WITH_MOBILE_DATA, false, 2, (Object) null);
                this.FastBitmap$CoordinateSystem = get$default(this, intent3, ChallengeControl.Key.FACE_ONLY_LOGIN, false, 2, (Object) null);
                this.Grayscale$Algorithm = get$default(this, intent3, ChallengeControl.Key.FACE_LOGIN_ENROLLED, false, 2, (Object) null);
                this.valueOf = get$default(this, intent3, ChallengeControl.Key.KYC_FLAG, false, 2, (Object) null);
                this.invoke = get$default(this, intent3, ChallengeControl.Key.RISK_FLAG, false, 2, (Object) null);
                JavaBlurProcess javaBlurProcess = this.toFloatRange;
                if (javaBlurProcess == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("trackPinModel");
                }
                String str3 = this.getMax;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scenario");
                }
                javaBlurProcess.length = TinyAppActionStateListener.setMax(str3);
                Unit unit = Unit.INSTANCE;
            }
            String str4 = this.getMax;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenario");
            }
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length3)))) {
                onCanceled oncanceled = new onCanceled(length3, min, 32);
                onCancelLoad.setMax(1132676757, oncanceled);
                onCancelLoad.getMin(1132676757, oncanceled);
            }
            getInstalledAppVersion.getMin getmin = new getInstalledAppVersion.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.length = applicationComponent;
                getmin.getMin = new PinChallengeModule(new toIntRange(this, str4), str4);
                getmin.setMin = new LogoutModule(new getMax(this));
                getmin.setMax = new AuthenticationModule(this);
                getmin.getMax = new ChallengePinWithFaceModule(new getMin(this));
                new FaceAuthPopUpConsultationModule(new setMin());
                stopIgnoring.setMin(getmin.getMin, PinChallengeModule.class);
                stopIgnoring.setMin(getmin.setMax, AuthenticationModule.class);
                stopIgnoring.setMin(getmin.getMax, ChallengePinWithFaceModule.class);
                stopIgnoring.setMin(getmin.setMin, LogoutModule.class);
                stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
                new getInstalledAppVersion(getmin.getMin, getmin.setMax, getmin.getMax, getmin.setMin, getmin.length, (byte) 0).getMin(this);
                onDelete.getMin[] getminArr = new onDelete.getMin[1];
                isMainThread.getMax getmax = this.presenter;
                if (getmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                getminArr[0] = getmax;
                registerPresenter(getminArr);
                getMin();
                str = extras.getString(ChallengeControl.Key.REGISTRATION_SOURCE);
                JavaBlurProcess javaBlurProcess2 = this.toFloatRange;
                if (javaBlurProcess2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("trackPinModel");
                }
                convertDipToPx.length length4 = new convertDipToPx.length(javaBlurProcess2.setMin);
                length4.getMax = TrackerKey.Event.PIN_REQUEST;
                if (!TextUtils.isEmpty(javaBlurProcess2.length)) {
                    str2 = javaBlurProcess2.length;
                }
                convertDipToPx.length max = length4.setMax("Source", str2);
                ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
                if (!ScreenBrightnessBridgeExtension.Grayscale$Algorithm().isEmpty()) {
                    ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
                    max.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
                } else {
                    max.setMax("Merchant Name", javaBlurProcess2.setMin.getString(R.string.dana_string));
                }
                max.setMin();
                genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
                isMainThread.getMax getmax2 = this.presenter;
                if (getmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                getmax2.getMax();
            } else {
                throw null;
            }
        } else {
            str = null;
        }
        if (str != null && StringsKt.equals("TIX ID, Bukalapak, or Ramayana App", str, true)) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setOnDismissListener);
            Intrinsics.checkNotNullExpressionValue(textView, "input_pin_message");
            textView.setText(getString(R.string.registration_source_merchant_app));
        }
        Activity activity = this;
        setOnWheelViewListener.setMin(activity);
        PinEntryEditText pinEntryEditText = (PinEntryEditText) _$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.requestFocus();
        }
        PinEntryEditText pinEntryEditText2 = (PinEntryEditText) _$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon);
        if (pinEntryEditText2 != null) {
            pinEntryEditText2.setOnFocusChangeListener(setMax.setMax);
            ((onSubmit) this.equals.getValue()).getMax(pinEntryEditText2, new invoke(pinEntryEditText2, this));
        }
        getSeletedItem getseleteditem = new getSeletedItem(activity);
        if (!getseleteditem.isShowing()) {
            View decorView = getseleteditem.length.getWindow().getDecorView();
            decorView.post(new getContentDescription(getseleteditem, decorView));
        }
        getseleteditem.getMin = new invokeSuspend(this);
        Unit unit2 = Unit.INSTANCE;
        this.toIntRange = getseleteditem;
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = dispatchOnCancelled.length(context, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1049231942, oncanceled2);
            onCancelLoad.getMin(-1049231942, oncanceled2);
        }
        ((TextView) _$_findCachedViewById(resetInternal.setMax.generateDefaultLayoutParams)).setOnClickListener(new equals(this));
        ((TextView) _$_findCachedViewById(resetInternal.setMax.isGroupDividerEnabled)).setOnClickListener(new IsOverlapping(this));
        ((ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn)).setOnClickListener(new ChallengePinWithFaceActivity$FastBitmap$CoordinateSystem(this));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(resetInternal.setMax.saveActionViewStates);
        if (lottieAnimationView != null) {
            View view = lottieAnimationView;
            boolean min2 = setMin();
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!min2) {
                i = 8;
            }
            view.setVisibility(i);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(resetInternal.setMax.saveActionViewStates);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setOnClickListener(new toDoubleRange(this));
        }
        if (setMin()) {
            length();
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        List list;
        if (-1 == i2) {
            BokuVerifyActivity.getMin getmin = BokuVerifyActivity.Companion;
            if (BokuVerifyActivity.getMin.getMax() == i) {
                getMax();
                super.onActivityResult(i, i2, intent);
            }
        }
        if (1001 == i2) {
            BokuVerifyActivity.getMin getmin2 = BokuVerifyActivity.Companion;
            if (BokuVerifyActivity.getMin.getMax() == i && intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(CHALLENGE_METHOD_LIST);
                if (stringArrayListExtra == null || (list = CollectionsKt.toMutableList(stringArrayListExtra)) == null) {
                    list = CollectionsKt.emptyList();
                }
                onNext(list);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onDestroy() {
        getSeletedItem getseleteditem = this.toIntRange;
        if (getseleteditem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardHeightProvider");
        }
        getseleteditem.dismiss();
        super.onDestroy();
    }

    public final void onNext(@Nullable List<String> list) {
        ViewGroup.LayoutParams layoutParams;
        int max;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setElevation);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_popup_input");
            _$_findCachedViewById.setVisibility(8);
            getMax();
        } else if (Intrinsics.areEqual((Object) VerifyMethod.VERIFY_BOKU, (Object) list.get(0))) {
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || 1139102807 == (max = dispatchOnCancelled.getMax(applicationContext, 1139102807)))) {
                onCanceled oncanceled = new onCanceled(1139102807, max, 512);
                onCancelLoad.setMax(1139102807, oncanceled);
                onCancelLoad.getMin(1139102807, oncanceled);
            }
            Intent intent = new Intent(this, BokuVerifyActivity.class);
            Bundle bundle = this.getMin;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            }
            if (list != null) {
                bundle.putStringArrayList(CHALLENGE_METHOD_LIST, (ArrayList) list);
                Bundle bundle2 = this.getMin;
                if (bundle2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                }
                intent.putExtras(bundle2);
                BokuVerifyActivity.getMin getmin = BokuVerifyActivity.Companion;
                startActivityForResult(intent, BokuVerifyActivity.getMin.getMax());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        } else if (Intrinsics.areEqual((Object) "OTP_SMS", (Object) list.get(0))) {
            int max2 = setOnWheelViewListener.setMax((Activity) this) + SecExceptionCode.SEC_ERROR_SIGNATURE_LOW_VERSION_DATA_FILE;
            View _$_findCachedViewById2 = _$_findCachedViewById(resetInternal.setMax.setElevation);
            if (!(_$_findCachedViewById2 == null || (layoutParams = _$_findCachedViewById2.getLayoutParams()) == null)) {
                layoutParams.height = max2;
            }
            getMax(ChallengeScenario.TRUST_RISK_LOGIN, list);
            ImageButton imageButton = (ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn);
            Intrinsics.checkNotNullExpressionValue(imageButton, "close");
            imageButton.setVisibility(0);
        } else if (Intrinsics.areEqual((Object) VerifyMethod.PUSH_VERIFY, (Object) list.get(0))) {
            getMax(ChallengeScenario.TRUST_RISK_LOGIN_TWILIO, list);
            ImageButton imageButton2 = (ImageButton) _$_findCachedViewById(resetInternal.setMax.reportFullyDrawn);
            Intrinsics.checkNotNullExpressionValue(imageButton2, "close");
            imageButton2.setVisibility(8);
        } else {
            View _$_findCachedViewById3 = _$_findCachedViewById(resetInternal.setMax.setElevation);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "view_popup_input");
            _$_findCachedViewById3.setVisibility(0);
        }
    }

    public final void onNextBokuFirst(@NotNull LoginResponse loginResponse, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(loginResponse, LOGIN_RESPONSE);
        Intent intent = new Intent(this, BokuVerifyActivity.class);
        Bundle bundle = this.getMin;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
        }
        bundle.putParcelable(LOGIN_RESPONSE, loginResponse);
        Bundle bundle2 = this.getMin;
        if (bundle2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
        }
        if (list != null) {
            bundle2.putStringArrayList(CHALLENGE_METHOD_LIST, (ArrayList) list);
            Bundle bundle3 = this.getMin;
            if (bundle3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            }
            intent.putExtras(bundle3);
            BokuVerifyActivity.getMin getmin = BokuVerifyActivity.Companion;
            startActivityForResult(intent, BokuVerifyActivity.getMin.getMax());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
    }

    public final void closeChallengeSession() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1370325742, oncanceled);
            onCancelLoad.getMin(-1370325742, oncanceled);
        }
        setOnWheelViewListener.getMax((Activity) this);
        finish();
    }

    static /* synthetic */ boolean get$default(ChallengePinWithFaceActivity challengePinWithFaceActivity, Intent intent, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return challengePinWithFaceActivity.setMax(intent, str, z);
    }

    private final boolean setMax(Intent intent, String str, boolean z) {
        int length2;
        int min;
        int length3 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length3);
        if (length3 != max) {
            onCanceled oncanceled = new onCanceled(length3, max, 1);
            onCancelLoad.setMax(447019774, oncanceled);
            onCancelLoad.getMin(447019774, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(447019774, oncanceled2);
            onCancelLoad.getMin(447019774, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(intent, "$this$get");
        return intent.getBooleanExtra(str, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\u0010\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"id/dana/challenge/ChallengePinWithFaceActivity$getPinChallengeModule$1", "Lid/dana/challenge/pin/AbstractPinContract$View;", "dismissProgress", "", "onBokuFristChallenge", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "challengeMethod", "", "", "onChallenged", "onCheckFeatureFaceLoginEnable", "faceLoginEnable", "", "onCheckKnowledgeBasedAuthFeatureSuccess", "knowledgeBasedAuthEnable", "onError", "errorMessage", "errorCode", "leftTimes", "", "onSuccess", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements isMainThread.getMin {
        final /* synthetic */ String getMax;
        final /* synthetic */ ChallengePinWithFaceActivity length;

        toIntRange(ChallengePinWithFaceActivity challengePinWithFaceActivity, String str) {
            this.length = challengePinWithFaceActivity;
            this.getMax = str;
        }

        public final /* synthetic */ void getMin(String str, String str2, Integer num) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(148490230, oncanceled);
                onCancelLoad.getMin(148490230, oncanceled);
            }
            getMax(str, str2, num.intValue());
        }

        public final void showProgress() {
            ChallengePinWithFaceActivity.access$showProgressDialog(this.length);
        }

        public final void dismissProgress() {
            LoginInfoDialog access$getLoginInfoDialog$p = this.length.toDoubleRange;
            if (access$getLoginInfoDialog$p != null) {
                access$getLoginInfoDialog$p.setMax();
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.FACE_LOGIN_CACHE_EXPIRED) != false) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ERROR_CODE_DANA_PIN_TEMPORARY_LOCK_1) != false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ERROR_CODE_DANA_PIN_TEMPORARY_LOCK_3) != false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
            r4 = r13;
            r5 = id.dana.challenge.ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED;
            r6 = false;
            r7 = false;
            r8 = false;
            r9 = true;
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.SESSION_EXPIRED) != false) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
            r11.length.setResult(0, new android.content.Intent().putExtra(id.dana.challenge.ChallengeControl.Key.CANCEL_REASON, id.dana.challenge.ChallengeControl.CancelReason.SESSION_EXPIRED));
            r11.length.finish();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ACCESS_TOKEN_NOT_ACTIVE) != false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ACCESS_TOKEN_NOT_EXIST) != false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.USER_NOT_EXIST) != false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ERROR_RISK_REJECT) != false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
            r4 = r13;
            r5 = "";
            r6 = false;
            r7 = false;
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if (r12.equals(id.dana.constants.ErrorCode.ERROR_CODE_DANA_PIN_OR_OTP_TEMPORARY_LOCK) != false) goto L_0x006c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void getMax(@org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, int r14) {
            /*
                r11 = this;
                java.lang.String r0 = "errorMessage"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r0 = 0
                r1 = 1
                java.lang.String r2 = ""
                if (r12 != 0) goto L_0x000d
                goto L_0x00d1
            L_0x000d:
                int r3 = r12.hashCode()
                switch(r3) {
                    case -1814081712: goto L_0x00c3;
                    case -1814079792: goto L_0x00ba;
                    case -1814073965: goto L_0x00b1;
                    case -1814073964: goto L_0x00a8;
                    case -1813066891: goto L_0x0097;
                    case 279505925: goto L_0x0077;
                    case 408588464: goto L_0x0064;
                    case 408588589: goto L_0x005b;
                    case 995395557: goto L_0x0052;
                    case 1658411398: goto L_0x001f;
                    case 1787494118: goto L_0x0016;
                    default: goto L_0x0014;
                }
            L_0x0014:
                goto L_0x00d1
            L_0x0016:
                java.lang.String r14 = "AE15102058020051"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x006c
            L_0x001f:
                java.lang.String r3 = "AE15002058020050"
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x00d1
                if (r14 != r1) goto L_0x0038
                id.dana.challenge.ChallengePinWithFaceActivity r12 = r11.length
                r14 = 2131887766(0x7f120696, float:1.9410148E38)
                java.lang.String r12 = r12.getString(r14)
                java.lang.String r14 = "getString(R.string.lbl_d…rect_pin_or_otp_last_try)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r14)
                goto L_0x0047
            L_0x0038:
                java.lang.String r5 = java.lang.String.valueOf(r14)
                r6 = 0
                r7 = 4
                r8 = 0
                java.lang.String r4 = "{{leftTimes}}"
                r3 = r13
                java.lang.String r12 = kotlin.text.StringsKt.replace$default((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6, (int) r7, (java.lang.Object) r8)
            L_0x0047:
                id.dana.challenge.ChallengePinWithFaceActivity r14 = r11.length
                o.BlurProcess.getMin(r14, id.dana.data.tracker.TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, r13, r12, "Login")
                r4 = r12
                r5 = r2
                r6 = 1
                r7 = 1
                goto L_0x00da
            L_0x0052:
                java.lang.String r14 = "AE13101858018140"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x007f
            L_0x005b:
                java.lang.String r14 = "AE15101858018047"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x006c
            L_0x0064:
                java.lang.String r14 = "AE15101858018006"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
            L_0x006c:
                java.lang.String r2 = "pin_temporary_locked"
                r4 = r13
                r5 = r2
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 1
                goto L_0x00dd
            L_0x0077:
                java.lang.String r14 = "AE15001858018060"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
            L_0x007f:
                id.dana.challenge.ChallengePinWithFaceActivity r12 = r11.length
                android.content.Intent r13 = new android.content.Intent
                r13.<init>()
                java.lang.String r14 = "cancel_reason"
                java.lang.String r1 = "sessionExpired"
                android.content.Intent r13 = r13.putExtra(r14, r1)
                r12.setResult(r0, r13)
                id.dana.challenge.ChallengePinWithFaceActivity r12 = r11.length
                r12.finish()
                return
            L_0x0097:
                java.lang.String r14 = "AE15112158065208"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                java.lang.String r2 = "account_frozen"
                r4 = r13
                r5 = r2
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                goto L_0x00dc
            L_0x00a8:
                java.lang.String r14 = "AE15112158052821"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x00cb
            L_0x00b1:
                java.lang.String r14 = "AE15112158052820"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x00cb
            L_0x00ba:
                java.lang.String r14 = "AE15112158052201"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
                goto L_0x00cb
            L_0x00c3:
                java.lang.String r14 = "AE15112158052003"
                boolean r12 = r12.equals(r14)
                if (r12 == 0) goto L_0x00d1
            L_0x00cb:
                r4 = r13
                r5 = r2
                r6 = 0
                r7 = 0
                r8 = 1
                goto L_0x00db
            L_0x00d1:
                id.dana.challenge.ChallengePinWithFaceActivity r12 = r11.length
                o.BlurProcess.getMin(r12, id.dana.data.tracker.TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, r13, r13, "Login")
                r4 = r13
                r5 = r2
                r6 = 1
                r7 = 0
            L_0x00da:
                r8 = 0
            L_0x00db:
                r9 = 0
            L_0x00dc:
                r10 = 0
            L_0x00dd:
                id.dana.challenge.ChallengePinWithFaceActivity r3 = r11.length
                id.dana.challenge.ChallengePinWithFaceActivity.access$showErrorMessage(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.challenge.ChallengePinWithFaceActivity.toIntRange.getMax(java.lang.String, java.lang.String, int):void");
        }

        public final void onError(@Nullable String str) {
            if (str != null) {
                getMax((String) null, str, 0);
            }
        }

        public final void getMin() {
            convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.INPUT_PIN_LOST_FOCUS, false)};
            for (int i = 0; i <= 0; i++) {
                convertsptopxArr[0].length();
            }
            if (Intrinsics.areEqual((Object) "login", (Object) this.getMax) || Intrinsics.areEqual((Object) ChallengeScenario.TRUST_RISK_LOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.SUCCESS_TO_HOME, "");
            } else if (Intrinsics.areEqual((Object) ChallengeScenario.RELOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.SUCCESS_TO_HOME, "");
            }
            this.length.onNext((List<String>) null);
        }

        public final void setMax(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST);
            if (Intrinsics.areEqual((Object) "login", (Object) this.getMax) || Intrinsics.areEqual((Object) ChallengeScenario.TRUST_RISK_LOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.SUCCESS_TO_OTPLOGIN, "");
            } else if (Intrinsics.areEqual((Object) ChallengeScenario.RELOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.SUCCESS_TO_OTPLOGIN, "");
            }
            this.length.onNext(list);
        }

        public final void length(@NotNull LoginResponse loginResponse, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            Intrinsics.checkNotNullParameter(list, ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST);
            if (Intrinsics.areEqual((Object) "login", (Object) this.getMax) || Intrinsics.areEqual((Object) ChallengeScenario.TRUST_RISK_LOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.SUCCESS_TO_OTPLOGIN, "");
            } else if (Intrinsics.areEqual((Object) ChallengeScenario.RELOGIN, (Object) this.getMax)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.SUCCESS_TO_OTPLOGIN, "");
            }
            this.length.onNextBokuFirst(loginResponse, list);
        }

        public final void length(boolean z) {
            this.length.toString = z;
        }

        public final void getMin(boolean z) {
            this.length.FastBitmap$CoordinateSystem = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/challenge/ChallengePinWithFaceActivity$getLogoutModule$1", "Lid/dana/challenge/pin/LogoutContract$View;", "dismissLoadingLogoutProgress", "", "onFinishLogout", "showLoadingLogoutProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements inTransaction.getMin {
        final /* synthetic */ ChallengePinWithFaceActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.length = challengePinWithFaceActivity;
        }

        public final void setMax() {
            ChallengePinWithFaceActivity challengePinWithFaceActivity = this.length;
            deleteAppInfoById deleteappinfobyid = new deleteAppInfoById(this.length);
            if (!deleteappinfobyid.length.isShowing()) {
                try {
                    deleteappinfobyid.length.show();
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
            challengePinWithFaceActivity.hashCode = deleteappinfobyid;
        }

        public final void getMin() {
            deleteAppInfoById access$getLoadingLogoutDialog$p = this.length.hashCode;
            if (access$getLoadingLogoutDialog$p != null) {
                access$getLoadingLogoutDialog$p.getMin();
            }
        }

        public final void getMax() {
            updateFavoriteMenuItem.getMin((Activity) null);
            OnboardingActivity.setMax setmax = OnboardingActivity.Companion;
            Activity activity = this.length;
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            activity.startActivity(OnboardingActivity.setMax.getMin(activity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/challenge/ChallengePinWithFaceActivity$getChallengePinWithFaceModule$1", "Lid/dana/challenge/pinwithface/ChallengePinWithFaceContract$View;", "onFailFaceQuery", "", "errorCode", "", "onFailVerifyAuth", "onFailVerifyEnrolment", "onSuccessFaceQuery", "securityId", "", "onSuccessVerifyAuth", "onSuccessVerifyEnrolment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements setParallaxDistance.setMin {
        final /* synthetic */ ChallengePinWithFaceActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.length = challengePinWithFaceActivity;
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            this.length.getPresenter().getMin("", str, this.length.isInside);
        }

        public final void setMax(int i) {
            if (i == 1001) {
                this.length.finish();
            } else if (i == 1003 && this.length.FastBitmap$CoordinateSystem) {
                ChallengePinWithFaceActivity.proceedLogout$default(this.length, (View) null, 1, (Object) null);
            }
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            this.length.getChallengePinWithFacePresenter().getMin(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/challenge/ChallengePinWithFaceActivity$getFaceAuthPopUpConsultationModule$1", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements remover.setMax {
        @JvmDefault
        public final void dismissProgress() {
        }

        public final void length(boolean z) {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin() {
        }
    }

    private final void getMin() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        smoothSlideOpen smoothslideopen = this.setMax;
        if (smoothslideopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeScenario");
        }
        registerViewPager((LockableViewPager) _$_findCachedViewById(resetInternal.setMax.isInOverlayMode), new compileStatement(supportFragmentManager, smoothslideopen.length()));
        ((LockableViewPager) _$_findCachedViewById(resetInternal.setMax.isInOverlayMode)).setSwipeable(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"id/dana/challenge/ChallengePinWithFaceActivity$setupInputPin$1$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "p0", "", "p1", "", "p2", "p3", "onTextChanged", "charSequence", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class invoke implements TextWatcher {
        final /* synthetic */ ChallengePinWithFaceActivity getMax;
        final /* synthetic */ PinEntryEditText getMin;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        invoke(PinEntryEditText pinEntryEditText, ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.getMin = pinEntryEditText;
            this.getMax = challengePinWithFaceActivity;
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() == this.getMin.getMaxLength()) {
                ChallengePinWithFaceActivity.access$chooseLoginType(this.getMax, String.valueOf(charSequence));
                ChallengePinWithFaceActivity.access$getLogSeedId(this.getMax);
            }
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            String obj = editable != null ? editable.toString() : null;
            if (obj == null) {
                obj = "";
            }
            convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_key_down", (String) RDSConstant.INPUT_PIN, expose.length(obj))};
            for (int i = 0; i <= 0; i++) {
                convertsptopxArr[0].length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "paddingBottom", "", "onHeightChanged", "id/dana/challenge/ChallengePinWithFaceActivity$setKeyboardVisibilityListener$1$1"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend implements getSeletedItem.length {
        final /* synthetic */ ChallengePinWithFaceActivity setMax;

        invokeSuspend(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMax = challengePinWithFaceActivity;
        }

        public final void setMin(int i) {
            ChallengePinWithFaceActivity.access$setPopupViewPagerBottomPadding(this.setMax, i);
        }
    }

    private final boolean setMin() {
        return this.Grayscale$Algorithm && this.invoke;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnFocusChangeListener {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final void onFocusChange(@Nullable View view, boolean z) {
            if (z) {
                convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.INPUT_PIN_GET_FOCUS, true)};
                for (int i = 0; i <= 0; i++) {
                    convertsptopxArr[0].length();
                }
            }
        }
    }

    private final void getMax(String str, List<String> list) {
        this.getMax = str;
        Bundle bundle = this.getMin;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
        }
        if (list != null) {
            bundle.putStringArrayList(CHALLENGE_METHOD_LIST, (ArrayList) list);
            String str2 = this.getMax;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenario");
            }
            Bundle bundle2 = this.getMin;
            if (bundle2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
            }
            this.setMax = assertNotMainThread.setMax(str2, bundle2);
            getMin();
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setElevation);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_popup_input");
            _$_findCachedViewById.setVisibility(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity setMax;

        equals(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMax = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            ChallengePinWithFaceActivity.access$onForgotPin(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity setMin;

        IsOverlapping(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMin = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            this.setMin.getMax(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity setMin;

        toDoubleRange(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMin = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            this.setMin.length();
        }
    }

    static /* synthetic */ void proceedLogout$default(ChallengePinWithFaceActivity challengePinWithFaceActivity, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        challengePinWithFaceActivity.getMax(view);
    }

    /* access modifiers changed from: private */
    public final void getMax(View view) {
        String str = this.getMax;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenario");
        }
        if (Intrinsics.areEqual((Object) ChallengeScenario.RELOGIN, (Object) str)) {
            inTransaction.getMax getmax = this.logoutPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logoutPresenter");
            }
            getmax.length();
            return;
        }
        if (view != null) {
            setOnWheelViewListener.length(view);
        }
        finish();
    }

    /* access modifiers changed from: private */
    public final void length() {
        if (this.Grayscale$Algorithm) {
            ((setStateOn) this.invokeSuspend.getValue()).setMin();
        } else if (!this.valueOf) {
            setMax();
        }
    }

    private final void setMax() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1441756089, oncanceled);
            onCancelLoad.getMin(1441756089, oncanceled);
        }
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(this);
        setmax.setMin = getString(R.string.lets_update_to_dana_premium);
        setmax.length = getString(R.string.update_premium_face_login_desc);
        setmax.equals = R.drawable.ic_premium_feature;
        TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
        max.values = getString(R.string.got_it);
        max.toString = new ChallengePinWithFaceActivity$Grayscale$Algorithm(this);
        max.toDoubleRange = 1;
        TwoButtonWithImageDialog min = max.getMin();
        min.setMin();
        Unit unit = Unit.INSTANCE;
        this.values = min;
    }

    private final void getMax() {
        LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(this);
        getmax.IsOverlapping = getString(R.string.verification_success);
        getmax.getMax = true;
        LoginInfoDialog.getMax length2 = getmax.setMin().length();
        length2.values = R.drawable.ic_success;
        Integer num = 1000;
        length2.getMin = num.intValue();
        length2.setMin = new getCause(this);
        LoginInfoDialog loginInfoDialog = new LoginInfoDialog(length2.setMax, length2.setMin, length2.length, length2, (byte) 0);
        loginInfoDialog.setMin();
        Unit unit = Unit.INSTANCE;
        this.toDoubleRange = loginInfoDialog;
        setOnWheelViewListener.length((View) (LockableViewPager) _$_findCachedViewById(resetInternal.setMax.isInOverlayMode));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class getCause implements DialogInterface.OnDismissListener {
        final /* synthetic */ ChallengePinWithFaceActivity setMax;

        getCause(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMax = challengePinWithFaceActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            ChallengePinWithFaceActivity.access$onComplete(this.setMax);
        }
    }

    private final void toIntRange() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(811103911, oncanceled);
            onCancelLoad.getMin(811103911, oncanceled);
        }
        isBaselineAligned.negativeButton$default(isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(this, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null).cancelOnTouchOutside(false), Integer.valueOf(R.string.call_customer_question), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.option_call), (CharSequence) null, new ChallengePinWithFaceActivity$Mean$Arithmetic(this), 2, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity getMin;
        final /* synthetic */ boolean length;

        values(ChallengePinWithFaceActivity challengePinWithFaceActivity, boolean z) {
            this.getMin = challengePinWithFaceActivity;
            this.length = z;
        }

        public final void onClick(View view) {
            PinEntryEditText pinEntryEditText;
            if (this.length && (pinEntryEditText = (PinEntryEditText) this.getMin._$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon)) != null) {
                TextView textView = pinEntryEditText;
                Intrinsics.checkNotNullParameter(textView, "$this$clearText");
                textView.setText("");
            }
            ChallengePinWithFaceActivity.access$onForgotPin(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toString implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity length;

        toString(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.length = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.length._$_findCachedViewById(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                TextView textView = pinEntryEditText;
                Intrinsics.checkNotNullParameter(textView, "$this$clearText");
                textView.setText("");
            }
            LoginInfoDialog access$getLoginInfoDialog$p = this.length.toDoubleRange;
            if (access$getLoginInfoDialog$p != null) {
                access$getLoginInfoDialog$p.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class valueOf implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity getMin;

        valueOf(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.getMin = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            this.getMin.setResult(0, new Intent().putExtra(ChallengeControl.Key.CANCEL_REASON, "close"));
            this.getMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ ChallengePinWithFaceActivity setMin;

        hashCode(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
            this.setMin = challengePinWithFaceActivity;
        }

        public final void onClick(View view) {
            LoginInfoDialog access$getLoginInfoDialog$p = this.setMin.toDoubleRange;
            if (access$getLoginInfoDialog$p != null) {
                access$getLoginInfoDialog$p.setMax();
            }
            this.setMin.setResult(0, new Intent().putExtra(ChallengeControl.Key.CANCEL_REASON, "close"));
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/challenge/ChallengePinWithFaceActivity$Companion;", "", "()V", "CHALLENGE_METHOD_LIST", "", "LAST_TRY_PIN_BEFORE_FREEZE", "", "LOGIN_RESPONSE", "MERCHANT_APP_IDENTIFIER", "OTP_BOTTOMSHEET_HEIGHT", "RESULT_CODE_NEED_FALLBACK", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (!((setStateOn) this.invokeSuspend.getValue()).getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static final /* synthetic */ void access$getLogSeedId(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        String str = challengePinWithFaceActivity.getMax;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenario");
        }
        int hashCode2 = str.hashCode();
        if (hashCode2 != 103149417) {
            if (hashCode2 != 1090898198) {
                if (hashCode2 != 1573803584 || !str.equals(ChallengeScenario.TRUST_RISK_LOGIN)) {
                    return;
                }
            } else if (str.equals(ChallengeScenario.RELOGIN)) {
                updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.BEGIN, "");
                return;
            } else {
                return;
            }
        } else if (!str.equals("login")) {
            return;
        }
        updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.BEGIN, "");
    }

    public static final /* synthetic */ void access$onForgotPin(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        LoginInfoDialog loginInfoDialog = challengePinWithFaceActivity.toDoubleRange;
        if (loginInfoDialog != null) {
            loginInfoDialog.setMax();
        }
        JavaBlurProcess javaBlurProcess = challengePinWithFaceActivity.toFloatRange;
        if (javaBlurProcess == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackPinModel");
        }
        convertDipToPx.length length2 = new convertDipToPx.length(javaBlurProcess.setMin);
        length2.getMax = TrackerKey.Event.PIN_FORGOT;
        convertDipToPx.length max = length2.setMax("Source", TextUtils.isEmpty(javaBlurProcess.length) ? "" : javaBlurProcess.length);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        if (challengePinWithFaceActivity.toString) {
            getShortName getshortname = challengePinWithFaceActivity.dynamicUrlWrapper;
            if (getshortname == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
            }
            String forgotPinUrl = getshortname.getForgotPinUrl();
            Intrinsics.checkNotNullExpressionValue(forgotPinUrl, "dynamicUrlWrapper.forgotPinUrl");
            DanaH5.startContainerFullUrl(forgotPinUrl);
            return;
        }
        challengePinWithFaceActivity.toIntRange();
    }

    public static final /* synthetic */ void access$onComplete(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        ((LockableViewPager) challengePinWithFaceActivity._$_findCachedViewById(resetInternal.setMax.isInOverlayMode)).requestFocus();
        setOnWheelViewListener.length((View) (LockableViewPager) challengePinWithFaceActivity._$_findCachedViewById(resetInternal.setMax.isInOverlayMode));
        if (challengePinWithFaceActivity.setMax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeScenario");
        }
        challengePinWithFaceActivity.setResult(-1);
        challengePinWithFaceActivity.finish();
    }
}
