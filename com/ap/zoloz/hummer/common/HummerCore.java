package com.ap.zoloz.hummer.common;

import android.content.DialogInterface;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import com.ap.zoloz.hummer.rpc.IRpcCallback;
import com.ap.zoloz.hummer.rpc.RpcManager;
import com.ap.zoloz.hummer.rpc.RpcResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.Map;

public class HummerCore {
    public static final String TAG = "HummerCore";
    /* access modifiers changed from: private */
    public HummerContext mHummerContext;
    private IHummerCoreCallback mHummerCoreCallback;
    /* access modifiers changed from: private */
    public IAlertManagerCallback mIAlertManagerCallback;
    private Map<Integer, TaskTracker> mTasks = new HashMap();
    private int mZorder = 0;

    public TaskTracker getCurrentTask() {
        return this.mTasks.get(Integer.valueOf(this.mHummerContext.getCurrentTaskConfig().index));
    }

    public void schedule(HummerContext hummerContext, IHummerCoreCallback iHummerCoreCallback, final boolean z) {
        this.mHummerContext = hummerContext;
        if (hummerContext != null) {
            hummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, TAG);
        }
        this.mHummerCoreCallback = iHummerCoreCallback;
        this.mIAlertManagerCallback = new IAlertManagerCallback() {
            public void onHandelSystemError() {
                if (z) {
                    HummerCore.this.cancel();
                }
            }

            public void onHandelNetworkError(boolean z) {
                if (z) {
                    HummerCore.this.finalizeHummer();
                } else if (HummerCore.this.mHummerContext != null) {
                    HummerResponse hummerResponse = new HummerResponse();
                    hummerResponse.hummerId = HummerCore.this.mHummerContext.mHummerId;
                    hummerResponse.code = 1003;
                    HummerCore.this.mHummerContext.add(HummerConstants.HUMMER_RESPONSE, HummerConstants.CONTEXT, hummerResponse);
                    HummerCore.this.finish();
                }
            }
        };
        this.mZorder = this.mHummerContext.mClientConfig.clientStartIndex;
        handleTask();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
        if (r1.equals(com.ap.zoloz.hummer.biz.HummerConstants.TASK_FINALIZE) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleTask() {
        /*
            r10 = this;
            com.ap.zoloz.hummer.common.HummerContext r0 = r10.mHummerContext
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ap.zoloz.hummer.common.ClientConfig r0 = r0.mClientConfig
            if (r0 == 0) goto L_0x01cd
            com.ap.zoloz.hummer.common.HummerContext r0 = r10.mHummerContext
            com.ap.zoloz.hummer.common.ClientConfig r0 = r0.mClientConfig
            java.util.ArrayList<com.ap.zoloz.hummer.common.TaskConfig> r0 = r0.tasks
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0017
            goto L_0x01cd
        L_0x0017:
            com.ap.zoloz.hummer.common.HummerContext r0 = r10.mHummerContext
            int r1 = r10.mZorder
            com.ap.zoloz.hummer.common.TaskConfig r0 = r0.getTaskConfig(r1)
            if (r0 == 0) goto L_0x01cd
            java.lang.String r1 = r0.type
            if (r1 != 0) goto L_0x0027
            goto L_0x01cd
        L_0x0027:
            java.lang.String r1 = r0.type
            int r2 = r1.hashCode()
            r3 = -1825931416(0xffffffff932a7f68, float:-2.1519833E-27)
            r4 = 0
            java.lang.String r5 = "webTask"
            r6 = 2
            r7 = -1
            r8 = 1
            if (r2 == r3) goto L_0x0056
            r3 = -1190783428(0xffffffffb906163c, float:-1.2787519E-4)
            if (r2 == r3) goto L_0x004c
            r3 = 1223404281(0x48ebaaf9, float:482647.78)
            if (r2 == r3) goto L_0x0044
            goto L_0x0060
        L_0x0044:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0060
            r1 = 1
            goto L_0x0061
        L_0x004c:
            java.lang.String r2 = "nativeTask"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0060
            r1 = 2
            goto L_0x0061
        L_0x0056:
            java.lang.String r2 = "serverTask"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0060
            r1 = 0
            goto L_0x0061
        L_0x0060:
            r1 = -1
        L_0x0061:
            java.lang.String r2 = "HummerCore"
            java.lang.String r3 = "context"
            java.lang.String r9 = "currentTaskName"
            if (r1 == 0) goto L_0x017e
            if (r1 == r8) goto L_0x00ae
            if (r1 == r6) goto L_0x007f
            com.ap.zoloz.hummer.common.HummerContext r0 = r10.mHummerContext
            java.lang.String r1 = "Z7029"
            r0.recordSystemError(r2, r1)
            com.ap.zoloz.hummer.common.AlertManager r0 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r1 = r10.mIAlertManagerCallback
            r0.alertSystemError(r1)
            goto L_0x01cd
        L_0x007f:
            com.ap.zoloz.hummer.common.NativeTask r1 = new com.ap.zoloz.hummer.common.NativeTask
            r1.<init>()
            com.ap.zoloz.hummer.common.HummerContext r2 = r10.mHummerContext
            com.ap.zoloz.hummer.common.HummerCore$4 r4 = new com.ap.zoloz.hummer.common.HummerCore$4
            r4.<init>()
            r1.run(r2, r0, r4)
            com.ap.zoloz.hummer.common.HummerContext r2 = r10.mHummerContext
            if (r2 == 0) goto L_0x01cd
            r2.setCurrentTaskConfig(r0)
            com.ap.zoloz.hummer.common.HummerContext r2 = r10.mHummerContext
            java.lang.String r0 = r0.name
            r2.add(r9, r3, r0)
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r0 = r10.mTasks
            com.ap.zoloz.hummer.common.HummerContext r2 = r10.mHummerContext
            com.ap.zoloz.hummer.common.TaskConfig r2 = r2.getCurrentTaskConfig()
            int r2 = r2.index
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r1)
            return
        L_0x00ae:
            com.ap.zoloz.hummer.common.HummerContext r1 = r10.mHummerContext
            java.lang.String r2 = r0.name
            com.ap.zoloz.hummer.common.UIConfig r1 = r1.getCurrentUIConfig(r2)
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r2 = r10.mTasks
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0155
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r2 = r10.mTasks
            int r4 = r0.index
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L_0x0155
            int r2 = r10.mZorder
            com.ap.zoloz.hummer.common.HummerContext r4 = r10.mHummerContext
            com.ap.zoloz.hummer.common.TaskConfig r4 = r4.getCurrentTaskConfig()
            int r4 = r4.index
            if (r2 >= r4) goto L_0x013c
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r1 = r10.mTasks
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x016f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r6 = r10.mZorder
            if (r4 <= r6) goto L_0x00e2
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.ap.zoloz.hummer.common.HummerContext r6 = r10.mHummerContext
            com.ap.zoloz.hummer.common.TaskConfig r6 = r6.getCurrentTaskConfig()
            int r6 = r6.index
            if (r4 > r6) goto L_0x00e2
            java.lang.Object r4 = r2.getValue()
            com.ap.zoloz.hummer.common.TaskTracker r4 = (com.ap.zoloz.hummer.common.TaskTracker) r4
            com.ap.zoloz.hummer.common.TaskConfig r4 = r4.mTaskConfig
            java.lang.String r4 = r4.type
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e2
            java.lang.Object r2 = r2.getValue()
            com.ap.zoloz.hummer.common.WebTask r2 = (com.ap.zoloz.hummer.common.WebTask) r2
            java.lang.String r4 = r2.getUrl()
            boolean r4 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r4)
            if (r4 != 0) goto L_0x00e2
            com.ap.zoloz.hummer.common.WebPageManager r4 = com.ap.zoloz.hummer.common.WebPageManager.getInstance()
            java.lang.String r2 = r2.getUrl()
            r4.exitPage(r2)
            goto L_0x00e2
        L_0x013c:
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r2 = r10.mTasks
            int r4 = r10.mZorder
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            com.ap.zoloz.hummer.common.TaskTracker r2 = (com.ap.zoloz.hummer.common.TaskTracker) r2
            com.ap.zoloz.hummer.common.HummerContext r4 = r10.mHummerContext
            com.ap.zoloz.hummer.common.HummerCore$2 r5 = new com.ap.zoloz.hummer.common.HummerCore$2
            r5.<init>()
            r2.run(r4, r0, r1, r5)
            goto L_0x016f
        L_0x0155:
            com.ap.zoloz.hummer.common.WebTask r2 = new com.ap.zoloz.hummer.common.WebTask
            r2.<init>()
            com.ap.zoloz.hummer.common.HummerContext r4 = r10.mHummerContext
            com.ap.zoloz.hummer.common.HummerCore$3 r5 = new com.ap.zoloz.hummer.common.HummerCore$3
            r5.<init>()
            r2.run(r4, r0, r1, r5)
            java.util.Map<java.lang.Integer, com.ap.zoloz.hummer.common.TaskTracker> r1 = r10.mTasks
            int r4 = r0.index
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r4, r2)
        L_0x016f:
            com.ap.zoloz.hummer.common.HummerContext r1 = r10.mHummerContext
            if (r1 == 0) goto L_0x01cd
            r1.setCurrentTaskConfig(r0)
            com.ap.zoloz.hummer.common.HummerContext r1 = r10.mHummerContext
            java.lang.String r0 = r0.name
            r1.add(r9, r3, r0)
            return
        L_0x017e:
            java.lang.String r1 = r0.name
            int r5 = r1.hashCode()
            r6 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            if (r5 == r6) goto L_0x0198
            r6 = -668185961(0xffffffffd82c4a97, float:-7.5774544E14)
            if (r5 == r6) goto L_0x018f
            goto L_0x01a2
        L_0x018f:
            java.lang.String r5 = "realIdFinalize"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01a2
            goto L_0x01a3
        L_0x0198:
            java.lang.String r4 = "cancel"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x01a2
            r4 = 1
            goto L_0x01a3
        L_0x01a2:
            r4 = -1
        L_0x01a3:
            if (r4 == 0) goto L_0x01bc
            if (r4 == r8) goto L_0x01b8
            com.ap.zoloz.hummer.common.HummerContext r0 = r10.mHummerContext
            java.lang.String r1 = "Z7030"
            r0.recordSystemError(r2, r1)
            com.ap.zoloz.hummer.common.AlertManager r0 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r1 = r10.mIAlertManagerCallback
            r0.alertSystemError(r1)
            return
        L_0x01b8:
            r10.cancel()
            goto L_0x01bf
        L_0x01bc:
            r10.finalizeHummer()
        L_0x01bf:
            com.ap.zoloz.hummer.common.HummerContext r1 = r10.mHummerContext
            if (r1 == 0) goto L_0x01cd
            r1.setCurrentTaskConfig(r0)
            com.ap.zoloz.hummer.common.HummerContext r1 = r10.mHummerContext
            java.lang.String r0 = r0.name
            r1.add(r9, r3, r0)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.common.HummerCore.handleTask():void");
    }

    /* access modifiers changed from: private */
    public void handleTaskResult(int i) {
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, TAG);
            this.mHummerContext.add("nextIndex", HummerConstants.CONTEXT, Integer.valueOf(i));
            if (i == -1) {
                exit();
            } else if (i == 0 || i < -1) {
                this.mHummerContext.recordSystemError(TAG, HummerZCodeConstant.INCORRECT_TASK_INDEX_ERROR_CODE);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
            } else {
                this.mZorder = i;
                handleTask();
            }
        }
    }

