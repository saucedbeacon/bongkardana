package id.dana.data.foundation.logger.log;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface LoginTrackingConstants {

    public @interface HoldLogin {
        public static final String BEGIN = "holdLogin_begin";
        public static final String SUCCESS_TO_HOME = "holdLogin_success_to_home";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoginParam {
        public static final String FROM = "from";
        public static final String TO = "to";
    }

    public @interface NormalLogin {
        public static final String BEGIN = "normalLogin_begin";
        public static final String SUCCESS_TO_HOME = "normalLogin_success_to_home";
        public static final String SUCCESS_TO_OTPLOGIN = "normalLogin_success_to_otpLogin";
    }

    public @interface OtpLogin {
        public static final String SUCCESS_TO_HOME = "otpLogin_success_to_home";
    }

    public @interface ReLogin {
        public static final String BEGIN = "reLogin_begin";
        public static final String SUCCESS_TO_HOME = "reLogin_success_to_home";
        public static final String SUCCESS_TO_OTPLOGIN = "reLogin_success_to_otpLogin";
    }
}
