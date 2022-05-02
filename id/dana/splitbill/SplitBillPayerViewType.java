package id.dana.splitbill;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SplitBillPayerViewType {
    public static final int FRIEND_ADD_MORE = 1;
    public static final int PAYER = 0;
}
