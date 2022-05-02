package com.alipay.mobile.verifyidentity.business.otp.activity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.androidinter.app.safepaybase.widget.CenterTextView;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterface;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterfaceManager;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.activity.ProductActivity;
import com.alipay.mobile.verifyidentity.business.otp.R;
import com.alipay.mobile.verifyidentity.business.otp.product.OtpModule;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VerifyResponseCallBack;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobile.verifyidentity.uitools.JsonUtils;
import com.alipay.mobile.verifyidentity.uitools.count.CountTime;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;
import com.alipay.mobile.verifyidentity.uitools.verification.VerificationAction;
import com.alipay.mobile.verifyidentity.uitools.verification.VerificationCodeEditText;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.common.base.Ascii;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONException;
import org.json.JSONObject;

public class OtpActivity extends ProductActivity implements View.OnClickListener {
    private static final long DESTROY_DURATION = 500;
    public static final String TAG = OtpActivity.class.getSimpleName();
    private static IProduct.ICallback iCallback;
    /* access modifiers changed from: private */
    public static OtpModule otpProduct;
    private static long sLastDestroyTime = 0;
    private static long sLastResendTime = 0;
    public static final byte[] setMax = {37, 102, 47, -10, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int toFloatRange = 95;
    private final int DEFAULT_CHAR_COUNT = 6;
    private boolean HAS_OTHERS;
    private String footTips;
    String form_input_tip_low;
    private String form_input_tip_low_counting;
    private String form_input_tip_low_front;
    String form_title;
    private String form_title_2;
    String head_title;
    int inputCharCount = 6;
    String inputType;
    /* access modifiers changed from: private */
    public boolean isOtpClickSubmit;
    Message message;
    String mobile_no;
    String nextStep;
    /* access modifiers changed from: private */
    public String otp;
    private TextView resend;
    private CountTime resendCount;
    private int retryCount = 0;
    private View rl_title;
    private TextView tvEmail;
    private CenterTextView tvMiddleDescribe;
    private CenterTextView tvSendTip;
    /* access modifiers changed from: private */
    public VerificationCodeEditText tvVer;
    private TextView tvVerification;
    private TextView tv_changeMethod;
    private TextView tv_resend_front;
    private TextView tv_submit;
    String verifyId;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 175
            int r6 = r6 + 4
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r7 = r7 * 45
            int r7 = r7 + 56
            byte[] r0 = setMax
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0034
        L_0x001b:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x001f:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x002a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002a:
            byte r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0034:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + -2
            int r7 = r7 + 1
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.otp.activity.OtpActivity.setMax(short, short, int):java.lang.String");
    }

    static /* synthetic */ int access$908(OtpActivity otpActivity) {
        int i = otpActivity.retryCount;
        otpActivity.retryCount = i + 1;
        return i;
    }

    public static IProduct.ICallback getCallback() {
        return iCallback;
    }

    public static void setCallback(IProduct.ICallback iCallback2) {
        iCallback = iCallback2;
    }

