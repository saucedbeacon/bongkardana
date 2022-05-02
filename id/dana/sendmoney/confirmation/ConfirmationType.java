package id.dana.sendmoney.confirmation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface ConfirmationType {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Destination {
        public static final String BANK = "destination_bank";
        public static final String CONTACT = "destination_contact";
        public static final String LINK = "destination_link";
        public static final String OTC = "destination_otc";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Origin {
        public static final String BANK = "origin_bank";
        public static final String DANA = "origin_dana";
    }
}
