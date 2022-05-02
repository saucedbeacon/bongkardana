package com.alipay.plus.android.ab.sdk.trigger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.plus.android.ab.sdk.AbTestingContext;
import com.alipay.plus.android.ab.sdk.monitor.AbTestingMonitor;
import com.alipay.plus.android.config.sdk.a.e;
import java.util.List;
import java.util.Map;

public class AbTestingSyncTrigger extends AbTestingTrigger {
    protected static final String AB_VARIATION_SYNC_BIZ_ID = "ABTESTING";

    /* renamed from: a  reason: collision with root package name */
    private static final String f10731a = e.a("AbTestingSyncTrigger");
    @NonNull
    protected IAPSyncProvider mSyncProvider;

    public AbTestingSyncTrigger() {
        this.mSyncProvider = new SyncProvider();
    }

    public AbTestingSyncTrigger(@NonNull IAPSyncProvider iAPSyncProvider) {
        this.mSyncProvider = iAPSyncProvider;
    }

    /* access modifiers changed from: private */
    public void a(@NonNull List<String> list) {
        for (String next : list) {
            JSONObject jSONObject = null;
            try {
                jSONObject = JSONObject.parseObject(next);
            } catch (JSONException e) {
                String str = f10731a;
                StringBuilder sb = new StringBuilder("Cannot parse config sync message to JSONObject! ");
                sb.append(e.getMessage());
                LoggerWrapper.w(str, sb.toString());
            }
            if (jSONObject != null) {
                LoggerWrapper.d(f10731a, String.format("Receive sync message: %s! will update AB Variation now!", new Object[]{next}));
                String string = jSONObject.getString("source");
                String string2 = jSONObject.getString("content");
                if (!TextUtils.isEmpty(string)) {
                    updateABVariation(string, string2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerSyncReceiver(@NonNull final AbTestingContext abTestingContext) {
        this.mSyncProvider.registerReceiveCallback(AB_VARIATION_SYNC_BIZ_ID, new IAPSyncMessageParsedCallback() {
            public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
                if (TextUtils.equals(str, AbTestingSyncTrigger.AB_VARIATION_SYNC_BIZ_ID)) {
                    AbTestingSyncTrigger.this.a(list);
                    abTestingContext.getAbTestingMonitor().behavior(AbTestingMonitor.Events.AB_SYNC_GETDATA, (Map<String, String>) null);
                }
            }
        });
    }

    public void startTrigger(@NonNull AbTestingContext abTestingContext) {
        LoggerWrapper.d(f10731a, "startTrigger.");
        registerSyncReceiver(abTestingContext);
    }
}
