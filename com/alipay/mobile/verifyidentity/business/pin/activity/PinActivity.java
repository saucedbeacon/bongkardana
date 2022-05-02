package com.alipay.mobile.verifyidentity.business.pin.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.androidinter.app.safepaybase.EncryptRandomType;
import com.alipay.androidinter.app.safepaybase.OnConfirmListener;
import com.alipay.androidinter.app.safepaybase.SafeInputContext;
import com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.androidinter.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.OnClickUrl;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterface;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterfaceManager;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.activity.HandlerCallback;
import com.alipay.mobile.verifyidentity.business.activity.ProductActivity;
import com.alipay.mobile.verifyidentity.business.pin.R;
import com.alipay.mobile.verifyidentity.business.pin.product.PinModule;
import com.alipay.mobile.verifyidentity.framework.engine.VIAction;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONException;
import org.json.JSONObject;

public class PinActivity extends ProductActivity {
    private static final String INPUT_TYPE_NUMERIC = "numeric";
    private static final int TRANSLATE_ANIMATION = 2000;
    private static IProduct.ICallback iCallback;
    public static final int isInside = 90;
    /* access modifiers changed from: private */
    public static PinModule pinProduct;
    public static final byte[] setMax = {56, -57, 114, -112, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    boolean HAS_OTHERS;
    String account_encrypt_pubkey;
    String account_encrypt_salt;
    /* access modifiers changed from: private */
    public AliKeyboardType aliKeyboardType = AliKeyboardType.num;
    /* access modifiers changed from: private */
    public AlipayKeyboard alipayKeyboard;
    private float density;
    private float destMargin;
    private FrameLayout flBack;
    private FrameLayout flKeyboard;
    String footTips;
    String form_button;
    String form_input_tip_low;
    String form_input_tip_url;
    String form_title;
    boolean half_screen;
    String head_title;
    private ImageButton ibBack;
    private ImageButton ibHalfBack;
    private float initialMargin;
    int inputCharCount = 6;
    String inputType;
    private LinearLayout llContent;
    Message message;
    String nextStep;
    String predata;
    private FrameLayout pwdInput;
    /* access modifiers changed from: private */
    public int retryCount = 0;
    private View rl_title;
    /* access modifiers changed from: private */
    public SafeInputContext safeInputContext;
    private float stepMargin;
    private TextView tvFindpass;
    private TextView tvFindpassCenter;
    private TextView tvTip;
    private TextView tvVerification;
    String verifyId;
    String verifyMessage;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 * 45
            int r5 = r5 + 56
            byte[] r0 = setMax
            int r7 = r7 * 175
            int r7 = 179 - r7
            int r6 = r6 * 165
            int r6 = 176 - r6
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x001a
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            r7 = r6
            goto L_0x0031
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r6) goto L_0x0028
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0028:
            byte r3 = r0[r7]
            r4 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0031:
            int r6 = -r6
            int r5 = r5 + r6
            int r6 = r0 + 1
            int r5 = r5 + -2
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.pin.activity.PinActivity.length(byte, byte, int):java.lang.String");
    }

    static /* synthetic */ int access$808(PinActivity pinActivity) {
        int i = pinActivity.retryCount;
        pinActivity.retryCount = i + 1;
        return i;
    }

    public static IProduct.ICallback getCallback() {
        return iCallback;
    }

    public static void setCallback(IProduct.ICallback iCallback2) {
        iCallback = iCallback2;
    }

    public static void setPinProduct(PinModule pinModule) {
        pinProduct = pinModule;
    }

    /* access modifiers changed from: private */
    public void doCancel() {
        String str;
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-16694050, oncanceled);
            onCancelLoad.getMin(-16694050, oncanceled);
        }
        Message message2 = this.message;
        if (message2 != null) {
            str = message2.getVerifyId();
        } else {
            str = "";
        }
        VIRespone vIRespone = new VIRespone(1003);
        vIRespone.setVerifyId(str);
        vIRespone.setMessage(this.message);
        if (getCallback() != null) {
            getCallback().onResult(pinProduct, vIRespone);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("retryNum", String.valueOf(this.retryCount));
        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a2.b3.c1", "0", ""}, hashMap, "", "SecVI_Seed_Pwd_Cancel", "", str, false);
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        String length3 = length((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String length4 = length((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(1554117130, oncanceled);
            onCancelLoad.getMin(1554117130, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1554117130, oncanceled2);
            onCancelLoad.getMin(1554117130, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1554117130, oncanceled3);
            onCancelLoad.getMin(1554117130, oncanceled3);
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(R.layout.activity_pin);
        this.density = getResources().getDisplayMetrics().density;
        this.initialMargin = (float) getResources().getDisplayMetrics().heightPixels;
        this.llContent = (LinearLayout) findViewById(R.id.ll_content);
        this.tvVerification = (TextView) findViewById(R.id.tv_verification);
        this.tvTip = (TextView) findViewById(R.id.tv_tip);
        this.pwdInput = (FrameLayout) findViewById(R.id.pwd_input);
        this.flKeyboard = (FrameLayout) findViewById(R.id.fl_keyboard);
        this.flBack = (FrameLayout) findViewById(R.id.fl_back);
        this.ibHalfBack = (ImageButton) findViewById(R.id.ib_half_back);
        this.ibBack = (ImageButton) findViewById(R.id.ib_back);
        this.tvFindpass = (TextView) findViewById(R.id.tv_findpass);
        AlipayKeyboard alipayKeyboard2 = (AlipayKeyboard) findViewById(R.id.keyboard);
        this.alipayKeyboard = alipayKeyboard2;
        alipayKeyboard2.initializeKeyboard(this.flKeyboard);
        this.tvFindpassCenter = (TextView) findViewById(R.id.tv_findpass_center);
        this.rl_title = findViewById(R.id.rl_title);
        this.flBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PinActivity.this.doCancel();
                PinActivity.this.finish();
            }
        });
        registerHandlerCallback(new HandlerCallback() {
            public void handleMessage(android.os.Message message) {
                if (message.what == 2000) {
                    PinActivity.this.translateUi();
                }
            }
        });
    }

    public void initData() {
        Message message2 = (Message) getIntent().getSerializableExtra("message");
        this.message = message2;
        if (message2 != null) {
            this.verifyId = message2.getVerifyId();
            this.verifyMessage = this.message.getVerifyMessage();
            this.nextStep = this.message.getNextStep();
            this.predata = this.message.getPredata();
            try {
                JSONObject jSONObject = new JSONObject(this.message.getData());
                this.HAS_OTHERS = jSONObject.optBoolean("HAS_OTHERS", false);
                this.half_screen = jSONObject.optBoolean(RequestConstants.Pin.HALF_SCREEN, false);
                this.account_encrypt_pubkey = jSONObject.optString(RequestConstants.Pin.ACCOUNT_ENCRYPT_PUBKEY);
                String optString = jSONObject.optString(RequestConstants.Pin.INPUTCHARCOUNT);
                this.inputCharCount = TextUtils.isEmpty(optString) ? 6 : Integer.parseInt(optString);
                this.inputType = jSONObject.optString(RequestConstants.Pin.INPUTTYPE);
                this.account_encrypt_salt = jSONObject.optString(RequestConstants.Pin.ACCOUNT_ENCRYPT_SALT);
                this.form_title = jSONObject.optString("form_title");
                if (!TextUtils.isEmpty(this.predata) && !TextUtils.isEmpty(this.verifyMessage)) {
                    this.form_title = this.verifyMessage;
                }
                this.form_button = jSONObject.optString(RequestConstants.Pin.FORM_BUTTON);
                this.form_input_tip_low = jSONObject.optString(RequestConstants.Pin.FORM_INPUT_TIP_LOW);
                this.form_input_tip_url = jSONObject.optString(RequestConstants.Pin.FORM_INPUT_TIP_URL);
                this.head_title = jSONObject.optString("head_title");
                this.footTips = jSONObject.optString("foot_tip");
            } catch (JSONException unused) {
            }
        }
        initViewFromData();
    }

    /* access modifiers changed from: private */
    public void hideContent() {
        this.tvTip.setVisibility(8);
        this.pwdInput.setVisibility(8);
        this.tvFindpass.setVisibility(8);
        this.tvFindpassCenter.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void showContent() {
        this.tvTip.setVisibility(0);
        this.pwdInput.setVisibility(0);
        if (!TextUtils.isEmpty(this.form_input_tip_low) && !TextUtils.isEmpty(this.form_input_tip_url)) {
            this.tvFindpass.setVisibility(0);
        }
        if (this.HAS_OTHERS && !TextUtils.isEmpty(this.footTips)) {
            if (TextUtils.isEmpty(this.form_input_tip_low) || TextUtils.isEmpty(this.form_input_tip_url)) {
                this.tvFindpassCenter.setVisibility(8);
                this.tvFindpass.setVisibility(0);
                this.tvFindpass.setText(this.footTips);
                return;
            }
            this.tvFindpassCenter.setVisibility(0);
            this.tvFindpassCenter.setText(this.footTips);
        }
    }

    private void initViewFromData() {
        if (INPUT_TYPE_NUMERIC.equalsIgnoreCase(this.inputType)) {
            this.safeInputContext = new SafeInputContext(this, true, this.inputCharCount);
            this.aliKeyboardType = AliKeyboardType.num;
        } else {
            this.safeInputContext = new SafeInputContext(this, false, this.inputCharCount);
            this.aliKeyboardType = AliKeyboardType.abc;
        }
        this.pwdInput.addView(this.safeInputContext.getContentView(), new FrameLayout.LayoutParams(-1, -2));
        this.safeInputContext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!PinActivity.this.alipayKeyboard.isShowKeyboard()) {
                    PinActivity.this.alipayKeyboard.showKeyboard(PinActivity.this.aliKeyboardType, PinActivity.this.safeInputContext.getEditText(), 0);
                }
                PinActivity.this.alipayKeyboard.post(new Runnable() {
                    public void run() {
                        InputMethodManager inputMethodManager = (InputMethodManager) PinActivity.this.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(PinActivity.this.safeInputContext.getEditText().getWindowToken(), 0);
                        }
                    }
                });
            }
        });
        this.safeInputContext.setRsaPublicKey(this.account_encrypt_pubkey);
        this.safeInputContext.setEncryptRandomStringAndType(this.account_encrypt_salt, EncryptRandomType.randombefore);
        this.safeInputContext.setOkButtonText(this.form_button);
        this.tvVerification.setText(this.head_title);
        this.tvTip.setText(this.form_title);
        if (TextUtils.isEmpty(this.form_input_tip_low) || TextUtils.isEmpty(this.form_input_tip_url)) {
            this.tvFindpass.setVisibility(8);
        } else {
            this.tvFindpass.setVisibility(0);
            this.tvFindpass.setText(this.form_input_tip_low);
            this.tvFindpass.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    OnClickUrl onClickUrl = VIEngine.getOnClickUrl();
                    if (onClickUrl != null) {
                        PinActivity pinActivity = PinActivity.this;
                        onClickUrl.onClickHttpUrl(pinActivity, pinActivity.form_input_tip_url);
                    }
                    VIRespone vIRespone = new VIRespone(1007);
                    vIRespone.setVerifyId(PinActivity.this.verifyId);
                    vIRespone.setMessage(PinActivity.this.message);
                    if (PinActivity.getCallback() != null) {
                        PinActivity.getCallback().onResult(PinActivity.pinProduct, vIRespone);
                    }
                    PinActivity.this.finish();
                }
            });
        }
        if (!this.HAS_OTHERS || TextUtils.isEmpty(this.footTips)) {
            this.tvFindpassCenter.setVisibility(8);
        } else if (TextUtils.isEmpty(this.form_input_tip_low) || TextUtils.isEmpty(this.form_input_tip_url)) {
            this.tvFindpassCenter.setVisibility(8);
            this.tvFindpass.setVisibility(0);
            this.tvFindpass.setText(this.footTips);
            this.tvFindpass.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("verifyType", "1");
                    hashMap.put("module", RequestConstants.MENU);
                    hashMap.put("verifyId", PinActivity.this.verifyId);
                    VIEngine.verify(PinActivity.this, RequestConstants.VerifyProductVerify, RequestConstants.VerifyCallAllInsert, hashMap, (Map<String, String>) null, new VIEngine.VIListener() {
                        public void onVerifyAction(VIAction vIAction) {
                        }

                        public void onVerifyResult(VIResult vIResult) {
                        }
                    }, (VIEngine.OnQueryResult) null);
                }
            });
        } else {
            this.tvFindpassCenter.setVisibility(0);
            this.tvFindpassCenter.setText(this.footTips);
            this.tvFindpassCenter.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("verifyType", "1");
                    hashMap.put("module", RequestConstants.MENU);
                    hashMap.put("verifyId", PinActivity.this.verifyId);
                    VIEngine.verify(PinActivity.this, RequestConstants.VerifyProductVerify, RequestConstants.VerifyCallAllInsert, hashMap, (Map<String, String>) null, new VIEngine.VIListener() {
                        public void onVerifyAction(VIAction vIAction) {
                        }

                        public void onVerifyResult(VIResult vIResult) {
                        }
                    }, (VIEngine.OnQueryResult) null);
                }
            });
        }
        this.safeInputContext.setOnConfirmListener(new OnConfirmListener() {
            public void onUserConfirm(final String str) {
                if (PinActivity.this.safeInputContext != null) {
                    PinActivity.this.safeInputContext.clearText();
                    PinActivity.this.hideContent();
                }
                PinActivity.this.showSubmittingDialog();
                HashMap hashMap = new HashMap();
                hashMap.put("retryNum", String.valueOf(PinActivity.this.retryCount));
                ClientLogKitManager.getClientLogKit().log("event", new String[]{"a2.b2.c1", "0", ""}, hashMap, "", "SecVI_Seed_Pwd_Verify", "", PinActivity.this.verifyId, false);
                IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
                    public MICRpcResponse execute() throws Exception {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.action = RequestConstants.VERIFY;
                        mICRpcRequest.module = PinActivity.this.nextStep;
                        mICRpcRequest.verifyId = PinActivity.this.verifyId;
                        JSONObject jSONObject = new JSONObject();
                        if (TextUtils.isEmpty(PinActivity.this.predata)) {
                            jSONObject.put("data", str);
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(RequestConstants.KEY_ENCRYPT_PWD, str);
                            jSONObject2.put(RequestConstants.KEY_PREDATA, PinActivity.this.predata);
                            jSONObject.put("data", jSONObject2.toString());
                        }
                        mICRpcRequest.data = jSONObject.toString();
                        mICRpcRequest.version = "1.0.0";
                        try {
                            return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    public void onSuccess(final MICRpcResponse mICRpcResponse) {
                        PinActivity.this.hideSubmittingDialog();
                        if (mICRpcResponse == null) {
                            if (PinActivity.this != null && !PinActivity.this.isFinishing()) {
                                PinActivity.this.safeInputContext.clearText();
                                CustomUi.showCenterToast(PinActivity.this, PinActivity.this.getResources().getString(R.string.pin_system_busy_error));
                            }
                            ClientLogKitManager.getClientLogKit().log("event", new String[]{"a2.b2.c2", "1", ""}, (Map<String, String>) null, "", "SecVI_Seed_Pwd_Result", "", PinActivity.this.verifyId, false);
                            PinActivity.this.showContent();
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("finishedCode", mICRpcResponse.finishCode);
                        hashMap.put("finishedMsg", mICRpcResponse.finishMessage);
                        hashMap.put("verifyMsg", mICRpcResponse.verifyMessage);
                        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a2.b2.c2", "0", ""}, hashMap, "", "SecVI_Seed_Pwd_Result", "", PinActivity.this.verifyId, false);
                        if (mICRpcResponse.verifySuccess) {
                            VIRespone vIRespone = new VIRespone(1000);
                            vIRespone.setResponseMessage(mICRpcResponse.convertToMessage());
                            vIRespone.setVerifyId(mICRpcResponse.verifyId);
                            vIRespone.setMessage(PinActivity.this.message);
                            if (PinActivity.getCallback() != null) {
                                PinActivity.getCallback().onResult(PinActivity.pinProduct, vIRespone);
                            }
                            PinActivity.this.finish();
                        } else {
                            PinActivity.this.safeInputContext.clearText();
                            if (TextUtils.isEmpty(PinActivity.this.nextStep) || !PinActivity.this.nextStep.equalsIgnoreCase(mICRpcResponse.nextStep)) {
                                CustomUi.showCommonDialog(PinActivity.this, "", mICRpcResponse.verifyMessage, 1001, false, new ModalInterface() {
                                    public void onCancel() {
                                    }

                                    public void onOk() {
                                        VIRespone vIRespone = new VIRespone(1001);
                                        vIRespone.setResponseMessage(mICRpcResponse.convertToMessage());
                                        vIRespone.setMessage(PinActivity.this.message);
                                        vIRespone.setVerifyId(mICRpcResponse.verifyId);
                                        if (PinActivity.getCallback() != null) {
                                            PinActivity.getCallback().onResult(PinActivity.pinProduct, vIRespone);
                                        }
                                        PinActivity.this.finish();
                                    }
                                });
                            } else {
                                CustomUi.showCommonDialog(PinActivity.this, "", mICRpcResponse.verifyMessage, 1001, true, new ModalInterface() {
                                    public void onCancel() {
                                    }

                                    public void onOk() {
                                    }
                                });
                            }
                        }
                        PinActivity.this.showContent();
                    }

                    public void onFailure(final IAPError iAPError) {
                        PinActivity.this.safeInputContext.clearText();
                        PinActivity.this.hideSubmittingDialog();
                        PinActivity.access$808(PinActivity.this);
                        CustomUi.showCommonDialog(PinActivity.this, "", iAPError.errorMessage, 1001, true, new ModalInterface() {
                            public void onCancel() {
                            }

                            public void onOk() {
                                if ("5".equalsIgnoreCase(iAPError.errorCode)) {
                                    PinActivity.this.finish();
                                }
                            }
                        });
                        PinActivity.this.showContent();
                    }
                });
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("halfScreen", String.valueOf(this.half_screen));
        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a2.b1.c2", "0", ""}, hashMap, "", "SecVI_Seed_Pwd_DrawView", "", this.verifyId, false);
        if (!this.half_screen) {
            this.ibBack.setVisibility(0);
            this.ibHalfBack.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.llContent.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.llContent.setLayoutParams(layoutParams);
            }
            this.safeInputContext.getContentView().post(new Runnable() {
                public void run() {
                    PinActivity.this.alipayKeyboard.showKeyboard(PinActivity.this.aliKeyboardType, PinActivity.this.safeInputContext.getEditText(), 0);
                }
            });
            return;
        }
        this.ibBack.setVisibility(8);
        this.ibHalfBack.setVisibility(0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.llContent.getLayoutParams();
        layoutParams2.topMargin = (int) this.initialMargin;
        this.llContent.setLayoutParams(layoutParams2);
        float navigationBarHeight = (this.initialMargin - (this.density * 442.0f)) - ((float) getNavigationBarHeight());
        this.destMargin = navigationBarHeight;
        this.stepMargin = (this.initialMargin - navigationBarHeight) / 10.0f;
        translateUi();
    }

    /* access modifiers changed from: private */
    public void translateUi() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.llContent.getLayoutParams();
        layoutParams.topMargin = (int) (((float) layoutParams.topMargin) - this.stepMargin);
        this.llContent.setLayoutParams(layoutParams);
        if (Math.abs(((float) layoutParams.topMargin) - this.destMargin) < 1.0f || ((float) layoutParams.topMargin) < this.destMargin) {
            getWeakHandler().removeMessages(2000);
            this.safeInputContext.getContentView().post(new Runnable() {
                public void run() {
                    PinActivity.this.alipayKeyboard.showKeyboard(PinActivity.this.aliKeyboardType, PinActivity.this.safeInputContext.getEditText(), 0);
                }
            });
            return;
        }
        getWeakHandler().sendEmptyMessageDelayed(2000, 10);
    }

    public void modifyViewFromOutside() {
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
        ActivityInterface pinActivityInterface = ActivityInterfaceManager.getPinActivityInterface();
        if (pinActivityInterface.navTitleFont() > 0) {
            this.tvVerification.setTextSize(1, (float) pinActivityInterface.navTitleFont());
        }
        if (!TextUtils.isEmpty(pinActivityInterface.navTitleColor())) {
            int parseColor2 = ColorUtils.parseColor(pinActivityInterface.navTitleColor());
            if (!ColorUtils.isColorInvalid(parseColor2)) {
                this.tvVerification.setTextColor(parseColor2);
            }
        }
        if (!TextUtils.isEmpty(pinActivityInterface.bodyTitleColor())) {
            int parseColor3 = ColorUtils.parseColor(pinActivityInterface.bodyTitleColor());
            if (!ColorUtils.isColorInvalid(parseColor3)) {
                this.tvTip.setTextColor(parseColor3);
            }
        }
        if (pinActivityInterface.bodyTitleFont() > 0) {
            this.tvTip.setTextSize(1, (float) pinActivityInterface.bodyTitleFont());
        }
        if (pinActivityInterface.bodyTitleAlign() > 0) {
            this.tvTip.setGravity(pinActivityInterface.bodyTitleAlign());
        }
        setFontStyle();
    }

    private void setFontStyle() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1394358315, oncanceled);
            onCancelLoad.getMin(-1394358315, oncanceled);
        }
        if (CustomUi.getTitleTypeface() != null) {
            this.tvVerification.setTypeface(CustomUi.getTitleTypeface());
        }
        if (CustomUi.getContentTypeface() != null) {
            this.tvTip.setTypeface(CustomUi.getContentTypeface());
            this.tvFindpass.setTypeface(CustomUi.getContentTypeface());
            this.tvFindpassCenter.setTypeface(CustomUi.getContentTypeface());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-116511086, oncanceled);
            onCancelLoad.getMin(-116511086, oncanceled);
        }
        if (4 == keyEvent.getKeyCode()) {
            if (this.alipayKeyboard.isShowKeyboard()) {
                this.alipayKeyboard.hideKeyboard();
                return true;
            }
            doCancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    public void onDestroy() {
        super.onDestroy();
        this.safeInputContext.clearText();
        setCallback((IProduct.ICallback) null);
        setPinProduct((PinModule) null);
    }
}
