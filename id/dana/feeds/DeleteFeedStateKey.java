package id.dana.feeds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface DeleteFeedStateKey {
    public static final int DELETE_FEED_DELETING_STATE_KEY = 2;
    public static final int DELETE_FEED_NORMAL_STATE_KEY = 1;
}
