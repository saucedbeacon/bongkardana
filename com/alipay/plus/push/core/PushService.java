package com.alipay.plus.push.core;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.plus.push.core.model.PushMessage;
import com.alipay.plus.push.core.net.IPushApiProxy;
import com.alipay.plus.push.core.pushservice.IPushService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class PushService implements IPushService {
    private final String FILED_BIZ_TYPE = "bizType";
    private final String FILED_DATA = "data";
    private String apiSignature;
    private String appKey;
    protected boolean autoReport = false;
    private List<ComponentDescription> componentDescriptions = new LinkedList();
    private PushMessageReceiver<String> globalPushMessageReceiver;
    private IPushApiProxy iPushApiProxy;

    public abstract String getPushToken();

    public abstract void init(Context context);

    public void resumePush() {
    }

    public void stopPush() {
    }

    public synchronized void registerGlobalMsgReceiver(PushMessageReceiver<String> pushMessageReceiver) {
        this.globalPushMessageReceiver = pushMessageReceiver;
    }

    public synchronized void unregisterMsgReceiver(PushMessageReceiver pushMessageReceiver) {
        Iterator<ComponentDescription> it = this.componentDescriptions.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getReceiveCallback() == pushMessageReceiver) {
                    this.componentDescriptions.remove(pushMessageReceiver);
                    break;
                }
            } else {
                break;
            }
        }
        if (pushMessageReceiver != null && pushMessageReceiver == this.globalPushMessageReceiver) {
            this.globalPushMessageReceiver = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerMsgReceiver(java.lang.String r4, com.alipay.plus.push.core.PushMessageReceiver r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x000f
            goto L_0x0041
        L_0x000f:
            r0 = 0
            java.util.List<com.alipay.plus.push.core.ComponentDescription> r1 = r3.componentDescriptions     // Catch:{ all -> 0x0043 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0043 }
            com.alipay.plus.push.core.ComponentDescription r2 = (com.alipay.plus.push.core.ComponentDescription) r2     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.getBizType()     // Catch:{ all -> 0x0043 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0016
            r0 = 1
        L_0x002d:
            if (r0 != 0) goto L_0x003f
            com.alipay.plus.push.core.ComponentDescription r0 = new com.alipay.plus.push.core.ComponentDescription     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            r0.setBizType(r4)     // Catch:{ all -> 0x0043 }
            r0.setReceiveCallback(r5)     // Catch:{ all -> 0x0043 }
            java.util.List<com.alipay.plus.push.core.ComponentDescription> r4 = r3.componentDescriptions     // Catch:{ all -> 0x0043 }
            r4.add(r0)     // Catch:{ all -> 0x0043 }
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0047
        L_0x0046:
            throw r4
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.push.core.PushService.registerMsgReceiver(java.lang.String, com.alipay.plus.push.core.PushMessageReceiver):void");
    }

    public PushMessageReceiver getPushDataReceiveCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (ComponentDescription next : this.componentDescriptions) {
            if (next.getBizType().equalsIgnoreCase(str)) {
                return next.getReceiveCallback();
            }
        }
        return null;
    }

    public void dispatchMessage(Object obj) {
        if (obj != null) {
            if (obj instanceof PushMessage) {
                dispatch(((PushMessage) obj).getExtras());
            } else if (obj instanceof Map) {
                dispatch((Map) obj);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|(2:9|(1:11)(2:12|(3:14|15|(1:23)(2:19|(1:21)(1:22)))))|24|25|(1:33)(2:28|30)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dispatch(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            java.lang.Object r1 = r6.get(r0)     // Catch:{ Exception -> 0x007f }
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x0074
            int r1 = r6.size()     // Catch:{ Exception -> 0x007f }
            if (r1 <= 0) goto L_0x0074
            java.lang.String r1 = "bizType"
            java.lang.Object r6 = r6.get(r1)     // Catch:{ Exception -> 0x007f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x007f }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x0026
            return
        L_0x0026:
            com.alipay.plus.push.core.PushMessageReceiver r6 = r5.getPushDataReceiveCallback(r6)     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x0074
            java.lang.Class r1 = r6.getClass()     // Catch:{ Exception -> 0x0074 }
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()     // Catch:{ Exception -> 0x0074 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0074 }
            if (r2 <= 0) goto L_0x006d
            r2 = 0
            r3 = r1[r2]     // Catch:{ Exception -> 0x0074 }
            boolean r3 = r3 instanceof java.lang.reflect.ParameterizedType     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x006d
            r1 = r1[r2]     // Catch:{ Exception -> 0x0074 }
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch:{ Exception -> 0x0074 }
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()     // Catch:{ Exception -> 0x0074 }
            r1 = r1[r2]     // Catch:{ Exception -> 0x0074 }
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ Exception -> 0x0074 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0074 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0074 }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0063
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0074 }
            r6.onMessageReceived(r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0074
        L_0x0063:
            com.alibaba.fastjson.parser.Feature[] r2 = new com.alibaba.fastjson.parser.Feature[r2]     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, (java.lang.reflect.Type) r1, (com.alibaba.fastjson.parser.Feature[]) r2)     // Catch:{ Exception -> 0x0074 }
            r6.onMessageReceived(r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0074
        L_0x006d:
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0074 }
            r6.onMessageReceived(r1)     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            com.alipay.plus.push.core.PushMessageReceiver<java.lang.String> r6 = r5.globalPushMessageReceiver     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007f
            com.alipay.plus.push.core.PushMessageReceiver<java.lang.String> r6 = r5.globalPushMessageReceiver     // Catch:{ Exception -> 0x007f }
            r6.onMessageReceived(r0)     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.push.core.PushService.dispatch(java.util.Map):void");
    }

    public void autoReport(boolean z) {
        this.autoReport = z;
    }
}
