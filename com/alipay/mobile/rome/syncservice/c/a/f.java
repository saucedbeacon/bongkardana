package com.alipay.mobile.rome.syncservice.c.a;

public final class f extends a {
    public final byte[] b() {
        return new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073 A[Catch:{ Exception -> 0x00bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(int r9, java.util.List<com.alipay.mobile.rome.syncservice.sync.d.b> r10) {
        /*
            r0 = 0
            java.lang.String r1 = "Operation5001"
            if (r10 == 0) goto L_0x00d5
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x000d
            goto L_0x00d5
        L_0x000d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00bd }
            r2.<init>()     // Catch:{ Exception -> 0x00bd }
            int r3 = r10.size()     // Catch:{ Exception -> 0x00bd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = "sendSync5001Msg[size="
            r4.<init>(r5)     // Catch:{ Exception -> 0x00bd }
            r4.append(r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = "][seq="
            r4.append(r3)     // Catch:{ Exception -> 0x00bd }
            r4.append(r9)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = "]"
            r4.append(r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00bd }
            com.alipay.mobile.rome.syncsdk.util.c.b(r1, r3)     // Catch:{ Exception -> 0x00bd }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x00bd }
        L_0x0038:
            boolean r3 = r10.hasNext()     // Catch:{ Exception -> 0x00bd }
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r3 = r10.next()     // Catch:{ Exception -> 0x00bd }
            com.alipay.mobile.rome.syncservice.sync.d.b r3 = (com.alipay.mobile.rome.syncservice.sync.d.b) r3     // Catch:{ Exception -> 0x00bd }
            com.alipay.msync.core.model.spcode.pb.ProtoClientSyncData r4 = new com.alipay.msync.core.model.spcode.pb.ProtoClientSyncData     // Catch:{ Exception -> 0x00bd }
            r4.<init>()     // Catch:{ Exception -> 0x00bd }
            com.alipay.mobile.rome.syncservice.sync.register.a r5 = com.alipay.mobile.rome.syncservice.sync.register.a.a()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r6 = r3.biz     // Catch:{ Exception -> 0x00bd }
            java.lang.Integer r5 = r5.a((java.lang.String) r6)     // Catch:{ Exception -> 0x00bd }
            r6 = 0
            if (r5 == 0) goto L_0x0061
            int r7 = r5.intValue()     // Catch:{ Exception -> 0x00bd }
            r8 = -1
            if (r7 != r8) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r4.biz_order = r5     // Catch:{ Exception -> 0x00bd }
            goto L_0x006b
        L_0x0061:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00bd }
            r4.biz_order = r5     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = r3.biz     // Catch:{ Exception -> 0x00bd }
            r4.biz_type = r5     // Catch:{ Exception -> 0x00bd }
        L_0x006b:
            java.lang.String r5 = r3.msgData     // Catch:{ Exception -> 0x00bd }
            r4.payload = r5     // Catch:{ Exception -> 0x00bd }
            byte[] r5 = r3.msgData_pb     // Catch:{ Exception -> 0x00bd }
            if (r5 == 0) goto L_0x007b
            byte[] r5 = r3.msgData_pb     // Catch:{ Exception -> 0x00bd }
            o.printConnMonitorLog r5 = o.printConnMonitorLog.of((byte[]) r5)     // Catch:{ Exception -> 0x00bd }
            r4.binary_payload = r5     // Catch:{ Exception -> 0x00bd }
        L_0x007b:
            com.alipay.mobile.rome.syncservice.up.SyncUplinkCallbackType r5 = r3.h     // Catch:{ Exception -> 0x00bd }
            com.alipay.mobile.rome.syncservice.up.SyncUplinkCallbackType r7 = com.alipay.mobile.rome.syncservice.up.SyncUplinkCallbackType.TYPE_LIKE_RPC     // Catch:{ Exception -> 0x00bd }
            if (r5 != r7) goto L_0x009c
            java.lang.String r5 = r3.msgData     // Catch:{ Exception -> 0x00bd }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00bd }
            if (r5 == 0) goto L_0x009c
            java.io.Serializable r5 = r3.reqData     // Catch:{ Exception -> 0x00bd }
            if (r5 == 0) goto L_0x009c
            java.io.Serializable r5 = r3.reqData     // Catch:{ Exception -> 0x00bd }
            r7 = 1
            com.alibaba.fastjson.serializer.SerializerFeature[] r7 = new com.alibaba.fastjson.serializer.SerializerFeature[r7]     // Catch:{ Exception -> 0x00bd }
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect     // Catch:{ Exception -> 0x00bd }
            r7[r6] = r8     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) r5, (com.alibaba.fastjson.serializer.SerializerFeature[]) r7)     // Catch:{ Exception -> 0x00bd }
            r4.payload = r5     // Catch:{ Exception -> 0x00bd }
        L_0x009c:
            java.lang.String r5 = r3.b     // Catch:{ Exception -> 0x00bd }
            r4.cmk = r5     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = r3.bizId     // Catch:{ Exception -> 0x00bd }
            r4.biz_id = r3     // Catch:{ Exception -> 0x00bd }
            r2.add(r4)     // Catch:{ Exception -> 0x00bd }
            goto L_0x0038
        L_0x00a8:
            com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode5001 r10 = new com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode5001     // Catch:{ Exception -> 0x00bd }
            r10.<init>()     // Catch:{ Exception -> 0x00bd }
            r10.client_sync_data = r2     // Catch:{ Exception -> 0x00bd }
            long r2 = (long) r9     // Catch:{ Exception -> 0x00bd }
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x00bd }
            r10.seq = r9     // Catch:{ Exception -> 0x00bd }
            r9 = 5001(0x1389, float:7.008E-42)
            byte[] r0 = com.alipay.mobile.rome.syncsdk.util.f.a((com.squareup.wire.Message) r10, (int) r9)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00d4
        L_0x00bd:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "sendSync5001Msg [ Exception="
            r10.<init>(r2)
            r10.append(r9)
            java.lang.String r9 = " ]"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r1, r9)
        L_0x00d4:
            return r0
        L_0x00d5:
            java.lang.String r9 = "sendSync5001Msg: uplinkMsgItemList size is zero or null"
            com.alipay.mobile.rome.syncsdk.util.c.a(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncservice.c.a.f.a(int, java.util.List):byte[]");
    }
}
