package id.dana.constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AnalyticEventConstant {
    public static final String AE_AF_STATUS = "af_status";
    public static final String AE_BIZ_TYPE = "bizType";
    public static final String AE_FAILED_REGISTRATION = "af_failed_registration";
    public static final String AE_INSTALLED_APPS = "installed_apps";
    public static final String AE_LOGIN = "af_login";
    public static final String AE_MEDIA_SOURCE = "media_source";
    public static final String AE_SCAN_QR = "scan_qr";
    public static final String AE_UNSAFE_DEVICE = "unsafe_device";
    public static final String AE_UTDID = "UTDID";
}
