package id.dana.domain.splitbill;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface SplitBillStatus {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupStatus {
        public static final String COMPLETED = "SUCCESS";
        public static final String EXPIRED = "EXPIRED";
        public static final String IN_PROGRESS = "IN_PROGRESS";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PayerStatus {
        public static final String COMPLETED = "SUCCESS";
        public static final String EXPIRED = "EXPIRED";
        public static final String IN_PROGRESS = "IN_PROGRESS";
        public static final String REVOKED = "REVOKED";
    }
}
