package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/kycamledd/model/EddSubmitInfoDTO;", "", "questionId", "", "answerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswerId", "()Ljava/lang/String;", "getQuestionId", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverExecutors {
    @NotNull
    private final String answerId;
    @NotNull
    private final String questionId;

    public GriverExecutors() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public GriverExecutors(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "questionId");
        Intrinsics.checkNotNullParameter(str2, "answerId");
        this.questionId = str;
        this.answerId = str2;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverExecutors(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final String getAnswerId() {
        return this.answerId;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/kycrenewal/model/QueryKYCRenewalStatus;", "", "renewKYC", "", "verificationId", "", "(ZLjava/lang/String;)V", "getRenewKYC", "()Z", "getVerificationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class H5SingleThreadFactory {
        private final boolean renewKYC;
        @NotNull
        private final String verificationId;

        /* renamed from: o.GriverExecutors$H5SingleThreadFactory$1  reason: invalid class name */
        public interface AnonymousClass1 {
            TitleBarRightButtonView.AnonymousClass1<GriverRVExecutorServiceImpl> getLazadaRegistrationUrl(String str, String str2);

            TitleBarRightButtonView.AnonymousClass1<Boolean> isClickedAgree();

            TitleBarRightButtonView.AnonymousClass1<Boolean> saveClickedAgree();
        }

        public static /* synthetic */ H5SingleThreadFactory copy$default(H5SingleThreadFactory h5SingleThreadFactory, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = h5SingleThreadFactory.renewKYC;
            }
            if ((i & 2) != 0) {
                str = h5SingleThreadFactory.verificationId;
            }
            return h5SingleThreadFactory.copy(z, str);
        }

        public final boolean component1() {
            return this.renewKYC;
        }

        @NotNull
        public final String component2() {
            return this.verificationId;
        }

        @NotNull
        public final H5SingleThreadFactory copy(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "verificationId");
            return new H5SingleThreadFactory(z, str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof H5SingleThreadFactory)) {
                return false;
            }
            H5SingleThreadFactory h5SingleThreadFactory = (H5SingleThreadFactory) obj;
            return this.renewKYC == h5SingleThreadFactory.renewKYC && Intrinsics.areEqual((Object) this.verificationId, (Object) h5SingleThreadFactory.verificationId);
        }

        public final int hashCode() {
            boolean z = this.renewKYC;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.verificationId;
            return i + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("QueryKYCRenewalStatus(renewKYC=");
            sb.append(this.renewKYC);
            sb.append(", verificationId=");
            sb.append(this.verificationId);
            sb.append(")");
            return sb.toString();
        }

        public H5SingleThreadFactory(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "verificationId");
            this.renewKYC = z;
            this.verificationId = str;
        }

        public final boolean getRenewKYC() {
            return this.renewKYC;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ H5SingleThreadFactory(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? "" : str);
        }

        @NotNull
        public final String getVerificationId() {
            return this.verificationId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lid/dana/domain/kycrenewal/model/KYCRenewalUserInfo;", "", "fullName", "", "gender", "certId", "dateOfBirth", "occupation", "address", "addressRT", "addressRW", "city", "district", "province", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAddressRT", "getAddressRW", "getCertId", "getCity", "getDateOfBirth", "getDistrict", "getFullName", "getGender", "getOccupation", "getProvince", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class DiscardOldestPolicy {
        @NotNull
        private final String address;
        @NotNull
        private final String addressRT;
        @NotNull
        private final String addressRW;
        @NotNull
        private final String certId;
        @NotNull
        private final String city;
        @NotNull
        private final String dateOfBirth;
        @NotNull
        private final String district;
        @NotNull
        private final String fullName;
        @NotNull
        private final String gender;
        @NotNull
        private final String occupation;
        @NotNull
        private final String province;

        public DiscardOldestPolicy() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ DiscardOldestPolicy copy$default(DiscardOldestPolicy discardOldestPolicy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
            DiscardOldestPolicy discardOldestPolicy2 = discardOldestPolicy;
            int i2 = i;
            return discardOldestPolicy.copy((i2 & 1) != 0 ? discardOldestPolicy2.fullName : str, (i2 & 2) != 0 ? discardOldestPolicy2.gender : str2, (i2 & 4) != 0 ? discardOldestPolicy2.certId : str3, (i2 & 8) != 0 ? discardOldestPolicy2.dateOfBirth : str4, (i2 & 16) != 0 ? discardOldestPolicy2.occupation : str5, (i2 & 32) != 0 ? discardOldestPolicy2.address : str6, (i2 & 64) != 0 ? discardOldestPolicy2.addressRT : str7, (i2 & 128) != 0 ? discardOldestPolicy2.addressRW : str8, (i2 & 256) != 0 ? discardOldestPolicy2.city : str9, (i2 & 512) != 0 ? discardOldestPolicy2.district : str10, (i2 & 1024) != 0 ? discardOldestPolicy2.province : str11);
        }

        @NotNull
        public final String component1() {
            return this.fullName;
        }

        @NotNull
        public final String component10() {
            return this.district;
        }

        @NotNull
        public final String component11() {
            return this.province;
        }

        @NotNull
        public final String component2() {
            return this.gender;
        }

        @NotNull
        public final String component3() {
            return this.certId;
        }

        @NotNull
        public final String component4() {
            return this.dateOfBirth;
        }

        @NotNull
        public final String component5() {
            return this.occupation;
        }

        @NotNull
        public final String component6() {
            return this.address;
        }

        @NotNull
        public final String component7() {
            return this.addressRT;
        }

        @NotNull
        public final String component8() {
            return this.addressRW;
        }

        @NotNull
        public final String component9() {
            return this.city;
        }

        @NotNull
        public final DiscardOldestPolicy copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1510170036, oncanceled);
                onCancelLoad.getMin(-1510170036, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "fullName");
            Intrinsics.checkNotNullParameter(str2, "gender");
            String str12 = str3;
            Intrinsics.checkNotNullParameter(str12, "certId");
            String str13 = str4;
            Intrinsics.checkNotNullParameter(str13, "dateOfBirth");
            String str14 = str5;
            Intrinsics.checkNotNullParameter(str14, "occupation");
            String str15 = str6;
            Intrinsics.checkNotNullParameter(str15, "address");
            String str16 = str7;
            Intrinsics.checkNotNullParameter(str16, "addressRT");
            String str17 = str8;
            Intrinsics.checkNotNullParameter(str17, "addressRW");
            String str18 = str9;
            Intrinsics.checkNotNullParameter(str18, desc.USER_CITY);
            String str19 = str10;
            Intrinsics.checkNotNullParameter(str19, "district");
            String str20 = str11;
            Intrinsics.checkNotNullParameter(str20, "province");
            return new DiscardOldestPolicy(str, str2, str12, str13, str14, str15, str16, str17, str18, str19, str20);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscardOldestPolicy)) {
                return false;
            }
            DiscardOldestPolicy discardOldestPolicy = (DiscardOldestPolicy) obj;
            return Intrinsics.areEqual((Object) this.fullName, (Object) discardOldestPolicy.fullName) && Intrinsics.areEqual((Object) this.gender, (Object) discardOldestPolicy.gender) && Intrinsics.areEqual((Object) this.certId, (Object) discardOldestPolicy.certId) && Intrinsics.areEqual((Object) this.dateOfBirth, (Object) discardOldestPolicy.dateOfBirth) && Intrinsics.areEqual((Object) this.occupation, (Object) discardOldestPolicy.occupation) && Intrinsics.areEqual((Object) this.address, (Object) discardOldestPolicy.address) && Intrinsics.areEqual((Object) this.addressRT, (Object) discardOldestPolicy.addressRT) && Intrinsics.areEqual((Object) this.addressRW, (Object) discardOldestPolicy.addressRW) && Intrinsics.areEqual((Object) this.city, (Object) discardOldestPolicy.city) && Intrinsics.areEqual((Object) this.district, (Object) discardOldestPolicy.district) && Intrinsics.areEqual((Object) this.province, (Object) discardOldestPolicy.province);
        }

        public final int hashCode() {
            String str = this.fullName;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.gender;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.certId;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.dateOfBirth;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.occupation;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.address;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.addressRT;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.addressRW;
            int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.city;
            int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.district;
            int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.province;
            if (str11 != null) {
                i = str11.hashCode();
            }
            return hashCode10 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("KYCRenewalUserInfo(fullName=");
            sb.append(this.fullName);
            sb.append(", gender=");
            sb.append(this.gender);
            sb.append(", certId=");
            sb.append(this.certId);
            sb.append(", dateOfBirth=");
            sb.append(this.dateOfBirth);
            sb.append(", occupation=");
            sb.append(this.occupation);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", addressRT=");
            sb.append(this.addressRT);
            sb.append(", addressRW=");
            sb.append(this.addressRW);
            sb.append(", city=");
            sb.append(this.city);
            sb.append(", district=");
            sb.append(this.district);
            sb.append(", province=");
            sb.append(this.province);
            sb.append(")");
            return sb.toString();
        }

        public DiscardOldestPolicy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
            Intrinsics.checkNotNullParameter(str, "fullName");
            Intrinsics.checkNotNullParameter(str2, "gender");
            Intrinsics.checkNotNullParameter(str3, "certId");
            Intrinsics.checkNotNullParameter(str4, "dateOfBirth");
            Intrinsics.checkNotNullParameter(str5, "occupation");
            Intrinsics.checkNotNullParameter(str6, "address");
            Intrinsics.checkNotNullParameter(str7, "addressRT");
            Intrinsics.checkNotNullParameter(str8, "addressRW");
            Intrinsics.checkNotNullParameter(str9, desc.USER_CITY);
            Intrinsics.checkNotNullParameter(str10, "district");
            Intrinsics.checkNotNullParameter(str11, "province");
            this.fullName = str;
            this.gender = str2;
            this.certId = str3;
            this.dateOfBirth = str4;
            this.occupation = str5;
            this.address = str6;
            this.addressRT = str7;
            this.addressRW = str8;
            this.city = str9;
            this.district = str10;
            this.province = str11;
        }

        @NotNull
        public final String getFullName() {
            return this.fullName;
        }

        @NotNull
        public final String getGender() {
            return this.gender;
        }

        @NotNull
        public final String getCertId() {
            return this.certId;
        }

        @NotNull
        public final String getDateOfBirth() {
            return this.dateOfBirth;
        }

        @NotNull
        public final String getOccupation() {
            return this.occupation;
        }

        @NotNull
        public final String getAddress() {
            return this.address;
        }

        @NotNull
        public final String getAddressRT() {
            return this.addressRT;
        }

        @NotNull
        public final String getAddressRW() {
            return this.addressRW;
        }

        @NotNull
        public final String getCity() {
            return this.city;
        }

        @NotNull
        public final String getDistrict() {
            return this.district;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ DiscardOldestPolicy(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r12 = this;
                r0 = r24
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r13
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0012
            L_0x0011:
                r3 = r14
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r15
            L_0x0019:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001f
                r5 = r2
                goto L_0x0021
            L_0x001f:
                r5 = r16
            L_0x0021:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0027
                r6 = r2
                goto L_0x0029
            L_0x0027:
                r6 = r17
            L_0x0029:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002f
                r7 = r2
                goto L_0x0031
            L_0x002f:
                r7 = r18
            L_0x0031:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0037
                r8 = r2
                goto L_0x0039
            L_0x0037:
                r8 = r19
            L_0x0039:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003f
                r9 = r2
                goto L_0x0041
            L_0x003f:
                r9 = r20
            L_0x0041:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0047
                r10 = r2
                goto L_0x0049
            L_0x0047:
                r10 = r21
            L_0x0049:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x004f
                r11 = r2
                goto L_0x0051
            L_0x004f:
                r11 = r22
            L_0x0051:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0056
                goto L_0x0058
            L_0x0056:
                r2 = r23
            L_0x0058:
                r13 = r12
                r14 = r1
                r15 = r3
                r16 = r4
                r17 = r5
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r11
                r24 = r2
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.GriverExecutors.DiscardOldestPolicy.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @NotNull
        public final String getProvince() {
            return this.province;
        }
    }
}
