package id.dana.home;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface WalletAnimationState {
    public static final int CLOSE_ANIMATION = 2;
    public static final int START_ANIMATION = 0;
    public static final int SWAPPING_ANIMATION = 1;
}
