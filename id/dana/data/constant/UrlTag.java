package id.dana.data.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface UrlTag {
    public static final String DETAIL_SOURCE = "detailSource";
    public static final String ENTRY_POINT = "entryPoint";
    public static final String HOT_PROMO = "hotPromo";
    public static final String INSTID = "instId";
}
