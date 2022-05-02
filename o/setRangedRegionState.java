package o;

import id.dana.data.account.repository.AccountEntityRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/social/model/MyActivityReactionInfo;", "", "nickname", "", "avatarUrl", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getNickname", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setRangedRegionState {
    @NotNull
    private final String avatarUrl;
    @NotNull
    private final String nickname;
    @NotNull
    private final String userId;

    public static /* synthetic */ setRangedRegionState copy$default(setRangedRegionState setrangedregionstate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setrangedregionstate.nickname;
        }
        if ((i & 2) != 0) {
            str2 = setrangedregionstate.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = setrangedregionstate.userId;
        }
        return setrangedregionstate.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.nickname;
    }

    @NotNull
    public final String component2() {
        return this.avatarUrl;
    }

    @NotNull
    public final String component3() {
        return this.userId;
    }

    @NotNull
    public final setRangedRegionState copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "nickname");
        Intrinsics.checkNotNullParameter(str2, AccountEntityRepository.UpdateType.AVATAR);
        Intrinsics.checkNotNullParameter(str3, "userId");
        return new setRangedRegionState(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRangedRegionState)) {
            return false;
        }
        setRangedRegionState setrangedregionstate = (setRangedRegionState) obj;
        return Intrinsics.areEqual((Object) this.nickname, (Object) setrangedregionstate.nickname) && Intrinsics.areEqual((Object) this.avatarUrl, (Object) setrangedregionstate.avatarUrl) && Intrinsics.areEqual((Object) this.userId, (Object) setrangedregionstate.userId);
    }

    public final int hashCode() {
        String str = this.nickname;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MyActivityReactionInfo(nickname=");
        sb.append(this.nickname);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(")");
        return sb.toString();
    }

    public setRangedRegionState(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "nickname");
        Intrinsics.checkNotNullParameter(str2, AccountEntityRepository.UpdateType.AVATAR);
        Intrinsics.checkNotNullParameter(str3, "userId");
        this.nickname = str;
        this.avatarUrl = str2;
        this.userId = str3;
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }
}
