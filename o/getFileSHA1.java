package o;

import android.location.Location;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail;", "Lid/dana/domain/UseCase;", "Landroid/location/Location;", "Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "nearbyPlaceRepository", "Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getFileSHA1 extends parseFailed<Location, getMax> {
    private final GriverWebViewUtils nearbyPlaceRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getFileSHA1(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull GriverWebViewUtils griverWebViewUtils) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(griverWebViewUtils, "nearbyPlaceRepository");
        this.nearbyPlaceRepository = griverWebViewUtils;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Location> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.nearbyPlaceRepository.getPlaceDetail(getmax.getLocationName$domain_release(), getmax.getPlaceId$domain_release(), getmax.getUuid$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail$Params;", "", "locationName", "", "placeId", "uuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocationName$domain_release", "()Ljava/lang/String;", "setLocationName$domain_release", "(Ljava/lang/String;)V", "getPlaceId$domain_release", "setPlaceId$domain_release", "getUuid$domain_release", "setUuid$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        @NotNull
        private String locationName;
        @NotNull
        private String placeId;
        @NotNull
        private String uuid;

        private getMax(String str, String str2, String str3) {
            this.locationName = str;
            this.placeId = str2;
            this.uuid = str3;
        }

        public /* synthetic */ getMax(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        @NotNull
        public final String getLocationName$domain_release() {
            return this.locationName;
        }

        public final void setLocationName$domain_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locationName = str;
        }

        @NotNull
        public final String getPlaceId$domain_release() {
            return this.placeId;
        }

        public final void setPlaceId$domain_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.placeId = str;
        }

        @NotNull
        public final String getUuid$domain_release() {
            return this.uuid;
        }

        public final void setUuid$domain_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail$Params$Companion;", "", "()V", "forLocationDetail", "Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail$Params;", "locationName", "", "placeId", "uuid", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final getMax forLocationDetail(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                Intrinsics.checkNotNullParameter(str, "locationName");
                Intrinsics.checkNotNullParameter(str2, "placeId");
                Intrinsics.checkNotNullParameter(str3, HeaderConstant.HEADER_KEY_UUID);
                return new getMax(str, str2, str3, (DefaultConstructorMarker) null);
            }
        }
    }
}
