package o;

import id.dana.data.account.repository.AccountEntityRepository;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lid/dana/social/model/MyFeedHeaderModel;", "", "userId", "", "name", "avatarUrl", "shareFeed", "", "kycVerified", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getKycVerified", "()Z", "getName", "getShareFeed", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFocusable {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    private final boolean isInside;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    private final boolean toIntRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFocusable)) {
            return false;
        }
        setFocusable setfocusable = (setFocusable) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) setfocusable.getMin) && Intrinsics.areEqual((Object) this.length, (Object) setfocusable.length) && Intrinsics.areEqual((Object) this.getMax, (Object) setfocusable.getMax) && this.isInside == setfocusable.isInside && this.toIntRange == setfocusable.toIntRange && Intrinsics.areEqual((Object) this.setMax, (Object) setfocusable.setMax);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isInside;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.toIntRange;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str4 = this.setMax;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MyFeedHeaderModel(userId=");
        sb.append(this.getMin);
        sb.append(", name=");
        sb.append(this.length);
        sb.append(", avatarUrl=");
        sb.append(this.getMax);
        sb.append(", shareFeed=");
        sb.append(this.isInside);
        sb.append(", kycVerified=");
        sb.append(this.toIntRange);
        sb.append(", username=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public setFocusable(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, AccountEntityRepository.UpdateType.AVATAR);
        Intrinsics.checkNotNullParameter(str4, setBuildNumber.USERNAME_KEY);
        this.getMin = str;
        this.length = str2;
        this.getMax = str3;
        this.isInside = z;
        this.toIntRange = z2;
        this.setMax = str4;
    }

    public final boolean length() {
        return this.isInside;
    }

    public final boolean setMax() {
        return this.toIntRange;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\b*\u00020\u0004¨\u0006\t"}, d2 = {"Lid/dana/social/model/MyFeedHeaderModel$Companion;", "", "()V", "fromMyFeedsHeaderInfo", "Lid/dana/social/model/MyFeedHeaderModel;", "myFeedsHeaderInfo", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "toActivityReactionsUserModel", "Lid/dana/social/model/ActivityReactionsUserModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static setFocusable setMin(@NotNull setMonitoringStatus setmonitoringstatus) {
            Intrinsics.checkNotNullParameter(setmonitoringstatus, "myFeedsHeaderInfo");
            String userId = setmonitoringstatus.getUserId();
            String nickname = setmonitoringstatus.getNickname();
            String profileAvatarUrl = setmonitoringstatus.getProfileAvatarUrl();
            if (profileAvatarUrl == null) {
                profileAvatarUrl = "";
            }
            return new setFocusable(userId, nickname, profileAvatarUrl, setmonitoringstatus.getShareFeed(), Intrinsics.areEqual((Object) setmonitoringstatus.getKycLevel(), (Object) "KYC2"), setmonitoringstatus.getUsername());
        }
    }
}
