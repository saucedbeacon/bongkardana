package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b¨\u0006#"}, d2 = {"Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "accessToken", "", "tokenType", "accessTokenExpireTime", "scope", "consumerSecret", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAccessTokenExpireTime", "getConsumerSecret", "reffNumber", "getReffNumber", "setReffNumber", "(Ljava/lang/String;)V", "getScope", "getTokenType", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAnimResId extends BaseRpcResult {
    @NotNull
    private final String accessToken;
    @NotNull
    private final String accessTokenExpireTime;
    @NotNull
    private final String consumerSecret;
    @NotNull
    private String reffNumber = "";
    @Nullable
    private final String scope;
    @NotNull
    private final String tokenType;
    @NotNull
    private final String username;

    public static /* synthetic */ getAnimResId copy$default(getAnimResId getanimresid, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getanimresid.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = getanimresid.tokenType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getanimresid.accessTokenExpireTime;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getanimresid.scope;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getanimresid.consumerSecret;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getanimresid.username;
        }
        return getanimresid.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.accessToken;
    }

    @NotNull
    public final String component2() {
        return this.tokenType;
    }

    @NotNull
    public final String component3() {
        return this.accessTokenExpireTime;
    }

    @Nullable
    public final String component4() {
        return this.scope;
    }

    @NotNull
    public final String component5() {
        return this.consumerSecret;
    }

    @NotNull
    public final String component6() {
        return this.username;
    }

    @NotNull
    public final getAnimResId copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "tokenType");
        Intrinsics.checkNotNullParameter(str3, "accessTokenExpireTime");
        Intrinsics.checkNotNullParameter(str5, "consumerSecret");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        return new getAnimResId(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAnimResId)) {
            return false;
        }
        getAnimResId getanimresid = (getAnimResId) obj;
        return Intrinsics.areEqual((Object) this.accessToken, (Object) getanimresid.accessToken) && Intrinsics.areEqual((Object) this.tokenType, (Object) getanimresid.tokenType) && Intrinsics.areEqual((Object) this.accessTokenExpireTime, (Object) getanimresid.accessTokenExpireTime) && Intrinsics.areEqual((Object) this.scope, (Object) getanimresid.scope) && Intrinsics.areEqual((Object) this.consumerSecret, (Object) getanimresid.consumerSecret) && Intrinsics.areEqual((Object) this.username, (Object) getanimresid.username);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tokenType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.accessTokenExpireTime;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.scope;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.consumerSecret;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.username;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrizziGetAccessTokenResponse(accessToken=");
        sb.append(this.accessToken);
        sb.append(", tokenType=");
        sb.append(this.tokenType);
        sb.append(", accessTokenExpireTime=");
        sb.append(this.accessTokenExpireTime);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", consumerSecret=");
        sb.append(this.consumerSecret);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    @NotNull
    public final String getAccessTokenExpireTime() {
        return this.accessTokenExpireTime;
    }

    @Nullable
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final String getConsumerSecret() {
        return this.consumerSecret;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public getAnimResId(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "tokenType");
        Intrinsics.checkNotNullParameter(str3, "accessTokenExpireTime");
        Intrinsics.checkNotNullParameter(str5, "consumerSecret");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        this.accessToken = str;
        this.tokenType = str2;
        this.accessTokenExpireTime = str3;
        this.scope = str4;
        this.consumerSecret = str5;
        this.username = str6;
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
