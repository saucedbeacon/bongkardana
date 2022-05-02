package com.ap.zoloz.hummer.common;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMFacadeBuilder;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import com.ap.zoloz.hummer.rpc.IRpcCallback;
import com.ap.zoloz.hummer.rpc.RpcManager;
import com.ap.zoloz.hummer.rpc.RpcResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NativeTask extends TaskTracker {
    public static final String TAG = "NativeTask";
    /* access modifiers changed from: private */
    public boolean isZimDestroyed;
    /* access modifiers changed from: private */
    public ZIMFacade mZimFacade;
    /* access modifiers changed from: private */
    public int nextIndexFromValidate;

    public void run(HummerContext hummerContext, TaskConfig taskConfig, UIConfig uIConfig, ITaskTrackerCallback iTaskTrackerCallback) {
    }

    public void run(HummerContext hummerContext, final TaskConfig taskConfig, ITaskTrackerCallback iTaskTrackerCallback) {
        this.isLive = true;
        this.mITaskTrackerCallback = iTaskTrackerCallback;
        this.mTaskConfig = taskConfig;
        if (taskConfig != null && hummerContext != null) {
            this.mHummerContext = hummerContext;
            this.mHummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, taskConfig.name);
            this.mIAlertManagerCallback = new IAlertManagerCallback() {
                public void onHandelSystemError() {
                    NativeTask.this.handleSystemError(taskConfig);
                }

                public void onHandelNetworkError(boolean z) {
                    if (z) {
                        NativeTask.this.next();
                    } else if (NativeTask.this.mHummerContext != null) {
                        NativeTask.this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.NETWORK_BAD);
                        NativeTask.this.mITaskTrackerCallback.onCompletion(NativeTask.this.mHummerContext, -1);
                    }
                }
            };
            if (!taskConfig.inputParams.containsKey(HummerConstants.ZIM_ID)) {
                this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.ZIM_ID_KEY_ERROR_CODE);
                this.mHummerContext.recordSystemError(taskConfig.name, HummerZCodeConstant.ZIM_ID_KEY_ERROR_CODE);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
                return;
            }
            String str = (String) this.mHummerContext.query(String.valueOf(((Map) taskConfig.inputParams.get(HummerConstants.ZIM_ID)).get("value")));
            if (StringUtil.isNullorEmpty(str)) {
                this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.ZIMID_ERROR_CODE);
                this.mHummerContext.recordSystemError(taskConfig.name, HummerZCodeConstant.ZIMID_ERROR_CODE);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
            } else if (!taskConfig.inputParams.containsKey("zimInitResp")) {
                this.mHummerContext.updateZStack(taskConfig.name, HummerZCodeConstant.ZIM_INIT_RESP_ERROR);
                this.mHummerContext.recordSystemError(taskConfig.name, HummerZCodeConstant.ZIM_INIT_RESP_ERROR);
                AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
            } else {
                String valueOf = String.valueOf(this.mHummerContext.query(String.valueOf(((Map) taskConfig.inputParams.get("zimInitResp")).get("value"))));
                HashMap hashMap = new HashMap();
                hashMap.put(HummerConstants.PROD_NAME, this.mTaskConfig.name);
                hashMap.put(HummerConstants.ZIM_ID, str);
                RecordManager.getInstance().record(HummerConstants.ZPROD_INIT, hashMap);
                this.mZimFacade = ZIMFacadeBuilder.create(this.mHummerContext.mContext);
                this.isZimDestroyed = false;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("zimInitResp", valueOf);
                if (taskConfig.inputParams.get(HummerConstants.VALIDATE_DELEGATE) == null || !((Boolean) ((Map) taskConfig.inputParams.get(HummerConstants.VALIDATE_DELEGATE)).get("value")).booleanValue()) {
                    doZimTask(str, hashMap2, (ZimMessageChannel) null);
                } else {
                    doZimTask(str, hashMap2, new ZimMessageChannel() {
                        public void onAction(Bundle bundle, final ZimMessageChannelCallback zimMessageChannelCallback) {
                            String string = bundle.getString("requestData");
                            NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, HummerZCodeConstant.CAPTURE_SUCCESS);
                            if (NativeTask.this.mHummerContext != null) {
                                NativeTask.this.mHummerContext.add(HummerConstants.VALIDATE_REQUEST, HummerConstants.ARGUMENT, string);
                                NativeTask.this.mHummerContext.updateRpcIndexList();
                                RpcManager.getInstance().sendRpc(new IRpcCallback() {
                                    public void onCompletion(RpcResponse rpcResponse) {
                                        if (NativeTask.this.mHummerContext != null && rpcResponse != null) {
                                            Bundle bundle = new Bundle();
                                            FactorNextResponse factorNextResponse = rpcResponse.factorNextResponse;
                                            if (factorNextResponse == null || HummerConstants.NETWOTK_EXCEPTION.equals(rpcResponse.exception)) {
                                                bundle.putString(ZimMessageChannel.K_RPC_RES, (String) null);
                                                bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, 3000);
                                                zimMessageChannelCallback.onResult(bundle);
                                            } else if ("exception".equals(rpcResponse.exception) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                                                NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, HummerZCodeConstant.RPC_ERROR_CODE);
                                                NativeTask.this.mHummerContext.recordSystemError(NativeTask.this.mTaskConfig.name, HummerZCodeConstant.RPC_ERROR_CODE);
                                                if (NativeTask.this.mZimFacade != null) {
                                                    NativeTask.this.mZimFacade.command(4099);
                                                    NativeTask.this.mZimFacade.destroy();
                                                    ZIMFacade unused = NativeTask.this.mZimFacade = null;
                                                }
                                                NativeTask.this.isLive = false;
                                                if (NativeTask.this.mTaskConfig != null) {
                                                    NativeTask.this.handleSystemError(NativeTask.this.mTaskConfig);
                                                }
                                            } else if ("SYSTEM_ERROR".equals(factorNextResponse.response.get(0).retCode) || factorNextResponse.response.get(0).outParams == null || !factorNextResponse.response.get(0).outParams.containsKey(HummerConstants.VALIDATE_RESPONSE)) {
                                                NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                                                NativeTask.this.mHummerContext.recordSystemError(NativeTask.this.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                                                if (NativeTask.this.mZimFacade != null) {
                                                    NativeTask.this.mZimFacade.command(4099);
                                                    NativeTask.this.mZimFacade.destroy();
                                                    ZIMFacade unused2 = NativeTask.this.mZimFacade = null;
                                                }
                                                NativeTask.this.isLive = false;
                                                if (factorNextResponse.nextIndex.intValue() != 0) {
                                                    int unused3 = NativeTask.this.nextIndexFromValidate = factorNextResponse.nextIndex.intValue();
                                                }
                                                if (NativeTask.this.mTaskConfig != null) {
                                                    NativeTask.this.handleSystemError(NativeTask.this.mTaskConfig);
                                                }
                                            } else {
                                                String str = factorNextResponse.versionToken;
                                                if (!StringUtil.isNullorEmpty(str)) {
                                                    NativeTask.this.mHummerContext.add(HummerConstants.VERSION_TOKEN, HummerConstants.CONTEXT, str);
                                                }
                                                int unused4 = NativeTask.this.nextIndexFromValidate = factorNextResponse.nextIndex.intValue();
                                                NativeTask.this.mHummerContext.overwriteZStack(rpcResponse.factorNextResponse.zStack);
                                                for (int i = 0; i < factorNextResponse.response.size(); i++) {
                                                    if (factorNextResponse.response.get(i).outParams != null) {
                                                        for (Map.Entry next : factorNextResponse.response.get(i).outParams.entrySet()) {
                                                            NativeTask.this.mHummerContext.add((String) next.getKey(), HummerConstants.SERVER_RESPONSE, next.getValue());
                                                        }
                                                    }
                                                }
                                                String str2 = (String) factorNextResponse.response.get(0).outParams.get(HummerConstants.VALIDATE_RESPONSE);
                                                if ("SYSTEM_SUCCESS".equals(factorNextResponse.response.get(0).retCode)) {
                                                    bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, 1000);
                                                } else if (HummerConstants.VERIFY_RETRY.equals(factorNextResponse.response.get(0).retCode) || HummerConstants.VERIFY_NEXT.equals(factorNextResponse.response.get(0).retCode)) {
                                                    bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, 3000);
                                                } else if (HummerConstants.VERIFY_FAILED.equals(factorNextResponse.response.get(0).retCode)) {
                                                    bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, 2006);
                                                }
                                                bundle.putString(ZimMessageChannel.K_RPC_RES, str2);
                                                zimMessageChannelCallback.onResult(bundle);
                                            }
                                        }
                                    }
                                }, RpcManager.getInstance().formatRequest(NativeTask.this.mHummerContext, NativeTask.this.mHummerContext.getNextIndex(HummerConstants.HUMMER_VALIDATE), false));
                            }
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void handleSystemError(TaskConfig taskConfig) {
        if (this.nextIndexFromValidate != 0) {
            this.mITaskTrackerCallback.onCompletion(this.mHummerContext, this.nextIndexFromValidate);
            return;
        }
        int i = -1;
        if (taskConfig.navigateConfig.containsKey("error")) {
            i = ((Integer) ((Map) taskConfig.navigateConfig.get("error")).get("index")).intValue();
        }
        this.mITaskTrackerCallback.onCompletion(this.mHummerContext, i);
    }

    private void doZimTask(final String str, HashMap<String, String> hashMap, ZimMessageChannel zimMessageChannel) {
        this.mZimFacade.verify(str, (Map<String, String>) hashMap, zimMessageChannel, (ZIMCallback) new ZIMCallback() {
            public boolean response(ZIMResponse zIMResponse) {
                int i;
                if (NativeTask.this.mHummerContext == null) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(NativeTask.TAG);
                sb.append(zIMResponse.toString());
                HummerLogger.i(sb.toString());
                if (NativeTask.this.mTaskConfig != null) {
                    boolean z = false;
                    boolean z2 = NativeTask.this.mTaskConfig.inputParams.get(HummerConstants.VALIDATE_DELEGATE) != null && ((Boolean) ((Map) NativeTask.this.mTaskConfig.inputParams.get(HummerConstants.VALIDATE_DELEGATE)).get("value")).booleanValue();
                    HashMap hashMap = new HashMap();
                    hashMap.put(HummerConstants.PROD_RET_CODE, String.valueOf(zIMResponse.code));
                    hashMap.put(HummerConstants.PROD_SUB_RET_CODE, zIMResponse.subCode);
                    hashMap.put(HummerConstants.PROD_NAME, NativeTask.this.mTaskConfig.name);
                    hashMap.put(HummerConstants.ZIM_ID, str);
                    RecordManager.getInstance().record(HummerConstants.ZPROD_RESULT, hashMap);
                    String str = null;
                    int i2 = zIMResponse.code;
                    if (i2 == 1000) {
                        if (!z2) {
                            NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, zIMResponse.subCode);
                            str = "next";
                        }
                        if (NativeTask.this.mTaskConfig.navigateConfig != null && NativeTask.this.mTaskConfig.navigateConfig.containsKey("next")) {
                            NativeTask nativeTask = NativeTask.this;
                            nativeTask.addOutputParam(nativeTask.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get("next")).get(HummerConstants.OUTPUT_PARAM), zIMResponse.extInfo);
                        }
                    } else if (i2 == 1001) {
                        if (!StringUtil.isNullorEmpty(zIMResponse.subCode)) {
                            NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, zIMResponse.subCode);
                            NativeTask.this.mHummerContext.recordSystemError(NativeTask.this.mTaskConfig.name, zIMResponse.subCode);
                        }
                        AlertManager.getInstance().alertSystemError(NativeTask.this.mIAlertManagerCallback);
                        z = true;
                    } else if (i2 != 2006) {
                        NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, zIMResponse.subCode);
                        if (NativeTask.this.mTaskConfig.navigateConfig != null && NativeTask.this.mTaskConfig.navigateConfig.containsKey("back")) {
                            NativeTask nativeTask2 = NativeTask.this;
                            nativeTask2.addOutputParam(nativeTask2.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get("back")).get(HummerConstants.OUTPUT_PARAM), zIMResponse.extInfo);
                        }
                        str = "back";
                    } else {
                        if (!z2) {
                            NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, zIMResponse.subCode);
                            str = "fail";
                        }
                        if (NativeTask.this.mTaskConfig.navigateConfig != null && NativeTask.this.mTaskConfig.navigateConfig.containsKey("fail")) {
                            NativeTask nativeTask3 = NativeTask.this;
                            nativeTask3.addOutputParam(nativeTask3.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get("fail")).get(HummerConstants.OUTPUT_PARAM), zIMResponse.extInfo);
                        }
                    }
                    if (NativeTask.this.mTaskConfig.inputParams.get("useDefaultExit") != null && ((Boolean) ((Map) NativeTask.this.mTaskConfig.inputParams.get("useDefaultExit")).get("value")).booleanValue()) {
                        i = -1;
                        NativeTask.this.mHummerContext.add(HummerConstants.ZIM_RESP, HummerConstants.CONTEXT, Integer.valueOf(zIMResponse.code));
                    } else if (!StringUtil.isNullorEmpty(str)) {
                        i = NativeTask.this.mHummerContext.getNextIndex(str);
                    } else {
                        i = NativeTask.this.nextIndexFromValidate;
                    }
                    if (!StringUtil.isNullorEmpty(str) && NativeTask.this.mHummerContext.needRPC(str)) {
                        NativeTask.this.mHummerContext.add("nextIndex", HummerConstants.CONTEXT, Integer.valueOf(i));
                        NativeTask.this.next();
                    } else if (!z && NativeTask.this.mITaskTrackerCallback != null) {
                        NativeTask.this.mITaskTrackerCallback.onCompletion(NativeTask.this.mHummerContext, i);
                    }
                }
                boolean unused = NativeTask.this.isZimDestroyed = true;
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public void next() {
        if (this.mHummerContext != null && this.mHummerContext.mContext != null) {
            this.mHummerContext.updateRpcIndexList();
            RpcManager.getInstance().sendRpc(new IRpcCallback() {
                public void onCompletion(RpcResponse rpcResponse) {
                    if (NativeTask.this.mHummerContext != null && rpcResponse != null) {
                        FactorNextResponse factorNextResponse = rpcResponse.factorNextResponse;
                        if (factorNextResponse == null || HummerConstants.NETWOTK_EXCEPTION.equals(rpcResponse.exception)) {
                            AlertManager.getInstance().alertNetworkError(NativeTask.this.mIAlertManagerCallback);
                        } else if ("exception".equals(rpcResponse.exception) || factorNextResponse.response == null || factorNextResponse.response.size() <= 0) {
                            NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, HummerZCodeConstant.RPC_ERROR_CODE);
                            NativeTask.this.mHummerContext.recordSystemError(NativeTask.this.mTaskConfig.name, HummerZCodeConstant.RPC_ERROR_CODE);
                            AlertManager.getInstance().alertSystemError(NativeTask.this.mIAlertManagerCallback);
                        } else {
                            String str = factorNextResponse.versionToken;
                            if (!StringUtil.isNullorEmpty(str)) {
                                NativeTask.this.mHummerContext.add(HummerConstants.VERSION_TOKEN, HummerConstants.CONTEXT, str);
                            }
                            NativeTask.this.mHummerContext.overwriteZStack(rpcResponse.factorNextResponse.zStack);
                            FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                            if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                                NativeTask.this.mHummerContext.updateZStack(NativeTask.this.mTaskConfig.name, factorNextResponseInner.retCodeSub);
                                NativeTask.this.mHummerContext.recordSystemError(HummerConstants.SERVER_TASK, factorNextResponseInner.retCodeSub);
                                AlertManager.getInstance().alertSystemError(NativeTask.this.mIAlertManagerCallback);
                                return;
                            }
                            for (int i = 0; i < factorNextResponse.response.size(); i++) {
                                if (factorNextResponse.response.get(i).outParams != null) {
                                    for (Map.Entry next : factorNextResponse.response.get(i).outParams.entrySet()) {
                                        NativeTask.this.mHummerContext.add((String) next.getKey(), HummerConstants.SERVER_RESPONSE, next.getValue());
                                    }
                                }
                            }
                            NativeTask.this.mITaskTrackerCallback.onCompletion(NativeTask.this.mHummerContext, factorNextResponse.nextIndex.intValue());
                        }
                    }
                }
            }, RpcManager.getInstance().formatRequest(this.mHummerContext, ((Integer) this.mHummerContext.query("nextIndex")).intValue(), true));
        }
    }

    /* access modifiers changed from: private */
    public void addOutputParam(HummerContext hummerContext, JSONObject jSONObject, Map<String, String> map) {
        if (jSONObject != null) {
            Iterator<Object> it = jSONObject.values().iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                String str = (String) jSONObject2.get(HummerConstants.PIPE_TYPE);
                String str2 = (String) jSONObject2.get("value");
                if (map.get(str2) != null) {
                    hummerContext.add(str2, str, map.get(str2));
                }
            }
        }
    }

    public void forceQuit() {
        if (this.mZimFacade != null && !this.isZimDestroyed && this.isLive) {
            if (this.mTaskConfig != null) {
                StringBuilder sb = new StringBuilder("NativeTask ");
                sb.append(this.mTaskConfig.name);
                sb.append(" forceQuit");
                HummerLogger.i(sb.toString());
                HashMap hashMap = new HashMap();
                StringBuilder sb2 = new StringBuilder("force quit zim ");
                sb2.append(this.mTaskConfig.name);
                hashMap.put("extInfo", sb2.toString());
                RecordManager.getInstance().record("techSeed", hashMap);
            }
            this.mZimFacade.command(4099);
            this.mZimFacade.destroy();
            this.mZimFacade = null;
            this.isLive = false;
        }
    }
}
