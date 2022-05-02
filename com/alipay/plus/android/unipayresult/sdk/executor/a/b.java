package com.alipay.plus.android.unipayresult.sdk.executor.a;

import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClient;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClientContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9522a;
    private Map<String, List<a>> b = new HashMap();
    private IAPSyncCallback c = new IAPSyncMessageParsedCallback() {
        public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
            LoggerWrapper.e("UnifierSyncCenter", String.format("Receive pay result sync message!\nmessageId = %s, userId = %s, biz = %s, message = %s", new Object[]{iAPSyncMessage.messageId, iAPSyncMessage.userId, iAPSyncMessage.biz, iAPSyncMessage.msgData}));
            b.this.a(list);
        }
    };

    public interface a {
        void handleSyncMessage(@NonNull List<String> list);
    }

    /* access modifiers changed from: private */
    public void a(@NonNull List<String> list) {
        Map<String, List<String>> a2 = a.a(list);
        if (a2.isEmpty()) {
            LoggerWrapper.e("UnifierSyncCenter", "Cannot parse sync orders!");
            return;
        }
        synchronized (this) {
            for (Map.Entry next : a2.entrySet()) {
                String str = (String) next.getKey();
                List<a> list2 = this.b.get(str);
                if (list2 == null) {
                    LoggerWrapper.e("UnifierSyncCenter", String.format("Skip sync order info! bizType = %s.", new Object[]{str}));
                } else {
                    for (a handleSyncMessage : list2) {
                        handleSyncMessage.handleSyncMessage((List) next.getValue());
                    }
                }
            }
        }
    }

    private IAPSyncProvider b() {
        String str;
        UnifierQueryClientContext clientContext = UnifierQueryClient.getInstance().getClientContext();
        if (clientContext == null) {
            str = "Cannot start sync executor! you must initialize UnifierQueryClient first!";
        } else if (clientContext.mSyncProvider != null) {
            return clientContext.mSyncProvider;
        } else {
            str = "Cannot start sync executor! you must provide ISyncProvider!";
        }
        LoggerWrapper.e("UnifierSyncCenter", str);
        return null;
    }

    public void a() {
        IAPSyncProvider b2;
        if (!this.f9522a && (b2 = b()) != null) {
            this.f9522a = true;
            b2.registerReceiveCallback("UNI-RESULT-PAGE", this.c);
        }
    }

    public synchronized void a(String str, a aVar) {
        List list = this.b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.b.put(str, list);
        }
        list.add(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(java.lang.String r2, com.alipay.plus.android.unipayresult.sdk.executor.a.b.a r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.List<com.alipay.plus.android.unipayresult.sdk.executor.a.b$a>> r0 = r1.b     // Catch:{ all -> 0x0019 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0019 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0017
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r2.remove(r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.unipayresult.sdk.executor.a.b.b(java.lang.String, com.alipay.plus.android.unipayresult.sdk.executor.a.b$a):void");
    }
}