    public static void setOtpProduct(OtpModule otpModule) {
        otpProduct = otpModule;
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        byte b = (byte) bArr[96];
        String max = setMax((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = setMax;
        byte b2 = (byte) bArr2[8];
        String max2 = setMax((byte) bArr2[96], b2, (byte) b2);
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
            onCancelLoad.setMax(2029308766, oncanceled);
            onCancelLoad.getMin(2029308766, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(2029308766, oncanceled2);
            onCancelLoad.getMin(2029308766, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(2029308766, oncanceled3);
            onCancelLoad.getMin(2029308766, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_otp);
        findViewById(R.id.ll_back).setOnClickListener(this);
        this.tvVerification = (TextView) findViewById(R.id.tv_verification);
        this.tvSendTip = (CenterTextView) findViewById(R.id.tv_send_tip);
        this.rl_title = findViewById(R.id.rl_title);
        findViewById(R.id.tv_middle_describe);
        this.tvEmail = (TextView) findViewById(R.id.tv_account);
        this.resend = (TextView) findViewById(R.id.tv_resend);
        this.tv_changeMethod = (TextView) findViewById(R.id.tv_remember);
        this.tvMiddleDescribe = (CenterTextView) findViewById(R.id.tv_middle_describe);
        this.tv_changeMethod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OtpActivity otpActivity = OtpActivity.this;
                VIEngine.changeVerifyMethod(otpActivity, otpActivity.verifyId);
            }
        });
        this.resend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OtpActivity.this.createResend();
                OtpActivity.this.doView(true);
            }
        });
        TextView textView = (TextView) findViewById(R.id.tv_confirm);
        this.tv_submit = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OtpActivity otpActivity = OtpActivity.this;
                otpActivity.conformOtp(otpActivity.otp);
            }
        });
        this.tv_resend_front = (TextView) findViewById(R.id.tv_resent_front);
    }

    public void initData() {
        Message message2 = (Message) getIntent().getSerializableExtra("message");
        this.message = message2;
        if (message2 != null) {
            this.verifyId = message2.getVerifyId();
            this.nextStep = this.message.getNextStep();
            try {
                JSONObject jSONObject = new JSONObject(this.message.getData());
                this.head_title = JsonUtils.getString(jSONObject, "head_title");
                String string = JsonUtils.getString(jSONObject, RequestConstants.Pin.INPUTCHARCOUNT);
                String string2 = JsonUtils.getString(jSONObject, "ackCodeLength");
                this.HAS_OTHERS = jSONObject.optBoolean("HAS_OTHERS", false);
                this.footTips = JsonUtils.getString(jSONObject, "foot_tip");
                if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                    this.inputCharCount = 6;
                } else if (TextUtils.isEmpty(string)) {
                    this.inputCharCount = Integer.parseInt(string2);
                } else {
                    this.inputCharCount = Integer.parseInt(string);
                }
                this.inputType = JsonUtils.getString(jSONObject, RequestConstants.Pin.INPUTTYPE);
                this.form_title = JsonUtils.getString(jSONObject, "form_title");
                this.mobile_no = JsonUtils.getString(jSONObject, "mobile_no");
                this.form_input_tip_low = JsonUtils.getString(jSONObject, RequestConstants.Pin.FORM_INPUT_TIP_LOW);
                this.form_input_tip_low_front = JsonUtils.getString(jSONObject, "form_input_tip_low_front");
                this.form_title_2 = JsonUtils.getString(jSONObject, "form_title_2");
                this.form_input_tip_low_counting = JsonUtils.getString(jSONObject, "form_input_tip_low_counting");
            } catch (JSONException unused) {
            }
        }
        initViewFromData();
    }

    public void modifyViewFromOutside() {
        TextView textView;
        TextView textView2;
        ViewGroup.LayoutParams layoutParams;
        ActivityInterface commonActivityInterface = ActivityInterfaceManager.getCommonActivityInterface();
        if (!TextUtils.isEmpty(commonActivityInterface.navBigColor())) {
            int parseColor = ColorUtils.parseColor(commonActivityInterface.navBigColor());
            if (!ColorUtils.isColorInvalid(parseColor)) {
                this.rl_title.setBackgroundColor(parseColor);
            }
        }
        if (commonActivityInterface.navTitleHeight() > 0 && (layoutParams = this.rl_title.getLayoutParams()) != null) {
            layoutParams.height = (int) ((((float) commonActivityInterface.navTitleHeight()) * getResources().getDisplayMetrics().density) + 0.5f);
            this.rl_title.setLayoutParams(layoutParams);
        }
        ActivityInterface otpActivityInterface = ActivityInterfaceManager.getOtpActivityInterface();
        if (!TextUtils.isEmpty(otpActivityInterface.navTitleColor())) {
            int parseColor2 = ColorUtils.parseColor(otpActivityInterface.navTitleColor());
            if (!ColorUtils.isColorInvalid(parseColor2)) {
                this.tvVerification.setTextColor(parseColor2);
            }
        }
        if (otpActivityInterface.navTitleFont() > 0) {
            this.tvVerification.setTextSize(1, (float) otpActivityInterface.navTitleFont());
        }
        if (!TextUtils.isEmpty(otpActivityInterface.formSubTitleColor())) {
            int parseColor3 = ColorUtils.parseColor(otpActivityInterface.formSubTitleColor());
            if (!ColorUtils.isColorInvalid(parseColor3)) {
                this.tvSendTip.setTextColor(parseColor3);
            }
        }
        if (otpActivityInterface.formSubTitleFont() > 0) {
            this.tvSendTip.setTextSize(1, (float) otpActivityInterface.formSubTitleFont());
        }
        if (otpActivityInterface.formSubTitleAlign() > 0) {
            this.tvSendTip.setGravity(otpActivityInterface.formSubTitleAlign());
        }
        if (!TextUtils.isEmpty(otpActivityInterface.formTitleColor())) {
            int parseColor4 = ColorUtils.parseColor(otpActivityInterface.formTitleColor());
            if (!ColorUtils.isColorInvalid(parseColor4)) {
                this.tvEmail.setTextColor(parseColor4);
            }
        }
        if (otpActivityInterface.formTitleFont() > 0) {
            this.tvEmail.setTextSize(1, (float) otpActivityInterface.formTitleFont());
        }
        if (otpActivityInterface.formTitleAlign() > 0) {
            this.tvEmail.setGravity(otpActivityInterface.formTitleAlign());
        }
        if (!TextUtils.isEmpty(otpActivityInterface.vcodeColor())) {
            int parseColor5 = ColorUtils.parseColor(otpActivityInterface.vcodeColor());
            if (!ColorUtils.isColorInvalid(parseColor5)) {
                this.tvVer.setTextColor(parseColor5);
            }
        }
        if (!TextUtils.isEmpty(otpActivityInterface.vcodeFocusColor())) {
            int parseColor6 = ColorUtils.parseColor(otpActivityInterface.vcodeFocusColor());
            if (!ColorUtils.isColorInvalid(parseColor6)) {
                this.tvVer.setBottomLineCursorColor(parseColor6);
            }
        }
        if (otpActivityInterface.vcodeFont() > 0) {
            this.tvVer.setTextSize(1, (float) otpActivityInterface.vcodeFont());
        }
        if (!TextUtils.isEmpty(otpActivityInterface.footLinkButtonColor())) {
            int parseColor7 = ColorUtils.parseColor(otpActivityInterface.footLinkButtonColor());
            if (this.resendCount != null && !ColorUtils.isColorInvalid(parseColor7)) {
                this.resendCount.setColorActive(parseColor7);
            }
        }
        if (!TextUtils.isEmpty(otpActivityInterface.footLinkButtonDisableColor())) {
            int parseColor8 = ColorUtils.parseColor(otpActivityInterface.footLinkButtonDisableColor());
            if (this.resendCount != null && !ColorUtils.isColorInvalid(parseColor8)) {
                this.resendCount.setColorDisable(parseColor8);
            }
        }
        if (otpActivityInterface.footLinkButtonFont() > 0 && (textView2 = this.resend) != null) {
            textView2.setTextSize(1, (float) otpActivityInterface.footLinkButtonFont());
        }
        if (otpActivityInterface.footLinkButtonAlign() > 0 && (textView = this.resend) != null) {
            textView.setGravity(otpActivityInterface.footLinkButtonAlign());
        }
        if (this.HAS_OTHERS && !TextUtils.isEmpty(this.footTips)) {
            this.tv_changeMethod.setVisibility(0);
            this.tv_changeMethod.setText(this.footTips);
        }
        if (otpActivityInterface.otpClickSubmit()) {
            this.isOtpClickSubmit = true;
            this.tv_submit.setVisibility(0);
            setSubmitState(false);
        }
        if (otpActivityInterface.otpResendStyle() == 1011) {
            this.tv_resend_front.setVisibility(0);
            this.tv_resend_front.setTextSize(12.0f);
            this.tv_resend_front.setTextColor(getResources().getColor(R.color.text_color));
            this.resend.setVisibility(0);
            this.resend.setTextSize(12.0f);
            this.resend.setTextColor(getResources().getColor(R.color.text_selected_color));
            this.resendCount.setColorDisable(getResources().getColor(R.color.high_light));
            this.tv_resend_front.setText(this.form_input_tip_low_front);
            this.resend.setText(this.form_input_tip_low);
            this.tvSendTip.setText(this.form_title);
            this.tvMiddleDescribe.setText(this.form_title_2);
            this.tvEmail.setTextColor(getResources().getColor(R.color.black));
            this.tvEmail.setTypeface(Typeface.defaultFromStyle(1));
            this.tvMiddleDescribe.setTextColor(getResources().getColor(R.color.content_color));
            this.tvSendTip.setTextColor(getResources().getColor(R.color.content_color));
            this.tv_resend_front.setTextColor(getResources().getColor(R.color.content_color));
        }
        if (otpActivityInterface.otpInputStyle() == 1021) {
            this.tvVer.setInputStyle(otpActivityInterface.otpInputStyle());
        }
        if (otpActivityInterface.otpHaveMiddleText()) {
            this.tvMiddleDescribe.setVisibility(0);
            this.tvMiddleDescribe.setTextSize((float) otpActivityInterface.otpMiddleTextSize());
        }
        if (otpActivityInterface.otpTopTitleTextSize() > 0) {
            this.tvSendTip.setTextSize((float) otpActivityInterface.otpTopTitleTextSize());
        }
        if (otpActivityInterface.otpCountTextSize() > 0) {
            this.tvEmail.setTextSize((float) otpActivityInterface.otpCountTextSize());
        }
        setFontStyle();
    }

    private void setFontStyle() {
        if (CustomUi.getTitleTypeface() != null) {
            this.tvVerification.setTypeface(CustomUi.getTitleTypeface());
        }
        if (CustomUi.getContentTypeface() != null) {
            this.tvEmail.setTypeface(CustomUi.getContentTypeface());
            this.tv_resend_front.setTypeface(CustomUi.getContentTypeface());
            this.resend.setTypeface(CustomUi.getContentTypeface());
            this.tv_changeMethod.setTypeface(CustomUi.getContentTypeface());
            this.tv_submit.setTypeface(CustomUi.getContentTypeface());
        }
    }

    /* access modifiers changed from: private */
    public void setSubmitState(boolean z) {
        this.tv_submit.setClickable(z);
        if (z) {
            this.tv_submit.setBackgroundResource(R.drawable.otp_submit_selected);
        } else {
            this.tv_submit.setBackgroundResource(R.drawable.otp_submit_unselected);
        }
    }

    private void initViewFromData() {
        this.tvVerification.setText(this.head_title);
        this.tvSendTip.setText(this.form_title);
        this.tvEmail.setText(this.mobile_no);
        initVerificationCodeEditText(this.inputCharCount);
        createResend();
        this.tvSendTip.setText(this.form_title);
        Message message2 = this.message;
        if (message2 != null && message2.getVerifyType() == 2) {
            doView(false);
        }
        Message message3 = this.message;
        if (message3 != null && !"SUCCESS".equalsIgnoreCase(message3.getVerifyCode())) {
            CustomUi.showCommonDialog(this, "", this.message.getVerifyMessage(), 1001, false, new ModalInterface() {
                public void onCancel() {
                }

                public void onOk() {
                    VIRespone vIRespone = new VIRespone(1004);
                    vIRespone.setMessage(OtpActivity.this.message);
                    vIRespone.setResponseMessage(OtpActivity.this.message);
                    vIRespone.setVerifyId(OtpActivity.this.message.getVerifyId());
                    if (OtpActivity.getCallback() != null) {
                        OtpActivity.getCallback().onResult(OtpActivity.otpProduct, vIRespone);
                    }
                    OtpActivity.this.finish();
                }
            });
        }
    }

    private void initVerificationCodeEditText(final int i) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1102687833, oncanceled);
            onCancelLoad.getMin(-1102687833, oncanceled);
        }
        VerificationCodeEditText verificationCodeEditText = (VerificationCodeEditText) findViewById(R.id.tv_ver);
        this.tvVer = verificationCodeEditText;
        verificationCodeEditText.setFigures(6);
        this.tvVer.setOnVerificationCodeChangedListener(new VerificationAction.OnVerificationCodeChangedListener() {
            public void onVerCodeChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (OtpActivity.this.isOtpClickSubmit && i3 != i) {
                    OtpActivity.this.setSubmitState(false);
                }
            }

            public void onInputCompleted(CharSequence charSequence) {
                if (OtpActivity.this.isOtpClickSubmit) {
                    String unused = OtpActivity.this.otp = charSequence.toString();
                    OtpActivity.this.setSubmitState(true);
                    return;
                }
                OtpActivity.this.conformOtp(charSequence.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    public void conformOtp(String str) {
        showSubmittingDialog();
        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a3.b2.c1", "0", ""}, (Map<String, String>) null, "", "", "", this.verifyId, false);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", str);
        } catch (JSONException unused) {
        }
        VIEngine.verifyRequest(this, this.verifyId, this.nextStep, jSONObject.toString(), new VerifyResponseCallBack() {
            public void verifyRequestSuccess(final MICRpcResponse mICRpcResponse) {
                if (mICRpcResponse == null) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a3.b2.c2", "1", ""}, (Map<String, String>) null, "", "", "", OtpActivity.this.verifyId, false);
                    return;
                }
                ClientLogKitManager.getClientLogKit().log("event", new String[]{"a3.b2.c2", "0", ""}, (Map<String, String>) null, "", "", "", OtpActivity.this.verifyId, false);
                if (mICRpcResponse.verifySuccess) {
                    VIRespone vIRespone = new VIRespone(1000);
                    vIRespone.setMessage(OtpActivity.this.message);
                    vIRespone.setVerifyId(mICRpcResponse.verifyId);
                    vIRespone.setResponseMessage(mICRpcResponse.convertToMessage());
                    if (OtpActivity.getCallback() != null) {
                        OtpActivity.getCallback().onResult(OtpActivity.otpProduct, vIRespone);
                    }
                    OtpActivity.this.finish();
                    return;
                }
                OtpActivity.this.clearInput();
                if (TextUtils.isEmpty(OtpActivity.this.nextStep) || !OtpActivity.this.nextStep.equalsIgnoreCase(mICRpcResponse.nextStep)) {
                    OtpActivity.this.clearInputFocus();
                    CustomUi.showCommonDialog(OtpActivity.this, "", mICRpcResponse.verifyMessage, 1001, false, new ModalInterface() {
                        public void onCancel() {
                        }

                        public void onOk() {
                            VIRespone vIRespone = new VIRespone(1001);
                            vIRespone.setMessage(OtpActivity.this.message);
                            vIRespone.setResponseMessage(mICRpcResponse.convertToMessage());
                            vIRespone.setVerifyId(mICRpcResponse.verifyId);
                            if (OtpActivity.getCallback() != null) {
                                OtpActivity.getCallback().onResult(OtpActivity.otpProduct, vIRespone);
                            }
                            OtpActivity.this.finish();
                        }
                    });
                    return;
                }
                CustomUi.showCenterToast(OtpActivity.this, mICRpcResponse.verifyMessage);
            }

            public void verifyRequestFail() {
                OtpActivity.access$908(OtpActivity.this);
                OtpActivity.this.clearInput();
            }
        });
    }

    /* access modifiers changed from: private */
    public void createResend() {
        long j = System.currentTimeMillis() - sLastDestroyTime <= DESTROY_DURATION ? sLastResendTime : DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
        if (!TextUtils.isEmpty(this.form_input_tip_low)) {
            this.resendCount = new CountTime(this, j, 1000, this.resend, this.form_input_tip_low);
        } else {
            this.resendCount = new CountTime(this, j, 1000, this.resend, getResources().getString(R.string.resend));
        }
        this.resendCount.start();
    }

    public void onResume() {
        super.onResume();
        this.tvVer.post(new Runnable() {
            public void run() {
                OtpActivity.this.tvVer.setFocusable(true);
                OtpActivity.this.tvVer.setFocusableInTouchMode(true);
                OtpActivity.this.tvVer.requestFocus();
                OtpActivity.this.tvVer.showKeyBoard(OtpActivity.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        VerificationCodeEditText verificationCodeEditText = this.tvVer;
        if (verificationCodeEditText != null) {
            verificationCodeEditText.hideKeyBoard(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        VerificationCodeEditText verificationCodeEditText = this.tvVer;
        if (verificationCodeEditText != null) {
            verificationCodeEditText.hideKeyBoard(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        sLastDestroyTime = System.currentTimeMillis();
        sLastResendTime = this.resendCount.getLastTime();
        CountTime countTime = this.resendCount;
        if (countTime != null) {
            countTime.cancel();
        }
        setCallback((IProduct.ICallback) null);
        setOtpProduct((OtpModule) null);
    }

    public void onClick(View view) {
        doCancel();
        finish();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int min;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-282943930, oncanceled);
            onCancelLoad.getMin(-282943930, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-282943930, oncanceled2);
            onCancelLoad.getMin(-282943930, oncanceled2);
        }
        if (4 == keyEvent.getKeyCode()) {
            doCancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: private */
    public void clearInput() {
        this.tvVer.setText("");
    }

    private void doCancel() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1102203202, oncanceled);
            onCancelLoad.getMin(1102203202, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1102203202, oncanceled2);
            onCancelLoad.getMin(1102203202, oncanceled2);
        }
        VIRespone vIRespone = new VIRespone(1003);
        vIRespone.setVerifyId(this.message.getVerifyId());
        vIRespone.setMessage(this.message);
        if (getCallback() != null) {
            getCallback().onResult(otpProduct, vIRespone);
        }
        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a3.b3.c2", "0", ""}, (Map<String, String>) null, "", "", "", this.verifyId, false);
    }

    /* access modifiers changed from: private */
    public void clearInputFocus() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1460459908, oncanceled);
            onCancelLoad.getMin(-1460459908, oncanceled);
        }
        VerificationCodeEditText verificationCodeEditText = this.tvVer;
        if (verificationCodeEditText != null) {
            verificationCodeEditText.post(new Runnable() {
                public void run() {
                    OtpActivity.this.tvVer.clearFocus();
                    OtpActivity.this.tvVer.hideKeyBoard(OtpActivity.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void doView(final boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2013677743 == (max = dispatchOnCancelled.getMax(applicationContext, -2013677743)))) {
            onCanceled oncanceled = new onCanceled(-2013677743, max, 512);
            onCancelLoad.setMax(-2013677743, oncanceled);
            onCancelLoad.getMin(-2013677743, oncanceled);
        }
        if (z) {
            showSubmittingDialog();
            ClientLogKitManager.getClientLogKit().log("event", new String[]{"a3.b3.c1", "0", ""}, (Map<String, String>) null, "", "", "", this.verifyId, false);
        }
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public MICRpcResponse execute() throws Exception {
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = RequestConstants.VIEW;
                mICRpcRequest.module = OtpActivity.this.nextStep;
                mICRpcRequest.verifyId = OtpActivity.this.verifyId;
                mICRpcRequest.data = new JSONObject().toString();
                mICRpcRequest.version = "1.0.0";
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public void onSuccess(MICRpcResponse mICRpcResponse) {
                if (z) {
                    OtpActivity.this.hideSubmittingDialog();
                }
                if (mICRpcResponse != null) {
                    if (!"SUCCESS".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        CustomUi.showCenterToast(OtpActivity.this, mICRpcResponse.verifyMessage);
                    }
                    OtpActivity.this.clearInput();
                }
            }

            public void onFailure(IAPError iAPError) {
                OtpActivity.this.clearInput();
                if (z) {
                    OtpActivity.this.hideSubmittingDialog();
                }
                CustomUi.showCenterToast(OtpActivity.this, iAPError.errorMessage);
            }
        });
    }
}
