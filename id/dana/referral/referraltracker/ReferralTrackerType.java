package id.dana.referral.referraltracker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ReferralTrackerType {
    public static final int LOADING_VIEW_HOLDER = 1;
    public static final int NORMAL_VIEW_HOLDER = 0;
    public static final int REFERRAL_BODY_VIEW_HOLDER = 3;
    public static final int REFERRAL_HEADER_VIEW_HOLDER = 2;
    public static final int REFERRAL_TRACKER_EMPTY_VIEW_HOLDER = 5;
    public static final int REFERRAL_TRACKER_HEADER_VIEW_HOLDER = 4;
}
