package com.alipay.mobile.rome.syncsdk.transport.c;

import com.alipay.mobile.rome.syncsdk.msg.MsgInfo;
import com.alipay.mobile.rome.syncsdk.msg.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import org.json.JSONException;
import org.json.JSONObject;

public class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9443a = h.class.getSimpleName();
    private final a b;

    public h(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 4;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        c.b(f9443a, "processPacket: [ PacketListenerImplNotification ] ");
        String f = aVar.f();
        if (f.length() == 0) {
            c.c(f9443a, "processPacket: [ jsonString=null ]");
        }
        try {
            JSONObject jSONObject = new JSONObject(f);
            MsgInfo msgInfo = new MsgInfo();
            msgInfo.setUserId(jSONObject.optString("linkToken"));
            msgInfo.setMsgData(jSONObject.optString("msgData"));
            msgInfo.setMsgKey(jSONObject.optString("msgKey"));
            msgInfo.setTimestamp(jSONObject.optString("msgCreateTime"));
            StringBuilder sb = new StringBuilder();
            sb.append(msgInfo.getTimestamp());
            sb.append(msgInfo.getMsgKey());
            msgInfo.setPerMsgId(sb.toString());
            String str = f9443a;
            StringBuilder sb2 = new StringBuilder("handlePushMsg:[ msgkey=");
            sb2.append(msgInfo.getMsgKey());
            sb2.append(" ][ timestamp=");
            sb2.append(msgInfo.getTimestamp());
            sb2.append(" ][ userId=");
            sb2.append(msgInfo.getUserId());
            sb2.append(" ][ msgData=");
            sb2.append(msgInfo.getMsgData());
            sb2.append(" ]");
            c.a(str, sb2.toString());
            c.b(f9443a, "dispatchMsgData: ");
            b bVar = new b(this.b.f9416a);
            bVar.a(msgInfo.getUserId());
            if (bVar.a(msgInfo)) {
                c.c(f9443a, "dispatchMsgData: Duplicated Packet ");
            } else {
                bVar.b(msgInfo);
                c.a(f9443a, "dispatchMsgData: saved msg ");
                if (this.b.l() == null) {
                    c.d(f9443a, "dispatchMsgData: [ packetNotifier=null ] ");
                } else {
                    this.b.l().a(msgInfo.getMsgData());
                }
            }
            c.b(f9443a, "handlePacketResponse: ");
            if (aVar.b() != 1) {
                com.alipay.mobile.rome.syncsdk.transport.b.a a2 = com.alipay.mobile.rome.syncsdk.transport.b.c.a(this.b.m());
                a2.a(4);
                a2.b(1);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("linkToken", com.alipay.mobile.rome.syncsdk.a.a.a().f9405a);
                    jSONObject2.put("msgKey", msgInfo.getMsgKey());
                    a2.a(jSONObject2.toString());
                    this.b.k().a(a2);
                } catch (Exception e) {
                    String str2 = f9443a;
                    StringBuilder sb3 = new StringBuilder("handlePacketResponse: [ Exception=");
                    sb3.append(e);
                    sb3.append(" ]");
                    c.d(str2, sb3.toString());
                }
            }
        } catch (JSONException e2) {
            String str3 = f9443a;
            StringBuilder sb4 = new StringBuilder("processPacket: [ Exception=");
            sb4.append(e2);
            sb4.append(" ]");
            c.d(str3, sb4.toString());
        }
    }
}
