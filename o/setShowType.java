package o;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000e¨\u0006&"}, d2 = {"Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "userId", "", "loginId", "nickName", "status", "gmtCreate", "", "gmtModified", "avatar", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getGmtCreate", "()J", "setGmtCreate", "(J)V", "getGmtModified", "setGmtModified", "getLoginId", "setLoginId", "(Ljava/lang/String;)V", "getNickName", "setNickName", "getStatus", "setStatus", "getUserId", "setUserId", "getUsername", "getActorUserId", "getActorUsername", "getContactPhoneNumber", "getNickname", "updateNickName", "", "deviceContactNickName", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Entity
public final class setShowType implements getShowType {
    @Nullable
    private final String avatar;
    private long gmtCreate;
    private long gmtModified;
    @NotNull
    private String loginId;
    @NotNull
    private String nickName;
    @NotNull
    private String status;
    @NotNull
    @PrimaryKey
    private String userId;
    @NotNull
    private final String username;

    @NotNull
    public final String getHeaderName() {
        return "";
    }

    public final void updateHeaderName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.HEADER_NAME_KEY);
    }

    public setShowType(@NotNull @NonNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str3, "nickName");
        Intrinsics.checkNotNullParameter(str4, "status");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        this.userId = str;
        this.loginId = str2;
        this.nickName = str3;
        this.status = str4;
        this.gmtCreate = j;
        this.gmtModified = j2;
        this.avatar = str5;
        this.username = str6;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public final String getLoginId() {
        return this.loginId;
    }

    public final void setLoginId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginId = str;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final long getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(long j) {
        this.gmtCreate = j;
    }

    public final long getGmtModified() {
        return this.gmtModified;
    }

    public final void setGmtModified(long j) {
        this.gmtModified = j;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ setShowType(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19, long r21, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000b
        L_0x000a:
            r4 = r15
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r16
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r17
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r18
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r23
        L_0x002b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r24
        L_0x0033:
            r3 = r14
            r8 = r19
            r10 = r21
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShowType.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final String getNickname() {
        return this.nickName;
    }

    @NotNull
    public final String getContactPhoneNumber() {
        return this.loginId;
    }

    public final void updateNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceContactNickName");
        this.nickName = str;
    }

    @NotNull
    public final String getActorUsername() {
        return this.username;
    }

    @NotNull
    public final String getActorUserId() {
        return this.userId;
    }
}
