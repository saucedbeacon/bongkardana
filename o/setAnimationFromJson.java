package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.RVResourceUtils;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/autoroute/repository/source/local/LocalAutoRouteEntity;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "isHavingAutoRouteAsset", "Lio/reactivex/Observable;", "", "saveAutoRouteAssetState", "isNeed", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAnimationFromJson {
    private static final String AUTO_ROUTE_NEED_ASSET_STATE = "AUTO_ROUTE_NEED_ASSET_STATE";
    private static final String AUTO_ROUTE_PREFERENCE;
    @NotNull
    public static final getMax Companion;
    private final onSingleFailed preferenceFacade;

    @Inject
    public setAnimationFromJson(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(AUTO_ROUTE_PREFERENCE).setUseDrutherPreference(true).setSerializerFacade((compareVersion) null)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(mpBu….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveAutoRouteAssetState(boolean z) {
        this.preferenceFacade.saveData(AUTO_ROUTE_NEED_ASSET_STATE, Boolean.valueOf(z));
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(true)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isHavingAutoRouteAsset() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(this.preferenceFacade.getBoolean(AUTO_ROUTE_NEED_ASSET_STATE));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(preferen…_ROUTE_NEED_ASSET_STATE))");
        return just;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/autoroute/repository/source/local/LocalAutoRouteEntity$Companion;", "", "()V", "AUTO_ROUTE_NEED_ASSET_STATE", "", "AUTO_ROUTE_PREFERENCE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        getMax getmax = new getMax((DefaultConstructorMarker) null);
        Companion = getmax;
        AUTO_ROUTE_PREFERENCE = Intrinsics.stringPlus(Reflection.getOrCreateKotlinClass(getmax.getClass()).getSimpleName(), "production");
    }
}
