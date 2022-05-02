package id.dana.richview.profile.switchfaceauth;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.challenge.ChallengeControl;
import id.dana.component.cellcomponent.DanaCellLeftView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.SwitchFaceAuthenticationModule;
import id.dana.dialog.DialogWithImage;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.richview.BlueSwitchView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.PrepareException;
import o.TimerExecutor;
import o.adptApPadding;
import o.click;
import o.getProgressViewStartOffset;
import o.isBaselineAligned;
import o.isShowMenu;
import o.onDelete;
import o.replaceLayoutParam;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setCancelText;
import o.setPublishStatus;
import o.setStateOn;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u0002:\u0002OPB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\bH\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0002J\n\u0010*\u001a\u0004\u0018\u00010)H\u0002J\b\u0010+\u001a\u00020%H\u0002J\u0012\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0017H\u0014J\b\u00100\u001a\u00020%H\u0002J\u0012\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u000103H\u0016J$\u00104\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u0017H\u0016J\b\u00108\u001a\u00020%H\u0002J\b\u00109\u001a\u00020%H\u0016J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020%H\u0016J\b\u0010<\u001a\u00020%H\u0002J\u0017\u0010=\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020%H\u0002J\b\u0010@\u001a\u00020%H\u0002J\u0010\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u00020%H\u0002J\u000e\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020\u0019J\b\u0010F\u001a\u00020%H\u0016J\b\u0010G\u001a\u00020%H\u0002J\b\u0010H\u001a\u00020%H\u0002J\b\u0010I\u001a\u00020%H\u0016J\b\u0010J\u001a\u00020%H\u0002J\u0017\u0010K\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010>J\b\u0010L\u001a\u00020%H\u0016J\u0010\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020\u0017H\u0002R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006Q"}, d2 = {"Lid/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView;", "Lid/dana/base/BaseRichView;", "Lid/dana/switchfaceauth/SwitchFaceAuthContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "faceVerificationInfoDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getFaceVerificationInfoDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "faceVerificationInfoDialog$delegate", "Lkotlin/Lazy;", "failFaceActivationDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "isTouched", "", "listener", "Lid/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView$AuthFaceListener;", "phonePermission", "Lid/dana/utils/permission/Permission;", "successFaceActivationDialog", "suggestToKycDialog", "switchFaceAuthPresenter", "Lid/dana/switchfaceauth/SwitchFaceAuthPresenter;", "getSwitchFaceAuthPresenter", "()Lid/dana/switchfaceauth/SwitchFaceAuthPresenter;", "setSwitchFaceAuthPresenter", "(Lid/dana/switchfaceauth/SwitchFaceAuthPresenter;)V", "activityResultRendering", "", "dismissProgress", "getLayout", "getPinLockedListener", "Landroid/content/DialogInterface$OnClickListener;", "getRiskRejectDialogListener", "initPermission", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "isForRecyclerViewholder", "onButtonFaceActivation", "onError", "errorMessage", "", "onFaceSwitchRiskChallenge", "securityId", "pubKey", "faceAuthNew", "onFaceVerificationInfoClicked", "onFailFaceEnroll", "onFailFaceQuery", "onFailToggle", "onRiskReject", "onSuccessFaceSwitch", "(Ljava/lang/Boolean;)V", "onSwitchCheckedChanged", "onSwitchTouched", "openH5Container", "url", "returnToggleStateBack", "setAuthListener", "authFaceListener", "setup", "showFailFaceActivationPopUp", "showPinLockedDialog", "showProgress", "showSuccessFaceActivation", "showToggleNotification", "toKYC", "toggleColorState", "state", "AuthFaceListener", "PhonePermission", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SwitchFaceAuthenticationView extends BaseRichView implements replaceLayoutParam.length {
    private HashMap IsOverlapping;
    /* access modifiers changed from: private */
    public boolean equals;
    /* access modifiers changed from: private */
    public TwoButtonWithImageDialog getMax;
    /* access modifiers changed from: private */
    public TwoButtonWithImageDialog getMin;
    private getMin isInside;
    private final Lazy length;
    /* access modifiers changed from: private */
    public TwoButtonWithImageDialog setMax;
    private setPublishStatus setMin;
    @Inject
    public adptApPadding switchFaceAuthPresenter;
    /* access modifiers changed from: private */
    public setStateOn toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView$AuthFaceListener;", "", "faceAuthValueListener", "", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/base/callback/DanaH5CallbackKt$withDanaH5Callback$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "bundle", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString implements setCancelOnTouchOutside$core {
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
        }
    }

    @JvmOverloads
    public SwitchFaceAuthenticationView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SwitchFaceAuthenticationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.item_menu_settings_face_auth;
    }

    public final boolean isForRecyclerViewholder() {
        return true;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog access$getFailFaceActivationDialog$p(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = switchFaceAuthenticationView.getMin;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("failFaceActivationDialog");
        }
        return twoButtonWithImageDialog;
    }

    public static final /* synthetic */ setStateOn access$getPhonePermission$p(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        setStateOn setstateon = switchFaceAuthenticationView.toIntRange;
        if (setstateon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        return setstateon;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog access$getSuccessFaceActivationDialog$p(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = switchFaceAuthenticationView.getMax;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("successFaceActivationDialog");
        }
        return twoButtonWithImageDialog;
    }

    public static final /* synthetic */ TwoButtonWithImageDialog access$getSuggestToKycDialog$p(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        TwoButtonWithImageDialog twoButtonWithImageDialog = switchFaceAuthenticationView.setMax;
        if (twoButtonWithImageDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("suggestToKycDialog");
        }
        return twoButtonWithImageDialog;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitchFaceAuthenticationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchFaceAuthenticationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = LazyKt.lazy(new setMax(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SwitchFaceAuthenticationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = LazyKt.lazy(new setMax(this));
    }

    @NotNull
    public final adptApPadding getSwitchFaceAuthPresenter() {
        adptApPadding adptappadding = this.switchFaceAuthPresenter;
        if (adptappadding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchFaceAuthPresenter");
        }
        return adptappadding;
    }

    public final void setSwitchFaceAuthPresenter(@NotNull adptApPadding adptappadding) {
        Intrinsics.checkNotNullParameter(adptappadding, "<set-?>");
        this.switchFaceAuthPresenter = adptappadding;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ SwitchFaceAuthenticationView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            super(0);
            this.this$0 = switchFaceAuthenticationView;
        }

        @NotNull
        public final isBaselineAligned invoke() {
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
            getmax.setMax = R.drawable.ic_illustration_general_selfie;
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.toFloatRange = this.this$0.getResources().getString(R.string.face_verification_info_title);
            getProgressViewStartOffset.getMax getmax3 = getmax2;
            getmax3.isInside = this.this$0.getResources().getString(R.string.face_verification_info_message);
            getProgressViewStartOffset.getMax max = getmax3.setMin(this.this$0.getResources().getString(R.string.face_verification_info_button), new Function1<View, Unit>(this) {
                final /* synthetic */ setMax this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    SwitchFaceAuthenticationView.access$getFaceVerificationInfoDialog$p(this.this$0.this$0).dismiss();
                }
            }).IsOverlapping().setMax(false);
            return new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMax;

        equals(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMax = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            this.getMax.getSwitchFaceAuthPresenter().getMax(true, (String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnTouchListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMax;

        IsOverlapping(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMax = switchFaceAuthenticationView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.getMax.equals = true;
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMin;

        isInside(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMin = switchFaceAuthenticationView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.getMin.equals) {
                this.getMin.equals = false;
                this.getMin.getSwitchFaceAuthPresenter().getMax(z, (String) null);
            }
            this.getMin.setMin(z);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(boolean z) {
        if (z) {
            BlueSwitchView blueSwitchView = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
            blueSwitchView.setTrackTintList(getResources().getColorStateList(R.color.f18392131099713));
            return;
        }
        BlueSwitchView blueSwitchView2 = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
        Intrinsics.checkNotNullExpressionValue(blueSwitchView2, "sv_enable_face_auth");
        blueSwitchView2.setTrackTintList(getResources().getColorStateList(R.color.f24612131100411));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView$activityResultRendering$1", "Lid/dana/myprofile/SettingMoreProfileActivity$Listener;", "onCancelled", "", "reason", "", "onPhonePermissionGranted", "permissionGranted", "", "onSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements SettingMoreProfileActivity.setMax {
        final /* synthetic */ SwitchFaceAuthenticationView length;

        setMin(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.length = switchFaceAuthenticationView;
        }

        public final void setMin() {
            this.length.setMax();
            SwitchFaceAuthenticationView switchFaceAuthenticationView = this.length;
            BlueSwitchView blueSwitchView = (BlueSwitchView) switchFaceAuthenticationView._$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
            switchFaceAuthenticationView.setMin(Boolean.valueOf(!blueSwitchView.isChecked()));
        }

        public final void setMax(@Nullable String str) {
            if (Intrinsics.areEqual((Object) ChallengeControl.CancelReason.PIN_TEMPORARY_LOCKED, (Object) str)) {
                DialogWithImage.length(this.length.getBaseActivity(), new length(this.length)).setMin();
            } else if (Intrinsics.areEqual((Object) "forgot_pin", (Object) str)) {
                SwitchFaceAuthenticationView.access$getPhonePermission$p(this.length).setMin();
            }
            this.length.setMin();
        }

        public final void getMin() {
            click.getMin(this.length.getBaseActivity(), "1500445", true);
        }
    }

    public final void onFaceSwitchRiskChallenge(@Nullable String str, @Nullable String str2, boolean z) {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        ChallengeControl.length length2 = new ChallengeControl.length(baseActivity);
        length2.getMin = "face_activation";
        ChallengeControl.length length3 = length2;
        length3.setMax = "face_activation";
        BlueSwitchView blueSwitchView = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
        Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
        new ChallengeControl(length3.getMin(blueSwitchView.isChecked(), str, str2, z), (byte) 0).getMin();
    }

    public final void onSuccessFaceSwitch(@Nullable Boolean bool) {
        setMax();
        setMin(bool);
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub);
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(getContext());
            setmax.equals = R.drawable.ic_faceenrol_verify;
            setmax.setMin = getResources().getString(R.string.login_face_success_title);
            setmax.length = getResources().getString(R.string.login_face_success_desc);
            TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
            max.values = getResources().getString(R.string.got_it);
            max.toString = new values(this);
            TwoButtonWithImageDialog min = max.getMin();
            Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…\n                .build()");
            this.getMax = min;
            if (min == null) {
                Intrinsics.throwUninitializedPropertyAccessException("successFaceActivationDialog");
            }
            min.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView setMax;

        values(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.setMax = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            SwitchFaceAuthenticationView.access$getSuccessFaceActivationDialog$p(this.setMax).setMax();
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(Boolean bool) {
        BlueSwitchView blueSwitchView = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
        Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
        if (blueSwitchView.getVisibility() != 0) {
            return;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            setCancelText.length(baseActivity, R.drawable.ic_success, R.drawable.bg_rounded_toast_success, getResources().getString(R.string.enabled_face_verification), 48, 60, false, (String) null, 384);
            getMin getmin = this.isInside;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            getmin.setMax();
            return;
        }
        BaseActivity baseActivity2 = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
        setCancelText.length(baseActivity2, R.drawable.ic_success, R.drawable.bg_rounded_toast_success, getResources().getString(R.string.disabled_face_verification), 48, 60, false, (String) null, 384);
        getMin getmin2 = this.isInside;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        getmin2.setMax();
    }

    public final void setAuthListener(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "authFaceListener");
        this.isInside = getmin;
    }

    public final void onFailFaceQuery() {
        length();
    }

    public final void onFailFaceEnroll() {
        length();
    }

    public final void onFailToggle() {
        setMin();
    }

    public final void toKYC() {
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(getContext());
        setmax.equals = R.drawable.ic_premium_feature;
        setmax.setMin = getResources().getString(R.string.lets_update_to_dana_premium);
        setmax.length = getResources().getString(R.string.update_premium_face_login_desc);
        setmax.values = getResources().getString(R.string.upgrade);
        setmax.toString = new SwitchFaceAuthenticationView$FastBitmap$CoordinateSystem(this);
        setmax.FastBitmap$CoordinateSystem = getResources().getString(R.string.option_cancel);
        setmax.hashCode = new valueOf(this);
        TwoButtonWithImageDialog min = setmax.getMin();
        Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…() }\n            .build()");
        this.setMax = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("suggestToKycDialog");
        }
        min.setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class valueOf implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMax;

        valueOf(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMax = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            SwitchFaceAuthenticationView.access$getSuggestToKycDialog$p(this.getMax).setMax();
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        BlueSwitchView blueSwitchView = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
        Intrinsics.checkNotNullExpressionValue(blueSwitchView, "sv_enable_face_auth");
        if (blueSwitchView.getVisibility() == 0) {
            BlueSwitchView blueSwitchView2 = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView2, "sv_enable_face_auth");
            BlueSwitchView blueSwitchView3 = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView3, "sv_enable_face_auth");
            blueSwitchView2.setChecked(!blueSwitchView3.isChecked());
            BlueSwitchView blueSwitchView4 = (BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat);
            Intrinsics.checkNotNullExpressionValue(blueSwitchView4, "sv_enable_face_auth");
            setMin(blueSwitchView4.isChecked());
        }
    }

    public final void showProgress() {
        if (getBaseActivity() != null) {
            setPublishStatus setpublishstatus = new setPublishStatus(getBaseActivity());
            if (!setpublishstatus.length.isShowing()) {
                setpublishstatus.length.show();
                setpublishstatus.getMax.startRefresh();
            }
            Unit unit = Unit.INSTANCE;
            this.setMin = setpublishstatus;
        }
    }

    public final void dismissProgress() {
        setPublishStatus setpublishstatus = this.setMin;
        if (setpublishstatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaLoadingDialog");
        }
        setpublishstatus.getMax();
    }

    private final void length() {
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(getContext());
        setmax.equals = R.drawable.ic_faceenrol_invalid;
        setmax.setMin = getResources().getString(R.string.login_face_fail_title);
        setmax.length = getResources().getString(R.string.login_face_fail_desc);
        TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
        max.values = getResources().getString(R.string.try_again);
        max.toString = new hashCode(this);
        max.FastBitmap$CoordinateSystem = getResources().getString(R.string.later);
        max.hashCode = new toDoubleRange(this);
        TwoButtonWithImageDialog min = max.getMin();
        Intrinsics.checkNotNullExpressionValue(min, "TwoButtonWithImageDialog…() }\n            .build()");
        this.getMin = min;
        if (min == null) {
            Intrinsics.throwUninitializedPropertyAccessException("failFaceActivationDialog");
        }
        min.setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView setMin;

        hashCode(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.setMin = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            this.setMin.getSwitchFaceAuthPresenter().getMax(true, (String) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView setMin;

        toDoubleRange(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.setMin = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            SwitchFaceAuthenticationView.access$getFailFaceActivationDialog$p(this.setMin).setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements DialogInterface.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMax;

        length(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMax = switchFaceAuthenticationView;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (i == -2) {
                dialogInterface.dismiss();
            } else if (i == -1) {
                SwitchFaceAuthenticationView.access$getPhonePermission$p(this.getMax).setMin();
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements DialogInterface.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView setMin;

        getMax(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.setMin = switchFaceAuthenticationView;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (-1 == i) {
                setStateOn access$getPhonePermission$p = SwitchFaceAuthenticationView.access$getPhonePermission$p(this.setMin);
                if (access$getPhonePermission$p != null) {
                    access$getPhonePermission$p.setMin();
                }
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/richview/profile/switchfaceauth/SwitchFaceAuthenticationView$initPermission$1", "Lid/dana/utils/permission/Permission$PermissionListener;", "onPermissionDenied", "", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onPermissionGranted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements setStateOn.length {
        final /* synthetic */ SwitchFaceAuthenticationView getMin;

        public final void setMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
        }

        toIntRange(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMin = switchFaceAuthenticationView;
        }

        public final void getMin(@NotNull setStateOn.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "report");
            click.getMin(this.getMin.getBaseActivity(), "1500445", setmin.setMax());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ SwitchFaceAuthenticationView getMax;

        toFloatRange(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
            this.getMax = switchFaceAuthenticationView;
        }

        public final void onClick(View view) {
            SwitchFaceAuthenticationView.access$getFaceVerificationInfoDialog$p(this.getMax).show();
        }
    }

    public final void setup() {
        ImageView iconCellRight;
        ((LinearLayout) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub)).setOnClickListener(new equals(this));
        ((BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat)).setOnTouchListener(new IsOverlapping(this));
        ((BlueSwitchView) _$_findCachedViewById(resetInternal.setMax.setTextMetricsParamsCompat)).setOnCheckedChangeListener(new isInside(this));
        DanaCellLeftView danaCellLeftView = (DanaCellLeftView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        if (!(danaCellLeftView == null || (iconCellRight = danaCellLeftView.getIconCellRight()) == null)) {
            iconCellRight.setOnClickListener(new toFloatRange(this));
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            ((SettingMoreProfileActivity) baseActivity).setFaceAuthListener(new setMin(this));
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
            getmin.length.add("android.permission.CALL_PHONE");
            getmin.getMax = new toIntRange(this);
            setStateOn setstateon = new setStateOn(getmin, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(setstateon, "Permission.Builder(baseA…  })\n            .build()");
            this.toIntRange = setstateon;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.myprofile.SettingMoreProfileActivity");
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r5) {
        TimerExecutor.getMin getmin = new TimerExecutor.getMin((byte) 0);
        if (r5 != null) {
            getmin.getMin = r5;
            getmin.length = new SwitchFaceAuthenticationModule(this);
            getmin.setMax = new AuthenticationModule(getBaseActivity());
            stopIgnoring.setMin(getmin.length, SwitchFaceAuthenticationModule.class);
            stopIgnoring.setMin(getmin.setMax, AuthenticationModule.class);
            stopIgnoring.setMin(getmin.getMin, PrepareException.AnonymousClass1.class);
            new TimerExecutor(getmin.length, getmin.setMax, getmin.getMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            adptApPadding adptappadding = this.switchFaceAuthPresenter;
            if (adptappadding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchFaceAuthPresenter");
            }
            getminArr[0] = adptappadding;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void onError(@Nullable String str) {
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.length = new getMax(this);
        getmin.toFloatRange = R.drawable.ic_customer_service_png;
        getmin.getMax = getResources().getString(R.string.risk_reject_dialog_title);
        getmin.setMin = getResources().getString(R.string.face_login_failed_cs);
        getmin.getMin = getResources().getString(R.string.risk_reject_positive_button_msg);
        new DialogWithImage(getBaseActivity(), getmin.setMax, getmin, (byte) 0).setMin();
        setMin();
    }

    public static final /* synthetic */ void access$openH5Container(SwitchFaceAuthenticationView switchFaceAuthenticationView, String str) {
        String min = isShowMenu.setMin(str);
        Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(url)");
        DanaH5.startContainerFullUrl(min, new toString());
    }

    public static final /* synthetic */ isBaselineAligned access$getFaceVerificationInfoDialog$p(SwitchFaceAuthenticationView switchFaceAuthenticationView) {
        return (isBaselineAligned) switchFaceAuthenticationView.length.getValue();
    }
}
