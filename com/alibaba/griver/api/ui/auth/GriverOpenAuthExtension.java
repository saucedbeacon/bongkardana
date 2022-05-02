package com.alibaba.griver.api.ui.auth;

import android.app.Activity;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.model.APIContext;
import java.util.Map;

public interface GriverOpenAuthExtension extends GriverExtension {

    public interface RevokeCallback {
        void onComplete();
    }

    Map<String, Boolean> getOpenAuthStatus(String str, APIContext aPIContext);

    void revokeOpenAuthItemClicked(Activity activity, String str, APIContext aPIContext, RevokeCallback revokeCallback);

    boolean shouldShowRevokeOpenAuthItem(String str, APIContext aPIContext);
}
