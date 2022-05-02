package com.alipay.mobile.rome.syncservice.b;

import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.rome.longlinkservice.LongLinkMsgConstants;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.mobile.rome.syncservice.c.g;
import com.alipay.mobile.rome.syncservice.model.DownstreamDataRequest;
import com.alipay.mobile.rome.syncservice.sync.e.b;
import java.util.Arrays;
import o.restorePresenterStates;

public final class a implements com.alipay.mobile.rome.syncsdk.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f9467a = "LongLinkCallbackImpl";
    private volatile Context b;

    public a(Context context) {
        this.b = context;
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder("processPacket: [ default channel ] [ appId=");
        sb.append(str);
        sb.append(" ][ appData=");
        sb.append(str2);
        sb.append(" ]");
        c.b("LongLinkCallbackImpl", sb.toString());
        if (str == null || str.length() <= 0) {
            c.c("LongLinkCallbackImpl", "processPacket:  [ default channel ] [ appId=null or empty ]");
        }
        restorePresenterStates length = restorePresenterStates.length(this.b);
        String concat = LongLinkMsgConstants.LONGLINK_ACTION_CMD_TRANSFER.concat(String.valueOf(str));
        Intent intent = new Intent(concat);
        intent.putExtra("payload", str2);
        length.setMin(intent);
        StringBuilder sb2 = new StringBuilder("processPacket:  [ default channel ] sendBroadcast [ action = ");
        sb2.append(concat);
        sb2.append("]");
        c.a("LongLinkCallbackImpl", sb2.toString());
    }

    public final void a(byte[] bArr) {
        b a2 = b.a();
        if (!f.b(bArr)) {
            c.b("SyncMsgReceiver", "recvSyncMsg pb version is wrong.");
            return;
        }
        int a3 = f.a(bArr);
        StringBuilder sb = new StringBuilder("recvSyncMsg[length:");
        sb.append(bArr.length);
        sb.append(" ][sOpcode:");
        sb.append(a3);
        sb.append("]");
        c.b("SyncMsgReceiver", sb.toString());
        DownstreamDataRequest downstreamDataRequest = new DownstreamDataRequest();
        downstreamDataRequest.f9477a = Arrays.copyOfRange(bArr, 3, bArr.length);
        downstreamDataRequest.b = DownstreamDataRequest.DataSource.longlink;
        g gVar = a2.f9497a;
        com.alipay.mobile.rome.syncservice.c.a aVar = gVar.f9472a.get(String.valueOf(a3));
        if (aVar == null && (aVar = g.a(a3)) != null) {
            gVar.f9472a.put(String.valueOf(a3), aVar);
        }
        if (aVar != null) {
            aVar.a(downstreamDataRequest);
        }
        com.alipay.mobile.rome.syncservice.a.a.a();
        com.alipay.mobile.rome.syncsdk.b.a.a().a("new_device", "false");
    }

    public final void a() {
        c.b("LongLinkCallbackImpl", "onLongLinkRegistered: ");
        com.alipay.mobile.rome.syncservice.sync.b.a().b();
        com.alipay.mobile.rome.syncservice.up.b.a().b();
    }

    public final void b() {
        com.alipay.mobile.rome.syncservice.sync.b.a().b();
    }

    public final void c() {
        com.alipay.mobile.rome.syncservice.c.a.a a2 = com.alipay.mobile.rome.syncservice.sync.b.a().f9485a.a(3001);
        if (a2 != null) {
            a2.a();
        }
        com.alipay.mobile.rome.syncservice.up.b.a().b();
    }
}
