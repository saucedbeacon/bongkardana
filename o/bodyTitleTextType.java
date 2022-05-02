package o;

import com.google.common.base.Strings;
import io.split.android.client.validators.KeyValidator;

public final class bodyTitleTextType implements KeyValidator {
    private final int MAX_BUCKETING_KEY_LENGTH = setTransparentForImageView.getInstance().getMaximumKeyLength();
    private final int MAX_MATCHING_KEY_LENGTH = setTransparentForImageView.getInstance().getMaximumKeyLength();

    public final setTranslucentForCoordinatorLayout validate(String str, String str2) {
        if (str == null) {
            return new setTranslucentForCoordinatorLayout(200, "you passed a null key, matching key must be a non-empty string");
        }
        if (Strings.isNullOrEmpty(str.trim())) {
            return new setTranslucentForCoordinatorLayout(200, "you passed an empty string, matching key must be a non-empty string");
        }
        if (str.length() > this.MAX_MATCHING_KEY_LENGTH) {
            StringBuilder sb = new StringBuilder("matching key too long - must be ");
            sb.append(this.MAX_MATCHING_KEY_LENGTH);
            sb.append(" characters or less");
            return new setTranslucentForCoordinatorLayout(200, sb.toString());
        } else if (str2 == null) {
            return null;
        } else {
            if (Strings.isNullOrEmpty(str2.trim())) {
                return new setTranslucentForCoordinatorLayout(200, "you passed an empty string, bucketing key must be null or a non-empty string");
            }
            if (str2.length() <= this.MAX_BUCKETING_KEY_LENGTH) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder("bucketing key too long - must be ");
            sb2.append(this.MAX_MATCHING_KEY_LENGTH);
            sb2.append(" characters or less");
            return new setTranslucentForCoordinatorLayout(200, sb2.toString());
        }
    }
}
