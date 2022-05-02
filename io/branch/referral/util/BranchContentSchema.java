package io.branch.referral.util;

import android.text.TextUtils;

public enum BranchContentSchema {
    COMMERCE_AUCTION,
    COMMERCE_BUSINESS,
    COMMERCE_OTHER,
    COMMERCE_PRODUCT,
    COMMERCE_RESTAURANT,
    COMMERCE_SERVICE,
    COMMERCE_TRAVEL_FLIGHT,
    COMMERCE_TRAVEL_HOTEL,
    COMMERCE_TRAVEL_OTHER,
    GAME_STATE,
    MEDIA_IMAGE,
    MEDIA_MIXED,
    MEDIA_MUSIC,
    MEDIA_OTHER,
    MEDIA_VIDEO,
    OTHER,
    TEXT_ARTICLE,
    TEXT_BLOG,
    TEXT_OTHER,
    TEXT_RECIPE,
    TEXT_REVIEW,
    TEXT_SEARCH_RESULTS,
    TEXT_STORY,
    TEXT_TECHNICAL_DOC;

    public static BranchContentSchema getValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (BranchContentSchema branchContentSchema : values()) {
                if (branchContentSchema.name().equalsIgnoreCase(str)) {
                    return branchContentSchema;
                }
            }
        }
        return null;
    }
}
