package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PageLog;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0015"}, d2 = {"Lid/dana/data/requestmoney/repository/source/amcs/AmcsRequestMoneyEntityData;", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;)V", "nameCheckObjectConfig", "Lorg/json/JSONObject;", "getNameCheckObjectConfig", "()Lorg/json/JSONObject;", "topBanksObjectConfig", "getTopBanksObjectConfig", "getNameCheckConfig", "Lio/reactivex/Observable;", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "getTopFeatureBanks", "", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WorkerLog implements PageLog.AnonymousClass1 {
    /* access modifiers changed from: private */
    public final PluginInstallCallback serializer;

    @Singleton
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lid/dana/data/requestmoney/repository/source/local/DefaultRequestMoneyEntityData;", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getNameCheckConfig", "Lio/reactivex/Observable;", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "getTopFeatureBanks", "", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Builder implements PageLog.AnonymousClass1 {
        @NotNull
        public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
        @NotNull
        public static final String JSON_PATH_NAME_CHECK_CONFIG = "json/amcs-requestmoney-namecheck-config.json";
        @NotNull
        public static final String JSON_PATH_TOP_FEATURED_BANKS = "json/amcs-featured-banks.json";
        @NotNull
        private final Context context;
        @NotNull
        private final PluginInstallCallback serializer;

        @Inject
        public Builder(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
            this.context = context2;
            this.serializer = pluginInstallCallback;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final PluginInstallCallback getSerializer() {
            return this.serializer;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTopFeatureBanks() {
            TitleBarRightButtonView.AnonymousClass1<List<String>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this));
            Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …KS)) ?: emptyList()\n    }");
            return fromCallable;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setToken> getNameCheckConfig() {
            TitleBarRightButtonView.AnonymousClass1<setToken> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this));
            Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …kConfigEntity(0, 0)\n    }");
            return fromCallable;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/requestmoney/repository/source/local/DefaultRequestMoneyEntityData$Companion;", "", "()V", "JSON_PATH_NAME_CHECK_CONFIG", "", "JSON_PATH_TOP_FEATURED_BANKS", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
        static final class getMax<V> implements Callable<List<? extends String>> {
            final /* synthetic */ Builder getMin;

            getMax(Builder builder) {
                this.getMin = builder;
            }

            public final /* synthetic */ Object call() {
                List<String> deserializeList = this.getMin.getSerializer().deserializeList(getPositiveString.loadJSONFromAsset(this.getMin.getContext(), Builder.JSON_PATH_TOP_FEATURED_BANKS));
                return deserializeList == null ? CollectionsKt.emptyList() : deserializeList;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
        static final class length<V> implements Callable<setToken> {
            final /* synthetic */ Builder setMin;

            length(Builder builder) {
                this.setMin = builder;
            }

            public final /* synthetic */ Object call() {
                setToken settoken = (setToken) this.setMin.getSerializer().deserialize(getPositiveString.loadJSONFromAsset(this.setMin.getContext(), Builder.JSON_PATH_NAME_CHECK_CONFIG), setToken.class);
                return settoken == null ? new setToken(0, 0) : settoken;
            }
        }
    }

    @Inject
    public WorkerLog(@NotNull Context context, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    /* access modifiers changed from: private */
    public final JSONObject getTopBanksObjectConfig() {
        return ConfigCenter.getInstance().getJSONConfig("top_banks");
    }

    /* access modifiers changed from: private */
    public final JSONObject getNameCheckObjectConfig() {
        return ConfigCenter.getInstance().getJSONConfig("namecheck_config");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTopFeatureBanks() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …String())\n        }\n    }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setToken> getNameCheckConfig() {
        TitleBarRightButtonView.AnonymousClass1<setToken> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ass.java)\n        }\n    }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<List<? extends String>> {
        final /* synthetic */ WorkerLog setMin;

        getMin(WorkerLog workerLog) {
            this.setMin = workerLog;
        }

        public final /* synthetic */ Object call() {
            return this.setMin.serializer.deserializeList(String.valueOf(this.setMin.getTopBanksObjectConfig()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<setToken> {
        final /* synthetic */ WorkerLog getMin;

        setMax(WorkerLog workerLog) {
            this.getMin = workerLog;
        }

        public final /* synthetic */ Object call() {
            return (setToken) this.getMin.serializer.deserialize(String.valueOf(this.getMin.getNameCheckObjectConfig()), setToken.class);
        }
    }
}
