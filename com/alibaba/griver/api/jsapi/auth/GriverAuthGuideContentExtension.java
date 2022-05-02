package com.alibaba.griver.api.jsapi.auth;

import androidx.annotation.Keep;
import com.alibaba.griver.api.common.GriverExtension;

@Keep
public interface GriverAuthGuideContentExtension extends GriverExtension {

    public static class AuthGuideContent {
        public boolean cancelable;
        public String message;
        public String negativeButtonColor;
        public String negativeButtonText;
        public String positiveButtonColor;
        public String positiveButtonText;
        public String title;
    }

    AuthGuideContent getAuthGuideContent(String str);
}
