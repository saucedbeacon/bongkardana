package com.iap.ac.android.c0;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.c0.a;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.base.interfaces.INodeCallback;
import com.iap.ac.android.mpm.base.model.hook.HookConstants;
import com.iap.ac.android.mpm.base.model.hook.PreCreateOrderConfig;
import com.iap.ac.android.mpm.base.model.payment.result.SwapOrderResult;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import com.iap.ac.android.mpm.interceptor.provider.UAProvider;
import com.iap.ac.android.q0.d;
import id.dana.data.constant.BranchLinkConstant;

public abstract class b<T extends a> {

    /* renamed from: a  reason: collision with root package name */
    public EntranceType f9693a = EntranceType.Decode;

    public class a implements INodeCallback<com.iap.ac.android.o0.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f9694a;
        public final /* synthetic */ com.iap.ac.android.o0.b b;

        public a(a aVar, com.iap.ac.android.o0.b bVar) {
            this.f9694a = aVar;
            this.b = bVar;
        }

        public void onResult(@NonNull Object obj) {
            com.iap.ac.android.o0.c cVar = (com.iap.ac.android.o0.c) obj;
            this.f9694a.a((com.iap.ac.android.m0.b) this.b, (com.iap.ac.android.m0.c) cVar);
            if (cVar.e) {
                b.this.a(this.f9694a, new com.iap.ac.android.n0.b(cVar.f, cVar.g));
                return;
            }
            this.f9694a.a((com.iap.ac.android.m0.c) cVar);
        }
    }

    /* renamed from: com.iap.ac.android.c0.b$b  reason: collision with other inner class name */
    public class C0027b implements INodeCallback<com.iap.ac.android.n0.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f9695a;
        public final /* synthetic */ com.iap.ac.android.n0.b b;

        public C0027b(a aVar, com.iap.ac.android.n0.b bVar) {
            this.f9695a = aVar;
            this.b = bVar;
        }

        public void onResult(@NonNull Object obj) {
            com.iap.ac.android.n0.c cVar = (com.iap.ac.android.n0.c) obj;
            this.f9695a.a((com.iap.ac.android.m0.b) this.b, (com.iap.ac.android.m0.c) cVar);
            if (cVar.e) {
                ACLog.i(Constants.TAG, String.format("DecodeOrderNodeResponse success, decodeAction = %s, entranceType = %s", new Object[]{cVar.f, b.this.f9693a}));
                if (DecodeActionType.PAY.equalsIgnoreCase(cVar.f)) {
                    com.iap.ac.android.q0.c cVar2 = new com.iap.ac.android.q0.c();
                    cVar2.b = cVar.g;
                    cVar2.c = cVar.h;
                    cVar2.d = cVar.i;
                    b.this.a(this.f9695a, cVar2);
                } else if (!DecodeActionType.OPEN_URL.equalsIgnoreCase(cVar.f)) {
                } else {
                    if (EntranceType.Decode.equals(b.this.f9693a)) {
                        com.iap.ac.android.s0.a aVar = new com.iap.ac.android.s0.a();
                        aVar.c = cVar.k;
                        b.this.a(this.f9695a, aVar);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.this.f9693a);
                    sb.append(" open url is not support");
                    ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_decode_params_error", sb.toString());
                }
            } else {
                this.f9695a.a((com.iap.ac.android.m0.c) cVar);
            }
        }
    }

    public class c implements INodeCallback<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f9696a;
        public final /* synthetic */ com.iap.ac.android.q0.c b;

        public c(b bVar, a aVar, com.iap.ac.android.q0.c cVar) {
            this.f9696a = aVar;
            this.b = cVar;
        }

        public void onResult(@NonNull Object obj) {
            d dVar = (d) obj;
            this.f9696a.a((com.iap.ac.android.m0.b) this.b, (com.iap.ac.android.m0.c) dVar);
            this.f9696a.a((com.iap.ac.android.m0.c) dVar);
        }
    }

    public void a(a aVar, com.iap.ac.android.r0.a aVar2) {
        String str = "Oops! System busy. Try again later!";
        aVar.a((com.iap.ac.android.m0.b) aVar2);
        com.iap.ac.android.r0.b bVar = new com.iap.ac.android.r0.b();
        Result result = new Result();
        try {
            SwapOrderResult a2 = new com.iap.ac.android.v0.a().a(aVar2.b, aVar2.c, aVar2.d, aVar2.e);
            if (a2 == null) {
                ACLog.w(Constants.TAG, "swapOrder result is null");
                result.resultCode = ResultCode.INVALID_NETWORK;
                result.resultMessage = str;
                bVar.f9748a = result;
                bVar.b = ResultCode.INVALID_NETWORK;
                bVar.c = "swapOrder result is null";
                bVar.d = "swapOrder";
            } else if (!a2.success) {
                ACLog.w(Constants.TAG, "swapOrder result.success is false");
                String str2 = a2.errorCode;
                result.resultCode = str2;
                String str3 = a2.errorMessage;
                result.resultMessage = str3;
                bVar.f9748a = result;
                if (str2 == null) {
                    str2 = ResultCode.INVALID_NETWORK;
                }
                bVar.b = str2;
                if (str3 == null) {
                    str3 = str;
                }
                bVar.c = str3;
                bVar.d = "swapOrder";
            } else {
                bVar.f9748a = result;
                bVar.f = a2.cashierUrl;
                bVar.g = a2.pspPaymentId;
                bVar.e = true;
            }
        } catch (Exception e) {
            String concat = "swap order error:".concat(String.valueOf(e));
            result.resultCode = ResultCode.INVALID_NETWORK;
            result.resultMessage = str;
            bVar.f9748a = result;
            bVar.b = ResultCode.INVALID_NETWORK;
            if (concat != null) {
                str = concat;
            }
            bVar.c = str;
            bVar.d = "swapOrder";
        }
        aVar.a((com.iap.ac.android.m0.b) aVar2, (com.iap.ac.android.m0.c) bVar);
        if (bVar.e) {
            com.iap.ac.android.q0.c cVar = new com.iap.ac.android.q0.c();
            cVar.b = bVar.g;
            cVar.c = bVar.f;
            a(aVar, cVar);
            return;
        }
        aVar.a((com.iap.ac.android.m0.c) bVar);
    }

    public void a(a aVar, com.iap.ac.android.o0.b bVar) {
        aVar.a((com.iap.ac.android.m0.b) bVar);
        com.iap.ac.android.o0.a aVar2 = new com.iap.ac.android.o0.a();
        a aVar3 = new a(aVar, bVar);
        String str = bVar.b;
        if (HookConstants.HookCategory.HOOK_CATEGORY_TRADEPAY.equals(str)) {
            PreCreateOrderConfig preCreateOrderConfig = bVar.c;
            aVar2.a(aVar2.a().f9717a.a(preCreateOrderConfig), preCreateOrderConfig.isOrderStrFromMiniProgram, aVar3);
        } else if ("URL".equals(str)) {
            com.iap.ac.android.i0.a a2 = aVar2.a();
            aVar2.a(a2.f9717a.a(bVar.d), false, aVar3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.iap.ac.android.c0.a r13, com.iap.ac.android.n0.b r14) {
        /*
            r12 = this;
            java.lang.String r0 = "INVALID_NETWORK"
            r13.a((com.iap.ac.android.m0.b) r14)
            com.iap.ac.android.n0.a r1 = new com.iap.ac.android.n0.a
            r1.<init>()
            com.iap.ac.android.c0.b$b r2 = new com.iap.ac.android.c0.b$b
            r2.<init>(r13, r14)
            java.lang.String r13 = r14.b
            java.lang.String r3 = "scan"
            java.lang.String r4 = "decode error:"
            java.lang.String r5 = "IAPConnect"
            if (r13 == 0) goto L_0x0061
            java.lang.String r6 = "https://render.alipay.com/p/w/ac-fe-adaptor"
            boolean r6 = r13.startsWith(r6)
            if (r6 == 0) goto L_0x0061
            android.net.Uri r6 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r7 = "ACCodeValue"
            java.lang.String r6 = r6.getQueryParameter(r7)     // Catch:{ Exception -> 0x0033 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0033 }
            if (r7 != 0) goto L_0x0061
            r13 = r6
            goto L_0x0061
        L_0x0033:
            r13 = move-exception
            java.lang.String r14 = java.lang.String.valueOf(r13)
            java.lang.String r14 = r4.concat(r14)
            com.iap.ac.android.common.log.ACLog.e(r5, r14)
            com.iap.ac.android.n0.c r14 = new com.iap.ac.android.n0.c
            r14.<init>()
            com.iap.ac.android.biz.common.model.Result r0 = new com.iap.ac.android.biz.common.model.Result
            r0.<init>()
            java.lang.String r1 = "UNKNOWN_EXCEPTION"
            r14.b = r1
            r0.resultCode = r1
            java.lang.String r1 = "Oops! System busy. Try again later!"
            r0.resultMessage = r1
            java.lang.String r13 = com.iap.ac.android.biz.common.utils.Utils.e(r13)
            r14.c = r13
            r14.d = r3
            r14.f9748a = r0
            r2.onResult(r14)
            return
        L_0x0061:
            boolean r14 = r14.c
            com.iap.ac.android.n0.c r6 = new com.iap.ac.android.n0.c
            r6.<init>()
            com.iap.ac.android.g0.a r7 = new com.iap.ac.android.g0.a     // Catch:{ Exception -> 0x0189 }
            r7.<init>()     // Catch:{ Exception -> 0x0189 }
            com.iap.ac.android.mpm.base.model.decode.result.DecodeResult r13 = r7.a(r13, r14)     // Catch:{ Exception -> 0x0189 }
            if (r13 != 0) goto L_0x007f
            java.lang.String r13 = "decode result is null"
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r5, (java.lang.String) r13)     // Catch:{ Exception -> 0x0189 }
            r1.a(r6, r0, r13)     // Catch:{ Exception -> 0x0189 }
            r2.onResult(r6)     // Catch:{ Exception -> 0x0189 }
            return
        L_0x007f:
            boolean r14 = r13.success
            if (r14 != 0) goto L_0x00a8
            java.lang.String r14 = "decode result is false"
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r5, (java.lang.String) r14)
            com.iap.ac.android.n0.c r14 = new com.iap.ac.android.n0.c
            r14.<init>()
            com.iap.ac.android.biz.common.model.Result r0 = new com.iap.ac.android.biz.common.model.Result
            r0.<init>()
            java.lang.String r1 = r13.errorCode
            r0.resultCode = r1
            java.lang.String r1 = r13.errorMessage
            r0.resultMessage = r1
            r14.f9748a = r0
            java.lang.String r1 = r0.resultCode
            r14.b = r1
            java.lang.String r0 = r0.resultMessage
            r14.c = r0
            r14.d = r3
            goto L_0x0181
        L_0x00a8:
            java.lang.String r14 = r13.uri
            r3 = 0
            android.net.Uri r14 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r3 = r14.getHost()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00c5
        L_0x00b4:
            r4 = move-exception
            goto L_0x00b8
        L_0x00b6:
            r4 = move-exception
            r14 = r3
        L_0x00b8:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "decode action parse error:"
            java.lang.String r4 = r6.concat(r4)
            com.iap.ac.android.common.log.ACLog.e(r5, r4)
        L_0x00c5:
            com.iap.ac.android.n0.c r4 = new com.iap.ac.android.n0.c
            r4.<init>()
            if (r14 == 0) goto L_0x0178
            java.lang.String r6 = r14.getScheme()
            java.lang.String r7 = "ac"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0178
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x0178
            java.lang.String r6 = "pay"
            boolean r6 = r6.equalsIgnoreCase(r3)
            r7 = 1
            if (r6 == 0) goto L_0x0136
            com.iap.ac.android.n0.c r4 = new com.iap.ac.android.n0.c
            r4.<init>()
            com.iap.ac.android.biz.common.model.Result r6 = new com.iap.ac.android.biz.common.model.Result
            r6.<init>()
            r4.f9748a = r6
            java.lang.String r6 = "paymentId"
            java.lang.String r6 = r14.getQueryParameter(r6)
            java.lang.String r8 = "paymentUrl"
            java.lang.String r8 = r14.getQueryParameter(r8)
            java.lang.String r9 = "paymentRedirectUrl"
            java.lang.String r9 = r14.getQueryParameter(r9)
            java.lang.String r10 = "paymentCancelUrl"
            java.lang.String r10 = r14.getQueryParameter(r10)
            java.lang.String r11 = "terminalType"
            java.lang.String r14 = r14.getQueryParameter(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r6)
            if (r11 == 0) goto L_0x0127
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 == 0) goto L_0x0127
            java.lang.String r14 = "decode handle error without payment id"
            com.iap.ac.android.common.log.ACLog.e(r5, r14)
            r1.a(r4, r0, r14)
            goto L_0x0180
        L_0x0127:
            r4.e = r7
            r4.g = r6
            r4.h = r8
            r4.i = r9
            r4.j = r10
            r4.f = r3
            r4.l = r14
            goto L_0x0180
        L_0x0136:
            java.lang.String r6 = "open-url"
            boolean r6 = r6.equalsIgnoreCase(r3)
            if (r6 == 0) goto L_0x0167
            com.iap.ac.android.n0.c r4 = new com.iap.ac.android.n0.c
            r4.<init>()
            com.iap.ac.android.biz.common.model.Result r6 = new com.iap.ac.android.biz.common.model.Result
            r6.<init>()
            r4.f9748a = r6
            java.lang.String r6 = "url"
            java.lang.String r14 = r14.getQueryParameter(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r14)
            if (r6 != 0) goto L_0x015e
            r4.e = r7
            r4.k = r14
            r4.f = r3
            goto L_0x0180
        L_0x015e:
            java.lang.String r14 = "decode handle error without open url"
            com.iap.ac.android.common.log.ACLog.e(r5, r14)
            r1.a(r4, r0, r14)
            goto L_0x0180
        L_0x0167:
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "decode action is illegal"
            java.lang.String r14 = r3.concat(r14)
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r5, (java.lang.String) r14)
            r1.a(r4, r0, r14)
            goto L_0x0180
        L_0x0178:
            java.lang.String r14 = "decode action parse error: illegal uri"
            com.iap.ac.android.common.log.ACLog.e(r5, r14)
            r1.a(r4, r0, r14)
        L_0x0180:
            r14 = r4
        L_0x0181:
            java.lang.String r13 = r13.thirdPartyError
            r14.m = r13
            r2.onResult(r14)
            return
        L_0x0189:
            r13 = move-exception
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r4.concat(r13)
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r5, (java.lang.String) r13)
            r1.a(r6, r0, r13)
            r2.onResult(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.c0.b.a(com.iap.ac.android.c0.a, com.iap.ac.android.n0.b):void");
    }

    public void a(a aVar, com.iap.ac.android.q0.c cVar) {
        aVar.a((com.iap.ac.android.m0.b) cVar);
        com.iap.ac.android.q0.b bVar = new com.iap.ac.android.q0.b();
        c cVar2 = new c(this, aVar, cVar);
        String str = cVar.b;
        String str2 = cVar.c;
        String str3 = cVar.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_pay_start").addParams("paymentId", str).addParams("url", str2).addParams(BranchLinkConstant.OauthParams.REDIRECT_URL, str3).event();
        ACLog.i(Constants.TAG, String.format("decode.uri = %s, paymentId = %s, redirectUrl = %s", new Object[]{str2, str, str3}));
        SPIManager.getInstance().pay(str2, str, cVar.e, new com.iap.ac.android.q0.a(bVar, elapsedRealtime, cVar2));
    }

    public void a(a aVar, com.iap.ac.android.s0.a aVar2) {
        aVar.a((com.iap.ac.android.m0.b) aVar2);
        UAProvider.mockUserAgent(aVar2.e);
        ContainerParams containerParams = new ContainerParams(aVar2.c);
        containerParams.containerBundle = new Bundle();
        containerParams.containerBundle.putString(RVParams.LONG_BIZ_SCENARIO, "ACCode");
        containerParams.containerBundle.putString("AcBizProcessorKey", aVar2.b);
        com.iap.ac.android.s0.b bVar = new com.iap.ac.android.s0.b();
        try {
            WebContainer.getInstance("ac_biz").startContainer(aVar2.d, containerParams, aVar2.f);
        } catch (Exception e) {
            ACLog.w(Constants.TAG, "OpenUrlNode".concat(String.valueOf(e)));
            bVar.e = false;
            Result result = new Result();
            bVar.b = ResultCode.INVALID_NETWORK;
            result.resultCode = ResultCode.INVALID_NETWORK;
            result.resultMessage = "Oops! System busy. Try again later!";
            bVar.c = "open url exception ".concat(String.valueOf(e));
            bVar.d = "openUrl";
            bVar.f9748a = result;
        }
        aVar.a((com.iap.ac.android.m0.b) aVar2, (com.iap.ac.android.m0.c) bVar);
        if (bVar.e) {
            aVar.b(bVar);
        } else {
            aVar.a((com.iap.ac.android.m0.c) bVar);
        }
    }
}
