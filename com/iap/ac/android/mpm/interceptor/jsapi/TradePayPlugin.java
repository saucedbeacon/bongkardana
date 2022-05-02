package com.iap.ac.android.mpm.interceptor.jsapi;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.b0.b;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.model.acl.AclMiniProgramMetaData;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.js.AlipayJSAPI;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.container.js.plugin.BaseJSPlugin;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.f0.a;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.hook.request.TradePayParams;
import com.iap.ac.android.mpm.base.model.tradepay.TradePayResultUtils;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class TradePayPlugin extends BaseJSPlugin {
    public static final String AC_MERCHANT_ID = "acMerchantId";
    public static final String APP_ID = "appId";
    public static final String ORDER_STRING = "orderStr";
    public static final String PAYMENT_URL = "paymentUrl";
    public static final String SOURCE_SITE = "sourceSite";
    public static final String TAG = "TradePayPlugin";
    public static final String TRADE_NO = "tradeNO";
    public static final String TRADE_PAY = "tradePay";
    public Handler handler = new Handler(Looper.getMainLooper());

    private void handleAcMiniProgramBiz(Map<String, String> map, TradePayParams tradePayParams, AclAPIContext aclAPIContext, final ContainerBridgeContext containerBridgeContext) {
        final a aVar = new a(map, tradePayParams, aclAPIContext, new IDecodeCallback() {
            public void dismissLoading() {
            }

            public void onResult(Result result) {
                final JSONObject tradePayResultJsonObject = TradePayResultUtils.getTradePayResultJsonObject(result == null ? null : result.resultCode);
                TradePayPlugin.this.handler.post(new Runnable() {
                    public void run() {
                        containerBridgeContext.sendBridgeResult(tradePayResultJsonObject);
                    }
                });
            }

            public void showLoading() {
            }
        });
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                aVar.e();
            }
        });
    }

    private void sendErrorResult(ContainerBridgeContext containerBridgeContext) {
        Result result = new Result();
        result.resultCode = ResultCode.PARAM_ILLEGAL;
        result.resultMessage = "Oops! System busy. Try again later!";
        containerBridgeContext.sendBridgeResult(TradePayResultUtils.getTradePayResultJsonObject(result.resultCode));
    }

    @AlipayJSAPI(api = "tradePay")
    public void api(Map<String, String> map, IContainerPresenter iContainerPresenter, ContainerBridgeContext containerBridgeContext) {
        ACLog.d(TAG, "api tradePay");
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_interceptor_jsapi").addParams("action", "tradePay").addParams("params", (Object) map).event();
        String str = map.get("appId");
        boolean b = e.b(str, map.get("sourceSite"));
        final TradePayParams tradePayParams = new TradePayParams();
        tradePayParams.tradeNo = map.get("tradeNO");
        tradePayParams.orderStr = map.get("orderStr");
        tradePayParams.paymentUrl = map.get(PAYMENT_URL);
        if (!(str == null || !WebContainer.getInstance("ac_biz").isMiniProgram(str)) && !b) {
            ACLog.e(TAG, "neither h5 nor ac mini program");
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_jsapi_tradepay_fail").addParams("resultCode", ResultCode.PARAM_ILLEGAL).addParams("resultMessage", "neither h5 nor ac mini program").setEventType(LogEventType.CRUCIAL_LOG).event();
            sendErrorResult(containerBridgeContext);
        } else if (b) {
            String str2 = map.get(AC_MERCHANT_ID);
            ACLog.i(Constants.TAG, String.format("createACMiniProgramAPIContext appId = %s, merchantId = %s", new Object[]{str, str2}));
            handleAcMiniProgramBiz(map, tradePayParams, new AclAPIContext(AclAPIContext.API_SOURCE_AC, new AclMiniProgramMetaData(str, str2), new HashMap()), containerBridgeContext);
        } else {
            try {
                String stringExtra = iContainerPresenter.getActivity().getIntent().getStringExtra("AcBizProcessorKey");
                final com.iap.ac.android.c0.a aVar = b.f9676a.get(stringExtra);
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(stringExtra);
                    sb.append("  biz processor is not exist");
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(stringExtra);
                    sb2.append(obj);
                    ACLog.e(TAG, sb2.toString());
                    ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_biz_not_found_error", obj);
                    sendErrorResult(containerBridgeContext);
                    return;
                }
                final Map<String, String> map2 = map;
                final IContainerPresenter iContainerPresenter2 = iContainerPresenter;
                final ContainerBridgeContext containerBridgeContext2 = containerBridgeContext;
                IAPAsyncTask.asyncTask((Runnable) new Runnable() {
                    public void run() {
                        String str = tradePayParams.tradeNo;
                        if (TextUtils.isEmpty(str)) {
                            com.iap.ac.android.r0.b bVar = new com.iap.ac.android.r0.b();
                            Result result = new Result();
                            bVar.b = ResultCode.PARAM_ILLEGAL;
                            result.resultCode = ResultCode.PARAM_ILLEGAL;
                            result.resultMessage = "Oops! System busy. Try again later!";
                            bVar.c = "tradeNO is empty.";
                            bVar.f9748a = result;
                            bVar.d = "swapOrder";
                            aVar.a((c) bVar);
                            return;
                        }
                        aVar.a((com.iap.ac.android.m0.b) new com.iap.ac.android.r0.a(map2, str, false), new com.iap.ac.android.b0.a(EntranceType.TradePayPlugin, iContainerPresenter2, containerBridgeContext2));
                    }
                });
            } catch (Throwable th) {
                String concat = "get biz key error :".concat(String.valueOf(th));
                ACLog.e(TAG, concat);
                ACLogEvent.exceptionLog(concat);
                sendErrorResult(containerBridgeContext);
            }
        }
    }

    public Class<? extends BaseJSPlugin> getJSPluginClass() {
        return TradePayPlugin.class;
    }
}
