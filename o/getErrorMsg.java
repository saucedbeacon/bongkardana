package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006%"}, d2 = {"Lid/dana/data/social/repository/source/network/request/RelationshipRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "status", "", "modifiedTime", "", "pageNum", "", "pageSize", "followingId", "followerId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFollowerId", "()Ljava/lang/String;", "getFollowingId", "getModifiedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPageNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lid/dana/data/social/repository/source/network/request/RelationshipRequest;", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getErrorMsg extends BaseRpcRequest {
    @Nullable
    private final String followerId;
    @Nullable
    private final String followingId;
    @Nullable
    private final Long modifiedTime;
    @Nullable
    private final Integer pageNum;
    @Nullable
    private final Integer pageSize;
    @Nullable
    private final String status;

    public getErrorMsg() {
        this((String) null, (Long) null, (Integer) null, (Integer) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getErrorMsg copy$default(getErrorMsg geterrormsg, String str, Long l, Integer num, Integer num2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geterrormsg.status;
        }
        if ((i & 2) != 0) {
            l = geterrormsg.modifiedTime;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            num = geterrormsg.pageNum;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = geterrormsg.pageSize;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str2 = geterrormsg.followingId;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = geterrormsg.followerId;
        }
        return geterrormsg.copy(str, l2, num3, num4, str4, str3);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final Long component2() {
        return this.modifiedTime;
    }

    @Nullable
    public final Integer component3() {
        return this.pageNum;
    }

    @Nullable
    public final Integer component4() {
        return this.pageSize;
    }

    @Nullable
    public final String component5() {
        return this.followingId;
    }

    @Nullable
    public final String component6() {
        return this.followerId;
    }

    @NotNull
    public final getErrorMsg copy(@Nullable String str, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
        return new getErrorMsg(str, l, num, num2, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getErrorMsg)) {
            return false;
        }
        getErrorMsg geterrormsg = (getErrorMsg) obj;
        return Intrinsics.areEqual((Object) this.status, (Object) geterrormsg.status) && Intrinsics.areEqual((Object) this.modifiedTime, (Object) geterrormsg.modifiedTime) && Intrinsics.areEqual((Object) this.pageNum, (Object) geterrormsg.pageNum) && Intrinsics.areEqual((Object) this.pageSize, (Object) geterrormsg.pageSize) && Intrinsics.areEqual((Object) this.followingId, (Object) geterrormsg.followingId) && Intrinsics.areEqual((Object) this.followerId, (Object) geterrormsg.followerId);
    }

    public final int hashCode() {
        String str = this.status;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.modifiedTime;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.pageNum;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.pageSize;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.followingId;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.followerId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationshipRequest(status=");
        sb.append(this.status);
        sb.append(", modifiedTime=");
        sb.append(this.modifiedTime);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", followingId=");
        sb.append(this.followingId);
        sb.append(", followerId=");
        sb.append(this.followerId);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getErrorMsg(java.lang.String r6, java.lang.Long r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0018
            r6 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
        L_0x0018:
            r2 = r8
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0023
            r6 = 10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
        L_0x0023:
            r3 = r9
            r6 = r12 & 16
            if (r6 == 0) goto L_0x002a
            r4 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r10
        L_0x002b:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x0031
            r12 = r0
            goto L_0x0032
        L_0x0031:
            r12 = r11
        L_0x0032:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getErrorMsg.<init>(java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Integer getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getFollowingId() {
        return this.followingId;
    }

    @Nullable
    public final String getFollowerId() {
        return this.followerId;
    }

    public getErrorMsg(@Nullable String str, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
        this.status = str;
        this.modifiedTime = l;
        this.pageNum = num;
        this.pageSize = num2;
        this.followingId = str2;
        this.followerId = str3;
    }
}
