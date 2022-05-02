package com.alipay.mobile.rome.syncservice.c;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.mobile.rome.syncservice.d.d;
import com.alipay.mobile.rome.syncservice.model.DownstreamDataRequest;
import com.alipay.mobile.rome.syncservice.model.ResultCodeEnum;
import com.alipay.mobile.rome.syncservice.model.c;
import com.alipay.mobile.rome.syncservice.sync.d.a;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import com.alipay.msync.core.model.spcode.pb.ProtoBizSyncData;
import com.alipay.msync.core.model.spcode.pb.ProtoOplog;
import com.squareup.wire.Message;
import java.util.ArrayList;
import java.util.List;
import o.printConnMonitorLog;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class b<T> extends a<T> {
    protected boolean d;

    /* access modifiers changed from: protected */
    public abstract long a(a aVar);

    /* access modifiers changed from: protected */
    public abstract Message a(List<c> list, Boolean bool, Integer num, String str);

    /* access modifiers changed from: protected */
    public abstract void a(a aVar, long j);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract int b();

    public final void a(DownstreamDataRequest downstreamDataRequest) {
        this.d = false;
        super.a(downstreamDataRequest);
    }

    /* access modifiers changed from: protected */
    public final <K> List<a> a(List<K> list, String str, Boolean bool) {
        com.alipay.mobile.rome.syncservice.model.b bVar;
        a a2;
        if (list == null || list.isEmpty()) {
            com.alipay.mobile.rome.syncsdk.util.c.d(this.f9468a, ": no data!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (K next : list) {
            synchronized (d.f9475a) {
                if (next != null) {
                    if (next instanceof ProtoBizSyncData) {
                        bVar = new com.alipay.mobile.rome.syncservice.model.b((ProtoBizSyncData) next);
                        a2 = a(bVar, str, bool);
                    } else {
                        com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "transfer: unknown object:".concat(String.valueOf(next)));
                    }
                }
                bVar = null;
                a2 = a(bVar, str, bool);
            }
            if (!a()) {
                return null;
            }
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final List<c> a(List<a> list, int i) {
        if (list == null || list.isEmpty() || !(list == null || list.size() == i)) {
            com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "something error occured!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(list));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[Catch:{ all -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.mobile.rome.syncservice.sync.d.a a(com.alipay.mobile.rome.syncservice.model.b r24, java.lang.String r25, java.lang.Boolean r26) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r7 = 0
            if (r0 != 0) goto L_0x0008
            return r7
        L_0x0008:
            com.alipay.mobile.rome.syncservice.sync.d.a r1 = new com.alipay.mobile.rome.syncservice.sync.d.a
            r1.<init>()
            r9 = 1
            r10 = 0
            java.lang.String r2 = r0.f9479a     // Catch:{ all -> 0x01c3 }
            r1.c = r2     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = r1.c     // Catch:{ all -> 0x01c3 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r8.f9468a     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "handleData bizIndex("
            r3.<init>(r4)     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = r0.f9479a     // Catch:{ all -> 0x01c3 }
            r3.append(r4)     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = ") can't find bizName."
            r3.append(r4)     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c3 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r2, r3)     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = "BizNotFound"
            java.lang.String r0 = r0.f9479a     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = r1.b     // Catch:{ all -> 0x01c3 }
            java.lang.String r4 = "3012"
            r8.b((java.lang.String) r2, (java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x01c3 }
            r8.d = r9     // Catch:{ all -> 0x01c3 }
            return r7
        L_0x0043:
            r11 = r25
            r1.b = r11     // Catch:{ all -> 0x01c3 }
            java.lang.Long r2 = r0.d     // Catch:{ all -> 0x01c3 }
            if (r2 != 0) goto L_0x004d
            r2 = r7
            goto L_0x0053
        L_0x004d:
            java.lang.Long r2 = r0.d     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01c3 }
        L_0x0053:
            r1.d = r2     // Catch:{ all -> 0x01c3 }
            java.lang.Boolean r2 = r0.c     // Catch:{ all -> 0x01c3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r1.e = r2     // Catch:{ all -> 0x01c3 }
            r12 = r1
            r13 = 0
        L_0x005f:
            r1 = 3
            if (r13 >= r1) goto L_0x01f6
            if (r12 != 0) goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x00be
        L_0x0066:
            boolean r1 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x0076
            if (r26 == 0) goto L_0x0076
            boolean r1 = r26.booleanValue()     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 == 0) goto L_0x00bd
            com.alipay.mobile.rome.syncservice.sync.register.a r1 = com.alipay.mobile.rome.syncservice.sync.register.a.a()     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r12.c     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.sync.register.Biz$BizDimeEnum r1 = r1.b((java.lang.String) r2)     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.sync.register.Biz$BizDimeEnum r2 = com.alipay.mobile.rome.syncservice.sync.register.Biz.BizDimeEnum.USER     // Catch:{ all -> 0x01c1 }
            if (r1 != r2) goto L_0x0090
            com.alipay.mobile.rome.syncsdk.a.a r1 = com.alipay.mobile.rome.syncsdk.a.a.a()     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r1.f9405a     // Catch:{ all -> 0x01c1 }
            r12.b = r1     // Catch:{ all -> 0x01c1 }
            goto L_0x009a
        L_0x0090:
            com.alipay.mobile.rome.syncsdk.a.a r1 = com.alipay.mobile.rome.syncsdk.a.a.a()     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r1.e()     // Catch:{ all -> 0x01c1 }
            r12.b = r1     // Catch:{ all -> 0x01c1 }
        L_0x009a:
            java.lang.String r1 = r12.b     // Catch:{ all -> 0x01c1 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r8.f9468a     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = "checkGlobalOnlinePushValidity: ["
            r2.<init>(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = r12.c     // Catch:{ all -> 0x01c1 }
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = " global online push packet no userId or cdid ]"
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncsdk.util.c.d(r1, r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x0064
        L_0x00bd:
            r1 = 1
        L_0x00be:
            if (r1 != 0) goto L_0x00c1
            return r7
        L_0x00c1:
            long r14 = r8.a((com.alipay.mobile.rome.syncservice.sync.d.a) r12)     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r1 = 64
            r6.<init>(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "biz->"
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r12.c     // Catch:{ all -> 0x01c1 }
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "("
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r1 = r0.b     // Catch:{ all -> 0x01c1 }
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = ") sKey:"
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r12.d     // Catch:{ all -> 0x01c1 }
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = " "
            r6.append(r1)     // Catch:{ all -> 0x01c1 }
            java.util.List<com.alipay.msync.core.model.spcode.pb.ProtoOplog> r3 = r0.e     // Catch:{ all -> 0x01c1 }
            r1 = r23
            r2 = r12
            r4 = r14
            r16 = r6
            com.alipay.mobile.rome.syncservice.model.d r1 = r1.a((com.alipay.mobile.rome.syncservice.sync.d.a) r2, (java.util.List<com.alipay.msync.core.model.spcode.pb.ProtoOplog>) r3, (long) r4, (java.lang.StringBuilder) r6)     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r2 = r1.f9481a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r3 = com.alipay.mobile.rome.syncservice.model.ResultCodeEnum.DB_CRUPT     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = "db recreate and insert retry"
            r4 = 2
            if (r2 != r3) goto L_0x0132
            if (r13 != r4) goto L_0x012b
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r12.c     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = r12.b     // Catch:{ all -> 0x01c1 }
            java.lang.String r20 = "3001"
            java.lang.Long r4 = r0.d     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x0115
            r21 = -1
            goto L_0x011d
        L_0x0115:
            java.lang.Long r4 = r0.d     // Catch:{ all -> 0x01c1 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x01c1 }
            r21 = r4
        L_0x011d:
            r17 = r1
            r18 = r2
            r19 = r3
            a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01c1 }
            r8.d = r9     // Catch:{ all -> 0x01c1 }
        L_0x0128:
            r12 = r7
            goto L_0x01b4
        L_0x012b:
            java.lang.String r1 = r8.f9468a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncsdk.util.c.a(r1, r6)     // Catch:{ all -> 0x01c1 }
            goto L_0x01b4
        L_0x0132:
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r1 = r1.f9481a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r2 = com.alipay.mobile.rome.syncservice.model.ResultCodeEnum.SUCCESS     // Catch:{ all -> 0x01c1 }
            if (r1 == r2) goto L_0x013a
            r1 = 1
            goto L_0x013b
        L_0x013a:
            r1 = 0
        L_0x013b:
            r8.a((com.alipay.mobile.rome.syncservice.sync.d.a) r12, (long) r14)     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = " needDispatch:"
            r2.<init>(r3)     // Catch:{ all -> 0x01c1 }
            boolean r3 = r12.l     // Catch:{ all -> 0x01c1 }
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = " dataLength:"
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = r12.f     // Catch:{ all -> 0x01c1 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x01c1 }
            if (r3 != 0) goto L_0x015e
            java.lang.String r3 = r12.f     // Catch:{ all -> 0x01c1 }
            int r3 = r3.length()     // Catch:{ all -> 0x01c1 }
            goto L_0x015f
        L_0x015e:
            r3 = 0
        L_0x015f:
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = " byte"
            r2.append(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01c1 }
            r3 = r16
            r3.append(r2)     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r8.f9468a     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncsdk.util.c.b(r2, r3)     // Catch:{ all -> 0x01c1 }
            if (r1 != 0) goto L_0x01f6
            boolean r1 = r12.l     // Catch:{ all -> 0x01c1 }
            if (r1 == 0) goto L_0x01f6
            com.alipay.mobile.rome.syncservice.model.d r1 = com.alipay.mobile.rome.syncservice.sync.e.a.a(r12)     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r2 = r1.f9481a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r3 = com.alipay.mobile.rome.syncservice.model.ResultCodeEnum.DB_CRUPT     // Catch:{ all -> 0x01c1 }
            if (r2 != r3) goto L_0x01b8
            if (r13 != r4) goto L_0x01af
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = r12.c     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = r12.b     // Catch:{ all -> 0x01c1 }
            java.lang.String r20 = "3001"
            java.lang.Long r4 = r0.d     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x019a
            r21 = -1
            goto L_0x01a2
        L_0x019a:
            java.lang.Long r4 = r0.d     // Catch:{ all -> 0x01c1 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x01c1 }
            r21 = r4
        L_0x01a2:
            r17 = r1
            r18 = r2
            r19 = r3
            a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01c1 }
            r8.d = r9     // Catch:{ all -> 0x01c1 }
            goto L_0x0128
        L_0x01af:
            java.lang.String r1 = r8.f9468a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncsdk.util.c.a(r1, r6)     // Catch:{ all -> 0x01c1 }
        L_0x01b4:
            int r13 = r13 + 1
            goto L_0x005f
        L_0x01b8:
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r0 = r1.f9481a     // Catch:{ all -> 0x01c1 }
            com.alipay.mobile.rome.syncservice.model.ResultCodeEnum r1 = com.alipay.mobile.rome.syncservice.model.ResultCodeEnum.ERROR     // Catch:{ all -> 0x01c1 }
            if (r0 != r1) goto L_0x01f6
            r12.l = r10     // Catch:{ all -> 0x01c1 }
            goto L_0x01f6
        L_0x01c1:
            r0 = move-exception
            goto L_0x01c5
        L_0x01c3:
            r0 = move-exception
            r12 = r1
        L_0x01c5:
            r12.l = r10
            java.lang.String r1 = r8.f9468a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ": [ Exception="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " ]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r12.c
            java.lang.String r4 = r12.b
            java.lang.String r0 = r12.d
            long r6 = com.alipay.mobile.rome.syncservice.d.b.b(r0)
            java.lang.String r5 = "3001"
            r1 = r23
            r1.b(r2, r3, r4, r5, r6)
            r8.d = r9
        L_0x01f6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.c.b.a(com.alipay.mobile.rome.syncservice.model.b, java.lang.String, java.lang.Boolean):com.alipay.mobile.rome.syncservice.sync.d.a");
    }

    private com.alipay.mobile.rome.syncservice.model.d a(a aVar, List<ProtoOplog> list, long j, StringBuilder sb) {
        JSONObject jSONObject;
        long j2;
        a aVar2 = aVar;
        long j3 = j;
        StringBuilder sb2 = sb;
        if (aVar2 == null) {
            sb2.append("(packet is null)");
            return new com.alipay.mobile.rome.syncservice.model.d(ResultCodeEnum.ERROR);
        }
        sb2.append("(");
        if (list == null || list.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("localSyncKey=");
            sb3.append(j3);
            sb3.append(")");
            sb2.append(sb3.toString());
            return new com.alipay.mobile.rome.syncservice.model.d(ResultCodeEnum.SUCCESS);
        }
        com.alipay.mobile.rome.syncservice.model.d dVar = new com.alipay.mobile.rome.syncservice.model.d(ResultCodeEnum.SUCCESS);
        try {
            JSONArray jSONArray = new JSONArray();
            for (ProtoOplog next : list) {
                if (next != null) {
                    Long l = next.mk;
                    String str = next.payload;
                    printConnMonitorLog printconnmonitorlog = next.binary_payload;
                    boolean z = true;
                    if (TextUtils.isEmpty(str) && printconnmonitorlog == null) {
                        String str2 = aVar2.c;
                        String str3 = aVar2.b;
                        if (l == null) {
                            j2 = -1;
                        } else {
                            j2 = l.longValue();
                        }
                        a("payload_null", str2, str3, "3003", j2);
                        this.d = true;
                        com.alipay.mobile.rome.syncsdk.util.c.d(this.f9468a, "checkPayload: [ payload &  binary_payload is null.]");
                        z = false;
                    }
                    if (z) {
                        sb2.append(next.mk);
                        if (next.mk.longValue() > j3) {
                            if (next == null) {
                                jSONObject = null;
                            } else {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("mk", next.mk);
                                jSONObject2.put(RVParams.SHOW_TITLEBAR, next.st);
                                jSONObject2.put("bId", next.biz_id);
                                jSONObject2.put("ext", next.ext);
                                jSONObject2.put("mct", next.mct);
                                if (!TextUtils.isEmpty(next.payload)) {
                                    jSONObject2.put(RVParams.PREFETCH_LOCATION, next.payload);
                                } else if (next.binary_payload != null) {
                                    jSONObject2.put(RVParams.PREFETCH_LOCATION, a(next.binary_payload));
                                    jSONObject2.put("isB", "1");
                                }
                                jSONObject = jSONObject2;
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            sb2.append("-r");
                        }
                        sb2.append(" ");
                    }
                }
            }
            aVar2.f = "";
            if (jSONArray.length() > 0) {
                aVar2.f = jSONArray.toString();
            }
        } catch (Exception e) {
            com.alipay.mobile.rome.syncsdk.util.c.d(this.f9468a, "parsePacketMsgData: ".concat(String.valueOf(e)));
        }
        sb2.append(")");
        return dVar;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, Boolean bool, List<ProtoBizSyncData> list) {
        if (TextUtils.isEmpty(str)) {
            if (bool != null && !bool.booleanValue()) {
                com.alipay.mobile.rome.syncsdk.util.c.d(this.f9468a, "checkUIDAvailability exception: principal is null, but not_check_principal equal false");
                return false;
            }
        } else if (!TextUtils.equals(str, com.alipay.mobile.rome.syncsdk.a.a.a().f9405a) && !TextUtils.equals(str, com.alipay.mobile.rome.syncsdk.a.a.a().e())) {
            String str2 = this.f9468a;
            StringBuilder sb = new StringBuilder("checkUIDAvailability: [ uid unmatched, Client(");
            sb.append(com.alipay.mobile.rome.syncsdk.a.a.a().f9405a);
            sb.append(") Server(");
            sb.append(str);
            sb.append(")] ");
            com.alipay.mobile.rome.syncsdk.util.c.d(str2, sb.toString());
            a("msg_dismatch_exception", a(list), com.alipay.mobile.rome.syncsdk.a.a.a().e(), "3004");
            this.d = true;
            return false;
        }
        return true;
    }

    private static String a(List<ProtoBizSyncData> list) {
        Biz a2;
        if (list == null || list.isEmpty()) {
            return "No_Biz";
        }
        StringBuilder sb = new StringBuilder(64);
        for (ProtoBizSyncData next : list) {
            if (!TextUtils.isEmpty(next.biz_type)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next.biz_type);
                sb2.append(",");
                sb.append(sb2.toString());
            } else if (!(next.biz_order == null || (a2 = com.alipay.mobile.rome.syncservice.sync.register.a.a().a(next.biz_order)) == null)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2.f9498a);
                sb3.append(",");
                sb.append(sb3.toString());
            }
        }
        return sb.toString();
    }

    private String a(printConnMonitorLog printconnmonitorlog) {
        if (printconnmonitorlog == null) {
            return "";
        }
        try {
            return printconnmonitorlog.base64();
        } catch (Throwable th) {
            String str = this.f9468a;
            StringBuilder sb = new StringBuilder("convertToBase64: [ Exception=");
            sb.append(th);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str, sb.toString());
            return "";
        }
    }

    private byte[] b(List<c> list, Boolean bool, Integer num, String str) {
        try {
            return f.a(a(list, bool, num, str), b());
        } catch (Exception e) {
            String str2 = this.f9468a;
            StringBuilder sb = new StringBuilder("getRespDataStream: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str2, sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(8)
    public final void a(com.alipay.mobile.rome.syncservice.model.a aVar, DownstreamDataRequest.DataSource dataSource) {
        String str = "UNKNOWN";
        if (aVar == null) {
            com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "handlePacketResponse: packet is null");
            b("otherError", str, (String) null, "3006");
        } else if (TextUtils.equals(aVar.d, "8001")) {
            com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "handlePacketResponse 8001 needn't to response.");
        } else {
            List<c> list = aVar.f9478a;
            if (list == null || list.size() <= 0) {
                com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "handlePacketResponse: list is null or empty");
                b("otherError", str, (String) null, "3006");
                return;
            }
            try {
                byte[] b = b(list, aVar.c, aVar.h, aVar.g);
                if (b == null) {
                    b("otherError", str, (String) null, "3006");
                    return;
                }
                long length = (long) b.length;
                int i = c.f9471a[dataSource.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        com.alipay.mobile.rome.syncservice.a.a.a().a(b);
                    } else if (i != 3) {
                        com.alipay.mobile.rome.syncsdk.util.c.a(this.f9468a, "handleResponse no dataSource found.");
                    }
                }
                if (list != null) {
                    if (!list.isEmpty()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        for (c cVar : list) {
                            List<a> list2 = cVar.f9480a;
                            if (list2 != null && !list2.isEmpty()) {
                                for (a next : list2) {
                                    if (stringBuffer.length() == 0) {
                                        stringBuffer.append(next.c);
                                    } else {
                                        StringBuilder sb = new StringBuilder(",");
                                        sb.append(next.c);
                                        stringBuffer.append(sb.toString());
                                    }
                                }
                            }
                        }
                        str = stringBuffer.toString();
                    }
                }
                try {
                    String str2 = this.f9468a;
                    StringBuilder sb2 = new StringBuilder("handleResponse");
                    sb2.append(this.b);
                    sb2.append("[dataSource:");
                    sb2.append(dataSource);
                    sb2.append("][ip:");
                    sb2.append((String) null);
                    sb2.append("][biz:");
                    sb2.append(str);
                    sb2.append("][");
                    sb2.append(b(list));
                    sb2.append("] datasize:");
                    sb2.append(length);
                    com.alipay.mobile.rome.syncsdk.util.c.a(str2, sb2.toString());
                } catch (Throwable th) {
                    th = th;
                    String str3 = this.f9468a;
                    StringBuilder sb3 = new StringBuilder("handlePacketResp:  [ Exception=");
                    sb3.append(th);
                    sb3.append(" ]");
                    com.alipay.mobile.rome.syncsdk.util.c.d(str3, sb3.toString());
                    b("otherError", str, (String) null, "3006");
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                String str32 = this.f9468a;
                StringBuilder sb32 = new StringBuilder("handlePacketResp:  [ Exception=");
                sb32.append(th);
                sb32.append(" ]");
                com.alipay.mobile.rome.syncsdk.util.c.d(str32, sb32.toString());
                b("otherError", str, (String) null, "3006");
            }
        }
    }

    private static String b(List<c> list) {
        List<a> list2;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (c next : list) {
            if (!(next == null || (list2 = next.f9480a) == null || list2.size() <= 0)) {
                sb.append(list2.get(0).d);
            }
        }
        return sb.toString();
    }

    protected static void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, str4, -1);
    }

    private static void a(String str, String str2, String str3, String str4, long j) {
        com.alipay.mobile.rome.syncservice.sync.b.a().a(str, str2, str3, str4, j);
    }

    private void b(String str, String str2, String str3, String str4) {
        b(str, str2, str3, str4, -1);
    }

    private void b(String str, String str2, String str3, String str4, long j) {
        if (!this.d) {
            a(str, str2, str3, str4, j);
        }
    }
}
