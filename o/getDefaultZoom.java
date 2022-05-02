package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lid/dana/domain/electronicmoney/model/response/BrizziAccessTokenInfo;", "", "accessToken", "", "consumerSecret", "username", "reffNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getConsumerSecret", "setConsumerSecret", "getReffNumber", "setReffNumber", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDefaultZoom {
    @NotNull
    private String accessToken;
    @NotNull
    private String consumerSecret;
    @NotNull
    private String reffNumber;
    @NotNull
    private String username;

    public static /* synthetic */ getDefaultZoom copy$default(getDefaultZoom getdefaultzoom, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getdefaultzoom.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = getdefaultzoom.consumerSecret;
        }
        if ((i & 4) != 0) {
            str3 = getdefaultzoom.username;
        }
        if ((i & 8) != 0) {
            str4 = getdefaultzoom.reffNumber;
        }
        return getdefaultzoom.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.accessToken;
    }

    @NotNull
    public final String component2() {
        return this.consumerSecret;
    }

    @NotNull
    public final String component3() {
        return this.username;
    }

    @NotNull
    public final String component4() {
        return this.reffNumber;
    }

    @NotNull
    public final getDefaultZoom copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "consumerSecret");
        Intrinsics.checkNotNullParameter(str3, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkNotNullParameter(str4, "reffNumber");
        return new getDefaultZoom(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDefaultZoom)) {
            return false;
        }
        getDefaultZoom getdefaultzoom = (getDefaultZoom) obj;
        return Intrinsics.areEqual((Object) this.accessToken, (Object) getdefaultzoom.accessToken) && Intrinsics.areEqual((Object) this.consumerSecret, (Object) getdefaultzoom.consumerSecret) && Intrinsics.areEqual((Object) this.username, (Object) getdefaultzoom.username) && Intrinsics.areEqual((Object) this.reffNumber, (Object) getdefaultzoom.reffNumber);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.consumerSecret;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.username;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.reffNumber;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrizziAccessTokenInfo(accessToken=");
        sb.append(this.accessToken);
        sb.append(", consumerSecret=");
        sb.append(this.consumerSecret);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(", reffNumber=");
        sb.append(this.reffNumber);
        sb.append(")");
        return sb.toString();
    }

    public getDefaultZoom(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "consumerSecret");
        Intrinsics.checkNotNullParameter(str3, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkNotNullParameter(str4, "reffNumber");
        this.accessToken = str;
        this.consumerSecret = str2;
        this.username = str3;
        this.reffNumber = str4;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    @NotNull
    public final String getConsumerSecret() {
        return this.consumerSecret;
    }

    public final void setConsumerSecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consumerSecret = str;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }

    @NotNull
    public final String getReffNumber() {
        return this.reffNumber;
    }

    public final void setReffNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reffNumber = str;
    }
}
