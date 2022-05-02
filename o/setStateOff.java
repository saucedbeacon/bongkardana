package o;

import android.text.TextUtils;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.data.foundation.logger.log.DanaLogConstants;

public final class setStateOff {
    private static String getMin = "";

    public static void getMax(String str, String str2) {
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        instance.log(sb.toString());
        updateActionSheetContent.w(str, str2);
    }

    public static void setMax(String str) {
        getMin = str;
    }

    public static void length(String str, String str2, Throwable th) {
        String str3;
        String userId = UserInfoManager.instance().getUserId();
        if (!TextUtils.isEmpty(userId) && userId.length() > 8) {
            StringBuilder sb = new StringBuilder("****");
            sb.append(userId.substring(userId.length() - 8, userId.length()));
            userId = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(", [userId]: ");
        sb2.append(userId);
        sb2.append(", [utdid]: ");
        sb2.append(getMin);
        String obj = sb2.toString();
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(obj);
        instance.log(sb3.toString());
        FirebaseCrashlytics.getInstance().recordException(th);
        boolean equals = "DanaLogin".equals(str);
        String str4 = DanaLogConstants.TAG.SENDMONEY_NAMECHECK_TAG;
        if (equals) {
            str4 = "login";
            str3 = DanaLogConstants.ExceptionType.LOGIN_EXCEPTION;
        } else if (DanaLogConstants.TAG.REGISTER_TAG.equals(str)) {
            str4 = DanaLogConstants.BizType.REGISTER;
            str3 = DanaLogConstants.ExceptionType.REGISTER_EXCEPTION;
        } else if (str4.equals(str)) {
            str3 = DanaLogConstants.ExceptionType.NAMECHECK_EXCEPTION;
        } else {
            str4 = DanaLogConstants.BizType.UNKNOWN_BIZTYPE;
            str3 = DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION;
        }
        updateActionSheetContent.exception(str4, str3, obj);
    }
}
