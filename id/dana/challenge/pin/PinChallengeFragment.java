package id.dana.challenge.pin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.challenge.ChallengeControl;
import id.dana.challenge.ChallengeScenario;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.LoginTrackingConstants;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.PinChallengeModule;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.richview.PinEntryEditText;
import id.dana.tracker.rds.RDSConstant;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ConnectSocketInterceptPoint;
import o.FtsOptions$Order;
import o.Helper;
import o.MainResourcePackage;
import o.PrepareException;
import o.beginTransaction;
import o.convertSpToPx;
import o.getChildrenSkipCount;
import o.getShortName;
import o.isBaselineAligned;
import o.isLowRamDevice;
import o.isMainThread;
import o.onOpen;
import o.onSubmit;
import o.resolve;
import o.stopIgnoring;
import o.updateActionSheetContent;

public class PinChallengeFragment extends FtsOptions$Order implements isMainThread.getMin {
    private String IsOverlapping;
    @BindView(2131363840)
    LinearLayout bottomMesageBlock;
    @BindView(2131361957)
    TextView bottomMessage;
    @BindView(2131361965)
    TextView bottomTryAgain;
    @Inject
    public getShortName dynamicUrlWrapper;
    private String equals;
    @BindView(2131364198)
    TextView forgotPin;
    private final onSubmit getMin = new onSubmit();
    private boolean hashCode;
    @Nullable
    @BindView(2131363152)
    ImageView icImageFg;
    @BindView(2131363222)
    PinEntryEditText inputPin;
    private ConnectSocketInterceptPoint isInside;
    @Inject
    public isMainThread.getMax presenter;
    @BindView(2131363156)
    RelativeLayout progressBar;
    @BindView(2131364444)
    RelativeLayout relativeWarningIcon;
    private Bundle setMax;
    private boolean setMin;
    @BindView(2131363157)
    ImageView successIcon;
    @BindView(2131364262)
    TextView successPin;
    private boolean toDoubleRange;
    private String toFloatRange;
    /* access modifiers changed from: private */
    public String toIntRange;
    private boolean toString;
    @BindView(2131363224)
    TextView txtInputPinMessage;
    private beginTransaction values;

    public final void getMin(boolean z) {
    }

    public final void length(LoginResponse loginResponse, List<String> list) {
    }

    public final int setMin() {
        return R.layout.fragment_input_pin;
    }

