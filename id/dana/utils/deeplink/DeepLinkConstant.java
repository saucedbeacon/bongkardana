package id.dana.utils.deeplink;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface DeepLinkConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DeepLinkParams {
        public static final String ORDER_ID = "orderId";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DeepLinkPath {
        public static final String CASHOUT = "/cashoutlink";
        public static final String LUCKY_MONEY = "/luckymoney";
        public static final String SPIN_THE_WHEEL = "/spinthewheel";
    }
}
