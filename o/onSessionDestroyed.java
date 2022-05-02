package o;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface onSessionDestroyed {

    public interface setMax {
        RatingCompat getItemData();

        void initialize(RatingCompat ratingCompat, int i);

        boolean prefersCondensedTitle();
    }

    void initialize(onEvent onevent);
}
