package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000fB\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "nearbyMeRepository", "Lid/dana/domain/nearbyme/NearbyMeRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/nearbyme/NearbyMeRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isEmbeddedApp extends parseFailed<List<getTempPath>, getMax> {
    private final isRooted nearbyMeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isEmbeddedApp(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull isRooted isrooted) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(isrooted, "nearbyMeRepository");
        this.nearbyMeRepository = isrooted;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getTempPath>> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.nearbyMeRepository.getNearbyShopsPromo(getmax.getMerchantInfos());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo$Params;", "", "merchantInfos", "", "Lid/dana/domain/nearbyme/model/MerchantInfo;", "(Ljava/util/List;)V", "getMerchantInfos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final List<getUtdidEncrypt> merchantInfos;

        public static /* synthetic */ getMax copy$default(getMax getmax, List<getUtdidEncrypt> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = getmax.merchantInfos;
            }
            return getmax.copy(list);
        }

        @NotNull
        public final List<getUtdidEncrypt> component1() {
            return this.merchantInfos;
        }

        @NotNull
        public final getMax copy(@NotNull List<getUtdidEncrypt> list) {
            Intrinsics.checkNotNullParameter(list, "merchantInfos");
            return new getMax(list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMax) && Intrinsics.areEqual((Object) this.merchantInfos, (Object) ((getMax) obj).merchantInfos);
            }
            return true;
        }

        public final int hashCode() {
            List<getUtdidEncrypt> list = this.merchantInfos;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(merchantInfos=");
            sb.append(this.merchantInfos);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull List<getUtdidEncrypt> list) {
            Intrinsics.checkNotNullParameter(list, "merchantInfos");
            this.merchantInfos = list;
        }

        @NotNull
        public final List<getUtdidEncrypt> getMerchantInfos() {
            return this.merchantInfos;
        }
    }
}
