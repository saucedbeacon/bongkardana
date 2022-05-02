package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006&"}, d2 = {"Lid/dana/domain/social/model/RelationshipItem;", "", "loginId", "", "nickName", "status", "userId", "avatar", "username", "isNonReciprocal", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatar", "()Ljava/lang/String;", "()Z", "setNonReciprocal", "(Z)V", "getLoginId", "getNickName", "setNickName", "(Ljava/lang/String;)V", "getStatus", "setStatus", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class processScanResult {
    @Nullable
    private final String avatar;
    private boolean isNonReciprocal;
    @NotNull
    private final String loginId;
    @NotNull
    private String nickName;
    @NotNull
    private String status;
    @NotNull
    private final String userId;
    @NotNull
    private final String username;

    public processScanResult() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ processScanResult copy$default(processScanResult processscanresult, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processscanresult.loginId;
        }
        if ((i & 2) != 0) {
            str2 = processscanresult.nickName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = processscanresult.status;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = processscanresult.userId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = processscanresult.avatar;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = processscanresult.username;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = processscanresult.isNonReciprocal;
        }
        return processscanresult.copy(str, str7, str8, str9, str10, str11, z);
    }

    @NotNull
    public final String component1() {
        return this.loginId;
    }

    @NotNull
    public final String component2() {
        return this.nickName;
    }

    @NotNull
    public final String component3() {
        return this.status;
    }

    @NotNull
    public final String component4() {
        return this.userId;
    }

    @Nullable
    public final String component5() {
        return this.avatar;
    }

    @NotNull
    public final String component6() {
        return this.username;
    }

    public final boolean component7() {
        return this.isNonReciprocal;
    }

    @NotNull
    public final processScanResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str2, "nickName");
        Intrinsics.checkNotNullParameter(str3, "status");
        Intrinsics.checkNotNullParameter(str4, "userId");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        return new processScanResult(str, str2, str3, str4, str5, str6, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof processScanResult)) {
            return false;
        }
        processScanResult processscanresult = (processScanResult) obj;
        return Intrinsics.areEqual((Object) this.loginId, (Object) processscanresult.loginId) && Intrinsics.areEqual((Object) this.nickName, (Object) processscanresult.nickName) && Intrinsics.areEqual((Object) this.status, (Object) processscanresult.status) && Intrinsics.areEqual((Object) this.userId, (Object) processscanresult.userId) && Intrinsics.areEqual((Object) this.avatar, (Object) processscanresult.avatar) && Intrinsics.areEqual((Object) this.username, (Object) processscanresult.username) && this.isNonReciprocal == processscanresult.isNonReciprocal;
    }

    public final int hashCode() {
        String str = this.loginId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.userId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.avatar;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.username;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.isNonReciprocal;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationshipItem(loginId=");
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
        sb.append(", isNonReciprocal=");
        sb.append(this.isNonReciprocal);
        sb.append(")");
        return sb.toString();
    }

    public processScanResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str2, "nickName");
        Intrinsics.checkNotNullParameter(str3, "status");
        Intrinsics.checkNotNullParameter(str4, "userId");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        this.loginId = str;
        this.nickName = str2;
        this.status = str3;
        this.userId = str4;
        this.avatar = str5;
        this.username = str6;
        this.isNonReciprocal = z;
    }

    @NotNull
    public final String getLoginId() {
        return this.loginId;
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

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ processScanResult(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r9
        L_0x001e:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r10
        L_0x0025:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r11
        L_0x002b:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0032
            r12 = 0
            r13 = 0
            goto L_0x0033
        L_0x0032:
            r13 = r12
        L_0x0033:
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.processScanResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isNonReciprocal() {
        return this.isNonReciprocal;
    }

    public final void setNonReciprocal(boolean z) {
        this.isNonReciprocal = z;
    }
}
