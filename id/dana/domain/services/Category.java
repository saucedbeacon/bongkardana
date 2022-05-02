package id.dana.domain.services;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Category {
    public static final String FEATURED = "category_featured";
    public static final String GLOBAL_NETWORK_FEATURED = "category_featured_gn";
    public static final String SERVICES = "category_services";
}
