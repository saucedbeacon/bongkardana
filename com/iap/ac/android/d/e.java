package com.iap.ac.android.d;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.MiniProgramMetaData;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.model.acl.AclMiniProgramMetaData;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentInquireQuoteResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.utils.MiscUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.constant.BranchLinkConstant;
import java.util.HashMap;
import java.util.List;

public class e {
    public static AclAPIContext a() {
        return new AclAPIContext(AclAPIContext.API_SOURCE_AC, (AclMiniProgramMetaData) null, new HashMap());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT < 21;
    }

    public static APIContext a(AclAPIContext aclAPIContext) {
        MiniProgramMetaData miniProgramMetaData = null;
        if (aclAPIContext == null) {
            ACLog.i(Constants.TAG, "convertToAPIContext AclAPIContext is null");
            return new APIContext(AclAPIContext.API_SOURCE_AC, (MiniProgramMetaData) null, new HashMap());
        }
        String source = aclAPIContext.getSource();
        ACLog.i(Constants.TAG, String.format("convertToAPIContext source = %s", new Object[]{source}));
        AclMiniProgramMetaData aclMiniProgramMetaData = aclAPIContext.getAclMiniProgramMetaData();
        if (aclMiniProgramMetaData != null) {
            String appId = aclMiniProgramMetaData.getAppId();
            String merchantId = aclMiniProgramMetaData.getMerchantId();
            ACLog.i(Constants.TAG, String.format("convertToAPIContext appId = %s, merchantId = %s", new Object[]{appId, merchantId}));
            miniProgramMetaData = new MiniProgramMetaData(appId, merchantId);
        }
        return new APIContext(source, miniProgramMetaData, aclAPIContext.getExtendedInfo());
    }

    public static boolean b(String str, String str2) {
        String str3;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            ACLog.e(Constants.TAG, "isAcBizMiniProgram, appId is null");
            return false;
        }
        List regionMiniAppList = ConfigCenter.INSTANCE.getRegionMiniAppList();
        boolean z2 = true;
        if (regionMiniAppList != null && regionMiniAppList.contains(str)) {
            return true;
        }
        List<String> acsAppIdList = ConfigCenter.INSTANCE.getAcsAppIdList();
        if (acsAppIdList == null || !acsAppIdList.contains(str)) {
            str3 = "";
        } else {
            str3 = "whitelist";
            z = true;
        }
        if (z || str2 == null || !TextUtils.equals(str2, "GNETW7CN")) {
            z2 = z;
        } else {
            str3 = "source_site";
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mp_tradepay_call_is_ac_biz").addParams("appId", str).addParams("sourceSite", str2).addParams("matchType", str3).addParams("result", z2 ? DiskFormatter.TB : "F").event();
        return z2;
    }

    public static String a(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        if (commonConfig != null && (str5 = commonConfig.authCode) != null) {
            return str5;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ("PROD".equals(str2) && !TextUtils.isEmpty(str3)) {
            try {
                str4 = MiscUtils.md5(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            } catch (Exception e) {
                ACLog.e(Constants.TAG, "getSignMd5Str exception: ".concat(String.valueOf(e)));
                str4 = null;
            }
            if (TextUtils.equals(str3, str4)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                sb.append(str2.toLowerCase());
                sb.append("_gp");
                return sb.toString();
            }
        }
        if (!"PROD".equals(str2) && !"PRE".equals(str2)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2.toLowerCase());
        return sb2.toString();
    }

    public static void a(boolean z, @Nullable String str, long j, boolean z2) {
        if (!z2) {
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_finish").addParams("result", z ? DiskFormatter.TB : "F").addParams(BranchLinkConstant.OauthParams.REDIRECT_URL, str).addParams("timeCost", (Object) Long.valueOf(SystemClock.elapsedRealtime() - j)).event();
        }
    }

    public static void a(boolean z, long j) {
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_google_sign_contract_finish").addParams("result", z ? DiskFormatter.TB : "F").addParams("timeCost", (Object) Long.valueOf(SystemClock.elapsedRealtime() - j)).event();
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return JsonUtils.toJson(obj);
        } catch (Throwable th) {
            a.a("ConfigUtils, toJson exception: ", th, Constants.TAG);
            return null;
        }
    }

    public static String a(String str, String str2) {
        String[] a2;
        String[] strArr;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && (a2 = a(str)) != null && a2.length > 0) {
            for (String str3 : a2) {
                if (str3 == null) {
                    strArr = null;
                } else {
                    strArr = str3.split(SimpleComparison.EQUAL_TO_OPERATION);
                }
                if (strArr != null && strArr.length == 2 && TextUtils.equals(strArr[0].trim(), str2.trim())) {
                    return strArr[1];
                }
            }
        }
        return null;
    }

    public static <T> T a(String str, Class<T> cls) {
        if (!TextUtils.isEmpty(str) && cls != null) {
            try {
                return JsonUtils.fromJson(str, cls);
            } catch (Throwable th) {
                a.a("ConfigUtils, fromJson exception: ", th, Constants.TAG);
            }
        }
        return null;
    }

    public static void a(String str, long j) {
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_fail", str);
        a(false, j);
    }

    public static /* synthetic */ ForeignExchangeQuote a(MobilePaymentInquireQuoteResult mobilePaymentInquireQuoteResult) {
        ForeignExchangeQuote foreignExchangeQuote = new ForeignExchangeQuote();
        foreignExchangeQuote.baseCurrency = mobilePaymentInquireQuoteResult.baseCurrency;
        foreignExchangeQuote.quoteCurrencyPair = mobilePaymentInquireQuoteResult.quoteCurrencyPair;
        foreignExchangeQuote.quoteExpiryTime = Utils.stringToLong(mobilePaymentInquireQuoteResult.quoteExpiryTime, 0);
        foreignExchangeQuote.quoteStartTime = Utils.stringToLong(mobilePaymentInquireQuoteResult.quoteStartTime, 0);
        foreignExchangeQuote.quoteId = mobilePaymentInquireQuoteResult.quoteId;
        foreignExchangeQuote.quotePrice = mobilePaymentInquireQuoteResult.quotePrice;
        foreignExchangeQuote.quoteUnit = mobilePaymentInquireQuoteResult.quoteUnit;
        return foreignExchangeQuote;
    }

    public static String[] a(@NonNull String str) {
        String cookie;
        String[] strArr = new String[0];
        try {
            if (!TextUtils.isEmpty(str) && (cookie = CookieManager.getInstance().getCookie(str)) != null) {
                return cookie.split(";");
            }
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("CookieUtils#getCookieParts, domaim=");
            sb.append(str);
            sb.append("error=");
            sb.append(th);
            ACLog.e(Constants.TAG, sb.toString());
            return strArr;
        }
    }
}
