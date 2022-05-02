package id.dana.onboarding.boku;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.ChallengeScenario;
import id.dana.di.modules.BokuVerifyModule;
import id.dana.di.modules.LogoutModule;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.onboarding.OnboardingActivity;
import id.dana.richview.InputPhoneView;
import id.dana.tracker.rds.RDSConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.CompassSensorService;
import o.CornerMarkingDataProvider;
import o.PrepareException;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.getInstallPath;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.inTransaction;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSensorChanged;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.stopIgnoring;
import o.updateFavoriteMenuItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020#H\u0014J\u0016\u0010%\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0016\u0010'\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020#H\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u00100\u001a\u00020#H\u0002J\u0014\u00101\u001a\u00020#2\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0002J\u0010\u00104\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0016\u00105\u001a\u00020 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001a\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u00109\u001a\u00020#2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010:\u001a\u00020#H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0004\n\u0002\u0010!¨\u0006<"}, d2 = {"Lid/dana/onboarding/boku/BokuVerifyActivity;", "Lid/dana/base/BaseActivity;", "()V", "bokuVerifyPresenter", "Lid/dana/onboarding/boku/BokuVerifyContract$Presenter;", "getBokuVerifyPresenter", "()Lid/dana/onboarding/boku/BokuVerifyContract$Presenter;", "setBokuVerifyPresenter", "(Lid/dana/onboarding/boku/BokuVerifyContract$Presenter;)V", "challengeMethod", "", "", "data", "Landroid/os/Bundle;", "key", "loadingLogoutDialog", "Lid/dana/dialog/LoadingDialog;", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "logoutPresenter", "Lid/dana/challenge/pin/LogoutContract$Presenter;", "getLogoutPresenter", "()Lid/dana/challenge/pin/LogoutContract$Presenter;", "setLogoutPresenter", "(Lid/dana/challenge/pin/LogoutContract$Presenter;)V", "phoneNumber", "phoneNumberTextWatcher", "Lid/dana/onboarding/verify/VerifyNumberTextWatcher;", "pin", "scenario", "securityId", "withMobileData", "", "Ljava/lang/Boolean;", "chooseActionClick", "", "configToolbar", "defineChallenge", "scenarioList", "fallBackToAnotherChallengeMethod", "getBokuVerifyModule", "Lid/dana/di/modules/BokuVerifyModule;", "getLayout", "", "getLogoutModule", "Lid/dana/di/modules/LogoutModule;", "init", "initBundleData", "initInjector", "proceedLogout", "triggeringView", "Landroid/view/View;", "registerClickListener", "removeBokuChallengeScenario", "setResultVerifyBokuRegistration", "success", "errorMessage", "setupInputPhone", "successVerifyBoku", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BokuVerifyActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public static final int FastBitmap$CoordinateSystem = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public deleteAppInfoById IsOverlapping;
    @Inject
    public onSensorChanged.getMax bokuVerifyPresenter;
    private CompassSensorService.AnonymousClass1 equals;
    private Bundle getMax;
    private LoginResponse getMin;
    private String hashCode;
    private String isInside;
    @Inject
    public inTransaction.getMax logoutPresenter;
    private String setMax;
    private HashMap toDoubleRange;
    private String toFloatRange;
    /* access modifiers changed from: private */
    public List<String> toIntRange = CollectionsKt.emptyList();
    private Boolean toString = Boolean.TRUE;
    private String values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_boku_verify;
    }

    public static final /* synthetic */ void access$chooseActionClick(BokuVerifyActivity bokuVerifyActivity, String str) {
        int max;
        Context baseContext = bokuVerifyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 144689819 == (max = dispatchOnCancelled.getMax(applicationContext, 144689819)))) {
            onCanceled oncanceled = new onCanceled(144689819, max, 512);
            onCancelLoad.setMax(144689819, oncanceled);
            onCancelLoad.getMin(144689819, oncanceled);
        }
        String str2 = "";
        if (Intrinsics.areEqual((Object) str, (Object) "login") || Intrinsics.areEqual((Object) str, (Object) ChallengeScenario.TRUST_RISK_LOGIN) || Intrinsics.areEqual((Object) str, (Object) ChallengeScenario.RELOGIN) || Intrinsics.areEqual((Object) str, (Object) ChallengeScenario.TRUST_RISK_LOGIN_TWILIO)) {
            onSensorChanged.getMax getmax = bokuVerifyActivity.bokuVerifyPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bokuVerifyPresenter");
            }
            LoginResponse loginResponse = bokuVerifyActivity.getMin;
            if (loginResponse == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            }
            String str3 = bokuVerifyActivity.isInside;
            String str4 = str3 == null ? str2 : str3;
            String str5 = bokuVerifyActivity.values;
            String str6 = str5 == null ? str2 : str5;
            String str7 = bokuVerifyActivity.toFloatRange;
            getmax.getMin(loginResponse, str4, str6, str7 == null ? str2 : str7, str);
            return;
        }
        onSensorChanged.getMax getmax2 = bokuVerifyActivity.bokuVerifyPresenter;
        if (getmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bokuVerifyPresenter");
        }
        String str8 = bokuVerifyActivity.hashCode;
        if (str8 == null) {
            str8 = str2;
        }
        String str9 = bokuVerifyActivity.isInside;
        if (str9 != null) {
            str2 = str9;
        }
        Boolean bool = bokuVerifyActivity.toString;
        getmax2.setMax(str8, str2, bool != null ? bool.booleanValue() : true);
    }

    public static final /* synthetic */ void access$defineChallenge(BokuVerifyActivity bokuVerifyActivity, List list) {
        ArrayList arrayList;
        int max;
        Context baseContext = bokuVerifyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -163166277 == (max = dispatchOnCancelled.getMax(applicationContext, -163166277)))) {
            onCanceled oncanceled = new onCanceled(-163166277, max, 512);
            onCancelLoad.setMax(-163166277, oncanceled);
            onCancelLoad.getMin(-163166277, oncanceled);
        }
        if (list.isEmpty()) {
            arrayList = new ArrayList();
        } else if (list != null) {
            arrayList = (ArrayList) list;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        }
        Intent intent = new Intent();
        intent.putStringArrayListExtra(ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST, arrayList);
        bokuVerifyActivity.setResult(1001, intent);
        bokuVerifyActivity.finish();
    }

    public static final /* synthetic */ void access$fallBackToAnotherChallengeMethod(BokuVerifyActivity bokuVerifyActivity, List list) {
        int max;
        Context baseContext = bokuVerifyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2572881 == (max = dispatchOnCancelled.getMax(applicationContext, -2572881)))) {
            onCanceled oncanceled = new onCanceled(-2572881, max, 512);
            onCancelLoad.setMax(-2572881, oncanceled);
            onCancelLoad.getMin(-2572881, oncanceled);
        }
        bokuVerifyActivity.addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).subscribe(new setMax(bokuVerifyActivity, list)));
    }

    public static final /* synthetic */ void access$setResultVerifyBokuRegistration(BokuVerifyActivity bokuVerifyActivity, String str, String str2) {
        int length2;
        int min;
        Context baseContext = bokuVerifyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(630429710, oncanceled);
            onCancelLoad.getMin(630429710, oncanceled);
        }
        Intent intent = new Intent();
        int hashCode2 = str.hashCode();
        if (hashCode2 != -1089036127) {
            if (hashCode2 != -349917684) {
                if (hashCode2 == 709166013 && str.equals("failedNeedResendOtp")) {
                    bokuVerifyActivity.setResult(1001, intent);
                }
            } else if (str.equals("successNeedCheckReferral")) {
                bokuVerifyActivity.setResult(1000, intent);
            }
        } else if (str.equals("errorVerify")) {
            intent.putExtra("errorMessage", str2);
            bokuVerifyActivity.setResult(1002, intent);
        }
        bokuVerifyActivity.finish();
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
    public final onSensorChanged.getMax getBokuVerifyPresenter() {
        onSensorChanged.getMax getmax = this.bokuVerifyPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bokuVerifyPresenter");
        }
        return getmax;
    }

    public final void setBokuVerifyPresenter(@NotNull onSensorChanged.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.bokuVerifyPresenter = getmax;
    }

    public final void configToolbar() {
        setToolbarImage(R.drawable.ic_dana_logo_icon_text);
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/onboarding/boku/BokuVerifyActivity$getLogoutModule$1", "Lid/dana/challenge/pin/LogoutContract$View;", "dismissLoadingLogoutProgress", "", "onFinishLogout", "showLoadingLogoutProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements inTransaction.getMin {
        final /* synthetic */ BokuVerifyActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(BokuVerifyActivity bokuVerifyActivity) {
            this.setMax = bokuVerifyActivity;
        }

        public final void setMax() {
            BokuVerifyActivity bokuVerifyActivity = this.setMax;
            deleteAppInfoById deleteappinfobyid = new deleteAppInfoById(this.setMax);
            if (!deleteappinfobyid.length.isShowing()) {
                try {
                    deleteappinfobyid.length.show();
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
            bokuVerifyActivity.IsOverlapping = deleteappinfobyid;
        }

        public final void getMin() {
            deleteAppInfoById access$getLoadingLogoutDialog$p = this.setMax.IsOverlapping;
            if (access$getLoadingLogoutDialog$p != null) {
                access$getLoadingLogoutDialog$p.getMin();
            }
        }

        public final void getMax() {
            updateFavoriteMenuItem.getMin((Activity) null);
            OnboardingActivity.setMax setmax = OnboardingActivity.Companion;
            OnboardingActivity.setMax.setMax(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/onboarding/boku/BokuVerifyActivity$getBokuVerifyModule$1", "Lid/dana/onboarding/boku/BokuVerifyContract$View;", "onChallenged", "", "challengeMethod", "", "", "onError", "errorMessage", "onFailedVerifyBoku", "scenario", "onSuccessVerifyBoku", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onSensorChanged.getMin {
        final /* synthetic */ BokuVerifyActivity getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        setMin(BokuVerifyActivity bokuVerifyActivity) {
            this.getMin = bokuVerifyActivity;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "scenario");
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.isInTouchMode);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            View _$_findCachedViewById = this.getMin._$_findCachedViewById(resetInternal.setMax.setVerticalBias);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            if (Intrinsics.areEqual((Object) str, (Object) "Login")) {
                BokuVerifyActivity.access$successVerifyBoku(this.getMin);
            } else {
                BokuVerifyActivity.access$setResultVerifyBokuRegistration(this.getMin, "successNeedCheckReferral", (String) null);
            }
        }

        public final void setMax(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST);
            BokuVerifyActivity.access$fallBackToAnotherChallengeMethod(this.getMin, list);
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "scenario");
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.isInTouchMode);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            View _$_findCachedViewById = this.getMin._$_findCachedViewById(resetInternal.setMax.setVerticalBias);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
            if (Intrinsics.areEqual((Object) str, (Object) "Login")) {
                BokuVerifyActivity bokuVerifyActivity = this.getMin;
                BokuVerifyActivity.access$fallBackToAnotherChallengeMethod(bokuVerifyActivity, bokuVerifyActivity.toIntRange);
                return;
            }
            BokuVerifyActivity.access$setResultVerifyBokuRegistration(this.getMin, "failedNeedResendOtp", (String) null);
        }

        public final void showProgress() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.isInTouchMode);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            View _$_findCachedViewById = this.getMin._$_findCachedViewById(resetInternal.setMax.setVerticalBias);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
        }

        public final void onError(@Nullable String str) {
            BokuVerifyActivity.access$setResultVerifyBokuRegistration(this.getMin, "errorVerify", str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BokuVerifyActivity getMin;

        length(BokuVerifyActivity bokuVerifyActivity) {
            this.getMin = bokuVerifyActivity;
        }

        public final void onClick(View view) {
            this.getMin.getMax(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ String getMax;
        final /* synthetic */ BokuVerifyActivity getMin;

        toIntRange(BokuVerifyActivity bokuVerifyActivity, String str) {
            this.getMin = bokuVerifyActivity;
            this.getMax = str;
        }

        public final void onClick(View view) {
            BokuVerifyActivity.access$chooseActionClick(this.getMin, this.getMax);
        }
    }

    static /* synthetic */ void proceedLogout$default(BokuVerifyActivity bokuVerifyActivity, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        bokuVerifyActivity.getMax(view);
    }

    /* access modifiers changed from: private */
    public final void getMax(View view) {
        String str = this.setMax;
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

    private static boolean getMin(List<String> list) {
        return list.size() > 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/onboarding/boku/BokuVerifyActivity$Companion;", "", "()V", "BOKU_VERIFY_REQUEST_CODE", "", "getBOKU_VERIFY_REQUEST_CODE", "()I", "ERROR_VERIFY", "", "FAILED_NEED_RESEND_OTP", "SUCCESS_NEED_CHECK_REFERRAL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static int getMax() {
            return BokuVerifyActivity.FastBitmap$CoordinateSystem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<Long> {
        final /* synthetic */ List getMax;
        final /* synthetic */ BokuVerifyActivity length;

        setMax(BokuVerifyActivity bokuVerifyActivity, List list) {
            this.length = bokuVerifyActivity;
            this.getMax = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            BokuVerifyActivity.access$defineChallenge(this.length, this.getMax);
        }
    }

    public final void init() {
        int max;
        getInstallPath.getMax getmax = new getInstallPath.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        String str = null;
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            getmax.setMin = new LogoutModule(new getMax(this));
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || -1801173328 == (max = dispatchOnCancelled.getMax(applicationContext, -1801173328)))) {
                onCanceled oncanceled = new onCanceled(-1801173328, max, 512);
                onCancelLoad.setMax(-1801173328, oncanceled);
                onCancelLoad.getMin(-1801173328, oncanceled);
            }
            getmax.getMax = new BokuVerifyModule(new setMin(this));
            stopIgnoring.setMin(getmax.setMin, LogoutModule.class);
            stopIgnoring.setMin(getmax.getMax, BokuVerifyModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new getInstallPath(getmax.setMin, getmax.getMax, getmax.setMax, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            inTransaction.getMax getmax2 = this.logoutPresenter;
            if (getmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logoutPresenter");
            }
            getminArr[0] = getmax2;
            registerPresenter(getminArr);
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Intrinsics.checkNotNullExpressionValue(extras, "it");
                this.getMax = extras;
                LoginResponse loginResponse = (LoginResponse) extras.getParcelable(ChallengePinWithFaceActivity.LOGIN_RESPONSE);
                if (loginResponse == null) {
                    loginResponse = new LoginResponse();
                }
                this.getMin = loginResponse;
                if (loginResponse == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ChallengePinWithFaceActivity.LOGIN_RESPONSE);
                }
                this.values = loginResponse.getPin();
                LoginResponse loginResponse2 = this.getMin;
                if (loginResponse2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(ChallengePinWithFaceActivity.LOGIN_RESPONSE);
                }
                this.toFloatRange = loginResponse2.getKey();
                String string = extras.getString(ChallengeControl.Key.SCENARIO, ChallengeScenario.RELOGIN);
                Intrinsics.checkNotNullExpressionValue(string, "getString(ChallengeContr…hallengeScenario.RELOGIN)");
                this.setMax = string;
                List<String> stringArrayList = extras.getStringArrayList(ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST);
                if (stringArrayList == null) {
                    stringArrayList = CollectionsKt.emptyList();
                }
                this.toIntRange = stringArrayList;
                if (getMin(stringArrayList)) {
                    List<String> mutableList = CollectionsKt.toMutableList(stringArrayList);
                    mutableList.remove(0);
                    Unit unit = Unit.INSTANCE;
                    this.toIntRange = mutableList;
                }
                String str2 = this.setMax;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scenario");
                }
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.isGroupDividerEnabled);
                if (textView != null) {
                    textView.setOnClickListener(new length(this));
                }
                Button button = (Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityService);
                if (button != null) {
                    button.setOnClickListener(new toIntRange(this, str2));
                }
                String string2 = extras.getString(ChallengeControl.Key.PHONE_NUMBER, "");
                this.isInside = string2;
                int max2 = dispatchOnCancelled.getMax(0);
                if (max2 != 0) {
                    onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                    onCancelLoad.setMax(-2081725061, oncanceled2);
                    onCancelLoad.getMin(-2081725061, oncanceled2);
                }
                InputPhoneView inputPhoneView = (InputPhoneView) _$_findCachedViewById(resetInternal.setMax.setNeutralButtonIcon);
                Intrinsics.checkNotNullExpressionValue(inputPhoneView, "ipv_phone");
                EditText input = inputPhoneView.getInput();
                Intrinsics.checkNotNullExpressionValue(input, "ipv_phone.input");
                this.equals = new TextWatcher(input, this, false) {
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
                InputPhoneView inputPhoneView2 = (InputPhoneView) _$_findCachedViewById(resetInternal.setMax.setNeutralButtonIcon);
                if (inputPhoneView2 != null) {
                    inputPhoneView2.setEnabled(false);
                    inputPhoneView2.setPrefix(getString(R.string.id_prefix));
                    EditText input2 = inputPhoneView2.getInput();
                    if (input2 != null) {
                        input2.addTextChangedListener(this.equals);
                    }
                    if (string2 != null) {
                        str = new Regex("62").replaceFirst(string2, "");
                    }
                    inputPhoneView2.setInput(str);
                }
                this.hashCode = extras.getString(ChallengeControl.Key.SECURITY_ID, "");
                this.toString = Boolean.valueOf(extras.getBoolean(ChallengeControl.Key.WITH_MOBILE_DATA));
            }
            InputPhoneView inputPhoneView3 = (InputPhoneView) _$_findCachedViewById(resetInternal.setMax.setNeutralButtonIcon);
            if (inputPhoneView3 != null) {
                inputPhoneView3.setEditable(false);
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$successVerifyBoku(BokuVerifyActivity bokuVerifyActivity) {
        bokuVerifyActivity.setResult(-1);
        bokuVerifyActivity.finish();
    }
}
