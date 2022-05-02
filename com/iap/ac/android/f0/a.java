package com.iap.ac.android.f0;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.m0.b;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.MPM;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.hook.PreCreateOrderConfig;
import com.iap.ac.android.mpm.base.model.hook.request.TradePayParams;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import com.iap.ac.android.mpm.node.base.NodeType;
import com.iap.ac.android.q0.d;
import java.util.Map;

public class a extends com.iap.ac.android.c0.a {
    public final Map<String, String> e;
    public final AclAPIContext f;
    public final TradePayParams g;

    public a(Map<String, String> map, TradePayParams tradePayParams, AclAPIContext aclAPIContext, IDecodeCallback iDecodeCallback) {
        this.e = map;
        this.g = tradePayParams;
        this.f = aclAPIContext;
        this.d = iDecodeCallback;
    }

    public void a(@NonNull b bVar, @NonNull com.iap.ac.android.b0.a aVar) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("MiniProgramTradePayBiz onProcessResume ");
        a2.append(bVar.f9747a);
        ACLog.i(Constants.TAG, a2.toString());
    }

    public void b(@NonNull c cVar) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("MiniProgramTradePayBiz onProcessPause ");
        a2.append(cVar.b());
        ACLog.i(Constants.TAG, a2.toString());
    }

    public boolean d() {
        ConfigCenter.INSTANCE.refreshConfigs();
        boolean mpmMiniAppToggle = ConfigCenter.INSTANCE.getMpmMiniAppToggle();
        StringBuilder sb = new StringBuilder("MiniProgramTradePayBiz toggle is ");
        sb.append(mpmMiniAppToggle);
        ACLog.i(Constants.TAG, sb.toString());
        return mpmMiniAppToggle;
    }

    public void e() {
        String str;
        String str2;
        b bVar;
        com.iap.ac.android.r0.a aVar = null;
        ACManager.getInstance().fetchConfigAsync((IConfigCallback) null);
        if (!d()) {
            b();
            return;
        }
        b bVar2 = new b();
        bVar2.f9693a = EntranceType.TradePayPlugin;
        String str3 = this.e.get("acquireId");
        if (TextUtils.isEmpty(str3)) {
            str3 = MPM.get().getCnAcquireId();
        }
        if (!TextUtils.isEmpty(this.g.tradeNo)) {
            String str4 = this.g.tradeNo;
            com.iap.ac.android.r0.a aVar2 = new com.iap.ac.android.r0.a(this.e, str4, str3, true);
            str = str4;
            aVar = aVar2;
        } else {
            if (!TextUtils.isEmpty(this.g.orderStr)) {
                str2 = this.g.orderStr;
                PreCreateOrderConfig preCreateOrderConfig = new PreCreateOrderConfig();
                preCreateOrderConfig.orderStr = str2;
                preCreateOrderConfig.isOrderStrFromMiniProgram = true;
                preCreateOrderConfig.acquirerId = str3;
                bVar = new com.iap.ac.android.o0.b(preCreateOrderConfig);
            } else if (!TextUtils.isEmpty(this.g.paymentUrl)) {
                str2 = this.g.paymentUrl;
                bVar = new com.iap.ac.android.n0.b(str2, true);
            } else {
                str = null;
            }
            b bVar3 = bVar;
            str = str2;
            aVar = bVar3;
        }
        this.f9692a = SystemClock.elapsedRealtime();
        a(str, "MiniProgramTradePay");
        if (aVar == null) {
            d dVar = new d();
            Result result = new Result();
            dVar.b = ResultCode.PARAM_ILLEGAL;
            result.resultCode = ResultCode.PARAM_ILLEGAL;
            result.resultMessage = "Oops! System busy. Try again later!";
            dVar.c = "all parameters are empty";
            dVar.f9748a = result;
            dVar.d = DecodeActionType.PAY;
            a((c) dVar);
            return;
        }
        NodeType nodeType = aVar.f9747a;
        if (NodeType.SwapOrder.equals(nodeType)) {
            bVar2.a((com.iap.ac.android.c0.a) this, aVar);
        } else if (NodeType.CommonHook.equals(nodeType)) {
            bVar2.a((com.iap.ac.android.c0.a) this, (com.iap.ac.android.o0.b) aVar);
        } else if (NodeType.DecodeOrder.equals(nodeType)) {
            bVar2.a((com.iap.ac.android.c0.a) this, (com.iap.ac.android.n0.b) aVar);
        } else {
            ACLog.w(Constants.TAG, "MiniProgramTradePayRoute node type is illegal".concat(String.valueOf(nodeType)));
        }
    }

    public void a(@NonNull c cVar) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("MiniProgramTradePayBiz onProcessFinish ");
        a2.append(cVar.b());
        ACLog.i(Constants.TAG, a2.toString());
        a(cVar, "MiniProgramTradePay", (String) null);
        com.iap.ac.android.c0.a.a(cVar.f9748a, this.d);
    }

    public void a(@NonNull b bVar) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("MiniProgramTradePayBiz onNodeBegin ");
        a2.append(bVar.f9747a);
        ACLog.i(Constants.TAG, a2.toString());
        if (NodeType.Pay.equals(bVar.f9747a)) {
            ((com.iap.ac.android.q0.c) bVar).e = this.f;
        }
    }

    public void a(@NonNull b bVar, @NonNull c cVar) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("MiniProgramTradePayBiz onNodeEnd ");
        a2.append(cVar.b());
        ACLog.i(Constants.TAG, a2.toString());
    }
}
