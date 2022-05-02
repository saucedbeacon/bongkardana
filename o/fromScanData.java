package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/registration/interactor/CheckRegisteredPhoneNumber;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "Lid/dana/domain/registration/interactor/CheckRegisteredPhoneNumber$Param;", "registrationRepository", "Lid/dana/domain/registration/RegistrationRepository;", "(Lid/dana/domain/registration/RegistrationRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class fromScanData extends APWebChromeClient<setEncryptProxy, getMax> {
    private final setDistanceCalculator registrationRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public fromScanData(@NotNull setDistanceCalculator setdistancecalculator) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdistancecalculator, "registrationRepository");
        this.registrationRepository = setdistancecalculator;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setEncryptProxy> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<setEncryptProxy> checkRegistration = this.registrationRepository.checkRegistration(getmax.getPhoneNumber(), getmax.getOtpChannel(), getmax.getClientId(), getmax.getMerchantId());
        Intrinsics.checkNotNullExpressionValue(checkRegistration, "registrationRepository.c…entId, params.merchantId)");
        return checkRegistration;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/domain/registration/interactor/CheckRegisteredPhoneNumber$Param;", "", "phoneNumber", "", "otpChannel", "clientId", "merchantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getMerchantId", "getOtpChannel", "getPhoneNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String clientId;
        @NotNull
        private final String merchantId;
        @NotNull
        private final String otpChannel;
        @NotNull
        private final String phoneNumber;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = getmax.otpChannel;
            }
            if ((i & 4) != 0) {
                str3 = getmax.clientId;
            }
            if ((i & 8) != 0) {
                str4 = getmax.merchantId;
            }
            return getmax.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.phoneNumber;
        }

        @NotNull
        public final String component2() {
            return this.otpChannel;
        }

        @NotNull
        public final String component3() {
            return this.clientId;
        }

        @NotNull
        public final String component4() {
            return this.merchantId;
        }

        @NotNull
        public final getMax copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str2, "otpChannel");
            Intrinsics.checkNotNullParameter(str3, "clientId");
            Intrinsics.checkNotNullParameter(str4, "merchantId");
            return new getMax(str, str2, str3, str4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.phoneNumber, (Object) getmax.phoneNumber) && Intrinsics.areEqual((Object) this.otpChannel, (Object) getmax.otpChannel) && Intrinsics.areEqual((Object) this.clientId, (Object) getmax.clientId) && Intrinsics.areEqual((Object) this.merchantId, (Object) getmax.merchantId);
        }

        public final int hashCode() {
            String str = this.phoneNumber;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.otpChannel;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.clientId;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.merchantId;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(phoneNumber=");
            sb.append(this.phoneNumber);
            sb.append(", otpChannel=");
            sb.append(this.otpChannel);
            sb.append(", clientId=");
            sb.append(this.clientId);
            sb.append(", merchantId=");
            sb.append(this.merchantId);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str2, "otpChannel");
            Intrinsics.checkNotNullParameter(str3, "clientId");
            Intrinsics.checkNotNullParameter(str4, "merchantId");
            this.phoneNumber = str;
            this.otpChannel = str2;
            this.clientId = str3;
            this.merchantId = str4;
        }

        @NotNull
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NotNull
        public final String getOtpChannel() {
            return this.otpChannel;
        }

        @NotNull
        public final String getClientId() {
            return this.clientId;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }
    }
}
