package id.dana.service.adapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ServiceViewType {
    public static final int CATEGORY_TITLE = 1;
    public static final int EDIT = 4;
    public static final int EMPTY_ITEM = 5;
    public static final int SERVICE_ITEM = 2;
    public static final int SPACE = 3;
}
