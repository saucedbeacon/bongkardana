package com.alipay.mobile.rome.syncservice.up;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.alipay.mobile.rome.longlinkservice.ISyncUpCallback;
import com.alipay.mobile.rome.longlinkservice.ISyncUpResp;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncUpMessage;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncUpResp;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.e;
import com.alipay.mobile.rome.syncservice.c.a.f;
import com.alipay.mobile.rome.syncservice.sync.b.a.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9503a = b.class.getSimpleName();
    private static b c;
    public d b;
    private a d;
    private Context e;
    private HashMap<String, com.alipay.mobile.rome.syncservice.sync.d.b> f = new HashMap<>();
    private HashMap<c, List<com.alipay.mobile.rome.syncservice.sync.d.b>> g = new HashMap<>();
    private HashMap<String, ISyncUpResp<?>> h = new HashMap<>();
    private AtomicInteger i = new AtomicInteger(0);
    private int j = 30000;

    public static b a() {
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    private b() {
        Context context = com.alipay.mobile.rome.syncservice.d.a.f9473a;
        this.e = context;
        this.d = a.a(context);
        HandlerThread handlerThread = new HandlerThread("sync_up");
        handlerThread.start();
        this.b = new d(this, handlerThread.getLooper());
    }

    /* access modifiers changed from: private */
    public void a(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            a((List<com.alipay.mobile.rome.syncservice.sync.d.b>) arrayList);
        }
    }

    private <T> void a(com.alipay.mobile.rome.syncservice.sync.d.b bVar, ISyncUpResp<T> iSyncUpResp) {
        if (bVar == null) {
            c.a(f9503a, "uplinkMsg uplinkMsgItem is null");
        } else if (TextUtils.isEmpty(bVar.c)) {
            c.a(f9503a, "uplinkMsg userId is null");
        } else if (a(bVar.e, bVar.expireTime)) {
            c.a(f9503a, "uplinkMsg msg is expired!");
            a(bVar, true);
        } else {
            String str = f9503a;
            StringBuilder sb = new StringBuilder("uplinkMsg: sendImmediate=");
            sb.append(bVar.g);
            c.a(str, sb.toString());
            if (bVar.g) {
                a(bVar, 0);
            } else {
                a(bVar, bVar.sendTime);
            }
            if (iSyncUpResp != null) {
                this.h.put(bVar.b, iSyncUpResp);
            }
            if (bVar.expireTime > 0) {
                a(bVar, false);
            }
        }
    }

    private void a(c cVar, List<com.alipay.mobile.rome.syncservice.sync.d.b> list) {
        if (list == null || list.isEmpty()) {
            c.a(f9503a, "batchSendSyncUplinkMsg: uplinkMsgItemList is null or empty!");
        } else if (cVar != null) {
            if (list == null || list.isEmpty()) {
                c.a(f9503a, "send: uplinkMsgItemList is null or empty!");
            } else if (cVar != null) {
                c.a(f9503a, "send: seqKey=".concat(String.valueOf(cVar)));
                com.alipay.mobile.rome.syncservice.sync.b a2 = com.alipay.mobile.rome.syncservice.sync.b.a();
                int i2 = cVar.f9504a;
                if (a2.f9485a.a(5001) instanceof f) {
                    com.alipay.mobile.rome.syncservice.a.a.a().a(f.a(i2, list));
                }
                if (e.c(this.e) == 1) {
                    this.j = 15000;
                } else {
                    this.j = 30000;
                }
                this.b.sendMessageDelayed(this.b.obtainMessage(4, cVar), (long) this.j);
            }
        }
    }

    private void a(List<com.alipay.mobile.rome.syncservice.sync.d.b> list) {
        if (!list.isEmpty()) {
            c cVar = new c(this.i.getAndIncrement());
            this.g.put(cVar, list);
            a(cVar, list);
        }
    }

    private void b(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null || bVar.f != 1) {
            return;
        }
        if (bVar.h == SyncUplinkCallbackType.TYPE_NORMAL) {
            if (com.alipay.mobile.rome.syncservice.sync.register.c.e(bVar.biz)) {
                h(bVar);
            }
        } else if (bVar.h == SyncUplinkCallbackType.TYPE_NONE) {
            h(bVar);
        } else if (bVar.h == SyncUplinkCallbackType.TYPE_LIKE_RPC) {
            c.a(f9503a, "dispatchSyncUplinkBizIfNeed: like rpc do nothing");
        }
    }

    private static boolean a(long j2, long j3) {
        return j3 > 0 && System.currentTimeMillis() > j2 + j3;
    }

    /* access modifiers changed from: private */
    public void c(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null) {
            c.a(f9503a, "onSyncUplinkExpired: uplinkMsgItem is null ");
            return;
        }
        String str = f9503a;
        StringBuilder sb = new StringBuilder("onSyncUplinkExpired: msgId=");
        sb.append(bVar.b);
        c.a(str, sb.toString());
        if (a(bVar.e, bVar.expireTime)) {
            this.d.a(bVar);
            d(bVar);
            e(bVar);
        }
    }

    private com.alipay.mobile.rome.syncservice.sync.d.b d(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar.h == SyncUplinkCallbackType.TYPE_LIKE_RPC) {
            this.h.remove(bVar.b);
        }
        return this.f.remove(bVar.b);
    }

    private void e(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null) {
            c.a(f9503a, "deleteFromBatchList: toBeDeletedItem is null");
            return;
        }
        for (Map.Entry next : this.g.entrySet()) {
            List list = (List) next.getValue();
            if (list != null && list.contains(bVar)) {
                c.a(f9503a, "deleteFromBatchList: uplinkMsgItem will be removed");
                list.remove(bVar);
                if (list.isEmpty()) {
                    this.g.remove(next.getKey());
                    return;
                }
                return;
            }
        }
    }

    private void b(c cVar, List<com.alipay.mobile.rome.syncservice.sync.d.b> list) {
        if (list == null) {
            c.a(f9503a, "entireAckRecevied: sendList is null");
            return;
        }
        c.a(f9503a, "entireAckRecevied: sk=".concat(String.valueOf(cVar)));
        Iterator<Map.Entry<c, List<com.alipay.mobile.rome.syncservice.sync.d.b>>> it = this.g.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c cVar2 = (c) it.next().getKey();
            if (cVar.equals(cVar2)) {
                c.a(f9503a, "entireAckRecevied: removeMessage sequenceKey=".concat(String.valueOf(cVar2)));
                this.b.removeMessages(4, cVar2);
                this.g.remove(cVar2);
                break;
            }
        }
        for (com.alipay.mobile.rome.syncservice.sync.d.b f2 : list) {
            f(f2);
        }
    }

    private void a(List<com.alipay.mobile.rome.syncservice.sync.d.b> list, List<com.alipay.mobile.rome.syncservice.sync.d.b> list2) {
        int size = list2.size();
        c.a(f9503a, "partialAckReceived: recv size=".concat(String.valueOf(size)));
        for (int i2 = 0; i2 < size; i2++) {
            com.alipay.mobile.rome.syncservice.sync.d.b bVar = list2.get(i2);
            if (bVar != null) {
                Iterator<com.alipay.mobile.rome.syncservice.sync.d.b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.alipay.mobile.rome.syncservice.sync.d.b next = it.next();
                    if (bVar.equals(next)) {
                        f(next);
                        break;
                    }
                }
                list.remove(bVar);
            }
        }
    }

    private void f(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar != null) {
            String str = f9503a;
            StringBuilder sb = new StringBuilder("ackReceivedOf: msgId=");
            sb.append(bVar.b);
            c.a(str, sb.toString());
            String str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
            String str3 = bVar.biz;
            long j2 = bVar.f9495a;
            long j3 = bVar.e;
            int i2 = bVar.d;
            if (bVar.h == SyncUplinkCallbackType.TYPE_LIKE_RPC) {
                h(bVar);
            } else if (bVar.h == SyncUplinkCallbackType.TYPE_NORMAL) {
                if (com.alipay.mobile.rome.syncservice.sync.register.c.e(str3)) {
                    h(bVar);
                    return;
                }
                a aVar = this.d;
                if (aVar.d.get()) {
                    c.a(a.f9486a, "updateSendStatus...db recreating~");
                } else {
                    aVar.b.a(str2, j2, j3, i2);
                }
            } else if (bVar.h == SyncUplinkCallbackType.TYPE_NONE) {
                h(bVar);
            } else {
                String str4 = f9503a;
                StringBuilder sb2 = new StringBuilder("ackReceivedOf: unsupported callbacktype=");
                sb2.append(bVar.h);
                c.c(str4, sb2.toString());
            }
        }
    }

    private boolean g(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null) {
            c.c(f9503a, "callResponse: uplinkMsgItem is null");
            return false;
        } else if (TextUtils.isEmpty(bVar.i)) {
            c.c(f9503a, "callResponse: result is null");
            return false;
        } else {
            ISyncUpResp iSyncUpResp = this.h.get(bVar.b);
            if (iSyncUpResp == null) {
                c.c(f9503a, "callResponse: callback is null");
                return false;
            }
            try {
                Type type = ((ParameterizedType) iSyncUpResp.getClass().getMethod("onUpResponse", new Class[]{SyncUpResp.class}).getGenericParameterTypes()[0]).getActualTypeArguments()[0];
                SyncUpResp syncUpResp = new SyncUpResp();
                syncUpResp.biz = bVar.biz;
                syncUpResp.bizId = bVar.bizId;
                syncUpResp.msgId = bVar.b;
                syncUpResp.respData = JSON.parseObject(bVar.i, type, new Feature[0]);
                iSyncUpResp.onUpResponse(syncUpResp);
                return true;
            } catch (NoSuchMethodException e2) {
                c.d(f9503a, "callResponse: ".concat(String.valueOf(e2)));
                return false;
            } catch (Exception e3) {
                c.d(f9503a, "callResponse: ".concat(String.valueOf(e3)));
                return false;
            }
        }
    }

    private void a(com.alipay.mobile.rome.syncservice.sync.d.b bVar, boolean z) {
        Message obtainMessage = this.b.obtainMessage(1, bVar);
        if (z) {
            this.b.sendMessage(obtainMessage);
        } else {
            this.b.sendMessageDelayed(obtainMessage, bVar.expireTime);
        }
    }

    private void a(com.alipay.mobile.rome.syncservice.sync.d.b bVar, long j2) {
        if (bVar == null) {
            c.a(f9503a, "sendSyncUnplinkDelayed: uplinkMsgItem is null!");
            return;
        }
        this.f.put(bVar.b, bVar);
        if (j2 > 0) {
            this.b.sendMessageDelayed(this.b.obtainMessage(0, bVar), j2);
            return;
        }
        a(bVar);
    }

    private void h(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (bVar == null) {
            c.a(f9503a, "onSyncUplinkFinished: uplinkMsgItem is null");
            return;
        }
        String str = f9503a;
        StringBuilder sb = new StringBuilder("onSyncUplinkFinished: msgId=");
        sb.append(bVar.b);
        sb.append(",callbackType=");
        sb.append(bVar.h);
        c.a(str, sb.toString());
        if (bVar.h == SyncUplinkCallbackType.TYPE_LIKE_RPC) {
            g(bVar);
        } else if (bVar != null && bVar.h == SyncUplinkCallbackType.TYPE_NORMAL) {
            String str2 = bVar.biz;
            String str3 = bVar.b;
            ISyncUpCallback d2 = com.alipay.mobile.rome.syncservice.sync.register.c.d(str2);
            if (d2 != null) {
                d2.onSyncUpResult(str2, str3, ISyncUpCallback.SyncUpState.SUCCEED);
            } else {
                String str4 = f9503a;
                StringBuilder sb2 = new StringBuilder("onSyncUplinkCallback, callback is null[biz:");
                sb2.append(str2);
                sb2.append("][msgId:");
                sb2.append(str3);
                sb2.append("]");
                c.a(str4, sb2.toString());
            }
        }
        a aVar = this.d;
        String str5 = bVar.c;
        long j2 = bVar.f9495a;
        long j3 = bVar.e;
        int i2 = bVar.d;
        if (aVar.d.get()) {
            c.a(a.f9486a, "deleteMsg...db recreating~");
        } else {
            aVar.b.b(str5, j2, j3, i2);
        }
        d(bVar);
    }

    public final void b() {
        this.b.sendEmptyMessage(2);
    }

    public static String a(long j2, long j3, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.alipay.mobile.rome.syncservice.d.b.a(j3));
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(j2);
        return sb.toString();
    }

    static /* synthetic */ String a(b bVar, SyncUpMessage syncUpMessage, SyncUplinkCallbackType syncUplinkCallbackType, ISyncUpResp iSyncUpResp) {
        b bVar2 = bVar;
        SyncUpMessage syncUpMessage2 = syncUpMessage;
        ISyncUpResp iSyncUpResp2 = iSyncUpResp;
        if (syncUpMessage2 == null) {
            c.d(f9503a, "sendSyncUplinkMsg syncUpMessage is null");
            return "-1";
        }
        String str = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        if (TextUtils.isEmpty(str)) {
            c.d(f9503a, "sendSyncUplinkMsg userId is null");
            return AUAttrsConstant.WRAP_CONTENT;
        }
        boolean z = false;
        if (!(iSyncUpResp2 == null || syncUpMessage2.reqData == null)) {
            syncUpMessage2.msgData = JSON.toJSONString((Object) syncUpMessage2.reqData, SerializerFeature.DisableCircularReferenceDetect);
        }
        com.alipay.mobile.rome.syncservice.sync.d.b bVar3 = new com.alipay.mobile.rome.syncservice.sync.d.b(syncUpMessage2);
        bVar3.c = str;
        if (!TextUtils.isEmpty(bVar3.bizId)) {
            Iterator<Map.Entry<String, com.alipay.mobile.rome.syncservice.sync.d.b>> it = bVar2.f.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.alipay.mobile.rome.syncservice.sync.d.b bVar4 = (com.alipay.mobile.rome.syncservice.sync.d.b) it.next().getValue();
                if (bVar4 != null) {
                    if (TextUtils.equals(bVar4.bizId, bVar3.bizId) && TextUtils.equals(bVar4.biz, bVar3.biz) && TextUtils.equals(bVar4.c, bVar3.c)) {
                        c.c(f9503a, "removeUnsendSyncUplinkMsg: the same entity");
                        a aVar = bVar2.d;
                        String str2 = bVar4.c;
                        String str3 = bVar4.biz;
                        String str4 = bVar4.bizId;
                        if (aVar.d.get()) {
                            c.a(a.f9486a, "deleteMsgByBizId...db recreating~");
                        } else {
                            aVar.b.a(str2, str3, str4);
                        }
                        bVar2.d(bVar3);
                        bVar2.e(bVar4);
                    }
                }
            }
        }
        int nextInt = new Random().nextInt(8999) + 1000;
        long currentTimeMillis = System.currentTimeMillis();
        a aVar2 = bVar2.d;
        long j2 = currentTimeMillis;
        long a2 = aVar2.b.a(str, nextInt, currentTimeMillis, syncUpMessage, syncUplinkCallbackType);
        if (a2 == -4) {
            a2 = aVar2.b.a(str, nextInt, j2, syncUpMessage, syncUplinkCallbackType);
        }
        if (a2 == -1) {
            c.a(f9503a, "sendSyncUplinkMsg: insert to database error");
            return "-3";
        }
        long j3 = j2;
        String a3 = a(a2, j3, nextInt);
        bVar3.b = a3;
        bVar3.f9495a = a2;
        bVar3.d = nextInt;
        bVar3.e = j3;
        if (syncUpMessage2.sendTime <= 0) {
            z = true;
        }
        bVar3.g = z;
        bVar3.h = syncUplinkCallbackType;
        c.b(f9503a, "sendSyncUplinkMsg msgId:".concat(String.valueOf(a3)));
        bVar2.a(bVar3, iSyncUpResp2);
        return a3;
    }

    static /* synthetic */ void a(b bVar, c cVar) {
        if (cVar != null) {
            cVar.b++;
            String str = f9503a;
            StringBuilder sb = new StringBuilder("RETRY_SEND_SYNC_UPLINK: retry=");
            sb.append(cVar.b);
            sb.append(",seq=");
            sb.append(cVar.f9504a);
            c.a(str, sb.toString());
            if (cVar.b <= 2) {
                bVar.a(cVar, bVar.g.get(cVar));
            }
        }
    }

    static /* synthetic */ void a(b bVar) {
        List<com.alipay.mobile.rome.syncservice.sync.d.b> list;
        String str = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        if (TextUtils.isEmpty(str)) {
            c.c(f9503a, "startScanDatabaseAndParseMsg user does not login");
            return;
        }
        a aVar = bVar.d;
        if (aVar.d.get()) {
            c.a(a.f9486a, "queryAllMsg...db recreating~");
            list = null;
        } else {
            list = aVar.b.b(str);
        }
        if (list == null) {
            c.c(f9503a, "startScanDatabaseAndParseMsg: no item");
            return;
        }
        try {
            LinkedList linkedList = new LinkedList();
            String str2 = f9503a;
            StringBuilder sb = new StringBuilder("analysizeSyncUplinkList enter totalSize=");
            sb.append(list.size());
            c.a(str2, sb.toString());
            loop0:
            while (true) {
                int i2 = 0;
                for (com.alipay.mobile.rome.syncservice.sync.d.b next : list) {
                    if (next != null) {
                        if (next.f == 1) {
                            bVar.b(next);
                        } else if (a(next.e, next.expireTime)) {
                            bVar.c(next);
                        } else if (!next.g) {
                            bVar.a(next, (ISyncUpResp) null);
                        } else {
                            i2++;
                            linkedList.add(next);
                            bVar.f.put(next.b, next);
                            if (next.expireTime > 0) {
                                bVar.a(next, false);
                            }
                            if (i2 % 5 == 0) {
                                bVar.a((List<com.alipay.mobile.rome.syncservice.sync.d.b>) linkedList);
                                linkedList = new LinkedList();
                            }
                        }
                    }
                }
                break loop0;
            }
            if (!linkedList.isEmpty()) {
                bVar.a((List<com.alipay.mobile.rome.syncservice.sync.d.b>) linkedList);
            }
        } catch (Exception e2) {
            String str3 = f9503a;
            StringBuilder sb2 = new StringBuilder("analysizeSyncUplinkList: [Exception=");
            sb2.append(e2);
            sb2.append("]");
            c.d(str3, sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4 A[Catch:{ Exception -> 0x00a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.alipay.mobile.rome.syncservice.up.b r8, int r9, java.util.List r10) {
        /*
            if (r10 == 0) goto L_0x00b9
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x000a
            goto L_0x00b9
        L_0x000a:
            com.alipay.mobile.rome.syncservice.up.c r0 = new com.alipay.mobile.rome.syncservice.up.c     // Catch:{ Exception -> 0x00a8 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap<com.alipay.mobile.rome.syncservice.up.c, java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b>> r1 = r8.g     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00a8 }
            if (r1 != 0) goto L_0x0021
            java.lang.String r8 = f9503a     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r9 = "onSyncUplinkAckReceived: sendList is null or 0"
            com.alipay.mobile.rome.syncsdk.util.c.c(r8, r9)     // Catch:{ Exception -> 0x00a8 }
            return
        L_0x0021:
            if (r1 == 0) goto L_0x0074
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x00a8 }
            if (r2 != 0) goto L_0x0074
            if (r10 == 0) goto L_0x0074
            boolean r2 = r10.isEmpty()     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0032
            goto L_0x0074
        L_0x0032:
            java.util.Iterator r2 = r10.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x0036:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00a8 }
            com.alipay.mobile.rome.syncservice.sync.d.b r3 = (com.alipay.mobile.rome.syncservice.sync.d.b) r3     // Catch:{ Exception -> 0x00a8 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x0046:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00a8 }
            com.alipay.mobile.rome.syncservice.sync.d.b r5 = (com.alipay.mobile.rome.syncservice.sync.d.b) r5     // Catch:{ Exception -> 0x00a8 }
            if (r3 == 0) goto L_0x0046
            boolean r6 = r3.equals(r5)     // Catch:{ Exception -> 0x00a8 }
            if (r6 == 0) goto L_0x0046
            java.lang.String r5 = r5.i     // Catch:{ Exception -> 0x00a8 }
            r3.i = r5     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = f9503a     // Catch:{ Exception -> 0x00a8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "copyResult: result="
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = r3.i     // Catch:{ Exception -> 0x00a8 }
            r6.append(r7)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00a8 }
            com.alipay.mobile.rome.syncsdk.util.c.a(r5, r6)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0046
        L_0x0074:
            java.lang.String r2 = f9503a     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r3 = "copyResult: empty list"
            com.alipay.mobile.rome.syncsdk.util.c.c(r2, r3)     // Catch:{ Exception -> 0x00a8 }
        L_0x007b:
            int r2 = r10.size()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r3 = f9503a     // Catch:{ Exception -> 0x00a8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = "onSyncUplinkAckReceived: recv size="
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a8 }
            r4.append(r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = ", sequence="
            r4.append(r5)     // Catch:{ Exception -> 0x00a8 }
            r4.append(r9)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r9 = r4.toString()     // Catch:{ Exception -> 0x00a8 }
            com.alipay.mobile.rome.syncsdk.util.c.a(r3, r9)     // Catch:{ Exception -> 0x00a8 }
            int r9 = r1.size()     // Catch:{ Exception -> 0x00a8 }
            if (r2 != r9) goto L_0x00a4
            r8.b((com.alipay.mobile.rome.syncservice.up.c) r0, (java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b>) r1)     // Catch:{ Exception -> 0x00a8 }
            return
        L_0x00a4:
            r8.a((java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b>) r1, (java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b>) r10)     // Catch:{ Exception -> 0x00a8 }
            return
        L_0x00a8:
            r8 = move-exception
            java.lang.String r9 = f9503a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "onSyncUplinkAckReceived exception: "
            java.lang.String r8 = r10.concat(r8)
            com.alipay.mobile.rome.syncsdk.util.c.d(r9, r8)
            return
        L_0x00b9:
            java.lang.String r8 = f9503a
            java.lang.String r9 = "onSyncUplinkAckReceived: recvList is null or 0"
            com.alipay.mobile.rome.syncsdk.util.c.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.up.b.a(com.alipay.mobile.rome.syncservice.up.b, int, java.util.List):void");
    }

    static /* synthetic */ void c(b bVar, com.alipay.mobile.rome.syncservice.sync.d.b bVar2) {
        if (bVar2 != null) {
            bVar.d.a(bVar2);
            bVar.b.removeMessages(0, bVar.d(bVar2));
        }
    }

    static /* synthetic */ void a(b bVar, String str) {
        List<com.alipay.mobile.rome.syncservice.sync.d.b> list;
        String str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        if (TextUtils.isEmpty(str2)) {
            c.c(f9503a, "SACAN_AND_DISPATCH user does not login");
            return;
        }
        a aVar = bVar.d;
        if (aVar.d.get()) {
            c.a(a.f9486a, "queryMsgByStatus...db recreating~");
            list = null;
        } else {
            list = aVar.b.a(str2, str);
        }
        if (list == null) {
            c.c(f9503a, "SACAN_AND_DISPATCH: no item");
            return;
        }
        for (com.alipay.mobile.rome.syncservice.sync.d.b b2 : list) {
            bVar.b(b2);
        }
    }
}
