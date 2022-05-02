package com.alipay.mobile.verifyidentity.framework.engine;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.DefaultOnClickUrl;
import com.alipay.mobile.verifyidentity.base.OnClickUrl;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.ProductConstants;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerify;
import com.alipay.mobile.verifyidentity.business.activity.SecVIVerifyInterface;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.R;
import com.alipay.mobile.verifyidentity.framework.flow.NormalFlowController;
import com.alipay.mobile.verifyidentity.framework.module.VIModule;
import com.alipay.mobile.verifyidentity.framework.task.Task;
import com.alipay.mobile.verifyidentity.framework.task.TaskManager;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICInitRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VIEngine {
    private static final String TAG = VIEngine.class.getSimpleName();
    public static final long TIME_INTERVAL = 1000;
    /* access modifiers changed from: private */
    public static String currentVerifyId;
    public static GetIfaaData ifaaData;
    private static long mLastClickTime = 0;
    private static OnClickUrl onClickUrl = new DefaultOnClickUrl();

    public interface VIListener {
        void onVerifyAction(VIAction vIAction);

        void onVerifyResult(VIResult vIResult);
    }

    public interface OnQueryResult {
        void onFail();

        void onSuccess();
    }

    static {
        VIEngineUtils.initVIEngine();
    }

    public static void setIfaaData(GetIfaaData getIfaaData) {
        ifaaData = getIfaaData;
    }

    public static void registerOnClickUrl(OnClickUrl onClickUrl2) {
        if (onClickUrl2 != null) {
            onClickUrl = onClickUrl2;
        }
    }

    public static OnClickUrl getOnClickUrl() {
        return onClickUrl;
    }

    public static void setProductRequest(Activity activity, String str, String str2, String str3, String str4, VerifyResponseCallBack verifyResponseCallBack) {
        final Dialog createLoadingDialog = CustomUi.createLoadingDialog(activity);
        createLoadingDialog.show();
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str4;
        final String str8 = str;
        final Activity activity2 = activity;
        final VerifyResponseCallBack verifyResponseCallBack2 = verifyResponseCallBack;
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public final MICRpcResponse execute() throws Exception {
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = RequestConstants.VERIFY;
                mICRpcRequest.action = str5;
                mICRpcRequest.module = str6;
                mICRpcRequest.data = str7;
                mICRpcRequest.prodmngId = str8;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(activity2)).toString();
                mICRpcRequest.version = "3.1.8.100";
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public final void onSuccess(MICRpcResponse mICRpcResponse) {
                Dialog dialog = createLoadingDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (mICRpcResponse == null) {
                    VerifyResponseCallBack verifyResponseCallBack = verifyResponseCallBack2;
                    if (verifyResponseCallBack != null) {
                        verifyResponseCallBack.verifyRequestFail();
                        return;
                    }
                    return;
                }
                VerifyResponseCallBack verifyResponseCallBack2 = verifyResponseCallBack2;
                if (verifyResponseCallBack2 != null) {
                    verifyResponseCallBack2.verifyRequestSuccess(mICRpcResponse);
                }
            }

            public final void onFailure(IAPError iAPError) {
                Dialog dialog = createLoadingDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                VerifyResponseCallBack verifyResponseCallBack = verifyResponseCallBack2;
                if (verifyResponseCallBack != null) {
                    verifyResponseCallBack.verifyRequestFail();
                }
                CustomUi.showCenterToast(activity2, iAPError.errorMessage);
            }
        });
    }

    public static void verifyRequest(Activity activity, String str, String str2, String str3, VerifyResponseCallBack verifyResponseCallBack) {
        final Dialog createLoadingDialog = CustomUi.createLoadingDialog(activity);
        createLoadingDialog.show();
        final String str4 = str2;
        final String str5 = str;
        final String str6 = str3;
        final Activity activity2 = activity;
        final VerifyResponseCallBack verifyResponseCallBack2 = verifyResponseCallBack;
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public final MICRpcResponse execute() throws Exception {
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = RequestConstants.VERIFY;
                mICRpcRequest.module = str4;
                mICRpcRequest.verifyId = str5;
                mICRpcRequest.data = str6;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(activity2)).toString();
                mICRpcRequest.version = "3.1.8.100";
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public final void onSuccess(MICRpcResponse mICRpcResponse) {
                Dialog dialog = createLoadingDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (mICRpcResponse == null) {
                    VerifyResponseCallBack verifyResponseCallBack = verifyResponseCallBack2;
                    if (verifyResponseCallBack != null) {
                        verifyResponseCallBack.verifyRequestFail();
                        return;
                    }
                    return;
                }
                VerifyResponseCallBack verifyResponseCallBack2 = verifyResponseCallBack2;
                if (verifyResponseCallBack2 != null) {
                    verifyResponseCallBack2.verifyRequestSuccess(mICRpcResponse);
                }
            }

            public final void onFailure(IAPError iAPError) {
                Dialog dialog = createLoadingDialog;
                if (dialog != null) {
                    dialog.dismiss();
                }
                VerifyResponseCallBack verifyResponseCallBack = verifyResponseCallBack2;
                if (verifyResponseCallBack != null) {
                    verifyResponseCallBack.verifyRequestFail();
                }
                CustomUi.showCenterToast(activity2, iAPError.errorMessage);
            }
        });
    }

    public static void startVerify(Context context, int i, Map<String, Object> map, Map<String, String> map2, VIListener vIListener, OnQueryResult onQueryResult) {
        verify(context, i, RequestConstants.VerifyCallAllStart, map, map2, vIListener, onQueryResult);
    }

    public static void verify(Context context, int i, int i2, Map<String, Object> map, Map<String, String> map2, VIListener vIListener, OnQueryResult onQueryResult) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mLastClickTime > 1000) {
            mLastClickTime = currentTimeMillis;
            if (i == 8000) {
                startProduct(context, map, map2, onQueryResult);
            } else if (i == 8008) {
                if (i2 == 9009) {
                    VIEngineUtils.setVIListener((VIListener) null);
                }
                if (VIEngineUtils.getVIListener() != null || vIListener == null) {
                    vIListener = VIEngineUtils.getVIListener();
                } else {
                    VIEngineUtils.setVIListener(vIListener);
                }
                startVerify(context, map, vIListener);
            }
        }
    }

    private static void startVerify(final Context context, Map<String, Object> map, VIListener vIListener) {
        int i;
        SecVIVerifyInterface secVIVerifyInterface;
        Context context2 = context;
        final Map<String, Object> map2 = map;
        final VIListener vIListener2 = vIListener;
        if (context2 != null && map2 != null && vIListener2 != null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            if (!activity.isFinishing()) {
                if (!map2.containsKey("userId") && (secVIVerifyInterface = SecVIVerify.secVIVerifyInterface) != null) {
                    String userId = secVIVerifyInterface.userId();
                    if (!TextUtils.isEmpty(userId)) {
                        map2.put("userId", userId);
                    }
                }
                final Dialog createLoadingDialog = CustomUi.createLoadingDialog(activity);
                createLoadingDialog.show();
                try {
                    i = Integer.parseInt((String) map2.get("verifyType"));
                } catch (Throwable unused) {
                    i = 0;
                }
                if (2 == i) {
                    IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
                        public final MICRpcResponse execute() throws Exception {
                            MICInitRequest mICInitRequest = new MICInitRequest();
                            mICInitRequest.sceneId = (String) map2.get("sceneId");
                            mICInitRequest.bizId = (String) map2.get("bizId");
                            mICInitRequest.externParams = new HashMap();
                            mICInitRequest.externParams.put("userId", map2.get("userId"));
                            mICInitRequest.externParams.put("call_back_url", "null");
                            String str = (String) map2.get(RequestConstants.SecVIKeyTntInstId);
                            String str2 = (String) map2.get("action");
                            if (!TextUtils.isEmpty(str2)) {
                                mICInitRequest.action = str2;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                mICInitRequest.externParams.put(RequestConstants.SecVIKeyTntInstId, str);
                            }
                            String str3 = (String) map2.get(RequestConstants.SecVIKeyBankCardNumber);
                            if (!TextUtils.isEmpty(str3)) {
                                mICInitRequest.externParams.put(RequestConstants.SecVIKeyBankCardNumber, str3);
                            }
                            Map map = (Map) map2.get(RequestConstants.SecVIKeyFastInitExtra);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    mICInitRequest.externParams.put(entry.getKey(), entry.getValue());
                                }
                            }
                            mICInitRequest.envData = new JSONObject(VIEngineUtils.getEnvData(context)).toString();
                            if (VIEngine.ifaaData != null) {
                                mICInitRequest.externParams.put("secData", VIEngine.ifaaData.getPayData(context));
                            }
                            VIEngineUtils.getZolozFaceData(context.getApplicationContext());
                            if (!TextUtils.isEmpty(VIEngineUtils.getZolozFaceData(context.getApplicationContext()))) {
                                VIEngineUtils.getZolozFaceData(context.getApplicationContext());
                                mICInitRequest.externParams.put(ProductConstants.KEY_PRODUCT_ENV_ZOLOZ, VIEngineUtils.getZolozFaceData(context.getApplicationContext()));
                            }
                            return RpcSettings.retrieveRpcService().initVerifyTaskOuter(mICInitRequest);
                        }

                        public final void onSuccess(MICRpcResponse mICRpcResponse) {
                            if (createLoadingDialog != null && !((Activity) context).isFinishing()) {
                                createLoadingDialog.dismiss();
                            }
                            if (mICRpcResponse != null || ((Activity) context).isFinishing()) {
                                Message message = new Message(mICRpcResponse.toString());
                                message.setVerifyType(2);
                                if (!TextUtils.isEmpty(mICRpcResponse.data)) {
                                    message.setUserId((String) map2.get("userId"));
                                    message.setTntInstId((String) map2.get(RequestConstants.SecVIKeyTntInstId));
                                    message.setUserInfo((String) map2.get("userInfo"));
                                    VIEngine.startVI(context, message, vIListener2);
                                    return;
                                }
                                VIResult vIResult = new VIResult(2002);
                                vIResult.setVerifyId(message.getVerifyId());
                                vIListener2.onVerifyResult(vIResult);
                                return;
                            }
                            Context context = context;
                            CustomUi.showCenterToast((Activity) context, context.getResources().getString(R.string.system_busy_error));
                            vIListener2.onVerifyResult(new VIResult(1001));
                        }

                        public final void onFailure(IAPError iAPError) {
                            Dialog dialog = createLoadingDialog;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            vIListener2.onVerifyResult(new VIResult(1001));
                        }
                    });
                } else if (1 == i) {
                    final String str = (String) map2.get("verifyId");
                    if (TextUtils.isEmpty(str)) {
                        if (createLoadingDialog != null) {
                            createLoadingDialog.dismiss();
                        }
                        vIListener2.onVerifyResult(new VIResult(2000));
                    } else if (TextUtils.isEmpty(currentVerifyId) || !currentVerifyId.equalsIgnoreCase(str)) {
                        currentVerifyId = str;
                        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a1.b1.c1", "0", ""}, (Map<String, String>) null, "", "SecVI_Seed_Standard_DoView", "", str, false);
                        final Context context3 = context;
                        final Map<String, Object> map3 = map;
                        final VIListener vIListener3 = vIListener;
                        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
                            public final MICRpcResponse execute() throws Exception {
                                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                                mICRpcRequest.module = "INIT";
                                mICRpcRequest.action = RequestConstants.VIEW;
                                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(context3)).toString();
                                mICRpcRequest.verifyId = (String) map3.get("verifyId");
                                String str = (String) map3.get("module");
                                if (!TextUtils.isEmpty(str)) {
                                    mICRpcRequest.module = str;
                                }
                                JSONObject jSONObject = new JSONObject();
                                if (map3.containsKey("userId")) {
                                    jSONObject.put("userId", map3.get("userId"));
                                }
                                if (VIEngine.ifaaData != null) {
                                    jSONObject.put("secData", VIEngine.ifaaData.getPayData(context3));
                                }
                                VIEngineUtils.getZolozFaceData(context3.getApplicationContext());
                                if (!TextUtils.isEmpty(VIEngineUtils.getZolozFaceData(context3.getApplicationContext()))) {
                                    VIEngineUtils.getZolozFaceData(context3.getApplicationContext());
                                    jSONObject.put(ProductConstants.KEY_PRODUCT_ENV_ZOLOZ, VIEngineUtils.getZolozFaceData(context3.getApplicationContext()));
                                }
                                mICRpcRequest.data = jSONObject.toString();
                                try {
                                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                                } catch (Throwable unused) {
                                    String unused2 = VIEngine.currentVerifyId = "";
                                    return null;
                                }
                            }

                            public final void onSuccess(MICRpcResponse mICRpcResponse) {
                                String unused = VIEngine.currentVerifyId = "";
                                if (createLoadingDialog != null && !((Activity) context3).isFinishing()) {
                                    createLoadingDialog.dismiss();
                                }
                                if (mICRpcResponse != null || ((Activity) context3).isFinishing()) {
                                    Message message = new Message(mICRpcResponse.toString());
                                    message.setVerifyType(1);
                                    if (!TextUtils.isEmpty(mICRpcResponse.data)) {
                                        message.setUserId((String) map3.get("userId"));
                                        message.setUserInfo((String) map3.get("userInfo"));
                                        message.setTntInstId((String) map3.get(RequestConstants.SecVIKeyTntInstId));
                                        VIEngine.startVI(context3, message, vIListener3);
                                        return;
                                    }
                                    VIResult vIResult = new VIResult(2002);
                                    vIResult.setVerifyId(message.getVerifyId());
                                    vIListener3.onVerifyResult(vIResult);
                                    return;
                                }
                                Context context = context3;
                                CustomUi.showCenterToast((Activity) context, context.getResources().getString(R.string.system_busy_error));
                                VIResult vIResult2 = new VIResult(1001);
                                vIResult2.setVerifyId(str);
                                vIListener3.onVerifyResult(vIResult2);
                            }

                            public final void onFailure(IAPError iAPError) {
                                String unused = VIEngine.currentVerifyId = "";
                                Dialog dialog = createLoadingDialog;
                                if (dialog != null) {
                                    dialog.dismiss();
                                }
                                VIResult vIResult = new VIResult(1001);
                                vIResult.setVerifyId((String) map3.get("verifyId"));
                                vIListener3.onVerifyResult(vIResult);
                            }
                        });
                    } else if (createLoadingDialog != null) {
                        createLoadingDialog.dismiss();
                    }
                } else if (createLoadingDialog != null) {
                    createLoadingDialog.dismiss();
                }
            }
        }
    }

    public static String getSecData(Context context, String str) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject.toString();
        }
        GetIfaaData getIfaaData = ifaaData;
        if (getIfaaData != null) {
            jSONObject.put("secData", (Object) getIfaaData.getRegData(context, str));
        }
        return jSONObject.toString();
    }

    public static void enterBic(final Context context, Map<String, String> map, OnQueryResult onQueryResult) {
        final String str;
        SecVIVerifyInterface secVIVerifyInterface;
        Context context2 = context;
        Map<String, String> map2 = map;
        if (context2 != null && map2 != null) {
            if (!map.containsKey("userId") && (secVIVerifyInterface = SecVIVerify.secVIVerifyInterface) != null) {
                String userId = secVIVerifyInterface.userId();
                if (!TextUtils.isEmpty(userId)) {
                    map.put("userId", userId);
                }
            }
            final Dialog createLoadingDialog = CustomUi.createLoadingDialog((Activity) context2);
            createLoadingDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || keyEvent.getRepeatCount() != 0) {
                        return false;
                    }
                    Context context = context;
                    if (!(context instanceof DialogInterface.OnKeyListener)) {
                        return false;
                    }
                    ((DialogInterface.OnKeyListener) context).onKey(dialogInterface, i, keyEvent);
                    return false;
                }
            });
            createLoadingDialog.show();
            GetIfaaData getIfaaData = ifaaData;
            if (getIfaaData != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(map.get("userId"));
                sb.append("_");
                sb.append(map.get(RequestConstants.SecVIKeyTntInstId));
                sb.append("_1");
                str = getIfaaData.getRegData(context, sb.toString());
            } else {
                str = "";
            }
            final String str2 = map.get("action");
            final String str3 = map.get("type");
            final String str4 = map.get("productCode");
            final Context context3 = context;
            final String str5 = map.get("bizId");
            final String str6 = map.get("sceneId");
            final String str7 = map.get("userId");
            final String str8 = map.get(RequestConstants.SecVIKeyTntInstId);
            final String str9 = map.get("productId");
            final OnQueryResult onQueryResult2 = onQueryResult;
            IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
                public final MICRpcResponse execute() throws Exception {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.module = RequestConstants.BIC;
                    mICRpcRequest.module = str4;
                    mICRpcRequest.action = RequestConstants.QUERY_BIO_STATUS;
                    mICRpcRequest.isDisplaySensitiveField = false;
                    mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(context3)).toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("secData", str);
                    jSONObject.put("bizId", str5);
                    jSONObject.put("sceneId", str6);
                    jSONObject.put("userId", str7);
                    jSONObject.put(RequestConstants.SecVIKeyTntInstId, str8);
                    jSONObject.put("productId", str9);
                    jSONObject.put("productType", str9);
                    mICRpcRequest.data = jSONObject.toString();
                    mICRpcRequest.prodmngId = IAPSyncCommand.COMMAND_INIT;
                    try {
                        return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                public final void onSuccess(MICRpcResponse mICRpcResponse) {
                    Dialog dialog = createLoadingDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Context context = context3;
                    if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                        return;
                    }
                    if (mICRpcResponse == null) {
                        Context context2 = context3;
                        CustomUi.showCenterToast((Activity) context2, context2.getResources().getString(R.string.system_busy_error));
                        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a4.b1.c1", "1", ""}, (Map<String, String>) null, "", "SecVI_Seed_Bic_QueryStatus", "", "", false);
                        OnQueryResult onQueryResult = onQueryResult2;
                        if (onQueryResult != null) {
                            onQueryResult.onFail();
                            return;
                        }
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("finishedCode", mICRpcResponse.finishCode);
                    hashMap.put("finishedMsg", mICRpcResponse.finishMessage);
                    hashMap.put("verifyMsg", mICRpcResponse.verifyMessage);
                    ClientLogKitManager.getClientLogKit().log("event", new String[]{"a4.b1.c1", "0", ""}, hashMap, "", "SecVI_Seed_Bic_QueryStatus", "", "", false);
                    if (mICRpcResponse.success || (!mICRpcResponse.success && mICRpcResponse.finish && !"1001".equalsIgnoreCase(mICRpcResponse.finishCode))) {
                        Message convertToMessage = mICRpcResponse.convertToMessage();
                        convertToMessage.setSecData(str);
                        convertToMessage.setBizId(str5);
                        convertToMessage.setSceneId(str6);
                        convertToMessage.setUserId(str7);
                        convertToMessage.setTntInstId(str8);
                        convertToMessage.setProdmngId(mICRpcResponse.prodmngId);
                        convertToMessage.setProductType(str9);
                        if (!TextUtils.isEmpty(str2)) {
                            convertToMessage.setAction(str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            convertToMessage.setType(str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            convertToMessage.setProductCode(str4);
                        }
                        VIEngine.startVI(context3, convertToMessage, (VIListener) null);
                    } else if (!TextUtils.isEmpty(mICRpcResponse.sysErrMsg)) {
                        CustomUi.showCenterToast((Activity) context3, mICRpcResponse.sysErrMsg);
                    }
                    OnQueryResult onQueryResult2 = onQueryResult2;
                    if (onQueryResult2 != null) {
                        onQueryResult2.onSuccess();
                    }
                }

                public final void onFailure(IAPError iAPError) {
                    Dialog dialog = createLoadingDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Context context = context3;
                    if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                        if (!TextUtils.isEmpty(iAPError.errorMessage)) {
                            Context context2 = context3;
                            CustomUi.showCenterToast((Activity) context2, context2.getResources().getString(R.string.system_busy_error));
                        }
                        OnQueryResult onQueryResult = onQueryResult2;
                        if (onQueryResult != null) {
                            onQueryResult.onFail();
                        }
                    }
                }
            });
        } else if (onQueryResult != null) {
            onQueryResult.onFail();
        }
    }

    public static void startProduct(Context context, Map<String, Object> map, Map<String, String> map2, OnQueryResult onQueryResult) {
        SecVIVerifyInterface secVIVerifyInterface;
        SecVIVerifyInterface secVIVerifyInterface2;
        Map<String, Object> map3 = map;
        if (context != null && map3 != null) {
            if (!map.containsKey("userId") && (secVIVerifyInterface2 = SecVIVerify.secVIVerifyInterface) != null) {
                String userId = secVIVerifyInterface2.userId();
                if (!TextUtils.isEmpty(userId)) {
                    map.put("userId", userId);
                }
            }
            if (!map.containsKey(RequestConstants.SecVIKeyTntInstId) && (secVIVerifyInterface = SecVIVerify.secVIVerifyInterface) != null) {
                String tntInstId = secVIVerifyInterface.tntInstId();
                if (!TextUtils.isEmpty(tntInstId)) {
                    map.put(RequestConstants.SecVIKeyTntInstId, tntInstId);
                }
            }
            final String str = (String) map.get("sceneId");
            final String str2 = (String) map.get("userId");
            final String str3 = (String) map.get(RequestConstants.SecVIKeyTntInstId);
            final String str4 = (String) map.get("productCode");
            map.get("verifyType");
            final String str5 = (String) map.get("productId");
            final String str6 = str4.equalsIgnoreCase(SecurityConstants.KEY_SQ) ? RequestConstants.QUERY_BIO_STATUS : RequestConstants.BUILD_MENU;
            final Dialog createLoadingDialog = CustomUi.createLoadingDialog((Activity) context);
            createLoadingDialog.show();
            final Context context2 = context;
            final Map<String, Object> map4 = map;
            final Map<String, String> map5 = map2;
            final OnQueryResult onQueryResult2 = onQueryResult;
            IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
                public final MICRpcResponse execute() throws Exception {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.action = str6;
                    mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(context2)).toString();
                    mICRpcRequest.module = str4;
                    mICRpcRequest.prodmngId = "query";
                    if (str4.equalsIgnoreCase(SecurityConstants.KEY_SQ)) {
                        mICRpcRequest.action = RequestConstants.QUERY_BIO_STATUS;
                        mICRpcRequest.prodmngId = IAPSyncCommand.COMMAND_INIT;
                    }
                    if (!TextUtils.isEmpty((String) map4.get("action"))) {
                        mICRpcRequest.action = (String) map4.get("action");
                    }
                    if (!TextUtils.isEmpty((String) map4.get(RequestConstants.SecVIKeyProductMngId))) {
                        mICRpcRequest.prodmngId = (String) map4.get(RequestConstants.SecVIKeyProductMngId);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userId", str2);
                    jSONObject.put("sceneId", str);
                    jSONObject.put(RequestConstants.SecVIKeyTntInstId, str3);
                    jSONObject.put("productType", str5);
                    jSONObject.put("isMock", SummaryActivity.CHECKED);
                    jSONObject.put("failedCase", "0");
                    mICRpcRequest.data = jSONObject.toString();
                    try {
                        return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                public final void onSuccess(MICRpcResponse mICRpcResponse) {
                    Dialog dialog = createLoadingDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (mICRpcResponse == null) {
                        ClientLogKitManager.getClientLogKit().log("event", new String[]{"a4.b3.c2", "1", ""}, (Map<String, String>) null, "", "SecVI_Seed_SecQuestion_QueryStatus", "", "", false);
                        Context context = context2;
                        CustomUi.showCenterToast((Activity) context, context.getResources().getString(R.string.system_busy_error));
                        return;
                    }
                    Message message = new Message(mICRpcResponse.toString());
                    if (!TextUtils.isEmpty(mICRpcResponse.data)) {
                        message.setUserId(str2);
                        message.setSceneId(str);
                        message.setTntInstId(str3);
                        message.setProductCode(str4);
                        message.setProdmngId(mICRpcResponse.prodmngId);
                        message.setProductType(str5);
                        if (!TextUtils.isEmpty((String) map4.get("action"))) {
                            message.setAction((String) map4.get("action"));
                        } else {
                            message.setAction(str6);
                        }
                        Map map = map5;
                        if (map != null && !TextUtils.isEmpty((CharSequence) map.get(RequestConstants.SecVIKeySecuritySettingsConfig))) {
                            message.setSecData((String) map5.get(RequestConstants.SecVIKeySecuritySettingsConfig));
                        }
                        VIEngine.startVI(context2, message, (VIListener) null);
                    }
                    OnQueryResult onQueryResult = onQueryResult2;
                    if (onQueryResult != null) {
                        onQueryResult.onSuccess();
                    }
                }

                public final void onFailure(IAPError iAPError) {
                    Dialog dialog = createLoadingDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    OnQueryResult onQueryResult = onQueryResult2;
                    if (onQueryResult != null) {
                        onQueryResult.onFail();
                    }
                }
            });
        } else if (onQueryResult != null) {
            onQueryResult.onFail();
        }
    }

    public static void startVI(final Context context, Message message, final VIListener vIListener) {
        if (context instanceof Activity) {
            try {
                final JSONObject jSONObject = new JSONObject(message.getData());
                if (SummaryActivity.CHECKED.equalsIgnoreCase(jSONObject.optString("completePPWFlag"))) {
                    CustomUi.showCommonDialog((Activity) context, "", context.getResources().getString(R.string.inter_set_pwd_needed), 1001, true, new ModalInterface() {
                        public final void onCancel() {
                        }

                        public final void onOk() {
                            if (VIEngine.getOnClickUrl() != null) {
                                VIEngine.getOnClickUrl().onClickHttpUrl(context, jSONObject.optString("completePPWUrl"));
                            }
                        }
                    });
                    return;
                }
            } catch (JSONException unused) {
            }
            VIModule create = new VIModule.Builder().create(context, message);
            if (create != null) {
                TaskManager.getInstance().execute(new Task(new NormalFlowController(create, new VIModule.Callback() {
                    public final void onResult(IProduct iProduct, final VIRespone vIRespone) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                Message responseMessage = vIRespone.getResponseMessage();
                                if (responseMessage == null || TextUtils.isEmpty(responseMessage.getNextStep())) {
                                    if (vIListener != null) {
                                        vIListener.onVerifyResult(VIEngineUtils.buildResult(vIRespone));
                                        VIEngineUtils.setVIListener((VIListener) null);
                                    }
                                } else if (vIRespone.getResult() != 1004) {
                                    VIEngine.startVI(context, responseMessage, vIListener);
                                } else if (vIListener != null) {
                                    vIListener.onVerifyResult(VIEngineUtils.buildResult(vIRespone));
                                    VIEngineUtils.setVIListener((VIListener) null);
                                }
                            }
                        });
                    }

                    public final void onAction(final String str) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                if (vIListener != null) {
                                    vIListener.onVerifyAction(new VIAction(str));
                                    VIEngineUtils.setVIListener((VIListener) null);
                                }
                            }
                        });
                    }
                })));
            } else if (vIListener != null) {
                vIListener.onVerifyResult(new VIResult(1008));
            }
        }
    }

    public static void changeVerifyMethod(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("verifyType", "1");
        hashMap.put("module", RequestConstants.MENU);
        hashMap.put("verifyId", str);
        verify(context, RequestConstants.VerifyProductVerify, RequestConstants.VerifyCallAllInsert, hashMap, (Map<String, String>) null, new VIListener() {
            public final void onVerifyAction(VIAction vIAction) {
            }

            public final void onVerifyResult(VIResult vIResult) {
            }
        }, (OnQueryResult) null);
    }

    public static String viClientData(Context context) {
        JSONObject jSONObject = new JSONObject();
        GetIfaaData getIfaaData = ifaaData;
        if (getIfaaData != null) {
            try {
                jSONObject.put("secData", getIfaaData.getPayData(context));
                jSONObject.put(ProductConstants.KEY_PRODUCT_ENV_ZOLOZ, "");
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }
}
