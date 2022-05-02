package com.alipay.mobile.verifyidentity.business.security_verification.activity;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.alipay.mobile.verifyidentity.business.activity.HandlerCallback;
import com.alipay.mobile.verifyidentity.business.activity.ProductActivity;
import com.alipay.mobile.verifyidentity.business.security_verification.R;
import com.alipay.mobile.verifyidentity.business.security_verification.activity.VerifySecurityFragment;
import com.alipay.mobile.verifyidentity.business.security_verification.product.SecurityVerifyModule;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.QuestionItem;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngineUtils;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobile.verifyidentity.uitools.POPUIType;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VerifySecurityActivity extends ProductActivity {
    private static final int CLOSE_ACTIVITY = 2001;
    private static IProduct.ICallback iCallback;
    public static final int isInside = 157;
    public static final byte[] setMax = {70, -125, 69, 86, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    /* access modifiers changed from: private */
    public static SecurityVerifyModule virifySecurityProduct;
    private ArrayList<ArrayList<List<QuestionItem>>> adapterList = new ArrayList<>();
    /* access modifiers changed from: private */
    public String[] answerId = new String[0];
    private String button1Action;
    private String button1Text;
    private FrameLayout container;
    private String foot_tip;
    private String from_title;
    private boolean has_other;
    private List<Fragment> mFragments = new ArrayList();
    private Intent mIntent;
    /* access modifiers changed from: private */
    public Message message;
    private String nextAction;
    /* access modifiers changed from: private */
    public String nextStep;
    private int pageSize;
    private String pageTitle;
    private String prodmngId;
    private String productType;
    /* access modifiers changed from: private */
    public QuestionItem[] questionItemArr = new QuestionItem[0];
    private View rl_title;
    private String sceneId;
    private int selectindex;
    private String tntInstId;
    private TextView tvVerification;
    private String userId;
    /* access modifiers changed from: private */
    public String verifyId;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(byte r5, short r6, int r7) {
        /*
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r5 = r5 * 45
            int r5 = r5 + 56
            int r6 = r6 * 165
            int r6 = 176 - r6
            byte[] r0 = setMax
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x0019
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            goto L_0x0035
        L_0x0019:
            r4 = r7
            r7 = r5
            r5 = r4
            int r2 = r2 + 1
            int r5 = r5 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L_0x002c
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x002c:
            byte r3 = r0[r5]
            r4 = r7
            r7 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0035:
            int r5 = -r5
            int r0 = r0 + r5
            int r5 = r0 + -2
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.security_verification.activity.VerifySecurityActivity.setMin(byte, short, int):java.lang.String");
    }

    public static IProduct.ICallback getCallback() {
        return iCallback;
    }

    public static void setCallback(IProduct.ICallback iCallback2) {
        iCallback = iCallback2;
    }

    public static void setPinProduct(SecurityVerifyModule securityVerifyModule) {
        virifySecurityProduct = securityVerifyModule;
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        String min2 = setMin((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String min3 = setMin((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(117944609, oncanceled);
            onCancelLoad.getMin(117944609, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 117944609 == (max = dispatchOnCancelled.getMax(applicationContext2, 117944609)))) {
            onCanceled oncanceled2 = new onCanceled(117944609, max, 512);
            onCancelLoad.setMax(117944609, oncanceled2);
            onCancelLoad.getMin(117944609, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(117944609, oncanceled3);
            onCancelLoad.getMin(117944609, oncanceled3);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(117944609, oncanceled4);
            onCancelLoad.getMin(117944609, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_verifu_security);
        this.mIntent = getIntent();
        initView();
        initData();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1234875380, oncanceled);
            onCancelLoad.getMin(1234875380, oncanceled);
        }
        super.onNewIntent(intent);
        this.questionItemArr = new QuestionItem[0];
        this.answerId = new String[0];
        if (intent != null) {
            this.mIntent = intent;
        }
        initData();
    }

    private void initView() {
        this.container = (FrameLayout) findViewById(R.id.container);
        this.tvVerification = (TextView) findViewById(R.id.tv_title);
        this.rl_title = findViewById(R.id.rl_title);
        if (CustomUi.getTitleTypeface() != null) {
            this.tvVerification.setTypeface(CustomUi.getTitleTypeface());
        }
        findViewById(R.id.ll_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VerifySecurityActivity.this.doCancel();
                VerifySecurityActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showAlertDialog(String str, final MICRpcResponse mICRpcResponse) {
        if (!isFinishing()) {
            CustomUi.showCommonDialog(this, "", str, 1001, false, new ModalInterface() {
                public void onCancel() {
                }

                public void onOk() {
                    VIRespone vIRespone = new VIRespone(1001);
                    MICRpcResponse mICRpcResponse = mICRpcResponse;
                    if (mICRpcResponse != null) {
                        vIRespone.setResponseMessage(mICRpcResponse.convertToMessage());
                    }
                    vIRespone.setMessage(VerifySecurityActivity.this.message);
                    vIRespone.setVerifyId(VerifySecurityActivity.this.verifyId);
                    if (VerifySecurityActivity.getCallback() != null) {
                        VerifySecurityActivity.getCallback().onResult(VerifySecurityActivity.virifySecurityProduct, vIRespone);
                    }
                    if (TextUtils.isEmpty(mICRpcResponse.nextStep) || VerifySecurityActivity.this.nextStep.equalsIgnoreCase(mICRpcResponse.nextStep)) {
                        VerifySecurityActivity.this.finish();
                        VerifySecurityActivity.this.resetCallback();
                    }
                }
            });
        }
    }

    public void initData() {
        Intent intent = this.mIntent;
        if (intent != null) {
            Message message2 = (Message) intent.getSerializableExtra("message");
            this.message = message2;
            if (message2 != null) {
                this.nextStep = message2.getNextStep();
                this.prodmngId = this.message.getProdmngId();
                this.nextAction = this.message.getNextAction();
                this.sceneId = this.message.getSceneId();
                this.userId = this.message.getUserId();
                this.tntInstId = this.message.getTntInstId();
                this.productType = this.message.getProductType();
                this.verifyId = this.message.getVerifyId();
                try {
                    JSONObject jSONObject = new JSONObject(this.message.getData());
                    this.pageTitle = jSONObject.optString("head_title");
                    this.button1Text = jSONObject.optString(SecurityConstants.KEY_FROM_BUTTON);
                    this.from_title = jSONObject.optString("form_title");
                    this.foot_tip = jSONObject.optString("foot_tip");
                    this.has_other = jSONObject.optBoolean("HAS_OTHERS");
                    String optString = optString(jSONObject, SecurityConstants.KEY_DEFAULT_SELETED_INDEX);
                    if (TextUtils.isEmpty(optString)) {
                        optString = "0";
                    }
                    this.selectindex = Integer.parseInt(optString);
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(SecurityConstants.KEY_QUESTION_JSON));
                    JSONArray jSONArray = jSONObject2.getJSONArray(SecurityConstants.KEY_PAGES);
                    this.pageSize = jSONObject2.getInt(SecurityConstants.KEY_PAGE_SIZE);
                    parseQuestionJson(jSONArray);
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(this.pageTitle)) {
                this.tvVerification.setText(this.pageTitle);
            }
            createViewByData();
            setFragment(0);
            registerHandlerCallback(new HandlerCallback() {
                public void handleMessage(android.os.Message message) {
                    if (message.what == 2001 && !VerifySecurityActivity.this.isFinishing()) {
                        VerifySecurityActivity.this.finish();
                        VerifySecurityActivity.this.resetCallback();
                    }
                }
            });
        }
    }

    private void createViewByData() {
        this.mFragments.clear();
        int i = 0;
        while (i < this.adapterList.size()) {
            VerifySecurityFragment verifySecurityFragment = new VerifySecurityFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(SecurityConstants.KEY_SET_SECURITY_BUNDLE, this.adapterList.get(i));
            bundle.putInt(SecurityConstants.KEY_PAGE_SIZE, this.pageSize);
            i++;
            bundle.putInt("pageNum", i);
            bundle.putInt(SecurityConstants.KEY_DEFAULT_SELETED_INDEX, this.selectindex);
            bundle.putString("verifyId", this.verifyId);
            bundle.putBoolean("HAS_OTHERS", this.has_other);
            if (!TextUtils.isEmpty(this.from_title)) {
                bundle.putString("form_title", this.from_title);
            }
            if (!TextUtils.isEmpty(this.foot_tip)) {
                bundle.putString("foot_tip", this.foot_tip);
            }
            verifySecurityFragment.setArguments(bundle);
            verifySecurityFragment.setCommitCallBack(new VerifySecurityFragment.CommitCallBack() {
                public void commit(String[] strArr, QuestionItem[] questionItemArr, int i, int i2) {
                    if (i2 == i) {
                        if (i2 == 1) {
                            String[] unused = VerifySecurityActivity.this.answerId = strArr;
                            QuestionItem[] unused2 = VerifySecurityActivity.this.questionItemArr = questionItemArr;
                        } else {
                            VerifySecurityActivity verifySecurityActivity = VerifySecurityActivity.this;
                            String[] unused3 = verifySecurityActivity.answerId = (String[]) VerifySecurityActivity.concat(verifySecurityActivity.answerId, strArr);
                            VerifySecurityActivity verifySecurityActivity2 = VerifySecurityActivity.this;
                            QuestionItem[] unused4 = verifySecurityActivity2.questionItemArr = (QuestionItem[]) VerifySecurityActivity.concat(verifySecurityActivity2.questionItemArr, questionItemArr);
                        }
                        VerifySecurityActivity.this.confirm();
                    } else if (i2 < i) {
                        VerifySecurityActivity verifySecurityActivity3 = VerifySecurityActivity.this;
                        String[] unused5 = verifySecurityActivity3.answerId = (String[]) VerifySecurityActivity.concat(verifySecurityActivity3.answerId, strArr);
                        VerifySecurityActivity verifySecurityActivity4 = VerifySecurityActivity.this;
                        QuestionItem[] unused6 = verifySecurityActivity4.questionItemArr = (QuestionItem[]) VerifySecurityActivity.concat(verifySecurityActivity4.questionItemArr, questionItemArr);
                        VerifySecurityActivity.this.setFragment(i2);
                    }
                }

                public void onVerifyResult(VIResult vIResult) {
                    VIRespone vIRespone = new VIRespone(vIResult.getResult());
                    vIRespone.setVerifyId(VerifySecurityActivity.this.verifyId);
                    VerifySecurityActivity.this.message.setVerifyMessage(vIResult.getMessage());
                    if (VerifySecurityActivity.getCallback() != null) {
                        VerifySecurityActivity.getCallback().onResult(VerifySecurityActivity.virifySecurityProduct, vIRespone);
                    }
                    VerifySecurityActivity.this.finish();
                    VerifySecurityActivity.this.resetCallback();
                }
            });
            this.mFragments.add(verifySecurityFragment);
        }
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    /* access modifiers changed from: private */
    public void setFragment(int i) {
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(75492861, oncanceled);
            onCancelLoad.getMin(75492861, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(75492861, oncanceled2);
            onCancelLoad.getMin(75492861, oncanceled2);
        }
        if (this.mFragments.size() > 0) {
            getFragmentManager().beginTransaction().replace(R.id.container, this.mFragments.get(i)).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: private */
    public void confirm() {
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public MICRpcResponse execute() throws Exception {
                VerifySecurityActivity.this.showSubmittingDialog();
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.verifyId = VerifySecurityActivity.this.verifyId;
                mICRpcRequest.module = VerifySecurityActivity.this.nextStep;
                mICRpcRequest.action = RequestConstants.VERIFY;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(VerifySecurityActivity.this)).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RequestConstants.KEY_QUESTION_ANSWER_VIEWS, VerifySecurityActivity.this.buildConfirmData());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", jSONObject);
                mICRpcRequest.data = jSONObject2.toString();
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public void onSuccess(MICRpcResponse mICRpcResponse) {
                VerifySecurityActivity.this.hideSubmittingDialog();
                if (mICRpcResponse == null) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b2.c3", "1", ""}, (Map<String, String>) null, "", "SecVI_Seed_SecQuestion_OpenResult", "", "", false);
                    VerifySecurityActivity verifySecurityActivity = VerifySecurityActivity.this;
                    CustomUi.showCenterToast(verifySecurityActivity, verifySecurityActivity.getResources().getString(R.string.system_busy_error), 0, POPUIType.TOAST_NET_ERROR);
                } else if (mICRpcResponse.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE1) || mICRpcResponse.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE2)) {
                    VerifySecurityActivity.this.getWeakHandler().sendEmptyMessageDelayed(2001, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    VerifySecurityActivity.this.showAlertDialog(mICRpcResponse.sysErrMsg, mICRpcResponse);
                } else if ("VALIDATE_LOCKED_SQA_SPECIAL".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                    VIRespone vIRespone = new VIRespone(3000);
                    VerifySecurityActivity.this.message.setVerifyMessage(mICRpcResponse.verifyMessage);
                    vIRespone.setMessage(VerifySecurityActivity.this.message);
                    if (VerifySecurityActivity.getCallback() != null) {
                        VerifySecurityActivity.getCallback().onResult(VerifySecurityActivity.virifySecurityProduct, vIRespone);
                    }
                    VerifySecurityActivity.this.finish();
                    VerifySecurityActivity.this.resetCallback();
                } else if (mICRpcResponse.finish) {
                    if (!mICRpcResponse.verifySuccess) {
                        VerifySecurityActivity.this.showAlertDialog(mICRpcResponse.verifyMessage, mICRpcResponse);
                        return;
                    }
                    VIRespone vIRespone2 = new VIRespone(1000);
                    vIRespone2.setResponseMessage(mICRpcResponse.convertToMessage());
                    vIRespone2.setVerifyId(mICRpcResponse.verifyId);
                    vIRespone2.setMessage(VerifySecurityActivity.this.message);
                    if (VerifySecurityActivity.getCallback() != null) {
                        VerifySecurityActivity.getCallback().onResult(VerifySecurityActivity.virifySecurityProduct, vIRespone2);
                    }
                    VerifySecurityActivity.this.finish();
                    VerifySecurityActivity.this.resetCallback();
                } else if (!mICRpcResponse.verifySuccess && VerifySecurityActivity.this.nextStep.equalsIgnoreCase(mICRpcResponse.nextStep)) {
                    CustomUi.showCommonDialog(VerifySecurityActivity.this, "", mICRpcResponse.verifyMessage, 1001, false, new ModalInterface() {
                        public void onCancel() {
                        }

                        public void onOk() {
                        }
                    });
                } else if (!TextUtils.isEmpty(mICRpcResponse.verifyMessage)) {
                    VerifySecurityActivity.this.showAlertDialog(mICRpcResponse.verifyMessage, mICRpcResponse);
                } else {
                    VerifySecurityActivity verifySecurityActivity2 = VerifySecurityActivity.this;
                    verifySecurityActivity2.showAlertDialog(verifySecurityActivity2.getResources().getString(R.string.Sysytem_error), mICRpcResponse);
                }
            }

            public void onFailure(IAPError iAPError) {
                VerifySecurityActivity.this.hideSubmittingDialog();
                VerifySecurityActivity verifySecurityActivity = VerifySecurityActivity.this;
                CustomUi.showCenterToast(verifySecurityActivity, verifySecurityActivity.getResources().getString(R.string.system_busy_error), 0, POPUIType.TOAST_NET_ERROR);
            }
        });
    }

    /* access modifiers changed from: private */
    public JSONArray buildConfirmData() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-670222442, oncanceled);
            onCancelLoad.getMin(-670222442, oncanceled);
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.questionItemArr.length; i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("questionId", this.questionItemArr[i].getQuestionId());
                if (this.answerId[i].startsWith("[")) {
                    if (this.answerId[i].endsWith("]")) {
                        jSONObject.put(RequestConstants.KEY_MULTIPLE_ANSWER, new JSONArray(this.answerId[i]));
                        jSONArray.put(jSONObject);
                    }
                }
                jSONObject.put(RequestConstants.KEY_MULTIPLE_ANSWER, new JSONArray().put(this.answerId[i]));
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private void parseQuestionJson(JSONArray jSONArray) throws JSONException {
        int i;
        JSONArray jSONArray2;
        String str;
        this.adapterList.clear();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
            jSONObject.getString("pageNum");
            JSONArray jSONArray3 = jSONObject.getJSONArray(SecurityConstants.KEY_QUERYVIEWS);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < jSONArray3.length()) {
                Object obj = jSONArray3.get(i3);
                ArrayList arrayList2 = new ArrayList();
                boolean z = obj instanceof JSONArray;
                String str2 = SecurityConstants.KEY_DISPLAY_TYPE;
                String str3 = SecurityConstants.KEY_QUESTION_TYPE;
                String str4 = "questionId";
                String str5 = SecurityConstants.KEY_MEMORYID;
                String str6 = "text";
                String str7 = SecurityConstants.KEY_ANSWER_DISPLAY_TYPE;
                int i4 = i2;
                ArrayList arrayList3 = arrayList;
                if (z) {
                    JSONArray jSONArray4 = (JSONArray) jSONArray3.get(i3);
                    jSONArray2 = jSONArray3;
                    int i5 = 0;
                    while (i5 < jSONArray4.length()) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray4.get(i5);
                        JSONArray jSONArray5 = jSONArray4;
                        QuestionItem questionItem = new QuestionItem();
                        int i6 = i3;
                        String optString = optString(jSONObject2, str7);
                        String str8 = str7;
                        String optString2 = optString(jSONObject2, str6);
                        String str9 = str6;
                        String optString3 = optString(jSONObject2, str5);
                        String str10 = str5;
                        String optString4 = optString(jSONObject2, str4);
                        String str11 = str4;
                        String optString5 = optString(jSONObject2, str3);
                        String str12 = str3;
                        String optString6 = optString(jSONObject2, str2);
                        String str13 = str2;
                        String optString7 = optString(jSONObject2, SecurityConstants.KEY_PLACE_HOLDER);
                        questionItem.setQuestionType(optString5);
                        questionItem.setAnswerDisplayType(optString);
                        questionItem.setMemoryId(optString3);
                        questionItem.setQuestionId(optString4);
                        questionItem.setContent(optString2);
                        questionItem.setDisplayType(optString6);
                        questionItem.setPlaceHolder(optString7);
                        if (jSONObject2.has(SecurityConstants.KEY_OPTIONS)) {
                            JSONArray jSONArray6 = jSONObject2.getJSONArray(SecurityConstants.KEY_OPTIONS);
                            ArrayList arrayList4 = new ArrayList();
                            for (int i7 = 0; i7 < jSONArray6.length(); i7++) {
                                JSONObject jSONObject3 = (JSONObject) jSONArray6.get(i7);
                                arrayList4.add(new QuestionItem.QuestionsOptions(jSONObject3.getString(SecurityConstants.KEY_TEXT), jSONObject3.getString(SecurityConstants.KEY_VALUE)));
                            }
                            questionItem.setQuestionsOptionsList(arrayList4);
                        }
                        arrayList2.add(questionItem);
                        i5++;
                        jSONArray4 = jSONArray5;
                        i3 = i6;
                        str7 = str8;
                        str6 = str9;
                        str5 = str10;
                        str4 = str11;
                        str3 = str12;
                        str2 = str13;
                    }
                    i = i3;
                } else {
                    String str14 = str7;
                    jSONArray2 = jSONArray3;
                    i = i3;
                    String str15 = str2;
                    String str16 = str3;
                    String str17 = str4;
                    String str18 = str5;
                    String str19 = str6;
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject4 = (JSONObject) obj;
                        QuestionItem questionItem2 = new QuestionItem();
                        String optString8 = optString(jSONObject4, str14);
                        String optString9 = optString(jSONObject4, str19);
                        String optString10 = optString(jSONObject4, str18);
                        String optString11 = optString(jSONObject4, str17);
                        String optString12 = optString(jSONObject4, str16);
                        String optString13 = optString(jSONObject4, str15);
                        String optString14 = optString(jSONObject4, SecurityConstants.KEY_PLACE_HOLDER);
                        questionItem2.setQuestionType(optString12);
                        questionItem2.setAnswerDisplayType(optString8);
                        questionItem2.setMemoryId(optString10);
                        questionItem2.setQuestionId(optString11);
                        questionItem2.setContent(optString9);
                        questionItem2.setDisplayType(optString13);
                        questionItem2.setPlaceHolder(optString14);
                        if (jSONObject4.has(SecurityConstants.KEY_OPTIONS)) {
                            JSONArray jSONArray7 = jSONObject4.getJSONArray(SecurityConstants.KEY_OPTIONS);
                            ArrayList arrayList5 = new ArrayList();
                            for (int i8 = 0; i8 < jSONArray7.length(); i8++) {
                                JSONObject jSONObject5 = (JSONObject) jSONArray7.get(i8);
                                String str20 = "";
                                if (jSONObject5.has(SecurityConstants.KEY_TEXT)) {
                                    str = jSONObject5.getString(SecurityConstants.KEY_TEXT);
                                } else {
                                    str = jSONObject5.has(SecurityConstants.KEY_TEXT_KBA) ? jSONObject5.getString(SecurityConstants.KEY_TEXT_KBA) : str20;
                                }
                                if (jSONObject5.has(SecurityConstants.KEY_VALUE)) {
                                    str20 = jSONObject5.getString(SecurityConstants.KEY_VALUE);
                                } else if (jSONObject5.has("value")) {
                                    str20 = jSONObject5.getString("value");
                                }
                                arrayList5.add(new QuestionItem.QuestionsOptions(str, str20));
                            }
                            questionItem2.setQuestionsOptionsList(arrayList5);
                        }
                        arrayList2.add(questionItem2);
                    }
                }
                ArrayList arrayList6 = arrayList3;
                arrayList6.add(arrayList2);
                i3 = i + 1;
                JSONArray jSONArray8 = jSONArray;
                arrayList = arrayList6;
                i2 = i4;
                jSONArray3 = jSONArray2;
            }
            this.adapterList.add(arrayList);
            i2++;
        }
    }

    private String optString(JSONObject jSONObject, String str) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getString(str) : "";
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-287073019, oncanceled);
            onCancelLoad.getMin(-287073019, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-287073019, oncanceled2);
            onCancelLoad.getMin(-287073019, oncanceled2);
        }
        if (4 == keyEvent.getKeyCode()) {
            doCancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: private */
    public void doCancel() {
        Message message2 = this.message;
        String verifyId2 = message2 != null ? message2.getVerifyId() : "";
        VIRespone vIRespone = new VIRespone(1003);
        vIRespone.setVerifyId(verifyId2);
        vIRespone.setMessage(this.message);
        if (getCallback() != null) {
            getCallback().onResult(virifySecurityProduct, vIRespone);
        }
        resetCallback();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    public void resetCallback() {
        iCallback = null;
        virifySecurityProduct = null;
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
        if (commonActivityInterface.navTitleFont() > 0) {
            this.tvVerification.setTextSize(1, (float) commonActivityInterface.navTitleFont());
        }
    }
}
