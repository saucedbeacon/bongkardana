package id.dana.domain.merchant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MerchantOrder {
    public static final String ALL = "merchant_category_order";
}
