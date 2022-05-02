package o;

import android.content.Context;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class handlePostNotification {
    private static final String CACHE_PREFERENCES = "h5ResponseCache";
    private static final String TAG = "H5ResponseCachePreferences";
    private needSkipPermissionCheck h5ResponseCachePreference;

    @Inject
    public handlePostNotification(Context context, PluginInstallCallback pluginInstallCallback) {
        this.h5ResponseCachePreference = new RVResourceUtils.getMax(context).setPreferenceGroup(CACHE_PREFERENCES).setSerializerFacade(pluginInstallCallback).setPassword(UserInfoManager.instance().getUserId()).buildSecurityGuardPreference();
    }

    public Boolean saveCache(String str, onEmbedViewDetachedFromWebView onembedviewdetachedfromwebview) {
        try {
            this.h5ResponseCachePreference.saveData(str, onembedviewdetachedfromwebview);
            return Boolean.TRUE;
        } catch (Exception e) {
            updateActionSheetContent.w(TAG, e.getMessage());
            return Boolean.FALSE;
        }
    }

    public onEmbedViewDetachedFromWebView getCache(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1358556820, oncanceled);
            onCancelLoad.getMin(-1358556820, oncanceled);
        }
        try {
            return (onEmbedViewDetachedFromWebView) this.h5ResponseCachePreference.getObject(str, onEmbedViewDetachedFromWebView.class);
        } catch (Exception e) {
            updateActionSheetContent.w(TAG, e.getMessage());
            clearAll();
            return null;
        }
    }

    public void clearAll() {
        try {
            this.h5ResponseCachePreference.clearAllData();
        } catch (Exception e) {
            updateActionSheetContent.w(TAG, e.getMessage());
        }
    }
}
