package o;

import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018¨\u0006?"}, d2 = {"Lid/dana/data/promoquest/repository/source/network/result/MissionEntityResult;", "Ljava/io/Serializable;", "missionId", "", "missionName", "missionStatus", "missionDescription", "missionActiveImage", "missionExpireTime", "Ljava/util/Date;", "missionFinishImage", "missionThumbnail", "hasPrize", "", "missionType", "missionTnc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getHasPrize", "()Z", "setHasPrize", "(Z)V", "getMissionActiveImage", "()Ljava/lang/String;", "setMissionActiveImage", "(Ljava/lang/String;)V", "getMissionDescription", "setMissionDescription", "getMissionExpireTime", "()Ljava/util/Date;", "setMissionExpireTime", "(Ljava/util/Date;)V", "getMissionFinishImage", "setMissionFinishImage", "getMissionId", "setMissionId", "getMissionName", "setMissionName", "getMissionStatus", "setMissionStatus", "getMissionThumbnail", "setMissionThumbnail", "getMissionTnc", "setMissionTnc", "getMissionType", "setMissionType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getClassLoader implements Serializable {
    private boolean hasPrize;
    @Nullable
    private String missionActiveImage;
    @Nullable
    private String missionDescription;
    @Nullable
    private Date missionExpireTime;
    @Nullable
    private String missionFinishImage;
    @Nullable
    private String missionId;
    @Nullable
    private String missionName;
    @Nullable
    private String missionStatus;
    @Nullable
    private String missionThumbnail;
    @Nullable
    private String missionTnc;
    @Nullable
    private String missionType;

    public getClassLoader() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (String) null, false, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getClassLoader copy$default(getClassLoader getclassloader, String str, String str2, String str3, String str4, String str5, Date date, String str6, String str7, boolean z, String str8, String str9, int i, Object obj) {
        getClassLoader getclassloader2 = getclassloader;
        int i2 = i;
        return getclassloader.copy((i2 & 1) != 0 ? getclassloader2.missionId : str, (i2 & 2) != 0 ? getclassloader2.missionName : str2, (i2 & 4) != 0 ? getclassloader2.missionStatus : str3, (i2 & 8) != 0 ? getclassloader2.missionDescription : str4, (i2 & 16) != 0 ? getclassloader2.missionActiveImage : str5, (i2 & 32) != 0 ? getclassloader2.missionExpireTime : date, (i2 & 64) != 0 ? getclassloader2.missionFinishImage : str6, (i2 & 128) != 0 ? getclassloader2.missionThumbnail : str7, (i2 & 256) != 0 ? getclassloader2.hasPrize : z, (i2 & 512) != 0 ? getclassloader2.missionType : str8, (i2 & 1024) != 0 ? getclassloader2.missionTnc : str9);
    }

    @Nullable
    public final String component1() {
        return this.missionId;
    }

    @Nullable
    public final String component10() {
        return this.missionType;
    }

    @Nullable
    public final String component11() {
        return this.missionTnc;
    }

    @Nullable
    public final String component2() {
        return this.missionName;
    }

    @Nullable
    public final String component3() {
        return this.missionStatus;
    }

    @Nullable
    public final String component4() {
        return this.missionDescription;
    }

    @Nullable
    public final String component5() {
        return this.missionActiveImage;
    }

    @Nullable
    public final Date component6() {
        return this.missionExpireTime;
    }

    @Nullable
    public final String component7() {
        return this.missionFinishImage;
    }

    @Nullable
    public final String component8() {
        return this.missionThumbnail;
    }

    public final boolean component9() {
        return this.hasPrize;
    }

    @NotNull
    public final getClassLoader copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date, @Nullable String str6, @Nullable String str7, boolean z, @Nullable String str8, @Nullable String str9) {
        return new getClassLoader(str, str2, str3, str4, str5, date, str6, str7, z, str8, str9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClassLoader)) {
            return false;
        }
        getClassLoader getclassloader = (getClassLoader) obj;
        return Intrinsics.areEqual((Object) this.missionId, (Object) getclassloader.missionId) && Intrinsics.areEqual((Object) this.missionName, (Object) getclassloader.missionName) && Intrinsics.areEqual((Object) this.missionStatus, (Object) getclassloader.missionStatus) && Intrinsics.areEqual((Object) this.missionDescription, (Object) getclassloader.missionDescription) && Intrinsics.areEqual((Object) this.missionActiveImage, (Object) getclassloader.missionActiveImage) && Intrinsics.areEqual((Object) this.missionExpireTime, (Object) getclassloader.missionExpireTime) && Intrinsics.areEqual((Object) this.missionFinishImage, (Object) getclassloader.missionFinishImage) && Intrinsics.areEqual((Object) this.missionThumbnail, (Object) getclassloader.missionThumbnail) && this.hasPrize == getclassloader.hasPrize && Intrinsics.areEqual((Object) this.missionType, (Object) getclassloader.missionType) && Intrinsics.areEqual((Object) this.missionTnc, (Object) getclassloader.missionTnc);
    }

    public final int hashCode() {
        String str = this.missionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.missionName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.missionStatus;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.missionDescription;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.missionActiveImage;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Date date = this.missionExpireTime;
        int hashCode6 = (hashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        String str6 = this.missionFinishImage;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.missionThumbnail;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.hasPrize;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        String str8 = this.missionType;
        int hashCode9 = (i2 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.missionTnc;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionEntityResult(missionId=");
        sb.append(this.missionId);
        sb.append(", missionName=");
        sb.append(this.missionName);
        sb.append(", missionStatus=");
        sb.append(this.missionStatus);
        sb.append(", missionDescription=");
        sb.append(this.missionDescription);
        sb.append(", missionActiveImage=");
        sb.append(this.missionActiveImage);
        sb.append(", missionExpireTime=");
        sb.append(this.missionExpireTime);
        sb.append(", missionFinishImage=");
        sb.append(this.missionFinishImage);
        sb.append(", missionThumbnail=");
        sb.append(this.missionThumbnail);
        sb.append(", hasPrize=");
        sb.append(this.hasPrize);
        sb.append(", missionType=");
        sb.append(this.missionType);
        sb.append(", missionTnc=");
        sb.append(this.missionTnc);
        sb.append(")");
        return sb.toString();
    }

    public getClassLoader(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date, @Nullable String str6, @Nullable String str7, boolean z, @Nullable String str8, @Nullable String str9) {
        this.missionId = str;
        this.missionName = str2;
        this.missionStatus = str3;
        this.missionDescription = str4;
        this.missionActiveImage = str5;
        this.missionExpireTime = date;
        this.missionFinishImage = str6;
        this.missionThumbnail = str7;
        this.hasPrize = z;
        this.missionType = str8;
        this.missionTnc = str9;
    }

    @Nullable
    public final String getMissionId() {
        return this.missionId;
    }

    public final void setMissionId(@Nullable String str) {
        this.missionId = str;
    }

    @Nullable
    public final String getMissionName() {
        return this.missionName;
    }

    public final void setMissionName(@Nullable String str) {
        this.missionName = str;
    }

    @Nullable
    public final String getMissionStatus() {
        return this.missionStatus;
    }

    public final void setMissionStatus(@Nullable String str) {
        this.missionStatus = str;
    }

    @Nullable
    public final String getMissionDescription() {
        return this.missionDescription;
    }

    public final void setMissionDescription(@Nullable String str) {
        this.missionDescription = str;
    }

    @Nullable
    public final String getMissionActiveImage() {
        return this.missionActiveImage;
    }

    public final void setMissionActiveImage(@Nullable String str) {
        this.missionActiveImage = str;
    }

    @Nullable
    public final Date getMissionExpireTime() {
        return this.missionExpireTime;
    }

    public final void setMissionExpireTime(@Nullable Date date) {
        this.missionExpireTime = date;
    }

    @Nullable
    public final String getMissionFinishImage() {
        return this.missionFinishImage;
    }

    public final void setMissionFinishImage(@Nullable String str) {
        this.missionFinishImage = str;
    }

    @Nullable
    public final String getMissionThumbnail() {
        return this.missionThumbnail;
    }

    public final void setMissionThumbnail(@Nullable String str) {
        this.missionThumbnail = str;
    }

    public final boolean getHasPrize() {
        return this.hasPrize;
    }

    public final void setHasPrize(boolean z) {
        this.hasPrize = z;
    }

    @Nullable
    public final String getMissionType() {
        return this.missionType;
    }

    public final void setMissionType(@Nullable String str) {
        this.missionType = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getClassLoader(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Date r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = 0
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClassLoader.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getMissionTnc() {
        return this.missionTnc;
    }

    public final void setMissionTnc(@Nullable String str) {
        this.missionTnc = str;
    }
}
