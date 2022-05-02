package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lid/dana/domain/ipg/IpgRegistrationUrl;", "", "redirectUrl", "", "needUserConsent", "", "userConsentConfigKey", "userConsentSyncKey", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getNeedUserConsent", "()Z", "getRedirectUrl", "()Ljava/lang/String;", "setRedirectUrl", "(Ljava/lang/String;)V", "getUserConsentConfigKey", "getUserConsentSyncKey", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setWorkSpaceId {
    private final boolean needUserConsent;
    @NotNull
    private String redirectUrl;
    @Nullable
    private final String userConsentConfigKey;
    @Nullable
    private final String userConsentSyncKey;

    public setWorkSpaceId() {
        this((String) null, false, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setWorkSpaceId copy$default(setWorkSpaceId setworkspaceid, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setworkspaceid.redirectUrl;
        }
        if ((i & 2) != 0) {
            z = setworkspaceid.needUserConsent;
        }
        if ((i & 4) != 0) {
            str2 = setworkspaceid.userConsentConfigKey;
        }
        if ((i & 8) != 0) {
            str3 = setworkspaceid.userConsentSyncKey;
        }
        return setworkspaceid.copy(str, z, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.redirectUrl;
    }

    public final boolean component2() {
        return this.needUserConsent;
    }

    @Nullable
    public final String component3() {
        return this.userConsentConfigKey;
    }

    @Nullable
    public final String component4() {
        return this.userConsentSyncKey;
    }

    @NotNull
    public final setWorkSpaceId copy(@NotNull String str, boolean z, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
        return new setWorkSpaceId(str, z, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setWorkSpaceId)) {
            return false;
        }
        setWorkSpaceId setworkspaceid = (setWorkSpaceId) obj;
        return Intrinsics.areEqual((Object) this.redirectUrl, (Object) setworkspaceid.redirectUrl) && this.needUserConsent == setworkspaceid.needUserConsent && Intrinsics.areEqual((Object) this.userConsentConfigKey, (Object) setworkspaceid.userConsentConfigKey) && Intrinsics.areEqual((Object) this.userConsentSyncKey, (Object) setworkspaceid.userConsentSyncKey);
    }

    public final int hashCode() {
        String str = this.redirectUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.needUserConsent;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.userConsentConfigKey;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userConsentSyncKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IpgRegistrationUrl(redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", needUserConsent=");
        sb.append(this.needUserConsent);
        sb.append(", userConsentConfigKey=");
        sb.append(this.userConsentConfigKey);
        sb.append(", userConsentSyncKey=");
        sb.append(this.userConsentSyncKey);
        sb.append(")");
        return sb.toString();
    }

    public setWorkSpaceId(@NotNull String str, boolean z, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
        this.redirectUrl = str;
        this.needUserConsent = z;
        this.userConsentConfigKey = str2;
        this.userConsentSyncKey = str3;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectUrl = str;
    }

    public final boolean getNeedUserConsent() {
        return this.needUserConsent;
    }

    @Nullable
    public final String getUserConsentConfigKey() {
        return this.userConsentConfigKey;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setWorkSpaceId(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    @Nullable
    public final String getUserConsentSyncKey() {
        return this.userConsentSyncKey;
    }
}
