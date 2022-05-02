package com.ap.zoloz.hummer.rpc;

import android.content.DialogInterface;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.common.AlertManager;
import com.ap.zoloz.hummer.common.HummerContext;
import com.ap.zoloz.hummer.common.RecordManager;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import java.util.HashMap;

public class RpcManager {
    public static final String TAG = "RpcManager";
    private static RpcManager sInstance;
    private boolean isInited = false;
    private HummerGWFacade mHummerGWFacade;
    /* access modifiers changed from: private */
    public IRpcCallback mIRpcCallback;
    private RpcChannel mRpcChannel;

    public static RpcManager getInstance() {
        if (sInstance == null) {
            synchronized (RpcManager.class) {
                if (sInstance == null) {
                    sInstance = new RpcManager();
                }
            }
        }
        return sInstance;
    }

    public void init(HummerGWFacade hummerGWFacade) {
        this.mHummerGWFacade = hummerGWFacade;
        this.mRpcChannel = new RpcChannel();
        this.isInited = true;
    }

    public void sendRpc(IRpcCallback iRpcCallback, RpcRequest rpcRequest) {
        this.mIRpcCallback = iRpcCallback;
        if (this.isInited) {
            new PureRpcTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new RpcRequest[]{rpcRequest});
        } else if (iRpcCallback != null) {
            iRpcCallback.onCompletion((RpcResponse) null);
        }
    }

    class PureRpcTask extends AsyncTask<RpcRequest, Void, RpcResponse> {
        private PureRpcTask() {
        }

        /* access modifiers changed from: protected */
        public RpcResponse doInBackground(RpcRequest... rpcRequestArr) {
            if (rpcRequestArr[0].showLoading) {
                AlertManager.getInstance().showProgressDialog("", false, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                    }
                }, true);
            }
            return RpcManager.this.next(rpcRequestArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(RpcResponse rpcResponse) {
            AlertManager.getInstance().dismissDialog();
            if (RpcManager.this.mIRpcCallback != null) {
                RpcManager.this.mIRpcCallback.onCompletion(rpcResponse);
            }
        }
    }

    /* access modifiers changed from: private */
    public RpcResponse next(RpcRequest rpcRequest) {
        RpcResponse rpcResponse = new RpcResponse();
        StringBuilder sb = new StringBuilder("RpcManager rpcRequest ");
        sb.append(rpcRequest.toString());
        HummerLogger.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("RpcManager versionToken of request ");
        sb2.append(rpcRequest.factorNextRequest.versionToken);
        HummerLogger.i(sb2.toString());
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("nextIndex", Integer.toString(rpcRequest.factorNextRequest.nextIndex.intValue()));
        hashMap.put(HummerConstants.CURRENT_TASK_NAME, rpcRequest.currentTaskName);
        hashMap.put("payload", String.valueOf(JSON.toJSONString(rpcRequest.factorNextRequest).getBytes().length / 1024));
        RecordManager.getInstance().record(HummerConstants.ZTECH_NEXT_START, hashMap);
        try {
            if (this.mRpcChannel != null) {
                rpcResponse.factorNextResponse = this.mRpcChannel.next(rpcRequest.factorNextRequest, this.mHummerGWFacade);
            }
        } catch (Throwable th) {
            boolean z = th instanceof IRpcException;
            if (z || (th instanceof RpcException)) {
                rpcResponse.exception = HummerConstants.NETWOTK_EXCEPTION;
                hashMap.clear();
                if (z) {
                    IRpcException iRpcException = (IRpcException) th;
                    hashMap.put(HummerConstants.RPC_ERROR_MSG, iRpcException.getMsg());
                    hashMap.put("rpcResultCode", Integer.toString(iRpcException.getCode()));
                } else {
                    RpcException rpcException = th;
                    hashMap.put(HummerConstants.RPC_ERROR_MSG, rpcException.getMsg());
                    hashMap.put("rpcResultCode", Integer.toString(rpcException.getCode()));
                }
                hashMap.put("action", "next");
                RecordManager.getInstance().record(HummerConstants.ZTECH_RPC_ERROR, hashMap);
                HummerLogger.e((Throwable) th);
            } else {
                rpcResponse.exception = "exception";
            }
        }
        boolean isNullorEmpty = StringUtil.isNullorEmpty(rpcResponse.exception);
        String str = (rpcResponse.factorNextResponse.response == null || rpcResponse.factorNextResponse.response.size() <= 0) ? "" : rpcResponse.factorNextResponse.response.get(0).retCode;
        hashMap.clear();
        hashMap.put("success", Boolean.toString(isNullorEmpty));
        hashMap.put(HummerConstants.CURRENT_TASK_NAME, rpcRequest.currentTaskName);
        hashMap.put(HummerConstants.BIZ_RESULT_CODE, str);
        hashMap.put("uploadTime", Long.toString(System.currentTimeMillis() - currentTimeMillis));
        RecordManager.getInstance().record(HummerConstants.ZTECH_NEXT_END, hashMap);
        StringBuilder sb3 = new StringBuilder("RpcManager rpcResponse = ");
        sb3.append(rpcResponse.toString());
        HummerLogger.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder("RpcManager versionToken of response ");
        sb4.append(rpcResponse.factorNextResponse.versionToken);
        HummerLogger.i(sb4.toString());
        return rpcResponse;
    }

    public RpcRequest formatRequest(HummerContext hummerContext, int i, boolean z) {
        if (hummerContext == null) {
            return null;
        }
        FactorNextRequest factorNextRequest = new FactorNextRequest();
        factorNextRequest.hummerId = hummerContext.mHummerId;
        factorNextRequest.bizId = Long.toString(System.currentTimeMillis());
        factorNextRequest.versionToken = String.valueOf(hummerContext.query(HummerConstants.VERSION_TOKEN));
        factorNextRequest.nextIndex = Integer.valueOf(i);
        HashMap<String, Object> packageRPCArguments = hummerContext.packageRPCArguments();
        if (packageRPCArguments != null) {
            factorNextRequest.params = packageRPCArguments;
        }
        factorNextRequest.zStack = hummerContext.getZStack();
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.factorNextRequest = factorNextRequest;
        rpcRequest.currentTaskName = (String) hummerContext.query(HummerConstants.CURRENT_TASK_NAME);
        rpcRequest.showLoading = z;
        return rpcRequest;
    }

    public RpcRequest formatRequest(String str) {
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.factorNextRequest = (FactorNextRequest) JSON.parseObject(str, FactorNextRequest.class);
        rpcRequest.currentTaskName = "";
        rpcRequest.showLoading = false;
        return rpcRequest;
    }

    public void release() {
        if (sInstance != null) {
            this.isInited = false;
            sInstance = null;
            this.mIRpcCallback = null;
        }
    }
}
