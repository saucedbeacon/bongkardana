package o;

import id.dana.danah5.bioutility.BioUtilityBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/bokuverification/BokuVerification;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/bokuverification/BokuVerification$Params;", "bokuRepository", "Lid/dana/domain/bokuverification/BokuRepository;", "(Lid/dana/domain/bokuverification/BokuRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "param", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onPageError extends APWebChromeClient<Boolean, getMax> {
    private final GriverBaseManifest bokuRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onPageError(@NotNull GriverBaseManifest griverBaseManifest) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverBaseManifest, "bokuRepository");
        this.bokuRepository = griverBaseManifest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "param");
        return this.bokuRepository.verifyBoku(getmax.getSecurityId(), getmax.getPhoneNumber(), getmax.getWithMobileData(), getmax.getTrackerSource());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/domain/bokuverification/BokuVerification$Params;", "", "securityId", "", "phoneNumber", "withMobileData", "", "trackerSource", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getSecurityId", "getTrackerSource", "getWithMobileData", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String phoneNumber;
        @NotNull
        private final String securityId;
        @NotNull
        private final String trackerSource;
        private final boolean withMobileData;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.securityId;
            }
            if ((i & 2) != 0) {
                str2 = getmax.phoneNumber;
            }
            if ((i & 4) != 0) {
                z = getmax.withMobileData;
            }
            if ((i & 8) != 0) {
                str3 = getmax.trackerSource;
            }
            return getmax.copy(str, str2, z, str3);
        }

        @NotNull
        public final String component1() {
            return this.securityId;
        }

        @NotNull
        public final String component2() {
            return this.phoneNumber;
        }

        public final boolean component3() {
            return this.withMobileData;
        }

        @NotNull
        public final String component4() {
            return this.trackerSource;
        }

        @NotNull
        public final getMax copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "trackerSource");
            return new getMax(str, str2, z, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.securityId, (Object) getmax.securityId) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) getmax.phoneNumber) && this.withMobileData == getmax.withMobileData && Intrinsics.areEqual((Object) this.trackerSource, (Object) getmax.trackerSource);
        }

        public final int hashCode() {
            String str = this.securityId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.phoneNumber;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.withMobileData;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            String str3 = this.trackerSource;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(securityId=");
            sb.append(this.securityId);
            sb.append(", phoneNumber=");
            sb.append(this.phoneNumber);
            sb.append(", withMobileData=");
            sb.append(this.withMobileData);
            sb.append(", trackerSource=");
            sb.append(this.trackerSource);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "trackerSource");
            this.securityId = str;
            this.phoneNumber = str2;
            this.withMobileData = z;
            this.trackerSource = str3;
        }

        @NotNull
        public final String getSecurityId() {
            return this.securityId;
        }

        @NotNull
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final boolean getWithMobileData() {
            return this.withMobileData;
        }

        @NotNull
        public final String getTrackerSource() {
            return this.trackerSource;
        }
    }
}
