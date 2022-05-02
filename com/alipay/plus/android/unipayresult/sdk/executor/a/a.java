package com.alipay.plus.android.unipayresult.sdk.executor.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSONObject;
import com.alipay.ap.mobileprod.biz.uniresultpage.rpc.UniResultPageRpcFacade;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.task.AsyncTaskExecutor;
import com.alipay.iap.android.common.task.async.IAPAsyncCallback;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierPayResultInfo;
import com.alipay.plus.android.unipayresult.sdk.request.UnifierPollingRpcRequest;
import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import com.alipayplus.mobile.component.common.facade.uniresultpage.request.UniResultPageAckRequest;
import com.alipayplus.mobile.component.uniresultpage.service.request.UniResultPageQueryRequest;
import com.alipayplus.mobile.component.uniresultpage.service.result.UniResultPageQueryResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    @NonNull
    public static Map<String, List<String>> a(@NonNull List<String> list) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            JSONObject parseObject = JSONObject.parseObject(next);
            if (parseObject != null) {
                String string = parseObject.getString("resultBizType");
                if (!TextUtils.isEmpty(string)) {
                    List list2 = (List) hashMap.get(string);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        hashMap.put(string, list2);
                    }
                    list2.add(next);
                }
            }
        }
        return hashMap;
    }

    public static void a(final String str, final UnifierPollingRpcRequest unifierPollingRpcRequest, IAPAsyncCallback<UniResultPageQueryResult> iAPAsyncCallback) {
        new IAPAsyncTask(iAPAsyncCallback) {
            public final Object run() throws Exception {
                UniResultPageQueryRequest uniResultPageQueryRequest = new UniResultPageQueryRequest();
                uniResultPageQueryRequest.resultBizType = str;
                uniResultPageQueryRequest.linkTargetId = unifierPollingRpcRequest.mLinkTargetId;
                uniResultPageQueryRequest.bizNos = unifierPollingRpcRequest.mBizNos;
                return ((UniResultPageRpcFacade) RPCProxyHost.getInterfaceProxy(UniResultPageRpcFacade.class)).query(uniResultPageQueryRequest);
            }
        }.executeOnExecutor(AsyncTaskExecutor.getInstance().getExecutor(), new Void[0]);
    }

    public static void a(final String str, List<UnifierPayResultInfo> list) {
        if (list != null && !list.isEmpty()) {
            final UniResultPageRpcFacade uniResultPageRpcFacade = (UniResultPageRpcFacade) RPCProxyHost.getInterfaceProxy(UniResultPageRpcFacade.class);
            for (final UnifierPayResultInfo next : list) {
                IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<BaseServiceResult>() {
                    /* renamed from: a */
                    public final BaseServiceResult execute() throws Exception {
                        return uniResultPageRpcFacade.ack(a.b(str, next));
                    }

                    /* renamed from: a */
                    public final void onSuccess(BaseServiceResult baseServiceResult) {
                        LoggerWrapper.i("UniPayResultRpcHelper", String.format("asyncAckOrderList onSuccess! tradeNO = %s", new Object[]{next.mBizNo}));
                    }

                    public final void onFailure(IAPError iAPError) {
                        LoggerWrapper.e("UniPayResultRpcHelper", String.format("asyncAckOrderList onFailure! tradeNO = %s", new Object[]{next.mBizNo}));
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public static UniResultPageAckRequest b(String str, UnifierPayResultInfo unifierPayResultInfo) {
        UniResultPageAckRequest uniResultPageAckRequest = new UniResultPageAckRequest();
        uniResultPageAckRequest.bizNo = unifierPayResultInfo.mBizNo;
        uniResultPageAckRequest.linkTargetId = unifierPayResultInfo.mLinkTargetId;
        uniResultPageAckRequest.resultBizType = str;
        return uniResultPageAckRequest;
    }
}
