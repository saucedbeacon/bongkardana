package com.iap.ac.android.e0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.b0.c;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.m0.b;
import com.iap.ac.android.mpm.DecodeParameter;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;
import com.iap.ac.android.mpm.node.base.NodeType;
import id.dana.data.constant.BranchLinkConstant;
import o.FontRes;

public class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public boolean f9708o;
    public String p;
    public String q;
    public b r;

    public a(@NonNull Context context, @NonNull String str, boolean z, @NonNull DecodeParameter decodeParameter, ACDecodeConfig aCDecodeConfig, @NonNull IDecodeCallback iDecodeCallback) {
        super("GolOrderCode", context, str, decodeParameter.scene, iDecodeCallback);
        this.f9708o = z;
        this.p = decodeParameter.merchantType;
        this.q = decodeParameter.sourceAppPackageName;
        this.c = aCDecodeConfig;
        if ((context instanceof Activity) && TextUtils.isEmpty(this.q)) {
            try {
                Uri min = FontRes.setMin((Activity) context);
                if (min != null) {
                    this.q = min.getHost();
                }
            } catch (Throwable th) {
                ACLog.e(Constants.TAG, th.getMessage());
                StringBuilder sb = new StringBuilder("parsePkgName error:");
                sb.append(th.getMessage());
                ACLogEvent.exceptionLog(sb.toString());
            }
            if (TextUtils.isEmpty(this.q)) {
                this.q = ((Activity) context).getCallingPackage();
            }
            StringBuilder a2 = com.iap.ac.android.a.a.a("sourceAppPackageName is ");
            a2.append(this.q);
            ACLog.i(Constants.TAG, a2.toString());
        }
        this.r = new b();
    }

    public void a(@NonNull b bVar, @NonNull com.iap.ac.android.b0.a aVar) {
        super.a(bVar, aVar);
        NodeType nodeType = bVar.f9747a;
        if (NodeType.DecodeOrder.equals(nodeType)) {
            this.k = aVar.b;
            b bVar2 = this.r;
            bVar2.f9693a = aVar.f9675a;
            bVar2.a(this, (com.iap.ac.android.n0.b) bVar);
            return;
        }
        a(nodeType);
    }

    public void c(@NonNull com.iap.ac.android.m0.c cVar) {
        if (!cVar.a() || !NodeType.Pay.equals(cVar.b())) {
            Result result = cVar.f9748a;
            if (result != null && TextUtils.equals(result.resultCode, "USER_CANCEL") && this.p.equals(ACConstants.MerchantType.IS_APP)) {
                String str = null;
                if (!TextUtils.isEmpty(this.j)) {
                    str = this.j;
                } else if (!TextUtils.isEmpty(this.i)) {
                    str = this.i;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(str);
                    ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_cancel_redirect_to_merchant").addParams(BranchLinkConstant.OauthParams.REDIRECT_URL, str).addParams(ACConstants.PARAMETER_KEY_AC_MERCHANT_TYPE, this.p).event();
                    return;
                }
                return;
            }
            return;
        }
        a(cVar.f9748a);
    }

    public void e() {
        if (!f()) {
            b();
            return;
        }
        super.e();
        this.r.a(this, new com.iap.ac.android.n0.b(this.h, this.f9708o));
    }

    public boolean f() {
        ConfigCenter.INSTANCE.refreshConfigs();
        boolean mpmGolOrderToggle = ConfigCenter.INSTANCE.getMpmGolOrderToggle();
        StringBuilder sb = new StringBuilder("GolOrderCodeBiz toggle is ");
        sb.append(mpmGolOrderToggle);
        ACLog.i(Constants.TAG, sb.toString());
        return mpmGolOrderToggle;
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
                this.j = cVar2.j;
                if (!TextUtils.isEmpty(cVar2.l)) {
                    this.p = cVar2.l;
                }
            }
            this.n = cVar2.m;
            a();
        }
    }

    public void a(Result result) {
        d();
        if (TextUtils.isEmpty(this.i)) {
            ACLog.i(Constants.TAG, "GolOrderCodeBiz payment redirect url is empty");
            return;
        }
        if ("H5".equalsIgnoreCase(this.p)) {
            ACLog.e(Constants.TAG, "merchant is h5, redirect to source app");
            if (!TextUtils.isEmpty(this.q)) {
                Intent launchIntentForPackage = this.g.getPackageManager().getLaunchIntentForPackage(this.q);
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setPackage((String) null);
                    launchIntentForPackage.setFlags(274726912);
                    try {
                        this.g.startActivity(launchIntentForPackage);
                    } catch (Exception e) {
                        String concat = "H5 startActivity error:".concat(String.valueOf(e));
                        ACLog.e(Constants.TAG, concat);
                        ACLogEvent.exceptionLog(concat);
                    }
                }
            } else {
                ACLog.e(Constants.TAG, String.format("merchant is h5, but sourceAppPackageName is invalid: %s, can not jump to source APP", new Object[]{this.q}));
            }
        } else if (ACConstants.MerchantType.IS_APP.equalsIgnoreCase(this.p)) {
            ACLog.e(Constants.TAG, "merchant is app, redirect to payRedirectUrl");
            a(this.i);
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_redirect_to_merchant").addParams("sourcePkgName", this.q).addParams(BranchLinkConstant.OauthParams.REDIRECT_URL, this.i).addParams(ACConstants.PARAMETER_KEY_AC_MERCHANT_TYPE, this.p).event();
    }

    public final void a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            this.g.startActivity(intent);
        } catch (Throwable th) {
            String concat = "App startActivity error:".concat(String.valueOf(th));
            ACLog.e(Constants.TAG, concat);
            ACLogEvent.exceptionLog(concat);
        }
    }
}
