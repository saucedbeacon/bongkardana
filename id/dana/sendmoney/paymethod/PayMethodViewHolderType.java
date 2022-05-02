package id.dana.sendmoney.paymethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PayMethodViewHolderType {
    public static final int LAYOUT_PAY_METHOD = 1;
    public static final int LAYOUT_SECTION = 0;
}
