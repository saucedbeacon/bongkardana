package id.dana.onboarding.confirmpin;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.KeyBaseActivity;
import id.dana.di.modules.ConfirmPinModule;
import id.dana.di.modules.TncSummaryModules;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.welcome.WelcomeActivity;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.PinEntryEditText;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.constant.BottomSheetType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AUScreenUtils;
import o.AppxPrerunChecker;
import o.BlurProcess;
import o.ConfirmPopup;
import o.MultiInstanceInvalidationClient$1;
import o.MultiInstanceInvalidationService;
import o.PrepareException;
import o.SensorBridgeExtension;
import o.ToolUtils;
import o.WheelView;
import o.checkApFlag;
import o.checkOppoConcave;
import o.convertDipToPx;
import o.deleteInstallStatus;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setH5MenuList;
import o.setOnWheelViewListener;
import o.setWhiteListAP;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00019B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020!H\u0014J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020!H\u0002J\u0012\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u00102\u001a\u00020!H\u0016J\b\u00103\u001a\u00020!H\u0016J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002J\u0012\u00106\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00107\u001a\u00020!H\u0016J\b\u00108\u001a\u00020!H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006:"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinFragment;", "Lid/dana/base/KeyBaseFragment;", "Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/onboarding/confirmpin/ConfirmPinKey;", "Lid/dana/onboarding/confirmpin/ConfirmPinContract$View;", "()V", "avatarUri", "", "confirmPinComponent", "Lid/dana/di/component/ConfirmPinComponent;", "createdPin", "isProgress", "", "isRegisterSuccess", "nickname", "onboardingNavigationManager", "Lid/dana/onboarding/OnboardingNavigationManager;", "phoneNumber", "presenter", "Lid/dana/onboarding/confirmpin/ConfirmPinContract$Presenter;", "getPresenter", "()Lid/dana/onboarding/confirmpin/ConfirmPinContract$Presenter;", "setPresenter", "(Lid/dana/onboarding/confirmpin/ConfirmPinContract$Presenter;)V", "referralCode", "referralType", "tncSummaryPresenter", "Lid/dana/tncsummary/TncSummaryContract$Presenter;", "getTncSummaryPresenter", "()Lid/dana/tncsummary/TncSummaryContract$Presenter;", "setTncSummaryPresenter", "(Lid/dana/tncsummary/TncSummaryContract$Presenter;)V", "builderInputPin", "", "checkEnteredPin", "enteredPin", "createInputValidator", "Lid/dana/textbehavior/validate/Validator;", "createOnInputValidatedListener", "Lid/dana/textbehavior/OnValidatedListener;", "dismissProgress", "getLayout", "", "init", "initInjector", "inputPinActionListener", "onBackPressed", "onDone", "onError", "errorMessage", "onRegisterSuccess", "onStart", "registerUserAccount", "setConfirmPinTitleText", "setReferralTypeByCode", "showProgress", "trackRegisterSuccess", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ConfirmPinFragment extends MultiInstanceInvalidationService<OnboardingActivity, ConfirmPinKey> implements SensorBridgeExtension.AnonymousClass4.getMax {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);
    private HashMap FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String IsOverlapping;
    /* access modifiers changed from: private */
    public String equals;
    /* access modifiers changed from: private */
    public String getMin;
    private AppxPrerunChecker.AnonymousClass2 hashCode;
    /* access modifiers changed from: private */
    public String isInside;
    @Inject
    public SensorBridgeExtension.AnonymousClass4.length presenter;
    private String setMax;
    @Inject
    public ToolUtils.setMin tncSummaryPresenter;
    private boolean toFloatRange;
    private boolean toIntRange;
    private String toString;
    /* access modifiers changed from: private */
    public SensorBridgeExtension values;

    public final View getMax(int i) {
        if (this.FastBitmap$CoordinateSystem == null) {
            this.FastBitmap$CoordinateSystem = new HashMap();
        }
        View view = (View) this.FastBitmap$CoordinateSystem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.FastBitmap$CoordinateSystem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void getMax() {
        HashMap hashMap = this.FastBitmap$CoordinateSystem;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.fragment_confirm_pin;
    }

    public final void onStart() {
        super.onStart();
        PinEntryEditText pinEntryEditText = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.requestFocus();
        }
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        setOnWheelViewListener.setMin(baseActivity);
    }

    public final boolean n_() {
        SensorBridgeExtension sensorBridgeExtension;
        if (this.toFloatRange || (sensorBridgeExtension = this.values) == null) {
            return true;
        }
        String str = this.isInside;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.IsOverlapping;
        if (str3 != null) {
            str2 = str3;
        }
        sensorBridgeExtension.setMax(str, str2, this.getMin, this.equals);
        return true;
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r4;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isInside = arguments.getString("phoneNumber");
            this.IsOverlapping = arguments.getString("nickname");
            this.getMin = arguments.getString("avatarUri");
            this.setMax = arguments.getString("pin");
            String string = arguments.getString("referralCode");
            this.equals = string;
            if (TextUtils.isEmpty(string)) {
                str = TrackerKey.SourceType.REFERRAL_NONE;
            } else {
                if (string == null) {
                    string = "";
                }
                str = StringsKt.startsWith$default(string, "https", false, 2, (Object) null) ? TrackerKey.SourceType.DEEP_LINK : TrackerKey.SourceType.USER_INPUT;
            }
            this.toString = str;
        }
        TextView textView = (TextView) getMax(resetInternal.setMax.StyleableRes);
        if (textView != null) {
            textView.setText(setH5MenuList.getMin(getString(R.string.confirm_pin_title), getString(R.string.pin_code)));
        }
        if (this.hashCode == null) {
            deleteInstallStatus.setMin setmin = new deleteInstallStatus.setMin((byte) 0);
            if (this.getMax != null) {
                r4 = this.getMax.getApplicationComponent();
            } else {
                r4 = null;
            }
            if (r4 != null) {
                setmin.length = r4;
                setmin.getMax = new ConfirmPinModule(this);
                setmin.setMax = new TncSummaryModules(new isInside());
                stopIgnoring.setMin(setmin.getMax, ConfirmPinModule.class);
                stopIgnoring.setMin(setmin.setMax, TncSummaryModules.class);
                stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
                this.hashCode = new deleteInstallStatus(setmin.getMax, setmin.setMax, setmin.length, (byte) 0);
            } else {
                throw null;
            }
        }
        AppxPrerunChecker.AnonymousClass2 r0 = this.hashCode;
        if (r0 != null) {
            r0.length(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[2];
        SensorBridgeExtension.AnonymousClass4.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = length2;
        ToolUtils.setMin setmin2 = this.tncSummaryPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tncSummaryPresenter");
        }
        getminArr[1] = setmin2;
        getMin(getminArr);
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.values = sensorBridgeExtension;
            if (sensorBridgeExtension != null) {
                sensorBridgeExtension.setMin = new getMax(this);
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.setOnPinEnteredListener(new toIntRange(this));
            }
            AUScreenUtils.setMin setmin3 = new AUScreenUtils.setMin((PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon), (byte) 0);
            checkOppoConcave getmin = new getMin(this);
            if (setmin3.setMin == null) {
                setmin3.setMin = new ArrayList();
            }
            setmin3.setMin.add(getmin);
            setmin3.getMin = new setMin(this);
            setmin3.setMax();
            PinEntryEditText pinEntryEditText2 = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText2 != null) {
                pinEntryEditText2.focus();
            }
            PinEntryEditText pinEntryEditText3 = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText3 != null) {
                pinEntryEditText3.setOnEditorActionListener(new toFloatRange(this));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements MultiInstanceInvalidationClient$1 {
        final /* synthetic */ ConfirmPinFragment length;

        getMax(ConfirmPinFragment confirmPinFragment) {
            this.length = confirmPinFragment;
        }

        public final void getMax() {
            this.length.n_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "str", "", "onPinEntered"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements PinEntryEditText.getMin {
        final /* synthetic */ ConfirmPinFragment setMin;

        toIntRange(ConfirmPinFragment confirmPinFragment) {
            this.setMin = confirmPinFragment;
        }

        public final void setMax(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "str");
            ConfirmPinFragment.setMax(this.setMin, charSequence.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "i", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements TextView.OnEditorActionListener {
        final /* synthetic */ ConfirmPinFragment setMin;

        toFloatRange(ConfirmPinFragment confirmPinFragment) {
            this.setMin = confirmPinFragment;
        }

        public final boolean onEditorAction(@Nullable TextView textView, int i, @Nullable KeyEvent keyEvent) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-387027233, oncanceled);
                onCancelLoad.getMin(-387027233, oncanceled);
            }
            if (i == 6) {
                PinEntryEditText pinEntryEditText = (PinEntryEditText) this.setMin.getMax(resetInternal.setMax.setNegativeButtonIcon);
                Editable editable = null;
                if ((pinEntryEditText != null ? pinEntryEditText.getText() : null) != null) {
                    PinEntryEditText pinEntryEditText2 = (PinEntryEditText) this.setMin.getMax(resetInternal.setMax.setNegativeButtonIcon);
                    if (pinEntryEditText2 != null) {
                        editable = pinEntryEditText2.getText();
                    }
                    if (String.valueOf(editable).length() >= 6) {
                        this.setMin.equals();
                        return true;
                    }
                }
                PinEntryEditText pinEntryEditText3 = (PinEntryEditText) this.setMin.getMax(resetInternal.setMax.setNegativeButtonIcon);
                if (pinEntryEditText3 != null) {
                    pinEntryEditText3.setText("");
                }
                ConfirmPinFragment confirmPinFragment = this.setMin;
                Toast.makeText(confirmPinFragment.getActivity(), confirmPinFragment.getString(R.string.msg_pin_less_than6_error), 0).show();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/onboarding/confirmpin/ConfirmPinFragment$createOnInputValidatedListener$1", "Lid/dana/textbehavior/OnValidatedListener;", "onInvalid", "", "s", "", "list", "", "Lid/dana/textbehavior/InvalidReason;", "onValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements checkApFlag {
        final /* synthetic */ ConfirmPinFragment getMin;

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
        }

        setMin(ConfirmPinFragment confirmPinFragment) {
            this.getMin = confirmPinFragment;
        }

        public final void getMin(@NotNull String str, @NotNull List<? extends setWhiteListAP> list) {
            Intrinsics.checkNotNullParameter(str, "s");
            Intrinsics.checkNotNullParameter(list, BottomSheetType.LIST);
            SensorBridgeExtension min = this.getMin.values;
            if (min != null) {
                min.length.setMenuRightButtonEnabled(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/onboarding/confirmpin/ConfirmPinFragment$createInputValidator$1", "Lid/dana/textbehavior/validate/Validator;", "getErrorMessage", "", "isValid", "", "s", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements checkOppoConcave {
        final /* synthetic */ ConfirmPinFragment length;

        getMin(ConfirmPinFragment confirmPinFragment) {
            this.length = confirmPinFragment;
        }

        public final boolean getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
            return str.length() >= 6;
        }

        @NotNull
        public final String getMax() {
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.length.getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.setText("");
            }
            String string = this.length.getString(R.string.msg_pin_less_than6_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.msg_pin_less_than6_error)");
            return string;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/onboarding/confirmpin/ConfirmPinFragment$initInjector$1", "Lid/dana/tncsummary/TncSummaryContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetFeatureTncSummary", "tncSummaryEnabled", "", "onGetTncSummaryAvailability", "tncAvailability", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements ToolUtils.length {
        public final void dismissProgress() {
        }

        public final void getMin(boolean z) {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        isInside() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class length implements DialogInterface.OnDismissListener {
        final /* synthetic */ ConfirmPinFragment length;

        length(ConfirmPinFragment confirmPinFragment) {
            this.length = confirmPinFragment;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.length.getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.focus();
            }
            SensorBridgeExtension min = this.length.values;
            if (min != null) {
                String max = this.length.isInside;
                String str = "";
                if (max == null) {
                    max = str;
                }
                String max2 = this.length.IsOverlapping;
                if (max2 != null) {
                    str = max2;
                }
                min.setMax(max, str, this.length.getMin, this.length.equals);
            }
        }
    }

    public final void showProgress() {
        this.toFloatRange = true;
        SensorBridgeExtension sensorBridgeExtension = this.values;
        if (sensorBridgeExtension != null) {
            sensorBridgeExtension.length.setMenuRightProgressBar(true);
        }
    }

    public final void dismissProgress() {
        this.toFloatRange = false;
        SensorBridgeExtension sensorBridgeExtension = this.values;
        if (sensorBridgeExtension != null) {
            sensorBridgeExtension.length.setMenuRightProgressBar(false);
        }
    }

    public final void getMin() {
        this.toIntRange = true;
        Map hashMap = new HashMap();
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        hashMap.put(TrackerKey.RegistrationProperties.REGISTRATION_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(new Date(new Date().getTime())));
        UserInfoManager instance = UserInfoManager.instance();
        Intrinsics.checkNotNullExpressionValue(instance, "UserInfoManager.instance()");
        hashMap.put("$user_id", instance.getUserId());
        hashMap.put("Referral Code", this.equals);
        hashMap.put(TrackerKey.RegistrationProperties.REFERRAL_TYPE, this.toString);
        hashMap.put(TrackerKey.Property.MEDIA_SOURCE, BlurProcess.setMin());
        hashMap.put("KYC Level", "KYC0".replaceAll("[^\\d.]", ""));
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.REGISTRATION_COMPLETE;
        convertDipToPx.length length3 = length2.length((Map<String, String>) hashMap);
        length3.setMin();
        genTextSelector.getMax(new convertDipToPx(length3, (byte) 0));
        ToolUtils.setMin setmin = this.tncSummaryPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tncSummaryPresenter");
        }
        setmin.setMin();
        this.getMax.showSuccessDialog(getString(R.string.msg_registration_complete), new equals(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class equals implements DialogInterface.OnDismissListener {
        final /* synthetic */ ConfirmPinFragment setMax;

        equals(ConfirmPinFragment confirmPinFragment) {
            this.setMax = confirmPinFragment;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            SensorBridgeExtension min = this.setMax.values;
            if (min != null) {
                Intent intent = new Intent(min.getMax, WelcomeActivity.class);
                Intent intent2 = min.getMax.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "getActivity().intent");
                Intent data = intent.setData(intent2.getData());
                Intrinsics.checkNotNullExpressionValue(data, "Intent(getActivity(), We…etActivity().intent.data)");
                min.getMax.startActivity(data);
                min.getMax.overridePendingTransition(R.anim.f772130772049, R.anim.f802130772052);
                min.getMax.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void equals() {
        SensorBridgeExtension.AnonymousClass4.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.length(this.isInside, this.IsOverlapping, ConfirmPopup.AnonymousClass2.setMax(getContext(), this.getMin), this.setMax, this.equals);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinFragment$Companion;", "", "()V", "PIN_LENGTH", "", "newInstance", "Lid/dana/onboarding/confirmpin/ConfirmPinFragment;", "phoneNumber", "", "nickname", "avatarUri", "pin", "referralCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void onError(@Nullable String str) {
        this.getMax.showWarningDialog(str);
    }

    public static final /* synthetic */ void setMax(ConfirmPinFragment confirmPinFragment, String str) {
        if (str.length() >= 6) {
            setOnWheelViewListener.getMax((Activity) confirmPinFragment.getMax);
            if (Intrinsics.areEqual((Object) str, (Object) confirmPinFragment.setMax)) {
                SensorBridgeExtension sensorBridgeExtension = confirmPinFragment.values;
                if (sensorBridgeExtension != null) {
                    sensorBridgeExtension.length.setMenuRightButtonEnabled(true);
                }
                confirmPinFragment.equals();
                return;
            }
            SensorBridgeExtension sensorBridgeExtension2 = confirmPinFragment.values;
            if (sensorBridgeExtension2 != null) {
                sensorBridgeExtension2.length.setMenuRightButtonEnabled(false);
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) confirmPinFragment.getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                TextView textView = pinEntryEditText;
                Intrinsics.checkNotNullParameter(textView, "$this$clearText");
                textView.setText("");
            }
            confirmPinFragment.getMax.showWarningDialog(confirmPinFragment.getString(R.string.msg_confirm_pin_not_match), new length(confirmPinFragment));
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.FastBitmap$CoordinateSystem;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
