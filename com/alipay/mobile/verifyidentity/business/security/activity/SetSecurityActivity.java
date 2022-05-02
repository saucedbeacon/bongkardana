package com.alipay.mobile.verifyidentity.business.security.activity;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterface;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterfaceManager;
import com.alipay.mobile.verifyidentity.business.activity.BaseActivity;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.activity.HandlerCallback;
import com.alipay.mobile.verifyidentity.business.security.R;
import com.alipay.mobile.verifyidentity.business.security.activity.SetSecurityFragment;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.QuestionItem;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngineUtils;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

public class SetSecurityActivity extends BaseActivity {
    private static final int CLOSE_ACTIVITY = 2001;
    public static final byte[] setMax = {38, ImageFileType.HEAD_WEBP_0, -1, -124, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 47;
    private ArrayList<ArrayList<List<QuestionItem>>> adapterList = new ArrayList<>();
    /* access modifiers changed from: private */
    public String[] answerId = new String[0];
    private String button1Action;
    private String button1Text;
    private FrameLayout container;
    private String from_title;
    private List<Fragment> mFragments = new ArrayList();
    private Message message;
    /* access modifiers changed from: private */
    public String nextAction;
    /* access modifiers changed from: private */
    public String nextStep;
    private int pageSize;
    private String pageTitle;
    /* access modifiers changed from: private */
    public String prodmngId;
    /* access modifiers changed from: private */
    public String productType;
    /* access modifiers changed from: private */
    public QuestionItem[] questionItemArr = new QuestionItem[0];
    private View rl_title;
    /* access modifiers changed from: private */
    public String sceneId;
    /* access modifiers changed from: private */
    public String tntInstId;
    private TextView tv_title;
    /* access modifiers changed from: private */
    public String userId;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v4, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = setMax
            int r7 = r7 + 4
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r8 = r8 * 45
            int r8 = 101 - r8
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r8 = r7
            r3 = r8
            r4 = 0
            r7 = r6
            goto L_0x002e
        L_0x0018:
            r3 = 0
        L_0x0019:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0028:
            byte r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x002e:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + -2
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.security.activity.SetSecurityActivity.setMax(byte, short, byte):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        String max = setMax((byte) bArr[8], (short) bArr[2], (byte) bArr[8]);
        byte[] bArr2 = setMax;
        String max2 = setMax((byte) bArr2[96], 174, (byte) bArr2[96]);
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
            onCancelLoad.setMax(-1141467056, oncanceled);
            onCancelLoad.getMin(-1141467056, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1141467056, oncanceled2);
            onCancelLoad.getMin(-1141467056, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1141467056, oncanceled3);
            onCancelLoad.getMin(-1141467056, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_security);
        initView();
        initData();
    }

