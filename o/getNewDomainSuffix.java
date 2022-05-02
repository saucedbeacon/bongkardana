package o;

import com.alibaba.fastjson.annotation.JSONCreator;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.constant.UrlTag;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, d2 = {"Lid/dana/data/sendmoney/model/BillerX2BEntity;", "Ljava/io/Serializable;", "billerName", "", "instId", "prefix", "clientId", "redirectUrl", "scopes", "agreed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAgreed", "()Z", "getBillerName", "()Ljava/lang/String;", "getClientId", "getInstId", "getPrefix", "getRedirectUrl", "getScopes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getNewDomainSuffix implements Serializable {
    boolean agreed;
    @NotNull
    String billerName;
    @NotNull
    String clientId;
    @NotNull
    String instId;
    @NotNull
    String prefix;
    @NotNull
    String redirectUrl;
    @NotNull
    String scopes;

    public /* synthetic */ getNewDomainSuffix() {
    }

    public static /* synthetic */ getNewDomainSuffix copy$default(getNewDomainSuffix getnewdomainsuffix, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getnewdomainsuffix.billerName;
        }
        if ((i & 2) != 0) {
            str2 = getnewdomainsuffix.instId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getnewdomainsuffix.prefix;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getnewdomainsuffix.clientId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getnewdomainsuffix.redirectUrl;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getnewdomainsuffix.scopes;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = getnewdomainsuffix.agreed;
        }
        return getnewdomainsuffix.copy(str, str7, str8, str9, str10, str11, z);
    }

    @NotNull
    public final String component1() {
        return this.billerName;
    }

    @NotNull
    public final String component2() {
        return this.instId;
    }

    @NotNull
    public final String component3() {
        return this.prefix;
    }

    @NotNull
    public final String component4() {
        return this.clientId;
    }

    @NotNull
    public final String component5() {
        return this.redirectUrl;
    }

    @NotNull
    public final String component6() {
        return this.scopes;
    }

    public final boolean component7() {
        return this.agreed;
    }

    @NotNull
    public final getNewDomainSuffix copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "billerName");
        Intrinsics.checkNotNullParameter(str2, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str3, "prefix");
        Intrinsics.checkNotNullParameter(str4, "clientId");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str6, BranchLinkConstant.OauthParams.SCOPES);
        return new getNewDomainSuffix(str, str2, str3, str4, str5, str6, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNewDomainSuffix)) {
            return false;
        }
        getNewDomainSuffix getnewdomainsuffix = (getNewDomainSuffix) obj;
        return Intrinsics.areEqual((Object) this.billerName, (Object) getnewdomainsuffix.billerName) && Intrinsics.areEqual((Object) this.instId, (Object) getnewdomainsuffix.instId) && Intrinsics.areEqual((Object) this.prefix, (Object) getnewdomainsuffix.prefix) && Intrinsics.areEqual((Object) this.clientId, (Object) getnewdomainsuffix.clientId) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) getnewdomainsuffix.redirectUrl) && Intrinsics.areEqual((Object) this.scopes, (Object) getnewdomainsuffix.scopes) && this.agreed == getnewdomainsuffix.agreed;
    }

    public final int hashCode() {
        String str = this.billerName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.instId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.prefix;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.clientId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.redirectUrl;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.scopes;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.agreed;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BillerX2BEntity(billerName=");
        sb.append(this.billerName);
        sb.append(", instId=");
        sb.append(this.instId);
        sb.append(", prefix=");
        sb.append(this.prefix);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", agreed=");
        sb.append(this.agreed);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public getNewDomainSuffix(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "billerName");
        Intrinsics.checkNotNullParameter(str2, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str3, "prefix");
        Intrinsics.checkNotNullParameter(str4, "clientId");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str6, BranchLinkConstant.OauthParams.SCOPES);
        this.billerName = str;
        this.instId = str2;
        this.prefix = str3;
        this.clientId = str4;
        this.redirectUrl = str5;
        this.scopes = str6;
        this.agreed = z;
    }

    @NotNull
    public final String getBillerName() {
        return this.billerName;
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final String getScopes() {
        return this.scopes;
    }

    public final boolean getAgreed() {
        return this.agreed;
    }
}
