package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/data/globalnetwork/source/GlobalNetworkDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/globalnetwork/GlobalNetworkEntityData;", "context", "Landroid/content/Context;", "globalNetworkPreference", "Lid/dana/data/globalnetwork/source/local/GlobalNetworkPreference;", "geocoder", "Lid/dana/data/geocode/repository/source/network/GeocoderApi;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/globalnetwork/source/local/GlobalNetworkPreference;Lid/dana/data/geocode/repository/source/network/GeocoderApi;Lid/dana/domain/featureconfig/FeatureConfigRepository;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class preload extends uncheckItems<PageShowPoint> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final setDefaultFontSize featureConfigRepository;
    private final BackPressedPoint geocoder;
    private final getWidthSpec globalNetworkPreference;
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    @Inject
    public preload(@NotNull Context context2, @NotNull getWidthSpec getwidthspec, @NotNull BackPressedPoint backPressedPoint, @NotNull setDefaultFontSize setdefaultfontsize, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getwidthspec, "globalNetworkPreference");
        Intrinsics.checkNotNullParameter(backPressedPoint, "geocoder");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        this.context = context2;
        this.globalNetworkPreference = getwidthspec;
        this.geocoder = backPressedPoint;
        this.featureConfigRepository = setdefaultfontsize;
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
    }

    @NotNull
    public final PageShowPoint createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        if (Intrinsics.areEqual((Object) "local", (Object) str)) {
            return new getTitleBarHeightSpec(this.globalNetworkPreference);
        }
        return new setDark(this.context, this.geocoder, this.featureConfigRepository, this.rpcConnector, this.threadExecutor, this.apSecurityFacade);
    }
}
