package com.iap.ac.android.d0;

import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.node.base.NodeType;
import org.json.JSONObject;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f9698a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b c;

    public a(b bVar, JSONObject jSONObject, c cVar) {
        this.c = bVar;
        this.f9698a = jSONObject;
        this.b = cVar;
    }

    public void run() {
        this.c.f9699o.sendBridgeResult(this.f9698a);
        if (NodeType.Pay.equals(this.b.b()) && this.b.a() && !ConfigCenter.INSTANCE.getIsvToggle()) {
            b bVar = this.c;
            if (bVar.k != null) {
                bVar.d();
            }
        }
    }
}
