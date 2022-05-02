package o;

import id.dana.domain.merchant.MerchantCategoryType;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverRVTransortServiceImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/merchant/interactor/GetNewMerchantCategories;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/merchant/model/MerchantCategory;", "Lid/dana/domain/merchant/interactor/GetNewMerchantCategories$Params;", "merchantCategoriesRepository", "Lid/dana/domain/merchant/MerchantCategoriesRepository;", "(Lid/dana/domain/merchant/MerchantCategoriesRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class requestUrl extends APWebChromeClient<List<? extends GriverRVTransortServiceImpl.AnonymousClass1>, setMin> {
    private final workerType merchantCategoriesRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public requestUrl(@NotNull workerType workertype) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(workertype, "merchantCategoriesRepository");
        this.merchantCategoriesRepository = workertype;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> newMerchantCategories = this.merchantCategoriesRepository.getNewMerchantCategories(setmin.getType());
        Intrinsics.checkNotNullExpressionValue(newMerchantCategories, "merchantCategoriesReposi…ntCategories(params.type)");
        return newMerchantCategories;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/domain/merchant/interactor/GetNewMerchantCategories$Params;", "", "type", "Lid/dana/domain/merchant/MerchantCategoryType;", "(Lid/dana/domain/merchant/MerchantCategoryType;)V", "getType", "()Lid/dana/domain/merchant/MerchantCategoryType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final MerchantCategoryType type;

        public static /* synthetic */ setMin copy$default(setMin setmin, MerchantCategoryType merchantCategoryType, int i, Object obj) {
            if ((i & 1) != 0) {
                merchantCategoryType = setmin.type;
            }
            return setmin.copy(merchantCategoryType);
        }

        @NotNull
        public final MerchantCategoryType component1() {
            return this.type;
        }

        @NotNull
        public final setMin copy(@NotNull MerchantCategoryType merchantCategoryType) {
            Intrinsics.checkNotNullParameter(merchantCategoryType, "type");
            return new setMin(merchantCategoryType);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMin) && Intrinsics.areEqual((Object) this.type, (Object) ((setMin) obj).type);
            }
            return true;
        }

        public final int hashCode() {
            MerchantCategoryType merchantCategoryType = this.type;
            if (merchantCategoryType != null) {
                return merchantCategoryType.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.type);
            sb.append(")");
            return sb.toString();
        }

        public setMin(@NotNull MerchantCategoryType merchantCategoryType) {
            Intrinsics.checkNotNullParameter(merchantCategoryType, "type");
            this.type = merchantCategoryType;
        }

        @NotNull
        public final MerchantCategoryType getType() {
            return this.type;
        }
    }
}
