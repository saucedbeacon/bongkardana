package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/UnbindMerchant;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/merchantmanagement/interactor/UnbindMerchant$Params;", "merchantManagementRepository", "Lid/dana/domain/merchantmanagement/MerchantManagementRepository;", "(Lid/dana/domain/merchantmanagement/MerchantManagementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class queryLocalIdByPath extends APWebChromeClient<Boolean, length> {
    private final GriverFileAbilityImpl merchantManagementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public queryLocalIdByPath(@NotNull GriverFileAbilityImpl griverFileAbilityImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverFileAbilityImpl, "merchantManagementRepository");
        this.merchantManagementRepository = griverFileAbilityImpl;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.merchantManagementRepository.unbindMerchant(length2.getUnbindMerchantParam());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/UnbindMerchant$Params;", "", "unbindMerchantParam", "Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;", "(Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;)V", "getUnbindMerchantParam", "()Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final LocalIdTool unbindMerchantParam;

        public static /* synthetic */ length copy$default(length length, LocalIdTool localIdTool, int i, Object obj) {
            if ((i & 1) != 0) {
                localIdTool = length.unbindMerchantParam;
            }
            return length.copy(localIdTool);
        }

        @NotNull
        public final LocalIdTool component1() {
            return this.unbindMerchantParam;
        }

        @NotNull
        public final length copy(@NotNull LocalIdTool localIdTool) {
            Intrinsics.checkNotNullParameter(localIdTool, "unbindMerchantParam");
            return new length(localIdTool);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof length) && Intrinsics.areEqual((Object) this.unbindMerchantParam, (Object) ((length) obj).unbindMerchantParam);
            }
            return true;
        }

        public final int hashCode() {
            LocalIdTool localIdTool = this.unbindMerchantParam;
            if (localIdTool != null) {
                return localIdTool.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(unbindMerchantParam=");
            sb.append(this.unbindMerchantParam);
            sb.append(")");
            return sb.toString();
        }

        public length(@NotNull LocalIdTool localIdTool) {
            Intrinsics.checkNotNullParameter(localIdTool, "unbindMerchantParam");
            this.unbindMerchantParam = localIdTool;
        }

        @NotNull
        public final LocalIdTool getUnbindMerchantParam() {
            return this.unbindMerchantParam;
        }
    }
}
