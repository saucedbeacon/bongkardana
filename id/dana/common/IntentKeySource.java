package id.dana.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface IntentKeySource {

    public @interface TransactionKey {
        public static final String ON_TRANSACTION_SUCCESS = "on_transaction_success";
    }
}
