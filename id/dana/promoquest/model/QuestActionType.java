package id.dana.promoquest.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface QuestActionType {
    public static final String GO = "GO";
    public static final String GO_AND_TRACK = "GO_AND_TRACK";
    public static final String TRACK = "TRACK";
}
