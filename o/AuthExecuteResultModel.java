package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lid/dana/data/social/repository/source/network/response/RelationshipItemResponse;", "", "gmtCreate", "", "gmtModified", "loginId", "", "nickName", "status", "userId", "avatar", "username", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getGmtCreate", "()J", "getGmtModified", "getLoginId", "getNickName", "getStatus", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AuthExecuteResultModel {
    @Nullable
    private final String avatar;
    private final long gmtCreate;
    private final long gmtModified;
    @NotNull
    private final String loginId;
    @NotNull
    private final String nickName;
    @NotNull
    private final String status;
    @NotNull
    private final String userId;
    @Nullable
    private final String username;

    public static /* synthetic */ AuthExecuteResultModel copy$default(AuthExecuteResultModel authExecuteResultModel, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        AuthExecuteResultModel authExecuteResultModel2 = authExecuteResultModel;
        int i2 = i;
        return authExecuteResultModel.copy((i2 & 1) != 0 ? authExecuteResultModel2.gmtCreate : j, (i2 & 2) != 0 ? authExecuteResultModel2.gmtModified : j2, (i2 & 4) != 0 ? authExecuteResultModel2.loginId : str, (i2 & 8) != 0 ? authExecuteResultModel2.nickName : str2, (i2 & 16) != 0 ? authExecuteResultModel2.status : str3, (i2 & 32) != 0 ? authExecuteResultModel2.userId : str4, (i2 & 64) != 0 ? authExecuteResultModel2.avatar : str5, (i2 & 128) != 0 ? authExecuteResultModel2.username : str6);
    }

    public final long component1() {
        return this.gmtCreate;
    }

    public final long component2() {
        return this.gmtModified;
    }

    @NotNull
    public final String component3() {
        return this.loginId;
    }

    @NotNull
    public final String component4() {
        return this.nickName;
    }

    @NotNull
    public final String component5() {
        return this.status;
    }

    @NotNull
    public final String component6() {
        return this.userId;
    }

    @Nullable
    public final String component7() {
        return this.avatar;
    }

    @Nullable
    public final String component8() {
        return this.username;
    }

    @NotNull
    public final AuthExecuteResultModel copy(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, BranchLinkConstant.Params.LOGIN_ID);
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "nickName");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "status");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "userId");
        return new AuthExecuteResultModel(j, j2, str7, str8, str9, str10, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthExecuteResultModel)) {
            return false;
        }
        AuthExecuteResultModel authExecuteResultModel = (AuthExecuteResultModel) obj;
        return this.gmtCreate == authExecuteResultModel.gmtCreate && this.gmtModified == authExecuteResultModel.gmtModified && Intrinsics.areEqual((Object) this.loginId, (Object) authExecuteResultModel.loginId) && Intrinsics.areEqual((Object) this.nickName, (Object) authExecuteResultModel.nickName) && Intrinsics.areEqual((Object) this.status, (Object) authExecuteResultModel.status) && Intrinsics.areEqual((Object) this.userId, (Object) authExecuteResultModel.userId) && Intrinsics.areEqual((Object) this.avatar, (Object) authExecuteResultModel.avatar) && Intrinsics.areEqual((Object) this.username, (Object) authExecuteResultModel.username);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationshipItemResponse(gmtCreate=");
        sb.append(this.gmtCreate);
        sb.append(", gmtModified=");
        sb.append(this.gmtModified);
        sb.append(", loginId=");
        sb.append(this.loginId);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    public AuthExecuteResultModel(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str2, "nickName");
        Intrinsics.checkNotNullParameter(str3, "status");
        Intrinsics.checkNotNullParameter(str4, "userId");
        this.gmtCreate = j;
        this.gmtModified = j2;
        this.loginId = str;
        this.nickName = str2;
        this.status = str3;
        this.userId = str4;
        this.avatar = str5;
        this.username = str6;
    }

    public final long getGmtCreate() {
        return this.gmtCreate;
    }

    public final long getGmtModified() {
        return this.gmtModified;
    }

    @NotNull
    public final String getLoginId() {
        return this.loginId;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuthExecuteResultModel(long r15, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r12 = r2
            goto L_0x000c
        L_0x000a:
            r12 = r23
        L_0x000c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0012
            r13 = r2
            goto L_0x0014
        L_0x0012:
            r13 = r24
        L_0x0014:
            r3 = r14
            r4 = r15
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AuthExecuteResultModel.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public final int hashCode() {
        int hashCode = ((Long.valueOf(this.gmtCreate).hashCode() * 31) + Long.valueOf(this.gmtModified).hashCode()) * 31;
        String str = this.loginId;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.nickName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.status;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.userId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.avatar;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.username;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }
}
