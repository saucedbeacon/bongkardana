package o;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.alipay.iap.android.common.securityprofiles.extractor.SecurityProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.syncintegration.SyncIntegration;
import com.alipay.iap.android.common.syncintegration.lifecycle.LifecycleWatcher;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.utils.ConfigUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/data/foundation/amcs/SyncUtils;", "", "()V", "TAG", "", "<set-?>", "Lcom/alipay/iap/android/common/syncintegration/lifecycle/LifecycleWatcher;", "lifecycleWatcher", "getLifecycleWatcher", "()Lcom/alipay/iap/android/common/syncintegration/lifecycle/LifecycleWatcher;", "setLifecycleWatcher", "(Lcom/alipay/iap/android/common/syncintegration/lifecycle/LifecycleWatcher;)V", "initializeSync", "", "context", "Landroid/content/Context;", "syncProfile", "Lcom/alipay/iap/android/common/securityprofiles/profile/SyncProfile;", "env", "authCode", "startForegroundSwitchCallback", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppOnConfigurationChangedPoint {
    @NotNull
    public static final AppOnConfigurationChangedPoint INSTANCE = new AppOnConfigurationChangedPoint();
    @NotNull
    public static final String TAG = "SyncUtils";
    @NotNull
    private static LifecycleWatcher lifecycleWatcher;

    static {
        LifecycleWatcher newValidWatcher = LifecycleWatcher.newValidWatcher();
        Intrinsics.checkNotNullExpressionValue(newValidWatcher, "LifecycleWatcher.newValidWatcher()");
        lifecycleWatcher = newValidWatcher;
    }

    private AppOnConfigurationChangedPoint() {
    }

    @NotNull
    public final LifecycleWatcher getLifecycleWatcher() {
        return lifecycleWatcher;
    }

    @VisibleForTesting
    public final void setLifecycleWatcher(@NotNull LifecycleWatcher lifecycleWatcher2) {
        Intrinsics.checkNotNullParameter(lifecycleWatcher2, "<set-?>");
        lifecycleWatcher = lifecycleWatcher2;
    }

    @JvmStatic
    public static final void initializeSync(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "env");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        SyncProfile createSyncProfile = new SecurityProfileExtractor(context, str2).createSyncProfile(str);
        if (createSyncProfile == null) {
            updateActionSheetContent.e(TAG, "SyncProfile is null, will not start sync trigger!!");
        } else {
            initializeSync(context, createSyncProfile);
        }
    }

    @JvmStatic
    public static final void initializeSync(@NotNull Context context, @NotNull SyncProfile syncProfile) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(syncProfile, "syncProfile");
        StringBuilder sb = new StringBuilder("syncProfile: ");
        sb.append(ConfigUtils.toJSONString(syncProfile));
        updateActionSheetContent.d(TAG, sb.toString());
        SyncIntegration.instance().initialize(context, syncProfile);
        startForegroundSwitchCallback(context);
        if (lifecycleWatcher.isAppForeground()) {
            SyncIntegration.instance().appToForeground();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/data/foundation/amcs/SyncUtils$startForegroundSwitchCallback$1", "Lcom/alipay/iap/android/common/syncintegration/lifecycle/LifecycleWatcher$Callback;", "onAppToBackground", "", "onAppToForeground", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements LifecycleWatcher.Callback {
        setMin() {
        }

        public final void onAppToForeground() {
            SyncIntegration.instance().appToForeground();
        }

        public final void onAppToBackground() {
            SyncIntegration.instance().appToBackground();
        }
    }

    @JvmStatic
    private static final void startForegroundSwitchCallback(Context context) {
        lifecycleWatcher.addCallback(new setMin());
        lifecycleWatcher.startWatcher(context);
    }
}
