package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lid/dana/model/FaceAuthenticationModel;", "", "passwordAuthMethod", "Lid/dana/model/LoginAuthenticationMethod;", "faceLoginAuthMethod", "securityId", "", "(Lid/dana/model/LoginAuthenticationMethod;Lid/dana/model/LoginAuthenticationMethod;Ljava/lang/String;)V", "getFaceLoginAuthMethod", "()Lid/dana/model/LoginAuthenticationMethod;", "getPasswordAuthMethod", "getSecurityId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "isFaceAuthRiskEnabled", "isPasswordRiskEnabled", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class inputFocus4Android {
    @Nullable
    public final String length;
    @NotNull
    private final OrientationBridgeExtension setMax;
    @NotNull
    public final OrientationBridgeExtension setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inputFocus4Android)) {
            return false;
        }
        inputFocus4Android inputfocus4android = (inputFocus4Android) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) inputfocus4android.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) inputfocus4android.setMin) && Intrinsics.areEqual((Object) this.length, (Object) inputfocus4android.length);
    }

    public final int hashCode() {
        OrientationBridgeExtension orientationBridgeExtension = this.setMax;
        int i = 0;
        int hashCode = (orientationBridgeExtension != null ? orientationBridgeExtension.hashCode() : 0) * 31;
        OrientationBridgeExtension orientationBridgeExtension2 = this.setMin;
        int hashCode2 = (hashCode + (orientationBridgeExtension2 != null ? orientationBridgeExtension2.hashCode() : 0)) * 31;
        String str = this.length;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FaceAuthenticationModel(passwordAuthMethod=");
        sb.append(this.setMax);
        sb.append(", faceLoginAuthMethod=");
        sb.append(this.setMin);
        sb.append(", securityId=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public inputFocus4Android(@NotNull OrientationBridgeExtension orientationBridgeExtension, @NotNull OrientationBridgeExtension orientationBridgeExtension2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(orientationBridgeExtension, "passwordAuthMethod");
        Intrinsics.checkNotNullParameter(orientationBridgeExtension2, "faceLoginAuthMethod");
        this.setMax = orientationBridgeExtension;
        this.setMin = orientationBridgeExtension2;
        this.length = str;
    }

    public final boolean setMin() {
        return this.setMax.length();
    }

    public final boolean getMin() {
        return this.setMin.length();
    }
}
