package o;

import com.google.common.base.Strings;
import io.split.android.client.validators.ApiKeyValidator;

public final class bodyContentTextType implements ApiKeyValidator {
    public final setTranslucentForCoordinatorLayout validate(String str) {
        if (str == null) {
            return new setTranslucentForCoordinatorLayout(200, "you passed a null api_key, the api_key must be a non-empty string");
        }
        if (Strings.isNullOrEmpty(str.trim())) {
            return new setTranslucentForCoordinatorLayout(200, "you passed an empty api_key, api_key must be a non-empty string");
        }
        return null;
    }
}
