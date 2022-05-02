package o;

import id.dana.danah5.bioutility.BioUtilityBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/twilio/onboarding/model/request/TwilioVerifySecurityProductModel;", "", "securityId", "", "verificationMethod", "validateData", "sendOtpStrategy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecurityId", "()Ljava/lang/String;", "getSendOtpStrategy", "getValidateData", "getVerificationMethod", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class beehiveMultilevelSelect {
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public beehiveMultilevelSelect() {
        this((String) null, (String) null, (String) null, (String) null, 15);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beehiveMultilevelSelect)) {
            return false;
        }
        beehiveMultilevelSelect beehivemultilevelselect = (beehiveMultilevelSelect) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) beehivemultilevelselect.getMin) && Intrinsics.areEqual((Object) this.length, (Object) beehivemultilevelselect.length) && Intrinsics.areEqual((Object) this.setMax, (Object) beehivemultilevelselect.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) beehivemultilevelselect.setMin);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioVerifySecurityProductModel(securityId=");
        sb.append(this.getMin);
        sb.append(", verificationMethod=");
        sb.append(this.length);
        sb.append(", validateData=");
        sb.append(this.setMax);
        sb.append(", sendOtpStrategy=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    private beehiveMultilevelSelect(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, "validateData");
        Intrinsics.checkNotNullParameter(str4, "sendOtpStrategy");
        this.getMin = str;
        this.length = str2;
        this.setMax = str3;
        this.setMin = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ beehiveMultilevelSelect(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
