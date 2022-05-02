package com.alipay.multigateway.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.multigateway.sdk.GatewayInfo;
import com.alipay.multigateway.sdk.adapter.signature.SignatureManager;
import com.alipay.multigateway.sdk.decision.GatewayDecisionHelper;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import com.alipay.multigateway.sdk.decision.condition.getter.IGetter;
import com.alipay.multigateway.sdk.decision.condition.getter.impl.OperationTypeGetter;
import java.util.ArrayList;
import java.util.List;

public class GatewayController {
    private static final String TAG = "GatewayController";
    /* access modifiers changed from: private */
    public GatewayCallback callback;
    private GatewayCallback<Object> callbackWrap = new GatewayCallback<Object>() {
        public void onAfterGatewayApply(GatewayInfo gatewayInfo, Object obj) {
            if (GatewayController.this.callback != null) {
                try {
                    GatewayController.this.callback.onAfterGatewayApply(gatewayInfo, obj);
                } catch (Throwable th) {
                    LoggerWrapper.e(GatewayController.TAG, "callbackWrap onAfterGatewayApply occur exception.", th);
                }
            }
        }

        public void onNoRuleMatch(Object obj) {
            if (GatewayController.this.callback != null) {
                try {
                    GatewayController.this.callback.onNoRuleMatch(obj);
                } catch (Throwable th) {
                    LoggerWrapper.e(GatewayController.TAG, "callbackWrap onNoRuleMatch occur exception.", th);
                }
            }
        }

        public boolean shouldApplyGateway(GatewayInfo gatewayInfo, Object obj) {
            if (GatewayController.this.callback == null) {
                return true;
            }
            try {
                return GatewayController.this.callback.shouldApplyGateway(gatewayInfo, obj);
            } catch (Throwable th) {
                LoggerWrapper.e(GatewayController.TAG, "callbackWrap shouldApplyGateway occur exception.", th);
                return true;
            }
        }

        public String getPlaintextForSign(GatewayInfo gatewayInfo, Object obj) {
            if (GatewayController.this.callback == null) {
                return null;
            }
            try {
                return GatewayController.this.callback.getPlaintextForSign(gatewayInfo, obj);
            } catch (Throwable th) {
                LoggerWrapper.e(GatewayController.TAG, "callbackWrap getPlaintextForSign occur exception.", th);
                return null;
            }
        }
    };
    private NetworkDelegate delegate;
    private GatewayDecisionHelper gatewayDecisionHelper;
    private SignatureManager signatureManager;
    private ConditionValueGetter valueGetter;

    public void init(@NonNull Context context, @NonNull NetworkDelegate networkDelegate) {
        this.delegate = networkDelegate;
        ConditionValueGetter conditionValueGetter = new ConditionValueGetter();
        this.valueGetter = conditionValueGetter;
        this.gatewayDecisionHelper = new GatewayDecisionHelper(conditionValueGetter);
        this.signatureManager = new SignatureManager();
        addValueGetter(Condition.TYPE_OPERATION_TYPE, new OperationTypeGetter());
    }

    public void replaceRules(@NonNull List<Rule> list) {
        this.gatewayDecisionHelper.replaceRules(list);
    }

    public void addRules(@NonNull List<Rule> list) {
        this.gatewayDecisionHelper.addRules(list);
    }

    public void addRule(@NonNull Rule rule) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(rule);
        addRules(arrayList);
    }

    public void setCallback(@NonNull GatewayCallback gatewayCallback) {
        this.callback = gatewayCallback;
    }

    public void addValueGetter(@NonNull String str, @NonNull IGetter iGetter) {
        this.valueGetter.addGetter(str, iGetter);
    }

    public NetworkDelegate getDelegate() {
        return this.delegate;
    }

    public void processRequest(@NonNull Object obj) {
        GatewayInfo decide = this.gatewayDecisionHelper.decide(obj);
        if (decide == null) {
            LoggerWrapper.i(TAG, "no gateway found");
            this.callbackWrap.onNoRuleMatch(obj);
        } else if (!this.callbackWrap.shouldApplyGateway(decide, obj)) {
            StringBuilder sb = new StringBuilder("Ignore gateway from user, ");
            sb.append(decide.getTargetUrl());
            LoggerWrapper.i(TAG, sb.toString());
        } else {
            GatewayInfo.SignInfo signInfo = decide.signInfo;
            if (signInfo != null) {
                LoggerWrapper.i(TAG, "start sign request");
                String signRequest = this.signatureManager.signRequest(this.callbackWrap.getPlaintextForSign(decide, obj), signInfo);
                LoggerWrapper.i(TAG, "content signed, add to request: sign = ".concat(String.valueOf(signRequest)));
                decide = decide.clone();
                this.signatureManager.setSignatureToGatewayInfo(signRequest, decide);
                LoggerWrapper.i(TAG, "added signature to request");
            }
            this.delegate.setGatewayInfo(decide, obj);
            this.callbackWrap.onAfterGatewayApply(decide, obj);
        }
    }
}
