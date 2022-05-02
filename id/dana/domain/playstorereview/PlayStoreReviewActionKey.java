package id.dana.domain.playstorereview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PlayStoreReviewActionKey {
    public static final String OPEN = "play_store_review_open";
    public static final String SKIP = "play_store_review_skip";
}
