package id.dana.feeds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface NewsViewType {
    public static final int EMPTY = 0;
    public static final int FOOTER = 2;
    public static final int FULL = 3;
    public static final int NORMAL = 1;
}
