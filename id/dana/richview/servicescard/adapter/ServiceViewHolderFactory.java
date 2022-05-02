package id.dana.richview.servicescard.adapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class ServiceViewHolderFactory {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceViewHolderType {
        public static final int VIEW_TYPE_PROMOTED_SERVICE = 0;
        public static final int VIEW_TYPE_SERVICE = 1;
    }
}
