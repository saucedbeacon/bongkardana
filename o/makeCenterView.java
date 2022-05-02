package o;

import android.content.Context;
import id.dana.R;
import id.dana.constants.ErrorCode;
import id.dana.data.base.NetworkException;

public final class makeCenterView {
    public static String length(Context context, Throwable th) {
        boolean z = th instanceof NetworkException;
        if (!z) {
            return context.getString(R.string.home_error);
        }
        NetworkException networkException = (NetworkException) th;
        if (ErrorCode.PHONE_NUMBER_RISK_REJECTED.equals(networkException.getErrorCode())) {
            return th.getMessage();
        }
        if (z) {
            return networkException.getMessage();
        }
        return context.getString(R.string.general_error_msg);
    }

    public static String getMax(Class cls, Class cls2, String str) {
        StringBuilder sb = new StringBuilder("Error when ");
        sb.append(cls.getSimpleName());
        sb.append(" in ");
        sb.append(cls2.getSimpleName());
        sb.append(" Cause : ");
        sb.append(str);
        return sb.toString();
    }
}
