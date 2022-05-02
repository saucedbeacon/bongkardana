package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverResourceManager;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/promocode/interactor/ApplyPromoCode;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/promocode/model/PromoCode;", "Lid/dana/domain/promocode/interactor/ApplyPromoCode$ApplyPromoCodeParams;", "promoCodeRepository", "Lid/dana/domain/promocode/repository/PromoCodeRepository;", "(Lid/dana/domain/promocode/repository/PromoCodeRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "ApplyPromoCodeParams", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAppCenter extends APWebChromeClient<GriverResourceManager.AnonymousClass1, setMax> {
    private final queryLastRefreshTimestamp promoCodeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverAppCenter(@NotNull queryLastRefreshTimestamp querylastrefreshtimestamp) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(querylastrefreshtimestamp, "promoCodeRepository");
        this.promoCodeRepository = querylastrefreshtimestamp;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/promocode/interactor/ApplyPromoCode$ApplyPromoCodeParams;", "", "promoCode", "", "(Ljava/lang/String;)V", "getPromoCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final String promoCode;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmax.promoCode;
            }
            return setmax.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.promoCode;
        }

        @NotNull
        public final setMax copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "promoCode");
            return new setMax(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.promoCode, (Object) ((setMax) obj).promoCode);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.promoCode;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplyPromoCodeParams(promoCode=");
            sb.append(this.promoCode);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "promoCode");
            this.promoCode = str;
        }

        @NotNull
        public final String getPromoCode() {
            return this.promoCode;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverResourceManager.AnonymousClass1> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.promoCodeRepository.applyPromoCode(setmax.getPromoCode());
    }
}
