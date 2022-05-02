package id.dana.lib.logger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class DANALogConstants {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BizType {
        public static final String DECODED_QR = "decodedQR";
        public static final String GET_PAYMENT_CODE = "getPaymentCode";
        public static final String GET_USER_INFO_BALANCE = "getUserInfoBalance";
        public static final String GET_USER_INFO_KYB = "getUserInfoKyb";
        public static final String GET_USER_INFO_KYC = "getUserInfoKyc";
        public static final String INIT_KYC = "initKyc";
        public static final String OPEN_APPCONTAINER = "openAppcontainer";
        public static final String UPDATE_APPCONTAINER_SUBAPP = "updateAppcontainerSubapp";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExceptionType {
        public static final String FAIL_GET_USER_INFO_BALANCE = "getUserInfoBalance";
        public static final String FAIL_GET_USER_INFO_KYB = "getUserInfoKyb";
        public static final String FAIL_GET_USER_INFO_KYC = "getUserInfoKyc";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ModulePrefix {
        public static final String CONTAINER_PAGE_MODULE_PREFIX = "[ContainerCommonPage] ";
        public static final String DANAH5_MODULE_PREFIX = "[DANAH5] ";
        public static final String FOUNDATION_MODULE_PREFIX = "[Foundation] ";
        public static final String PAYQR_MODULE_PREFIX = "[PaymenQR] ";
        public static final String SCANQR_MODULE_PREFIX = "[ScanQR] ";
        public static final String USER_INFO_MODULE_PREFIX = "[UserInfo] ";
    }
}