    public static PinChallengeFragment getMin(Bundle bundle) {
        PinChallengeFragment pinChallengeFragment = new PinChallengeFragment();
        pinChallengeFragment.setArguments(bundle);
        return pinChallengeFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.values = (beginTransaction) this.getMax;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append("must implement ChallengeScenarioListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public final void setMax() {
        String str;
        PrepareException.AnonymousClass1 r4;
        Bundle arguments = getArguments();
        this.setMax = arguments;
        if (arguments != null) {
            this.toIntRange = arguments.getString(ChallengeControl.Key.SCENARIO);
            this.equals = this.setMax.getString(ChallengeControl.Key.PUB_KEY);
            this.toFloatRange = this.setMax.getString(ChallengeControl.Key.SECURITY_ID);
            this.IsOverlapping = this.setMax.getString(ChallengeControl.Key.AUTH_TYPE);
            this.toString = this.setMax.getBoolean(ChallengeControl.Key.AUTH_STATUS, false);
            this.hashCode = this.setMax.getBoolean(ChallengeControl.Key.FACE_AUTH_NEW);
            this.toDoubleRange = this.setMax.getBoolean(ChallengeControl.Key.AUTO_ROUTE_STATUS);
            String str2 = this.toIntRange;
            if (this.isInside == null) {
                MainResourcePackage.setMin setmin = new MainResourcePackage.setMin((byte) 0);
                if (this.getMax != null) {
                    r4 = this.getMax.getApplicationComponent();
                } else {
                    r4 = null;
                }
                if (r4 != null) {
                    setmin.setMax = r4;
                    setmin.getMax = new PinChallengeModule(this, str2);
                    setmin.setMin = new AuthenticationModule(getActivity());
                    stopIgnoring.setMin(setmin.getMax, PinChallengeModule.class);
                    stopIgnoring.setMin(setmin.setMin, AuthenticationModule.class);
                    stopIgnoring.setMin(setmin.setMax, PrepareException.AnonymousClass1.class);
                    this.isInside = new MainResourcePackage(setmin.getMax, setmin.setMin, setmin.setMax, (byte) 0);
                } else {
                    throw null;
                }
            }
            this.isInside.setMax(this);
            getMin(this.presenter);
            str = this.setMax.getString(ChallengeControl.Key.REGISTRATION_SOURCE);
            this.presenter.getMax();
        } else {
            str = "";
        }
        if (str != null) {
            if ("TIX ID, Bukalapak, or Ramayana App".equalsIgnoreCase(str)) {
                str = getString(R.string.registration_source_merchant_app);
            }
            if ("payment_auth".equals(str) || "face_activation".equals(str) || "unbind_merchant".equals(str) || "twilio_otp".equals(str) || "twilio_pin".equals(str)) {
                this.txtInputPinMessage.setText(getString(R.string.input_password_payment_auth));
            } else if ("auto_route".equals(str)) {
                this.txtInputPinMessage.setText(getString(R.string.input_your_pin));
                this.forgotPin.setText(getString(R.string.forgot_pin_uppercase_with_question_mark));
            } else {
                this.txtInputPinMessage.setText(String.format(getString(R.string.input_password_with_register_source), new Object[]{str}));
            }
        }
        this.inputPin.requestFocus();
        this.inputPin.setOnBackButtonListener(new resolve(this));
        this.getMin.getMax(this.inputPin, new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() == PinChallengeFragment.this.inputPin.getMaxLength()) {
                    PinChallengeFragment.length(PinChallengeFragment.this, charSequence.toString());
                    if ("login".equals(PinChallengeFragment.this.toIntRange)) {
                        updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.BEGIN, "");
                    } else if (ChallengeScenario.RELOGIN.equals(PinChallengeFragment.this.toIntRange)) {
                        updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.BEGIN, "");
                    }
                }
            }

            public final void afterTextChanged(Editable editable) {
                convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_key_down", (String) RDSConstant.INPUT_PIN, editable.toString().replaceAll("[0-9]", "*"))};
                for (int i = 0; i <= 0; i++) {
                    convertsptopxArr[0].length();
                }
            }
        });
        this.inputPin.setOnFocusChangeListener(onOpen.getMax);
    }

    public final void o_() {
        super.o_();
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
    }

    public void showProgress() {
        this.values.hideClose();
        this.progressBar.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045);
        loadAnimation.setInterpolator(new LinearInterpolator());
        this.icImageFg.setVisibility(0);
        this.icImageFg.startAnimation(loadAnimation);
        this.inputPin.setVisibility(8);
    }

    public void dismissProgress() {
        this.values.showClose();
        this.progressBar.setVisibility(4);
        this.icImageFg.setVisibility(8);
        this.inputPin.setVisibility(0);
        this.forgotPin.setVisibility(0);
    }

    public void onError(String str) {
        getMin((String) null, str, 0);
    }

    private void setMax(String str, String str2, String str3, boolean z, boolean z2) {
        this.forgotPin.setVisibility(4);
        if (z) {
            this.inputPin.setVisibility(4);
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra(ChallengeControl.Key.CANCEL_REASON, str3);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("errorCode", str);
            }
            intent.putExtra("message", str2);
            this.getMax.setResult(0, intent);
            this.getMax.finish();
            return;
        }
        this.bottomMesageBlock.setVisibility(0);
        this.relativeWarningIcon.setVisibility(0);
        this.bottomMessage.setVisibility(0);
        TextView textView = this.bottomMessage;
        AnonymousClass4 r6 = new ClickableSpan() {
            public final void onClick(View view) {
                PinChallengeFragment.this.onTryAgain(view);
            }
        };
        String charSequence = getContext().getText(R.string.try_again).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(charSequence);
        String obj = sb.toString();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(r6, obj.indexOf(charSequence), obj.length(), 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        if (z2) {
            this.bottomTryAgain.setVisibility(8);
        } else {
            this.bottomTryAgain.setVisibility(4);
        }
    }

    @OnClick({2131361965})
    public void onTryAgain(View view) {
        this.successPin.setVisibility(4);
        this.relativeWarningIcon.setVisibility(4);
        this.bottomMessage.setVisibility(4);
        this.bottomTryAgain.setVisibility(4);
        this.bottomMesageBlock.setVisibility(4);
        this.inputPin.setText("");
        this.inputPin.setVisibility(0);
        this.inputPin.requestFocus();
        this.forgotPin.setVisibility(0);
    }

    public final void getMin() {
        convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.INPUT_PIN_LOST_FOCUS, false)};
        for (int i = 0; i <= 0; i++) {
            convertsptopxArr[0].length();
        }
        if ("login".equals(this.toIntRange)) {
            updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.SUCCESS_TO_HOME, "");
        } else if (ChallengeScenario.RELOGIN.equals(this.toIntRange)) {
            updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.SUCCESS_TO_HOME, "");
        }
        this.inputPin.setVisibility(4);
        this.forgotPin.setVisibility(4);
        this.successIcon.setVisibility(0);
        this.successPin.setVisibility(0);
        this.values.hideClose();
        this.values.onNext((List<String>) null);
    }

    public final void setMax(List<String> list) {
        if ("login".equals(this.toIntRange)) {
            updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.NormalLogin.SUCCESS_TO_OTPLOGIN, "");
        } else if (ChallengeScenario.RELOGIN.equals(this.toIntRange)) {
            updateActionSheetContent.behaviorAndLog(LoginTrackingConstants.ReLogin.SUCCESS_TO_OTPLOGIN, "");
        }
        this.values.onNext(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        r5 = r11;
        r6 = r2;
        r7 = true;
        r8 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(java.lang.String r10, java.lang.String r11, java.lang.Integer r12) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            if (r10 != 0) goto L_0x001b
            android.content.Context r11 = r9.getContext()
            r12 = 2131886631(0x7f120227, float:1.9407846E38)
            java.lang.CharSequence r11 = r11.getText(r12)
            java.lang.String r11 = r11.toString()
        L_0x0015:
            r5 = r11
            r6 = r2
            r7 = 0
            r8 = 1
            goto L_0x00f9
        L_0x001b:
            r3 = -1
            int r4 = r10.hashCode()
            switch(r4) {
                case -1814848530: goto L_0x00c9;
                case -1813066743: goto L_0x00be;
                case -1813066739: goto L_0x00b3;
                case -1813066738: goto L_0x00a8;
                case -1813066736: goto L_0x009d;
                case 100204731: goto L_0x0093;
                case 100205848: goto L_0x0089;
                case 100205849: goto L_0x007e;
                case 100205938: goto L_0x0073;
                case 408588460: goto L_0x0068;
                case 408588464: goto L_0x005d;
                case 408588589: goto L_0x0052;
                case 408594416: goto L_0x0047;
                case 995396396: goto L_0x003c;
                case 1658411398: goto L_0x0030;
                case 1787494118: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x00d2
        L_0x0025:
            java.lang.String r4 = "AE15102058020051"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 1
            goto L_0x00d2
        L_0x0030:
            java.lang.String r4 = "AE15002058020050"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 15
            goto L_0x00d2
        L_0x003c:
            java.lang.String r4 = "AE13101858018202"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 5
            goto L_0x00d2
        L_0x0047:
            java.lang.String r4 = "AE15101858018666"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 3
            goto L_0x00d2
        L_0x0052:
            java.lang.String r4 = "AE15101858018047"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 0
            goto L_0x00d2
        L_0x005d:
            java.lang.String r4 = "AE15101858018006"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 2
            goto L_0x00d2
        L_0x0068:
            java.lang.String r4 = "AE15101858018002"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 10
            goto L_0x00d2
        L_0x0073:
            java.lang.String r4 = "AE11112060005182"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 9
            goto L_0x00d2
        L_0x007e:
            java.lang.String r4 = "AE11112060005156"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 8
            goto L_0x00d2
        L_0x0089:
            java.lang.String r4 = "AE11112060005155"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 7
            goto L_0x00d2
        L_0x0093:
            java.lang.String r4 = "AE11112060005004"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 6
            goto L_0x00d2
        L_0x009d:
            java.lang.String r4 = "AE15112158065258"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 12
            goto L_0x00d2
        L_0x00a8:
            java.lang.String r4 = "AE15112158065256"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 11
            goto L_0x00d2
        L_0x00b3:
            java.lang.String r4 = "AE15112158065255"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 13
            goto L_0x00d2
        L_0x00be:
            java.lang.String r4 = "AE15112158065251"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 14
            goto L_0x00d2
        L_0x00c9:
            java.lang.String r4 = "AE15112158047821"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x00d2
            r3 = 4
        L_0x00d2:
            switch(r3) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00f5;
                case 9: goto L_0x00f5;
                case 10: goto L_0x00f5;
                case 11: goto L_0x00f5;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00f5;
                case 14: goto L_0x00f5;
                case 15: goto L_0x00e6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            android.content.Context r11 = r9.getContext()
            r12 = 2131888032(0x7f1207a0, float:1.9410688E38)
            java.lang.CharSequence r11 = r11.getText(r12)
            java.lang.String r11 = r11.toString()
            goto L_0x0015
        L_0x00e6:
            java.lang.String r12 = r12.toString()
            java.lang.String r3 = "{{leftTimes}}"
            java.lang.String r11 = r11.replace(r3, r12)
            goto L_0x0015
        L_0x00f3:
            java.lang.String r2 = "pin_temporary_locked"
        L_0x00f5:
            r5 = r11
            r6 = r2
            r7 = 1
            r8 = 0
        L_0x00f9:
            r3 = r9
            r4 = r10
            r3.setMax(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.challenge.pin.PinChallengeFragment.getMin(java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    public final void length(boolean z) {
        this.setMin = z;
    }

    public void onStart() {
        super.onStart();
        this.presenter.setMin();
    }

    @OnClick({2131364198})
    public void onForgotPin(View view) {
        if (this.setMin) {
            DanaH5.startContainerFullUrl(this.dynamicUrlWrapper.getForgotPinUrl());
            return;
        }
        String string = getContext().getString(R.string.option_call);
        new isBaselineAligned(requireContext(), isBaselineAligned.getDEFAULT_BEHAVIOR()).cancelOnTouchOutside(false).message(Integer.valueOf(R.string.call_customer_question), (CharSequence) null, (Function1<? super getChildrenSkipCount, Unit>) null).positiveButton((Integer) null, string, new isLowRamDevice(this)).negativeButton((Integer) null, getContext().getString(R.string.option_cancel), (Function1<? super isBaselineAligned, Unit>) null).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean getMax() {
        this.getMax.finish();
        return true;
    }

    static /* synthetic */ void length(PinChallengeFragment pinChallengeFragment, String str) {
        String str2 = pinChallengeFragment.toIntRange;
        if (str2 != null) {
            char c = 65535;
            switch (str2.hashCode()) {
                case -497502143:
                    if (str2.equals("payment_auth")) {
                        c = 0;
                        break;
                    }
                    break;
                case -489325167:
                    if (str2.equals("unbind_merchant")) {
                        c = 2;
                        break;
                    }
                    break;
                case -41045063:
                    if (str2.equals("auto_route")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1124674914:
                    if (str2.equals("twilio_pin")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1656771640:
                    if (str2.equals("face_activation")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                pinChallengeFragment.presenter.getMax(str, pinChallengeFragment.IsOverlapping, pinChallengeFragment.toString, pinChallengeFragment.equals, pinChallengeFragment.toFloatRange);
            } else if (c == 1) {
                pinChallengeFragment.presenter.length(str, pinChallengeFragment.equals, pinChallengeFragment.toFloatRange, Boolean.valueOf(pinChallengeFragment.hashCode));
            } else if (c == 2) {
                pinChallengeFragment.presenter.getMin(str, pinChallengeFragment.setMax);
            } else if (c == 3) {
                pinChallengeFragment.presenter.setMax(str, "PASSWORD", pinChallengeFragment.toFloatRange, "TWILIO_CONSULT");
            } else if (c != 4) {
                pinChallengeFragment.presenter.getMax(str, false);
            } else {
                pinChallengeFragment.presenter.setMax(str, pinChallengeFragment.equals, pinChallengeFragment.toFloatRange, pinChallengeFragment.toDoubleRange);
            }
        }
    }

    public static /* synthetic */ Unit length(PinChallengeFragment pinChallengeFragment) {
        Intent intent = new Intent();
        intent.putExtra(ChallengeControl.Key.CANCEL_REASON, "forgot_pin");
        pinChallengeFragment.getMax.setResult(0, intent);
        pinChallengeFragment.getMax.finish();
        return null;
    }

    public static /* synthetic */ void getMax(boolean z) {
        if (z) {
            convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.INPUT_PIN_GET_FOCUS, true)};
            for (int i = 0; i <= 0; i++) {
                convertsptopxArr[0].length();
            }
        }
    }
}
