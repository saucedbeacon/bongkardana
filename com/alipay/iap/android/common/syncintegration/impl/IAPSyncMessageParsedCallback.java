package com.alipay.iap.android.common.syncintegration.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class IAPSyncMessageParsedCallback implements IAPSyncCallback {
    private static final String TAG = "sync_MessageParsedCallback";

    /* access modifiers changed from: protected */
    public boolean logSyncMessageContent() {
        return true;
    }

    public void onReceiveCommand(@NonNull IAPSyncCommand iAPSyncCommand) {
    }

    /* access modifiers changed from: protected */
    public abstract void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list);

    public void onReceiveMessage(@NonNull IAPSyncMessage iAPSyncMessage) {
        LoggerWrapper.d(TAG, String.format("[%s] Receive-SYNC: %s", new Object[]{iAPSyncMessage.biz, iAPSyncMessage.msgData}));
        List<String> syncMessages = getSyncMessages(iAPSyncMessage.msgData, logSyncMessageContent());
        if (syncMessages != null && !syncMessages.isEmpty()) {
            onReceiveParsedSyncMessage(iAPSyncMessage, iAPSyncMessage.biz, syncMessages);
        }
    }

    @Nullable
    public static List<String> getSyncMessages(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has(RVParams.PREFETCH_LOCATION)) {
                    String optString = optJSONObject.optString(RVParams.PREFETCH_LOCATION);
                    if (!TextUtils.isEmpty(optString)) {
                        if ("1".equals(optJSONObject.optString("isB"))) {
                            optString = new String(Base64.decode(optString, 0));
                        }
                        if (z) {
                            LoggerWrapper.d(TAG, String.format("sync[%s]: %s", new Object[]{String.valueOf(i), optString}));
                        }
                        arrayList.add(optString);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("getSyncMessages");
            sb.append(e.getMessage());
            LoggerWrapper.w(TAG, sb.toString());
            return null;
        }
    }
}
