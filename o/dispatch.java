package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRenderBridgeImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lid/dana/data/openbankaccount/repository/source/amcs/AmcsConfigOpenBankAccountEntityData;", "Lid/dana/data/openbankaccount/ConfigOpenBankAccountEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;)V", "getAmcsManager", "()Lid/dana/data/foundation/amcs/AMCSManager;", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getConfig", "Lio/reactivex/Observable;", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class dispatch implements BridgeAccessPoint {
    @NotNull
    private final AppPausePoint amcsManager;
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public dispatch(@NotNull Context context2, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.amcsManager = appPausePoint;
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            this.amcsManager.startAmcsService(this.context, "prod");
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final AppPausePoint getAmcsManager() {
        return this.amcsManager;
    }

    @NotNull
    public final PluginInstallCallback getSerializer() {
        return this.serializer;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRenderBridgeImpl.AnonymousClass1> getConfig() {
        TitleBarRightButtonView.AnonymousClass1<BaseRenderBridgeImpl.AnonymousClass1> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ta::class.java)\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<BaseRenderBridgeImpl.AnonymousClass1> {
        final /* synthetic */ dispatch setMin;

        getMin(dispatch dispatch) {
            this.setMin = dispatch;
        }

        public final /* synthetic */ Object call() {
            JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("Widget");
            if (sectionConfig == null || sectionConfig.length() == 0) {
                return null;
            }
            return (BaseRenderBridgeImpl.AnonymousClass1) this.setMin.getSerializer().deserialize(String.valueOf(getPositiveString.getJSONObjectSafe(sectionConfig, "widget_open_bank")), BaseRenderBridgeImpl.AnonymousClass1.class);
        }
    }
}
