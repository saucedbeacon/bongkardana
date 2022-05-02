package com.iap.ac.android.d0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.b0.a;
import com.iap.ac.android.b0.c;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.MPM;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.mpm.base.model.tradepay.TradePayResultUtils;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import com.iap.ac.android.mpm.node.base.NodeType;
import com.iap.ac.android.p0.d;
import com.iap.ac.android.p0.e;
import com.iap.ac.android.p0.f;
import id.dana.data.constant.BranchLinkConstant;

public class b extends c {

    /* renamed from: o  reason: collision with root package name */
    public ContainerBridgeContext f9699o;
    public String p;
    public c q = new c();

    public b(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull ACDecodeConfig aCDecodeConfig, @NonNull IDecodeCallback iDecodeCallback) {
        super("GofCollectionCode", context, str, str2, iDecodeCallback);
        this.c = aCDecodeConfig;
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar, @NonNull a aVar) {
        super.a(bVar, aVar);
        NodeType nodeType = bVar.f9747a;
        String cnAcquireId = TextUtils.isEmpty(this.c.acquireId) ? MPM.get().getCnAcquireId() : this.c.acquireId;
        if (NodeType.PrepareAuth.equals(nodeType)) {
            this.k = aVar.b;
            ((e) bVar).c = cnAcquireId;
            c cVar = this.q;
            cVar.f9693a = aVar.f9675a;
            cVar.a(this, bVar);
        } else if (NodeType.SwapOrder.equals(nodeType)) {
            this.k = aVar.b;
            this.f9699o = aVar.c;
            ((com.iap.ac.android.r0.a) bVar).d = cnAcquireId;
            c cVar2 = this.q;
            cVar2.f9693a = aVar.f9675a;
            cVar2.a(this, bVar);
        } else if (NodeType.DecodeOrder.equals(nodeType)) {
            this.k = aVar.b;
            c cVar3 = this.q;
            cVar3.f9693a = aVar.f9675a;
            cVar3.a(this, bVar);
        } else if (NodeType.CommonHook.equals(nodeType)) {
            this.k = aVar.b;
            c cVar4 = this.q;
            cVar4.f9693a = aVar.f9675a;
            cVar4.a(this, bVar);
        } else {
            a(nodeType);
        }
    }

    public void b(@NonNull com.iap.ac.android.m0.c cVar) {
        super.b(cVar);
        if (NodeType.GetAuthCode.equals(cVar.b())) {
            d dVar = (d) cVar;
            if (dVar.e) {
                try {
                    this.k.loadUrl(this.p.replace("${AC_AUTHCODE}", dVar.f));
                } catch (Exception e) {
                    String concat = "GofCollectionCode redirectUrl error:".concat(String.valueOf(e));
                    ACLog.e(Constants.TAG, concat);
                    d dVar2 = new d();
                    Result result = new Result();
                    result.resultCode = ResultCode.INVALID_NETWORK;
                    result.resultMessage = "Oops! System busy. Try again later!";
                    dVar2.b = ResultCode.INVALID_NETWORK;
                    dVar2.c = concat;
                    dVar2.d = BranchLinkConstant.OauthParams.REDIRECT_URL;
                    dVar2.e = false;
                    a((com.iap.ac.android.m0.c) dVar2);
                }
            }
        }
    }

    public void c(@NonNull com.iap.ac.android.m0.c cVar) {
        if (EntranceType.TradePayPlugin.equals(this.m)) {
            Result result = cVar.f9748a;
            if (this.f9699o != null) {
                new Handler(Looper.getMainLooper()).post(new a(this, TradePayResultUtils.getTradePayResultJsonObject(result.resultCode), cVar));
            }
        } else if (cVar.a() && NodeType.Pay.equals(cVar.b())) {
            try {
                if (!ConfigCenter.INSTANCE.getIsvToggle()) {
                    this.k.closeWebview();
                } else if (!TextUtils.isEmpty(this.i)) {
                    this.k.loadUrl(this.i);
                    a(this.k);
                }
            } catch (Exception e) {
                String concat = "GofCollectionCode redirectUrl error:".concat(String.valueOf(e));
                ACLog.e(Constants.TAG, concat);
                ACLogEvent.exceptionLog(concat);
            }
        }
    }

    public void e() {
        if (!f()) {
            b();
            return;
        }
        super.e();
        com.iap.ac.android.s0.a aVar = new com.iap.ac.android.s0.a();
        aVar.c = this.h;
        a(aVar);
        this.q.a(this, (com.iap.ac.android.m0.b) aVar);
    }

    public boolean f() {
        ConfigCenter.INSTANCE.refreshConfigs();
        boolean mpmGofCollectionOrderToggle = ConfigCenter.INSTANCE.getMpmGofCollectionOrderToggle();
        StringBuilder sb = new StringBuilder("GofCollectionCodeCodeBiz toggle is ");
        sb.append(mpmGofCollectionOrderToggle);
        ACLog.i(Constants.TAG, sb.toString());
        return mpmGofCollectionOrderToggle;
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar) {
        super.a(bVar);
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar, @NonNull com.iap.ac.android.m0.c cVar) {
        super.a(bVar, cVar);
        NodeType nodeType = bVar.f9747a;
        if (cVar.a() && NodeType.PrepareAuth.equals(nodeType)) {
            this.p = ((f) cVar).f.authRedirectUrl;
        } else if (NodeType.DecodeOrder.equals(bVar.f9747a)) {
            com.iap.ac.android.n0.c cVar2 = (com.iap.ac.android.n0.c) cVar;
            if (DecodeActionType.PAY.equalsIgnoreCase(cVar2.f)) {
                this.i = cVar2.i;
            }
            this.n = cVar2.m;
        }
    }
}
