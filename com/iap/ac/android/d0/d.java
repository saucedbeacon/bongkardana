package com.iap.ac.android.d0;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.b0.a;
import com.iap.ac.android.b0.c;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.m0.b;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.mpm.node.base.NodeType;

public class d extends c {

    /* renamed from: o  reason: collision with root package name */
    public boolean f9701o;
    public e p = new e();

    public d(@NonNull Context context, @NonNull String str, boolean z, ACDecodeConfig aCDecodeConfig, String str2, @NonNull IDecodeCallback iDecodeCallback) {
        super("GofOrderCode", context, str, str2, iDecodeCallback);
        this.c = aCDecodeConfig;
        this.f9701o = z;
    }

    public void a(@NonNull b bVar, @NonNull a aVar) {
        super.a(bVar, aVar);
        NodeType nodeType = bVar.f9747a;
        if (NodeType.DecodeOrder.equals(nodeType)) {
            this.k = aVar.b;
            e eVar = this.p;
            eVar.f9693a = aVar.f9675a;
            eVar.a(this, (com.iap.ac.android.n0.b) bVar);
            return;
        }
        a(nodeType);
    }

    public void e() {
        if (!f()) {
            b();
            return;
        }
        super.e();
        this.p.a(this, new com.iap.ac.android.n0.b(this.h, this.f9701o));
    }

    public boolean f() {
        ConfigCenter.INSTANCE.refreshConfigs();
        boolean mpmGofOrderToggle = ConfigCenter.INSTANCE.getMpmGofOrderToggle();
        StringBuilder sb = new StringBuilder("GofOrderCodeBiz toggle is ");
        sb.append(mpmGofOrderToggle);
        ACLog.i(Constants.TAG, sb.toString());
        return mpmGofOrderToggle;
    }

    public void a(@NonNull b bVar) {
        super.a(bVar);
        NodeType nodeType = bVar.f9747a;
        if (NodeType.DecodeOrder.equals(nodeType)) {
            c();
        } else if (NodeType.OpenUrl.equals(nodeType)) {
            a((com.iap.ac.android.s0.a) bVar);
        }
    }

    public void a(@NonNull b bVar, @NonNull com.iap.ac.android.m0.c cVar) {
        super.a(bVar, cVar);
        if (NodeType.DecodeOrder.equals(cVar.b())) {
            com.iap.ac.android.n0.c cVar2 = (com.iap.ac.android.n0.c) cVar;
            if (DecodeActionType.PAY.equalsIgnoreCase(cVar2.f)) {
                this.i = cVar2.i;
            }
            this.n = cVar2.m;
            a();
        }
    }

    public void a(Result result) {
        boolean equalsIgnoreCase = ACConstants.Scene.SOURCE_FROM_WEBVIEW.equalsIgnoreCase(this.b);
        boolean z = !TextUtils.isEmpty(this.i);
        if (this.k != null) {
            try {
                if (!ConfigCenter.INSTANCE.getIsvToggle()) {
                    this.k.closeWebview();
                } else if (z && !equalsIgnoreCase) {
                    this.k.loadUrl(this.i);
                    a(this.k);
                }
            } catch (Exception e) {
                String concat = "GofOrderCodeBiz redirectUrl error:".concat(String.valueOf(e));
                ACLog.e(Constants.TAG, concat);
                ACLogEvent.exceptionLog(concat);
            }
        }
        if (!z || !equalsIgnoreCase) {
            ACLog.i(Constants.TAG, String.format("payment redirect url  is %s, scene is %s", new Object[]{this.i, this.b}));
            return;
        }
        ACLog.i(Constants.TAG, "return to web page and reload paymentRedirectUrl");
        result.closeWebpage = false;
        result.merchantResultPageUrl = this.i;
    }
}
