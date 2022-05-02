package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "", "userId", "", "nickname", "kycLevel", "profileAvatarUrl", "shareFeed", "", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getKycLevel", "()Ljava/lang/String;", "getNickname", "getProfileAvatarUrl", "getShareFeed", "()Z", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setMonitoringStatus {
    @Nullable
    private final String kycLevel;
    @NotNull
    private final String nickname;
    @Nullable
    private final String profileAvatarUrl;
    private final boolean shareFeed;
    @NotNull
    private final String userId;
    @NotNull
    private final String username;

    public static /* synthetic */ setMonitoringStatus copy$default(setMonitoringStatus setmonitoringstatus, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setmonitoringstatus.userId;
        }
        if ((i & 2) != 0) {
            str2 = setmonitoringstatus.nickname;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = setmonitoringstatus.kycLevel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = setmonitoringstatus.profileAvatarUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = setmonitoringstatus.shareFeed;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = setmonitoringstatus.username;
        }
        return setmonitoringstatus.copy(str, str6, str7, str8, z2, str5);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.nickname;
    }

    @Nullable
    public final String component3() {
        return this.kycLevel;
    }

    @Nullable
    public final String component4() {
        return this.profileAvatarUrl;
    }

    public final boolean component5() {
        return this.shareFeed;
    }

    @NotNull
    public final String component6() {
        return this.username;
    }

    @NotNull
    public final setMonitoringStatus copy(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "nickname");
        Intrinsics.checkNotNullParameter(str5, setBuildNumber.USERNAME_KEY);
        return new setMonitoringStatus(str, str2, str3, str4, z, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMonitoringStatus)) {
            return false;
        }
        setMonitoringStatus setmonitoringstatus = (setMonitoringStatus) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) setmonitoringstatus.userId) && Intrinsics.areEqual((Object) this.nickname, (Object) setmonitoringstatus.nickname) && Intrinsics.areEqual((Object) this.kycLevel, (Object) setmonitoringstatus.kycLevel) && Intrinsics.areEqual((Object) this.profileAvatarUrl, (Object) setmonitoringstatus.profileAvatarUrl) && this.shareFeed == setmonitoringstatus.shareFeed && Intrinsics.areEqual((Object) this.username, (Object) setmonitoringstatus.username);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.kycLevel;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.profileAvatarUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.shareFeed;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str5 = this.username;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MyFeedsHeaderInfo(userId=");
        sb.append(this.userId);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", kycLevel=");
        sb.append(this.kycLevel);
        sb.append(", profileAvatarUrl=");
        sb.append(this.profileAvatarUrl);
        sb.append(", shareFeed=");
        sb.append(this.shareFeed);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    public setMonitoringStatus(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "nickname");
        Intrinsics.checkNotNullParameter(str5, setBuildNumber.USERNAME_KEY);
        this.userId = str;
        this.nickname = str2;
        this.kycLevel = str3;
        this.profileAvatarUrl = str4;
        this.shareFeed = z;
        this.username = str5;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getProfileAvatarUrl() {
        return this.profileAvatarUrl;
    }

    public final boolean getShareFeed() {
        return this.shareFeed;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setMonitoringStatus(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? "" : str5);
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }
}
