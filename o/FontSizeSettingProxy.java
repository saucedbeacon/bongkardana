package o;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.google.gson.reflect.TypeToken;
import id.dana.data.globalnetwork.model.GnAuthResult;
import java.util.Set;

public final class FontSizeSettingProxy {

    public final class OnFontSizeSettingChangeListener extends TypeToken<Callback<OAuthResult>> {
    }

    private FontSizeSettingProxy() {
    }

    public static RenderLoadingStatusChangePoint transform(GnAuthResult gnAuthResult) {
        RenderLoadingStatusChangePoint renderLoadingStatusChangePoint = new RenderLoadingStatusChangePoint();
        renderLoadingStatusChangePoint.setClientId(gnAuthResult.getClientId());
        renderLoadingStatusChangePoint.setScope(getScopeString(gnAuthResult.getScopes()));
        renderLoadingStatusChangePoint.setAuthCallback(gnAuthResult.getCallback());
        renderLoadingStatusChangePoint.setAppName(gnAuthResult.getAppName());
        renderLoadingStatusChangePoint.setIconUrl(gnAuthResult.getIconUrl());
        return renderLoadingStatusChangePoint;
    }

    private static String getScopeString(Set<String> set) {
        if (set == null) {
            return "";
        }
        return set.toString().replace("[", "").replace("]", "").replace(", ", ",");
    }
}
