package com.alipay.mobile.verifyidentity.business.security.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alipay.androidinter.app.safepaybase.widget.CenterTextView;
import com.alipay.fc.riskcloud.biz.mic.rpc.ICRpcService;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.OnClickUrl;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterface;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterfaceManager;
import com.alipay.mobile.verifyidentity.business.activity.BaseActivity;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.menu.activity.MenuActivity;
import com.alipay.mobile.verifyidentity.business.security.R;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.NoDoubleClickUtils;
import com.alipay.mobile.verifyidentity.framework.engine.VIAction;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngineUtils;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobile.verifyidentity.uitools.dialog.CommonDialog;
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

public class SecurityPrepareActivity extends BaseActivity {
    public static final byte[] setMax = {70, -85, 0, 0, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 105;
    /* access modifiers changed from: private */
    public String button1Action;
    private String button1Text;
    /* access modifiers changed from: private */
    public String button2Action;
    private String button2Text;
    /* access modifiers changed from: private */
    public boolean isClickSetUp = false;
    private Message message;
    private String nextAction;
    /* access modifiers changed from: private */
    public String nextStep;
    private String pageTitle;
    /* access modifiers changed from: private */
    public String prodmngId;
    /* access modifiers changed from: private */
    public String productType;
    private String protocolText;
    private String protocolTip;
    /* access modifiers changed from: private */
    public String protocolUrl;
    private SecuritySuccessReceiver receiver;
    /* access modifiers changed from: private */
    public MICRpcResponse requestResult;
    private View rl_title;
    /* access modifiers changed from: private */
    public String sceneId;
    private String setUpText;
    /* access modifiers changed from: private */
    public String tntInstId;
    private TextView tv_bnt1;
    private TextView tv_bnt2;
    private CenterTextView tv_center;
    private TextView tv_link;
    private TextView tv_link_before;
    private TextView tv_title;
    /* access modifiers changed from: private */
    public String userId;
    /* access modifiers changed from: private */
    public String verifyId;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r7, int r8, short r9) {
        /*
            int r8 = r8 * 45
            int r8 = r8 + 56
            int r9 = r9 * 175
            int r9 = 178 - r9
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r0 = setMax
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r9
            goto L_0x0030
        L_0x0018:
            r3 = 0
        L_0x0019:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L_0x0028
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0028:
            byte r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0030:
            int r9 = r9 + r8
            int r8 = r9 + -2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.security.activity.SecurityPrepareActivity.setMax(int, int, short):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte b = (byte) setMax[85];
        byte b2 = (byte) b;
        String max2 = setMax(b, b2, (byte) b2);
        byte b3 = (byte) setMax[2];
        byte b4 = (byte) b3;
        String max3 = setMax(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(-2113500161, oncanceled);
            onCancelLoad.getMin(-2113500161, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -2113500161 == (max = dispatchOnCancelled.getMax(applicationContext2, -2113500161)))) {
            onCanceled oncanceled2 = new onCanceled(-2113500161, max, 512);
            onCancelLoad.setMax(-2113500161, oncanceled2);
            onCancelLoad.getMin(-2113500161, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-2113500161, oncanceled3);
            onCancelLoad.getMin(-2113500161, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_securityquestion_list);
        initView();
        initData();
    }

    private void initView() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-346728659, oncanceled);
            onCancelLoad.getMin(-346728659, oncanceled);
        }
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.tv_center = (CenterTextView) findViewById(R.id.tv_content_center);
        this.tv_link_before = (TextView) findViewById(R.id.tv_link_before);
        this.rl_title = findViewById(R.id.rl_title);
        this.tv_link = (TextView) findViewById(R.id.tv_link);
        this.tv_bnt1 = (TextView) findViewById(R.id.tv_bnt1);
        this.tv_bnt2 = (TextView) findViewById(R.id.tv_bnt2);
        findViewById(R.id.ll_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SecurityPrepareActivity.this.finish();
            }
        });
        registerReceiver();
    }

    public void initData() {
        Message message2 = (Message) getIntent().getSerializableExtra("message");
        this.message = message2;
        if (message2 != null) {
            this.nextStep = message2.getNextStep();
            this.prodmngId = this.message.getProdmngId();
            this.nextAction = this.message.getNextAction();
            this.sceneId = this.message.getSceneId();
            this.userId = this.message.getUserId();
            this.tntInstId = this.message.getTntInstId();
            this.productType = this.message.getProductType();
            try {
                JSONObject jSONObject = new JSONObject(new JSONObject(this.message.getData()).optString(MessageConstants.KEY_PAGE_MODEL));
                this.setUpText = jSONObject.optString(MessageConstants.KEY_SETUP_TEXT);
                this.protocolTip = jSONObject.optString(MessageConstants.KEY_PROTOCOLTIP);
                this.protocolText = jSONObject.optString(MessageConstants.KEY_PROTOCOLTEXT);
                this.pageTitle = jSONObject.optString("pageTitle");
                this.protocolUrl = jSONObject.optString("protocolUrl");
                this.button1Text = jSONObject.optString(MessageConstants.KEY_BUTTON1TEXT);
                this.button1Action = jSONObject.optString(MessageConstants.KEY_BUTTON1ACTION);
                this.button2Text = jSONObject.optString(MessageConstants.KEY_BUTTON2TEXT);
                this.button2Action = jSONObject.optString(MessageConstants.KEY_BUTTON2ACTION);
            } catch (Exception unused) {
            }
        }
        initViewFromData();
    }

    private void registerReceiver() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1547691408, oncanceled);
            onCancelLoad.getMin(1547691408, oncanceled);
        }
        this.receiver = new SecuritySuccessReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SecurityConstants.KEY_SET_SECURITY_SUCCESSFUL);
        intentFilter.addAction(MenuActivity.VERIFY_SUCCESS);
        registerReceiver(this.receiver, intentFilter);
    }

    class SecuritySuccessReceiver extends BroadcastReceiver {
        private SecuritySuccessReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(SecurityConstants.KEY_SET_SECURITY_SUCCESSFUL)) {
                if (!SecurityPrepareActivity.this.isFinishing()) {
                    SecurityPrepareActivity.this.finish();
                }
            } else if (intent.getAction().equals(MenuActivity.VERIFY_SUCCESS) && intent.getExtras().getString("verifyId").equals(SecurityPrepareActivity.this.verifyId)) {
                if (SecurityPrepareActivity.this.isClickSetUp) {
                    SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                    securityPrepareActivity.gotoSetquestionPage(securityPrepareActivity.requestResult);
                    return;
                }
                SecurityPrepareActivity securityPrepareActivity2 = SecurityPrepareActivity.this;
                securityPrepareActivity2.getSetupData(securityPrepareActivity2.requestResult.nextAction);
            }
        }
    }

    public void onResume() {
        super.onResume();
        NoDoubleClickUtils.initLastClickTime();
    }

    public void onDestroy() {
        unregisterReceiver(this.receiver);
        super.onDestroy();
    }

    private void initViewFromData() {
        if (!TextUtils.isEmpty(this.pageTitle)) {
            this.tv_title.setVisibility(0);
            this.tv_title.setText(this.pageTitle);
        }
        if (!TextUtils.isEmpty(this.setUpText)) {
            this.tv_center.setVisibility(0);
            this.tv_center.setText(this.setUpText);
        }
        if (!TextUtils.isEmpty(this.protocolTip)) {
            this.tv_link_before.setVisibility(0);
            this.tv_link_before.setText(this.protocolTip);
        }
        if (!TextUtils.isEmpty(this.protocolText)) {
            this.tv_link.setVisibility(0);
            this.tv_link.setText(this.protocolText);
        }
        if (!TextUtils.isEmpty(this.button1Text)) {
            this.tv_bnt1.setVisibility(0);
            this.tv_bnt1.setText(this.button1Text);
        }
        if (!TextUtils.isEmpty(this.button2Text)) {
            this.tv_bnt2.setVisibility(0);
            this.tv_bnt2.setText(this.button2Text);
        }
        this.tv_bnt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!NoDoubleClickUtils.isDoubleClick()) {
                    boolean unused = SecurityPrepareActivity.this.isClickSetUp = true;
                    SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                    securityPrepareActivity.getSetupData(securityPrepareActivity.button1Action);
                }
            }
        });
        this.tv_bnt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!NoDoubleClickUtils.isDoubleClick()) {
                    boolean unused = SecurityPrepareActivity.this.isClickSetUp = false;
                    SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                    securityPrepareActivity.getSetupData(securityPrepareActivity.button2Action);
                }
            }
        });
        findViewById(R.id.tv_link).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OnClickUrl onClickUrl = VIEngine.getOnClickUrl();
                if (onClickUrl != null) {
                    SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                    onClickUrl.onClickHttpUrl(securityPrepareActivity, securityPrepareActivity.protocolUrl);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void getSetupData(final String str) {
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public MICRpcResponse execute() throws Exception {
                SecurityPrepareActivity.this.showSubmittingDialog();
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = str;
                mICRpcRequest.module = SecurityPrepareActivity.this.nextStep;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(SecurityPrepareActivity.this)).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sceneId", SecurityPrepareActivity.this.sceneId);
                jSONObject.put("userId", SecurityPrepareActivity.this.userId);
                jSONObject.put(RequestConstants.SecVIKeyTntInstId, SecurityPrepareActivity.this.tntInstId);
                jSONObject.put("productType", SecurityPrepareActivity.this.productType);
                mICRpcRequest.data = jSONObject.toString();
                mICRpcRequest.prodmngId = SecurityPrepareActivity.this.prodmngId;
                ICRpcService retrieveRpcService = RpcSettings.retrieveRpcService();
                HashMap hashMap = new HashMap();
                hashMap.put("module", mICRpcRequest.module);
                hashMap.put("data", mICRpcRequest.data);
                if (mICRpcRequest.action.equals(RequestConstants.CLOSE_SUBMIT)) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b3.c2", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_CloseRequest", "", "", false);
                } else if (mICRpcRequest.action.equals(RequestConstants.CLOSE_PREPARE)) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b3.c1", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_ClosePreRequest", "", "", false);
                } else if (mICRpcRequest.action.equals(RequestConstants.REGISTER_BIO_PREPARE)) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b2.c1", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_OpenPreRequest", "", "", false);
                } else if (mICRpcRequest.action.equals(RequestConstants.UPDATE_PREPARE)) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b4.c1", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_ResetPreRequest", "", "", false);
                }
                try {
                    return retrieveRpcService.dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public void onSuccess(MICRpcResponse mICRpcResponse) {
                SecurityPrepareActivity.this.hideSubmittingDialog();
                if (mICRpcResponse == null) {
                    SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                    CustomUi.showCenterToast(securityPrepareActivity, securityPrepareActivity.getResources().getString(R.string.system_busy_error));
                    return;
                }
                MICRpcResponse unused = SecurityPrepareActivity.this.requestResult = mICRpcResponse;
                if (mICRpcResponse.success) {
                    if (str.equals(RequestConstants.CLOSE_SUBMIT)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("finishedCode", mICRpcResponse.finishCode);
                        hashMap.put("finishedMsg", mICRpcResponse.finishMessage);
                        hashMap.put("verifyMsg", mICRpcResponse.verifyMessage);
                        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b3.c3", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_CloseResult", "", "", false);
                    }
                    if (mICRpcResponse.finish) {
                        SecurityPrepareActivity securityPrepareActivity2 = SecurityPrepareActivity.this;
                        CustomUi.showTipToast(securityPrepareActivity2, 0, securityPrepareActivity2.getResources().getString(R.string.set_success));
                        SecurityPrepareActivity.this.finish();
                        return;
                    }
                    SecurityPrepareActivity.this.parseJsonResult(mICRpcResponse);
                } else if (mICRpcResponse.sysErrCode.equalsIgnoreCase("user_status_error") || mICRpcResponse.sysErrCode.equalsIgnoreCase("bussiness_fail") || mICRpcResponse.sysErrCode.equalsIgnoreCase("unkown_action_fail") || mICRpcResponse.sysErrCode.equalsIgnoreCase("VERIFY_INIT_NO_VALID_PRODUCT")) {
                    final CommonDialog commonDialog = new CommonDialog(SecurityPrepareActivity.this, true, (DialogInterface.OnCancelListener) null);
                    commonDialog.setMessage(mICRpcResponse.sysErrMsg);
                    commonDialog.setModalInterface(new ModalInterface() {
                        public void onCancel() {
                        }

                        public void onOk() {
                            CommonDialog commonDialog = commonDialog;
                            if (commonDialog != null) {
                                commonDialog.dismiss();
                            }
                            SecurityPrepareActivity.this.finish();
                        }
                    });
                    SecurityPrepareActivity securityPrepareActivity3 = SecurityPrepareActivity.this;
                    if (securityPrepareActivity3 != null && !securityPrepareActivity3.isFinishing()) {
                        commonDialog.show();
                    }
                } else if (mICRpcResponse.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE1) || mICRpcResponse.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE2)) {
                    SecurityPrepareActivity securityPrepareActivity4 = SecurityPrepareActivity.this;
                    if (securityPrepareActivity4 != null && !securityPrepareActivity4.isFinishing()) {
                        CustomUi.showCenterToast(SecurityPrepareActivity.this, mICRpcResponse.sysErrMsg);
                    }
                    SecurityPrepareActivity.this.finish();
                } else {
                    SecurityPrepareActivity securityPrepareActivity5 = SecurityPrepareActivity.this;
                    if (securityPrepareActivity5 != null && !securityPrepareActivity5.isFinishing()) {
                        SecurityPrepareActivity securityPrepareActivity6 = SecurityPrepareActivity.this;
                        CustomUi.showCenterToast(securityPrepareActivity6, securityPrepareActivity6.getResources().getString(R.string.Sysytem_error));
                    }
                    if (mICRpcResponse.finish) {
                        SecurityPrepareActivity.this.finish();
                    }
                }
            }

            public void onFailure(IAPError iAPError) {
                SecurityPrepareActivity.this.hideSubmittingDialog();
                SecurityPrepareActivity securityPrepareActivity = SecurityPrepareActivity.this;
                CustomUi.showCenterToast(securityPrepareActivity, securityPrepareActivity.getResources().getString(R.string.Sysytem_error));
            }
        });
    }

    /* access modifiers changed from: private */
    public void parseJsonResult(final MICRpcResponse mICRpcResponse) {
        try {
            String string = new JSONObject(mICRpcResponse.data).getString("verifyId");
            this.verifyId = string;
            if (!TextUtils.isEmpty(string)) {
                HashMap hashMap = new HashMap();
                hashMap.put("verifyType", "1");
                hashMap.put("verifyId", this.verifyId);
                VIEngine.startVerify(this, RequestConstants.VerifyProductVerify, hashMap, (Map<String, String>) null, new VIEngine.VIListener() {
                    public void onVerifyAction(VIAction vIAction) {
                    }

                    public void onVerifyResult(VIResult vIResult) {
                        if (vIResult != null && vIResult.getResult() == 1000) {
                            if (SecurityPrepareActivity.this.isClickSetUp) {
                                SecurityPrepareActivity.this.gotoSetquestionPage(mICRpcResponse);
                            } else {
                                SecurityPrepareActivity.this.getSetupData(mICRpcResponse.nextAction);
                            }
                        }
                    }
                }, (VIEngine.OnQueryResult) null);
            } else if (this.isClickSetUp) {
                gotoSetquestionPage(mICRpcResponse);
            } else {
                getSetupData(mICRpcResponse.nextAction);
            }
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: private */
    public void gotoSetquestionPage(MICRpcResponse mICRpcResponse) {
        Message convertToMessage = mICRpcResponse.convertToMessage();
        convertToMessage.setSceneId(this.sceneId);
        convertToMessage.setUserId(this.userId);
        convertToMessage.setTntInstId(this.tntInstId);
        convertToMessage.setProdmngId(mICRpcResponse.prodmngId);
        convertToMessage.setProductType(this.productType);
        Intent intent = new Intent(this, SetSecurityActivity.class);
        intent.putExtra("message", convertToMessage);
        startActivity(intent);
    }

    public void modifyViewFromOutside() {
        ActivityInterface commonActivityInterface = ActivityInterfaceManager.getCommonActivityInterface();
        if (!TextUtils.isEmpty(commonActivityInterface.navBigColor())) {
            int parseColor = ColorUtils.parseColor(commonActivityInterface.navBigColor());
            if (!ColorUtils.isColorInvalid(parseColor)) {
                this.rl_title.setBackgroundColor(parseColor);
            }
        }
    }
}
