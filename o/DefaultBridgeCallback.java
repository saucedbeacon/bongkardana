package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRenderBridgeImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lid/dana/data/openbankaccount/repository/source/local/DefaultConfigOpenBankAccountEntityData;", "Lid/dana/data/openbankaccount/ConfigOpenBankAccountEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "DEFAULT_CONFIG_JSON", "", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getConfig", "Lio/reactivex/Observable;", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultBridgeCallback implements BridgeAccessPoint {
    /* access modifiers changed from: private */
    public final String DEFAULT_CONFIG_JSON = "json/amcs-widget-open-bank-default.json";
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public DefaultBridgeCallback(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
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
    public final TitleBarRightButtonView.AnonymousClass1<BaseRenderBridgeImpl.AnonymousClass1> getConfig() {
        TitleBarRightButtonView.AnonymousClass1<BaseRenderBridgeImpl.AnonymousClass1> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ta::class.java)\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<BaseRenderBridgeImpl.AnonymousClass1> {
        final /* synthetic */ DefaultBridgeCallback setMin;

        getMax(DefaultBridgeCallback defaultBridgeCallback) {
            this.setMin = defaultBridgeCallback;
        }

        public final /* synthetic */ Object call() {
            return (BaseRenderBridgeImpl.AnonymousClass1) this.setMin.getSerializer().deserialize(String.valueOf(getPositiveString.getJSONObjectSafe(JSON.parseObject(getPositiveString.loadJSONFromAsset(this.setMin.getContext(), this.setMin.DEFAULT_CONFIG_JSON)), "widget_open_bank")), BaseRenderBridgeImpl.AnonymousClass1.class);
        }
    }
}