    private void initView() {
        this.container = (FrameLayout) findViewById(R.id.container);
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.rl_title = findViewById(R.id.rl_title);
        findViewById(R.id.ll_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SetSecurityActivity.this.finish();
            }
        });
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
                JSONObject jSONObject = new JSONObject(this.message.getData());
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(MessageConstants.KEY_PAGE_MODEL));
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString(MessageConstants.KEY_ALL_QUESTIONS));
                JSONArray jSONArray = jSONObject3.getJSONArray(SecurityConstants.KEY_PAGES);
                this.pageSize = jSONObject3.getInt(SecurityConstants.KEY_PAGE_SIZE);
                this.pageTitle = jSONObject2.optString("pageTitle");
                this.button1Text = jSONObject2.optString(MessageConstants.KEY_BUTTON1TEXT);
                this.button1Action = jSONObject2.optString(MessageConstants.KEY_BUTTON1ACTION);
                this.from_title = jSONObject2.optString(SecurityConstants.KEY_FROM_TITLE_SQ);
                parceQuestionJson(jSONArray);
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(this.pageTitle)) {
            this.tv_title.setText(this.pageTitle);
        }
        createViewByData();
        setFragment(0);
        registerHandlerCallback(new HandlerCallback() {
            public void handleMessage(android.os.Message message) {
                if (message.what == 2001 && !SetSecurityActivity.this.isFinishing()) {
                    SetSecurityActivity.this.finish();
                }
            }
        });
    }

    private void createViewByData() {
        int i = 0;
        while (i < this.adapterList.size()) {
            SetSecurityFragment setSecurityFragment = new SetSecurityFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(SecurityConstants.KEY_SET_SECURITY_BUNDLE, this.adapterList.get(i));
            bundle.putInt(SecurityConstants.KEY_PAGE_SIZE, this.pageSize);
            i++;
            bundle.putInt("pageNum", i);
            if (!TextUtils.isEmpty(this.from_title)) {
                bundle.putString("form_title", this.from_title);
            }
            setSecurityFragment.setArguments(bundle);
            setSecurityFragment.setCommitCallBack(new SetSecurityFragment.CommitCallBack() {
                public void commit(String[] strArr, QuestionItem[] questionItemArr, int i, int i2) {
                    if (i2 == i) {
                        if (i2 == 1) {
                            String[] unused = SetSecurityActivity.this.answerId = strArr;
                            QuestionItem[] unused2 = SetSecurityActivity.this.questionItemArr = questionItemArr;
                        } else {
                            SetSecurityActivity setSecurityActivity = SetSecurityActivity.this;
                            String[] unused3 = setSecurityActivity.answerId = (String[]) SetSecurityActivity.concat(setSecurityActivity.answerId, strArr);
                            SetSecurityActivity setSecurityActivity2 = SetSecurityActivity.this;
                            QuestionItem[] unused4 = setSecurityActivity2.questionItemArr = (QuestionItem[]) SetSecurityActivity.concat(setSecurityActivity2.questionItemArr, questionItemArr);
                        }
                        SetSecurityActivity.this.confirm();
                    } else if (i2 < i) {
                        SetSecurityActivity setSecurityActivity3 = SetSecurityActivity.this;
                        String[] unused5 = setSecurityActivity3.answerId = (String[]) SetSecurityActivity.concat(setSecurityActivity3.answerId, strArr);
                        SetSecurityActivity setSecurityActivity4 = SetSecurityActivity.this;
                        QuestionItem[] unused6 = setSecurityActivity4.questionItemArr = (QuestionItem[]) SetSecurityActivity.concat(setSecurityActivity4.questionItemArr, questionItemArr);
                        SetSecurityActivity.this.setFragment(i2);
                    }
                }
            });
            this.mFragments.add(setSecurityFragment);
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
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(763499998, oncanceled);
            onCancelLoad.getMin(763499998, oncanceled);
        }
        if (this.mFragments.size() > 0) {
            getFragmentManager().beginTransaction().replace(R.id.container, this.mFragments.get(i)).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: private */
    public void confirm() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2012174239, oncanceled);
            onCancelLoad.getMin(-2012174239, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2012174239, oncanceled2);
            onCancelLoad.getMin(-2012174239, oncanceled2);
        }
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public MICRpcResponse execute() throws Exception {
                SetSecurityActivity.this.showSubmittingDialog();
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = SetSecurityActivity.this.nextAction;
                mICRpcRequest.module = SetSecurityActivity.this.nextStep;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(SetSecurityActivity.this)).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sceneId", SetSecurityActivity.this.sceneId);
                jSONObject.put("userId", SetSecurityActivity.this.userId);
                jSONObject.put(RequestConstants.SecVIKeyTntInstId, SetSecurityActivity.this.tntInstId);
                jSONObject.put("productType", SetSecurityActivity.this.productType);
                jSONObject.put(RequestConstants.KEY_USER_ANSWER, SetSecurityActivity.this.buildConfirmData().toString());
                mICRpcRequest.data = jSONObject.toString();
                mICRpcRequest.prodmngId = SetSecurityActivity.this.prodmngId;
                if (mICRpcRequest.action.equals(RequestConstants.REGISTER_BIO_SUBMIT)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("module", mICRpcRequest.module);
                    hashMap.put("data", mICRpcRequest.data);
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b2.c2", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_OpenRequest", "", "", false);
                } else if (mICRpcRequest.action.equals(RequestConstants.UPDATE_SUBMIT)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("module", mICRpcRequest.module);
                    hashMap2.put("data", mICRpcRequest.data);
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b4.c2", "0", ""}, hashMap2, "", "SecVI_Seed_SecQuestion_OpenRequest", "", "", false);
                }
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public void onSuccess(MICRpcResponse mICRpcResponse) {
                MICRpcResponse mICRpcResponse2 = mICRpcResponse;
                SetSecurityActivity.this.hideSubmittingDialog();
                if (mICRpcResponse2 == null) {
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b2.c3", "1", ""}, (Map<String, String>) null, "", "SecVI_Seed_SecQuestion_OpenResult", "", "", false);
                    SetSecurityActivity setSecurityActivity = SetSecurityActivity.this;
                    CustomUi.showCenterToast(setSecurityActivity, setSecurityActivity.getResources().getString(R.string.system_busy_error));
                    return;
                }
                if (SetSecurityActivity.this.nextAction.equals(RequestConstants.REGISTER_BIO_SUBMIT)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("finishedCode", mICRpcResponse2.finishCode);
                    hashMap.put("finishedMsg", mICRpcResponse2.finishMessage);
                    hashMap.put("verifyMsg", mICRpcResponse2.verifyMessage);
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b2.c3", "0", ""}, hashMap, "", "SecVI_Seed_SecQuestion_OpenResult", "", "", false);
                } else if (SetSecurityActivity.this.nextAction.equals(RequestConstants.UPDATE_SUBMIT)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("finishedCode", mICRpcResponse2.finishCode);
                    hashMap2.put("finishedMsg", mICRpcResponse2.finishMessage);
                    hashMap2.put("verifyMsg", mICRpcResponse2.verifyMessage);
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b4.c3", "0", ""}, hashMap2, "", "SecVI_Seed_SecQuestion_ResetResult", "", "", false);
                }
                if (mICRpcResponse2.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE1) || mICRpcResponse2.sysErrCode.equals(SecurityConstants.KEY_OUT_TIME_CODE2)) {
                    SetSecurityActivity.this.getWeakHandler().sendEmptyMessageDelayed(2001, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    CustomUi.showCenterToast(SetSecurityActivity.this, mICRpcResponse2.sysErrMsg);
                    Intent intent = new Intent();
                    intent.setAction(SecurityConstants.KEY_SET_SECURITY_SUCCESSFUL);
                    SetSecurityActivity.this.sendBroadcast(intent);
                } else if (mICRpcResponse2.finish) {
                    if (!mICRpcResponse2.success) {
                        CustomUi.showCenterToast(SetSecurityActivity.this, mICRpcResponse2.sysErrMsg);
                    } else {
                        SetSecurityActivity setSecurityActivity2 = SetSecurityActivity.this;
                        CustomUi.showTipToast(setSecurityActivity2, 0, setSecurityActivity2.getResources().getString(R.string.set_success));
                    }
                    SetSecurityActivity.this.getWeakHandler().sendEmptyMessageDelayed(2001, 0);
                    Intent intent2 = new Intent();
                    intent2.setAction(SecurityConstants.KEY_SET_SECURITY_SUCCESSFUL);
                    SetSecurityActivity.this.sendBroadcast(intent2);
                } else {
                    SetSecurityActivity setSecurityActivity3 = SetSecurityActivity.this;
                    CustomUi.showCenterToast(setSecurityActivity3, setSecurityActivity3.getResources().getString(R.string.Sysytem_error));
                }
            }

            public void onFailure(IAPError iAPError) {
                SetSecurityActivity.this.hideSubmittingDialog();
                SetSecurityActivity setSecurityActivity = SetSecurityActivity.this;
                CustomUi.showCenterToast(setSecurityActivity, setSecurityActivity.getResources().getString(R.string.Sysytem_error));
            }
        });
    }

    /* access modifiers changed from: private */
    public JSONArray buildConfirmData() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.questionItemArr.length; i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("1", this.questionItemArr[i].getQuestionId());
                jSONObject.put("11", this.questionItemArr[i].getDisplayType());
                jSONObject.put("9", buildAnswerJsonArr(this.questionItemArr[i], i));
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray buildAnswerJsonArr(QuestionItem questionItem, int i) throws Exception {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", questionItem.getQuestionId());
        jSONObject.put("3", new JSONArray().put(this.answerId[i]));
        jSONObject.put("4", buildFixAnswer(this.answerId[i], questionItem));
        jSONObject.put("5", 0);
        jSONObject.put("6", 1);
        jSONObject.put("7", questionItem.getMemoryId());
        jSONObject.put(PrepareException.ERROR_AUTH_FAIL, questionItem.getQuestionType());
        jSONObject.put("9", questionItem.getDisplayType());
        jSONObject.put(MonitorUtil.ERROR_CODE_EMPTY, questionItem.getAnswerDisplayType());
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private JSONArray buildFixAnswer(String str, QuestionItem questionItem) {
        if (questionItem.getQuestionsOptionsList() == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < questionItem.getQuestionsOptionsList().size(); i++) {
            QuestionItem.QuestionsOptions questionsOptions = questionItem.getQuestionsOptionsList().get(i);
            if (!questionsOptions.getValue().equals(str)) {
                jSONArray.put(questionsOptions.getValue());
            }
        }
        return jSONArray;
    }

    private void parceQuestionJson(JSONArray jSONArray) throws JSONException {
        this.adapterList.clear();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            jSONObject.getString("pageNum");
            JSONArray jSONArray2 = jSONObject.getJSONArray(SecurityConstants.KEY_QUESTION_PAGE_LIUST);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArray2.length()) {
                JSONArray jSONArray3 = (JSONArray) jSONArray2.get(i2);
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (i3 < jSONArray3.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i3);
                    QuestionItem questionItem = new QuestionItem();
                    String string = jSONObject2.getString(SecurityConstants.KEY_ANSWER_DISPLAY_TYPE);
                    String string2 = jSONObject2.getString("content");
                    String string3 = jSONObject2.getString(SecurityConstants.KEY_MEMORYID);
                    String string4 = jSONObject2.getString("questionId");
                    String string5 = jSONObject2.getString(SecurityConstants.KEY_QUESTION_TYPE);
                    String string6 = jSONObject2.getString(SecurityConstants.KEY_DISPLAY_TYPE);
                    questionItem.setQuestionType(string5);
                    questionItem.setAnswerDisplayType(string);
                    questionItem.setMemoryId(string3);
                    questionItem.setQuestionId(string4);
                    questionItem.setContent(string2);
                    questionItem.setDisplayType(string6);
                    if (jSONObject2.has(SecurityConstants.KEY_OPTIONS)) {
                        JSONArray jSONArray4 = jSONObject2.getJSONArray(SecurityConstants.KEY_OPTIONS);
                        ArrayList arrayList3 = new ArrayList();
                        for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                            JSONObject jSONObject3 = (JSONObject) jSONArray4.get(i4);
                            arrayList3.add(new QuestionItem.QuestionsOptions(jSONObject3.getString(SecurityConstants.KEY_TEXT), jSONObject3.getString(SecurityConstants.KEY_VALUE)));
                        }
                        questionItem.setQuestionsOptionsList(arrayList3);
                    }
                    arrayList2.add(questionItem);
                    i3++;
                    JSONArray jSONArray5 = jSONArray;
                }
                arrayList.add(arrayList2);
                i2++;
                JSONArray jSONArray6 = jSONArray;
            }
            this.adapterList.add(arrayList);
        }
    }

    public void modifyViewFromOutside() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-996257149, oncanceled);
            onCancelLoad.getMin(-996257149, oncanceled);
        }
        ActivityInterface commonActivityInterface = ActivityInterfaceManager.getCommonActivityInterface();
        if (!TextUtils.isEmpty(commonActivityInterface.navBigColor())) {
            int parseColor = ColorUtils.parseColor(commonActivityInterface.navBigColor());
            if (!ColorUtils.isColorInvalid(parseColor)) {
                this.rl_title.setBackgroundColor(parseColor);
            }
        }
    }
}
