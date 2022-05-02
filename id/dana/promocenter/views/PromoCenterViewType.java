package id.dana.promocenter.views;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PromoCenterViewType {
    public static final int EMPTY_ITEM = 4;
    public static final int ITEM_SECTION = 1;
    public static final int LOAD_MORE_SECTION = 2;
    public static final int PROMO_SPECIAL_ADS = 0;
    public static final int REGULAR_PROMO_SKELETON = 3;
}
