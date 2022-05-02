package o;

import com.google.common.base.Strings;
import io.split.android.client.validators.SplitValidator;

public final class StatusBarUtil implements SplitValidator {
    public final setTranslucentForCoordinatorLayout validateName(String str) {
        if (str == null) {
            return new setTranslucentForCoordinatorLayout(200, "you passed a null split name, split name must be a non-empty string");
        }
        if (Strings.isNullOrEmpty(str.trim())) {
            return new setTranslucentForCoordinatorLayout(200, "you passed an empty split name, split name must be a non-empty string");
        }
        if (str.trim().length() == str.length()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("split name '");
        sb.append(str);
        sb.append("' has extra whitespace, trimming");
        return new setTranslucentForCoordinatorLayout(100, sb.toString(), true);
    }

    public final String splitNotFoundMessage(String str) {
        StringBuilder sb = new StringBuilder("split: you passed '");
        sb.append(str);
        sb.append("' that does not exist in this environment, please double check what Splits exist in the web console.");
        return sb.toString();
    }
}
