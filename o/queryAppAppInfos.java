package o;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020\u00102\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006G"}, d2 = {"Lid/dana/domain/promoquest/model/Mission;", "", "missionId", "", "missionName", "missionDescription", "missionExpireTime", "Ljava/util/Date;", "missionStatus", "missionFinishImage", "missionImage", "missionThumbnail", "questList", "", "Lid/dana/domain/promoquest/model/Quest;", "hasPrize", "", "missionType", "missionTnc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getHasPrize", "()Z", "setHasPrize", "(Z)V", "isMissionFlexible", "getMissionDescription", "()Ljava/lang/String;", "setMissionDescription", "(Ljava/lang/String;)V", "getMissionExpireTime", "()Ljava/util/Date;", "setMissionExpireTime", "(Ljava/util/Date;)V", "getMissionFinishImage", "setMissionFinishImage", "getMissionId", "setMissionId", "getMissionImage", "setMissionImage", "getMissionName", "setMissionName", "getMissionStatus", "setMissionStatus", "getMissionThumbnail", "setMissionThumbnail", "getMissionTnc", "setMissionTnc", "getMissionType", "setMissionType", "getQuestList", "()Ljava/util/List;", "setQuestList", "(Ljava/util/List;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class queryAppAppInfos {
    private boolean hasPrize;
    @Nullable
    private String missionDescription;
    @Nullable
    private Date missionExpireTime;
    @Nullable
    private String missionFinishImage;
    @Nullable
    private String missionId;
    @Nullable
    private String missionImage;
    @Nullable
    private String missionName;
    @Nullable
    private String missionStatus;
    @Nullable
    private String missionThumbnail;
    @NotNull
    private String missionTnc;
    @Nullable
    private String missionType;
    @NotNull
    private List<GriverAppInfoStorage> questList;

    public queryAppAppInfos() {
        this((String) null, (String) null, (String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ queryAppAppInfos copy$default(queryAppAppInfos queryappappinfos, String str, String str2, String str3, Date date, String str4, String str5, String str6, String str7, List list, boolean z, String str8, String str9, int i, Object obj) {
        queryAppAppInfos queryappappinfos2 = queryappappinfos;
        int i2 = i;
        return queryappappinfos.copy((i2 & 1) != 0 ? queryappappinfos2.missionId : str, (i2 & 2) != 0 ? queryappappinfos2.missionName : str2, (i2 & 4) != 0 ? queryappappinfos2.missionDescription : str3, (i2 & 8) != 0 ? queryappappinfos2.missionExpireTime : date, (i2 & 16) != 0 ? queryappappinfos2.missionStatus : str4, (i2 & 32) != 0 ? queryappappinfos2.missionFinishImage : str5, (i2 & 64) != 0 ? queryappappinfos2.missionImage : str6, (i2 & 128) != 0 ? queryappappinfos2.missionThumbnail : str7, (i2 & 256) != 0 ? queryappappinfos2.questList : list, (i2 & 512) != 0 ? queryappappinfos2.hasPrize : z, (i2 & 1024) != 0 ? queryappappinfos2.missionType : str8, (i2 & 2048) != 0 ? queryappappinfos2.missionTnc : str9);
    }

    @Nullable
    public final String component1() {
        return this.missionId;
    }

    public final boolean component10() {
        return this.hasPrize;
    }

    @Nullable
    public final String component11() {
        return this.missionType;
    }

    @NotNull
    public final String component12() {
        return this.missionTnc;
    }

    @Nullable
    public final String component2() {
        return this.missionName;
    }

    @Nullable
    public final String component3() {
        return this.missionDescription;
    }

    @Nullable
    public final Date component4() {
        return this.missionExpireTime;
    }

    @Nullable
    public final String component5() {
        return this.missionStatus;
    }

    @Nullable
    public final String component6() {
        return this.missionFinishImage;
    }

    @Nullable
    public final String component7() {
        return this.missionImage;
    }

    @Nullable
    public final String component8() {
        return this.missionThumbnail;
    }

    @NotNull
    public final List<GriverAppInfoStorage> component9() {
        return this.questList;
    }

    @NotNull
    public final queryAppAppInfos copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Date date, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull List<GriverAppInfoStorage> list, boolean z, @Nullable String str8, @NotNull String str9) {
        List<GriverAppInfoStorage> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "questList");
        String str10 = str9;
        Intrinsics.checkNotNullParameter(str10, "missionTnc");
        return new queryAppAppInfos(str, str2, str3, date, str4, str5, str6, str7, list2, z, str8, str10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof queryAppAppInfos)) {
            return false;
        }
        queryAppAppInfos queryappappinfos = (queryAppAppInfos) obj;
        return Intrinsics.areEqual((Object) this.missionId, (Object) queryappappinfos.missionId) && Intrinsics.areEqual((Object) this.missionName, (Object) queryappappinfos.missionName) && Intrinsics.areEqual((Object) this.missionDescription, (Object) queryappappinfos.missionDescription) && Intrinsics.areEqual((Object) this.missionExpireTime, (Object) queryappappinfos.missionExpireTime) && Intrinsics.areEqual((Object) this.missionStatus, (Object) queryappappinfos.missionStatus) && Intrinsics.areEqual((Object) this.missionFinishImage, (Object) queryappappinfos.missionFinishImage) && Intrinsics.areEqual((Object) this.missionImage, (Object) queryappappinfos.missionImage) && Intrinsics.areEqual((Object) this.missionThumbnail, (Object) queryappappinfos.missionThumbnail) && Intrinsics.areEqual((Object) this.questList, (Object) queryappappinfos.questList) && this.hasPrize == queryappappinfos.hasPrize && Intrinsics.areEqual((Object) this.missionType, (Object) queryappappinfos.missionType) && Intrinsics.areEqual((Object) this.missionTnc, (Object) queryappappinfos.missionTnc);
    }

    public final int hashCode() {
        String str = this.missionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.missionName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.missionDescription;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Date date = this.missionExpireTime;
        int hashCode4 = (hashCode3 + (date != null ? date.hashCode() : 0)) * 31;
        String str4 = this.missionStatus;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.missionFinishImage;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.missionImage;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.missionThumbnail;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<GriverAppInfoStorage> list = this.questList;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.hasPrize;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str8 = this.missionType;
        int hashCode10 = (i2 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.missionTnc;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode10 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Mission(missionId=");
        sb.append(this.missionId);
        sb.append(", missionName=");
        sb.append(this.missionName);
        sb.append(", missionDescription=");
        sb.append(this.missionDescription);
        sb.append(", missionExpireTime=");
        sb.append(this.missionExpireTime);
        sb.append(", missionStatus=");
        sb.append(this.missionStatus);
        sb.append(", missionFinishImage=");
        sb.append(this.missionFinishImage);
        sb.append(", missionImage=");
        sb.append(this.missionImage);
        sb.append(", missionThumbnail=");
        sb.append(this.missionThumbnail);
        sb.append(", questList=");
        sb.append(this.questList);
        sb.append(", hasPrize=");
        sb.append(this.hasPrize);
        sb.append(", missionType=");
        sb.append(this.missionType);
        sb.append(", missionTnc=");
        sb.append(this.missionTnc);
        sb.append(")");
        return sb.toString();
    }

    public queryAppAppInfos(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Date date, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull List<GriverAppInfoStorage> list, boolean z, @Nullable String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(list, "questList");
        Intrinsics.checkNotNullParameter(str9, "missionTnc");
        this.missionId = str;
        this.missionName = str2;
        this.missionDescription = str3;
        this.missionExpireTime = date;
        this.missionStatus = str4;
        this.missionFinishImage = str5;
        this.missionImage = str6;
        this.missionThumbnail = str7;
        this.questList = list;
        this.hasPrize = z;
        this.missionType = str8;
        this.missionTnc = str9;
    }

    @Nullable
    public final String getMissionId() {
        return this.missionId;
    }

    public final void setMissionId(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1626716939, oncanceled);
            onCancelLoad.getMin(1626716939, oncanceled);
        }
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
    public final String getMissionDescription() {
        return this.missionDescription;
    }

    public final void setMissionDescription(@Nullable String str) {
        this.missionDescription = str;
    }

    @Nullable
    public final Date getMissionExpireTime() {
        return this.missionExpireTime;
    }

    public final void setMissionExpireTime(@Nullable Date date) {
        this.missionExpireTime = date;
    }

    @Nullable
    public final String getMissionStatus() {
        return this.missionStatus;
    }

    public final void setMissionStatus(@Nullable String str) {
        this.missionStatus = str;
    }

    @Nullable
    public final String getMissionFinishImage() {
        return this.missionFinishImage;
    }

    public final void setMissionFinishImage(@Nullable String str) {
        this.missionFinishImage = str;
    }

    @Nullable
    public final String getMissionImage() {
        return this.missionImage;
    }

    public final void setMissionImage(@Nullable String str) {
        this.missionImage = str;
    }

    @Nullable
    public final String getMissionThumbnail() {
        return this.missionThumbnail;
    }

    public final void setMissionThumbnail(@Nullable String str) {
        this.missionThumbnail = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ queryAppAppInfos(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Date r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, boolean r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r10 = (java.util.List) r10
            goto L_0x004f
        L_0x004d:
            r10 = r22
        L_0x004f:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0055
            r11 = 0
            goto L_0x0057
        L_0x0055:
            r11 = r23
        L_0x0057:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r2 = r24
        L_0x005e:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = ""
            goto L_0x0067
        L_0x0065:
            r0 = r25
        L_0x0067:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r2
            r26 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.queryAppAppInfos.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<GriverAppInfoStorage> getQuestList() {
        return this.questList;
    }

    public final void setQuestList(@NotNull List<GriverAppInfoStorage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.questList = list;
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

    @NotNull
    public final String getMissionTnc() {
        return this.missionTnc;
    }

    public final void setMissionTnc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.missionTnc = str;
    }

    public final boolean isMissionFlexible() {
        return StringsKt.equals("FLEXIBLE", this.missionType, true);
    }
}
