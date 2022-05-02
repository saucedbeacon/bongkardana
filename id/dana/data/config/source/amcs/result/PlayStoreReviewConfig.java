package id.dana.data.config.source.amcs.result;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PlayStoreReviewConfig {
    private int optionRateCountdown = 60;
    private int optionSkipCountdown = 30;
    private boolean showInAppReview = false;
    private boolean showReviewEntrance = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Key {
        public static final String OPTION_RATE_COUNTDOWN = "option_rate_countdown";
        public static final String OPTION_SKIP_COUNTDOWN = "option_skip_countdown";
        public static final String SHOW_IN_APP_REVIEW = "show_in_app_review";
        public static final String SHOW_REVIEW_ENTRACE = "show_review_entrance";
    }

    public int getOptionRateCountdown() {
        return this.optionRateCountdown;
    }

    public void setOptionRateCountdown(int i) {
        this.optionRateCountdown = i;
    }

    public int getOptionSkipCountdown() {
        return this.optionSkipCountdown;
    }

    public void setOptionSkipCountdown(int i) {
        this.optionSkipCountdown = i;
    }

    public boolean isShowReviewEntrance() {
        return this.showReviewEntrance;
    }

    public void setShowReviewEntrance(boolean z) {
        this.showReviewEntrance = z;
    }

    public boolean isShowInAppReview() {
        return this.showInAppReview;
    }

    public void setShowInAppReview(boolean z) {
        this.showInAppReview = z;
    }
}
