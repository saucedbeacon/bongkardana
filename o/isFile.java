package o;

import android.location.Location;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0010B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "nearbyPlaceRepository", "Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isFile extends parseFailed<List<getCreateTime>, length> {
    private final GriverWebViewUtils nearbyPlaceRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isFile(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull GriverWebViewUtils griverWebViewUtils) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(griverWebViewUtils, "nearbyPlaceRepository");
        this.nearbyPlaceRepository = griverWebViewUtils;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getCreateTime>> buildUseCaseObservable(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.nearbyPlaceRepository.getListNearbyLocations(length2.getKeyword$domain_release(), length2.getLocation$domain_release(), length2.getUuid$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation$Params;", "", "uuid", "", "keyword", "location", "Landroid/location/Location;", "(Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;)V", "getKeyword$domain_release", "()Ljava/lang/String;", "setKeyword$domain_release", "(Ljava/lang/String;)V", "getLocation$domain_release", "()Landroid/location/Location;", "setLocation$domain_release", "(Landroid/location/Location;)V", "getUuid$domain_release", "setUuid$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        @NotNull
        private String keyword;
        @NotNull
        private Location location;
        @NotNull
        private String uuid;

        private length(String str, String str2, Location location2) {
            this.uuid = str;
            this.keyword = str2;
            this.location = location2;
        }

        public /* synthetic */ length(String str, String str2, Location location2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, location2);
        }

        @NotNull
        public final String getUuid$domain_release() {
            return this.uuid;
        }

        public final void setUuid$domain_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }

        @NotNull
        public final String getKeyword$domain_release() {
            return this.keyword;
        }

        public final void setKeyword$domain_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.keyword = str;
        }

        @NotNull
        public final Location getLocation$domain_release() {
            return this.location;
        }

        public final void setLocation$domain_release(@NotNull Location location2) {
            Intrinsics.checkNotNullParameter(location2, "<set-?>");
            this.location = location2;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation$Params$Companion;", "", "()V", "forListNearbyLocations", "Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation$Params;", "uuid", "", "keyword", "location", "Landroid/location/Location;", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final length forListNearbyLocations(@NotNull String str, @NotNull String str2, @NotNull Location location) {
                Intrinsics.checkNotNullParameter(str, HeaderConstant.HEADER_KEY_UUID);
                Intrinsics.checkNotNullParameter(str2, FeatureParams.KEYWORD);
                Intrinsics.checkNotNullParameter(location, "location");
                return new length(str, str2, location, (DefaultConstructorMarker) null);
            }
        }
    }
}
