package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lid/dana/domain/social/model/ActivityReactionsUser;", "", "displayName", "", "phoneNumber", "id", "nickName", "kycStatus", "profilePictureUrl", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getId", "setId", "getKycStatus", "setKycStatus", "getNickName", "setNickName", "getPhoneNumber", "setPhoneNumber", "getProfilePictureUrl", "setProfilePictureUrl", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class markOutsideIfExpired {
    @Nullable
    private String displayName;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private String f9935id;
    @Nullable
    private String kycStatus;
    @Nullable
    private String nickName;
    @Nullable
    private String phoneNumber;
    @Nullable
    private String profilePictureUrl;
    @Nullable
    private String username;

    public markOutsideIfExpired() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ markOutsideIfExpired copy$default(markOutsideIfExpired markoutsideifexpired, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = markoutsideifexpired.displayName;
        }
        if ((i & 2) != 0) {
            str2 = markoutsideifexpired.phoneNumber;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = markoutsideifexpired.f9935id;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = markoutsideifexpired.nickName;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = markoutsideifexpired.kycStatus;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = markoutsideifexpired.profilePictureUrl;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = markoutsideifexpired.username;
        }
        return markoutsideifexpired.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.displayName;
    }

    @Nullable
    public final String component2() {
        return this.phoneNumber;
    }

    @Nullable
    public final String component3() {
        return this.f9935id;
    }

    @Nullable
    public final String component4() {
        return this.nickName;
    }

    @Nullable
    public final String component5() {
        return this.kycStatus;
    }

    @Nullable
    public final String component6() {
        return this.profilePictureUrl;
    }

    @Nullable
    public final String component7() {
        return this.username;
    }

    @NotNull
    public final markOutsideIfExpired copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1302462872, oncanceled);
            onCancelLoad.getMin(1302462872, oncanceled);
        }
        return new markOutsideIfExpired(str, str2, str3, str4, str5, str6, str7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof markOutsideIfExpired)) {
            return false;
        }
        markOutsideIfExpired markoutsideifexpired = (markOutsideIfExpired) obj;
        return Intrinsics.areEqual((Object) this.displayName, (Object) markoutsideifexpired.displayName) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) markoutsideifexpired.phoneNumber) && Intrinsics.areEqual((Object) this.f9935id, (Object) markoutsideifexpired.f9935id) && Intrinsics.areEqual((Object) this.nickName, (Object) markoutsideifexpired.nickName) && Intrinsics.areEqual((Object) this.kycStatus, (Object) markoutsideifexpired.kycStatus) && Intrinsics.areEqual((Object) this.profilePictureUrl, (Object) markoutsideifexpired.profilePictureUrl) && Intrinsics.areEqual((Object) this.username, (Object) markoutsideifexpired.username);
    }

    public final int hashCode() {
        String str = this.displayName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.phoneNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9935id;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.nickName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.kycStatus;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.profilePictureUrl;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.username;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityReactionsUser(displayName=");
        sb.append(this.displayName);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", id=");
        sb.append(this.f9935id);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", kycStatus=");
        sb.append(this.kycStatus);
        sb.append(", profilePictureUrl=");
        sb.append(this.profilePictureUrl);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    public markOutsideIfExpired(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.displayName = str;
        this.phoneNumber = str2;
        this.f9935id = str3;
        this.nickName = str4;
        this.kycStatus = str5;
        this.profilePictureUrl = str6;
        this.username = str7;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    @Nullable
    public final String getId() {
        return this.f9935id;
    }

    public final void setId(@Nullable String str) {
        this.f9935id = str;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    @Nullable
    public final String getKycStatus() {
        return this.kycStatus;
    }

    public final void setKycStatus(@Nullable String str) {
        this.kycStatus = str;
    }

    @Nullable
    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final void setProfilePictureUrl(@Nullable String str) {
        this.profilePictureUrl = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ markOutsideIfExpired(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            java.lang.String r0 = ""
            if (r15 == 0) goto L_0x0008
            r15 = r0
            goto L_0x0009
        L_0x0008:
            r15 = r7
        L_0x0009:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r10
        L_0x001e:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002b
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = r12
        L_0x002c:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0032
            r14 = r0
            goto L_0x0033
        L_0x0032:
            r14 = r13
        L_0x0033:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.markOutsideIfExpired.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }
}
