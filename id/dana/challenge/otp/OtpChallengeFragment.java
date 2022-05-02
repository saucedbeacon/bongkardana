package id.dana.challenge.otp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.ChallengeScenario;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.foundation.logger.log.LoginTrackingConstants;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.OtpChallengeModule;
import id.dana.dialog.LoginInfoDialog;
import id.dana.richview.PinEntryEditText;
import id.dana.tracker.mixpanel.ChallengeEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.AUBubbleView;
import o.FtsOptions$Order;
import o.GlobalPackagePool;
import o.GriverManifest;
import o.IntRange;
import o.PrepareException;
import o.TinyAppActionStateListener;
import o.WebSocketSession;
import o.beginTransaction;
import o.dispatchOnCancelled;
import o.endTransaction;
import o.genTextSelector;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSubmit;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setOnWheelViewListener;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001rB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u001a\u0010,\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0002J\b\u00101\u001a\u00020\rH\u0014J\b\u00102\u001a\u00020+H\u0002J\b\u00103\u001a\u00020+H\u0014J\u0012\u00104\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u00105\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u0011H\u0002J\b\u0010=\u001a\u00020+H\u0002J\b\u0010>\u001a\u00020+H\u0002J\b\u0010?\u001a\u00020+H\u0002J\b\u0010@\u001a\u00020+H\u0002J\b\u0010A\u001a\u00020+H\u0016J\u0012\u0010B\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010\u0014H\u0016J.\u0010B\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010\u00142\b\u0010C\u001a\u0004\u0018\u00010\u00142\u0006\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010G\u001a\u00020+H\u0002J\u0012\u0010H\u001a\u00020+2\b\u0010I\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010J\u001a\u00020+2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020\rH\u0016J\b\u0010N\u001a\u00020+H\u0002J\b\u0010O\u001a\u00020+H\u0016J\b\u0010P\u001a\u00020+H\u0016J\b\u0010Q\u001a\u00020+H\u0002J\b\u0010R\u001a\u00020+H\u0002J\u0018\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0011H\u0002J\u0018\u0010W\u001a\u00020+2\u0006\u0010T\u001a\u00020U2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010X\u001a\u00020+2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010[\u001a\u00020+2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\\\u001a\u00020+2\u0006\u0010]\u001a\u00020\u0011H\u0016J$\u0010^\u001a\u00020+2\u0006\u0010_\u001a\u00020\u00142\b\u0010`\u001a\u0004\u0018\u00010\u00142\b\u0010a\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010b\u001a\u00020+H\u0002J\u0012\u0010c\u001a\u00020+2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\b\u0010d\u001a\u00020+H\u0002J\u0018\u0010e\u001a\u00020+2\u0006\u0010C\u001a\u00020\u00142\u0006\u0010V\u001a\u00020\u0011H\u0002J\b\u0010f\u001a\u00020+H\u0002J\u001a\u0010g\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010\u00142\u0006\u0010h\u001a\u00020\u0011H\u0002J\u0010\u0010i\u001a\u00020+2\u0006\u0010C\u001a\u00020\u0014H\u0002J\b\u0010j\u001a\u00020+H\u0016J\u0010\u0010k\u001a\u00020+2\u0006\u0010L\u001a\u00020\rH\u0002J\b\u0010l\u001a\u00020+H\u0002J&\u0010m\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010\u00142\b\u0010C\u001a\u0004\u0018\u00010\u00142\b\u0010n\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010o\u001a\u00020+2\u0006\u0010p\u001a\u00020\u0014H\u0002J\u0012\u0010q\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010\u0014H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Lid/dana/challenge/otp/OtpChallengeFragment;", "Lid/dana/base/BaseFragment;", "Lid/dana/challenge/otp/AbstractOtpContract$View;", "()V", "changePhoneNumberH5EventPresenter", "Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;", "getChangePhoneNumberH5EventPresenter", "()Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;", "setChangePhoneNumberH5EventPresenter", "(Lid/dana/h5event/ChangePhoneNumberH5EventContract$Presenter;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "countdown", "", "inputOtpTextWacher", "Lid/dana/utils/DanaTextWatcher;", "isRegistration", "", "()Z", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "loginInfoDialog", "Lid/dana/dialog/LoginInfoDialog;", "otpChallengeComponent", "Lid/dana/di/component/OtpChallengeComponent;", "otpError", "otpSendStrategy", "otpServiceCode", "phoneNumber", "presenter", "Lid/dana/challenge/otp/AbstractOtpContract$Presenter;", "getPresenter", "()Lid/dana/challenge/otp/AbstractOtpContract$Presenter;", "setPresenter", "(Lid/dana/challenge/otp/AbstractOtpContract$Presenter;)V", "scenario", "scenarioListener", "Lid/dana/challenge/ChallengeScenarioListener;", "securityId", "whatsAppFeatureEnable", "animateProgress", "", "checkScenario", "data", "Landroid/os/Bundle;", "dismissProgress", "focusInputOtp", "getLayout", "hideKeyboard", "init", "initInjector", "isLoginScenario", "listenSmsReceiver", "observeCompleteInputAndFirstInputOtp", "onAttach", "context", "Landroid/content/Context;", "onChangePhoneNumberSuccess", "success", "onChangePhonenumberClicked", "onClickInputOtp", "onClickResendOtp", "onClickResendOtpWhatsApp", "onDestroyView", "onError", "errorMessage", "errorCode", "leftTimes", "operationType", "onOtpExpire", "onOtpReceived", "otpCode", "onOtpSent", "expirySeconds", "retrySendSeconds", "otpCodeLength", "onRegistrationScenario", "onResume", "onSuccess", "requestInputOtpFocus", "resendOtp", "setAccountFreezeDialogButtonCallBack", "loginInfoDialogBuilder", "Lid/dana/dialog/LoginInfoDialog$Builder;", "isTempLock", "setIncorrectOtpDialogButtonCallBack", "setInvisible", "view", "Landroid/view/View;", "setRemainingTime", "setResendWhatsAppFeature", "enable", "setScenarioOtp", "otpValue", "loginScenario", "sendOtpStrategy", "setTimerTextToCenter", "setVisible", "setVisibleInputOtp", "showAccountFreezeDialog", "showCountDown", "showErrorMessage", "isPopup", "showIncorrectOtpDialog", "showProgress", "startTimer", "stopTimer", "trackDisplayedErrorLogin", "displayedMessage", "trackOtpRequestEvent", "otpChannel", "validateOtpErrorMessage", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OtpChallengeFragment extends FtsOptions$Order implements endTransaction.length {
    @NotNull
    public static final length setMax = new length((byte) 0);
    private boolean FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String IsOverlapping;
    private HashMap Mean$Arithmetic;
    @Inject
    public GriverManifest.AnonymousClass16.setMax changePhoneNumberH5EventPresenter;
    /* access modifiers changed from: private */
    public int equals;
    private final onSubmit getMin = new onSubmit();
    private String hashCode;
    /* access modifiers changed from: private */
    public boolean invoke;
    private CountDownTimer isInside;
    @Inject
    public endTransaction.setMax presenter;
    private beginTransaction setMin;
    /* access modifiers changed from: private */
    public String toDoubleRange;
    private WebSocketSession.RVWebSocketCallbackProxy toFloatRange;
    /* access modifiers changed from: private */
    public LoginInfoDialog toIntRange;
    private String toString;
    private String values;

    public final View setMax(int i) {
        if (this.Mean$Arithmetic == null) {
            this.Mean$Arithmetic = new HashMap();
        }
        View view = (View) this.Mean$Arithmetic.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.Mean$Arithmetic.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_input_otp;
    }

    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        super.onAttach(context);
        try {
            BaseActivity baseActivity = this.getMax;
            if (baseActivity != null) {
                this.setMin = (beginTransaction) baseActivity;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.challenge.ChallengeScenarioListener");
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append("must implement ChallengeScenarioListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r5;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.IsOverlapping = arguments.getString(ChallengeControl.Key.SCENARIO);
            this.hashCode = arguments.getString(ChallengeControl.Key.SECURITY_ID);
            StringBuilder sb = new StringBuilder("+62");
            sb.append(arguments.getString(ChallengeControl.Key.PHONE_NUMBER));
            this.toString = sb.toString();
            String str = this.IsOverlapping;
            ViewGroup.LayoutParams layoutParams = null;
            int i = 0;
            if (this.toFloatRange == null) {
                GlobalPackagePool.setMin setmin = new GlobalPackagePool.setMin((byte) 0);
                if (this.getMax != null) {
                    r5 = this.getMax.getApplicationComponent();
                } else {
                    r5 = null;
                }
                if (r5 != null) {
                    setmin.getMin = r5;
                    endTransaction.length length2 = this;
                    if (str == null) {
                        str = "";
                    }
                    setmin.getMax = new OtpChallengeModule(length2, str);
                    setmin.setMax = new ChangePhoneNumberH5EventModule(new setMax(this));
                    stopIgnoring.setMin(setmin.getMax, OtpChallengeModule.class);
                    stopIgnoring.setMin(setmin.setMax, ChangePhoneNumberH5EventModule.class);
                    stopIgnoring.setMin(setmin.getMin, PrepareException.AnonymousClass1.class);
                    this.toFloatRange = new GlobalPackagePool(setmin.getMax, setmin.setMax, setmin.getMin, (byte) 0);
                } else {
                    throw null;
                }
            }
            WebSocketSession.RVWebSocketCallbackProxy rVWebSocketCallbackProxy = this.toFloatRange;
            if (rVWebSocketCallbackProxy != null) {
                rVWebSocketCallbackProxy.length(this);
            }
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            endTransaction.setMax setmax = this.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmax;
            GriverManifest.AnonymousClass16.setMax setmax2 = this.changePhoneNumberH5EventPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
            }
            getminArr[1] = setmax2;
            getMin(getminArr);
            String str2 = this.IsOverlapping;
            if (Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) str2)) {
                String string = arguments.getString(ChallengeControl.Key.OTP_CHANNEL, ChallengeEvent.Channel.SMS);
                Intrinsics.checkNotNullExpressionValue(string, "data.getString(Challenge…allengeEvent.Channel.SMS)");
                genTextSelector.getMax(new AUBubbleView(getContext(), TinyAppActionStateListener.setMax(this.IsOverlapping)).setMin(TinyAppActionStateListener.getMin(string)));
                endTransaction.setMax setmax3 = this.presenter;
                if (setmax3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax3.length();
                arguments.getInt(ChallengeControl.Key.EXPIRY_SECONDS);
                getMin(arguments.getInt(ChallengeControl.Key.RETRY_SEND_SECONDS), arguments.getInt(ChallengeControl.Key.OTP_CODE_LENGTH));
                TextView textView = (TextView) setMax(resetInternal.setMax.dispatchFitSystemWindows);
                if (textView != null) {
                    layoutParams = textView.getLayoutParams();
                }
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.setMin = -1;
                    ConstraintLayout constraintLayout = (ConstraintLayout) setMax(resetInternal.setMax.onActivityResult);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_timer_and_changephonenumber_container");
                    layoutParams2.getMin = constraintLayout.getId();
                    TextView textView2 = (TextView) setMax(resetInternal.setMax.dispatchFitSystemWindows);
                    if (textView2 != null) {
                        textView2.requestLayout();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            if (length(str2)) {
                this.toDoubleRange = "AP_LOGIN";
                this.values = "AP_LOGIN";
                endTransaction.setMax setmax4 = this.presenter;
                if (setmax4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax4.setMax(this.toDoubleRange, this.values);
            }
            if (Intrinsics.areEqual((Object) "twilio_otp", (Object) str2)) {
                this.toDoubleRange = "TWILIO_CONSULT";
                this.values = "TWILIO_CONSULT";
                endTransaction.setMax setmax5 = this.presenter;
                if (setmax5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax5.setMax(this.toDoubleRange, this.values);
            }
            TextView textView3 = (TextView) setMax(resetInternal.setMax.getTrackTintList);
            if (textView3 != null) {
                if (Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) this.IsOverlapping)) {
                    i = 8;
                }
                textView3.setVisibility(i);
            }
        }
        onSubmit onsubmit = this.getMin;
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        Intrinsics.checkNotNullExpressionValue(pinEntryEditText, "input_otp");
        onsubmit.getMax(pinEntryEditText, new IsOverlapping(this));
        PinEntryEditText pinEntryEditText2 = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText2 != null) {
            pinEntryEditText2.setOnBackButtonListener(new equals(this));
        }
        PinEntryEditText pinEntryEditText3 = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText3 != null) {
            pinEntryEditText3.setOnKeyListener(new toIntRange(this));
        }
        TextView textView4 = (TextView) setMax(resetInternal.setMax.ActionBarOverlayLayout$LayoutParams);
        if (textView4 != null) {
            textView4.setOnClickListener(new isInside(this));
        }
        TextView textView5 = (TextView) setMax(resetInternal.setMax.restoreToolbarHierarchyState);
        if (textView5 != null) {
            textView5.setOnClickListener(new values(this));
        }
        TextView textView6 = (TextView) setMax(resetInternal.setMax.getTrackTintList);
        if (textView6 != null) {
            textView6.setOnClickListener(new toFloatRange(this));
        }
    }

    public final void onResume() {
        super.onResume();
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"id/dana/challenge/otp/OtpChallengeFragment$observeCompleteInputAndFirstInputOtp$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "i", "", "i1", "i2", "onTextChanged", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements TextWatcher {
        final /* synthetic */ OtpChallengeFragment getMax;

        public final void afterTextChanged(@NotNull Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        }

        IsOverlapping(OtpChallengeFragment otpChallengeFragment) {
            this.getMax = otpChallengeFragment;
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            int length = charSequence.length();
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.getMax.setMax(resetInternal.setMax.setPositiveButtonIcon);
            if (pinEntryEditText != null && length == pinEntryEditText.getMaxLength()) {
                OtpChallengeFragment.getMin(this.getMax, charSequence.toString(), this.getMax.IsOverlapping, this.getMax.toDoubleRange);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                endTransaction.setMax setmax = this.getMax.presenter;
                if (setmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax.getMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFailure"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements OnFailureListener {
        final /* synthetic */ OtpChallengeFragment getMin;

        getMax(OtpChallengeFragment otpChallengeFragment) {
            this.getMin = otpChallengeFragment;
        }

        public final void onFailure(@Nullable Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append(OtpChallengeFragment.length(this.getMin));
            sb.append(" :onError Retrieve Listener");
            updateActionSheetContent.e(DanaLogConstants.TAG.OTP_CHALLENGE_TAG, sb.toString(), exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "onGetChangePhoneNumberH5EventSuccess"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements GriverManifest.AnonymousClass16.getMin {
        final /* synthetic */ OtpChallengeFragment setMin;

        setMax(OtpChallengeFragment otpChallengeFragment) {
            this.setMin = otpChallengeFragment;
        }

        public final void setMax(boolean z) {
            OtpChallengeFragment.getMax(this.setMin, z);
        }
    }

    private final void equals() {
        ConstraintLayout constraintLayout;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (!(pinEntryEditText == null || (animate = pinEntryEditText.animate()) == null || (alpha = animate.alpha(1.0f)) == null)) {
            alpha.setDuration(0);
        }
        TextView textView = (TextView) setMax(resetInternal.setMax.setAttachListener);
        if (textView != null) {
            textView.setText(R.string.enter_otp);
        }
        TextView textView2 = (TextView) setMax(resetInternal.setMax.setAttachListener);
        if (textView2 != null) {
            textView2.setTextColor(IntRange.setMax(this.getMax, R.color.f23622131100291));
        }
        PinEntryEditText pinEntryEditText2 = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText2 != null) {
            pinEntryEditText2.setText("");
        }
        if (this.equals > 0 && (constraintLayout = (ConstraintLayout) setMax(resetInternal.setMax.onActivityResult)) != null) {
            constraintLayout.setVisibility(0);
        }
        PinEntryEditText pinEntryEditText3 = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText3 != null) {
            pinEntryEditText3.requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/challenge/otp/OtpChallengeFragment$startTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "l", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends CountDownTimer {
        final /* synthetic */ OtpChallengeFragment getMax;
        final /* synthetic */ int setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(OtpChallengeFragment otpChallengeFragment, int i, long j, long j2) {
            super(j, j2);
            this.getMax = otpChallengeFragment;
            this.setMin = i;
        }

        public final void onTick(long j) {
            OtpChallengeFragment otpChallengeFragment = this.getMax;
            otpChallengeFragment.equals = otpChallengeFragment.equals - 1;
            OtpChallengeFragment otpChallengeFragment2 = this.getMax;
            OtpChallengeFragment.setMax(otpChallengeFragment2, otpChallengeFragment2.equals);
        }

        public final void onFinish() {
            OtpChallengeFragment.getMax(this.getMax);
        }
    }

    private final void getMax(int i) {
        if (this.isInside == null) {
            this.isInside = new toDoubleRange(this, i, TimeUnit.SECONDS.toMillis((long) i), TimeUnit.SECONDS.toMillis(1));
        }
        CountDownTimer countDownTimer = this.isInside;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    /* access modifiers changed from: private */
    public final boolean FastBitmap$CoordinateSystem() {
        return Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) this.IsOverlapping);
    }

    public final void showProgress() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        beginTransaction begintransaction = this.setMin;
        if (begintransaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
        }
        begintransaction.hideClose();
        RelativeLayout relativeLayout = (RelativeLayout) setMax(resetInternal.setMax.ActionBar$LayoutParams);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (!(pinEntryEditText == null || (animate = pinEntryEditText.animate()) == null || (alpha = animate.alpha(0.0f)) == null)) {
            alpha.setDuration(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) setMax(resetInternal.setMax.onActivityResult);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "refreshAnimation");
        loadAnimation.setInterpolator(new LinearInterpolator());
        ImageView imageView = (ImageView) setMax(resetInternal.setMax.setHasDecor);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) setMax(resetInternal.setMax.setHasDecor);
        if (imageView2 != null) {
            imageView2.startAnimation(loadAnimation);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) setMax(resetInternal.setMax.onActivityResult);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(4);
        }
    }

    public final void dismissProgress() {
        beginTransaction begintransaction = this.setMin;
        if (begintransaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
        }
        begintransaction.showClose();
        RelativeLayout relativeLayout = (RelativeLayout) setMax(resetInternal.setMax.ActionBar$LayoutParams);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        ImageView imageView = (ImageView) setMax(resetInternal.setMax.setHasDecor);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void onError(@Nullable String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-700483092, oncanceled);
            onCancelLoad.getMin(-700483092, oncanceled);
        }
        length((String) null, str, 0, (String) null);
    }

    private final void getMin(String str) {
        String string = getString(R.string.incorrect_otp_code);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.incorrect_otp_code)");
        LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(this.getMax);
        getmax.equals = string;
        getmax.IsOverlapping = str;
        LoginInfoDialog.getMax length2 = getmax.setMin().length();
        boolean z = false;
        length2.getMax = false;
        length2.hashCode = R.drawable.rounded_white_8dp;
        length2.values = R.drawable.ic_warning_14;
        Intrinsics.checkNotNullExpressionValue(length2, "loginInfoDialogBuilder");
        if (this.equals <= 0) {
            z = true;
        }
        if (z) {
            length2.isInside = getString(R.string.lbl_dialog_send_new_otp);
            length2.toIntRange = new hashCode(this);
        }
        String string2 = getString(R.string.try_again);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.try_again)");
        if (string2 != null) {
            String upperCase = string2.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            length2.toFloatRange = upperCase;
            length2.toDoubleRange = new toString(this);
            LoginInfoDialog loginInfoDialog = new LoginInfoDialog(length2.setMax, length2.setMin, length2.length, length2, (byte) 0);
            loginInfoDialog.setMin();
            Unit unit = Unit.INSTANCE;
            this.toIntRange = loginInfoDialog;
            setOnWheelViewListener.length(getView());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ OtpChallengeFragment setMin;

        hashCode(OtpChallengeFragment otpChallengeFragment) {
            this.setMin = otpChallengeFragment;
        }

        public final void onClick(View view) {
            OtpChallengeFragment.toFloatRange(this.setMin);
            this.setMin.values();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toString implements View.OnClickListener {
        final /* synthetic */ OtpChallengeFragment setMax;

        toString(OtpChallengeFragment otpChallengeFragment) {
            this.setMax = otpChallengeFragment;
        }

        public final void onClick(View view) {
            LoginInfoDialog IsOverlapping = this.setMax.toIntRange;
            if (IsOverlapping != null) {
                IsOverlapping.setMax();
            }
            this.setMax.values();
        }
    }

    private final void length(String str, boolean z) {
        String str2;
        String str3;
        if (z) {
            str2 = getString(R.string.lbl_dialog_account_temp_freeze);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.lbl_dialog_account_temp_freeze)");
        } else {
            str2 = getString(R.string.lbl_dialog_account_freeze);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.lbl_dialog_account_freeze)");
        }
        LoginInfoDialog.getMax getmax = new LoginInfoDialog.getMax(this.getMax);
        getmax.equals = str2;
        getmax.IsOverlapping = str;
        LoginInfoDialog.getMax length2 = getmax.setMin().length();
        length2.getMax = false;
        length2.hashCode = R.drawable.rounded_white_8dp;
        length2.values = R.drawable.ic_lock_account;
        Intrinsics.checkNotNullExpressionValue(length2, "loginInfoDialogBuilder");
        if (z) {
            String string = getString(R.string.lbl_dialog_understand);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.lbl_dialog_understand)");
            if (string != null) {
                str3 = string.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.String).toUpperCase()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            String string2 = getString(R.string.lbl_dialog_call_customer_care);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.lbl_dialog_call_customer_care)");
            if (string2 != null) {
                str3 = string2.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.String).toUpperCase()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        length2.toFloatRange = str3;
        length2.toDoubleRange = new OtpChallengeFragment$FastBitmap$CoordinateSystem(this);
        LoginInfoDialog loginInfoDialog = new LoginInfoDialog(length2.setMax, length2.setMin, length2.length, length2, (byte) 0);
        loginInfoDialog.setMin();
        Unit unit = Unit.INSTANCE;
        this.toIntRange = loginInfoDialog;
        setOnWheelViewListener.length(getView());
    }

    public final void getMin() {
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.setVisibility(4);
        }
        ImageView imageView = (ImageView) setMax(resetInternal.setMax.ActionBar$NavigationMode);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        beginTransaction begintransaction = this.setMin;
        if (begintransaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
        }
        begintransaction.hideClose();
        beginTransaction begintransaction2 = this.setMin;
        if (begintransaction2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
        }
        begintransaction2.onNext((List<String>) null);
        if (!FastBitmap$CoordinateSystem()) {
            StringBuilder sb = new StringBuilder("from:");
            sb.append(this.IsOverlapping);
            updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.OtpLogin.SUCCESS_TO_HOME, sb.toString());
        }
    }

    public final void getMin(int i, int i2) {
        getMax();
        PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.setMaxLength(i2);
        }
        this.equals = i;
        TextView textView = (TextView) setMax(resetInternal.setMax.setDecorPadding);
        if (textView != null) {
            textView.setVisibility(0);
        }
        equals();
        TextView textView2 = (TextView) setMax(resetInternal.setMax.ActionBarOverlayLayout$LayoutParams);
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        TextView textView3 = (TextView) setMax(resetInternal.setMax.restoreToolbarHierarchyState);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        View max = setMax(resetInternal.setMax.setMenu);
        if (max != null) {
            max.setVisibility(8);
        }
        getMax(i);
        values();
    }

    public final void getMax(@Nullable String str) {
        PinEntryEditText pinEntryEditText;
        if (((PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon)) != null && (pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon)) != null) {
            pinEntryEditText.setText(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r9.equals(id.dana.constants.ErrorCode.TOO_MANY_REQUEST_VERIFICATION) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r9.equals(id.dana.constants.ErrorCode.TOO_MANY_REQUEST_OTP) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (r9.equals(id.dana.constants.ErrorCode.TOO_MANY_REQUEST_VERIFICATION) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r9.equals(id.dana.constants.ErrorCode.TOO_MANY_REQUEST_OTP) != false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, int r11, @org.jetbrains.annotations.Nullable java.lang.String r12) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0006
            java.lang.String r0 = ""
            r1 = r0
            goto L_0x0007
        L_0x0006:
            r1 = r10
        L_0x0007:
            r0 = 0
            if (r9 == 0) goto L_0x00c0
            java.lang.String r2 = "5000"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0014
            goto L_0x00c0
        L_0x0014:
            o.endTransaction$setMax r2 = r8.presenter
            if (r2 != 0) goto L_0x001d
            java.lang.String r3 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x001d:
            boolean r2 = r2 instanceof o.internalBeginTransaction
            java.lang.String r3 = "AE15002058020037"
            java.lang.String r4 = "AE15002058020033"
            java.lang.String r5 = "AE15002058020031"
            r7 = 1
            if (r2 == 0) goto L_0x0088
            int r2 = r9.hashCode()
            switch(r2) {
                case -1813066891: goto L_0x0073;
                case 1658411337: goto L_0x006b;
                case 1658411339: goto L_0x0043;
                case 1658411343: goto L_0x003c;
                case 1787494118: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x007e
        L_0x0030:
            java.lang.String r11 = "AE15102058020051"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x007e
            r8.length(r1, r7)
            goto L_0x007e
        L_0x003c:
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x007e
            goto L_0x0071
        L_0x0043:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x007e
            if (r11 != r7) goto L_0x0058
            r9 = 2131887766(0x7f120696, float:1.9410148E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r11 = "getString(R.string.lbl_d…rect_pin_or_otp_last_try)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
            goto L_0x0066
        L_0x0058:
            java.lang.String r3 = java.lang.String.valueOf(r11)
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "{{leftTimes}}"
            java.lang.String r9 = kotlin.text.StringsKt.replace$default((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
        L_0x0066:
            r8.getMin((java.lang.String) r9)
            r1 = r9
            goto L_0x007e
        L_0x006b:
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x007e
        L_0x0071:
            r0 = 1
            goto L_0x007e
        L_0x0073:
            java.lang.String r11 = "AE15112158065208"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x007e
            r8.length(r1, r0)
        L_0x007e:
            android.content.Context r9 = r8.getContext()
            java.lang.String r11 = "Login"
            o.BlurProcess.getMin(r9, r12, r10, r1, r11)
            goto L_0x00bd
        L_0x0088:
            int r10 = r9.hashCode()
            r11 = 1658411337(0x62d95949, float:2.0046886E21)
            if (r10 == r11) goto L_0x00b6
            r11 = 1658411339(0x62d9594b, float:2.0046889E21)
            if (r10 == r11) goto L_0x00a3
            r11 = 1658411343(0x62d9594f, float:2.0046894E21)
            if (r10 == r11) goto L_0x009c
            goto L_0x00bd
        L_0x009c:
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x00bd
            goto L_0x00bc
        L_0x00a3:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x00bd
            r9 = 2131887590(0x7f1205e6, float:1.9409791E38)
            java.lang.String r1 = r8.getString(r9)
            java.lang.String r9 = "getString(R.string.incorrect_otp_code)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9)
            goto L_0x00bd
        L_0x00b6:
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x00bd
        L_0x00bc:
            r0 = 1
        L_0x00bd:
            r8.invoke = r7
            goto L_0x00cc
        L_0x00c0:
            r9 = 2131886631(0x7f120227, float:1.9407846E38)
            java.lang.String r1 = r8.getString(r9)
            java.lang.String r9 = "getString(R.string.challenge_error)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9)
        L_0x00cc:
            r8.getMax((java.lang.String) r1, (boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.challenge.otp.OtpChallengeFragment.length(java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final void setMax(boolean z) {
        this.FastBitmap$CoordinateSystem = z;
    }

    /* access modifiers changed from: private */
    public final void values() {
        PinEntryEditText pinEntryEditText;
        if (((PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon)) != null && (pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon)) != null) {
            pinEntryEditText.post(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ OtpChallengeFragment setMin;

        setMin(OtpChallengeFragment otpChallengeFragment) {
            this.setMin = otpChallengeFragment;
        }

        public final void run() {
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.setMin.setMax(resetInternal.setMax.setPositiveButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.requestFocus();
            }
            PinEntryEditText pinEntryEditText2 = (PinEntryEditText) this.setMin.setMax(resetInternal.setMax.setPositiveButtonIcon);
            Intrinsics.checkNotNullExpressionValue(pinEntryEditText2, "input_otp");
            setOnWheelViewListener.getMax((View) pinEntryEditText2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "OnEditTextBackButton"}, k = 3, mv = {1, 4, 2})
    static final class equals implements PinEntryEditText.setMax {
        final /* synthetic */ OtpChallengeFragment length;

        equals(OtpChallengeFragment otpChallengeFragment) {
            this.length = otpChallengeFragment;
        }

        public final boolean getMin() {
            this.length.getMax.finish();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "keyCode", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnKeyListener {
        final /* synthetic */ OtpChallengeFragment setMax;

        toIntRange(OtpChallengeFragment otpChallengeFragment) {
            this.setMax = otpChallengeFragment;
        }

        public final boolean onKey(@Nullable View view, int i, @Nullable KeyEvent keyEvent) {
            if (67 != i || !this.setMax.invoke) {
                return false;
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.setMax.setMax(resetInternal.setMax.setPositiveButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.setText("");
            }
            this.setMax.invoke = false;
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ OtpChallengeFragment setMin;

        isInside(OtpChallengeFragment otpChallengeFragment) {
            this.setMin = otpChallengeFragment;
        }

        public final void onClick(View view) {
            OtpChallengeFragment.toFloatRange(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements View.OnClickListener {
        final /* synthetic */ OtpChallengeFragment setMin;

        values(OtpChallengeFragment otpChallengeFragment) {
            this.setMin = otpChallengeFragment;
        }

        public final void onClick(View view) {
            if (this.setMin.FastBitmap$CoordinateSystem()) {
                endTransaction.setMax setmax = this.setMin.presenter;
                if (setmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                setmax.getMin();
                TextView textView = (TextView) this.setMin.setMax(resetInternal.setMax.setAttachListener);
                if (textView != null) {
                    textView.setText(R.string.enter_otp);
                }
                TextView textView2 = (TextView) this.setMin.setMax(resetInternal.setMax.setAttachListener);
                if (textView2 != null) {
                    textView2.setTextColor(IntRange.setMax(this.setMin.getMax, R.color.f23622131100291));
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ OtpChallengeFragment setMax;

        toFloatRange(OtpChallengeFragment otpChallengeFragment) {
            this.setMax = otpChallengeFragment;
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl("https://m.dana.id/m/portal/changephoneno", new setCancelOnTouchOutside$core(this) {
                final /* synthetic */ toFloatRange setMin;

                {
                    this.setMin = r1;
                }

                public final void onContainerDestroyed(@Nullable Bundle bundle) {
                    GriverManifest.AnonymousClass16.setMax setmax = this.setMin.setMax.changePhoneNumberH5EventPresenter;
                    if (setmax == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
                    }
                    setmax.length();
                }

                public final void onContainerCreated(@Nullable Bundle bundle) {
                    GriverManifest.AnonymousClass16.setMax setmax = this.setMin.setMax.changePhoneNumberH5EventPresenter;
                    if (setmax == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("changePhoneNumberH5EventPresenter");
                    }
                    setmax.setMin();
                }
            });
        }
    }

    private static boolean length(String str) {
        if (str == null) {
            return false;
        }
        int hashCode2 = str.hashCode();
        return hashCode2 != 103149417 ? hashCode2 != 1090898198 ? hashCode2 == 1573803584 && str.equals(ChallengeScenario.TRUST_RISK_LOGIN) : str.equals(ChallengeScenario.RELOGIN) : str.equals("login");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/challenge/otp/OtpChallengeFragment$Companion;", "", "()V", "LAST_TRY_OTP_BEFORE_FREEZE", "", "create", "Lid/dana/challenge/otp/OtpChallengeFragment;", "data", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 2})
    static final class getMin<TResult> implements OnSuccessListener<Void> {
        final /* synthetic */ OtpChallengeFragment getMin;

        getMin(OtpChallengeFragment otpChallengeFragment) {
            this.getMin = otpChallengeFragment;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append(OtpChallengeFragment.length(this.getMin));
            sb.append(" :onSuccess Retrieve Listener");
            updateActionSheetContent.i(DanaLogConstants.TAG.OTP_CHALLENGE_TAG, sb.toString());
            endTransaction.setMax setmax = this.getMin.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmax.setMin();
        }
    }

    public final void onDestroyView() {
        CountDownTimer countDownTimer = this.isInside;
        if (!(countDownTimer == null || countDownTimer == null)) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
        HashMap hashMap = this.Mean$Arithmetic;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private final void getMax() {
        if (this.getMax != null) {
            Task<Void> startSmsRetriever = SmsRetriever.getClient((Activity) this.getMax).startSmsRetriever();
            startSmsRetriever.addOnSuccessListener(new getMin(this));
            startSmsRetriever.addOnFailureListener(new getMax(this));
        }
    }

    private final void getMax(String str, boolean z) {
        ConstraintLayout constraintLayout;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        if (!z) {
            TextView textView = (TextView) setMax(resetInternal.setMax.setAttachListener);
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = (TextView) setMax(resetInternal.setMax.setAttachListener);
            if (textView2 != null) {
                textView2.setTextColor(IntRange.setMax(this.getMax, R.color.f24202131100363));
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) setMax(resetInternal.setMax.setPositiveButtonIcon);
            if (!(pinEntryEditText == null || (animate = pinEntryEditText.animate()) == null || (alpha = animate.alpha(1.0f)) == null)) {
                alpha.setDuration(0);
            }
            if (this.equals > 0 && (constraintLayout = (ConstraintLayout) setMax(resetInternal.setMax.onActivityResult)) != null) {
                constraintLayout.setVisibility(0);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("message", str);
        this.getMax.setResult(0, intent);
        this.getMax.finish();
    }

    public static final /* synthetic */ void getMin(OtpChallengeFragment otpChallengeFragment, String str, String str2, String str3) {
        if (Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) otpChallengeFragment.IsOverlapping)) {
            endTransaction.setMax setmax = otpChallengeFragment.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            String str4 = otpChallengeFragment.hashCode;
            String str5 = "";
            if (str4 == null) {
                str4 = str5;
            }
            String str6 = otpChallengeFragment.toString;
            if (str6 != null) {
                str5 = str6;
            }
            setmax.getMin(str, str4, str5);
            return;
        }
        endTransaction.setMax setmax2 = otpChallengeFragment.presenter;
        if (setmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax2.length(str, str2, otpChallengeFragment.hashCode, str3);
    }

    public static final /* synthetic */ String length(OtpChallengeFragment otpChallengeFragment) {
        return Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) otpChallengeFragment.IsOverlapping) ? DanaLogConstants.Prefix.OTP_REGISTER_PREFIX : DanaLogConstants.Prefix.OTPLOGIN_PREFIX;
    }

    public static final /* synthetic */ void getMax(OtpChallengeFragment otpChallengeFragment, boolean z) {
        if (z) {
            beginTransaction begintransaction = otpChallengeFragment.setMin;
            if (begintransaction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
            }
            begintransaction.closeChallengeSession();
        }
    }

    public static final /* synthetic */ void setMax(OtpChallengeFragment otpChallengeFragment, int i) {
        TextView textView = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.dispatchFitSystemWindows);
        if (textView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = otpChallengeFragment.getString(R.string.resend_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.resend_text)");
            String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            textView.setText(format);
        }
    }

    public static final /* synthetic */ void getMax(OtpChallengeFragment otpChallengeFragment) {
        ConstraintLayout constraintLayout = (ConstraintLayout) otpChallengeFragment.setMax(resetInternal.setMax.onActivityResult);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        TextView textView = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.ActionBarOverlayLayout$LayoutParams);
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (otpChallengeFragment.FastBitmap$CoordinateSystem() && otpChallengeFragment.FastBitmap$CoordinateSystem) {
            TextView textView2 = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.restoreToolbarHierarchyState);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View max = otpChallengeFragment.setMax(resetInternal.setMax.setMenu);
            if (max != null) {
                max.setVisibility(4);
            }
        }
    }

    public static final /* synthetic */ void toFloatRange(OtpChallengeFragment otpChallengeFragment) {
        endTransaction.setMax setmax = otpChallengeFragment.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.setMax(otpChallengeFragment.toDoubleRange, otpChallengeFragment.values);
        TextView textView = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.setDecorPadding);
        if (textView != null) {
            textView.setText(otpChallengeFragment.getString(R.string.popup_otp_title));
        }
        TextView textView2 = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.setAttachListener);
        if (textView2 != null) {
            textView2.setText(R.string.enter_otp);
        }
        TextView textView3 = (TextView) otpChallengeFragment.setMax(resetInternal.setMax.setAttachListener);
        if (textView3 != null) {
            textView3.setTextColor(IntRange.setMax(otpChallengeFragment.getMax, R.color.f23622131100291));
        }
    }
}
