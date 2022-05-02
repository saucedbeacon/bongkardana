package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 )2\u00020\u0001:\u0001)BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J[\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006*"}, d2 = {"Lid/dana/social/model/ActivityReactionsUserModel;", "", "displayName", "", "phoneNumber", "id", "nickName", "kycStatus", "profilePictureUrl", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getId", "setId", "getKycStatus", "setKycStatus", "getNickName", "setNickName", "getPhoneNumber", "setPhoneNumber", "getProfilePictureUrl", "setProfilePictureUrl", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getDisplayedName", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class recycleOnMeasure {
    @NotNull
    public static final setMin IsOverlapping = new setMin((byte) 0);
    @NotNull
    private final String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @Nullable
    public String length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toIntRange;

    public recycleOnMeasure() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recycleOnMeasure)) {
            return false;
        }
        recycleOnMeasure recycleonmeasure = (recycleOnMeasure) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) recycleonmeasure.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) recycleonmeasure.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) recycleonmeasure.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) recycleonmeasure.getMin) && Intrinsics.areEqual((Object) this.length, (Object) recycleonmeasure.length) && Intrinsics.areEqual((Object) this.toIntRange, (Object) recycleonmeasure.toIntRange) && Intrinsics.areEqual((Object) this.equals, (Object) recycleonmeasure.equals);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.length;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.equals;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityReactionsUserModel(displayName=");
        sb.append(this.setMax);
        sb.append(", phoneNumber=");
        sb.append(this.setMin);
        sb.append(", id=");
        sb.append(this.getMax);
        sb.append(", nickName=");
        sb.append(this.getMin);
        sb.append(", kycStatus=");
        sb.append(this.length);
        sb.append(", profilePictureUrl=");
        sb.append(this.toIntRange);
        sb.append(", username=");
        sb.append(this.equals);
        sb.append(")");
        return sb.toString();
    }

    public recycleOnMeasure(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str7, setBuildNumber.USERNAME_KEY);
        this.setMax = str;
        this.setMin = str2;
        this.getMax = str3;
        this.getMin = str4;
        this.length = str5;
        this.toIntRange = str6;
        this.equals = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ recycleOnMeasure(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r7 = this;
            r0 = r15 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r8
        L_0x0009:
            r8 = r15 & 2
            if (r8 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r9
        L_0x0010:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r10
        L_0x0017:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x001d
            r4 = r1
            goto L_0x001e
        L_0x001d:
            r4 = r11
        L_0x001e:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r12
        L_0x0025:
            r8 = r15 & 32
            if (r8 == 0) goto L_0x002b
            r6 = r1
            goto L_0x002c
        L_0x002b:
            r6 = r13
        L_0x002c:
            r8 = r15 & 64
            if (r8 == 0) goto L_0x0032
            r15 = r1
            goto L_0x0033
        L_0x0032:
            r15 = r14
        L_0x0033:
            r8 = r7
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleOnMeasure.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/social/model/ActivityReactionsUserModel$Companion;", "", "()V", "fromActivityReactionUser", "Lid/dana/social/model/ActivityReactionsUserModel;", "activityReactionsUser", "Lid/dana/domain/social/model/ActivityReactionsUser;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
