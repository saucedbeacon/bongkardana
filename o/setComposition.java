package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import o.DialogRecyclerView;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/autoroute/repository/source/mock/MockAutoRouteEntityData;", "Lid/dana/data/autoroute/repository/AutoRouteEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getInitialSetting", "Lio/reactivex/Observable;", "Lid/dana/data/autoroute/model/AutoRouteInitResult;", "needAssetCheck", "", "switchConfig", "Lid/dana/data/autoroute/model/UserAutoRouteConfigSwitchResult;", "userAutoRouteConfigStoreRequest", "Lid/dana/data/autoroute/model/UserAutoRouteConfigStoreRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setComposition implements onVisibilityChanged {
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public setComposition(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
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
    public final TitleBarRightButtonView.AnonymousClass1<setGravityStartCompat> getInitialSetting(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<setGravityStartCompat> just = TitleBarRightButtonView.AnonymousClass1.just(this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.getMax), setGravityStartCompat.class));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …eInitResult::class.java))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setIgnoreDisabledSystemAnimations> switchConfig(@NotNull isNotVisible isnotvisible) {
        Intrinsics.checkNotNullParameter(isnotvisible, "userAutoRouteConfigStoreRequest");
        throw new NotImplementedError("An operation is not implemented: ".concat("Not yet implemented"));
    }
}
