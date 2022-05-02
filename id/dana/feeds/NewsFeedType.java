package id.dana.feeds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface NewsFeedType {
    public static final String FULL = "FULL";
    public static final String NORMAL = "NORMAL";
}
