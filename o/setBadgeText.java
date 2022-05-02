package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/data/here/model/HereTokenResponse;", "", "access_token", "", "token_type", "expires_in", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAccess_token", "()Ljava/lang/String;", "getExpires_in", "()J", "getToken_type", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "isValid", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBadgeText {
    @NotNull
    private final String access_token;
    private final long expires_in;
    @NotNull
    private final String token_type;

    public static /* synthetic */ setBadgeText copy$default(setBadgeText setbadgetext, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setbadgetext.access_token;
        }
        if ((i & 2) != 0) {
            str2 = setbadgetext.token_type;
        }
        if ((i & 4) != 0) {
            j = setbadgetext.expires_in;
        }
        return setbadgetext.copy(str, str2, j);
    }

    @NotNull
    public final String component1() {
        return this.access_token;
    }

    @NotNull
    public final String component2() {
        return this.token_type;
    }

    public final long component3() {
        return this.expires_in;
    }

    @NotNull
    public final setBadgeText copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "token_type");
        return new setBadgeText(str, str2, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setBadgeText)) {
            return false;
        }
        setBadgeText setbadgetext = (setBadgeText) obj;
        return Intrinsics.areEqual((Object) this.access_token, (Object) setbadgetext.access_token) && Intrinsics.areEqual((Object) this.token_type, (Object) setbadgetext.token_type) && this.expires_in == setbadgetext.expires_in;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HereTokenResponse(access_token=");
        sb.append(this.access_token);
        sb.append(", token_type=");
        sb.append(this.token_type);
        sb.append(", expires_in=");
        sb.append(this.expires_in);
        sb.append(")");
        return sb.toString();
    }

    public setBadgeText(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "access_token");
        Intrinsics.checkNotNullParameter(str2, "token_type");
        this.access_token = str;
        this.token_type = str2;
        this.expires_in = j;
    }

    @NotNull
    public final String getAccess_token() {
        return this.access_token;
    }

    @NotNull
    public final String getToken_type() {
        return this.token_type;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    public final boolean isValid() {
        if (this.access_token.length() > 0) {
            return (this.token_type.length() > 0) && this.expires_in > 0;
        }
    }

    public final int hashCode() {
        String str = this.access_token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.token_type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + Long.valueOf(this.expires_in).hashCode();
    }
}
