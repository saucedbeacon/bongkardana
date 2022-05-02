package o;

import android.annotation.SuppressLint;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

final class AppLoadPoint implements addAnimatorUpdateListener.getMax {
    private final onAppLeaveHint length;

    public AppLoadPoint(onAppLeaveHint onappleavehint) {
        this.length = onappleavehint;
    }

    public final Object processFacade(Object obj) {
        return ((AppInteractionPoint) obj).deleteActivity(this.length);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0003J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/data/foundation/amcs/ConfigUpdateSyncTrigger;", "", "syncProvider", "Lcom/alipay/iap/android/common/syncintegration/api/IAPSyncProvider;", "bizCode", "", "(Lcom/alipay/iap/android/common/syncintegration/api/IAPSyncProvider;Ljava/lang/String;)V", "handleConfigSyncMessage", "", "messages", "", "registerSyncReceiver", "configContext", "Lcom/iap/ac/config/lite/ConfigCenterContext;", "startTrigger", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class LoadResultCallback {
        @NotNull
        public static final String CONFIG_SYNC_BIZ_ID = "APLUS-CONFIG";
        @NotNull
        public static final String CONFIG_SYNC_BY_USER_BIZ_ID = "APLUS-CONFIG-USER";
        @NotNull
        public static final String CONFIG_SYNC_GETDATA = "sync_getdata";
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        public static final String TAG = "ConfigUpdateSyncTrigger";
        private final String bizCode;
        private final IAPSyncProvider syncProvider;

        @JvmOverloads
        public LoadResultCallback() {
            this((IAPSyncProvider) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public LoadResultCallback(@NotNull IAPSyncProvider iAPSyncProvider) {
            this(iAPSyncProvider, (String) null, 2, (DefaultConstructorMarker) null);
        }

        @JvmOverloads
        public LoadResultCallback(@NotNull IAPSyncProvider iAPSyncProvider, @NotNull String str) {
            Intrinsics.checkNotNullParameter(iAPSyncProvider, "syncProvider");
            Intrinsics.checkNotNullParameter(str, "bizCode");
            this.syncProvider = iAPSyncProvider;
            this.bizCode = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoadResultCallback(IAPSyncProvider iAPSyncProvider, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new SyncProvider() : iAPSyncProvider, (i & 2) != 0 ? "" : str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/foundation/amcs/ConfigUpdateSyncTrigger$Companion;", "", "()V", "CONFIG_SYNC_BIZ_ID", "", "CONFIG_SYNC_BY_USER_BIZ_ID", "CONFIG_SYNC_GETDATA", "TAG", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final void startTrigger(@NotNull ConfigCenterContext configCenterContext) {
            Intrinsics.checkNotNullParameter(configCenterContext, "configContext");
            LoggerWrapper.d(TAG, "startTrigger");
            registerSyncReceiver(configCenterContext);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0014¨\u0006\n"}, d2 = {"id/dana/data/foundation/amcs/ConfigUpdateSyncTrigger$registerSyncReceiver$syncCallback$1", "Lcom/alipay/iap/android/common/syncintegration/impl/IAPSyncMessageParsedCallback;", "onReceiveParsedSyncMessage", "", "iapSyncMessage", "Lcom/alipay/iap/android/common/syncintegration/api/IAPSyncMessage;", "syncMessageBizType", "", "messages", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends IAPSyncMessageParsedCallback {
            final /* synthetic */ ConfigCenterContext $configContext;
            final /* synthetic */ LoadResultCallback this$0;

            length(LoadResultCallback loadResultCallback, ConfigCenterContext configCenterContext) {
                this.this$0 = loadResultCallback;
                this.$configContext = configCenterContext;
            }

            public final void onReceiveParsedSyncMessage(@NotNull IAPSyncMessage iAPSyncMessage, @NotNull String str, @NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(iAPSyncMessage, "iapSyncMessage");
                Intrinsics.checkNotNullParameter(str, "syncMessageBizType");
                Intrinsics.checkNotNullParameter(list, "messages");
                if (Intrinsics.areEqual((Object) str, (Object) LoadResultCallback.CONFIG_SYNC_BIZ_ID) || Intrinsics.areEqual((Object) str, (Object) LoadResultCallback.CONFIG_SYNC_BY_USER_BIZ_ID)) {
                    this.this$0.handleConfigSyncMessage(list);
                    this.$configContext.getConfigMonitor().behavior("sync_getdata", (Map<String, String>) null);
                }
            }
        }

        private final void registerSyncReceiver(ConfigCenterContext configCenterContext) {
            IAPSyncCallback length2 = new length(this, configCenterContext);
            this.syncProvider.registerReceiveCallback(CONFIG_SYNC_BIZ_ID, length2);
            this.syncProvider.registerReceiveCallback(CONFIG_SYNC_BY_USER_BIZ_ID, length2);
        }

        /* access modifiers changed from: private */
        @SuppressLint({"DefaultLocale"})
        public final void handleConfigSyncMessage(List<String> list) {
            ConfigCenter instance = ConfigCenter.getInstance(this.bizCode);
            Intrinsics.checkNotNullExpressionValue(instance, "ConfigCenter.getInstance(bizCode)");
            long lastUpdateVersion = instance.getLastUpdateVersion();
            for (String str : list) {
                try {
                    long parseLong = ConfigUtils.parseLong(((JSONObject) JsonUtils.fromJson(str, JSONObject.class)).getString("update"), 0);
                    if (parseLong > lastUpdateVersion) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("Receive sync message: %s! will refresh config now!", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        LoggerWrapper.d(TAG, format);
                        ConfigCenter.getInstance(this.bizCode).refreshConfig();
                        return;
                    }
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    StringBuilder sb = new StringBuilder("Receive sync message! But not refresh config!");
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String format2 = String.format("lastUpdateTimestamp = %d, configUpdateTimestamp = %d", Arrays.copyOf(new Object[]{Long.valueOf(lastUpdateVersion), Long.valueOf(parseLong)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                    sb.append(format2);
                    String format3 = String.format(sb.toString(), Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(format, *args)");
                    LoggerWrapper.d(TAG, format3);
                } catch (Throwable th) {
                    StringBuilder sb2 = new StringBuilder("Cannot parse config sync mess age to JSONObject! ");
                    sb2.append(th.getMessage());
                    LoggerWrapper.w(TAG, sb2.toString());
                }
            }
        }
    }
}
