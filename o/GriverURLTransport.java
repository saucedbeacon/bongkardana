package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/ConsultUnbind;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/merchantmanagement/model/UnbindConsultInfo;", "Lid/dana/domain/merchantmanagement/interactor/ConsultUnbind$Params;", "merchantManagementRepository", "Lid/dana/domain/merchantmanagement/MerchantManagementRepository;", "(Lid/dana/domain/merchantmanagement/MerchantManagementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverURLTransport extends APWebChromeClient<encodeToLocalId, getMin> {
    private final GriverFileAbilityImpl merchantManagementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverURLTransport(@NotNull GriverFileAbilityImpl griverFileAbilityImpl) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverFileAbilityImpl, "merchantManagementRepository");
        this.merchantManagementRepository = griverFileAbilityImpl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/domain/merchantmanagement/interactor/ConsultUnbind$Params;", "", "clientId", "", "merchantId", "divisionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getDivisionId", "setDivisionId", "getMerchantId", "setMerchantId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private String clientId;
        @Nullable
        private String divisionId;
        @NotNull
        private String merchantId;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.clientId;
            }
            if ((i & 2) != 0) {
                str2 = getmin.merchantId;
            }
            if ((i & 4) != 0) {
                str3 = getmin.divisionId;
            }
            return getmin.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.clientId;
        }

        @NotNull
        public final String component2() {
            return this.merchantId;
        }

        @Nullable
        public final String component3() {
            return this.divisionId;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "clientId");
            Intrinsics.checkNotNullParameter(str2, "merchantId");
            return new getMin(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.clientId, (Object) getmin.clientId) && Intrinsics.areEqual((Object) this.merchantId, (Object) getmin.merchantId) && Intrinsics.areEqual((Object) this.divisionId, (Object) getmin.divisionId);
        }

        public final int hashCode() {
            String str = this.clientId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.merchantId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.divisionId;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(clientId=");
            sb.append(this.clientId);
            sb.append(", merchantId=");
            sb.append(this.merchantId);
            sb.append(", divisionId=");
            sb.append(this.divisionId);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "clientId");
            Intrinsics.checkNotNullParameter(str2, "merchantId");
            this.clientId = str;
            this.merchantId = str2;
            this.divisionId = str3;
        }

        @NotNull
        public final String getClientId() {
            return this.clientId;
        }

        public final void setClientId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.clientId = str;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        public final void setMerchantId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.merchantId = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ getMin(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        @Nullable
        public final String getDivisionId() {
            return this.divisionId;
        }

        public final void setDivisionId(@Nullable String str) {
            this.divisionId = str;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<encodeToLocalId> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.merchantManagementRepository.unbindConsult(getmin.getClientId(), getmin.getMerchantId(), getmin.getDivisionId());
    }
}
