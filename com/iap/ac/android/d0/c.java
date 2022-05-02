package com.iap.ac.android.d0;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.c0.b;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.base.interfaces.INodeCallback;
import com.iap.ac.android.mpm.base.model.oauth.result.PrepareCollectionCodeAuthResult;
import com.iap.ac.android.mpm.node.base.NodeType;
import com.iap.ac.android.p0.d;
import com.iap.ac.android.p0.e;
import com.iap.ac.android.p0.f;
import id.dana.data.constant.BranchLinkConstant;
import java.util.List;

public class c extends b<b> {

    public class a implements INodeCallback<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.iap.ac.android.c0.a f9700a;
        public final /* synthetic */ com.iap.ac.android.p0.c b;

        public a(c cVar, com.iap.ac.android.c0.a aVar, com.iap.ac.android.p0.c cVar2) {
            this.f9700a = aVar;
            this.b = cVar2;
        }

        public void onResult(@NonNull Object obj) {
            d dVar = (d) obj;
            this.f9700a.a((com.iap.ac.android.m0.b) this.b, (com.iap.ac.android.m0.c) dVar);
            if (dVar.e) {
                this.f9700a.b(dVar);
            } else {
                this.f9700a.a((com.iap.ac.android.m0.c) dVar);
            }
        }
    }

    public void a(@NonNull b bVar, @NonNull com.iap.ac.android.m0.b bVar2) {
        String str = "Oops! System busy. Try again later!";
        NodeType nodeType = bVar2.f9747a;
        if (NodeType.OpenUrl.equals(nodeType)) {
            a((com.iap.ac.android.c0.a) bVar, (com.iap.ac.android.s0.a) bVar2);
        } else if (NodeType.PrepareAuth.equals(nodeType)) {
            e eVar = (e) bVar2;
            bVar.a((com.iap.ac.android.m0.b) eVar);
            f fVar = new f();
            Result result = new Result();
            try {
                PrepareCollectionCodeAuthResult a2 = new com.iap.ac.android.t0.a().a(eVar.b, eVar.c);
                if (a2 == null) {
                    ACLog.w(Constants.TAG, "collection code prepare result is null");
                    result.resultCode = ResultCode.INVALID_NETWORK;
                    result.resultMessage = str;
                    fVar.f9748a = result;
                    fVar.b = ResultCode.INVALID_NETWORK;
                    fVar.c = "collection code prepare result is null";
                    fVar.d = "prepare";
                } else if (a2.success) {
                    fVar.e = true;
                    fVar.f = a2;
                } else {
                    ACLog.w(Constants.TAG, "collection code prepare result.success is false");
                    String str2 = a2.errorCode;
                    result.resultCode = str2;
                    String str3 = a2.errorMessage;
                    result.resultMessage = str3;
                    fVar.f9748a = result;
                    if (str2 == null) {
                        str2 = ResultCode.INVALID_NETWORK;
                    }
                    fVar.b = str2;
                    if (str3 == null) {
                        str3 = str;
                    }
                    fVar.c = str3;
                    fVar.d = "prepare";
                }
            } catch (Exception e) {
                StringBuilder a3 = com.iap.ac.android.a.a.a("prepareCollectionCodeAuth error:");
                a3.append(Utils.e(e));
                String obj = a3.toString();
                result.resultCode = ResultCode.INVALID_NETWORK;
                result.resultMessage = str;
                fVar.f9748a = result;
                fVar.b = ResultCode.INVALID_NETWORK;
                if (obj != null) {
                    str = obj;
                }
                fVar.c = str;
                fVar.d = "prepare";
            }
            bVar.a((com.iap.ac.android.m0.b) eVar, (com.iap.ac.android.m0.c) fVar);
            if (fVar.e) {
                String str4 = ACManager.getInstance().getOAuthConfig().clientId;
                PrepareCollectionCodeAuthResult prepareCollectionCodeAuthResult = fVar.f;
                a((com.iap.ac.android.c0.a) bVar, new com.iap.ac.android.p0.c(str4, prepareCollectionCodeAuthResult.authClientId, prepareCollectionCodeAuthResult.scopes));
                return;
            }
            bVar.a((com.iap.ac.android.m0.c) fVar);
        } else if (NodeType.SwapOrder.equals(nodeType)) {
            a((com.iap.ac.android.c0.a) bVar, (com.iap.ac.android.r0.a) bVar2);
        } else if (NodeType.CommonHook.equals(nodeType)) {
            a((com.iap.ac.android.c0.a) bVar, (com.iap.ac.android.o0.b) bVar2);
        } else if (NodeType.DecodeOrder.equals(nodeType)) {
            a((com.iap.ac.android.c0.a) bVar, (com.iap.ac.android.n0.b) bVar2);
        } else {
            ACLog.w(Constants.TAG, "GofCollectionCodeRoute node type is illegal".concat(String.valueOf(nodeType)));
        }
    }

    public final void a(com.iap.ac.android.c0.a aVar, com.iap.ac.android.p0.c cVar) {
        aVar.a((com.iap.ac.android.m0.b) cVar);
        com.iap.ac.android.p0.b bVar = new com.iap.ac.android.p0.b();
        a aVar2 = new a(this, aVar, cVar);
        String str = cVar.b;
        String str2 = cVar.c;
        List<String> list = cVar.d;
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_get_authcode_enter").addParams("mode", (Object) 0).addParams("clientId", str).addParams(GriverBaseConstants.KEY_CLIENT_ID, str2).addParams(BranchLinkConstant.OauthParams.SCOPES, (Object) list).event();
        d dVar = new d();
        SPIManager.getInstance().getAuthCode(str, str2, list, new com.iap.ac.android.p0.a(bVar, SystemClock.elapsedRealtime(), dVar, aVar2));
    }
}