    /* access modifiers changed from: private */
    public void exit() {
        HummerResponse hummerResponse = new HummerResponse();
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerResponse.hummerId = hummerContext.mHummerId;
            String str = (String) this.mHummerContext.query(HummerConstants.EKYC_STATUS);
            if (!StringUtil.isNullorEmpty(str)) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -202516509) {
                    if (hashCode != 578079082) {
                        if (hashCode == 982065527 && str.equals("Pending")) {
                            c = 2;
                        }
                    } else if (str.equals(HummerConstants.EKYC_FAIL)) {
                        c = 1;
                    }
                } else if (str.equals("Success")) {
                    c = 0;
                }
                if (c == 0) {
                    hummerResponse.code = 1000;
                } else if (c == 1) {
                    hummerResponse.code = 2006;
                } else if (c != 2) {
                    this.mHummerContext.recordSystemError(TAG, HummerZCodeConstant.KEY_PARAM_ERROR_CODE);
                    AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
                    return;
                } else {
                    hummerResponse.code = 3000;
                }
            } else if (this.mHummerContext.query(HummerConstants.ZIM_RESP) != null) {
                hummerResponse.code = ((Integer) this.mHummerContext.query(HummerConstants.ZIM_RESP)).intValue();
            } else {
                hummerResponse.code = 1003;
            }
            this.mHummerContext.add(HummerConstants.HUMMER_RESPONSE, HummerConstants.CONTEXT, hummerResponse);
            finish();
        }
    }

    /* access modifiers changed from: private */
    public void finish() {
        this.mZorder = 0;
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.setCurrentTaskConfig((TaskConfig) null);
        }
        WebPageManager.getInstance().exitSession();
        IHummerCoreCallback iHummerCoreCallback = this.mHummerCoreCallback;
        if (iHummerCoreCallback != null) {
            iHummerCoreCallback.onCompletion(this.mHummerContext);
        }
    }

    public void release() {
        this.mZorder = 0;
        for (TaskTracker release : this.mTasks.values()) {
            release.release();
        }
        this.mTasks.clear();
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.release();
            this.mHummerContext = null;
        }
        this.mHummerCoreCallback = null;
        this.mIAlertManagerCallback = null;
    }

    public void forceQuit() {
        HummerLogger.i("HummerCore forceQuit");
        this.mZorder = 0;
        for (TaskTracker forceQuit : this.mTasks.values()) {
            HummerLogger.i("HummerCore forceQuit task");
            forceQuit.forceQuit();
        }
        this.mTasks.clear();
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.forceQuit();
        }
    }

    /* access modifiers changed from: private */
    public void cancel() {
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            int cancelIndex = hummerContext.getCancelIndex();
            if (cancelIndex == 0) {
                this.mHummerContext.recordSystemError(TAG, HummerZCodeConstant.INVALID_CANCEL_INDEX);
                cancelExit();
                return;
            }
            RpcManager.getInstance().sendRpc(new IRpcCallback() {
                public void onCompletion(RpcResponse rpcResponse) {
                    HummerCore.this.cancelExit();
                }
            }, RpcManager.getInstance().formatRequest(this.mHummerContext, cancelIndex, false));
        }
    }

    /* access modifiers changed from: private */
    public void cancelExit() {
        WebPageManager.getInstance().exitSession();
        if (this.mHummerContext != null) {
            HummerResponse hummerResponse = new HummerResponse();
            hummerResponse.code = 1003;
            hummerResponse.hummerId = this.mHummerContext.mHummerId;
            this.mHummerContext.add(HummerConstants.HUMMER_RESPONSE, HummerConstants.CONTEXT, hummerResponse);
        }
        finish();
    }

    /* access modifiers changed from: private */
    public void finalizeHummer() {
        AlertManager.getInstance().showProgressDialog("", false, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
            }
        }, true);
        RpcManager instance = RpcManager.getInstance();
        AnonymousClass7 r1 = new IRpcCallback() {
            public void onCompletion(RpcResponse rpcResponse) {
                AlertManager.getInstance().dismissDialog();
                if (HummerCore.this.mHummerContext != null && rpcResponse != null) {
                    FactorNextResponse factorNextResponse = rpcResponse.factorNextResponse;
                    if (factorNextResponse == null || HummerConstants.NETWOTK_EXCEPTION.equals(rpcResponse.exception)) {
                        AlertManager.getInstance().alertNetworkError(HummerCore.this.mIAlertManagerCallback);
                    } else if ("exception".equals(rpcResponse.exception) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                        HummerCore.this.mHummerContext.recordSystemError(HummerCore.TAG, HummerZCodeConstant.RPC_ERROR_CODE);
                        AlertManager.getInstance().alertSystemError(HummerCore.this.mIAlertManagerCallback);
                    } else {
                        String str = factorNextResponse.versionToken;
                        if (!StringUtil.isNullorEmpty(str)) {
                            HummerCore.this.mHummerContext.add(HummerConstants.VERSION_TOKEN, HummerConstants.CONTEXT, str);
                        }
                        HummerCore.this.mHummerContext.overwriteZStack(rpcResponse.factorNextResponse.zStack);
                        FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                        if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                            HummerCore.this.mHummerContext.recordSystemError(HummerCore.TAG, factorNextResponseInner.retCodeSub);
                            AlertManager.getInstance().alertSystemError(HummerCore.this.mIAlertManagerCallback);
                            return;
                        }
                        if (factorNextResponse.response.get(0).outParams != null) {
                            for (Map.Entry next : factorNextResponse.response.get(0).outParams.entrySet()) {
                                HummerCore.this.mHummerContext.add((String) next.getKey(), HummerConstants.SERVER_RESPONSE, next.getValue());
                            }
                        }
                        HummerCore.this.exit();
                    }
                }
            }
        };
        RpcManager instance2 = RpcManager.getInstance();
        HummerContext hummerContext = this.mHummerContext;
        instance.sendRpc(r1, instance2.formatRequest(hummerContext, ((Integer) hummerContext.query("nextIndex")).intValue(), true));
    }
}
