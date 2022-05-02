package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lid/dana/data/nearbyme/model/MerchantImageEntity;", "", "userId", "", "userName", "avatar", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getImageUrl", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toMerchantImage", "Lid/dana/domain/nearbyme/model/MerchantImage;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendPushWorkMessage {
    @Nullable
    private final String avatar;
    @NotNull
    private final String imageUrl;
    @Nullable
    private final String userId;
    @Nullable
    private final String userName;

    public sendPushWorkMessage() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ sendPushWorkMessage copy$default(sendPushWorkMessage sendpushworkmessage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendpushworkmessage.userId;
        }
        if ((i & 2) != 0) {
            str2 = sendpushworkmessage.userName;
        }
        if ((i & 4) != 0) {
            str3 = sendpushworkmessage.avatar;
        }
        if ((i & 8) != 0) {
            str4 = sendpushworkmessage.imageUrl;
        }
        return sendpushworkmessage.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.userId;
    }

    @Nullable
    public final String component2() {
        return this.userName;
    }

    @Nullable
    public final String component3() {
        return this.avatar;
    }

    @NotNull
    public final String component4() {
        return this.imageUrl;
    }

    @NotNull
    public final sendPushWorkMessage copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        return new sendPushWorkMessage(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendPushWorkMessage)) {
            return false;
        }
        sendPushWorkMessage sendpushworkmessage = (sendPushWorkMessage) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) sendpushworkmessage.userId) && Intrinsics.areEqual((Object) this.userName, (Object) sendpushworkmessage.userName) && Intrinsics.areEqual((Object) this.avatar, (Object) sendpushworkmessage.avatar) && Intrinsics.areEqual((Object) this.imageUrl, (Object) sendpushworkmessage.imageUrl);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.avatar;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.imageUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantImageEntity(userId=");
        sb.append(this.userId);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(")");
        return sb.toString();
    }

    public sendPushWorkMessage(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        this.userId = str;
        this.userName = str2;
        this.avatar = str3;
        this.imageUrl = str4;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sendPushWorkMessage(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final getUtdid toMerchantImage() {
        String str = this.userId;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.userName;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.avatar;
        if (str4 != null) {
            str2 = str4;
        }
        return new getUtdid(str, str3, str2, this.imageUrl);
    }
}
