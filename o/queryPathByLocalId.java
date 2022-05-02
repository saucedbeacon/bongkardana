package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/GetLinkedMerchants;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/merchantmanagement/model/LinkedMerchantInfo;", "Lid/dana/domain/merchantmanagement/interactor/GetLinkedMerchants$Params;", "merchantManagementRepository", "Lid/dana/domain/merchantmanagement/MerchantManagementRepository;", "(Lid/dana/domain/merchantmanagement/MerchantManagementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class queryPathByLocalId extends APWebChromeClient<hasFolderPermission, getMax> {
    private final GriverFileAbilityImpl merchantManagementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public queryPathByLocalId(@NotNull GriverFileAbilityImpl griverFileAbilityImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverFileAbilityImpl, "merchantManagementRepository");
        this.merchantManagementRepository = griverFileAbilityImpl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<hasFolderPermission> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.merchantManagementRepository.getLinkedMerchants(getmax.getPageNumber());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/GetLinkedMerchants$Params;", "", "pageNumber", "", "(I)V", "getPageNumber", "()I", "setPageNumber", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private int pageNumber;

        public static /* synthetic */ getMax copy$default(getMax getmax, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getmax.pageNumber;
            }
            return getmax.copy(i);
        }

        public final int component1() {
            return this.pageNumber;
        }

        @NotNull
        public final getMax copy(int i) {
            return new getMax(i);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMax) && this.pageNumber == ((getMax) obj).pageNumber;
            }
            return true;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(pageNumber=");
            sb.append(this.pageNumber);
            sb.append(")");
            return sb.toString();
        }

        public getMax(int i) {
            this.pageNumber = i;
        }

        public final int getPageNumber() {
            return this.pageNumber;
        }

        public final void setPageNumber(int i) {
            this.pageNumber = i;
        }

        public final int hashCode() {
            return Integer.valueOf(this.pageNumber).hashCode();
        }
    }
}
