package id.dana.twilio.trusteddevice;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.dialog.DialogWithImage;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import id.dana.twilio.trusteddevice.TrustedDeviceBottomSheetHelpActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.PickerBridgeExtension;
import o.PrepareException;
import o.click;
import o.dispatchOnCancelled;
import o.getProgressViewStartOffset;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setCancelText;
import o.setStateOn;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0016J \u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\"\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\u0014H\u0002J\u0012\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0014H\u0002J\b\u00102\u001a\u00020\u0014H\u0002J\u0010\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0014H\u0002J\b\u00106\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u00020\u0014H\u0002J\b\u00108\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\u0014H\u0002J\b\u0010:\u001a\u00020\u0014H\u0002J\u0012\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006>"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceActivity;", "Lid/dana/base/BaseActivity;", "()V", "challengeControl", "Lid/dana/challenge/ChallengeControl;", "confirmDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "contentOnBoardingModels", "Ljava/util/ArrayList;", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "Lkotlin/collections/ArrayList;", "phonePermission", "Lid/dana/utils/permission/Permission;", "trustedDevicePresenter", "Lid/dana/twilio/trusteddevice/TrustedDeviceContract$Presenter;", "getTrustedDevicePresenter", "()Lid/dana/twilio/trusteddevice/TrustedDeviceContract$Presenter;", "setTrustedDevicePresenter", "(Lid/dana/twilio/trusteddevice/TrustedDeviceContract$Presenter;)V", "challengeCanceled", "", "challengeScenario", "", "data", "Landroid/os/Bundle;", "cancelReason", "getDeviceModel", "getLayout", "", "getPinLockedListener", "Landroid/content/DialogInterface$OnClickListener;", "init", "initChallengeControl", "securityId", "registrationSource", "initComponent", "initDeviceDetailItemSubtitle", "initDeviceDetailItemTitle", "initLayoutToolbar", "initPhonePermission", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onClickRemoveButton", "onClickRightMenuButton", "view", "Landroid/view/View;", "openBottomSheetOnBoardingList", "openRemoveDialog", "prepareBundleData", "setConnectedAccountText", "connectedAccount", "setConnectedAccountTextForNonKyc", "setContentOnboarding", "setDeviceModelText", "showFailedToast", "showPinLockedDialog", "showSuccessToast", "warning", "message", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TrustedDeviceActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private ChallengeControl IsOverlapping;
    /* access modifiers changed from: private */
    public setStateOn getMax;
    private final ArrayList<ContentOnBoardingModel> getMin = new ArrayList<>();
    /* access modifiers changed from: private */
    public isBaselineAligned setMax;
    private HashMap toIntRange;
    @Inject
    public PickerBridgeExtension.AnonymousClass4.getMax trustedDevicePresenter;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length2;
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(-431006405, oncanceled);
            onCancelLoad.getMin(-431006405, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-431006405, oncanceled2);
            onCancelLoad.getMin(-431006405, oncanceled2);
        }
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_trusted_device;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TrustedDeviceActivity $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(TrustedDeviceActivity trustedDeviceActivity) {
            super(1);
            this.$this_run = trustedDeviceActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.$this_run.getTrustedDevicePresenter().setMin(TwilioIntroductionActivity.SETTING_PAGE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TrustedDeviceActivity $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(TrustedDeviceActivity trustedDeviceActivity) {
            super(1);
            this.$this_run = trustedDeviceActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            TrustedDeviceActivity.access$getConfirmDialog$p(this.$this_run).dismiss();
        }
    }

    public static final /* synthetic */ isBaselineAligned access$getConfirmDialog$p(TrustedDeviceActivity trustedDeviceActivity) {
        isBaselineAligned isbaselinealigned = trustedDeviceActivity.setMax;
        if (isbaselinealigned == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmDialog");
        }
        return isbaselinealigned;
    }

    public static final /* synthetic */ setStateOn access$getPhonePermission$p(TrustedDeviceActivity trustedDeviceActivity) {
        setStateOn setstateon = trustedDeviceActivity.getMax;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        return setstateon;
    }

    public static final /* synthetic */ void access$openRemoveDialog(TrustedDeviceActivity trustedDeviceActivity) {
        int max;
        Context baseContext = trustedDeviceActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 210570034 == (max = dispatchOnCancelled.getMax(applicationContext, 210570034)))) {
            onCanceled oncanceled = new onCanceled(210570034, max, 512);
            onCancelLoad.setMax(210570034, oncanceled);
            onCancelLoad.getMin(210570034, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(210570034, oncanceled2);
            onCancelLoad.getMin(210570034, oncanceled2);
        }
        TrustedDeviceActivity trustedDeviceActivity2 = trustedDeviceActivity;
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(trustedDeviceActivity2);
        getmax.toFloatRange = trustedDeviceActivity2.getString(R.string.twilio_remove_device_dialog_title);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = trustedDeviceActivity2.getString(R.string.twilio_remove_device_dialog_description);
        getProgressViewStartOffset.getMax min = getmax2.setMax(false).IsOverlapping().getMax(trustedDeviceActivity2.getString(R.string.option_cancel), new toFloatRange(trustedDeviceActivity2)).setMin(trustedDeviceActivity2.getString(R.string.option_remove), new isInside(trustedDeviceActivity2));
        isBaselineAligned min2 = new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin();
        trustedDeviceActivity2.setMax = min2;
        if (min2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmDialog");
        }
        min2.show();
    }

    public static final /* synthetic */ void access$setConnectedAccountText(TrustedDeviceActivity trustedDeviceActivity, String str) {
        int length2;
        Context baseContext = trustedDeviceActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1170786285, oncanceled);
            onCancelLoad.getMin(-1170786285, oncanceled);
        }
        TextView textView = (TextView) trustedDeviceActivity._$_findCachedViewById(resetInternal.setMax.setTrackTintMode);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(trustedDeviceActivity.getString(R.string.connected_account, new Object[]{str}));
        }
    }

    public static final /* synthetic */ void access$setDeviceModelText(TrustedDeviceActivity trustedDeviceActivity) {
        int length2;
        int min;
        Context baseContext = trustedDeviceActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-372572542, oncanceled);
            onCancelLoad.getMin(-372572542, oncanceled);
        }
        TextView textView = (TextView) trustedDeviceActivity._$_findCachedViewById(resetInternal.setMax.applyThumbTint);
        if (textView != null) {
            textView.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            textView.setText(sb.toString());
        }
    }

    @NotNull
    public final PickerBridgeExtension.AnonymousClass4.getMax getTrustedDevicePresenter() {
        PickerBridgeExtension.AnonymousClass4.getMax getmax = this.trustedDevicePresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trustedDevicePresenter");
        }
        return getmax;
    }

    public final void setTrustedDevicePresenter(@NotNull PickerBridgeExtension.AnonymousClass4.getMax getmax) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1639421605, oncanceled);
            onCancelLoad.getMin(1639421605, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.trustedDevicePresenter = getmax;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ChallengeControl challengeControl = this.IsOverlapping;
        if (challengeControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
        }
        if (challengeControl != null) {
            ChallengeControl challengeControl2 = this.IsOverlapping;
            if (challengeControl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
            }
            if (challengeControl2.setMax(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/twilio/trusteddevice/TrustedDeviceActivity$initComponent$1", "Lid/dana/twilio/trusteddevice/TrustedDeviceContract$View;", "onCheckVerification", "", "securityId", "", "challenge", "onDerollVerifyPushFailed", "onDerollVerifyPushSuccess", "onError", "errorMessage", "onKycUser", "nickname", "onNonKycUser", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements PickerBridgeExtension.AnonymousClass4.setMin {
        final /* synthetic */ TrustedDeviceActivity setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(TrustedDeviceActivity trustedDeviceActivity) {
            this.setMin = trustedDeviceActivity;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "nickname");
            TrustedDeviceActivity.access$setConnectedAccountText(this.setMin, str);
            TrustedDeviceActivity.access$setDeviceModelText(this.setMin);
        }

        public final void setMin() {
            TrustedDeviceActivity.access$setConnectedAccountTextForNonKyc(this.setMin);
        }

        public final void getMin() {
            TwilioIntroductionActivity.setMin setmin = TwilioIntroductionActivity.Companion;
            Context applicationContext = this.setMin.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "this@TrustedDeviceActivity.applicationContext");
            this.setMin.startActivity(TwilioIntroductionActivity.setMin.setMin(applicationContext, TwilioIntroductionActivity.TRUSTED_DEVICE_PAGE, ""));
            this.setMin.finish();
        }

        public final void length() {
            setCancelText.length(this.setMin, R.drawable.failed, R.drawable.bg_rounded_toast_failed, this.setMin.getString(R.string.twilio_enroll_failed_message), 48, 60, false, (String) null, 384);
        }

        public final void setMin(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Boolean valueOf = str2 != null ? Boolean.valueOf(StringsKt.equals(str2, "OTP_SMS", true)) : null;
            Intrinsics.checkNotNull(valueOf);
            if (valueOf.booleanValue()) {
                TrustedDeviceActivity.access$initChallengeControl(this.setMin, "twilio_otp", str, "twilio_otp");
            } else {
                TrustedDeviceActivity.access$initChallengeControl(this.setMin, "twilio_pin", str, "twilio_pin");
            }
        }

        public final void onError(@Nullable String str) {
            setCancelText.length(this.setMin, R.drawable.failed, R.drawable.bg_rounded_toast_failed, this.setMin.getString(R.string.twilio_enroll_failed_message), 48, 60, false, (String) null, 384);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/twilio/trusteddevice/TrustedDeviceActivity$initPhonePermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setStateOn.length {
        final /* synthetic */ TrustedDeviceActivity getMin;

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
        }

        getMax(TrustedDeviceActivity trustedDeviceActivity) {
            this.getMin = trustedDeviceActivity;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            click.getMin(this.getMin, "1500445", setmin.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/twilio/trusteddevice/TrustedDeviceActivity$initChallengeControl$1", "Lid/dana/challenge/ChallengeControl$Listener;", "onChallengeCanceled", "", "challengeScenario", "", "cancelReason", "data", "Landroid/os/Bundle;", "onChallengeCompleted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ChallengeControl.getMin {
        final /* synthetic */ TrustedDeviceActivity setMin;

        getMin(TrustedDeviceActivity trustedDeviceActivity) {
            this.setMin = trustedDeviceActivity;
        }

        public final void getMin(@Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
            TrustedDeviceActivity.access$challengeCanceled(this.setMin, str, bundle, str2);
        }

        public final void getMax() {
            this.setMin.getTrustedDevicePresenter().getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements DialogInterface.OnClickListener {
        final /* synthetic */ TrustedDeviceActivity length;

        setMax(TrustedDeviceActivity trustedDeviceActivity) {
            this.length = trustedDeviceActivity;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (i == -2) {
                dialogInterface.dismiss();
            } else if (i == -1) {
                TrustedDeviceActivity.access$getPhonePermission$p(this.length).setMin();
                dialogInterface.dismiss();
            }
        }
    }

    public final void onClickRightMenuButton(@Nullable View view) {
        super.onClickRightMenuButton(view);
        TrustedDeviceBottomSheetHelpActivity.getMax getmax = TrustedDeviceBottomSheetHelpActivity.Companion;
        String string = getString(R.string.trusted_device_bottomsheet_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.trust…device_bottomsheet_title)");
        startActivity(TrustedDeviceBottomSheetHelpActivity.getMax.getMin(this, new OnBoardingModel(string, BottomSheetType.LIST, this.getMin, BottomSheetOnBoardingScenario.TRUSTED_DEVICE)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ TrustedDeviceActivity setMax;

        equals(TrustedDeviceActivity trustedDeviceActivity) {
            this.setMax = trustedDeviceActivity;
        }

        public final void onClick(View view) {
            TrustedDeviceActivity.access$openRemoveDialog(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceActivity$Companion;", "", "()V", "BUNDLE_SUCCESS", "", "createTrustedDeviceIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "success", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @NotNull
        public static Intent getMin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intent intent = new Intent(context, TrustedDeviceActivity.class);
            intent.putExtra("success", true);
            return intent;
        }
    }

    public final void init() {
        int length2;
        int min;
        PickerBridgeExtension.AnonymousClass3.getMin getmin = new PickerBridgeExtension.AnonymousClass3.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        Context context = null;
        if (applicationComponent != null) {
            getmin.setMin = applicationComponent;
            getmin.setMax = new TrustedDeviceModule(new length(this));
            stopIgnoring.setMin(getmin.setMax, TrustedDeviceModule.class);
            stopIgnoring.setMin(getmin.setMin, PrepareException.AnonymousClass1.class);
            new PickerBridgeExtension.AnonymousClass3(getmin.setMax, getmin.setMin, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            PickerBridgeExtension.AnonymousClass4.getMax getmax = this.trustedDevicePresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trustedDevicePresenter");
            }
            getminArr[0] = getmax;
            registerPresenter(getminArr);
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getBoolean("success", false)) {
                setCancelText.length(this, R.drawable.success, R.drawable.bg_rounded_toast_success, getString(R.string.twilio_enroll_success_message), 48, 60, false, (String) null, 384);
            }
            setTitle(getString(R.string.trusted_device_title));
            setMenuLeftButton((int) R.drawable.arrow_left_white);
            setMenuRightButton((int) R.drawable.ic_tooltip_help);
            ArrayList<ContentOnBoardingModel> arrayList = this.getMin;
            String string = getString(R.string.twilio_intro_1_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.twilio_intro_1_title)");
            String string2 = getString(R.string.twilio_intro_1_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.twilio_intro_1_description)");
            arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_twilio_dialog_icon, string, string2));
            ArrayList<ContentOnBoardingModel> arrayList2 = this.getMin;
            String string3 = getString(R.string.twilio_intro_2_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.twilio_intro_2_title)");
            String string4 = getString(R.string.twilio_intro_2_description);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.twilio_intro_2_description)");
            arrayList2.add(new ContentOnBoardingModel((int) R.drawable.ic_receive_notification, string3, string4));
            ArrayList<ContentOnBoardingModel> arrayList3 = this.getMin;
            String string5 = getString(R.string.twilio_intro_3_title);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.twilio_intro_3_title)");
            String string6 = getString(R.string.twilio_intro_3_description);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.twilio_intro_3_description)");
            arrayList3.add(new ContentOnBoardingModel((int) R.drawable.ic_faster_verification, string5, string6));
            setStateOn.getMin getmin2 = new setStateOn.getMin((Activity) this);
            getmin2.length.add("android.permission.CALL_PHONE");
            getmin2.getMax = new getMax(this);
            setStateOn setstateon = new setStateOn(getmin2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(setstateon, "Permission.Builder(this)…  })\n            .build()");
            this.getMax = setstateon;
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                context = baseContext.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-607718120, oncanceled);
                onCancelLoad.getMin(-607718120, oncanceled);
            }
            DeviceDetailView deviceDetailView = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.DoNotInline);
            if (deviceDetailView != null) {
                String string7 = getString(R.string.device_model);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.device_model)");
                deviceDetailView.setTitle(string7);
            }
            DeviceDetailView deviceDetailView2 = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.fromInclusive);
            if (deviceDetailView2 != null) {
                String string8 = getString(R.string.os_version);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.os_version)");
                deviceDetailView2.setTitle(string8);
            }
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max, 16);
                onCancelLoad.setMax(1822818180, oncanceled2);
                onCancelLoad.getMin(1822818180, oncanceled2);
            }
            DeviceDetailView deviceDetailView3 = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.DoNotInline);
            if (deviceDetailView3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(Build.MANUFACTURER);
                sb.append(" ");
                sb.append(Build.MODEL);
                deviceDetailView3.setSubTitle(sb.toString());
            }
            DeviceDetailView deviceDetailView4 = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.fromInclusive);
            if (deviceDetailView4 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getString(R.string.title_device_type));
                sb2.append(Build.VERSION.RELEASE);
                deviceDetailView4.setSubTitle(sb2.toString());
            }
            PickerBridgeExtension.AnonymousClass4.getMax getmax2 = this.trustedDevicePresenter;
            if (getmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trustedDevicePresenter");
            }
            getmax2.length();
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.INotificationSideChannel$Stub);
            if (danaButtonSecondaryView != null) {
                danaButtonSecondaryView.setOnClickListener(new equals(this));
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setConnectedAccountTextForNonKyc(TrustedDeviceActivity trustedDeviceActivity) {
        TextView textView = (TextView) trustedDeviceActivity._$_findCachedViewById(resetInternal.setMax.setTrackTintMode);
        if (textView != null) {
            textView.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            textView.setText(sb.toString());
        }
    }

    public static final /* synthetic */ void access$initChallengeControl(TrustedDeviceActivity trustedDeviceActivity, String str, String str2, String str3) {
        ChallengeControl.length length2 = new ChallengeControl.length((BaseActivity) trustedDeviceActivity);
        if (str == null) {
            str = "";
        }
        length2.getMin = str;
        ChallengeControl.length length3 = length2;
        if (str2 == null) {
            str2 = "";
        }
        length3.IsOverlapping = str2;
        ChallengeControl.length length4 = length3;
        if (str3 == null) {
            str3 = "";
        }
        length4.setMax = str3;
        ChallengeControl.length length5 = length4;
        length5.toString = new getMin(trustedDeviceActivity);
        ChallengeControl challengeControl = new ChallengeControl(length5, (byte) 0);
        trustedDeviceActivity.IsOverlapping = challengeControl;
        if (challengeControl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeControl");
        }
        challengeControl.getMin();
    }

    public static final /* synthetic */ void access$challengeCanceled(TrustedDeviceActivity trustedDeviceActivity, String str, Bundle bundle, String str2) {
        if (Intrinsics.areEqual((Object) str, (Object) "twilio_otp")) {
            if ((bundle != null ? bundle.getString("message") : null) != null) {
                String string = bundle.getString("message");
                if (string == null) {
                    string = "";
                }
                trustedDeviceActivity.showWarningDialog(string);
            }
        } else if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -305104263) {
                if (hashCode != -109866462) {
                    if (hashCode == 462997423 && str2.equals(ChallengeControl.CancelReason.SESSION_EXPIRED)) {
                        trustedDeviceActivity.showWarningDialog(trustedDeviceActivity.getString(R.string.session_expired));
                    }
                } else if (str2.equals(ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED)) {
                    DialogWithImage.length(trustedDeviceActivity, new setMax(trustedDeviceActivity)).setMin();
                }
            } else if (str2.equals("forgot_pin")) {
                setStateOn setstateon = trustedDeviceActivity.getMax;
                if (setstateon == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
                }
                setstateon.setMin();
            }
        }
    }
}
