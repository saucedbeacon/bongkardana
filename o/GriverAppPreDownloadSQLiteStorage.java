package o;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006'"}, d2 = {"Lid/dana/domain/promoquest/model/MissionSummary;", "", "id", "", "quest", "Lid/dana/domain/promoquest/model/Quest;", "expireTime", "Ljava/util/Date;", "status", "thumbnail", "(Ljava/lang/String;Lid/dana/domain/promoquest/model/Quest;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getExpireTime", "()Ljava/util/Date;", "setExpireTime", "(Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getQuest", "()Lid/dana/domain/promoquest/model/Quest;", "setQuest", "(Lid/dana/domain/promoquest/model/Quest;)V", "getStatus", "setStatus", "getThumbnail", "setThumbnail", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAppPreDownloadSQLiteStorage {
    @Nullable
    private Date expireTime;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private String f11089id;
    @Nullable
    private GriverAppInfoStorage quest;
    @Nullable
    private String status;
    @Nullable
    private String thumbnail;

    public GriverAppPreDownloadSQLiteStorage() {
        this((String) null, (GriverAppInfoStorage) null, (Date) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverAppPreDownloadSQLiteStorage copy$default(GriverAppPreDownloadSQLiteStorage griverAppPreDownloadSQLiteStorage, String str, GriverAppInfoStorage griverAppInfoStorage, Date date, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverAppPreDownloadSQLiteStorage.f11089id;
        }
        if ((i & 2) != 0) {
            griverAppInfoStorage = griverAppPreDownloadSQLiteStorage.quest;
        }
        GriverAppInfoStorage griverAppInfoStorage2 = griverAppInfoStorage;
        if ((i & 4) != 0) {
            date = griverAppPreDownloadSQLiteStorage.expireTime;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            str2 = griverAppPreDownloadSQLiteStorage.status;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = griverAppPreDownloadSQLiteStorage.thumbnail;
        }
        return griverAppPreDownloadSQLiteStorage.copy(str, griverAppInfoStorage2, date2, str4, str3);
    }

    @Nullable
    public final String component1() {
        return this.f11089id;
    }

    @Nullable
    public final GriverAppInfoStorage component2() {
        return this.quest;
    }

    @Nullable
    public final Date component3() {
        return this.expireTime;
    }

    @Nullable
    public final String component4() {
        return this.status;
    }

    @Nullable
    public final String component5() {
        return this.thumbnail;
    }

    @NotNull
    public final GriverAppPreDownloadSQLiteStorage copy(@Nullable String str, @Nullable GriverAppInfoStorage griverAppInfoStorage, @Nullable Date date, @Nullable String str2, @Nullable String str3) {
        return new GriverAppPreDownloadSQLiteStorage(str, griverAppInfoStorage, date, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAppPreDownloadSQLiteStorage)) {
            return false;
        }
        GriverAppPreDownloadSQLiteStorage griverAppPreDownloadSQLiteStorage = (GriverAppPreDownloadSQLiteStorage) obj;
        return Intrinsics.areEqual((Object) this.f11089id, (Object) griverAppPreDownloadSQLiteStorage.f11089id) && Intrinsics.areEqual((Object) this.quest, (Object) griverAppPreDownloadSQLiteStorage.quest) && Intrinsics.areEqual((Object) this.expireTime, (Object) griverAppPreDownloadSQLiteStorage.expireTime) && Intrinsics.areEqual((Object) this.status, (Object) griverAppPreDownloadSQLiteStorage.status) && Intrinsics.areEqual((Object) this.thumbnail, (Object) griverAppPreDownloadSQLiteStorage.thumbnail);
    }

    public final int hashCode() {
        String str = this.f11089id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        GriverAppInfoStorage griverAppInfoStorage = this.quest;
        int hashCode2 = (hashCode + (griverAppInfoStorage != null ? griverAppInfoStorage.hashCode() : 0)) * 31;
        Date date = this.expireTime;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        String str2 = this.status;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.thumbnail;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionSummary(id=");
        sb.append(this.f11089id);
        sb.append(", quest=");
        sb.append(this.quest);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", thumbnail=");
        sb.append(this.thumbnail);
        sb.append(")");
        return sb.toString();
    }

    public GriverAppPreDownloadSQLiteStorage(@Nullable String str, @Nullable GriverAppInfoStorage griverAppInfoStorage, @Nullable Date date, @Nullable String str2, @Nullable String str3) {
        this.f11089id = str;
        this.quest = griverAppInfoStorage;
        this.expireTime = date;
        this.status = str2;
        this.thumbnail = str3;
    }

    @Nullable
    public final String getId() {
        return this.f11089id;
    }

    public final void setId(@Nullable String str) {
        this.f11089id = str;
    }

    @Nullable
    public final GriverAppInfoStorage getQuest() {
        return this.quest;
    }

    public final void setQuest(@Nullable GriverAppInfoStorage griverAppInfoStorage) {
        this.quest = griverAppInfoStorage;
    }

    @Nullable
    public final Date getExpireTime() {
        return this.expireTime;
    }

    public final void setExpireTime(@Nullable Date date) {
        this.expireTime = date;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverAppPreDownloadSQLiteStorage(java.lang.String r5, o.GriverAppInfoStorage r6, java.util.Date r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverAppPreDownloadSQLiteStorage.<init>(java.lang.String, o.GriverAppInfoStorage, java.util.Date, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(@Nullable String str) {
        this.thumbnail = str;
    }
}
