package id.dana.domain.user;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class UserInfoResponseConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AccountStatus {
        public static final String CLOSE = "CLOSE";
        public static final String ENABLE = "ENABLE";
        public static final String FROZEN = "FROZEN";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoginStatus {
        public static final String ACTIVE = "ACTIVE";
        public static final String INITIAL = "INITIAL";
        public static final String SUSPENDED = "SUSPENDED";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UserStatus {
        public static final String CLOSE = "CLOSE";
        public static final String ENABLE = "ENABLE";
        public static final String FROZEN = "FROZEN";
    }

    private UserInfoResponseConstant() {
    }
}
