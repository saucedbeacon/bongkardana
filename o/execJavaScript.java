package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/GnConsult;", "", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCase", "Lid/dana/domain/globalnetwork/model/GnConsultInfo;", "params", "Lid/dana/domain/globalnetwork/interactor/GnConsult$Params;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class execJavaScript {
    private final onWebViewDestory globalNetworkRepository;

    @Inject
    public execJavaScript(@NotNull onWebViewDestory onwebviewdestory) {
        Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
        this.globalNetworkRepository = onwebviewdestory;
    }

    @NotNull
    public final ReceivedTitlePoint buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        ReceivedTitlePoint doGnConsult = this.globalNetworkRepository.doGnConsult(setmax.getSdkRequestHeaderMap(), setmax.getSdkRequestData());
        Intrinsics.checkNotNullExpressionValue(doGnConsult, "globalNetworkRepository.…   params.sdkRequestData)");
        return doGnConsult;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/GnConsult$Params;", "", "sdkRequestHeaderMap", "", "", "sdkRequestData", "(Ljava/util/Map;Ljava/lang/String;)V", "getSdkRequestData", "()Ljava/lang/String;", "setSdkRequestData", "(Ljava/lang/String;)V", "getSdkRequestHeaderMap", "()Ljava/util/Map;", "setSdkRequestHeaderMap", "(Ljava/util/Map;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private String sdkRequestData;
        @NotNull
        private Map<String, String> sdkRequestHeaderMap;

        public static /* synthetic */ setMax copy$default(setMax setmax, Map<String, String> map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = setmax.sdkRequestHeaderMap;
            }
            if ((i & 2) != 0) {
                str = setmax.sdkRequestData;
            }
            return setmax.copy(map, str);
        }

        @NotNull
        public final Map<String, String> component1() {
            return this.sdkRequestHeaderMap;
        }

        @NotNull
        public final String component2() {
            return this.sdkRequestData;
        }

        @NotNull
        public final setMax copy(@NotNull Map<String, String> map, @NotNull String str) {
            Intrinsics.checkNotNullParameter(map, "sdkRequestHeaderMap");
            Intrinsics.checkNotNullParameter(str, "sdkRequestData");
            return new setMax(map, str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return Intrinsics.areEqual((Object) this.sdkRequestHeaderMap, (Object) setmax.sdkRequestHeaderMap) && Intrinsics.areEqual((Object) this.sdkRequestData, (Object) setmax.sdkRequestData);
        }

        public final int hashCode() {
            Map<String, String> map = this.sdkRequestHeaderMap;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            String str = this.sdkRequestData;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(sdkRequestHeaderMap=");
            sb.append(this.sdkRequestHeaderMap);
            sb.append(", sdkRequestData=");
            sb.append(this.sdkRequestData);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull Map<String, String> map, @NotNull String str) {
            Intrinsics.checkNotNullParameter(map, "sdkRequestHeaderMap");
            Intrinsics.checkNotNullParameter(str, "sdkRequestData");
            this.sdkRequestHeaderMap = map;
            this.sdkRequestData = str;
        }

        @NotNull
        public final Map<String, String> getSdkRequestHeaderMap() {
            return this.sdkRequestHeaderMap;
        }

        public final void setSdkRequestHeaderMap(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.sdkRequestHeaderMap = map;
        }

        @NotNull
        public final String getSdkRequestData() {
            return this.sdkRequestData;
        }

        public final void setSdkRequestData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sdkRequestData = str;
        }
    }
}
